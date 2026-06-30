package io;

/* loaded from: classes9.dex */
public final class z implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f374976a;

    /* renamed from: b, reason: collision with root package name */
    public jd5.c f374977b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f374978c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f374976a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f374976a = a17;
        c(null, this.f374977b);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        jd5.c cVar = (jd5.c) pVar;
        jd5.c cVar2 = this.f374977b;
        this.f374977b = cVar;
        c(cVar2, cVar);
    }

    public final void c(jd5.c cVar, jd5.c cVar2) {
        em.v0 v0Var = this.f374976a;
        if (cVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        z01.j0 j0Var = new z01.j0();
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        j0Var.f550596d = m11.b1.Di().b3(cVar2.m140766x4eae2065(), i65.a.g(context), context, com.p314xaae8f345.mm.R.C30861xcebc809e.bzt);
        j0Var.f550602m = cVar2.m140767x36bbd779();
        j0Var.f550614y = new io.y(cVar2, context);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f374978c;
        if (abstractC11172x705e5905 != null) {
            if (abstractC11172x705e5905 == null) {
                return;
            }
            abstractC11172x705e5905.m48330xfcfee142(j0Var);
            return;
        }
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f374978c = ((bf5.a) Ai).z(context);
        v0Var.b().addView(this.f374978c, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f374978c;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(j0Var);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f374977b;
    }
}
