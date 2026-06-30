package pn2;

/* loaded from: classes3.dex */
public final class s implements pn2.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f438545d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f438546e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f438547f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f438548g;

    /* renamed from: h, reason: collision with root package name */
    public pn2.b f438549h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f438550i;

    /* renamed from: m, reason: collision with root package name */
    public int f438551m;

    /* renamed from: n, reason: collision with root package name */
    public final int f438552n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f438553o;

    /* renamed from: p, reason: collision with root package name */
    public final int f438554p;

    /* renamed from: q, reason: collision with root package name */
    public final int f438555q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f438556r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f438557s;

    /* renamed from: t, reason: collision with root package name */
    public int f438558t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f438559u;

    public s(android.content.Context context, gk2.e liveData, qo0.c statusMonitor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f438545d = context;
        this.f438546e = liveData;
        this.f438547f = statusMonitor;
        this.f438548g = "FinderLiveLotteryBubblePresenter";
        this.f438550i = "";
        this.f438552n = 10;
        ae2.in inVar = ae2.in.f85221a;
        this.f438554p = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85324k2).mo141623x754a37bb()).r()).intValue();
        this.f438555q = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85334l2).mo141623x754a37bb()).r()).intValue();
        this.f438556r = "LOTTERY_BUBBLE_CLOSE_TAG";
        this.f438557s = new pn2.h(this);
        this.f438559u = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("LiveLotteryBubble::Timer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new pn2.n(this), true);
    }

    public static final pn2.d0 c(pn2.s sVar, km2.z lotteryInfoWrapper) {
        int i17;
        int i18;
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.cz1 cz1Var3;
        r45.cz1 cz1Var4;
        sVar.getClass();
        pn2.d0 d0Var = new pn2.d0(false, false, 0, 0, false, 31, null);
        boolean z17 = false;
        java.lang.String str = null;
        java.lang.String m75945x2fec8307 = (lotteryInfoWrapper == null || (cz1Var4 = lotteryInfoWrapper.f390765d) == null) ? null : cz1Var4.m75945x2fec8307(0);
        gk2.e eVar = sVar.f438546e;
        km2.z zVar = ((on2.z2) eVar.a(on2.z2.class)).f428625m;
        if (zVar != null && (cz1Var3 = zVar.f390765d) != null) {
            str = cz1Var3.m75945x2fec8307(0);
        }
        boolean z18 = true;
        if (((on2.z2) eVar.a(on2.z2.class)).f428625m != null) {
            if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, str)) {
                on2.z2 z2Var = (on2.z2) eVar.a(on2.z2.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
                pm0.v.X(new on2.x2(lotteryInfoWrapper, z2Var));
                km2.z zVar2 = ((on2.z2) eVar.a(on2.z2.class)).f428625m;
                i17 = (zVar2 == null || (cz1Var2 = zVar2.f390765d) == null) ? 0 : cz1Var2.m75939xb282bd08(8);
                km2.z zVar3 = ((on2.z2) eVar.a(on2.z2.class)).f428625m;
                i18 = zVar3 != null ? zVar3.f390762a : 0;
                if (i17 == i18) {
                    z18 = false;
                } else {
                    if (i18 != 1 && (i18 != 2 || (i17 != 3 && i17 != 4))) {
                        z18 = false;
                    }
                    boolean z19 = z18;
                    z18 = false;
                    z17 = z19;
                }
                d0Var.f438518a = z17;
                d0Var.f438519b = z18;
                d0Var.f438521d = i17;
                d0Var.f438520c = i18;
                return d0Var;
            }
        }
        on2.z2 z2Var2 = (on2.z2) eVar.a(on2.z2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
        pm0.v.X(new on2.u2(z2Var2, lotteryInfoWrapper));
        km2.z zVar4 = ((on2.z2) eVar.a(on2.z2.class)).f428625m;
        int m75939xb282bd08 = (zVar4 == null || (cz1Var = zVar4.f390765d) == null) ? 0 : cz1Var.m75939xb282bd08(8);
        km2.z zVar5 = ((on2.z2) eVar.a(on2.z2.class)).f428625m;
        int i19 = zVar5 != null ? zVar5.f390762a : 0;
        sVar.f438551m = 0;
        i17 = m75939xb282bd08;
        i18 = i19;
        z17 = true;
        d0Var.f438518a = z17;
        d0Var.f438519b = z18;
        d0Var.f438521d = i17;
        d0Var.f438520c = i18;
        return d0Var;
    }

    public final void f() {
        boolean z17;
        dk2.xf m57666x7e07ad96;
        java.lang.String str;
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.fz1 fz1Var;
        gk2.e eVar = this.f438546e;
        km2.z zVar = ((on2.z2) eVar.a(on2.z2.class)).f428625m;
        if (zVar == null || (cz1Var2 = zVar.f390765d) == null || (fz1Var = (r45.fz1) cz1Var2.m75936x14adae67(12)) == null || !fz1Var.m75933x41a8a7f2(2)) {
            z17 = true;
        } else {
            java.lang.String m75945x2fec8307 = fz1Var.m75945x2fec8307(1);
            boolean z18 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0;
            android.content.Context context = this.f438545d;
            db5.t7.m(context, z18 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.drx) : fz1Var.m75945x2fec8307(1));
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438548g, "customerOpenCard checkEnableOpenCard false!");
            return;
        }
        km2.z zVar2 = ((on2.z2) eVar.a(on2.z2.class)).f428625m;
        boolean z19 = zVar2 != null && zVar2.f390762a == 3;
        qo0.c cVar = this.f438547f;
        if (z19) {
            v();
            qo0.b bVar = qo0.b.f446926o3;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_LOTTERY_CARD_SHOW_STATUS", false);
            cVar.mo46557x60d69242(bVar, bundle);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
        if (k0Var == null || (m57666x7e07ad96 = k0Var.m57666x7e07ad96()) == null) {
            return;
        }
        km2.z zVar3 = ((on2.z2) eVar.a(on2.z2.class)).f428625m;
        if (zVar3 == null || (cz1Var = zVar3.f390765d) == null || (str = cz1Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        ((dk2.r4) m57666x7e07ad96).N(str, null, new pn2.i(this));
    }

    public final void g(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438548g, str + ":endTimer remainTimeSecond:" + this.f438558t + ", timerLotteryId:" + this.f438550i);
        this.f438559u.d();
    }

    public final int h(boolean z17, r45.cz1 cz1Var, int i17) {
        int i18 = i17 * 1000;
        if (z17) {
            return i18;
        }
        int e17 = c01.id.e();
        int m75939xb282bd08 = e17 - (cz1Var != null ? cz1Var.m75939xb282bd08(2) : e17);
        if (m75939xb282bd08 <= 0) {
            return i18;
        }
        if (1 <= m75939xb282bd08 && m75939xb282bd08 < i17) {
            return (i17 - m75939xb282bd08) * 1000;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438548g, "getBubbleStayDuration serverTime:" + e17 + ",finishDuration:" + m75939xb282bd08);
        return 0;
    }

    public boolean i() {
        r45.gz1 gz1Var;
        km2.z zVar = ((on2.z2) this.f438546e.a(on2.z2.class)).f428625m;
        r45.cz1 cz1Var = zVar != null ? zVar.f390765d : null;
        boolean z17 = (cz1Var == null || (gz1Var = (r45.gz1) cz1Var.m75936x14adae67(14)) == null || gz1Var.m75939xb282bd08(0) != 1) ? false : true;
        ae2.in inVar = ae2.in.f85221a;
        return z17 && (((java.lang.Number) ae2.in.X6.r()).intValue() == 1);
    }

    public void m() {
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = this.f438545d;
        gk2.e eVar = this.f438546e;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573359ec5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = this.f438545d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573357ec3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        if (r4Var.B(context, eVar, string, string2, new pn2.j(this))) {
            return;
        }
        p();
    }

    @Override // fs2.a
    /* renamed from: onAttach */
    public void mo56536x3b13c504(java.lang.Object obj) {
        pn2.b callback = (pn2.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438548g, "onAttach");
        this.f438549h = callback;
        pn2.c0 c0Var = (pn2.c0) callback;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c0Var.f438510m, "initView!");
        android.view.View t17 = c0Var.t(com.p314xaae8f345.mm.R.id.f566243f84);
        if (t17 != null) {
            t17.setOnClickListener(new pn2.v(c0Var));
        }
        c0Var.L();
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438548g, "onDetach");
        pn2.b bVar = this.f438549h;
        if (bVar != null) {
            ((pn2.c0) bVar).G();
        }
        this.f438549h = null;
        g("onDetach");
        ((ku5.t0) ku5.t0.f394148d).A(this.f438556r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        xu2.u uVar;
        xu2.v vVar;
        f();
        gk2.e eVar = this.f438546e;
        boolean M7 = ((mm2.c1) eVar.a(mm2.c1.class)).M7();
        qo0.c cVar = this.f438547f;
        if (M7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
            if (k0Var != null && (uVar = (xu2.u) k0Var.mo57682x2a5e9229(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
                vVar.a();
                vVar.c(2019);
            }
        }
        if (cVar.mo11219xd0598cf8() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409135r, "");
            return;
        }
        if (cVar.mo11219xd0598cf8() == 0) {
            pn2.b bVar = this.f438549h;
            ie2.a aVar = bVar instanceof ie2.a ? (ie2.a) bVar : null;
            int i17 = (aVar != null && aVar.x()) == true ? 2 : 1;
            km2.z zVar = ((on2.z2) eVar.a(on2.z2.class)).f428625m;
            r45.cz1 cz1Var = zVar != null ? zVar.f390765d : null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (cz1Var == null || (str = cz1Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            jSONObject.put("lotteryid", str);
            jSONObject.put("is_flash_pic", i() ? 1 : 0);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.ek((ml2.r0) c17, ml2.p4.f409328f, (cz1Var == null || (m75945x2fec8307 = cz1Var.m75945x2fec8307(4)) == null) ? "" : m75945x2fec8307, null, i17, jSONObject, 4, null);
        }
    }

    public final void q(int i17) {
        g("onTimerEnd");
        km2.z zVar = ((on2.z2) this.f438546e.a(on2.z2.class)).f428625m;
        if (zVar != null && zVar.f390762a == 1) {
            s(true, false, 2, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0513  */
    /* JADX WARN: Type inference failed for: r12v21, types: [int] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(boolean r19, boolean r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn2.s.s(boolean, boolean, int, boolean):void");
    }

    public final void v() {
        dk2.xf m57666x7e07ad96;
        java.lang.String str;
        r45.cz1 cz1Var;
        qo0.c cVar = this.f438547f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
        if (k0Var == null || (m57666x7e07ad96 = k0Var.m57666x7e07ad96()) == null) {
            return;
        }
        km2.z zVar = ((on2.z2) ((mm2.c1) this.f438546e.a(mm2.c1.class)).m147920xbba4bfc0(on2.z2.class)).f428625m;
        if (zVar == null || (cz1Var = zVar.f390765d) == null || (str = cz1Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        ((dk2.r4) m57666x7e07ad96).N(str, null, new pn2.q(this));
    }
}
