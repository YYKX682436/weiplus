package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

@yn.c(m177365x976763e5 = sb5.f.class)
/* loaded from: classes11.dex */
public class a extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.f, r01.w2, l75.z0, xg3.h0 {
    public hr1.a F;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d N;
    public boolean P;
    public final java.lang.Runnable Q;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b f280276e;

    /* renamed from: f, reason: collision with root package name */
    public s01.h f280277f;

    /* renamed from: g, reason: collision with root package name */
    public s01.a0 f280278g;

    /* renamed from: h, reason: collision with root package name */
    public qk.o f280279h;

    /* renamed from: i, reason: collision with root package name */
    public qk.o f280280i;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f280285q;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.RelativeLayout f280291w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f280292x;

    /* renamed from: z, reason: collision with root package name */
    public int f280294z;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21392x1bd9268c f280281m = null;

    /* renamed from: n, reason: collision with root package name */
    public zq1.v f280282n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f280283o = null;

    /* renamed from: p, reason: collision with root package name */
    public long f280284p = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f280286r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f280287s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f280288t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f280289u = false;

    /* renamed from: v, reason: collision with root package name */
    public long f280290v = -1;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f280293y = null;
    public r45.j16 A = null;
    public boolean B = false;
    public long C = 0;
    public android.view.View D = null;
    public final java.util.concurrent.atomic.AtomicBoolean E = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.j0 G = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a0(this);
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.e5 H = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.c0(this);
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public final s01.l f280275J = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.d0(this);
    public boolean K = false;
    public boolean L = false;
    public final r01.v M = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.f0(this);

