package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class AudioTempoProcessor {
    public static java.nio.ByteBuffer a(java.nio.ByteBuffer byteBuffer, int i17, float f17) {
        return nativeProcess(byteBuffer, i17, f17);
    }

    private static native java.nio.ByteBuffer nativeProcess(java.nio.ByteBuffer byteBuffer, int i17, float f17);
}
