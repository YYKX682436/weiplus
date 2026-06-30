package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class gg extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: z, reason: collision with root package name */
    public static boolean f216037z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f216038d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f216039e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f216040f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f216041g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f216042h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f216043i;

    /* renamed from: m, reason: collision with root package name */
    public long f216044m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 f216045n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea f216046o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f216047p;

    /* renamed from: q, reason: collision with root package name */
    public android.os.Bundle f216048q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f216049r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f216050s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f216051t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f216052u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f216053v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.dg f216054w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f216055x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f216056y;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.wf(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f216050s = true;
        this.f216054w = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.dg(this);
        this.f216055x = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eg.f215804d);
        this.f216056y = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.cg(activity));
    }

    public static void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg ggVar, boolean z17, boolean z18, boolean z19, p3325xe03a0797.p3326xc267989b.y0 y0Var, boolean z27, boolean z28, int i17, java.lang.Object obj) {
        boolean z29;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        in5.c cVar;
        boolean z37 = (i17 & 1) != 0 ? true : z17;
        boolean z38 = (i17 & 2) != 0 ? false : z18;
        boolean z39 = (i17 & 4) != 0 ? false : z19;
        p3325xe03a0797.p3326xc267989b.y0 coroutine = (i17 & 8) != 0 ? ggVar.m158345xefc66565() : y0Var;
        if ((i17 & 16) != 0) {
            cq.k1.a();
            z29 = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Of).mo141623x754a37bb()).r()).booleanValue();
        } else {
            z29 = z27;
        }
        boolean z47 = (i17 & 32) != 0 ? false : z28;
        ggVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coroutine, "coroutine");
        kd2.o0 o0Var = kd2.p1.N;
        if (!o0Var.a().B0(z38, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "addFloatBall: unable to add float ball");
            return;
        }
        if (ggVar.m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = ggVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            android.view.View view = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) a17).m63052x8f02c6c().f287834h;
            if (view != null && (c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) view.findViewById(com.p314xaae8f345.mm.R.id.m6e)) != null && (m82555x4905e9fa = c22801x87cbdc00.m82555x4905e9fa()) != null) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m82555x4905e9fa.getLayoutManager();
                java.lang.Integer num = null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
                if (c15415x74224fd8 != null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = m82555x4905e9fa.p0(c15415x74224fd8.w());
                    in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                    if (s0Var != null && (cVar = (in5.c) s0Var.f374658i) != null) {
                        num = java.lang.Integer.valueOf(cVar.h());
                    }
                    if ((num != null && num.intValue() == 15) || (num != null && num.intValue() == 19)) {
                        android.app.Activity m80379x76847179 = ggVar.m80379x76847179();
                        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
                        e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.nmp);
                        e4Var.c();
                        return;
                    }
                }
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ni(2);
        }
        if (!ggVar.f216043i) {
            ggVar.V6(z38, true, z29);
            ggVar.f216043i = true;
        }
        if (z37) {
            o0Var.a().C0(1);
        }
        if (z38) {
            o0Var.a().C0(3);
        }
        ggVar.f216042h = true;
        p3325xe03a0797.p3326xc267989b.l.d(coroutine, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xf(z39, z38, z29, ggVar, z47, z37, null), 3, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, ggVar.m158354x19263085().getClass().getName() + " addFloatBall step1: coroutine=" + coroutine + ", needTriggerBack=" + z37 + ", isPassive=" + z38 + ", addFromSwipe=" + z39);
    }

    public final boolean P6(boolean z17) {
        java.lang.Boolean bool;
        if (this.f216039e) {
            S6().p();
            if (!S6().s0() || this.f216051t) {
                return false;
            }
            this.f216051t = true;
            S6().g0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yf(this));
            return true;
        }
        boolean z18 = !this.f216041g && this.f216038d && this.f216049r && !kd2.p1.N.a().u();
        boolean z19 = !this.f216051t && (z17 || z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "checkBackPressedAnim: isActiveAddFloatBall=" + z17 + ", needExitAnimation=" + z19 + ", canAddPassiveFloatBall=" + z18 + ", activity=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class.getSimpleName());
        if (!z19) {
            return false;
        }
        if (!z17 && z18) {
            O6(this, false, true, false, null, false, false, 60, null);
        }
        ep1.m.a(m158354x19263085(), false);
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1 g1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1.class);
        if (g1Var != null) {
            g1Var.f215989e = false;
        }
        this.f216051t = true;
        do2.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f.f202579s;
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        android.util.Size a17 = cVar.a(resources, do2.e.f323613g);
        pv.g0 g0Var = (pv.g0) ((jz5.n) this.f216055x).mo141623x754a37bb();
        if (g0Var != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92();
            bool = java.lang.Boolean.valueOf(((ep1.k) g0Var).e(null, mo78514x143f1b92 != null ? mo78514x143f1b92.w() : null, new android.graphics.Point(a17.getWidth(), a17.getHeight()), null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zf(this)));
        } else {
            bool = null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            android.app.Activity activity = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class)).f216047p) {
                f216037z = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "resumeFromClickFloatBallAndBack:true");
            }
            this.f216047p = true;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x192630852 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.mo78578x8b18f126(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void Q6(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = rv6.getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
        if (c15415x74224fd8 == null) {
            return;
        }
        rv6.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bg(this, c15415x74224fd8, rv6));
    }

    public final void R6() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 h17;
        if (this.f216053v) {
            return;
        }
        kd2.o0 o0Var = kd2.p1.N;
        this.f216040f = o0Var.a().G;
        o0Var.a().f174665d.f174592t = false;
        o0Var.a().t0();
        this.f216053v = true;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.view.View m80380x71e92c1d = m80380x71e92c1d();
        android.view.ViewGroup viewGroup = m80380x71e92c1d instanceof android.view.ViewGroup ? (android.view.ViewGroup) m80380x71e92c1d : null;
        if (viewGroup == null || (h17 = hc2.f1.h(viewGroup)) == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = h17.m82555x4905e9fa().mo7946xf939df19();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (c22848x6ddd90cf == null || c22848x6ddd90cf.mo1894x7e414b06() <= 0) {
            return;
        }
        c22848x6ddd90cf.m8152xc67946d3(0, c22848x6ddd90cf.mo1894x7e414b06(), new jz5.l(30, 1));
    }

    public final kd2.w S6() {
        return (kd2.w) ((jz5.n) this.f216056y).mo141623x754a37bb();
    }

    public final void T6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2.class);
        if (f2Var != null) {
            pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.b2(f2Var));
        }
    }

    public final void U6(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.remove("key_anim_intent_id");
        }
        if (bundle != null) {
            bundle.remove("key_intent_animating_flag");
        }
        this.f216048q = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(boolean r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.V6(boolean, boolean, boolean):void");
    }

    public final void W6(boolean z17, boolean z18) {
        android.view.View findViewById = m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.g8o);
        if (findViewById != null) {
            int i17 = z17 ? 0 : z18 ? 4 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFloatBallNormalUIC", "setEnableAddFloatBall", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFloatBallNormalUIC", "setEnableAddFloatBall", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        kd2.p1.N.a().F = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        if (this.f216042h || !this.f216038d || !this.f216049r || kd2.p1.N.a().u()) {
            return;
        }
        O6(this, false, true, false, null, this.f216040f, false, 44, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di()) {
            android.content.Intent m158359x1e885992 = m158359x1e885992();
            this.f216039e = m158359x1e885992 != null && m158359x1e885992.getIntExtra("key_enter_group_type", 0) == 1;
            java.lang.String stringExtra = m158354x19263085().getIntent().getStringExtra("FLOAT_BALL_KEY");
            if (this.f216039e) {
                if (!(stringExtra == null || stringExtra.length() == 0)) {
                    S6().b(49, stringExtra);
                }
            }
        }
        java.lang.String stringExtra2 = !this.f216039e ? m158354x19263085().getIntent().getStringExtra("FLOAT_BALL_KEY") : null;
        this.f216038d = true;
        kd2.o0 o0Var = kd2.p1.N;
        if (o0Var.a().u()) {
            if ((stringExtra2 == null || stringExtra2.length() == 0) && !o0Var.a().N0()) {
                this.f216038d = false;
            }
            stringExtra2 = o0Var.a().f174665d.f174582g;
        }
        this.f216049r = o0Var.a().L0(m158354x19263085());
        this.f216044m = m158359x1e885992().getLongExtra("KEY_ENTER_PLAYING_FEED_ID", 0L);
        if (stringExtra2 == null) {
            o0Var.a().t0();
            stringExtra2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).nk();
            this.f216038d = false;
        }
        if (this.f216038d && this.f216044m == 0) {
            this.f216044m = o0Var.a().F0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "initFinderFloatBall key: %s", stringExtra2);
        if ((this.f216049r && this.f216038d) || !o0Var.a().u()) {
            o0Var.a().b(32, stringExtra2);
        }
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            if ((stringExtra2.length() == 0) || this.f216039e) {
                return;
            }
            this.f216052u = true;
            pv.g0 g0Var = (pv.g0) ((jz5.n) this.f216055x).mo141623x754a37bb();
            if (g0Var != null) {
                android.content.Intent intent = m158354x19263085().getIntent();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92();
                ((ep1.k) g0Var).c(intent, mo78514x143f1b92 != null ? mo78514x143f1b92.w() : null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fg(), this.f216054w);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        kd2.p1.N.a().P0();
        S6().o0();
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.r0();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        super.mo13982x7cf2e371();
        kd2.p1.N.a().p();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("FLOAT_BALL_KEY") : null;
        this.f216038d = !(stringExtra == null || stringExtra.length() == 0);
        this.f216049r = kd2.p1.N.a().L0(m158354x19263085());
        if (intent != null) {
            this.f216044m = intent.getLongExtra("KEY_ENTER_PLAYING_FEED_ID", 0L);
        }
        this.f216050s = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onNewIntent %s", java.lang.Boolean.valueOf(this.f216052u));
        if (this.f216038d && (m158354x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) && !this.f216039e) {
            this.f216052u = true;
            pv.g0 g0Var = (pv.g0) ((jz5.n) this.f216055x).mo141623x754a37bb();
            if (g0Var != null) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92();
                ((ep1.k) g0Var).c(intent, mo78514x143f1b92 != null ? mo78514x143f1b92.w() : null, null, this.f216054w);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        if (!this.f216043i) {
            V6(true, false, false);
        }
        if (this.f216053v) {
            kd2.p1.N.a().z();
            if (this.f216039e) {
                S6().z();
            }
        }
        kd2.p1 a17 = kd2.p1.N.a();
        gp1.v vVar = a17.f174669h;
        if (vVar != null) {
            vVar.o0(a17.f174665d);
        }
        this.f216053v = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        gp1.v Bi;
        boolean z17 = false;
        if (this.f216049r && this.f216038d && this.f216050s) {
            if (ep1.m.h(m158359x1e885992())) {
                ep1.m.a(m158354x19263085(), false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onResume %s", java.lang.Boolean.valueOf(this.f216052u));
            if (!this.f216052u) {
                R6();
            }
        } else if (!f216037z) {
            kd2.p1.T0(kd2.p1.N.a(), true, false, false, 4, null);
        }
        if (!this.f216038d && !f216037z && (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) != null) {
            Bi.k0();
        }
        this.f216050s = false;
        if (!this.f216038d) {
            kd2.o0 o0Var = kd2.p1.N;
            if (o0Var.a().N0() && o0Var.a().L0(m158354x19263085())) {
                kd2.q0 q0Var = o0Var.a().f388320x;
                if (q0Var != null && q0Var.f388350r) {
                    z17 = true;
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onResume: remove exceptional floating ball");
                    R6();
                }
            }
        }
        if (this.f216039e) {
            S6().x();
        }
    }
}
