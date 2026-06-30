package com.tencent.map.geolocation.sapp;

/* loaded from: classes13.dex */
public class TencentLocationManagerOptions {
    private static java.lang.String mKey = "";
    private static boolean sLoadLibrary = true;

    public static java.lang.String getKey() {
        return mKey;
    }

    public static boolean isLoadLibraryEnabled() {
        return sLoadLibrary;
    }

    public static boolean setKey(java.lang.String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        mKey = str;
        return true;
    }

    public static void setLoadLibraryEnabled(boolean z17) {
        sLoadLibrary = z17;
    }
}
