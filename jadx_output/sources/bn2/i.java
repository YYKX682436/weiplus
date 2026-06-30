package bn2;

/* loaded from: classes14.dex */
public final class i implements bn2.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f22858a;

    /* renamed from: b, reason: collision with root package name */
    public final lo0.a0 f22859b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f22860c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f22861d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f22862e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22863f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f22864g;

    /* renamed from: h, reason: collision with root package name */
    public final xm2.l f22865h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f22866i;

    /* renamed from: j, reason: collision with root package name */
    public final an2.i f22867j;

    public i(android.view.ViewGroup containerView, lo0.a0 suite, android.view.ViewGroup navigatorContainerView, yz5.a itemValueChangedHandler) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(suite, "suite");
        kotlin.jvm.internal.o.g(navigatorContainerView, "navigatorContainerView");
        kotlin.jvm.internal.o.g(itemValueChangedHandler, "itemValueChangedHandler");
        this.f22858a = containerView;
        this.f22859b = suite;
        this.f22860c = itemValueChangedHandler;
        android.view.View inflate = android.view.LayoutInflater.from(containerView.getContext()).inflate(com.tencent.mm.R.layout.e8s, containerView, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f22861d = viewGroup;
        android.view.View inflate2 = android.view.LayoutInflater.from(navigatorContainerView.getContext()).inflate(com.tencent.mm.R.layout.e8v, navigatorContainerView, false);
        kotlin.jvm.internal.o.e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f22862e = (android.view.ViewGroup) inflate2;
        this.f22863f = true;
        bn2.c cVar = bn2.c.f22844d;
        bn2.e eVar = new bn2.e(this);
        this.f22864g = eVar;
        bn2.d dVar = new bn2.d(this);
        bn2.f fVar = new bn2.f(this);
        java.util.List<lo0.m> list = suite.f319953d;
        this.f22865h = new xm2.l(viewGroup, list, cVar, new ym2.a(), eVar, dVar, fVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (lo0.m mVar : list) {
            arrayList.add(new an2.a(mVar.f320046b, mVar));
        }
        this.f22866i = arrayList;
        an2.i iVar = new an2.i(this.f22862e, arrayList, (an2.b) kz5.n0.X(arrayList));
        this.f22867j = iVar;
        iVar.f8857c = new bn2.a(this);
    }

    @Override // bn2.p
    public android.view.ViewGroup a() {
        return this.f22862e;
    }

    @Override // bn2.p
    public void b() {
        android.content.Context context = this.f22858a.getContext();
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.j(context.getString(com.tencent.mm.R.string.dty));
        u1Var.n(context.getString(com.tencent.mm.R.string.f491659du2));
        u1Var.g(context.getString(com.tencent.mm.R.string.fkj));
        u1Var.c(bn2.g.f22856a, new bn2.h(this));
        u1Var.r(true);
        u1Var.q(false);
    }

    @Override // bn2.p
    public boolean c() {
        return this.f22863f;
    }

    @Override // bn2.p
    public android.view.ViewGroup e() {
        return this.f22861d;
    }

    @Override // bn2.p
    public void h() {
        dk2.d.f233301a.h(this.f22859b);
    }
}
