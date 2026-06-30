package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.c2.class)
/* loaded from: classes9.dex */
public class gl extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.c2, com.p314xaae8f345.mm.p944x882e457a.u0, xg3.h0 {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f280641n;

    /* renamed from: e, reason: collision with root package name */
    public int f280642e;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f280645h;

    /* renamed from: m, reason: collision with root package name */
    public long f280647m;

    /* renamed from: f, reason: collision with root package name */
    public int f280643f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f280644g = 0;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f280646i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.cl(this);

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).n0(this, android.os.Looper.getMainLooper());
        c01.d9.e().a(100017, this);
        c01.d9.e().a(10, this);
        this.f280644g = 0;
        this.f280645h = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignallingComponent", "[onComponentUnInstall] hash:%s", this);
        this.f280646i.mo50302x6b17ad39(null);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).za(this);
        c01.d9.e().q(100017, this);
        c01.d9.e().q(10, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).za(this);
        c01.d9.e().q(100017, this);
        c01.d9.e().q(10, this);
        int i17 = this.f280644g;
        boolean z17 = true;
        if (i17 != 1 && i17 != 3) {
            z17 = false;
        }
        if (z17) {
            n0(2);
        }
        this.f280644g = 0;
        this.f280645h = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignallingComponent", "[onComponentInstall] hash:%s", this);
        c01.d9.e().g(new c01.ra(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.dl(this), null));
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        yb5.d dVar = this.f280113d;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SignallingComponent", "[onNotifyChange] mChattingContext is null!");
            return;
        }
        if (dVar.x().equals(l0Var.f535943a) && "insert".equals(l0Var.f535944b)) {
            java.util.ArrayList arrayList = l0Var.f535945c;
            if (arrayList.size() <= 0 || ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(0)).A0() != 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignallingComponent", "summerbadcr oreh onNotifyChange receive a new msg flag[%d], msgSeq[%d]", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(0)).w0()), java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(0)).F0()));
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f280647m = java.lang.System.currentTimeMillis();
        }
    }

    public final void m0() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe peVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f280113d.f542241c.a(sb5.z0.class));
        java.lang.String charSequence = (peVar.f281225p.f290509i.getVisibility() != 0 || peVar.f281225p.f290509i.getText() == null) ? "" : peVar.f281225p.f290509i.getText().toString();
        this.f280645h = charSequence;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignallingComponent", "clearSubTitle!");
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f280113d.f542241c.a(sb5.z0.class))).y0("");
    }

    public void n0(int i17) {
        java.lang.Boolean valueOf;
        java.util.List list;
        if (this.f280113d == null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SignallingComponent", "[doDirectSend] mChattingContext is null!", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            return;
        }
        if (this.f280644g == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SignallingComponent", "doDirectSend same chatStatus :%s, return!", java.lang.Integer.valueOf(i17));
            return;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("DisableSendTyping", 0) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SignallingComponent", "doDirectSend disable send typing, return!");
            return;
        }
        yb5.d dVar = this.f280113d;
        java.lang.String x17 = dVar.x();
        if (this.f280113d == null) {
            valueOf = java.lang.Boolean.FALSE;
        } else {
            valueOf = java.lang.Boolean.valueOf((!com.p314xaae8f345.mm.p2621x8fb0427b.z3.O4(x17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(x17) || this.f280113d.u().k2()) ? false : true);
        }
        if (!valueOf.booleanValue() || dVar.x().equals(c01.z1.r())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignallingComponent", "doDirectSend typing  not support");
            return;
        }
        boolean z18 = dVar.C() || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).f280287s;
        int intValue = ((java.lang.Integer) c01.d9.g().b(35, 10)).intValue();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(dVar.x());
        if (intValue == -2) {
            if (z18 && (i17 == 1 || i17 == 2)) {
                return;
            }
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20055xf698dbbb()) != 1) {
                c01.d9.e().g(new com.p314xaae8f345.mm.p957x53236a1b.g0(111, linkedList, kk.u.d(i17)));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignallingComponent", "sendTyping lastChatStatus:%s , chatStatus:%s", java.lang.Integer.valueOf(this.f280644g), java.lang.Integer.valueOf(i17));
            this.f280644g = i17;
            c01.d9.e().g(new com.p314xaae8f345.mm.p957x53236a1b.k1(dVar.x(), i17));
            return;
        }
        if (this.f280647m == 0 && (list = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ah) ((sb5.e1) this.f280113d.f542241c.a(sb5.e1.class))).f280156e) != null && list.size() > 0) {
            this.f280647m = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(0)).mo78012x3fdd41df();
        }
        long j17 = this.f280647m;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        if ((intValue == -1 || currentTimeMillis > intValue * 1000) && (i17 == 1 || i17 == 3)) {
            long j18 = currentTimeMillis / 1000;
            return;
        }
        if ((intValue == -1 || currentTimeMillis > intValue * 1500) && (i17 == 2 || i17 == 4)) {
            long j19 = currentTimeMillis / 1000;
            return;
        }
        long j27 = currentTimeMillis / 1000;
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20055xf698dbbb()) != 1) {
            c01.d9.e().g(new com.p314xaae8f345.mm.p957x53236a1b.g0(111, linkedList, kk.u.d(i17)));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignallingComponent", "sendTyping lastChatStatus:%s , chatStatus:%s", java.lang.Integer.valueOf(this.f280644g), java.lang.Integer.valueOf(i17));
        this.f280644g = i17;
        c01.d9.e().g(new com.p314xaae8f345.mm.p957x53236a1b.k1(dVar.x(), i17));
    }

    public void o0() {
        if (this.f280642e == -2) {
            c01.d9.e().g(new c01.ra(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.el(this), null));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p957x53236a1b.g0 g0Var;
        java.lang.String str2;
        int a17;
        yb5.d dVar = this.f280113d;
        if (dVar == null) {
            return;
        }
        dVar.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignallingComponent", "scene.getType:%s errType:%s, errCode:%s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (10 == m1Var.mo808xfb85f7b0() || 100017 == m1Var.mo808xfb85f7b0()) {
            boolean z17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) this.f280113d.f542241c.a(sb5.u1.class))).f280828f;
            ((sb5.u1) this.f280113d.f542241c.a(sb5.u1.class)).getClass();
            boolean z18 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) this.f280113d.f542241c.a(sb5.u1.class))).f280834o;
            if (z18 || z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignallingComponent", "[onSceneEnd] [%s|%s|%s]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(z18));
                return;
            }
            if (i17 == 0 && i18 == 0) {
                if (100017 == m1Var.mo808xfb85f7b0()) {
                    com.p314xaae8f345.mm.p957x53236a1b.k1 k1Var = (com.p314xaae8f345.mm.p957x53236a1b.k1) m1Var;
                    java.lang.String str3 = k1Var.f152896f;
                    if (str3 != null && str3.equals(this.f280113d.x())) {
                        a17 = k1Var.f152897g;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignallingComponent", "typingSend: status=" + a17);
                    }
                    a17 = 0;
                } else {
                    if (10 == m1Var.mo808xfb85f7b0() && (str2 = (g0Var = (com.p314xaae8f345.mm.p957x53236a1b.g0) m1Var).f152857f) != null && str2.equals(this.f280113d.x())) {
                        byte[] bArr = g0Var.f152858g;
                        if (bArr == null || bArr.length != 4) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SignallingComponent", "unknown directsend op");
                            return;
                        }
                        a17 = kk.u.a(bArr, 0);
                    }
                    a17 = 0;
                }
                if (a17 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SignallingComponent", "unknown typingSend status");
                    return;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f280646i;
                if (a17 == 1) {
                    f280641n = true;
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f280113d.f542241c.a(sb5.z0.class))).A0(com.p314xaae8f345.mm.R.C30867xcad56011.b67);
                    m0();
                    n3Var.mo50311x7ab51103(new android.os.Message(), 15000L);
                    new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5882x4fece4a0().e();
                    return;
                }
                if (a17 == 3) {
                    f280641n = true;
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f280113d.f542241c.a(sb5.z0.class))).A0(com.p314xaae8f345.mm.R.C30867xcad56011.b67);
                    m0();
                    n3Var.mo50311x7ab51103(new android.os.Message(), 15000L);
                    return;
                }
                f280641n = false;
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f280113d.f542241c.a(sb5.z0.class))).C();
                p0();
                yb5.d dVar2 = this.f280113d;
                if (dVar2.f542260v) {
                    dVar2.f542261w = false;
                    dVar2.J();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SignallingComponent", "onSceneEnd, current ChattingUI lose focus!");
                    this.f280113d.f542261w = true;
                }
            }
        }
    }

    public final void p0() {
        java.lang.String str = this.f280645h;
        if (str == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignallingComponent", "recoverSubTitle!");
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f280113d.f542241c.a(sb5.z0.class))).y0(this.f280645h);
        this.f280645h = "";
    }

    public void q0() {
        c01.d9.e().g(new c01.ra(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fl(this), null));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        p0();
    }
}
