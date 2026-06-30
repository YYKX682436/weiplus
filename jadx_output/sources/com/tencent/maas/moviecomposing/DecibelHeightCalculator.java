package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public final class DecibelHeightCalculator {
    private final com.facebook.jni.HybridData mHybridData;

    public DecibelHeightCalculator(float f17, float f18, float f19) {
        this.mHybridData = initHybrid(f17, f18, f19);
    }

    private native com.facebook.jni.HybridData initHybrid(float f17, float f18, float f19);

    private native java.nio.ByteBuffer nativeCalculate(java.nio.Buffer buffer);

    public java.nio.FloatBuffer a(java.nio.FloatBuffer floatBuffer) {
        if (floatBuffer.isDirect()) {
            return nativeCalculate(floatBuffer).asFloatBuffer();
        }
        throw new java.lang.IllegalArgumentException("decibels must be direct");
    }
}
