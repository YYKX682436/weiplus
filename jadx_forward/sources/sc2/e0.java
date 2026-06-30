package sc2;

/* loaded from: classes2.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487383g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(sc2.h1 h1Var, in5.s0 s0Var, android.view.View view, xc2.p0 p0Var) {
        super(0);
        this.f487380d = h1Var;
        this.f487381e = s0Var;
        this.f487382f = view;
        this.f487383g = p0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f487382f;
        sc2.h1 h1Var = this.f487380d;
        java.lang.String str = h1Var.f487461w;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showToast");
        xc2.p0 p0Var = this.f487383g;
        r45.t01 N = h1Var.N(p0Var);
        if (N == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "showToast, getCardStyle is null");
        } else {
            sc2.q8 q8Var = p0Var.f534766J;
            if (q8Var != null) {
                q8Var.f487710a = true;
            }
            in5.s0 s0Var = this.f487381e;
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.tcp);
            android.view.ViewGroup viewGroup = h1Var.H;
            if (viewGroup != null) {
                h1Var.K(viewGroup, 0);
            }
            textView.setText(N.m75945x2fec8307(12));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startShowCardCountdown");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = h1Var.B;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            h1Var.B = p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) h1Var.A).mo141623x754a37bb(), null, null, new sc2.g1(h1Var, s0Var, view, p0Var, null), 3, null);
            sc2.f1 f1Var = new sc2.f1(h1Var);
            h1Var.f487460p1 = f1Var;
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.a(f1Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
