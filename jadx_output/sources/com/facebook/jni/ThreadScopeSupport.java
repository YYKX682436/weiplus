package com.facebook.jni;

/* loaded from: classes13.dex */
public class ThreadScopeSupport {
    static {
        a8.a.a("fbjni");
    }

    private static void runStdFunction(long j17) {
        runStdFunctionImpl(j17);
    }

    private static native void runStdFunctionImpl(long j17);
}
