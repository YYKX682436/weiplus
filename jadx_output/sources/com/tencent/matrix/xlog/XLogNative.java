package com.tencent.matrix.xlog;

/* loaded from: classes13.dex */
public class XLogNative {
    public static void a(java.lang.String str) {
        setXLoggerNative(str);
    }

    private static native void setXLoggerNative(java.lang.String str);
}
