package mi5;

/* loaded from: classes9.dex */
public final class g1 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f408376a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408377b;

    /* renamed from: c, reason: collision with root package name */
    public oe5.d f408378c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.v0 v0Var = this.f408376a;
        android.view.View view = v0Var != null ? v0Var.f336392a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f408376a = a17;
        c(null, this.f408378c);
        return a17.f336392a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        oe5.d dVar = (oe5.d) pVar;
        oe5.d dVar2 = this.f408378c;
        this.f408378c = dVar;
        c(dVar2, dVar);
    }

    public final void c(oe5.d dVar, oe5.d dVar2) {
        l15.c j17;
        java.lang.String d17;
        bw5.mc0 b17;
        bw5.g60 e17;
        em.v0 v0Var = this.f408376a;
        if (dVar2 == null || v0Var == null || (j17 = dVar2.j()) == null || j17.k() == null) {
            return;
        }
        android.content.Context context = v0Var.f336392a.getContext();
        l15.c j18 = dVar2.j();
        java.lang.String m126747x696739c = j18 != null ? j18.m126747x696739c() : null;
        ot0.q v17 = !(m126747x696739c == null || m126747x696739c.length() == 0) ? ot0.q.v(m126747x696739c) : null;
        il4.a aVar = v17 != null ? (il4.a) v17.y(il4.a.class) : null;
        bw5.o50 o50Var = aVar != null ? aVar.f373628e : null;
        java.util.List b18 = kz5.b0.b();
        java.util.LinkedList linkedList = (o50Var == null || (e17 = o50Var.e()) == null) ? null : e17.f109234e;
        if (!(linkedList == null || linkedList.isEmpty())) {
            ((lz5.e) b18).addAll(kz5.n0.K0(linkedList, 4));
        } else if (o50Var != null && (d17 = o50Var.d()) != null) {
            if (!(d17.length() > 0)) {
                d17 = null;
            }
            if (d17 != null) {
                ((lz5.e) b18).add(d17);
            }
        }
        java.util.List a17 = kz5.b0.a(b18);
        z01.f0 f0Var = new z01.f0();
        f0Var.f550541d = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.piq);
        android.content.res.Resources resources = context.getResources();
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String m12487x8010e5e4 = (o50Var == null || (b17 = o50Var.b()) == null) ? null : b17.m12487x8010e5e4();
        if (m12487x8010e5e4 == null) {
            m12487x8010e5e4 = "";
        }
        objArr[0] = m12487x8010e5e4;
        java.lang.String m12637xfb82e301 = o50Var != null ? o50Var.m12637xfb82e301() : null;
        objArr[1] = m12637xfb82e301 != null ? m12637xfb82e301 : "";
        f0Var.f550542e = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pir, objArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<set-?>");
        f0Var.f550544g = a17;
        f0Var.f550543f = com.p314xaae8f345.mm.R.C30861xcebc809e.d4q;
        f0Var.f550545h = new mi5.f1(dVar2);
        if (this.f408377b == null) {
            i95.m c17 = i95.n0.c(q31.r.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            this.f408377b = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).o(context);
            v0Var.b().addView(this.f408377b, -1, -1);
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f408377b;
        if (abstractC11172x705e5905 == null) {
            return;
        }
        abstractC11172x705e5905.m48330xfcfee142(f0Var);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408378c;
    }
}
