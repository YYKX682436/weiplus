package com.tencent.mars.xlog;

/* loaded from: classes12.dex */
public class LogLengthFilter {
    private static final double RATIO = 0.3d;
    private final int capacity;
    private final java.util.concurrent.atomic.AtomicLong filteredCount;
    private final java.util.HashMap<java.lang.Integer, com.tencent.mars.xlog.LogLengthFilter.LengthCounter> lengthCounter;
    private final java.util.Queue<com.tencent.mars.xlog.LogLengthFilter.LengthCounter> lengthQueue;
    private final int threshold;

    /* loaded from: classes12.dex */
    public class LengthCounter {
        int count;
        int length;

        public LengthCounter(int i17, int i18) {
            this.length = i17;
            this.count = i18;
        }
    }

    public LogLengthFilter() {
        this(100);
    }

    public synchronized boolean add(int i17) {
        boolean z17;
        com.tencent.mars.xlog.LogLengthFilter.LengthCounter lengthCounter = this.lengthCounter.get(java.lang.Integer.valueOf(i17));
        z17 = false;
        if (lengthCounter == null) {
            lengthCounter = new com.tencent.mars.xlog.LogLengthFilter.LengthCounter(i17, 0);
            this.lengthCounter.put(java.lang.Integer.valueOf(i17), lengthCounter);
        }
        lengthCounter.count++;
        if (this.lengthQueue.size() == this.capacity) {
            this.lengthQueue.remove().count--;
        }
        this.lengthQueue.add(lengthCounter);
        if (this.lengthQueue.size() == this.capacity && lengthCounter.count >= this.threshold) {
            z17 = true;
        }
        if (z17) {
            this.filteredCount.incrementAndGet();
        }
        return z17;
    }

    public long getAndSet(long j17) {
        return this.filteredCount.getAndSet(j17);
    }

    public LogLengthFilter(int i17) {
        this.filteredCount = new java.util.concurrent.atomic.AtomicLong(0L);
        this.lengthQueue = new java.util.ArrayDeque();
        this.lengthCounter = new java.util.HashMap<>();
        this.capacity = i17;
        this.threshold = (int) (i17 * RATIO);
    }
}
