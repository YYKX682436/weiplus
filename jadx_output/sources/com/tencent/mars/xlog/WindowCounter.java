package com.tencent.mars.xlog;

/* loaded from: classes12.dex */
public class WindowCounter implements java.lang.Runnable {
    private static final java.lang.String TAG = "WindowCounter";
    private final long baseThreshold;
    private com.tencent.mars.xlog.WindowCounter.TriggeredCallBack callBack;
    private final boolean clusterByTag;
    private volatile long currentThreshold;
    private boolean enableFilter;
    private final java.util.concurrent.atomic.AtomicLong lastIndex = new java.util.concurrent.atomic.AtomicLong(0);
    private volatile long lastTriggerTime;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mars.xlog.WindowCounter.TagInfo> mapCounter;
    private long monitorStartTime;
    private final long thresholdInterval;
    private final long timeSpan;
    private final int windowCount;
    private long[] windowCounter;

    /* loaded from: classes12.dex */
    public static class TagInfo {
        public long lastVisitTime;
        public volatile com.tencent.mars.xlog.LogLengthFilter lengthFilter;
        public long[] statsWindow;

        public TagInfo(long[] jArr, long j17) {
            this.statsWindow = jArr;
            this.lastVisitTime = j17;
        }
    }

    /* loaded from: classes12.dex */
    public interface TriggeredCallBack {
        void onThresholdTriggered(java.lang.String str, java.lang.String str2, long j17);
    }

    public WindowCounter(long j17, int i17, long j18, boolean z17, long j19) {
        this.timeSpan = j17;
        this.windowCount = i17;
        this.baseThreshold = j18;
        this.clusterByTag = z17;
        this.thresholdInterval = j19;
        this.currentThreshold = j18;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.lastTriggerTime = currentTimeMillis;
        this.monitorStartTime = currentTimeMillis;
        if (!z17) {
            this.windowCounter = new long[i17];
        } else {
            this.mapCounter = new java.util.concurrent.ConcurrentHashMap<>();
            new java.lang.Thread(this).start();
        }
    }

    public boolean addLog2Monitor(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.WindowCounter.TagInfo tagInfo;
        com.tencent.mars.xlog.WindowCounter.TriggeredCallBack triggeredCallBack;
        com.tencent.mars.xlog.WindowCounter.TagInfo putIfAbsent;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.monitorStartTime > currentTimeMillis) {
            this.monitorStartTime = currentTimeMillis;
            return true;
        }
        long[] jArr = this.windowCounter;
        if (this.clusterByTag) {
            java.lang.String str3 = str.startsWith("FTPP.") ? "FTPP." : str;
            tagInfo = this.mapCounter.get(str3);
            if (tagInfo == null && (putIfAbsent = this.mapCounter.putIfAbsent(str3, (tagInfo = new com.tencent.mars.xlog.WindowCounter.TagInfo(new long[this.windowCount], currentTimeMillis)))) != null) {
                tagInfo = putIfAbsent;
            }
            tagInfo.lastVisitTime = currentTimeMillis;
            jArr = tagInfo.statsWindow;
        } else {
            tagInfo = null;
        }
        long j17 = (currentTimeMillis - this.monitorStartTime) / this.timeSpan;
        int i17 = (int) (j17 % this.windowCount);
        long j18 = this.lastIndex.get();
        long j19 = 0;
        if (j18 < j17 && this.lastIndex.compareAndSet(j18, j17)) {
            jArr[i17] = 0;
        }
        jArr[i17] = jArr[i17] + str.length() + 45 + str2.length();
        if (currentTimeMillis - this.lastTriggerTime > this.thresholdInterval) {
            synchronized (this) {
                if (currentTimeMillis - this.lastTriggerTime > this.thresholdInterval) {
                    this.lastTriggerTime = currentTimeMillis;
                    this.currentThreshold = this.baseThreshold;
                }
            }
        }
        boolean z17 = false;
        for (long j27 : jArr) {
            j19 += j27;
        }
        if (j19 > this.currentThreshold) {
            synchronized (this) {
                if (j19 > this.currentThreshold) {
                    this.currentThreshold = j19 << 1;
                    this.lastTriggerTime = currentTimeMillis;
                    z17 = true;
                }
            }
            if (z17 && (triggeredCallBack = this.callBack) != null) {
                triggeredCallBack.onThresholdTriggered(str, str2, j19);
            }
        }
        if (j19 <= this.baseThreshold || !this.clusterByTag || !this.enableFilter) {
            return true;
        }
        if (tagInfo.lengthFilter == null) {
            synchronized (tagInfo) {
                if (tagInfo.lengthFilter == null) {
                    tagInfo.lengthFilter = new com.tencent.mars.xlog.LogLengthFilter();
                }
            }
        }
        return !tagInfo.lengthFilter.add(str2.length());
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                java.util.concurrent.TimeUnit.MINUTES.sleep(2L);
            } catch (java.lang.InterruptedException unused) {
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.MINUTES.toMillis(3L);
            if (this.clusterByTag) {
                for (java.util.Map.Entry<java.lang.String, com.tencent.mars.xlog.WindowCounter.TagInfo> entry : this.mapCounter.entrySet()) {
                    if (entry.getValue().lastVisitTime < currentTimeMillis) {
                        this.mapCounter.remove(entry.getKey());
                    }
                    com.tencent.mars.xlog.LogLengthFilter logLengthFilter = entry.getValue().lengthFilter;
                    if (logLengthFilter != null) {
                        long andSet = logLengthFilter.getAndSet(0L);
                        if (andSet > 0) {
                            com.tencent.mars.xlog.Log.i(TAG, "%d log with tag[%s] has been filtered.", java.lang.Long.valueOf(andSet), entry.getKey());
                        }
                    }
                }
            }
        }
    }

    public void setEnableFilter() {
        this.enableFilter = true;
    }

    public void setThresholdTriggeredCallBack(com.tencent.mars.xlog.WindowCounter.TriggeredCallBack triggeredCallBack) {
        this.callBack = triggeredCallBack;
    }
}
