package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public abstract class v3 {
    public static boolean a(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().x(str, i17)) {
            if (n9Var != null && com.p314xaae8f345.mm.vfs.w6.j(n9Var.f67183x55b471cc)) {
                java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.EnumC11664x177167f4.d(n9Var.f67183x55b471cc);
                if (!android.text.TextUtils.isEmpty(d17) && (u46.l.c(d17, n9Var.f67186x912ff5eb) || u46.l.c(d17, n9Var.f67176xd0b3bac3))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "checkMainPkgExistedForAppPreLaunch(%s), return true by key:%s", str, n9Var.f67177x28d45f97);
                    return true;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "checkMainPkgExistedForAppPreLaunch(%s), not found", str);
        return false;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 b(java.lang.String str, int i17) {
        java.lang.Object obj;
        int[] o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7.f157481a.e(str) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.o(true) : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().A(str, 0);
        if (o17 != null && o17.length > i17) {
            while (true) {
                int i18 = i17 + 1;
                android.util.Pair b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.EnumC11664x177167f4.b(str, 0, o17[i17], null);
                java.lang.Object obj2 = b17.first;
                if (obj2 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l9.APP_READY && (obj = b17.second) != null) {
                    return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) obj;
                }
                if (obj2 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l9.APP_NEED_MOVE && b17.second != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "wxapkg need move, return legacy path");
                    return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) b17.second;
                }
                if (obj2 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l9.APP_LOCAL_EXIST && b17.second != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "wxapkg local exist");
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7.f157481a.e(str)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k8 k8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k8();
                        java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) b17.second).f33455xe121c411;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x4 x4Var = k8Var.f157161a;
                        x4Var.f157581a = str2;
                        x4Var.f157582b = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7 y7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) b17.second;
                        y7Var.q(c11667xc7e59dd6.f156932d, c11667xc7e59dd6.f33456x1c82a56c, k8Var);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd62 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) b17.second;
                        Di.F(str, c11667xc7e59dd62.f156932d, c11667xc7e59dd62.f33456x1c82a56c, c11667xc7e59dd62.f33455xe121c411);
                    }
                    return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) b17.second;
                }
                if (i18 >= o17.length) {
                    break;
                }
                i17 = i18;
            }
        }
        return null;
    }

    public static java.lang.String c(java.lang.String str, int i17, java.lang.String[] strArr, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "findPkgFromPublicStorage appId:%s, targetVersion:%d", str, java.lang.Integer.valueOf(i17));
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e9.f(str, i17);
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.c() + "firstParty/";
        com.p314xaae8f345.mm.vfs.w6.u(str2);
        boolean startsWith = f17.startsWith(str2);
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.EnumC11664x177167f4.d(f17);
        if (d(d17, strArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "find pkg from public storage success");
            if (c19772x1c2cd081 != null) {
                c19772x1c2cd081.f38869x6ac9171 = d17;
            }
            return f17;
        }
        if (!startsWith) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.c() + "general/";
        com.p314xaae8f345.mm.vfs.w6.u(str3);
        sb6.append(str3);
        sb6.append(java.lang.String.format(java.util.Locale.US, "_%d_%d.wxapkg", java.lang.Integer.valueOf(str.hashCode()), java.lang.Integer.valueOf(i17)));
        java.lang.String sb7 = sb6.toString();
        java.lang.String d18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.EnumC11664x177167f4.d(sb7);
        if (!d(d18, strArr)) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "find first party pkg from public storage success");
        if (c19772x1c2cd081 != null) {
            c19772x1c2cd081.f38869x6ac9171 = d18;
        }
        return sb7;
    }

    public static boolean d(java.lang.String str, java.lang.String[] strArr) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && strArr != null && strArr.length != 0) {
            for (java.lang.String str2 : strArr) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && u46.l.c(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
