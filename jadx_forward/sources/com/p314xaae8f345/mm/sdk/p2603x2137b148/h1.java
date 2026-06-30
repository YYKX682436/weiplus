package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes5.dex */
public abstract class h1 {
    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, boolean z17) {
        java.lang.String str6 = str + str3 + str4 + str5;
        java.lang.String d17 = d(str2, str3, str4, str5, i17, z17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            return null;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(d17);
        java.lang.String str7 = a17.f294812f;
        if (str7 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str7, false, false);
            if (!str7.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str6);
        java.lang.String str8 = a18.f294812f;
        if (str8 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str8, false, false);
            if (!str8.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            return d17;
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (!m18.a() ? false : m18.f294799a.F(m18.f294800b)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.k1.a(str6, d17, false);
        }
        return d17;
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() <= 4) {
            return null;
        }
        return str.substring(0, 2) + "/" + str.substring(2, 4) + "/";
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        return d(str, str2, str3, str4, i17, true);
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.endsWith("/")) {
            return null;
        }
        java.lang.String b17 = i17 == 1 ? b(str3) : i17 == 2 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? null : b(kk.k.g(str3.getBytes())) : "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            return null;
        }
        java.lang.String str5 = str + b17;
        if (z17) {
            com.p314xaae8f345.mm.vfs.w6.u(str5);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str5);
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(str3);
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        return sb6.toString();
    }
}
