package mi5;

/* loaded from: classes9.dex */
public final class h implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f408379a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408380b;

    /* renamed from: c, reason: collision with root package name */
    public ec5.a f408381c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f408379a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view == null) {
            em.v0 a17 = em.v0.a(context);
            this.f408379a = a17;
            c(null, this.f408381c);
            view = a17.f336392a;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        view.setScaleX(0.7f);
        view.setScaleY(0.7f);
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        ec5.a aVar = (ec5.a) pVar;
        ec5.a aVar2 = this.f408381c;
        this.f408381c = aVar;
        c(aVar2, aVar);
    }

    public final void c(ec5.a aVar, ec5.a aVar2) {
        v05.b bVar;
        java.lang.String r17;
        em.v0 v0Var = this.f408379a;
        l15.c j17 = aVar2 != null ? aVar2.j() : null;
        if (aVar2 == null || v0Var == null || j17 == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        pt0.e0 e0Var = pt0.f0.f439742b1;
        int i17 = aVar2.f125235d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(aVar2.m75945x2fec8307(i17 + 1), aVar2.m75942xfb822ef2(i17 + 0));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = new v05.b();
        if (n17.m124847x74d37ac6() > 0) {
            v05.b bVar2 = (v05.b) h0Var.f391656d;
            java.lang.String j18 = n17.j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j18, "getContent(...)");
            bVar2.m126728xdc93280d(j18);
        } else {
            l15.c j19 = aVar2.j();
            if (j19 == null || (bVar = j19.k()) == null) {
                bVar = new v05.b();
            }
            h0Var.f391656d = bVar;
        }
        z01.m mVar = new z01.m();
        java.lang.String g17 = ez.v0.f339310a.g((v05.b) h0Var.f391656d);
        if (g17 == null) {
            g17 = "";
        }
        mVar.f550631i = g17;
        v05.b bVar3 = (v05.b) h0Var.f391656d;
        v05.a aVar3 = (v05.a) bVar3.m75936x14adae67(bVar3.f513848e + 8);
        java.lang.String f07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(aVar3 != null ? aVar3.m75942xfb822ef2(aVar3.f449897d + 0) : 0L);
        if (f07 == null) {
            f07 = "";
        }
        mVar.f550632m = f07;
        mVar.f550633n = com.p314xaae8f345.mm.R.C30861xcebc809e.d4q;
        v05.b bVar4 = (v05.b) h0Var.f391656d;
        v05.a aVar4 = (v05.a) bVar4.m75936x14adae67(bVar4.f513848e + 8);
        java.lang.String str = (aVar4 == null || (r17 = aVar4.r()) == null) ? "" : r17;
        mVar.f550636q = ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).fj(false, str, false, false);
        if (!aVar2.m75933x41a8a7f2(i17 + 6)) {
            mVar.D = new mi5.g(aVar2, context, n17, str, this, h0Var);
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f408380b;
        if (abstractC11172x705e5905 != null) {
            if (abstractC11172x705e5905 == null) {
                return;
            }
            abstractC11172x705e5905.m48330xfcfee142(mVar);
            return;
        }
        int i18 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r31.n Ai = ((q31.t) ((q31.r) c17)).Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f408380b = ((bf5.a) Ai).s(context);
        v0Var.b().addView(this.f408380b, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f408380b;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(mVar);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408381c;
    }
}
