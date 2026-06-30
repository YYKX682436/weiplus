package io;

/* loaded from: classes9.dex */
public final class d implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f374705a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f374706b;

    /* renamed from: c, reason: collision with root package name */
    public nb5.b f374707c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f374705a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f374705a = a17;
        c(null, this.f374707c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        nb5.b bVar = (nb5.b) pVar;
        nb5.b bVar2 = this.f374707c;
        this.f374707c = bVar;
        c(bVar2, bVar);
    }

    public final void c(nb5.b bVar, nb5.b bVar2) {
        s05.d dVar;
        s05.d dVar2;
        em.v0 v0Var = this.f374705a;
        java.lang.String str = null;
        v05.b j17 = bVar2 != null ? bVar2.j() : null;
        if (bVar2 == null || v0Var == null || j17 == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        z01.b bVar3 = new z01.b();
        bVar3.f550484n = 1295;
        v05.b j18 = bVar2.j();
        bVar3.f550480g = j18 != null ? (s05.d) j18.m75936x14adae67(j18.f513848e + 39) : null;
        v05.b j19 = bVar2.j();
        bVar3.f550477d = j19 != null ? j19.m75945x2fec8307(j19.f449898d + 2) : null;
        bVar3.f550478e = bVar2.k();
        bVar3.f550481h = com.p314xaae8f345.mm.R.C30861xcebc809e.d4q;
        v05.b j27 = bVar2.j();
        if (j27 != null && (dVar2 = (s05.d) j27.m75936x14adae67(j27.f513848e + 39)) != null) {
            str = dVar2.r();
        }
        bVar3.f550479f = str;
        v05.b j28 = bVar2.j();
        bVar3.f550482i = (j28 == null || (dVar = (s05.d) j28.m75936x14adae67(j28.f513848e + 39)) == null) ? 0 : dVar.j();
        if (bVar2.m75933x41a8a7f2(bVar2.f125235d + 6)) {
            bVar3.f550483m = io.c.f374702d;
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f374706b;
        if (abstractC11172x705e5905 != null) {
            if (abstractC11172x705e5905 == null) {
                return;
            }
            abstractC11172x705e5905.m48330xfcfee142(bVar3);
            return;
        }
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f374706b = ((bf5.a) Ai).c(context);
        v0Var.b().addView(this.f374706b, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f374706b;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(bVar3);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f374707c;
    }
}
