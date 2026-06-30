package com.tencent.liteav.base.util;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes7.dex */
public class HandlerThreadHolder {
    private final android.os.HandlerThread mHandlerThread;

    public HandlerThreadHolder(java.lang.String str) {
        this.mHandlerThread = new android.os.HandlerThread(str);
    }

    public android.os.Looper getLooper() {
        return this.mHandlerThread.getLooper();
    }

    public void start() {
        this.mHandlerThread.start();
    }
}
