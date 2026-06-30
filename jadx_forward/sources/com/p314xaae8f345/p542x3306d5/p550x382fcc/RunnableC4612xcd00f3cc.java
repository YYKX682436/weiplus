package com.p314xaae8f345.p542x3306d5.p550x382fcc;

/* renamed from: com.tencent.mars.xlog.WindowCounter */
/* loaded from: classes12.dex */
public class RunnableC4612xcd00f3cc implements java.lang.Runnable {
    private static final java.lang.String TAG = "WindowCounter";

    /* renamed from: baseThreshold */
    private final long f19756x9782189a;

    /* renamed from: callBack */
    private com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc.TriggeredCallBack f19757xf5ad9465;

    /* renamed from: clusterByTag */
    private final boolean f19758xc1bd71e9;

    /* renamed from: currentThreshold */
    private volatile long f19759xe7c35ef2;

    /* renamed from: enableFilter */
    private boolean f19760x84a36edb;

    /* renamed from: lastIndex */
    private final java.util.concurrent.atomic.AtomicLong f19761x76c7d3dc = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: lastTriggerTime */
    private volatile long f19762x59c83c2f;

    /* renamed from: mapCounter */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc.TagInfo> f19763x4006c900;

    /* renamed from: monitorStartTime */
    private long f19764xaf2d5215;

    /* renamed from: thresholdInterval */
    private final long f19765x44329250;

    /* renamed from: timeSpan */
    private final long f19766x842d8fb7;

    /* renamed from: windowCount */
    private final int f19767x70947aff;

    /* renamed from: windowCounter */
    private long[] f19768x9d61c3ec;

    /* renamed from: com.tencent.mars.xlog.WindowCounter$TagInfo */
    /* loaded from: classes12.dex */
    public static class TagInfo {

        /* renamed from: lastVisitTime */
        public long f19769x5168cc2;

        /* renamed from: lengthFilter */
        public volatile com.p314xaae8f345.p542x3306d5.p550x382fcc.C4605x46129742 f19770xa941adfe;

        /* renamed from: statsWindow */
        public long[] f19771x31d7596f;

        public TagInfo(long[] jArr, long j17) {
            this.f19771x31d7596f = jArr;
            this.f19769x5168cc2 = j17;
        }
    }

    /* renamed from: com.tencent.mars.xlog.WindowCounter$TriggeredCallBack */
    /* loaded from: classes12.dex */
    public interface TriggeredCallBack {
        /* renamed from: onThresholdTriggered */
        void mo40603x399d886b(java.lang.String str, java.lang.String str2, long j17);
    }

    public RunnableC4612xcd00f3cc(long j17, int i17, long j18, boolean z17, long j19) {
        this.f19766x842d8fb7 = j17;
        this.f19767x70947aff = i17;
        this.f19756x9782189a = j18;
        this.f19758xc1bd71e9 = z17;
        this.f19765x44329250 = j19;
        this.f19759xe7c35ef2 = j18;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f19762x59c83c2f = currentTimeMillis;
        this.f19764xaf2d5215 = currentTimeMillis;
        if (!z17) {
            this.f19768x9d61c3ec = new long[i17];
        } else {
            this.f19763x4006c900 = new java.util.concurrent.ConcurrentHashMap<>();
            new java.lang.Thread(this).start();
        }
    }

    /* renamed from: addLog2Monitor */
    public boolean m40608x7fc668ab(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc.TagInfo tagInfo;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc.TriggeredCallBack triggeredCallBack;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc.TagInfo putIfAbsent;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f19764xaf2d5215 > currentTimeMillis) {
            this.f19764xaf2d5215 = currentTimeMillis;
            return true;
        }
        long[] jArr = this.f19768x9d61c3ec;
        if (this.f19758xc1bd71e9) {
            java.lang.String str3 = str.startsWith("FTPP.") ? "FTPP." : str;
            tagInfo = this.f19763x4006c900.get(str3);
            if (tagInfo == null && (putIfAbsent = this.f19763x4006c900.putIfAbsent(str3, (tagInfo = new com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc.TagInfo(new long[this.f19767x70947aff], currentTimeMillis)))) != null) {
                tagInfo = putIfAbsent;
            }
            tagInfo.f19769x5168cc2 = currentTimeMillis;
            jArr = tagInfo.f19771x31d7596f;
        } else {
            tagInfo = null;
        }
        long j17 = (currentTimeMillis - this.f19764xaf2d5215) / this.f19766x842d8fb7;
        int i17 = (int) (j17 % this.f19767x70947aff);
        long j18 = this.f19761x76c7d3dc.get();
        long j19 = 0;
        if (j18 < j17 && this.f19761x76c7d3dc.compareAndSet(j18, j17)) {
            jArr[i17] = 0;
        }
        jArr[i17] = jArr[i17] + str.length() + 45 + str2.length();
        if (currentTimeMillis - this.f19762x59c83c2f > this.f19765x44329250) {
            synchronized (this) {
                if (currentTimeMillis - this.f19762x59c83c2f > this.f19765x44329250) {
                    this.f19762x59c83c2f = currentTimeMillis;
                    this.f19759xe7c35ef2 = this.f19756x9782189a;
                }
            }
        }
        boolean z17 = false;
        for (long j27 : jArr) {
            j19 += j27;
        }
        if (j19 > this.f19759xe7c35ef2) {
            synchronized (this) {
                if (j19 > this.f19759xe7c35ef2) {
                    this.f19759xe7c35ef2 = j19 << 1;
                    this.f19762x59c83c2f = currentTimeMillis;
                    z17 = true;
                }
            }
            if (z17 && (triggeredCallBack = this.f19757xf5ad9465) != null) {
                triggeredCallBack.mo40603x399d886b(str, str2, j19);
            }
        }
        if (j19 <= this.f19756x9782189a || !this.f19758xc1bd71e9 || !this.f19760x84a36edb) {
            return true;
        }
        if (tagInfo.f19770xa941adfe == null) {
            synchronized (tagInfo) {
                if (tagInfo.f19770xa941adfe == null) {
                    tagInfo.f19770xa941adfe = new com.p314xaae8f345.p542x3306d5.p550x382fcc.C4605x46129742();
                }
            }
        }
        return !tagInfo.f19770xa941adfe.add(str2.length());
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                java.util.concurrent.TimeUnit.MINUTES.sleep(2L);
            } catch (java.lang.InterruptedException unused) {
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.MINUTES.toMillis(3L);
            if (this.f19758xc1bd71e9) {
                for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc.TagInfo> entry : this.f19763x4006c900.entrySet()) {
                    if (entry.getValue().f19769x5168cc2 < currentTimeMillis) {
                        this.f19763x4006c900.remove(entry.getKey());
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.C4605x46129742 c4605x46129742 = entry.getValue().f19770xa941adfe;
                    if (c4605x46129742 != null) {
                        long m40577x10da0a01 = c4605x46129742.m40577x10da0a01(0L);
                        if (m40577x10da0a01 > 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "%d log with tag[%s] has been filtered.", java.lang.Long.valueOf(m40577x10da0a01), entry.getKey());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: setEnableFilter */
    public void m40609x1bdefc5d() {
        this.f19760x84a36edb = true;
    }

    /* renamed from: setThresholdTriggeredCallBack */
    public void m40610x1857a6b3(com.p314xaae8f345.p542x3306d5.p550x382fcc.RunnableC4612xcd00f3cc.TriggeredCallBack triggeredCallBack) {
        this.f19757xf5ad9465 = triggeredCallBack;
    }
}
