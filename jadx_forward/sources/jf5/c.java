package jf5;

/* loaded from: classes9.dex */
public final class c implements jf5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f380973a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f380974b;

    public c(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f380973a = ui6;
        this.f380974b = msg;
    }

    @Override // jf5.m0
    public void a(java.lang.String selectedText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedText, "selectedText");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(selectedText);
        yb5.d dVar = this.f380973a;
        android.app.Activity g17 = dVar.g();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(g17);
        e4Var.f293309c = dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        e4Var.f293312f = false;
        e4Var.c();
    }

    @Override // jf5.m0
    public boolean b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        return !c01.ia.A(this.f380974b);
    }

    @Override // jf5.m0
    public boolean c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f380974b;
        return (c01.ia.A(f9Var) || c01.ia.x(f9Var)) ? false : true;
    }

    @Override // jf5.m0
    public boolean d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f380974b;
        return (c01.ia.A(f9Var) || c01.ia.x(f9Var)) ? false : true;
    }

    @Override // jf5.m0
    public boolean e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f380974b;
        return (c01.ia.A(f9Var) || c01.ia.x(f9Var)) ? false : true;
    }

    @Override // jf5.m0
    public void f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 host, java.lang.String selectedText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedText, "selectedText");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            return;
        }
        java.lang.String str = "65_" + c01.id.c();
        su4.j2 j2Var = new su4.j2();
        j2Var.f494471a = this.f380973a.g();
        j2Var.f494472b = 65;
        j2Var.f494474d = selectedText;
        j2Var.f494475e = str;
        j2Var.f494476f = true;
        j2Var.f494479i = false;
        j2Var.f494486p = true;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
    }

    @Override // jf5.m0
    public void g(java.lang.String selectedText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedText, "selectedText");
        jf5.b bVar = new jf5.b(this, selectedText);
        android.app.Activity g17 = this.f380973a.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(this.f380974b, g17, bVar);
    }

    @Override // jf5.m0
    public void h(java.lang.String selectedText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedText, "selectedText");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.m(c5303xc75d2f73, selectedText, 1);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f380973a.f542250l;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87857j = abstractC21611x7536149b;
        c4Var.f87860m = 43;
        r45.bq0 bq0Var = c4Var.f87848a;
        r45.jq0 jq0Var = bq0Var != null ? bq0Var.f452495d : null;
        if (jq0Var != null) {
            java.lang.String r17 = c01.z1.r();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f380974b;
            if (f9Var.A0() == 1) {
                jq0Var.e(r17);
                jq0Var.j(f9Var.Q0());
            } else {
                jq0Var.e(f9Var.Q0());
                jq0Var.j(r17);
            }
            c5303xc75d2f73.e();
        }
    }
}
