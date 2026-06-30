package mi5;

/* loaded from: classes9.dex */
public final class k implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.u0 f408398a;

    /* renamed from: b, reason: collision with root package name */
    public final yo0.i f408399b;

    /* renamed from: c, reason: collision with root package name */
    public fc5.c f408400c;

    public k() {
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        this.f408399b = fVar.a();
    }

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.u0 u0Var = this.f408398a;
        android.view.View view = u0Var != null ? u0Var.f336362a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ehp, (android.view.ViewGroup) null);
        this.f408398a = new em.u0(inflate);
        c(null, this.f408400c);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.c cVar = (fc5.c) pVar;
        fc5.c cVar2 = this.f408400c;
        this.f408400c = cVar;
        c(cVar2, cVar);
    }

    public final void c(fc5.c cVar, fc5.c cVar2) {
        java.lang.String str;
        java.lang.String string;
        em.u0 u0Var = this.f408398a;
        java.lang.String j17 = cVar2 != null ? cVar2.j() : null;
        if (cVar2 == null || u0Var == null || j17 == null) {
            return;
        }
        android.view.View view = u0Var.f336362a;
        android.content.Context context = view.getContext();
        ot0.q v17 = ot0.q.v(j17);
        if (v17 != null) {
            zy2.e eVar = (zy2.e) v17.y(zy2.e.class);
            r45.mv2 mv2Var = eVar != null ? eVar.f558905b : null;
            if (mv2Var != null) {
                r45.ht0 ht0Var = (r45.ht0) mv2Var.m75936x14adae67(6);
                yo0.i iVar = this.f408399b;
                str = "";
                if (ht0Var != null) {
                    zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                    r45.ht0 ht0Var2 = (r45.ht0) mv2Var.m75936x14adae67(6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ht0Var2);
                    java.lang.String pj6 = ((c61.l7) b6Var).pj(ht0Var2);
                    java.lang.String obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getText(com.p314xaae8f345.mm.R.C30867xcad56011.cmu).toString();
                    r45.ht0 ht0Var3 = (r45.ht0) mv2Var.m75936x14adae67(6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ht0Var3);
                    if (!android.text.TextUtils.isEmpty(ht0Var3.m75945x2fec8307(5))) {
                        r45.ht0 ht0Var4 = (r45.ht0) mv2Var.m75936x14adae67(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ht0Var4);
                        java.lang.String m75945x2fec8307 = ht0Var4.m75945x2fec8307(5);
                        obj = m75945x2fec8307 != null ? m75945x2fec8307 : "";
                    }
                    if (u0Var.f336366e == null) {
                        u0Var.f336366e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.tfl);
                    }
                    u0Var.f336366e.setText(obj);
                    if (mv2Var.m75945x2fec8307(2) != null) {
                        vo0.a aVar = vo0.e.f520001b;
                        java.lang.String m75945x2fec83072 = mv2Var.m75945x2fec8307(2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec83072);
                        android.widget.ImageView b17 = u0Var.b();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getFinderTopicIcon(...)");
                        aVar.c(m75945x2fec83072, b17, iVar);
                    } else {
                        u0Var.b().setVisibility(4);
                    }
                    view.setOnClickListener(new mi5.i(this, context, cVar2, mv2Var));
                    str = pj6;
                } else {
                    if (mv2Var.m75939xb282bd08(1) == 18) {
                        str = mv2Var.m75945x2fec8307(0);
                        android.widget.TextView a17 = u0Var.a();
                        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                        a17.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
                        r45.ub4 ub4Var = (r45.ub4) mv2Var.m75936x14adae67(8);
                        if (ub4Var != null && ub4Var.m75939xb282bd08(1) == 1) {
                            string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m9u);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                        } else {
                            string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m9v);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                        }
                        if (u0Var.f336366e == null) {
                            u0Var.f336366e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.tfl);
                        }
                        u0Var.f336366e.setText(string);
                        u0Var.b().setVisibility(0);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mv2Var.m75945x2fec8307(2))) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().S(u0Var.b(), -1, com.p314xaae8f345.mm.R.C30861xcebc809e.aqs, context.hashCode());
                        } else {
                            vo0.a aVar2 = vo0.e.f520001b;
                            java.lang.String m75945x2fec83073 = mv2Var.m75945x2fec8307(2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec83073);
                            android.widget.ImageView b18 = u0Var.b();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "getFinderTopicIcon(...)");
                            aVar2.c(m75945x2fec83073, b18, iVar);
                        }
                        view.setOnClickListener(new mi5.j(this, context, cVar2, mv2Var));
                    }
                }
                android.widget.TextView a18 = u0Var.a();
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                a18.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
                if (u0Var.f336364c == null) {
                    u0Var.f336364c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.tw_);
                }
                u0Var.f336364c.setText(mv2Var.m75945x2fec8307(3));
            }
        }
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408400c;
    }
}
