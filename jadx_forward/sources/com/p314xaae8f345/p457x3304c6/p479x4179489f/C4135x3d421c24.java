package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* renamed from: com.tencent.maas.moviecomposing.AudioWaveformProvider */
/* loaded from: classes5.dex */
public final class C4135x3d421c24 {

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16114x39e86013;

    public C4135x3d421c24(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3) {
        com.p166x1da19ac6.jni.C1545xd48843e6 m34025xfce9a72c = m34025xfce9a72c(c4181x2248e1a3.D(), c4181x2248e1a3.f130065a.m32425x6ac9171());
        this.f16114x39e86013 = m34025xfce9a72c;
        if (m34025xfce9a72c == null) {
            throw new java.lang.RuntimeException("AudioWaveformProvider can't create mHybridData, please check log!");
        }
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m34025xfce9a72c(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, java.lang.String str);

    /* renamed from: nativeFetchWaveformInternal */
    private native boolean m34026x45e6741d(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, int i17);

    /* renamed from: nativeGetStartIndex */
    private native int m34027x32cf96af();

    /* renamed from: nativeGetWaveform */
    private native java.nio.ByteBuffer m34028x7968ec1c();

    /* renamed from: nativeUpdateSampleCount */
    private native void m34029x992e6da5(int i17, int i18);

    /* renamed from: nativeUpdateSampleRate */
    private native void m34030xdbad458a(float f17, int i17);

    public com.p314xaae8f345.p457x3304c6.p479x4179489f.a a(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, int i17) {
        if (m34026x45e6741d(c4129xdee64553, i17)) {
            return new com.p314xaae8f345.p457x3304c6.p479x4179489f.a(m34028x7968ec1c().asFloatBuffer(), m34027x32cf96af());
        }
        return null;
    }

    public void b() {
        this.f16114x39e86013.m16727xc85fe246();
    }

    public void c(float f17, int i17) {
        m34030xdbad458a(f17, i17);
    }
}
