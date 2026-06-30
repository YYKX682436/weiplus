package bn2;

/* loaded from: classes14.dex */
public final class i implements bn2.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f104391a;

    /* renamed from: b, reason: collision with root package name */
    public final lo0.a0 f104392b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f104393c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f104394d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f104395e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f104396f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f104397g;

    /* renamed from: h, reason: collision with root package name */
    public final xm2.l f104398h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f104399i;

    /* renamed from: j, reason: collision with root package name */
    public final an2.i f104400j;

    public i(android.view.ViewGroup containerView, lo0.a0 suite, android.view.ViewGroup navigatorContainerView, yz5.a itemValueChangedHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suite, "suite");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigatorContainerView, "navigatorContainerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemValueChangedHandler, "itemValueChangedHandler");
        this.f104391a = containerView;
        this.f104392b = suite;
        this.f104393c = itemValueChangedHandler;
        android.view.View inflate = android.view.LayoutInflater.from(containerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e8s, containerView, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f104394d = viewGroup;
        android.view.View inflate2 = android.view.LayoutInflater.from(navigatorContainerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e8v, navigatorContainerView, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f104395e = (android.view.ViewGroup) inflate2;
        this.f104396f = true;
        bn2.c cVar = bn2.c.f104377d;
        bn2.e eVar = new bn2.e(this);
        this.f104397g = eVar;
        bn2.d dVar = new bn2.d(this);
        bn2.f fVar = new bn2.f(this);
        java.util.List<lo0.m> list = suite.f401486d;
        this.f104398h = new xm2.l(viewGroup, list, cVar, new ym2.a(), eVar, dVar, fVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (lo0.m mVar : list) {
            arrayList.add(new an2.a(mVar.f401579b, mVar));
        }
        this.f104399i = arrayList;
        an2.i iVar = new an2.i(this.f104395e, arrayList, (an2.b) kz5.n0.X(arrayList));
        this.f104400j = iVar;
        iVar.f90390c = new bn2.a(this);
    }

    @Override // bn2.p
    public android.view.ViewGroup a() {
        return this.f104395e;
    }

    @Override // bn2.p
    public void b() {
        android.content.Context context = this.f104391a.getContext();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.j(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dty));
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573192du2));
        u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fkj));
        u1Var.c(bn2.g.f104389a, new bn2.h(this));
        u1Var.r(true);
        u1Var.q(false);
    }

    @Override // bn2.p
    public boolean c() {
        return this.f104396f;
    }

    @Override // bn2.p
    public android.view.ViewGroup e() {
        return this.f104394d;
    }

    @Override // bn2.p
    public void h() {
        dk2.d.f314834a.h(this.f104392b);
    }
}
