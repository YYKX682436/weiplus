package com.tencent.maas;

/* loaded from: classes5.dex */
public final class MJMaasNativeVersion {
    public static java.lang.String a() {
        return nativeGetFullVersion();
    }

    private static native java.lang.String nativeGetBuildNumber();

    private static native java.lang.String nativeGetFullVersion();

    private static native int nativeGetVersionIntValue();

    private static native java.lang.String nativeGetVersionNumber();
}
