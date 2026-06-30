package com.tencent.liteav.base;

@com.tencent.liteav.base.annotations.JNINamespace("base::android")
/* loaded from: classes6.dex */
public abstract class PathService {
    public static final int DIR_MODULE = 3;

    private PathService() {
    }

    private static native void nativeOverride(int i17, java.lang.String str);

    public static void override(int i17, java.lang.String str) {
        nativeOverride(i17, str);
    }
}
