package com.tencent.mm.plugin.appbrand.media.encode;

/* loaded from: classes13.dex */
public class M4aAudioFormatJni {
    static {
        ((mq1.w0) ((mq1.g0) i95.n0.c(mq1.g0.class))).getClass();
        mq1.w0.wi();
    }

    public static native void closeM4aFile();

    public static native int createM4aFile(java.lang.String str, int i17, int i18, int i19);

    public static native int writeAudioBuff(byte[] bArr, int i17);
}
