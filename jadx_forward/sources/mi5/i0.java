package mi5;

/* loaded from: classes9.dex */
public final class i0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f408390a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408391b;

    /* renamed from: c, reason: collision with root package name */
    public jd5.b f408392c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f408390a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f408390a = a17;
        c(null, this.f408392c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        jd5.b bVar = (jd5.b) pVar;
        jd5.b bVar2 = this.f408392c;
        this.f408392c = bVar;
        c(bVar2, bVar);
    }

    public final void c(jd5.b bVar, jd5.b bVar2) {
        java.util.ArrayList arrayList;
        em.v0 v0Var = this.f408390a;
        if (bVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        z01.v vVar = new z01.v();
        java.util.LinkedList<oi3.g> j17 = bVar2.j();
        if (j17 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(j17, 10));
            for (oi3.g gVar : j17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(gVar.m75945x2fec8307(gVar.f427150d + 3), gVar.m75942xfb822ef2(gVar.f427150d + 0));
                if (k17 == null) {
                    return;
                }
                b11.f fVar = new b11.f();
                fVar.q(k17.m124847x74d37ac6());
                fVar.s(k17.Q0());
                fVar.p(java.lang.String.valueOf(k17.mo78012x3fdd41df()));
                fVar.n(k17.mo78012x3fdd41df());
                arrayList.add(new b11.e(jz5.h.b(new mi5.h0(k17, this, context, fVar)), fVar));
            }
        } else {
            arrayList = null;
        }
        vVar.f550700e = arrayList;
        if (this.f408391b == null) {
            int i17 = q31.r.f441452c1;
            i95.m c17 = i95.n0.c(q31.r.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            this.f408391b = ((bf5.a) Ai).m(context);
            v0Var.b().addView(this.f408391b, -1, -1);
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f408391b;
        if (abstractC11172x705e5905 == null) {
            return;
        }
        abstractC11172x705e5905.m48330xfcfee142(vVar);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408392c;
    }
}
