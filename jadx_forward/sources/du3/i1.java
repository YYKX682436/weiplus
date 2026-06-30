package du3;

/* loaded from: classes3.dex */
public final class i1 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f325151f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f325152g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f325153h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f325154i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f325155m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f325156n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f325157o;

    /* renamed from: p, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f325158p;

    /* renamed from: q, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f325159q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f325151f = parent;
        this.f325152g = jz5.h.b(new du3.w0(this));
        this.f325153h = jz5.h.b(new du3.f1(this));
        this.f325154i = jz5.h.b(new du3.g1(this));
        this.f325155m = jz5.h.b(new du3.u0(this));
        this.f325156n = jz5.h.b(new du3.v0(this));
        this.f325157o = jz5.h.b(new du3.h1(this));
        this.f325158p = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    public final android.view.View A() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f325152g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.widget.TextView B() {
        java.lang.Object mo141623x754a37bb = this.f325154i.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    public final hk0.u0 C() {
        return (hk0.u0) this.f325157o.mo141623x754a37bb();
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        C().Z6(4, new du3.b1(this));
        this.f325159q = p3325xe03a0797.p3326xc267989b.l.d(this.f325158p, null, null, new du3.e1(this, null), 3, null);
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f325159q;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        z(false);
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f325153h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.view.View) mo141623x754a37bb).setOnClickListener(new du3.x0(this));
        B().setOnClickListener(new du3.y0(this));
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f325155m).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.view.View) mo141623x754a37bb2).setOnClickListener(new du3.z0(this));
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) this.f325156n).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((android.view.View) mo141623x754a37bb3).setOnClickListener(new du3.a1(this));
        z(false);
        android.view.ViewGroup.LayoutParams layoutParams = A().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin += com.p314xaae8f345.mm.ui.bl.c(A().getContext());
        A().setLayoutParams(layoutParams2);
    }

    public final void z(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoCropPlugin", "changeUndoState >> " + z17);
        B().setEnabled(z17);
        B().setTextColor(i65.a.d(this.f325151f.getContext(), z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560806ac5 : com.p314xaae8f345.mm.R.C30859x5a72f63.ac6));
    }
}
