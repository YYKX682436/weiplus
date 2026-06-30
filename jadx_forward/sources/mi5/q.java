package mi5;

/* loaded from: classes9.dex */
public final class q implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f408430a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408431b;

    /* renamed from: c, reason: collision with root package name */
    public fc5.g f408432c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f408430a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f408430a = a17;
        c(null, this.f408432c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.g gVar = (fc5.g) pVar;
        fc5.g gVar2 = this.f408432c;
        this.f408432c = gVar;
        c(gVar2, gVar);
    }

    public final void c(fc5.g gVar, fc5.g gVar2) {
        x05.c cVar;
        em.v0 v0Var = this.f408430a;
        java.lang.String j17 = gVar2 != null ? gVar2.j() : null;
        if (gVar2 == null || v0Var == null || j17 == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        l15.c cVar2 = new l15.c();
        cVar2.m126728xdc93280d(j17);
        v05.b k17 = cVar2.k();
        if (k17 == null || (cVar = (x05.c) k17.m75936x14adae67(k17.f513848e + 57)) == null) {
            return;
        }
        z01.p pVar = new z01.p();
        pVar.f550669d = cVar;
        pVar.f550671f = new mi5.p(this, context, cVar, gVar2);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f408431b;
        if (abstractC11172x705e5905 != null) {
            abstractC11172x705e5905.m48330xfcfee142(pVar);
            return;
        }
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f408431b = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22080x46c0e48c(context, null, 0, 6, null);
        v0Var.b().addView(this.f408431b, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f408431b;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(pVar);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408432c;
    }
}
