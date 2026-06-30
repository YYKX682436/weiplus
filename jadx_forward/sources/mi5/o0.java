package mi5;

/* loaded from: classes9.dex */
public final class o0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f408421a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408422b;

    /* renamed from: c, reason: collision with root package name */
    public ob5.a f408423c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f408421a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f408421a = a17;
        c(null, this.f408423c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        ob5.a aVar = (ob5.a) pVar;
        ob5.a aVar2 = this.f408423c;
        this.f408423c = aVar;
        c(aVar2, aVar);
    }

    public final void c(ob5.a aVar, ob5.a aVar2) {
        v05.b k17;
        em.v0 v0Var = this.f408421a;
        if (aVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        z01.z zVar = new z01.z();
        aVar2.j();
        l15.c j17 = aVar2.j();
        zVar.f550725d = (j17 == null || (k17 = j17.k()) == null) ? null : (u05.a) k17.m75936x14adae67(k17.f513848e + 60);
        zVar.f550726e = com.p314xaae8f345.mm.R.C30861xcebc809e.d4q;
        zVar.f550728g = new mi5.n0(aVar2);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f408422b;
        if (abstractC11172x705e5905 != null) {
            abstractC11172x705e5905.m48330xfcfee142(zVar);
            return;
        }
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f408422b = ((bf5.a) Ai).x(context);
        v0Var.b().addView(this.f408422b, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f408422b;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(zVar);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408423c;
    }
}
