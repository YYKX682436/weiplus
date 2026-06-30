package mi5;

/* loaded from: classes9.dex */
public final class s implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.u0 f408444a;

    /* renamed from: b, reason: collision with root package name */
    public final yo0.i f408445b;

    /* renamed from: c, reason: collision with root package name */
    public fc5.h f408446c;

    public s() {
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        this.f408445b = fVar.a();
    }

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.u0 u0Var = this.f408444a;
        android.view.View view = u0Var != null ? u0Var.f336362a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ehp, (android.view.ViewGroup) null);
        this.f408444a = new em.u0(inflate);
        c(null, this.f408446c);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.h hVar = (fc5.h) pVar;
        fc5.h hVar2 = this.f408446c;
        this.f408446c = hVar;
        c(hVar2, hVar);
    }

    public final void c(fc5.h hVar, fc5.h hVar2) {
        em.u0 u0Var = this.f408444a;
        java.lang.String j17 = hVar2 != null ? hVar2.j() : null;
        if (hVar2 == null || u0Var == null || j17 == null) {
            return;
        }
        android.view.View view = u0Var.f336362a;
        android.content.Context context = view.getContext();
        ot0.q v17 = ot0.q.v(j17);
        if (v17 != null) {
            zy2.m mVar = (zy2.m) v17.y(zy2.m.class);
            r45.mv2 mv2Var = mVar != null ? mVar.f558990b : null;
            if (mv2Var != null) {
                java.lang.String string = mv2Var.m75939xb282bd08(1) == 1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8m, mv2Var.m75945x2fec8307(0)) : mv2Var.m75945x2fec8307(0);
                android.widget.TextView a17 = u0Var.a();
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                a17.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string));
                vo0.a aVar = vo0.e.f520001b;
                java.lang.String m75945x2fec8307 = mv2Var.m75945x2fec8307(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec8307);
                android.widget.ImageView b17 = u0Var.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getFinderTopicIcon(...)");
                aVar.c(m75945x2fec8307, b17, this.f408445b);
                if (u0Var.f336364c == null) {
                    u0Var.f336364c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.tw_);
                }
                u0Var.f336364c.setText(mv2Var.m75945x2fec8307(3));
                view.setOnClickListener(new mi5.r(this, context, hVar2, mv2Var));
            }
        }
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408446c;
    }
}
