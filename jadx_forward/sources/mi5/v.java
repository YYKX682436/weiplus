package mi5;

/* loaded from: classes9.dex */
public final class v implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.c1 f408460a;

    /* renamed from: b, reason: collision with root package name */
    public qc5.a f408461b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.c1 c1Var = this.f408460a;
        android.view.View view = c1Var != null ? c1Var.f335697a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ehv, (android.view.ViewGroup) null);
        this.f408460a = new em.c1(inflate);
        c(null, this.f408461b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        qc5.a aVar = (qc5.a) pVar;
        qc5.a aVar2 = this.f408461b;
        this.f408461b = aVar;
        c(aVar2, aVar);
    }

    public final void c(qc5.a aVar, qc5.a aVar2) {
        java.lang.String str;
        java.lang.String string;
        y05.c cVar;
        y05.d j17;
        y05.c cVar2;
        y05.d j18;
        y05.c cVar3;
        y05.d j19;
        y05.c cVar4;
        y05.d j27;
        em.c1 c1Var = this.f408460a;
        java.lang.String str2 = null;
        l15.c j28 = aVar2 != null ? aVar2.j() : null;
        if (aVar2 == null || c1Var == null || j28 == null) {
            return;
        }
        android.view.View view = c1Var.f335697a;
        android.content.Context context = view.getContext();
        if (c1Var.f335700d == null) {
            c1Var.f335700d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f565176bk2);
        }
        android.widget.ImageView imageView = c1Var.f335700d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getChattingAvatarIvCard(...)");
        v05.b k17 = j28.k();
        if (k17 == null || (cVar4 = (y05.c) k17.m75936x14adae67(k17.f513848e + 40)) == null || (j27 = cVar4.j()) == null || (str = j27.m176301x9f7ace00()) == null) {
            str = "";
        }
        r53.v vVar = new r53.v();
        boolean z17 = true;
        vVar.f474236a = true;
        vVar.f474237b = true;
        vVar.f474242g = 0.1f;
        r53.y.a().e(imageView, str, vVar.a(), null);
        if (c1Var.f335698b == null) {
            c1Var.f335698b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view.findViewById(com.p314xaae8f345.mm.R.id.bpv);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = c1Var.f335698b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        v05.b k18 = j28.k();
        java.lang.String m176302xfb82e301 = (k18 == null || (cVar3 = (y05.c) k18.m75936x14adae67(k18.f513848e + 40)) == null || (j19 = cVar3.j()) == null) ? null : j19.m176302xfb82e301();
        ((ke0.e) xVar).getClass();
        c22632xdab56332.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m176302xfb82e301));
        v05.b k19 = j28.k();
        if (k19 != null && (cVar2 = (y05.c) k19.m75936x14adae67(k19.f513848e + 40)) != null && (j18 = cVar2.j()) != null) {
            str2 = j18.j();
        }
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            c1Var.a().setVisibility(8);
        } else {
            c1Var.a().setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 a17 = c1Var.a();
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            a17.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
        }
        v05.b k27 = j28.k();
        if (k27 == null || (cVar = (y05.c) k27.m75936x14adae67(k27.f513848e + 40)) == null || (j17 = cVar.j()) == null || (string = j17.l()) == null) {
            string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573753fo1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        }
        if (c1Var.f335699c == null) {
            c1Var.f335699c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view.findViewById(com.p314xaae8f345.mm.R.id.br9);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab563322 = c1Var.f335699c;
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        c22632xdab563322.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string));
        pt0.e0 e0Var = pt0.f0.f439742b1;
        int i17 = aVar2.f125235d;
        e0Var.n(aVar2.m75945x2fec8307(i17 + 1), aVar2.m75942xfb822ef2(i17 + 0));
        view.setOnClickListener(new mi5.u(j28, context));
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408461b;
    }
}
