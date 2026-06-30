package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f;

/* loaded from: classes7.dex */
public abstract class z0 {
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = n7Var.mo32091x9a3f0ba2().E0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.y0();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, E0.f387374d);
        hashMap.put("desc", "");
        hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, n7Var.Y1());
        of1.w1 s37 = n7Var.s3();
        hashMap.put("webViewUrl", s37 != null ? s37.mo51534x86b9ebe3().mo120156xb5887639() : null);
        hashMap.put("imgUrl", E0.f387376f);
        hashMap.put("mode", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.l1.c(u0Var, "enable_share_with_share_ticket", false) ? "withShareTicket" : "common");
        hashMap.put("dynamic", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.l1.c(u0Var, "enable_share_dynamic", false)));
        hashMap.put(ya.b.f77495x8b74a326, "weixin");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.l1.d(u0Var, "user_clicked_share_btn", true);
        y0Var.v(n7Var.mo32091x9a3f0ba2().C0(), n7Var.mo50260x9f1221c2());
        y0Var.t(hashMap);
        y0Var.m();
    }

    public static void b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var, java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = n7Var.mo32091x9a3f0ba2().E0();
        android.content.SharedPreferences b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(context, "pref_appbrand_" + n7Var.mo32091x9a3f0ba2().u0().f128812x0, 4);
        if (E0.f387385r.f156932d == 1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) b17;
            if (!o4Var.contains("has_share_dev_tips")) {
                o4Var.putLong("has_share_dev_tips", java.lang.System.currentTimeMillis()).commit();
                db5.e1.o(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571669lx, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.w0(runnable, n7Var, u0Var));
                return;
            }
        }
        if (E0.f387385r.f156932d == 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) b17;
            if (!o4Var2.contains("has_share_beta_tips")) {
                o4Var2.putLong("has_share_beta_tips", java.lang.System.currentTimeMillis()).commit();
                db5.e1.o(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571668lw, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.x0(runnable, n7Var, u0Var));
                return;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        a(n7Var, u0Var);
    }
}
