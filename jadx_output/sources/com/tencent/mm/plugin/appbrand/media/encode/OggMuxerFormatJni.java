package com.tencent.mm.plugin.appbrand.media.encode;

/* loaded from: classes13.dex */
public class OggMuxerFormatJni {
    static {
        com.tencent.mm.plugin.appbrand.media.record.c0 c0Var;
        com.tencent.mm.plugin.appbrand.media.record.c0 c0Var2;
        java.lang.ClassLoader classLoader = com.tencent.mm.plugin.appbrand.media.encode.OggMuxerFormatJni.class.getClassLoader();
        synchronized (com.tencent.mm.plugin.appbrand.media.record.d0.class) {
            c0Var = com.tencent.mm.plugin.appbrand.media.record.d0.f85803a;
        }
        c0Var.loadLibrary("ogg", classLoader);
        synchronized (com.tencent.mm.plugin.appbrand.media.record.d0.class) {
            c0Var2 = com.tencent.mm.plugin.appbrand.media.record.d0.f85803a;
        }
        c0Var2.loadLibrary("wechataudiooggmuxer", classLoader);
    }

    public static native void closeOggFile();

    public static native boolean createOggFile(java.lang.String str, int i17, int i18, int i19);

    public static native int writeAudioBuff(byte[] bArr, int i17);
}
