package km4;

/* loaded from: classes11.dex */
public final class t extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public t() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!gm0.j1.a()) {
            return false;
        }
        am.uq uqVar = event.f136212g;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uqVar.f89659b, new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20775xbdbd26f1().l())) {
            ml4.b.f409940a.a();
            return false;
        }
        boolean z17 = true;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uqVar.f89659b, new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20780x4febe51().l())) {
            java.lang.String str = uqVar.f89660c;
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (z17) {
                return false;
            }
            qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            ((rk4.z8) g9Var).sj(str, new il4.e(null, 0, 1300, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null));
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uqVar.f89659b, new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20781xa88b9b00().l())) {
            return false;
        }
        java.lang.String str2 = uqVar.f89660c;
        if (str2 == null || r26.n0.N(str2)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        bw5.v70 v70Var = new bw5.v70();
        v70Var.y(1);
        v70Var.x("测试标题");
        v70Var.p("测试作者");
        bw5.z90 z90Var = new bw5.z90();
        z90Var.z(str2);
        v70Var.w(z90Var);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(v70Var);
        lp0Var.g("URL-" + java.lang.System.currentTimeMillis());
        bw5.fq0 fq0Var = new bw5.fq0();
        fq0Var.c(1.0f);
        fq0Var.d(0);
        lp0Var.i(fq0Var);
        bw5.gq0 gq0Var = new bw5.gq0();
        gq0Var.f109485e = str2;
        gq0Var.f109500w[2] = true;
        lp0Var.f111426f = gq0Var;
        lp0Var.f111438u[4] = true;
        ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).qj("", lp0Var, new il4.e(null, 0, 1300, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null));
        return false;
    }
}
