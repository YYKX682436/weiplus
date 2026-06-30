package io;

/* loaded from: classes9.dex */
public final class v implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f374967a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f374968b;

    /* renamed from: c, reason: collision with root package name */
    public xd5.a f374969c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f374967a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f374967a = a17;
        c(null, this.f374969c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        xd5.a aVar = (xd5.a) pVar;
        xd5.a aVar2 = this.f374969c;
        this.f374969c = aVar;
        c(aVar2, aVar);
    }

    public final void c(xd5.a aVar, xd5.a aVar2) {
        android.content.Context context;
        em.v0 v0Var = this.f374967a;
        l15.c k17 = aVar2 != null ? aVar2.k() : null;
        if (aVar2 == null || v0Var == null || k17 == null || (context = v0Var.f336392a.getContext()) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(ct.t2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        z01.b0 wi6 = ((te5.y) ((ct.t2) c17)).wi(context, k17);
        wi6.f550487f = com.p314xaae8f345.mm.R.C30861xcebc809e.d4q;
        wi6.f550488g = new io.u(aVar2, context, k17);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f374968b;
        if (abstractC11172x705e5905 != null) {
            abstractC11172x705e5905.m48330xfcfee142(wi6);
            return;
        }
        i95.m c18 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ((q31.t) ((q31.r) c18)).Ai();
        this.f374968b = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22088xa3cc645c(context, null, 0, 6, null);
        v0Var.b().addView(this.f374968b, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f374968b;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(wi6);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f374969c;
    }
}
