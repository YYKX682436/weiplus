package mi5;

/* loaded from: classes9.dex */
public final class m0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f408412a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408413b;

    /* renamed from: c, reason: collision with root package name */
    public dc5.a f408414c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f408412a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f408412a = a17;
        c(null, this.f408414c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        dc5.a aVar = (dc5.a) pVar;
        dc5.a aVar2 = this.f408414c;
        this.f408414c = aVar;
        c(aVar2, aVar);
    }

    public final void c(dc5.a aVar, dc5.a aVar2) {
        java.lang.String str;
        v05.b k17;
        em.v0 v0Var = this.f408412a;
        l15.c k18 = aVar2 != null ? aVar2.k() : null;
        if (aVar2 == null || v0Var == null || k18 == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        z01.y yVar = new z01.y();
        s15.w wVar = new s15.w();
        l15.c k19 = aVar2.k();
        if (k19 == null || (k17 = k19.k()) == null || (str = k17.m75945x2fec8307(k17.f513848e + 44)) == null) {
            str = "";
        }
        wVar.m126728xdc93280d(str);
        yVar.f550720g = wVar;
        yVar.f550721h = aVar2.m123921x7520bed6() == 1;
        int i17 = aVar2.f125235d;
        yVar.f550717d = aVar2.m75942xfb822ef2(i17 + 0);
        java.lang.String m75945x2fec8307 = aVar2.m75945x2fec8307(i17 + 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m75945x2fec8307, "<set-?>");
        yVar.f550718e = m75945x2fec8307;
        yVar.f550719f = com.p314xaae8f345.mm.R.C30861xcebc809e.d4q;
        yVar.f550722i = new mi5.l0(aVar2, context, k18);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f408413b;
        if (abstractC11172x705e5905 != null) {
            abstractC11172x705e5905.m48330xfcfee142(yVar);
            return;
        }
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f408413b = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22085xd1dcc07d(context, null, 0, 6, null);
        v0Var.b().addView(this.f408413b, -1, -1);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f408413b;
        if (abstractC11172x705e59052 == null) {
            return;
        }
        abstractC11172x705e59052.m48330xfcfee142(yVar);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408414c;
    }
}
