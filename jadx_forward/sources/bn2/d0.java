package bn2;

/* loaded from: classes14.dex */
public final class d0 implements bn2.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f104380a;

    /* renamed from: b, reason: collision with root package name */
    public final lo0.k0 f104381b;

    /* renamed from: c, reason: collision with root package name */
    public final lo0.g0 f104382c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f104383d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f104384e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f104385f;

    /* renamed from: g, reason: collision with root package name */
    public final xm2.l f104386g;

    public d0(android.view.ViewGroup containerView, lo0.k0 item, lo0.g0 filterPackage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterPackage, "filterPackage");
        this.f104380a = containerView;
        this.f104381b = item;
        this.f104382c = filterPackage;
        android.view.View inflate = android.view.LayoutInflater.from(containerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e8s, containerView, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f104383d = viewGroup;
        this.f104384e = true;
        bn2.z zVar = new bn2.z(this);
        this.f104385f = zVar;
        this.f104386g = new xm2.l(viewGroup, kz5.b0.c(item), bn2.c0.f104378d, new ym2.f(), zVar, bn2.y.f104442d, null);
    }

    @Override // bn2.p
    public void b() {
        android.content.Context context = this.f104380a.getContext();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.j(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dty));
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573192du2));
        u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fkk));
        u1Var.c(bn2.a0.f104374a, new bn2.b0(this));
        u1Var.r(true);
        u1Var.q(false);
    }

    @Override // bn2.p
    public boolean c() {
        return this.f104384e;
    }

    @Override // bn2.p
    public android.view.ViewGroup e() {
        return this.f104383d;
    }

    @Override // bn2.p
    public void h() {
        dk2.ug.f315751a.f(this.f104381b);
    }
}
