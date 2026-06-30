package io;

/* loaded from: classes9.dex */
public final class f implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f374711a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f374712b;

    /* renamed from: c, reason: collision with root package name */
    public nb5.b f374713c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f374711a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f374711a = a17;
        c(null, this.f374713c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        nb5.b bVar = (nb5.b) pVar;
        nb5.b bVar2 = this.f374713c;
        this.f374713c = bVar;
        c(bVar2, bVar);
    }

    public final void c(nb5.b bVar, nb5.b bVar2) {
        em.v0 v0Var = this.f374711a;
        v05.b j17 = bVar2 != null ? bVar2.j() : null;
        if (bVar2 == null || v0Var == null || j17 == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        z01.c cVar = new z01.c();
        cVar.f550504t = 1295;
        v05.b j18 = bVar2.j();
        cVar.f550494g = j18 != null ? (s05.d) j18.m75936x14adae67(j18.f513848e + 39) : null;
        v05.b j19 = bVar2.j();
        cVar.f550495h = j19 != null ? (v05.a) j19.m75936x14adae67(j19.f513848e + 8) : null;
        v05.b j27 = bVar2.j();
        cVar.f550491d = j27 != null ? j27.m75945x2fec8307(j27.f449898d + 2) : null;
        cVar.f550492e = bVar2.k();
        cVar.f550497m = com.p314xaae8f345.mm.R.C30861xcebc809e.d4q;
        v05.b j28 = bVar2.j();
        cVar.f550493f = j28 != null ? j28.m75945x2fec8307(j28.f513848e + 12) : null;
        if (bVar2.m75933x41a8a7f2(bVar2.f125235d + 6)) {
            cVar.f550498n = io.e.f374710d;
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f374712b;
        if (abstractC11172x705e5905 != null) {
            if (abstractC11172x705e5905 == null) {
                return;
            }
            abstractC11172x705e5905.m48330xfcfee142(cVar);
            return;
        }
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f374712b = ((bf5.a) Ai).b(context);
        v0Var.b().addView(this.f374712b, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f374712b;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(cVar);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f374713c;
    }
}
