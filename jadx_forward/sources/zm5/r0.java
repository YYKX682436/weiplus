package zm5;

/* loaded from: classes14.dex */
public final class r0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f555792d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f555793e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f555794f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f555795g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f555796h;

    /* renamed from: i, reason: collision with root package name */
    public bm5.r1 f555797i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f555792d = jz5.h.b(new zm5.q0(activity));
        this.f555793e = jz5.h.b(new zm5.g0(this));
        this.f555795g = "";
    }

    public final fn5.n0 O6() {
        return (fn5.n0) ((jz5.n) this.f555792d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("KEY_SUG_QUERY_TEXT");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f555795g = stringExtra;
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("KEY_IS_INIT", false);
        this.f555796h = booleanExtra;
        aq.o.f94453a = false;
        if (booleanExtra) {
            this.f555794f = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(m158354x19263085(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fzr), false, 0, null);
            p3325xe03a0797.p3326xc267989b.y0 a17 = p012xc85e97e9.p093xedfae76a.d1.a(this);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            p3325xe03a0797.p3326xc267989b.l.d(a17, p0Var, null, new zm5.i0(this, null), 2, null);
            p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(this), p0Var, null, new zm5.k0(this, null), 2, null);
        } else {
            aq.n nVar = aq.o.f94455c;
            if (nVar != null) {
                nVar.a(m158354x19263085());
            }
        }
        O6().f346272y = this.f555796h;
        O6().D = true;
        ((com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197) ((jz5.n) this.f555793e).mo141623x754a37bb()).m47820xe9f5bdb7(u0.j.c(-923171977, true, new zm5.p0(this)));
        f65.o oVar = f65.o.f341445a;
        aq.n nVar2 = aq.o.f94455c;
        f65.o.f341453i = nVar2 != null && (nVar2.f94439a == aq.b.f94369e || aq.r0.f94486n == aq.c.f94378g) ? 1 : 2;
        aq.n nVar3 = aq.o.f94455c;
        f65.o.f341461q = nVar3 != null && (nVar3.f94439a == aq.b.f94369e || aq.r0.f94486n == aq.c.f94378g) ? 1 : 2;
        if (!(this.f555795g.length() > 0)) {
            O6().C = false;
            return;
        }
        O6().C = true;
        fn5.n0 O6 = O6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(O6, "<get-viewModel>(...)");
        O6.P6(this.f555795g, null);
        java.lang.String text = this.f555795g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        f65.p.f341481o = text;
        f65.p.f341479m = 1;
        java.lang.String sessionId = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        f65.p.f341478l = sessionId;
        oVar.e(this.f555795g);
        oVar.f();
        oVar.b(4);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        aq.n nVar = aq.o.f94455c;
        if (nVar != null) {
            nVar.d();
        }
        bm5.r1 r1Var = this.f555797i;
        if (r1Var != null && (onGlobalLayoutListener = r1Var.f104264b) != null) {
            r1Var.f104263a.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        fn5.n0 O6 = O6();
        java.util.ArrayList arrayList = O6.f346264q;
        int size = arrayList.size();
        f65.n nVar2 = f65.n.f341442a;
        if (size > 0) {
            nVar2.d(arrayList.size());
            nVar2.g(arrayList.size());
            fn5.p0 p0Var = (fn5.p0) O6.f346262o.mo3195x754a37bb();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p0Var != null ? p0Var.name() : null, "PERSON")) {
                nVar2.e(O6.f346265r.size());
            }
        }
        nVar2.c(56);
        nVar2.c(57);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReportProvider", "reportTecSearchAction " + aq.o.f94453a);
        if (aq.o.f94453a) {
            return;
        }
        f65.p.f341467a.b(8);
    }
}
