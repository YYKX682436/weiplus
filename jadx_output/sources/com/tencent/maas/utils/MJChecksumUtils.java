package com.tencent.maas.utils;

/* loaded from: classes5.dex */
public class MJChecksumUtils {
    public static java.lang.String a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return nativeCalculateChecksum(str);
    }

    private static native java.lang.String nativeCalculateChecksum(java.lang.String str);

    private static native boolean nativeIsMediaFileValidGivenChecksum(java.lang.String str, java.lang.String str2);

    private static native boolean nativeWriteCopyrightMetadata(java.lang.String str, java.lang.String str2);
}
