package mi5;

/* loaded from: classes9.dex */
public final class o implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f408418a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408419b;

    /* renamed from: c, reason: collision with root package name */
    public fc5.f f408420c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f408418a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f408418a = a17;
        c(null, this.f408420c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.f fVar = (fc5.f) pVar;
        fc5.f fVar2 = this.f408420c;
        this.f408420c = fVar;
        c(fVar2, fVar);
    }

    public final void c(fc5.f fVar, fc5.f fVar2) {
        java.lang.String m174833x66e287ae;
        em.v0 v0Var = this.f408418a;
        java.lang.String str = null;
        java.lang.String j17 = fVar2 != null ? fVar2.j() : null;
        if (fVar2 == null || v0Var == null || j17 == null) {
            return;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(j17);
        x05.k kVar = (x05.k) bVar.m75936x14adae67(bVar.f513848e + 37);
        if (kVar == null) {
            return;
        }
        x05.n K = kVar.K();
        if (K != null) {
            x05.n K2 = kVar.K();
            if (K2 != null && (m174833x66e287ae = K2.m174833x66e287ae()) != null) {
                str = r26.i0.t(m174833x66e287ae, "&amp;", "&", false);
            }
            K.j(str);
        }
        if (kVar.m174830xac019deb() == 0) {
            kVar.U(kVar.I());
        }
        if (kVar.m174821x1cbb0791() == 0) {
            kVar.S(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a(kVar.j()));
        }
        if (kVar.m174828x2220c3f4() != 1 && kVar.m174828x2220c3f4() != 2) {
            kVar.T(1);
        }
        android.content.Context context = v0Var.f336392a.getContext();
        z01.o oVar = new z01.o();
        oVar.f550667d = kVar;
        oVar.f550668e = new mi5.n(kVar, j17);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f408419b;
        if (abstractC11172x705e5905 == null) {
            i95.m c17 = i95.n0.c(q31.r.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((q31.t) ((q31.r) c17)).Ai();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            this.f408419b = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22079xc38c2e3d(context, null, 0, 6, null);
            v0Var.b().addView(this.f408419b, -1, -1);
            com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f408419b;
            if (abstractC11172x705e59052 != null) {
                abstractC11172x705e59052.m48330xfcfee142(oVar);
            }
        } else {
            abstractC11172x705e5905.m48330xfcfee142(oVar);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.c) ((s40.p0) i95.n0.c(s40.p0.class))).wi(kVar.A(), kVar.C());
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408420c;
    }
}
