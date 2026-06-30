package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.m0 f176595d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.m0 m0Var) {
        this.f176595d = m0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.m0 m0Var = this.f176595d;
        java.lang.String str = (java.lang.String) m0Var.f176607d.Q.get(java.lang.Integer.valueOf(menuItem.getItemId()));
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals("menu_func_share_friend")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var = m0Var.f176607d;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = b0Var.f176469e;
            lu1.d.a(abstractActivityC21394xb3d2c0cf, 1, b0Var);
            abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(b0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var2 = m0Var.f176607d;
            g0Var.d(11324, "BrandContactView", java.lang.Integer.valueOf(m0Var.f176607d.E.s0().f470083i), m0Var.f176607d.E.f(), m0Var.f176607d.E.g(), 0, java.lang.Integer.valueOf(m0Var.f176607d.U.f176637b), b0Var2.U.f176639d, java.lang.Integer.valueOf(b0Var2.E.n() ? 1 : 0), "");
            g0Var.d(11582, "OperShareFriend", 1, java.lang.Integer.valueOf(m0Var.f176607d.E.s0().f470083i), m0Var.f176607d.E.f(), m0Var.f176607d.E.g(), m0Var.f176607d.I);
            return;
        }
        if (str.equals("menu_func_gift")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0.c(m0Var.f176607d);
            return;
        }
        if (str.equals("menu_func_delete")) {
            java.lang.String string = m0Var.f176607d.E.o() ? m0Var.f176607d.f176469e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572322as5) : "";
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var3 = m0Var.f176607d;
            lu1.r.b(b0Var3.f176469e, b0Var3.U.f176638c, string, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.j0(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11582, "OperDelete", 1, java.lang.Integer.valueOf(m0Var.f176607d.E.s0().f470083i), m0Var.f176607d.E.f(), m0Var.f176607d.E.g(), "");
            return;
        }
        if (str.equals("menu_func_service")) {
            if (!android.text.TextUtils.isEmpty(m0Var.f176607d.E.s0().f470081g)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var4 = m0Var.f176607d;
                lu1.d.l(b0Var4.f176469e, b0Var4.E.s0().f470081g);
                xt1.t0.ij().a(m0Var.f176607d.E.g(), m0Var.f176607d.E.f(), 1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11582, "OperService", 1, java.lang.Integer.valueOf(m0Var.f176607d.E.s0().f470083i), m0Var.f176607d.E.f(), m0Var.f176607d.E.g(), m0Var.f176607d.U.f176639d);
            return;
        }
        if (str.equals("menu_func_report")) {
            if (!android.text.TextUtils.isEmpty(m0Var.f176607d.E.i0().f466727t)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var5 = m0Var.f176607d;
                lu1.d.k(b0Var5.f176469e, b0Var5.E.i0().f466727t, m0Var.f176607d.h(com.p314xaae8f345.mm.R.C30867xcad56011.aup));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11582, "OperReport", 1, java.lang.Integer.valueOf(m0Var.f176607d.E.s0().f470083i), m0Var.f176607d.E.f(), m0Var.f176607d.E.g(), "");
            return;
        }
        if (!str.equals("menu_func_share_timeline")) {
            if (str.equals("menu_func_delete_share_card")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var6 = m0Var.f176607d;
                lu1.r.b(b0Var6.f176469e, b0Var6.U.f176638c, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k0(this));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.o0 o0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.o0) m0Var.f176607d.R.get(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o0Var.f176628b)) {
                lu1.d.f(o0Var.f176628b, o0Var.f176629c, 0);
                return;
            }
            java.lang.String str2 = o0Var.f176627a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            lu1.d.j(m0Var.f176607d.f176469e, str2, 0);
            return;
        }
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        xt1.q qVar = new xt1.q(m0Var.f176607d.E.s0().f470079e);
        ((x60.e) fVar).getClass();
        x51.w0.d(qVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var7 = m0Var.f176607d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = b0Var7.f176469e;
        tt1.j jVar = b0Var7.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 p0Var = b0Var7.U;
        java.lang.String str3 = p0Var.f176638c;
        java.lang.String str4 = p0Var.f176641f;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_link", jVar.s0().A);
        intent.putExtra("KContentObjDesc", jVar.s0().f470085m);
        intent.putExtra("Ksnsupload_title", jVar.s0().f470086n);
        if (android.text.TextUtils.isEmpty(str4)) {
            intent.putExtra("KUploadProduct_UserData", str3 + "#");
        } else {
            intent.putExtra("KUploadProduct_UserData", str3 + "#" + str4);
        }
        intent.putExtra("Ksnsupload_imgurl", jVar.s0().f470079e);
        if (!android.text.TextUtils.isEmpty(jVar.s0().f470079e)) {
            intent.putExtra("KsnsUpload_imgPath", new xt1.q(jVar.s0().f470079e).k());
        }
        intent.getStringExtra("KsnsUpload_imgPath");
        intent.putExtra("src_username", c01.z1.r());
        intent.putExtra("src_displayname", c01.z1.l());
        intent.putExtra("Ksnsupload_appid", jVar.s0().f470080f);
        intent.putExtra("Ksnsupload_appname", jVar.s0().f470081g);
        intent.putExtra("Ksnsupload_type", 7);
        java.lang.String a17 = c01.n2.a("card_package");
        c01.n2.d().c(a17, true).i("prePublishId", "card_package");
        intent.putExtra("reportSessionId", a17);
        j45.l.k(abstractActivityC21394xb3d2c0cf2, "sns", ".ui.SnsUploadUI", intent, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11582, "OperShareTimeLine", 1, java.lang.Integer.valueOf(m0Var.f176607d.E.s0().f470083i), m0Var.f176607d.E.f(), m0Var.f176607d.E.g(), m0Var.f176607d.U.f176639d);
    }
}
