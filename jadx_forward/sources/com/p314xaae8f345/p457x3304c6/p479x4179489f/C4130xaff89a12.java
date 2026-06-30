package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* renamed from: com.tencent.maas.moviecomposing.ASRProcessor */
/* loaded from: classes5.dex */
public class C4130xaff89a12 {

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16113x39e86013 = m34012xfce9a72c();

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m34012xfce9a72c();

    /* renamed from: nativeInitResources */
    private native boolean m34013x89f2281e(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: nativeIsResourcesReady */
    private native boolean m34014xf8a5487f();

    /* renamed from: nativeProcess */
    private native java.lang.Object[] m34015xb4846e58(java.nio.ByteBuffer byteBuffer);

    /* renamed from: nativeReleaseResources */
    private native void m34016x98b65415();

    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return m34013x89f2281e(str, str2, str3);
    }

    public boolean b() {
        return m34014xf8a5487f();
    }

    public com.p314xaae8f345.p457x3304c6.p479x4179489f.C4131x387bddf0[] c(java.nio.ByteBuffer byteBuffer) {
        java.lang.Object[] m34015xb4846e58 = m34015xb4846e58(byteBuffer);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4131x387bddf0[] c4131x387bddf0Arr = new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4131x387bddf0[m34015xb4846e58.length];
        for (int i17 = 0; i17 < m34015xb4846e58.length; i17++) {
            c4131x387bddf0Arr[i17] = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4131x387bddf0) m34015xb4846e58[i17];
        }
        return c4131x387bddf0Arr;
    }

    public void d() {
        this.f16113x39e86013.m16727xc85fe246();
    }

    public void e() {
        m34016x98b65415();
    }
}
