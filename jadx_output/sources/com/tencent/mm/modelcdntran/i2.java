package com.tencent.mm.modelcdntran;

/* loaded from: classes.dex */
public abstract class i2 {
    public static java.lang.String a(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            for (int i17 = 0; i17 < str.length(); i17++) {
                char charAt = str.charAt(i17);
                if (!com.tencent.mm.sdk.platformtools.t8.y0(charAt) && !com.tencent.mm.sdk.platformtools.t8.O0(charAt)) {
                    return null;
                }
            }
        }
        return str;
    }

    public static java.lang.String b(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(a(str)) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || j17 <= 0) {
            return null;
        }
        java.lang.String a17 = a(str3);
        if (a17 == null) {
            a17 = "";
        }
        java.lang.String str4 = "a" + str + "_" + kk.k.g(((gm0.j1.a() ? c01.z1.r() : "unknowuser") + "-" + str2).getBytes()).substring(0, 16) + "_" + j17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            return str4;
        }
        return str4 + "_" + a17;
    }
}
