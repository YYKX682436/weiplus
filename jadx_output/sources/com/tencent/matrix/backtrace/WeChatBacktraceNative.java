package com.tencent.matrix.backtrace;

/* loaded from: classes13.dex */
public class WeChatBacktraceNative {
    public static native java.lang.String[] consumeRequestedQut();

    public static native void enableLogger(boolean z17);

    public static native void immediateGeneration(boolean z17);

    public static native void notifyWarmedUp(java.lang.String str, int i17);

    public static void requestQutGenerate() {
    }

    public static native void setBacktraceMode(int i17);

    public static native void setPackageName(java.lang.String str);

    public static native void setQuickenAlwaysOn(boolean z17);

    public static native void setSavingPath(java.lang.String str);

    public static native void setWarmedUp(boolean z17);

    public static native int[] statistic(java.lang.String str);

    public static native boolean testLoadQut(java.lang.String str, int i17);

    public static native boolean warmUp(java.lang.String str, int i17, boolean z17);
}
