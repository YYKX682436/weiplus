package v12;

/* loaded from: classes7.dex */
public final class f extends lc3.e implements jc3.g0, jc3.u {

    /* renamed from: d, reason: collision with root package name */
    public final jc3.j0 f514035d;

    /* renamed from: e, reason: collision with root package name */
    public v12.e f514036e;

    public f() {
        jc3.j0 wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p4.class))).wi("MagicSnsTimeline");
        rc3.w0 w0Var = (rc3.w0) wi6;
        w0Var.w(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
        c16416x87606a7b.f229361r = this;
        c16416x87606a7b.f229367x = this;
        c16416x87606a7b.f229354h = z65.c.a();
        c16416x87606a7b.f229365v = ((je3.i) i95.n0.c(je3.i.class)).Ii(1.0E-4f);
        c16416x87606a7b.a(kz5.c0.i(new w12.b(), new w12.d(), new w12.a(), new w12.e()));
        w0Var.W(c16416x87606a7b);
        w0Var.m162153x68ac462();
        this.f514035d = wi6;
    }

    public final void C0(zp0.e event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        ((rc3.w0) this.f514035d).k("OnClientEvent", event.a());
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSnsTimeline", "canvas created");
        v12.e eVar = this.f514036e;
        if (eVar != null) {
            v12.i iVar = (v12.i) eVar;
            iVar.f514041e = view;
            iVar.wi();
        }
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        v12.i iVar;
        android.view.View view2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSnsTimeline", "canvas destroyed");
        v12.e eVar = this.f514036e;
        if (eVar == null || (view2 = (iVar = (v12.i) eVar).f514041e) == null) {
            return;
        }
        android.view.ViewParent parent = view2.getParent();
        android.widget.FrameLayout frameLayout = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
        if (frameLayout != null) {
            frameLayout.removeView(view2);
        }
        iVar.f514041e = null;
    }

    @Override // jc3.u
    public void b1() {
        v12.e eVar = this.f514036e;
        if (eVar != null) {
            d75.b.g(new v12.h((v12.i) eVar));
        }
    }
}
