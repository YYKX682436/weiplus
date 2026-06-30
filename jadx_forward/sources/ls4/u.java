package ls4;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.l f402633a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f402634b;

    /* renamed from: c, reason: collision with root package name */
    public ns4.c0 f402635c;

    public u(pr4.l parameter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        this.f402633a = parameter;
    }

    public static final void a(ls4.u uVar) {
        uVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinConsumeLogic", "cancel");
        uVar.e();
        uVar.f402633a.f439557e.mo152xb9724478();
    }

    public static final void b(ls4.u uVar) {
        uVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinConsumeLogic", "directConsume");
        uVar.g();
        pr4.l lVar = uVar.f402633a;
        if (lVar.f439559g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WeCoinConsumeLogic", "contextBuff == null");
            uVar.d(new pr4.a(pr4.j.f439545d));
            return;
        }
        r45.fc5 fc5Var = new r45.fc5();
        try {
            fc5Var.mo11468x92b714fd(lVar.f439559g);
            os4.h.k("WeCoinConsumeLogic", fc5Var);
            r45.ie ieVar = fc5Var.f76492x92037252;
            if (ieVar == null || ieVar.f458492d == 0) {
                uVar.h(fc5Var);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(fe1.l.f69742x366c91de, 72);
            if (fc5Var.f455740f != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinConsumeLogic", "consumeWeCoin intercept_info is not null");
                g0Var.A(fe1.l.f69742x366c91de, 77);
                os4.h.f(lVar.f439554b, fc5Var.f455740f, new ls4.m(uVar, fc5Var));
                return;
            }
            if (ieVar.f458492d == 10003) {
                uVar.d(new pr4.a(pr4.j.f439546e));
            } else {
                uVar.d(new pr4.a(pr4.j.f439545d));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 72);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WeCoinConsumeLogic", "parse failed, exception: %s", e17.getMessage());
            uVar.d(new pr4.a(pr4.j.f439545d));
        }
    }

    public static final void c(ls4.u uVar) {
        uVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinConsumeLogic", "showConsumePanel");
        uVar.g();
        new ks4.e().l().h(new ls4.q(uVar));
    }

    public final void d(pr4.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinConsumeLogic", "fail");
        e();
        this.f402633a.f439556d.mo146xb9724478(aVar);
    }

    public final void e() {
        pr4.k kVar = this.f402633a.f439558f;
        if (kVar == pr4.k.f439550e || kVar == pr4.k.f439551f) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f402634b;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.f402634b = null;
        }
    }

    public final void f() {
        pm0.v.X(new ls4.r(this));
    }

    public final void g() {
        pr4.l lVar = this.f402633a;
        pr4.k kVar = lVar.f439558f;
        if (kVar == pr4.k.f439550e || kVar == pr4.k.f439551f) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = lVar.f439554b;
            this.f402634b = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC1102x9ee2d9f, activityC1102x9ee2d9f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), false, 3, null);
        }
    }

    public final void h(r45.fc5 fc5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.A(fe1.l.f69742x366c91de, 71);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = fc5Var.f455738d;
        if (gVar == null) {
            g0Var.A(fe1.l.f69742x366c91de, 72);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WeCoinConsumeLogic", "contextByteString is null");
            d(new pr4.a(pr4.j.f439545d));
            return;
        }
        g0Var.A(fe1.l.f69742x366c91de, 73);
        byte[] d17 = com.p314xaae8f345.mm.p971x6de15a2e.j.f153559e.d(gVar.f273689a);
        if (d17 != null) {
            new ks4.b(gVar, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(d17, 0, d17.length)).l().h(new ls4.t(this, fc5Var));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WeCoinConsumeLogic", "signData is null");
        g0Var.A(fe1.l.f69742x366c91de, 76);
        g0Var.A(fe1.l.f69742x366c91de, 75);
        d(new pr4.a(pr4.j.f439545d));
    }
}
