package mi5;

/* loaded from: classes9.dex */
public final class f implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f408361a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408362b;

    /* renamed from: c, reason: collision with root package name */
    public lb5.a f408363c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f408361a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view == null) {
            em.v0 a17 = em.v0.a(context);
            this.f408361a = a17;
            c(null, this.f408363c);
            view = a17.f336392a;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        view.setScaleX(0.7f);
        view.setScaleY(0.7f);
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        lb5.a aVar = (lb5.a) pVar;
        lb5.a aVar2 = this.f408363c;
        this.f408363c = aVar;
        c(aVar2, aVar);
    }

    public final void c(lb5.a aVar, lb5.a aVar2) {
        em.v0 v0Var = this.f408361a;
        if (aVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        z01.k kVar = new z01.k();
        kVar.q(c01.id.c());
        kVar.s(0);
        java.lang.String j17 = aVar2.j();
        if (j17 == null) {
            j17 = "";
        }
        kVar.t(j17);
        ot0.q v17 = ot0.q.v(aVar2.k());
        java.lang.String str = v17 != null ? v17.f430179d : null;
        if (str == null) {
            str = "";
        }
        kVar.o(str);
        java.lang.String str2 = v17 != null ? v17.H : null;
        kVar.p(str2 != null ? str2 : "");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f408362b;
        if (abstractC11172x705e5905 != null) {
            abstractC11172x705e5905.m48330xfcfee142(kVar);
            return;
        }
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f408362b = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22076x79b79a85(context, null, 0, 6, null);
        v0Var.b().addView(this.f408362b, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f408362b;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(kVar);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408363c;
    }
}
