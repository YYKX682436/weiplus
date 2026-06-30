package bn2;

/* loaded from: classes14.dex */
public final class d0 implements bn2.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f22847a;

    /* renamed from: b, reason: collision with root package name */
    public final lo0.k0 f22848b;

    /* renamed from: c, reason: collision with root package name */
    public final lo0.g0 f22849c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f22850d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22851e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f22852f;

    /* renamed from: g, reason: collision with root package name */
    public final xm2.l f22853g;

    public d0(android.view.ViewGroup containerView, lo0.k0 item, lo0.g0 filterPackage) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(filterPackage, "filterPackage");
        this.f22847a = containerView;
        this.f22848b = item;
        this.f22849c = filterPackage;
        android.view.View inflate = android.view.LayoutInflater.from(containerView.getContext()).inflate(com.tencent.mm.R.layout.e8s, containerView, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f22850d = viewGroup;
        this.f22851e = true;
        bn2.z zVar = new bn2.z(this);
        this.f22852f = zVar;
        this.f22853g = new xm2.l(viewGroup, kz5.b0.c(item), bn2.c0.f22845d, new ym2.f(), zVar, bn2.y.f22909d, null);
    }

    @Override // bn2.p
    public void b() {
        android.content.Context context = this.f22847a.getContext();
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.j(context.getString(com.tencent.mm.R.string.dty));
        u1Var.n(context.getString(com.tencent.mm.R.string.f491659du2));
        u1Var.g(context.getString(com.tencent.mm.R.string.fkk));
        u1Var.c(bn2.a0.f22841a, new bn2.b0(this));
        u1Var.r(true);
        u1Var.q(false);
    }

    @Override // bn2.p
    public boolean c() {
        return this.f22851e;
    }

    @Override // bn2.p
    public android.view.ViewGroup e() {
        return this.f22850d;
    }

    @Override // bn2.p
    public void h() {
        dk2.ug.f234218a.f(this.f22848b);
    }
}
