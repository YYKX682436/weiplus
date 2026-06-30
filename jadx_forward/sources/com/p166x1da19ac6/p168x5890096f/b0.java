package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes12.dex */
public final class b0 extends java.lang.UnsatisfiedLinkError {
    public b0(java.lang.Throwable th6, java.lang.String str) {
        super("APK was built for a different platform. Supported ABIs: " + java.util.Arrays.toString(com.p166x1da19ac6.p168x5890096f.e0.c()) + " error: " + str);
        initCause(th6);
    }
}
