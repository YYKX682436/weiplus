package mi5;

/* loaded from: classes9.dex */
public final class f0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f408364a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408365b;

    /* renamed from: c, reason: collision with root package name */
    public id5.a f408366c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f408364a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f408364a = a17;
        c(null, this.f408366c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        id5.a aVar = (id5.a) pVar;
        id5.a aVar2 = this.f408366c;
        this.f408366c = aVar;
        c(aVar2, aVar);
    }

    public final void c(id5.a aVar, id5.a aVar2) {
        em.v0 v0Var = this.f408364a;
        if (aVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        z01.s sVar = new z01.s();
        pt0.e0 e0Var = pt0.f0.f439742b1;
        int i17 = aVar2.f125235d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(aVar2.m75945x2fec8307(i17 + 1), aVar2.m75942xfb822ef2(i17 + 0));
        if (n17.m124847x74d37ac6() > 0) {
            o15.b bVar = new o15.b();
            java.lang.String j17 = n17.j();
            if (j17 == null) {
                j17 = "";
            }
            bVar.m126728xdc93280d(j17);
            sVar.f550691f = bVar.j();
            sVar.f550689d = java.lang.Long.valueOf(n17.m124847x74d37ac6());
            sVar.f550690e = n17.Q0();
        } else {
            o15.b j18 = aVar2.j();
            sVar.f550691f = j18 != null ? j18.j() : null;
        }
        sVar.f550692g = com.p314xaae8f345.mm.R.C30861xcebc809e.d4q;
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f408365b;
        if (abstractC11172x705e5905 != null) {
            if (abstractC11172x705e5905 == null) {
                return;
            }
            abstractC11172x705e5905.m48330xfcfee142(sVar);
            return;
        }
        int i18 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f408365b = ((bf5.a) Ai).l(context);
        v0Var.b().addView(this.f408365b, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f408365b;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(sVar);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408366c;
    }
}
