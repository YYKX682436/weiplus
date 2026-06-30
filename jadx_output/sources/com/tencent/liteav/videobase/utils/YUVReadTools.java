package com.tencent.liteav.videobase.utils;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes6.dex */
public class YUVReadTools {
    public static native void nativeReadYUVPlanesForByteArray(int i17, int i18, byte[] bArr);

    public static native void nativeReadYUVPlanesForByteBuffer(int i17, int i18, java.nio.ByteBuffer byteBuffer);
}
