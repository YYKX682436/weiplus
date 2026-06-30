package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public abstract class y2 {
    public static java.lang.String a() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277808c + "/pkg/wxalitebaselibrary/bundle";
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? str3 : "_";
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277808c + "/pkg/wxalitebaselibrary/" + str2 + "/" + str;
    }

    public static java.lang.String c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.LiteAppConfigType liteAppConfigType, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.x2.f225622a[liteAppConfigType.ordinal()];
        java.lang.String str4 = "config";
        if (i17 != 1) {
            if (i17 == 2) {
                str4 = "engineconfig";
            } else if (i17 == 3) {
                str4 = "samplingconfig";
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? str3 : "_";
        }
        java.lang.String str5 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277808c + "/" + str4 + "/" + str + "/" + str2;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str5)) {
            com.p314xaae8f345.mm.vfs.w6.u(str5);
        }
        return str5 + "/config.json";
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? str3 : "_";
        }
        java.lang.String str4 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277808c + "/config/" + str + "/" + str2;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str4)) {
            com.p314xaae8f345.mm.vfs.w6.u(str4);
        }
        return str4 + "/config.json";
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? str3 : "_";
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277808c + "/pkg/" + str + "/" + str2;
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? str3 : "_";
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277808c + "/tmp/" + str + "/" + str2 + "/";
    }

    public static java.lang.String g() {
        java.lang.String str = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277808c + "/tmp/";
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.vfs.w6.u(str);
        }
        return str;
    }
}
