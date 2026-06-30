package mi5;

/* loaded from: classes9.dex */
public final class a1 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.e1 f408327a;

    /* renamed from: b, reason: collision with root package name */
    public oe5.a f408328b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.e1 e1Var = this.f408327a;
        android.view.View view = e1Var != null ? e1Var.f335810a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ehx, (android.view.ViewGroup) null);
        this.f408327a = new em.e1(inflate);
        c(null, this.f408328b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        oe5.a aVar = (oe5.a) pVar;
        oe5.a aVar2 = this.f408328b;
        this.f408328b = aVar;
        c(aVar2, aVar);
    }

    public final void c(oe5.a aVar, oe5.a aVar2) {
        e15.k j17;
        e15.i j18;
        em.e1 e1Var = this.f408327a;
        if (aVar2 == null || e1Var == null || (j17 = aVar2.j()) == null || (j18 = j17.j()) == null) {
            return;
        }
        android.view.View view = e1Var.f335810a;
        android.content.Context context = view.getContext();
        e15.j j19 = j18.j();
        bw5.o50 v17 = il4.d.v(j19 != null ? j19.j() : null);
        e15.j j27 = j18.j();
        bw5.v70 w17 = il4.d.w(j27 != null ? j27.k() : null);
        if (e1Var.f335811b == null) {
            e1Var.f335811b = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18737x1ba35fc6) view.findViewById(com.p314xaae8f345.mm.R.id.srq);
        }
        e1Var.f335811b.m72286xefe20a96(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307));
        if (e1Var.f335811b == null) {
            e1Var.f335811b = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18737x1ba35fc6) view.findViewById(com.p314xaae8f345.mm.R.id.srq);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18737x1ba35fc6 c18737x1ba35fc6 = e1Var.f335811b;
        r45.lm6 lm6Var = new r45.lm6();
        lm6Var.f461170d = j18.m75945x2fec8307(j18.f449898d + 2);
        lm6Var.f461171e = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3s);
        if (v17 != null) {
            bw5.mc0 b17 = v17.b();
            lm6Var.f461172f = b17 != null ? b17.b() : null;
            bw5.mc0 b18 = v17.b();
            lm6Var.f461174h = b18 != null ? b18.m12487x8010e5e4() : null;
        }
        if (w17 != null) {
            lm6Var.f461177n.add(w17.f());
        }
        c18737x1ba35fc6.c(lm6Var);
        view.setOnClickListener(new mi5.z0(v17));
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408328b;
    }
}
