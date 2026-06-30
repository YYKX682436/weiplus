package fn2;

/* loaded from: classes10.dex */
public final class l0 implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.m0 f345838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f345839e;

    public l0(fn2.m0 m0Var, java.util.List list) {
        this.f345838d = m0Var;
        this.f345839e = list;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        fn2.m0 m0Var = this.f345838d;
        m0Var.f345854o = i17;
        fn2.t0 t0Var = m0Var.f345853n;
        fn2.h1 h1Var = t0Var != null ? (fn2.h1) t0Var.f345935g.get(i17) : null;
        java.lang.Integer num = (java.lang.Integer) kz5.n0.a0(this.f345839e, i17);
        if (num != null) {
            int intValue = num.intValue();
            if (h1Var != null) {
                p3325xe03a0797.p3326xc267989b.y0 y0Var = m0Var.f345847e;
                sf2.d3 controller = m0Var.f345846d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
                fn2.q1 dataSource = m0Var.f345858s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
                if (!h1Var.f345806m) {
                    h1Var.f345806m = true;
                    h1Var.f345803g = controller;
                    h1Var.f345807n = java.lang.Integer.valueOf(intValue);
                    h1Var.f345804h = dataSource;
                    h1Var.f345802f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv(h1Var, controller, y0Var, new fn2.u0(h1Var, intValue));
                    android.content.Context context = h1Var.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    bm2.k7 k7Var = new bm2.k7(context, controller, intValue, h1Var.f345801e, y0Var, h1Var.f345800d);
                    h1Var.f345805i = k7Var;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = h1Var.f345801e;
                    c1163xf1deaba4.mo7960x6cab2c8d(k7Var);
                    c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext()));
                    c1163xf1deaba4.setOnTouchListener(new zl2.k5(c1163xf1deaba4));
                    ym5.a1.g(c1163xf1deaba4, new fn2.v0(h1Var, intValue));
                    if (intValue != 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar = h1Var.f345802f;
                        if (dvVar != null) {
                            fn2.w0 w0Var = new fn2.w0(intValue, dataSource, h1Var, null);
                            fn2.x0 x0Var = new fn2.x0(h1Var);
                            dvVar.f199695o = w0Var;
                            dvVar.f199696p = x0Var;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar2 = h1Var.f345802f;
                        if (dvVar2 != null) {
                            fn2.y0 y0Var2 = new fn2.y0(h1Var, intValue, dataSource, null);
                            fn2.z0 z0Var = new fn2.z0(h1Var);
                            dvVar2.f199697q = y0Var2;
                            dvVar2.f199698r = z0Var;
                        }
                    }
                    fn2.h1.c(h1Var, y0Var, true, false, 4, null);
                }
            }
            if (h1Var != null) {
                fn2.h1 h1Var2 = h1Var.m129815x9ef90e22() ? h1Var : null;
                if (h1Var2 != null) {
                    h1Var2.m129817xd5cfa796(false);
                    fn2.h1.c(h1Var2, m0Var.f345847e, false, false, 6, null);
                }
            }
        }
        m0Var.c();
    }
}
