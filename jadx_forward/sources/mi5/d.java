package mi5;

/* loaded from: classes9.dex */
public final class d implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f408343a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408344b;

    /* renamed from: c, reason: collision with root package name */
    public pb5.a f408345c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f408343a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f408343a = a17;
        c(null, this.f408345c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        pb5.a aVar = (pb5.a) pVar;
        pb5.a aVar2 = this.f408345c;
        this.f408345c = aVar;
        c(aVar2, aVar);
    }

    public final void c(pb5.a aVar, pb5.a aVar2) {
        em.v0 v0Var = this.f408343a;
        if (aVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        z01.j jVar = new z01.j();
        jVar.f550592d = aVar2.j();
        jVar.f550593e = com.p314xaae8f345.mm.R.C30861xcebc809e.d4q;
        jVar.f550595g = new mi5.c(aVar2);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f408344b;
        if (abstractC11172x705e5905 != null) {
            if (abstractC11172x705e5905 == null) {
                return;
            }
            abstractC11172x705e5905.m48330xfcfee142(jVar);
            return;
        }
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f408344b = ((bf5.a) Ai).i(context);
        v0Var.b().addView(this.f408344b, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f408344b;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(jVar);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408345c;
    }
}
