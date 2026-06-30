package k13;

/* loaded from: classes10.dex */
public final class y0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f384819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f384820e;

    public y0(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, k13.l1 l1Var) {
        this.f384819d = c22848x6ddd90cf;
        this.f384820e = l1Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        i13.c cVar;
        in5.s0 holder = (in5.s0) k3Var;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f384819d;
        k13.l1 l1Var = this.f384820e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        try {
            int u07 = c22848x6ddd90cf.b0().u0(view);
            if (u07 >= 0 && (cVar = (i13.c) kz5.n0.a0(l1Var.f384772q, u07)) != null) {
                java.util.ArrayList arrayList = l1Var.f384772q;
                if (u07 != 0 || arrayList.size() <= 1) {
                    arrayList.remove(u07);
                    cVar.o();
                    if (l1Var.j()) {
                        ((ku5.t0) ku5.t0.f394148d).B(new k13.c(l1Var));
                    } else {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22848x6ddd90cf.b0().mo7946xf939df19();
                        if (mo7946xf939df19 != null) {
                            mo7946xf939df19.m8155x27702c4(u07);
                        }
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c22848x6ddd90cf.b0().mo7946xf939df19();
                        if (mo7946xf939df192 != null) {
                            mo7946xf939df192.m8151xc67946d3(u07, arrayList.size() - u07);
                        }
                    }
                } else {
                    l1Var.p(u07 + 1);
                }
                cVar.n(holder, view, i17);
            }
        } catch (java.lang.Throwable th6) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            th6.printStackTrace(new java.io.PrintWriter(stringWriter));
            pm0.z.b(xy2.b.f539688b, "finderForceNotifyCrash", false, null, null, false, false, new k13.x0(stringWriter), 60, null);
        }
    }
}
