package mi5;

/* loaded from: classes9.dex */
public final class e implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.d1 f408352a;

    /* renamed from: b, reason: collision with root package name */
    public vd5.a f408353b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.d1 d1Var = this.f408352a;
        android.view.View view = d1Var != null ? d1Var.f335751a : null;
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ehw, (android.view.ViewGroup) null);
            this.f408352a = new em.d1(view);
            c(null, this.f408353b);
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        view.setScaleX(0.7f);
        view.setScaleY(0.7f);
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        vd5.a aVar = (vd5.a) pVar;
        vd5.a aVar2 = this.f408353b;
        this.f408353b = aVar;
        c(aVar2, aVar);
    }

    public final void c(vd5.a aVar, vd5.a aVar2) {
        java.lang.String j17;
        em.d1 d1Var = this.f408352a;
        v05.b j18 = aVar2 != null ? aVar2.j() : null;
        if (aVar2 == null || d1Var == null || j18 == null) {
            return;
        }
        android.view.View view = d1Var.f335751a;
        android.content.Context context = view.getContext();
        if (d1Var.f335754d == null) {
            d1Var.f335754d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f565176bk2);
        }
        int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        gk0.k kVar = new gk0.k(h17, h17);
        kVar.f353966d = 0.1f;
        int i17 = j18.f513848e;
        java.lang.String m75945x2fec8307 = j18.m75945x2fec8307(i17 + 14);
        gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
        if (d1Var.f335754d == null) {
            d1Var.f335754d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f565176bk2);
        }
        android.widget.ImageView imageView = d1Var.f335754d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getChattingAvatarIvCard(...)");
        java.lang.String str = "";
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        ((h83.g) n0Var).wi(imageView, m75945x2fec8307, kVar);
        if (d1Var.f335752b == null) {
            d1Var.f335752b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view.findViewById(com.p314xaae8f345.mm.R.id.bpv);
        }
        d1Var.f335752b.setText(j18.m75945x2fec8307(j18.f449898d + 3));
        if (d1Var.f335755e == null) {
            d1Var.f335755e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view.findViewById(com.p314xaae8f345.mm.R.id.brd);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = d1Var.f335755e;
        r05.l lVar = (r05.l) j18.m75936x14adae67(i17 + 41);
        if (lVar != null && (j17 = lVar.j()) != null) {
            str = j17;
        }
        c22632xdab56332.setText(str);
        if (d1Var.f335753c == null) {
            d1Var.f335753c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view.findViewById(com.p314xaae8f345.mm.R.id.br9);
        }
        d1Var.f335753c.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3b));
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408353b;
    }
}
