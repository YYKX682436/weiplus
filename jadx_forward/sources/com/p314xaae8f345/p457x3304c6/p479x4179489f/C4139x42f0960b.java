package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* renamed from: com.tencent.maas.moviecomposing.DecibelHeightCalculator */
/* loaded from: classes5.dex */
public final class C4139x42f0960b {

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16118x39e86013;

    public C4139x42f0960b(float f17, float f18, float f19) {
        this.f16118x39e86013 = m34049xfce9a72c(f17, f18, f19);
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m34049xfce9a72c(float f17, float f18, float f19);

    /* renamed from: nativeCalculate */
    private native java.nio.ByteBuffer m34050x99dffd0f(java.nio.Buffer buffer);

    public java.nio.FloatBuffer a(java.nio.FloatBuffer floatBuffer) {
        if (floatBuffer.isDirect()) {
            return m34050x99dffd0f(floatBuffer).asFloatBuffer();
        }
        throw new java.lang.IllegalArgumentException("decibels must be direct");
    }
}
