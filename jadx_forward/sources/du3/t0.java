package du3;

/* loaded from: classes3.dex */
public final class t0 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f325241f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f325242g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f325243h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f325244i;

    /* renamed from: m, reason: collision with root package name */
    public final eu3.c f325245m;

    /* renamed from: n, reason: collision with root package name */
    public hk0.e f325246n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f325247o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f325241f = parent;
        this.f325242g = jz5.h.b(new du3.m0(this));
        this.f325243h = jz5.h.b(new du3.l0(this));
        this.f325244i = jz5.h.b(new du3.k0(this));
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f325245m = new eu3.c(context);
        this.f325246n = new hk0.e(hk0.h.f363273e, -707825, 2);
        this.f325247o = jz5.h.b(new du3.s0(this));
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 A() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f325243h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb;
    }

    public final hk0.u0 B() {
        return (hk0.u0) ((jz5.n) this.f325247o).mo141623x754a37bb();
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        B().Z6(1, new du3.p0(this));
        B().a7(1, new du3.q0(this));
        hk0.u0 B = B();
        du3.r0 r0Var = new du3.r0(this);
        B.getClass();
        B.f363349g.mo7806x9d92d11c(B.f363346d, r0Var);
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        z().setBackground(null);
        eu3.c cVar = this.f325245m;
        android.view.View view = cVar.f338356f;
        if (view != null) {
            cVar.f338355e = -1;
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        z().setOnClickListener(new du3.o0(this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this.f325241f.getContext());
        c1162x665295de.Q(0);
        A().mo7967x900dcbe1(c1162x665295de);
        A().N(new eu3.d(10));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 A = A();
        eu3.c cVar = this.f325245m;
        A.mo7960x6cab2c8d(cVar);
        du3.n0 n0Var = new du3.n0(this);
        cVar.getClass();
        cVar.f338358h = n0Var;
    }

    public final android.view.View z() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f325244i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }
}
