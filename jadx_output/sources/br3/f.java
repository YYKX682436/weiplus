package br3;

@j95.b
/* loaded from: classes11.dex */
public final class f extends i95.w implements fc0.e {
    public java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        if (!com.tencent.mm.vfs.w6.j(str2)) {
            return null;
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        java.lang.String str3 = str2 + '_' + uuid;
        int a17 = com.tencent.mm.sdk.platformtools.l.a(str2);
        i21.q h17 = i21.q.h();
        java.lang.String d17 = h17 != null ? h17.d(str, str3) : null;
        if (d17 == null) {
            return null;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(d17));
        if (r6Var.m() && r6Var.A() && r6Var.C() > 0) {
            return d17;
        }
        if (!com.tencent.mm.sdk.platformtools.x.v(str2, 1080, 1080, android.graphics.Bitmap.CompressFormat.JPEG, 80, d17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileUtilsFeature", "createThumbNail big pic fail");
            return null;
        }
        if (a17 == 0 || com.tencent.mm.sdk.platformtools.x.y0(d17, a17, android.graphics.Bitmap.CompressFormat.JPEG, 80, d17)) {
            return d17;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ProfileUtilsFeature", "rotate big pic fail");
        return null;
    }

    public void Bi(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.ui.MMActivity context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        if (z3Var == null) {
            return;
        }
        java.lang.String d17 = z3Var.d1();
        br3.e eVar = new br3.e(context, z3Var, z17, this);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        pb5.a aVar = new pb5.a();
        java.lang.String d18 = z3Var.d1();
        kotlin.jvm.internal.o.f(d18, "getUsername(...)");
        aVar.n(d18);
        n13.r rVar = new n13.r();
        rVar.f334118b = 0;
        if (d17 != null) {
            rVar.f334125i.add(d17);
        }
        rVar.f334119c = eVar;
        rVar.f334120d.f334139a = 8;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(context, aVar, rVar);
        if (com.tencent.mm.storage.z3.L3(z3Var.d1())) {
            if (z17) {
                wi(z3Var, context, "yuanbao_profile_recommend_btn");
            } else {
                wi(z3Var, context, "yuanbao_recom_friend");
            }
        }
    }

    public final void wi(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str) {
        if (z3Var == null) {
            return;
        }
        int b17 = vh0.l2.b(mMActivity.getIntent());
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("chat_session");
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
