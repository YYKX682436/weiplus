package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes9.dex */
public abstract class s1 {
    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.M4(str)) {
            return c01.e2.a0() ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571955uj) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571956uk);
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        if (yp5.a.f545942a.a()) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571953uh);
        }
        return android.text.TextUtils.isEmpty(str) ? false : str.equals(c01.z1.r()) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571953uh) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571954ui);
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.M4(str)) {
            return c01.e2.a0() ? "WeChat" : "Weixin";
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        return (!yp5.a.f545942a.a() && com.p314xaae8f345.mm.p2621x8fb0427b.z3.M4(str)) ? c01.je.r("OfficialAliasName") : str2;
    }

    public static android.text.SpannableString c(android.content.Context context, java.lang.String str, android.text.SpannableString spannableString) {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.M4(str) ? c01.e2.a0() ? new android.text.SpannableString(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571233a)) : new android.text.SpannableString(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571234b)) : spannableString;
    }

    public static boolean d(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 D5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D5(str, 9223372036854775806L);
        return (D5 == null || D5.m124847x74d37ac6() == 0) ? false : true;
    }

    public static void e(android.content.Context context, int i17, int i18) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileUtils", "launchCreatorSetting: context is null");
            return;
        }
        r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
        if (l1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileUtils", "launchCreatorSetting: BizPersonalCenterPluginAppHelper service is null");
        } else {
            l1Var.Ui(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.r1(i17, l1Var, i18, context));
        }
    }
}