    public a() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.N = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5173xdad2a7f8>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.biz.BizComponent$6
            {
                this.f39173x3fe91575 = -1315546616;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5173xdad2a7f8 c5173xdad2a7f8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "AppMsgRelatedInfoUpdateEvent scene %d", java.lang.Integer.valueOf(c5173xdad2a7f8.f135522g.f87830a));
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a.this.f280113d.J();
                return false;
            }
        };
        this.P = false;
        this.Q = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.b0(this);
    }

    public static void m0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar) {
        aVar.getClass();
        if (bVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f299423f)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", bVar.f299423f);
        intent.putExtra("Kdel_from", 0);
        intent.putExtra("preUsername", bVar.f299423f);
        intent.putExtra("preChatName", bVar.f299423f);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_IsBizAuthor", true);
        j45.l.j(aVar.f280113d.g(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public int A0() {
        yb5.d dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b;
        yb5.d dVar2 = this.f280113d;
        int intExtra = (dVar2 == null || dVar2.g() == null || this.f280113d.g().getIntent() == null) ? 0 : this.f280113d.g().getIntent().getIntExtra("specific_chat_from_scene", 0);
        return (intExtra != 0 || (dVar = this.f280113d) == null || (abstractC21611x7536149b = dVar.f542250l) == null || abstractC21611x7536149b.m7436x8619eaa0() == null) ? intExtra : this.f280113d.f542250l.m7436x8619eaa0().getInt("specific_chat_from_scene", 0);
    }

    public final hr1.a B0() {
        hr1.a aVar = this.F;
        if (aVar != null) {
            return aVar;
        }
        java.lang.String x17 = this.f280113d.x();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
            return null;
        }
        if (G0()) {
            this.F = yq1.u0.Bi().y0(x17);
        } else if (H0()) {
            this.F = yq1.u0.Ui().y0(x17);
        }
        return this.F;
    }

    public java.lang.String C0() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f449680i.f449687b;
        if (bVar != null && bVar.f299430p && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f299423f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "bizAcctResp is valid, biz: %s, acctResp.interactive_identity: %s, acctResp.username: %s", bVar.f299422e, java.lang.Boolean.valueOf(bVar.f299430p), bVar.f299423f);
            return bVar.f299423f;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar2 = ((r01.l1) i95.n0.c(r01.l1.class)).f449681m.f449687b;
        if (bVar2 == null || !bVar2.f299430p || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar2.f299423f)) {
            return "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "photoAcctResp is valid, photo: %s, photoAcctResp.interactive_identity: %s, photoAcctResp.username: %s", bVar2.f299422e, java.lang.Boolean.valueOf(bVar2.f299430p), bVar2.f299423f);
        return bVar2.f299423f;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        if (this.f280113d.u().r2() && this.f280113d.u().k2() && this.f280113d.u().r2() && this.f280113d.u().k2()) {
            r01.q3.Zi().f449755d = this.f280113d.g().getIntent().getStringExtra("uinserve_search_click_id");
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String x17 = this.f280113d.x();
            ((qv.o) u2Var).getClass();
            if (!r01.z.g(x17)) {
                int m78386x9c19e6d7 = this.f280113d.f542250l.m78386x9c19e6d7("specific_chat_from_scene", 0);
                if (this.A == null) {
                    this.A = new r45.j16();
                }
                this.A.f459033h = this.f280113d.f542250l.m78386x9c19e6d7("Main_IndexInSessionList", 0);
                this.A.f459031f = this.f280113d.f542250l.m78386x9c19e6d7("Main_UnreadCount", 0);
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f280285q;
                if (f9Var != null) {
                    this.A.f459032g = f9Var.mo78013xfb85f7b0();
                    r45.j16 j16Var = this.A;
                    if (j16Var.f459031f > 0) {
                        j16Var.f459030e = ((int) (this.f280284p - this.f280285q.mo78012x3fdd41df())) / 1000;
                    }
                }
                r01.r1 Zi = r01.q3.Zi();
                java.lang.String x18 = this.f280113d.x();
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f280285q;
                r45.j16 j16Var2 = this.A;
                Zi.getClass();
                ((ku5.t0) ku5.t0.f394148d).g(new r01.p1(Zi, j16Var2, x18, f9Var2, m78386x9c19e6d7));
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.j4(this.f280113d.x())) {
            ((ku5.t0) ku5.t0.f394148d).b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.o(this), "ReportEnterNotifyMessage");
        }
        if (G0()) {
            yq1.u0.Di().m(this.f280113d.x(), true);
            rk.e wi6 = ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi();
            java.lang.String str = yq1.u0.Ni().y0(this.f280113d.x()).f66480x114ef53e;
            ((gr1.h) wi6).c(str != null ? str : "", 0);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).f280796e;
            hr1.a y07 = yq1.u0.Bi().y0(this.f280113d.t());
            if (c19666xfd6e2f33 != null) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 m75443xe6828c7b = c19666xfd6e2f33.m75443xe6828c7b();
                if (m75443xe6828c7b != null) {
                    m75443xe6828c7b.mo75349x4a374107(false);
                    m75443xe6828c7b.j();
                }
                if (y07 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f66212x21f9b213)) {
                    return;
                }
                c19666xfd6e2f33.m1(this.f280113d.t(), java.lang.Boolean.TRUE, y07.f66212x21f9b213 + ":");
                return;
            }
            return;
        }
        if (H0()) {
            yq1.u0.Vi().m(this.f280113d.x(), true);
            rk.e wi7 = ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi();
            java.lang.String str2 = yq1.u0.Zi().z0(this.f280113d.x()).f66480x114ef53e;
            ((gr1.h) wi7).c(str2 != null ? str2 : "", 5);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f332 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).f280796e;
            hr1.a y08 = yq1.u0.Ui().y0(this.f280113d.t());
            if (c19666xfd6e2f332 != null) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 m75443xe6828c7b2 = c19666xfd6e2f332.m75443xe6828c7b();
                if (m75443xe6828c7b2 != null) {
                    m75443xe6828c7b2.mo75349x4a374107(false);
                    m75443xe6828c7b2.j();
                }
                if (y08 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y08.f66212x21f9b213)) {
                    return;
                }
                c19666xfd6e2f332.m1(this.f280113d.t(), java.lang.Boolean.TRUE, y08.f66212x21f9b213 + ":");
            }
        }
    }

    public java.lang.String E0() {
        if (!this.f280286r) {
            if (this.f280113d.u() == null) {
                return null;
            }
            return this.f280113d.u().P0();
        }
        if (this.f280287s) {
            s01.h hVar = this.f280277f;
            if (hVar == null) {
                return null;
            }
            return hVar.f69171x736d1fa8;
        }
        s01.a0 a0Var = this.f280278g;
        if (a0Var == null) {
            return null;
        }
        return a0Var.f65841xdde069b;
    }

    public final void F0() {
        com.p314xaae8f345.mm.ui.C21392x1bd9268c c21392x1bd9268c = this.f280281m;
        if (c21392x1bd9268c == null || c21392x1bd9268c.getVisibility() != 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "hideLiveBizSessionTipsBar");
        this.f280281m.setVisibility(8);
        com.p314xaae8f345.mm.ui.ga e17 = this.f280113d.e();
        if (e17.F() != null) {
            e17.F().G(1.0f);
        }
    }

    public boolean G0() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.E3(this.f280113d.x());
    }

    public boolean H0() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.G3(this.f280113d.x());
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        s0();
    }

    public final void I0() {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject jSONObject = null;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f280113d.x())) {
            this.f280280i = null;
            return;
        }
        vh0.g1 g1Var = (vh0.g1) i95.n0.c(vh0.g1.class);
        java.lang.String x17 = this.f280113d.x();
        vh0.i2 i2Var = (vh0.i2) g1Var;
        i2Var.getClass();
        java.lang.String Ni = i2Var.Ni("IntelligenceExternalInfo");
        if (Ni == null || (optJSONObject = new org.json.JSONObject(Ni).optJSONObject(x17)) == null) {
            java.lang.String str = (java.lang.String) i2Var.Ri().f536008e.a(x17);
            if (str != null) {
                jSONObject = new org.json.JSONObject(str);
            }
        } else {
            jSONObject = optJSONObject;
        }
        qk.o oVar = new qk.o();
        oVar.f66748xdec927b = this.f280113d.x();
        oVar.f66740x26b3182a = jSONObject != null ? jSONObject.toString() : "{}";
        this.f280280i = oVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        qk.o oVar;
        if (this.f280288t && (oVar = this.f280279h) != null && oVar.Q0() && this.f280289u) {
            this.f280113d.q().mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.m(this));
        }
        this.B = false;
    }

    public final void J0() {
        this.I = false;
        if (this.f280113d.u() == null || !this.f280113d.u().k2()) {
            return;
        }
        this.I = true;
        r01.q3.Ai().c(this.f280113d.u().d1(), null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        this.K = false;
        s0();
        android.widget.RelativeLayout relativeLayout = this.f280291w;
        if (relativeLayout == null || relativeLayout.getVisibility() == 8) {
            return;
        }
        this.f280291w.setVisibility(8);
    }

    public boolean K0() {
        if (!G0() && !H0()) {
            return false;
        }
        hr1.a B0 = B0();
        if (B0 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(B0.f66212x21f9b213)) {
            yb5.d dVar = this.f280113d;
            dVar.f542250l.mo78695xbf7c1df6(dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572270n55));
            return true;
        }
        yb5.d dVar2 = this.f280113d;
        dVar2.f542250l.mo78695xbf7c1df6(dVar2.u().g2());
        return true;
    }

    @Override // r01.w2
    public void K1(int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 1357) {
            this.f280113d.b();
            if (i17 != 0) {
                dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i3y), 0).show();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        dVar.z(zq1.w.class, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.j(this));
    }

    public void L0(boolean z17, java.lang.String str, android.view.View.OnClickListener onClickListener, java.lang.String str2) {
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.g0(this, z17, str2, str, onClickListener));
    }

    public void M0(java.lang.String str, boolean z17) {
        this.f280113d.b0();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, this.f280113d.x())) {
            F0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "hideLiveBizSessionTipsBar not current user %s, %s", str, this.f280113d.x());
            return;
        }
        if (!z17) {
            F0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "hideLiveBizSessionTipsBar not live now");
            return;
        }
        if (this.f280281m == null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.j(this.f280113d.f542250l, com.p314xaae8f345.mm.R.id.p2q);
            com.p314xaae8f345.mm.ui.C21392x1bd9268c c21392x1bd9268c = (com.p314xaae8f345.mm.ui.C21392x1bd9268c) this.f280113d.c(com.p314xaae8f345.mm.R.id.f567110i75);
            this.f280281m = c21392x1bd9268c;
            if (c21392x1bd9268c == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUI.BizComponent", "liveBizSessionTipsBar is null");
                return;
            }
        }
        this.f280281m.m78465x4001c3c7(this.f280113d);
        this.f280281m.setVisibility(0);
        com.p314xaae8f345.mm.ui.ga e17 = this.f280113d.e();
        if (e17.F() != null) {
            e17.F().G(0.0f);
        }
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b bVar;
        if (i17 == 12001 && (bVar = this.f280276e) != null) {
            yb5.d dVar = bVar.f135191a;
            if (dVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context is null, maybe has been released");
                return;
            }
            if (i18 != -1) {
                if (i18 == 0) {
                    dp.a.m125853x26a183b(dVar.g(), com.p314xaae8f345.mm.R.C30867xcad56011.c3z, 0).show();
                    return;
                }
                return;
            }
            dp.a.m125853x26a183b(dVar.g(), com.p314xaae8f345.mm.R.C30867xcad56011.f572675c40, 0).show();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5361x3ed8f3d1 c5361x3ed8f3d1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5361x3ed8f3d1();
            am.o6 o6Var = c5361x3ed8f3d1.f135687g;
            o6Var.f89046a = 0;
            o6Var.f89047b = dVar.x();
            o6Var.f89048c = dVar.g();
            c5361x3ed8f3d1.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x008f, code lost:
    
        if (java.lang.Math.abs(r4 - r6) <= 3600000) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0182  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a.a():void");
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.util.ArrayList arrayList;
        if (m0Var == null || l0Var == null) {
            return;
        }
        java.lang.String str = l0Var.f535943a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (arrayList = l0Var.f535945c) == null || arrayList.isEmpty()) {
            return;
        }
        if (!str.equals(this.f280113d.x())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "bobkw onNotifyChange talker null or not ture");
            return;
        }
        if ("insert".equals(l0Var.f535944b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "bobkw onNotifyChange insert new msg");
            p0();
            if (!this.f280113d.u().n2()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "bobkw onNotifyChange isBizSubscribeContact not true");
                return;
            }
            if (G0() || H0()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "onNotifyChange insert msg");
            android.view.View view = this.D;
            if (view != null && view.getVisibility() == 0) {
                q0();
            }
        }
    }

    @Override // yn.d
    public boolean d0(int i17, android.view.KeyEvent keyEvent) {
        qk.o oVar;
        if (keyEvent.getKeyCode() == 82 && keyEvent.getAction() == 1 && ((oVar = this.f280279h) == null || oVar.D0(false) == null || this.f280279h.D0(false).c() == null || this.f280279h.D0(false).c().f445673b == null || this.f280279h.D0(false).c().f445673b.isEmpty())) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).f280796e.v(null);
        }
        return false;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        this.f280113d.x();
        if (this.I || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(obj, this.f280113d.x())) {
            return;
        }
        if (this.f280113d.u() != null && this.f280113d.u().k2()) {
            r01.x cj6 = r01.q3.cj();
            cj6.f449805d.a(this.M, android.os.Looper.getMainLooper());
        }
        J0();
    }

    public final void n0(boolean z17, java.lang.String str) {
        if (z17) {
            s01.y Ni = r01.q3.Ni();
            java.lang.String str2 = this.f280277f.f69169xf75e5c37;
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            Ni.getClass();
            gm0.j1.n().f354821b.g(new s01.o0(str, str2, currentTimeMillis));
        }
    }

    public boolean o0() {
        yb5.d dVar = this.f280113d;
        if (dVar == null || dVar.u() == null) {
            return false;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_conv_mass_send_hide_enable_android, 0) == 1) {
            return this.f280113d.u().n2();
        }
        return false;
    }

    public final void p0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "bobkw begin checkAndClearUnreadWithBizMsg");
        if (this.E.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "checkAndClearUnreadWithBizMsg: already checking, skip");
            return;
        }
        this.E.set(true);
        ((ku5.t0) ku5.t0.f394148d).k(this.Q, 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a.q0():void");
    }

    public boolean r0() {
        qk.o oVar;
        if (!((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).wi() || (oVar = this.f280279h) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f66740x26b3182a) || !this.f280113d.u().n2()) {
            return false;
        }
        qk.n D0 = this.f280279h.D0(true);
        org.json.JSONObject jSONObject = D0.f445789a;
        if (jSONObject != null) {
            D0.D = jSONObject.optInt("PrivateMsgScope");
        }
        int i17 = D0.D;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "privateMsgScope: %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            return false;
        }
        if (i17 == 1) {
            return !this.f280113d.u().r2();
        }
        if (i17 == 2) {
            return !this.f280113d.u().r2() || ((long) c01.id.e()) - g95.e.f351334a.c(this.f280113d.x()) < 604800;
        }
        return i17 == 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s0() {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d;
        com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b bVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        c01.ia.K("bizflag", 1, false);
        this.N.mo48814x2efc64();
        boolean z17 = this.f280286r;
        if (z17) {
            n0(z17, this.f280113d.x());
            s01.z Ri = r01.q3.Ri();
            s01.h hVar = this.f280277f;
            Ri.getClass();
            java.lang.String format = java.lang.String.format("%s;%s;%d", hVar.f69170x75756b18, hVar.f69169xf75e5c37, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
            java.lang.String str5 = hVar.f69170x75756b18;
            ((ce0.e) jVar).getClass();
            com.p314xaae8f345.mm.p957x53236a1b.g1.K(str5, 8, "EnterpriseChatStatus", format);
        }
        gm0.j1.i();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        int currentTimeMillis = this.f280284p != 0 ? ((int) (java.lang.System.currentTimeMillis() - this.f280284p)) / 1000 : 0;
        if (gm0.j1.a()) {
            if (this.f280286r) {
                s01.m Ui = r01.q3.Ui();
                s01.l lVar = this.f280275J;
                l75.v0 v0Var = Ui.f483434e;
                if (v0Var != null) {
                    v0Var.j(lVar);
                }
            }
            if (this.f280113d.u() != null && this.f280113d.u().k2()) {
                r01.x cj6 = r01.q3.cj();
                r01.v vVar = this.M;
                l75.v0 v0Var2 = cj6.f449805d;
                if (v0Var2 != null) {
                    v0Var2.j(vVar);
                }
            }
            if (this.f280113d.u().r2() && this.f280113d.u().k2()) {
                rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                java.lang.String x17 = this.f280113d.x();
                ((qv.o) u2Var).getClass();
                if (!r01.z.g(x17)) {
                    qk.o oVar = this.f280279h;
                    if (oVar != null && oVar.Q0()) {
                        if (this.A == null) {
                            this.A = new r45.j16();
                        }
                        r45.j16 j16Var = this.A;
                        j16Var.f459029d = currentTimeMillis;
                        j16Var.f459033h = this.f280113d.f542250l.m78386x9c19e6d7("Main_IndexInSessionList", 0);
                        this.A.f459031f = this.f280113d.f542250l.m78386x9c19e6d7("Main_UnreadCount", 0);
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f280285q;
                        if (f9Var != null) {
                            this.A.f459032g = f9Var.mo78013xfb85f7b0();
                            r45.j16 j16Var2 = this.A;
                            if (j16Var2.f459031f > 0) {
                                j16Var2.f459030e = ((int) (this.f280284p - this.f280285q.mo78012x3fdd41df())) / 1000;
                            }
                        }
                    }
                    r01.r1 Zi = r01.q3.Zi();
                    java.lang.String x18 = this.f280113d.x();
                    r45.j16 j16Var3 = this.A;
                    Zi.getClass();
                    ((ku5.t0) ku5.t0.f394148d).g(new r01.q1(Zi, j16Var3, x18));
                }
            }
        }
        if (com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b.a(this.f280279h) && this.f280276e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "hardevice brand account, init event : %s, notify exit chattingui", E0());
            this.f280276e.b(2, this.f280279h);
            this.f280113d.f542250l.mo78691x3f86539a((java.lang.String) null);
        }
        if (this.f280113d.u().r2() && this.f280113d.u().k2() && currentTimeMillis != 0) {
            android.content.Intent intent = this.f280113d.g().getIntent();
            if (intent != null) {
                str = intent.getStringExtra("uinserve_search_id");
                java.lang.String stringExtra = intent.getStringExtra("uinserve_search_click_id");
                str3 = intent.getStringExtra("uinserve_search_session_id");
                str2 = intent.getStringExtra("uinserve_search_time_token");
                str4 = stringExtra;
            } else {
                str = "";
                str2 = "";
                str3 = str2;
                str4 = str3;
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            int m78386x9c19e6d7 = this.f280113d.f542250l.m78386x9c19e6d7("specific_chat_from_scene", 0);
            int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10638, this.f280113d.x(), java.lang.Integer.valueOf(currentTimeMillis), java.lang.Integer.valueOf(this.f280113d.f542250l.m78386x9c19e6d7("biz_click_item_unread_count", 0)), java.lang.Integer.valueOf(this.f280113d.f542250l.m78386x9c19e6d7("biz_click_item_position", 0)), java.lang.Integer.valueOf(m78386x9c19e6d7), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis2), str3 + ":" + str + ":" + str2, str4);
        }
        com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b bVar2 = this.f280276e;
        if (bVar2 != null) {
            com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.C5085x70cac3f1 c5085x70cac3f1 = bVar2.f135192b;
            if (c5085x70cac3f1 != null) {
                c5085x70cac3f1.mo48814x2efc64();
                bVar2.f135192b = null;
                java.util.Map map = bVar2.f135195e;
                if (map != null) {
                    ((java.util.HashMap) map).clear();
                }
            }
            bVar2.f135196f = false;
            com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.C5084x29fe5b69 c5084x29fe5b69 = bVar2.f135193c;
            if (c5084x29fe5b69 != null) {
                c5084x29fe5b69.mo48814x2efc64();
                bVar = 0;
                bVar2.f135193c = null;
            } else {
                bVar = 0;
            }
            this.f280276e = bVar;
            abstractC20980x9b9ad01d = bVar;
        } else {
            abstractC20980x9b9ad01d = null;
        }
        this.f280284p = 0L;
        F0();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = this.f280283o;
        if (abstractC20980x9b9ad01d2 != null) {
            abstractC20980x9b9ad01d2.mo48814x2efc64();
            this.f280283o = abstractC20980x9b9ad01d;
        }
        this.E.set(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "doDestroy %s", this.f280113d.x());
    }

    public boolean t0() {
        yb5.d dVar = this.f280113d;
        if (dVar == null || dVar.u() == null || !(this.f280113d.u().n2() || this.f280113d.u().l2())) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f449680i.f449687b;
        if (bVar != null && bVar.f299430p && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f299425h)) {
            return ur1.n.f511894a.b().f467359m == 1;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar2 = ((r01.l1) i95.n0.c(r01.l1.class)).f449681m.f449687b;
        return bVar2 != null && bVar2.f299430p && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar2.f299425h) && ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Bi();
    }

    public final void u0(boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f280113d.x());
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("KNeedScrollToTab", z17);
        j45.l.j(this.f280113d.g(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public final void v0() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f280113d.x());
        intent.putExtra("key_start_biz_profile_setting_from_scene", 1);
        j45.l.j(this.f280113d.g(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.newbizinfo.NewBizInfoSettingUI", intent, null);
    }

    public long w0() {
        s01.h hVar = this.f280277f;
        if (hVar == null) {
            return -1L;
        }
        return hVar.f69168x92559640;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x02b7, code lost:
    
        if (((r0 == null || r0.u() == null) ? false : r10.f280113d.u().m2()) == false) goto L130;
     */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x() {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a.x():void");
    }

    public qk.o x0() {
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f280113d.x())) {
            return this.f280279h;
        }
        qk.o oVar = this.f280280i;
        if (oVar != null) {
            return oVar;
        }
        I0();
        return this.f280280i;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        this.L = false;
        if (this.f280113d.u().r2() && this.f280113d.u().k2() && this.f280279h != null) {
            r01.q3.Zi().g();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f280293y;
            if (j0Var != null) {
                j0Var.dismiss();
            }
        }
        g31.a aVar = g31.l.f349618h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSubscribeMsgService", "clearNotifyCallback");
        g31.l.f349619i.clear();
        zq1.v vVar = this.f280282n;
        if (vVar != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h) vVar).b();
        }
    }

    public java.lang.String y0(java.lang.String str) {
        qk.o oVar;
        qk.n D0;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.contains("http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/emoticonstore/")) {
            return null;
        }
        java.lang.String substring = str.substring(str.lastIndexOf("/") + 1);
        if (!this.f280113d.u().r2() || !this.f280113d.u().k2() || (oVar = this.f280279h) == null || (D0 = oVar.D0(false)) == null) {
            return null;
        }
        org.json.JSONObject jSONObject = D0.f445789a;
        if (jSONObject != null) {
            D0.f445806r = jSONObject.optString("SupportEmoticonLinkPrefix");
        }
        if (android.text.TextUtils.isEmpty(D0.f445806r)) {
            return null;
        }
        org.json.JSONObject jSONObject2 = D0.f445789a;
        if (jSONObject2 != null) {
            D0.f445806r = jSONObject2.optString("SupportEmoticonLinkPrefix");
        }
        if (substring.contains(D0.f445806r)) {
            return substring;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        this.f280284p = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class));
        this.f280285q = kVar.mo8143x7444f759() > 0 ? kVar.mo75871xfb80e389(kVar.mo8143x7444f759() - 1) : null;
        this.f280113d.x();
        this.F = B0();
        boolean z17 = this.f280286r;
        if (z17) {
            gm0.j1.e().k(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.l(this, z17, this.f280277f, this.f280113d.u(), this.f280113d.x(), this.f280287s), 500L);
        } else {
            final java.lang.String x17 = this.f280113d.x();
            ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.biz.a$$b
                @Override // java.lang.Runnable
                public final void run() {
                    final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a.this;
                    final java.lang.String str = x17;
                    aVar.getClass();
                    ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                    if (r01.z.g(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.BizComponent", "doCreate for username:%s, which is EnterpriseChat but missing bizChatId, ChattingUI should be finished", str);
                        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.biz.a$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a.this;
                                yb5.d dVar = aVar2.f280113d;
                                boolean z18 = dVar.f542247i;
                                int intExtra = dVar.n().getIntExtra("biz_chat_from_scene", 7);
                                aVar2.f280113d.d();
                                if (z18) {
                                    java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
                                    android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
                                    if (activity == null) {
                                        return;
                                    }
                                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.class);
                                    intent.putExtra("Contact_User", str);
                                    intent.putExtra("biz_chat_from_scene", intExtra);
                                    intent.addFlags(67108864);
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    arrayList.add(intent);
                                    java.util.Collections.reverse(arrayList);
                                    android.app.Activity activity2 = activity;
                                    yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/biz/BizComponent", "lambda$doCreate$0", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    activity.startActivity((android.content.Intent) arrayList.get(0));
                                    yj0.a.f(activity2, "com/tencent/mm/ui/chatting/component/biz/BizComponent", "lambda$doCreate$0", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                }
                            }
                        });
                    }
                }
            });
        }
        gm0.j1.i();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, null);
        J0();
        this.N.mo48813x58998cd();
        this.f280290v = this.f280113d.f542250l.m78388x5a3fc3e("key_biz_chat_id", -1L);
        if (com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b.a(this.f280279h) && this.f280276e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "hardevice brand account, init event : %s", E0());
            this.f280276e = new com.p314xaae8f345.mm.app.p622xc5476f33.p623x782d98c9.b(this.f280113d);
        }
        if (this.f280113d.u().k2()) {
            n21.h.f415799g = 2;
        }
        if (this.f280286r) {
            r01.q3.Ui().f483434e.a(this.f280275J, android.os.Looper.getMainLooper());
        }
        if (this.f280113d.u() != null && this.f280113d.u().k2()) {
            r01.q3.cj().f449805d.a(this.M, android.os.Looper.getMainLooper());
        }
        L0(false, "", null, "reset_on_enter");
        q0();
        p0();
        if (H0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2126, 8);
        } else if (this.f280113d.u().l2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2126, 9);
        }
    }
}
