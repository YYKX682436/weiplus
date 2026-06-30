package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public abstract class w {
    public static boolean a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            return true;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return false;
    }

    public static boolean b(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R;
        if (!a() || str == null || (R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("GameCenter.DebugTool")) == null) {
            return false;
        }
        return R.getBoolean(str, false);
    }

    public static java.lang.String c(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R;
        return (!a() || str == null || (R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("GameCenter.DebugTool")) == null) ? "" : R.getString(str, "");
    }

    public static boolean d(java.lang.String str, java.lang.String str2) {
        if (!a() || str == null) {
            return false;
        }
        if (str2 == null) {
            str2 = "";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("GameCenter.DebugTool");
        if (R == null) {
            return false;
        }
        return R.D(str, str2);
    }
}
