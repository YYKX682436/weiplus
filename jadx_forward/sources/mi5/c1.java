package mi5;

/* loaded from: classes9.dex */
public final class c1 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f408340a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408341b;

    /* renamed from: c, reason: collision with root package name */
    public oe5.b f408342c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f408340a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f408340a = a17;
        c(null, this.f408342c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        oe5.b bVar = (oe5.b) pVar;
        oe5.b bVar2 = this.f408342c;
        this.f408342c = bVar;
        c(bVar2, bVar);
    }

    public final void c(oe5.b bVar, oe5.b bVar2) {
        l15.c j17;
        v05.b k17;
        em.v0 v0Var = this.f408340a;
        if (bVar2 == null || v0Var == null || (j17 = bVar2.j()) == null || (k17 = j17.k()) == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        pt0.e0 e0Var = pt0.f0.f439742b1;
        int i17 = bVar2.f125235d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(bVar2.m75945x2fec8307(i17 + 1), bVar2.m75942xfb822ef2(i17 + 0));
        e15.h hVar = (e15.h) k17.m75936x14adae67(k17.f513848e + 45);
        bw5.o50 v17 = il4.d.v(hVar != null ? hVar.k() : null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        java.lang.String m75945x2fec8307 = k17.m75945x2fec8307(k17.f449898d + 2);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String z07 = n17.z0();
        if (z07 == null) {
            z07 = "";
        }
        r45.lm6 b17 = il4.d.b(context, m75945x2fec8307, v17, z07);
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 c18735xc3936731 = new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731(context);
        c18735xc3936731.c();
        c18735xc3936731.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d4q);
        c18735xc3936731.g(b17, null);
        z01.e0 e0Var2 = new z01.e0();
        java.lang.String str = b17.f461170d;
        if (str == null) {
            str = "";
        }
        e0Var2.f550533e = str;
        java.lang.String str2 = b17.f461171e;
        e0Var2.f550534f = str2 != null ? str2 : "";
        e0Var2.f550532d = c18735xc3936731;
        e0Var2.f550535g = com.p314xaae8f345.mm.R.C30861xcebc809e.d4q;
        e0Var2.f550536h = new mi5.b1(bVar2, n17, v17, k17);
        if (this.f408341b == null) {
            i95.m c17 = i95.n0.c(q31.r.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            this.f408341b = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).n(context);
            v0Var.b().addView(this.f408341b, -1, -1);
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f408341b;
        if (abstractC11172x705e5905 == null) {
            return;
        }
        abstractC11172x705e5905.m48330xfcfee142(e0Var2);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408342c;
    }
}
