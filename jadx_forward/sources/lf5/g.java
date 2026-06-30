package lf5;

/* loaded from: classes5.dex */
public abstract class g {
    public static final void a(android.view.View quoteViewInstance, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quoteViewInstance, "quoteViewInstance");
        android.view.View findViewById = quoteViewInstance.findViewById(com.p314xaae8f345.mm.R.id.uw8);
        if (findViewById != null) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            if (z17) {
                marginLayoutParams.leftMargin = z18 ? i65.a.b(findViewById.getContext(), 5) : 0;
                marginLayoutParams.rightMargin = z18 ? 0 : i65.a.b(findViewById.getContext(), 5);
            } else {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            }
            findViewById.setLayoutParams(marginLayoutParams);
        }
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e b(com.p314xaae8f345.mm.p2621x8fb0427b.ca caVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(caVar, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e = new com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = caVar.f275355a;
        c16565x9bc03d4e.f231016e = f9Var.I0();
        java.lang.String t17 = c01.ia.t(f9Var.G);
        if (t17 == null) {
            t17 = "";
        }
        c16565x9bc03d4e.f231024p = t17;
        java.lang.String Q0 = f9Var.Q0();
        if (Q0 == null) {
            Q0 = "";
        }
        c16565x9bc03d4e.f231017f = Q0;
        c16565x9bc03d4e.f231025q = f9Var.mo78012x3fdd41df() / 1000;
        c16565x9bc03d4e.f231026r = caVar.f275356b;
        if (c16565x9bc03d4e.f231016e != 0) {
            pt0.e0 e0Var = pt0.f0.f439742b1;
            java.lang.String Q02 = f9Var.Q0();
            if (Q02 == null) {
                Q02 = "";
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17 = e0Var.l(Q02, f9Var.I0());
            if (l17 != null) {
                c16565x9bc03d4e.f231015d = l17.mo78013xfb85f7b0();
                java.lang.String c17 = bm5.d1.c(l17);
                c16565x9bc03d4e.f231018g = c17 != null ? c17 : "";
                c16565x9bc03d4e.f231019h = ti3.i.c(l17);
                if (c16565x9bc03d4e.f231015d == 34) {
                    c16565x9bc03d4e.f231021m = l17.S1();
                } else {
                    c16565x9bc03d4e.f231021m = l17.U1();
                }
            }
        }
        return c16565x9bc03d4e;
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c(wd5.b bVar, java.lang.String talker) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e = new com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e();
        r15.i j17 = bVar.j();
        if (j17 != null) {
            c16565x9bc03d4e.f231016e = j17.l();
            c16565x9bc03d4e.f231024p = j17.k();
            c16565x9bc03d4e.f231025q = j17.m161300x3fdd41df();
            c16565x9bc03d4e.f231020i = j17.m161301x3f6b0a02();
            c16565x9bc03d4e.f231017f = talker;
            if (j17.l() != 0 && (l17 = pt0.f0.f439742b1.l(talker, j17.l())) != null) {
                c16565x9bc03d4e.f231015d = l17.mo78013xfb85f7b0();
                java.lang.String c17 = bm5.d1.c(l17);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (c17 == null) {
                    c17 = "";
                }
                c16565x9bc03d4e.f231018g = c17;
                c16565x9bc03d4e.f231019h = ti3.i.c(l17);
                if (c16565x9bc03d4e.f231015d == 34) {
                    c16565x9bc03d4e.f231021m = l17.S1();
                } else {
                    c16565x9bc03d4e.f231021m = l17.U1();
                }
            }
            c16565x9bc03d4e.f231026r = j17.j();
        }
        return c16565x9bc03d4e;
    }
}
