package io;

/* loaded from: classes9.dex */
public final class r implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f374958a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f374959b;

    /* renamed from: c, reason: collision with root package name */
    public jd5.a f374960c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f374958a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f374958a = a17;
        c(null, this.f374960c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        jd5.a aVar = (jd5.a) pVar;
        jd5.a aVar2 = this.f374960c;
        this.f374960c = aVar;
        c(aVar2, aVar);
    }

    public final void c(jd5.a aVar, jd5.a aVar2) {
        em.v0 v0Var = this.f374958a;
        if (aVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        if (aVar2.n() <= 0 || aVar2.j() <= 0) {
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.r0(aVar2.k(), c19767x257d7f, c19767x257d7f2);
            aVar2.r(c19767x257d7f.f38864x6ac9171);
            aVar2.o(c19767x257d7f2.f38864x6ac9171);
        }
        z01.q qVar = new z01.q();
        java.lang.String k17 = aVar2.k();
        int i17 = qVar.f550677i;
        qVar.set(i17 + 0, k17);
        qVar.set(i17 + 1, java.lang.Integer.valueOf(aVar2.j()));
        qVar.set(i17 + 2, java.lang.Integer.valueOf(aVar2.n()));
        qVar.f550674f = new io.q(aVar2, context);
        int i18 = aVar2.f125235d;
        if (aVar2.m75942xfb822ef2(i18 + 0) > 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(aVar2.m75945x2fec8307(i18 + 1), aVar2.m75942xfb822ef2(i18 + 0));
            oi3.f fVar = new oi3.f();
            c01.gb.a(fVar, n17);
            qVar.set(i17 + 9, fVar);
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f374959b;
        if (abstractC11172x705e5905 != null) {
            if (abstractC11172x705e5905 == null) {
                return;
            }
            abstractC11172x705e5905.m48330xfcfee142(qVar);
            return;
        }
        int i19 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f374959b = ((bf5.a) Ai).t(context);
        v0Var.b().addView(this.f374959b, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f374959b;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(qVar);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f374960c;
    }
}
