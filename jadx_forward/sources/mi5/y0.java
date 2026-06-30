package mi5;

/* loaded from: classes9.dex */
public final class y0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f408476a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408477b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f408478c;

    /* renamed from: d, reason: collision with root package name */
    public vd5.b f408479d;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f408476a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f408476a = a17;
        this.f408478c = context;
        c(null, this.f408479d);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        vd5.b bVar = (vd5.b) pVar;
        vd5.b bVar2 = this.f408479d;
        this.f408479d = bVar;
        c(bVar2, bVar);
    }

    public final void c(vd5.b bVar, vd5.b bVar2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        b15.b bVar3;
        java.lang.String m9590xabfc4b2a;
        em.v0 v0Var = this.f408476a;
        l15.c j17 = bVar2 != null ? bVar2.j() : null;
        if (bVar2 == null || v0Var == null || j17 == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        z01.a0 a0Var = new z01.a0();
        v05.b k17 = j17.k();
        java.lang.String str5 = "";
        if (k17 == null || (str = k17.m75945x2fec8307(k17.f449898d + 2)) == null) {
            str = "";
        }
        a0Var.f550470d = str;
        v05.b k18 = j17.k();
        if (k18 == null || (str2 = k18.m75945x2fec8307(k18.f449898d + 3)) == null) {
            str2 = "";
        }
        a0Var.f550471e = str2;
        v05.b k19 = j17.k();
        if (k19 == null || (str3 = k19.m75945x2fec8307(k19.f513848e + 14)) == null) {
            str3 = "";
        }
        a0Var.f550472f = str3;
        a0Var.f550475i = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.d4q);
        v05.b k27 = j17.k();
        if (k27 == null || (str4 = k27.m75945x2fec8307(k27.f513848e + 12)) == null) {
            str4 = "";
        }
        a0Var.f550473g = str4;
        v05.b k28 = j17.k();
        if (k28 != null && (bVar3 = (b15.b) k28.m75936x14adae67(k28.f513848e + 78)) != null && (m9590xabfc4b2a = bVar3.m9590xabfc4b2a()) != null) {
            str5 = m9590xabfc4b2a;
        }
        a0Var.f550474h = str5;
        a0Var.f550476m = new mi5.x0(this, a0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ForwardPocketMoneyView", "has init pocketMoneyViewModel: " + a0Var);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f408477b;
        if (abstractC11172x705e5905 != null) {
            if (abstractC11172x705e5905 == null) {
                return;
            }
            abstractC11172x705e5905.m48330xfcfee142(a0Var);
            return;
        }
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f408477b = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22087x284a2b89(context, null, 0, 6, null);
        v0Var.b().addView(this.f408477b, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f408477b;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(a0Var);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408479d;
    }
}
