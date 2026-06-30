package mi5;

/* loaded from: classes9.dex */
public final class b implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f408329a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408330b;

    /* renamed from: c, reason: collision with root package name */
    public fc5.g f408331c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f408329a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f408329a = a17;
        c(null, this.f408331c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.g gVar = (fc5.g) pVar;
        fc5.g gVar2 = this.f408331c;
        this.f408331c = gVar;
        c(gVar2, gVar);
    }

    public final void c(fc5.g gVar, fc5.g gVar2) {
        x05.c cVar;
        em.v0 v0Var = this.f408329a;
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
        z01.d dVar = new z01.d();
        dVar.f550511d = com.p314xaae8f345.mm.R.C30861xcebc809e.d4q;
        dVar.f550518n = new mi5.a(this, context, cVar, gVar2);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String m174809x8010e5e4 = cVar.m174809x8010e5e4();
        ((ke0.e) xVar).getClass();
        dVar.f550513f = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m174809x8010e5e4);
        dVar.f550512e = cVar.l();
        dVar.f550514g = cVar.k();
        ze5.n2 n2Var = ze5.o2.f553657a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        n2Var.b(dVar, context, cVar.j(), cVar.m174808x11716638());
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f408330b;
        if (abstractC11172x705e5905 != null) {
            if (abstractC11172x705e5905 == null) {
                return;
            }
            abstractC11172x705e5905.m48330xfcfee142(dVar);
            return;
        }
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        this.f408330b = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).f(context);
        v0Var.b().addView(this.f408330b, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f408330b;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(dVar);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408331c;
    }
}
