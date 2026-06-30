package com.p314xaae8f345.p542x3306d5.p550x382fcc;

/* renamed from: com.tencent.mars.xlog.LogLengthFilter */
/* loaded from: classes12.dex */
public class C4605x46129742 {

    /* renamed from: RATIO */
    private static final double f19734x4a257eb = 0.3d;

    /* renamed from: capacity */
    private final int f19735xfbf514ba;

    /* renamed from: filteredCount */
    private final java.util.concurrent.atomic.AtomicLong f19736x783d38;

    /* renamed from: lengthCounter */
    private final java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p542x3306d5.p550x382fcc.C4605x46129742.LengthCounter> f19737xeafac436;

    /* renamed from: lengthQueue */
    private final java.util.Queue<com.p314xaae8f345.p542x3306d5.p550x382fcc.C4605x46129742.LengthCounter> f19738x60eccdcb;

    /* renamed from: threshold */
    private final int f19739xa3e1e46b;

    /* renamed from: com.tencent.mars.xlog.LogLengthFilter$LengthCounter */
    /* loaded from: classes12.dex */
    public class LengthCounter {

        /* renamed from: count */
        int f19740x5a7510f;

        /* renamed from: length */
        int f19741xbe0e3ae6;

        public LengthCounter(int i17, int i18) {
            this.f19741xbe0e3ae6 = i17;
            this.f19740x5a7510f = i18;
        }
    }

    public C4605x46129742() {
        this(100);
    }

    public synchronized boolean add(int i17) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.C4605x46129742.LengthCounter lengthCounter = this.f19737xeafac436.get(java.lang.Integer.valueOf(i17));
        z17 = false;
        if (lengthCounter == null) {
            lengthCounter = new com.p314xaae8f345.p542x3306d5.p550x382fcc.C4605x46129742.LengthCounter(i17, 0);
            this.f19737xeafac436.put(java.lang.Integer.valueOf(i17), lengthCounter);
        }
        lengthCounter.f19740x5a7510f++;
        if (this.f19738x60eccdcb.size() == this.f19735xfbf514ba) {
            this.f19738x60eccdcb.remove().f19740x5a7510f--;
        }
        this.f19738x60eccdcb.add(lengthCounter);
        if (this.f19738x60eccdcb.size() == this.f19735xfbf514ba && lengthCounter.f19740x5a7510f >= this.f19739xa3e1e46b) {
            z17 = true;
        }
        if (z17) {
            this.f19736x783d38.incrementAndGet();
        }
        return z17;
    }

    /* renamed from: getAndSet */
    public long m40577x10da0a01(long j17) {
        return this.f19736x783d38.getAndSet(j17);
    }

    public C4605x46129742(int i17) {
        this.f19736x783d38 = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f19738x60eccdcb = new java.util.ArrayDeque();
        this.f19737xeafac436 = new java.util.HashMap<>();
        this.f19735xfbf514ba = i17;
        this.f19739xa3e1e46b = (int) (i17 * f19734x4a257eb);
    }
}
