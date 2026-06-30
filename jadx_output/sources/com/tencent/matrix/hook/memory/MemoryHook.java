package com.tencent.matrix.hook.memory;

/* loaded from: classes12.dex */
public class MemoryHook extends xh.b {

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.matrix.hook.memory.MemoryHook f52666k = new com.tencent.matrix.hook.memory.MemoryHook();

    /* renamed from: d, reason: collision with root package name */
    public int f52669d;

    /* renamed from: e, reason: collision with root package name */
    public int f52670e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f52672g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f52674i;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f52667b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f52668c = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f52671f = 10485760;

    /* renamed from: h, reason: collision with root package name */
    public final int f52673h = 524288;

    /* renamed from: j, reason: collision with root package name */
    public boolean f52675j = false;

    private native void dumpNative(java.lang.String str, java.lang.String str2);

    private native void enableJavaStacktraceNative(boolean z17);

    private native void enableMmapHookNative(boolean z17);

    private native void enableStacktraceNative(boolean z17);

    private native void installHooksNative(java.lang.String[] strArr, java.lang.String[] strArr2, boolean z17);

    private native void setJavaStacktraceThresholdNative(int i17);

    private native void setStacktraceLogThresholdNative(int i17);

    private native void setTracingAllocSizeRangeNative(int i17, int i18);

    @Override // xh.b
    public java.lang.String a() {
        return "matrix-memoryhook";
    }

    @Override // xh.b
    public boolean b() {
        int i17;
        int i18 = this.f52669d;
        if (i18 < 0 || ((i17 = this.f52670e) != 0 && i17 < i18)) {
            throw new java.lang.IllegalArgumentException("sizes should not be negative and maxSize should be 0 or greater than minSize: min = " + this.f52669d + ", max = " + this.f52670e);
        }
        oj.j.a("Matrix.MemoryHook", "enable mmap? " + this.f52674i, new java.lang.Object[0]);
        enableMmapHookNative(this.f52674i);
        setTracingAllocSizeRangeNative(this.f52669d, this.f52670e);
        setStacktraceLogThresholdNative(this.f52671f);
        enableStacktraceNative(this.f52672g);
        enableJavaStacktraceNative(false);
        setJavaStacktraceThresholdNative(this.f52673h);
        return true;
    }

    @Override // xh.b
    public boolean c(boolean z17) {
        if (!this.f52675j) {
            oj.j.c("Matrix.MemoryHook", "#onHook, installHooksNative: debug=" + z17, new java.lang.Object[0]);
            installHooksNative((java.lang.String[]) ((java.util.HashSet) this.f52667b).toArray(new java.lang.String[0]), (java.lang.String[]) ((java.util.HashSet) this.f52668c).toArray(new java.lang.String[0]), z17);
            this.f52675j = true;
        }
        return true;
    }

    public void d(java.lang.String str, java.lang.String str2) {
        if (this.f454466a == xh.a.COMMIT_SUCCESS) {
            dumpNative(str, str2);
        }
    }
}
