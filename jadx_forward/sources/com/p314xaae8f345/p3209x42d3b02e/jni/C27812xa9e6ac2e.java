package com.p314xaae8f345.p3209x42d3b02e.jni;

/* renamed from: com.tencent.xsummary.jni.XSummary */
/* loaded from: classes5.dex */
public class C27812xa9e6ac2e {

    /* renamed from: a, reason: collision with root package name */
    public long f301721a = m120121xeece1305();

    /* renamed from: deleteNativeXSummary */
    private native void m120117x8bef7fd0(long j17);

    /* renamed from: extractNative */
    private native com.p314xaae8f345.p3209x42d3b02e.jni.C27813xe84705eb[] m120118xd248f3f8(long j17, java.lang.String str);

    /* renamed from: initializeNative */
    private native boolean m120119x34d01bc7(long j17, java.lang.String str);

    /* renamed from: isInitializedNative */
    private native boolean m120120x62b86001(long j17);

    /* renamed from: newNativeXSummary */
    private native long m120121xeece1305();

    public com.p314xaae8f345.p3209x42d3b02e.jni.C27813xe84705eb[] a(java.lang.String str) {
        return m120118xd248f3f8(this.f301721a, str);
    }

    public boolean b(java.lang.String str) {
        return m120119x34d01bc7(this.f301721a, str);
    }

    /* renamed from: finalize */
    public void m120122xd764dc1e() {
        long j17 = this.f301721a;
        if (0 != j17) {
            m120117x8bef7fd0(j17);
            this.f301721a = 0L;
        }
        super.finalize();
    }
}
