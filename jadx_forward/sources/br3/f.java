package br3;

@j95.b
/* loaded from: classes11.dex */
public final class f extends i95.w implements fc0.e {
    public java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            return null;
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        java.lang.String str3 = str2 + '_' + uuid;
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str2);
        i21.q h17 = i21.q.h();
        java.lang.String d17 = h17 != null ? h17.d(str, str3) : null;
        if (d17 == null) {
            return null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(d17));
        if (r6Var.m() && r6Var.A() && r6Var.C() > 0) {
            return d17;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x.v(str2, 1080, 1080, android.graphics.Bitmap.CompressFormat.JPEG, 80, d17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileUtilsFeature", "createThumbNail big pic fail");
            return null;
        }
        if (a17 == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.x.y0(d17, a17, android.graphics.Bitmap.CompressFormat.JPEG, 80, d17)) {
            return d17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileUtilsFeature", "rotate big pic fail");
        return null;
    }

    public void Bi(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (z3Var == null) {
            return;
        }
        java.lang.String d17 = z3Var.d1();
        br3.e eVar = new br3.e(context, z3Var, z17, this);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        pb5.a aVar = new pb5.a();
        java.lang.String d18 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getUsername(...)");
        aVar.n(d18);
        n13.r rVar = new n13.r();
        rVar.f415651b = 0;
        if (d17 != null) {
            rVar.f415658i.add(d17);
        }
        rVar.f415652c = eVar;
        rVar.f415653d.f415672a = 8;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(context, aVar, rVar);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(z3Var.d1())) {
            if (z17) {
                wi(z3Var, context, "yuanbao_profile_recommend_btn");
            } else {
                wi(z3Var, context, "yuanbao_recom_friend");
            }
        }
    }

    public final void wi(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str) {
        if (z3Var == null) {
            return;
        }
        int b17 = vh0.l2.b(abstractActivityC21394xb3d2c0cf.getIntent());
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("chat_session");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", z3Var.d1());
        hashMap.put("enter_type", java.lang.Integer.valueOf(b17));
        if (str == null) {
            str = "yuanbao_recom_friend";
        }
        hashMap.put("view_id", str);
        hashMap.put("enter_sessionid", stringExtra);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
    }
}
