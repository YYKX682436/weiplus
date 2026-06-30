package com.tencent.mm.plugin.appbrand.media.encode;

/* loaded from: classes13.dex */
public class Mp3EncodeJni {
    static {
        com.tencent.mm.plugin.appbrand.media.record.c0 c0Var;
        java.lang.ClassLoader classLoader = com.tencent.mm.plugin.appbrand.media.encode.Mp3EncodeJni.class.getClassLoader();
        synchronized (com.tencent.mm.plugin.appbrand.media.record.d0.class) {
            c0Var = com.tencent.mm.plugin.appbrand.media.record.d0.f85803a;
        }
        c0Var.loadLibrary("mp3lame", classLoader);
    }

    public static native void close();

    public static native int encode(short[] sArr, short[] sArr2, int i17, byte[] bArr);

    public static native int encodeBufferInterleaved(short[] sArr, int i17, byte[] bArr);

    public static native int flush(byte[] bArr);

    public static native int getVersion();

    public static native int init(int i17, int i18, int i19, int i27, int i28);

    public static native void setMode(int i17);
}
