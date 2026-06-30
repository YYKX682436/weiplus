package el2;

/* loaded from: classes3.dex */
public final class r2 extends xt2.m6 implements jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f335432d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f335433e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f335434f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f335435g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f335436h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f335437i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f335438m;

    public r2(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f335432d = root;
        this.f335433e = basePlugin;
        this.f335434f = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.s5o);
        this.f335435g = root.findViewById(com.p314xaae8f345.mm.R.id.s5n);
        this.f335436h = root.findViewById(com.p314xaae8f345.mm.R.id.s5q);
        this.f335437i = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.too);
        this.f335438m = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f6i);
        ym5.a1.h(root, new el2.k2(this));
    }

    public static final int k(el2.r2 r2Var) {
        android.view.ViewGroup viewGroup = r2Var.f335432d;
        android.view.ViewParent parent = viewGroup.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 == null) {
            return -1;
        }
        q26.n i17 = q26.h0.i(new n3.r1(viewGroup2), el2.l2.f335386d);
        return (q26.h0.f(i17) - q26.h0.n(i17, viewGroup)) + 1;
    }

    @Override // jf2.l
    public void F(int i17) {
        jf2.k0.f380910y.b(3, i17 + 1);
    }

    @Override // jf2.o
    public void b() {
        this.f335432d.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80306x8f6ba587), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.mit));
    }

    @Override // jf2.m
    public void e(int i17) {
        df2.ox oxVar = (df2.ox) this.f335433e.U0(df2.ox.class);
        if (oxVar != null) {
            oxVar.d7();
        }
        jf2.k0.f380910y.a(3, i17 + 1);
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f335435g;
    }

    @Override // jf2.o
    public void g() {
        this.f335432d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f335432d;
    }

    @Override // jf2.o
    public boolean i() {
        if (((mm2.c1) this.f335433e.P0(mm2.c1.class)).T) {
            return false;
        }
        return !(((mm2.n0) this.f335433e.P0(mm2.n0.class)).f410806r);
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView imageView = this.f335434f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "imageView");
        return imageView;
    }

    @Override // jf2.o
    /* renamed from: type */
    public int mo57989x368f3a() {
        return 20;
    }
}
