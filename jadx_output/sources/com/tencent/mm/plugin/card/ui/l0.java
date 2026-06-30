package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.m0 f95062d;

    public l0(com.tencent.mm.plugin.card.ui.m0 m0Var) {
        this.f95062d = m0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.card.ui.m0 m0Var = this.f95062d;
        java.lang.String str = (java.lang.String) m0Var.f95074d.Q.get(java.lang.Integer.valueOf(menuItem.getItemId()));
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals("menu_func_share_friend")) {
            com.tencent.mm.plugin.card.ui.b0 b0Var = m0Var.f95074d;
            com.tencent.mm.ui.MMActivity mMActivity = b0Var.f94936e;
            lu1.d.a(mMActivity, 1, b0Var);
            mMActivity.mmSetOnActivityResultCallback(b0Var);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            com.tencent.mm.plugin.card.ui.b0 b0Var2 = m0Var.f95074d;
            g0Var.d(11324, "BrandContactView", java.lang.Integer.valueOf(m0Var.f95074d.E.s0().f388550i), m0Var.f95074d.E.f(), m0Var.f95074d.E.g(), 0, java.lang.Integer.valueOf(m0Var.f95074d.U.f95104b), b0Var2.U.f95106d, java.lang.Integer.valueOf(b0Var2.E.n() ? 1 : 0), "");
            g0Var.d(11582, "OperShareFriend", 1, java.lang.Integer.valueOf(m0Var.f95074d.E.s0().f388550i), m0Var.f95074d.E.f(), m0Var.f95074d.E.g(), m0Var.f95074d.I);
            return;
        }
        if (str.equals("menu_func_gift")) {
            com.tencent.mm.plugin.card.ui.b0.c(m0Var.f95074d);
            return;
        }
        if (str.equals("menu_func_delete")) {
            java.lang.String string = m0Var.f95074d.E.o() ? m0Var.f95074d.f94936e.getString(com.tencent.mm.R.string.f490789as5) : "";
            com.tencent.mm.plugin.card.ui.b0 b0Var3 = m0Var.f95074d;
            lu1.r.b(b0Var3.f94936e, b0Var3.U.f95105c, string, new com.tencent.mm.plugin.card.ui.j0(this));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11582, "OperDelete", 1, java.lang.Integer.valueOf(m0Var.f95074d.E.s0().f388550i), m0Var.f95074d.E.f(), m0Var.f95074d.E.g(), "");
            return;
        }
        if (str.equals("menu_func_service")) {
            if (!android.text.TextUtils.isEmpty(m0Var.f95074d.E.s0().f388548g)) {
                com.tencent.mm.plugin.card.ui.b0 b0Var4 = m0Var.f95074d;
                lu1.d.l(b0Var4.f94936e, b0Var4.E.s0().f388548g);
                xt1.t0.ij().a(m0Var.f95074d.E.g(), m0Var.f95074d.E.f(), 1);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11582, "OperService", 1, java.lang.Integer.valueOf(m0Var.f95074d.E.s0().f388550i), m0Var.f95074d.E.f(), m0Var.f95074d.E.g(), m0Var.f95074d.U.f95106d);
            return;
        }
        if (str.equals("menu_func_report")) {
            if (!android.text.TextUtils.isEmpty(m0Var.f95074d.E.i0().f385194t)) {
                com.tencent.mm.plugin.card.ui.b0 b0Var5 = m0Var.f95074d;
                lu1.d.k(b0Var5.f94936e, b0Var5.E.i0().f385194t, m0Var.f95074d.h(com.tencent.mm.R.string.aup));
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11582, "OperReport", 1, java.lang.Integer.valueOf(m0Var.f95074d.E.s0().f388550i), m0Var.f95074d.E.f(), m0Var.f95074d.E.g(), "");
            return;
        }
        if (!str.equals("menu_func_share_timeline")) {
            if (str.equals("menu_func_delete_share_card")) {
                com.tencent.mm.plugin.card.ui.b0 b0Var6 = m0Var.f95074d;
                lu1.r.b(b0Var6.f94936e, b0Var6.U.f95105c, "", new com.tencent.mm.plugin.card.ui.k0(this));
                return;
            }
            com.tencent.mm.plugin.card.ui.o0 o0Var = (com.tencent.mm.plugin.card.ui.o0) m0Var.f95074d.R.get(str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(o0Var.f95095b)) {
                lu1.d.f(o0Var.f95095b, o0Var.f95096c, 0);
                return;
            }
            java.lang.String str2 = o0Var.f95094a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            lu1.d.j(m0Var.f95074d.f94936e, str2, 0);
            return;
        }
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        xt1.q qVar = new xt1.q(m0Var.f95074d.E.s0().f388546e);
        ((x60.e) fVar).getClass();
        x51.w0.d(qVar);
        com.tencent.mm.plugin.card.ui.b0 b0Var7 = m0Var.f95074d;
        com.tencent.mm.ui.MMActivity mMActivity2 = b0Var7.f94936e;
        tt1.j jVar = b0Var7.E;
        com.tencent.mm.plugin.card.ui.p0 p0Var = b0Var7.U;
        java.lang.String str3 = p0Var.f95105c;
        java.lang.String str4 = p0Var.f95108f;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_link", jVar.s0().A);
        intent.putExtra("KContentObjDesc", jVar.s0().f388552m);
        intent.putExtra("Ksnsupload_title", jVar.s0().f388553n);
        if (android.text.TextUtils.isEmpty(str4)) {
            intent.putExtra("KUploadProduct_UserData", str3 + "#");
        } else {
            intent.putExtra("KUploadProduct_UserData", str3 + "#" + str4);
        }
        intent.putExtra("Ksnsupload_imgurl", jVar.s0().f388546e);
        if (!android.text.TextUtils.isEmpty(jVar.s0().f388546e)) {
            intent.putExtra("KsnsUpload_imgPath", new xt1.q(jVar.s0().f388546e).k());
        }
        intent.getStringExtra("KsnsUpload_imgPath");
        intent.putExtra("src_username", c01.z1.r());
        intent.putExtra("src_displayname", c01.z1.l());
        intent.putExtra("Ksnsupload_appid", jVar.s0().f388547f);
        intent.putExtra("Ksnsupload_appname", jVar.s0().f388548g);
        intent.putExtra("Ksnsupload_type", 7);
        java.lang.String a17 = c01.n2.a("card_package");
        c01.n2.d().c(a17, true).i("prePublishId", "card_package");
        intent.putExtra("reportSessionId", a17);
        j45.l.k(mMActivity2, "sns", ".ui.SnsUploadUI", intent, false);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11582, "OperShareTimeLine", 1, java.lang.Integer.valueOf(m0Var.f95074d.E.s0().f388550i), m0Var.f95074d.E.f(), m0Var.f95074d.E.g(), m0Var.f95074d.U.f95106d);
    }
}
