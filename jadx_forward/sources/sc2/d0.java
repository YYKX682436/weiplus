package sc2;

/* loaded from: classes2.dex */
public final class d0 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487353g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487354h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487355i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487356m;

    public d0(in5.s0 s0Var, sc2.h1 h1Var, android.view.View view, xc2.p0 p0Var) {
        this.f487353g = s0Var;
        this.f487354h = h1Var;
        this.f487355i = view;
        this.f487356m = p0Var;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if ((ev6 instanceof ec2.f) && ((ec2.f) ev6).f332492d == 19) {
            in5.s0 s0Var = this.f487353g;
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
                n17.d(this);
            }
            this.f487354h.S(s0Var, this.f487355i, this.f487356m);
        }
    }
}
