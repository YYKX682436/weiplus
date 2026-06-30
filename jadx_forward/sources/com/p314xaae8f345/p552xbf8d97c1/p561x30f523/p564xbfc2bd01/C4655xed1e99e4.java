package com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01;

/* renamed from: com.tencent.matrix.hook.memory.MemoryHook */
/* loaded from: classes12.dex */
public class C4655xed1e99e4 extends xh.b {

    /* renamed from: k, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01.C4655xed1e99e4 f134199k = new com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p564xbfc2bd01.C4655xed1e99e4();

    /* renamed from: d, reason: collision with root package name */
    public int f134202d;

    /* renamed from: e, reason: collision with root package name */
    public int f134203e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f134205g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f134207i;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f134200b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f134201c = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f134204f = 10485760;

    /* renamed from: h, reason: collision with root package name */
    public final int f134206h = 524288;

    /* renamed from: j, reason: collision with root package name */
    public boolean f134208j = false;

    /* renamed from: dumpNative */
    private native void m40929x1a382f2b(java.lang.String str, java.lang.String str2);

    /* renamed from: enableJavaStacktraceNative */
    private native void m40930x18492299(boolean z17);

    /* renamed from: enableMmapHookNative */
    private native void m40931xf72d72ac(boolean z17);

    /* renamed from: enableStacktraceNative */
    private native void m40932xa31841d7(boolean z17);

    /* renamed from: installHooksNative */
    private native void m40933x970feb4c(java.lang.String[] strArr, java.lang.String[] strArr2, boolean z17);

    /* renamed from: setJavaStacktraceThresholdNative */
    private native void m40934xa3a66da1(int i17);

    /* renamed from: setStacktraceLogThresholdNative */
    private native void m40935x9ddf7c9d(int i17);

    /* renamed from: setTracingAllocSizeRangeNative */
    private native void m40936x8e37731e(int i17, int i18);

    @Override // xh.b
    public java.lang.String a() {
        return "matrix-memoryhook";
    }

    @Override // xh.b
    public boolean b() {
        int i17;
        int i18 = this.f134202d;
        if (i18 < 0 || ((i17 = this.f134203e) != 0 && i17 < i18)) {
            throw new java.lang.IllegalArgumentException("sizes should not be negative and maxSize should be 0 or greater than minSize: min = " + this.f134202d + ", max = " + this.f134203e);
        }
        oj.j.a("Matrix.MemoryHook", "enable mmap? " + this.f134207i, new java.lang.Object[0]);
        m40931xf72d72ac(this.f134207i);
        m40936x8e37731e(this.f134202d, this.f134203e);
        m40935x9ddf7c9d(this.f134204f);
        m40932xa31841d7(this.f134205g);
        m40930x18492299(false);
        m40934xa3a66da1(this.f134206h);
        return true;
    }

    @Override // xh.b
    public boolean c(boolean z17) {
        if (!this.f134208j) {
            oj.j.c("Matrix.MemoryHook", "#onHook, installHooksNative: debug=" + z17, new java.lang.Object[0]);
            m40933x970feb4c((java.lang.String[]) ((java.util.HashSet) this.f134200b).toArray(new java.lang.String[0]), (java.lang.String[]) ((java.util.HashSet) this.f134201c).toArray(new java.lang.String[0]), z17);
            this.f134208j = true;
        }
        return true;
    }

    public void d(java.lang.String str, java.lang.String str2) {
        if (this.f535999a == xh.a.COMMIT_SUCCESS) {
            m40929x1a382f2b(str, str2);
        }
    }
}
