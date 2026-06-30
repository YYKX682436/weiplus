package ls4;

/* loaded from: classes8.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.m f402580a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f402581b;

    public e0(pr4.m parameter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        this.f402580a = parameter;
    }

    public static final void a(ls4.e0 e0Var, r45.ic5 ic5Var) {
        e0Var.getClass();
        com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84 c4744x18108f84 = new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84();
        r45.nl4 nl4Var = ic5Var.f458463d;
        c4744x18108f84.f20183xa3aefc97 = nl4Var.f463018d;
        c4744x18108f84.f20184xc3c3c505 = nl4Var.f463019e;
        c4744x18108f84.f20185xb4b4e3b5 = nl4Var.f463020f;
        c4744x18108f84.f20193x243a3e51 = nl4Var.f463021g;
        c4744x18108f84.f20194xfea94af0 = nl4Var.f463022h;
        c4744x18108f84.f134673pf = nl4Var.f463023i;
        c4744x18108f84.f20186x659cc89 = nl4Var.f463024m;
        c4744x18108f84.f20226xa5656a2c = ic5Var.f458465f;
        pr4.m mVar = e0Var.f402580a;
        android.app.Activity activity = mVar.f439569a;
        e0Var.f402581b = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), false, 3, null);
        com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41372x4be4e352(mVar.f439569a, c4744x18108f84, new ls4.z(e0Var));
    }

    public final void b() {
        pr4.m mVar = this.f402580a;
        r45.ic5 ic5Var = new r45.ic5();
        try {
            ic5Var.mo11468x92b714fd(mVar.f439570b);
            if (ic5Var.f458467h == null) {
                c(ic5Var);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinSubscribeLogic", "intercept");
            os4.h.f(mVar.f439569a, ic5Var.f458467h, new ls4.y(this, ic5Var));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WeCoinSubscribeLogic", "parse failed, exception: " + e17.getMessage());
            mVar.f439571c.mo146xb9724478(new pr4.n(pr4.p.f439574d));
        }
    }

    public final void c(r45.ic5 ic5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinSubscribeLogic", "showAgreement");
        r45.ka7 agreement_half_page = ic5Var.f458466g;
        pr4.m mVar = this.f402580a;
        if (agreement_half_page == null) {
            mVar.f439571c.mo146xb9724478(new pr4.n(pr4.p.f439574d));
            return;
        }
        android.app.Activity activity = mVar.f439569a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(agreement_half_page, "agreement_half_page");
        new ns4.j4(activity, new ns4.k4(agreement_half_page, new ls4.a0(this, ic5Var), new ls4.b0(this))).f421094c.s();
    }

    public final void d() {
        if (((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinSubscribeLogic", "already auth");
            b();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinSubscribeLogic", "start auth");
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).f(this.f402580a.f439569a, new ls4.c0(this));
        }
    }
}
