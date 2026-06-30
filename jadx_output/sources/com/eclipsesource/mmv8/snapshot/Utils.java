package com.eclipsesource.mmv8.snapshot;

/* loaded from: classes7.dex */
public class Utils {
    private Utils() {
    }

    public static boolean isInvalidFd(int i17) {
        return i17 < 0;
    }

    public static boolean isNullOrEmpty(java.lang.String str) {
        return str == null || str.isEmpty();
    }
}
