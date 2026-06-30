package com.tencent.kinda;

/* loaded from: classes9.dex */
public class ConstructProxy {
    public static void proxyDefaultConstructor(java.lang.Class cls, java.lang.String str) {
        if (cls == null || str == null) {
            return;
        }
        proxyDefaultConstructor(cls.getName(), str);
    }

    private static native void proxyDefaultConstructor(java.lang.String str, java.lang.String str2);
}
