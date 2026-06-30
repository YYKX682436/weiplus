package dd5;

/* loaded from: classes9.dex */
public final class e2 extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.e2 f310657p = new dd5.e2();

    public e2() {
        super(dd5.h2.f310694b.f508072a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.g2 g2Var = (dd5.g2) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (g2Var == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getTitleTv(...)");
        z(d17, context, g2Var.f310687a);
        android.widget.TextView b17 = binding.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getDescTv(...)");
        z(b17, context, g2Var.f310688b);
        int width = binding.c().getWidth();
        r45.zs4 zs4Var = g2Var.f310689c;
        zs4Var.f473890o = width;
        ff0.q qVar = (ff0.q) i95.n0.c(ff0.q.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21832xcd3ee688 c17 = binding.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getIconIv(...)");
        ((if0.w) qVar).Bi(context, c17, null, zs4Var);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.g2 g2Var = (dd5.g2) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionMusic.k(context, null) && g2Var != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = g2Var.f310690d;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.o6.f283598a.d(context, f9Var, ot0.q.v(f9Var.j()));
        }
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String m75945x2fec8307;
        l15.e j17;
        java.lang.String U1 = f9Var.U1();
        boolean z17 = false;
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(U1);
        int i17 = bVar.f513848e;
        e15.b bVar2 = (e15.b) bVar.m75936x14adae67(i17 + 49);
        e15.c cVar = (e15.c) bVar.m75936x14adae67(i17 + 48);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String D2 = m11.b1.Di().D2(f9Var, f9Var.z0(), true);
        if (D2 == null) {
            D2 = "";
        }
        java.lang.String x17 = bVar2 != null ? bVar2.x() : null;
        boolean z18 = x17 == null || x17.length() == 0;
        int i18 = bVar.f449898d;
        if (z18) {
            m75945x2fec8307 = bVar.m75945x2fec8307(i18 + 3);
        } else if (bVar2 == null || (m75945x2fec8307 = bVar2.x()) == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String str = f9Var.m124847x74d37ac6() + "_msg";
        ((if0.w) ((ff0.q) i95.n0.c(ff0.q.class))).getClass();
        r45.zs4 zs4Var = new r45.zs4();
        zs4Var.f473891p = il4.l.g(cVar != null ? cVar.m126779xfb85f7b0() : 0);
        java.lang.String m75945x2fec83072 = bVar.m75945x2fec8307(i17 + 46);
        zs4Var.f473884f = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        zs4Var.f473885g = D2;
        l15.d dVar = (l15.d) bVar.m75936x14adae67(i17 + 30);
        if (dVar != null && (j17 = dVar.j()) != null && j17.k() == 1) {
            z17 = true;
        }
        zs4Var.f473887i = z17;
        zs4Var.f473882d = bVar.m75945x2fec8307(i18 + 2);
        zs4Var.f473883e = m75945x2fec8307;
        zs4Var.f473888m = true;
        zs4Var.f473889n = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, te5.t.c(cVar != null ? new java.lang.Long(cVar.j()).toString() : null));
        return new dd5.g2(bVar.m75945x2fec8307(i18 + 2), m75945x2fec8307, zs4Var, f9Var);
    }

    @Override // uc5.b0, uc5.n
    /* renamed from: y */
    public void n(android.content.Context context, em.a2 binding, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        android.content.res.Resources resources = context.getResources();
        uc5.e eVar = uc5.n.f508060n;
        eVar.a();
        int color = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m, null);
        android.widget.TextView d17 = binding.d();
        java.lang.CharSequence text = binding.d().getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        d17.setText(eVar.b(text, query, color));
        android.widget.TextView b17 = binding.b();
        java.lang.CharSequence text2 = binding.b().getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text2, "getText(...)");
        b17.setText(eVar.b(text2, query, color));
    }
}
