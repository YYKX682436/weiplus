package tu;

/* loaded from: classes3.dex */
public final class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui.ActivityC10460xf1280e36 f503596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f503597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.f f503598f;

    public f(com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui.ActivityC10460xf1280e36 activityC10460xf1280e36, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, hu.f fVar) {
        this.f503596d = activityC10460xf1280e36;
        this.f503597e = f9Var;
        this.f503598f = fVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui.ActivityC10460xf1280e36 activityC10460xf1280e36 = this.f503596d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
            hu.f fVar = this.f503598f;
            long n17 = fVar.n();
            java.lang.String q17 = fVar.q();
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) c5Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.i(c5303xc75d2f73, n17, q17);
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87860m = 9;
            c4Var.f87856i = activityC10460xf1280e36;
            c5303xc75d2f73.e();
            return;
        }
        java.lang.Object l17 = gm0.j1.u().c().l(327714, java.lang.Boolean.FALSE);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l17, bool);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f503597e;
        if (b17) {
            com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui.ActivityC10460xf1280e36.U6(activityC10460xf1280e36, f9Var);
            return;
        }
        gm0.j1.u().c().w(327714, bool);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC10460xf1280e36.mo55332x76847179();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293262s = activityC10460xf1280e36.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.odd);
        aVar.f293242a = activityC10460xf1280e36.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
        aVar.f293265v = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1);
        aVar.E = new tu.e(activityC10460xf1280e36, f9Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
    }
}
