package pk2;

/* loaded from: classes3.dex */
public final class d1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437179h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437180i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437179h = helper.f437632n0;
        this.f437180i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        r45.n73 n73Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        yf2.q qVar = (yf2.q) o9Var.e(yf2.q.class);
        if (qVar == null || (n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) qVar.getStore().m56796xbba4bfc0(mm2.g1.class)).f410604i).mo144003x754a37bb()) == null) {
            return;
        }
        boolean z17 = true;
        r45.z53 z53Var = (r45.z53) n73Var.m75936x14adae67(1);
        java.lang.String m75945x2fec8307 = z53Var != null ? z53Var.m75945x2fec8307(17) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"gameappid\":\"");
        r45.z53 z53Var2 = (r45.z53) n73Var.m75936x14adae67(1);
        sb6.append(z53Var2 != null ? z53Var2.m75945x2fec8307(0) : null);
        sb6.append("\"}");
        java.lang.String params = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7 c6536x75386e7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c6536x75386e7.f138915d = c6536x75386e7.b("FinderUsrname", xy2.c.e(context), true);
        c6536x75386e7.f138917f = hc2.s.b() ? 1 : 0;
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6536x75386e7.f138918g = c6536x75386e7.b("FinderSessionId", Ri, true);
        c6536x75386e7.f138919h = java.lang.System.currentTimeMillis();
        c6536x75386e7.f138920i = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184206b;
        cl0.g gVar = new cl0.g();
        gVar.o("type", 10);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        c6536x75386e7.p(r26.i0.t(gVar2, ",", ";", false));
        c6536x75386e7.f138924m = c6536x75386e7.b("Params", params, true);
        c6536x75386e7.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveReportUtil", "report21017, " + c6536x75386e7.n() + ' ');
        java.lang.String n17 = c6536x75386e7.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea c6300x6832e2ea = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea();
        c6300x6832e2ea.p("21017");
        c6300x6832e2ea.q(t17);
        c6300x6832e2ea.k();
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f543302m, "url empty:" + m75945x2fec8307);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", m75945x2fec8307);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = qVar.N6();
            if (N6 != null) {
                j45.l.n(N6, "webview", ".ui.tools.WebViewUI", intent, qVar.f543303n);
            }
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437180i;
    }

    @Override // qk2.f
    public boolean o() {
        r45.z53 z53Var;
        java.lang.String m75945x2fec8307;
        r45.n73 n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) this.f445960a.c(mm2.g1.class)).f410604i).mo144003x754a37bb();
        return (n73Var == null || (z53Var = (r45.z53) n73Var.m75936x14adae67(1)) == null || (m75945x2fec8307 = z53Var.m75945x2fec8307(17)) == null || m75945x2fec8307.length() <= 0) ? false : true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437179h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cyl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f80865xceac455b, o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    @Override // qk2.h
    public int y() {
        return this.f437179h;
    }
}
