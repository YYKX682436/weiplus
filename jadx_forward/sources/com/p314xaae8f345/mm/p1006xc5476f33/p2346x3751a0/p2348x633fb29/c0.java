package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public final class c0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.n implements com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g {

    /* renamed from: field_capInfo */
    private byte[] f38605x956ecd5b;

    /* renamed from: field_peerId */
    private byte[] f38606xab0d902;

    /* renamed from: r, reason: collision with root package name */
    public final jq4.c1 f257897r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 f257898s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18852xeadfe3fc f257899t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18851x36ac45b2 f257900u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Set f257901v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.plugin.voip.model.NewVoipIncomingCallManager$voipListener$1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.plugin.voip.model.NewVoipIncomingCallManager$renderListener$1] */
    public c0(jq4.c1 floatCardManager, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 implVoip) {
        super(floatCardManager);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(floatCardManager, "floatCardManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(implVoip, "implVoip");
        this.f257897r = floatCardManager;
        this.f257898s = implVoip;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f257899t = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(a0Var) { // from class: com.tencent.mm.plugin.voip.model.NewVoipIncomingCallManager$voipListener$1
            {
                this.f39173x3fe91575 = -797557590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba event = c6231x4f3054ba;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (event.f136478g.f89948b != 11) {
                    return false;
                }
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b0(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c0.this));
                return false;
            }
        };
        this.f257900u = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18928x8aba1cc4>(a0Var) { // from class: com.tencent.mm.plugin.voip.model.NewVoipIncomingCallManager$renderListener$1
            {
                this.f39173x3fe91575 = -1223349174;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18928x8aba1cc4 c18928x8aba1cc4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18928x8aba1cc4 event = c18928x8aba1cc4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (event.f258620g != 2) {
                    return false;
                }
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a0(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c0.this));
                return false;
            }
        };
        this.f257901v = new java.util.LinkedHashSet();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void K(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean U() {
        v();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void V() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void X(boolean z17, boolean z18, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f iVoipUI) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVoipUI, "iVoipUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void d() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void f() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void g(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a, int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean i() {
        m();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void j(boolean z17, boolean z18) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean l() {
        m();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean n() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.n
    public void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "release");
        this.f258293n = null;
        this.f258296q = false;
        this.f258294o = false;
        this.f258295p = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f258287e;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        this.f258287e = null;
        wu5.c cVar = this.f258291i;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f258291i = null;
        wu5.c cVar2 = this.f258292m;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        this.f258292m = null;
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) mo3.f.f411939a).f(49);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "release");
        mo48814x2efc64();
        mo48814x2efc64();
        this.f258293n = null;
        this.f38605x956ecd5b = null;
        this.f38606xab0d902 = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean r() {
        v();
        return true;
    }

    public void s(r45.r27 roomInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomInfo, "roomInfo");
        java.lang.String str = roomInfo.f466027i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = this.f257898s.f257944a;
        byte[] bArr = null;
        this.f38605x956ecd5b = (g1Var == null || (c18912x54425f622 = g1Var.f258065x) == null) ? null : c18912x54425f622.f38612x956ecd5b;
        if (g1Var != null && (c18912x54425f62 = g1Var.f258065x) != null) {
            bArr = c18912x54425f62.f38633xab0d902;
        }
        this.f38606xab0d902 = bArr;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        jq4.c1 c1Var = this.f257897r;
        c1Var.getClass();
        c1Var.C = weakReference;
        c1Var.f382757y = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z(this);
        this.f257898s.d(roomInfo.f466022d, roomInfo.f466023e, 1, this.f38606xab0d902, this.f38605x956ecd5b, str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean t() {
        return true;
    }

    public boolean u() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_allow_incoming_call_when_connected, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "clicfg_voip_allow_incoming_call_when_connected value:" + fj6);
        return fj6;
    }

    public void v() {
        r45.r27 r27Var = this.f258293n;
        if (r27Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "onReject, roomInfo:" + com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.o.a(r27Var));
        q();
        java.lang.String str = r27Var.f466027i;
        long j17 = r27Var.f466023e;
        int i17 = r27Var.f466022d;
        boolean z17 = r27Var.f466028m == 0;
        new mq4.g(2, vq4.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), i17, new byte[0], new byte[0], j17, false, false, null).L();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k0(i17, j17, 0L, str, z17, false);
        java.lang.String str2 = r27Var.f466027i;
        int i18 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b2.d(str2, z17 ? "voip_content_video" : "voip_content_voice", 0, 6, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kae), false, k0Var, null);
        r45.r27 r27Var2 = this.f258293n;
        if (r27Var2 != null) {
            y(1, r27Var2);
        }
        p();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean w() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean x(boolean z17) {
        return true;
    }

    public void y(int i17, r45.r27 roomInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomInfo, "roomInfo");
        if (u()) {
            if (i17 == 9) {
                java.util.Set set = this.f257901v;
                if (set.contains(java.lang.Integer.valueOf(roomInfo.f466022d))) {
                    return;
                } else {
                    set.add(java.lang.Integer.valueOf(roomInfo.f466022d));
                }
            }
            long n17 = gq4.v.Bi().n();
            int m17 = gq4.v.Bi().m();
            long j17 = roomInfo.f466023e;
            int i18 = roomInfo.f466022d;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7018x19d267a4 c7018x19d267a4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7018x19d267a4();
            c7018x19d267a4.f143319d = n17;
            c7018x19d267a4.f143320e = m17;
            c7018x19d267a4.f143321f = j17;
            c7018x19d267a4.f143322g = i18;
            c7018x19d267a4.f143323h = i17;
            c7018x19d267a4.k();
        }
    }

    public void z(r45.r27 roomInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomInfo, "roomInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipIncomingCallManager", "startAcceptVoIP, roomInfo:" + com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.o.a(roomInfo));
        boolean z17 = true;
        if (!this.f257898s.p(roomInfo)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipIncomingCallManager", "startAcceptVoIP setInviteContent failed!");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.r(11525, true, true, java.lang.Integer.valueOf(roomInfo.f466022d), java.lang.Long.valueOf(roomInfo.f466023e), java.lang.Integer.valueOf(roomInfo.f466028m), 5, java.lang.Integer.valueOf(vq4.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            g0Var.r(11526, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 7);
            vq4.d0.i(0);
            return;
        }
        r45.r27 r27Var = this.f258293n;
        boolean z18 = r27Var != null && r27Var.f466028m == 0;
        final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
        final java.lang.String str = roomInfo.f466027i;
        final long j17 = roomInfo.f466023e;
        final boolean z19 = true;
        Bi.getClass();
        final android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.app.w wVar = com.p314xaae8f345.mm.app.w.INSTANCE;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Voip.VoipService", "start VideoActivity in foreground,%s", java.lang.Boolean.valueOf(wVar.f135422n));
        vq4.b0.o();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var = Bi.f258091a;
        d3Var.f257964u = str;
        d3Var.f257966w = false;
        d3Var.f257965v = z18;
        Bi.G();
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (vq4.b0.f520804b && z18 && Bi.E == null) {
            gq4.v.wi().d();
            if (!fp.h.a(26) && (!wVar.f135422n || Bi.u() || Bi.v())) {
                z17 = false;
            }
            dr4.p1 p1Var = new dr4.p1(false, z17);
            Bi.E = p1Var;
            if (vq4.b0.f520813k) {
                p1Var.f();
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.o2(Bi, z18, str, j17));
        final boolean z27 = false;
        final boolean z28 = z18;
        ((y03.e) i95.n0.c(y03.e.class)).d8(context, str, z18, new yz5.l() { // from class: com.tencent.mm.plugin.voip.model.h2$$d
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                boolean z29;
                android.content.Intent intent;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2.this;
                java.lang.String str2 = str;
                boolean z37 = z28;
                long j18 = j17;
                boolean z38 = z27;
                android.content.Context context2 = context;
                long j19 = currentTimeMillis;
                boolean z39 = z19;
                android.content.Intent intent2 = (android.content.Intent) obj;
                h2Var.getClass();
                if (vq4.b0.f520809g) {
                    h2Var.f258093c = true;
                    z29 = z39;
                    intent = intent2;
                    h2Var.F(str2, z37, false, j18);
                } else {
                    z29 = z39;
                    intent = intent2;
                }
                com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
                com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
                com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
                com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
                com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec c19769x48b92ec = new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec();
                c19772x1c2cd081.f38869x6ac9171 = str2;
                c19762x487075a.f38859x6ac9171 = z38;
                c19762x487075a2.f38859x6ac9171 = z37;
                c19767x257d7f.f38864x6ac9171 = vq4.n0.c(c19762x487075a.f38859x6ac9171, z37);
                c19769x48b92ec.f38866x6ac9171 = j18;
                gq4.a t17 = gq4.v.Bi().t(context2, c19772x1c2cd081, c19762x487075a, c19762x487075a2, c19767x257d7f, c19769x48b92ec, ((y03.e) i95.n0.c(y03.e.class)).pd(intent));
                if (t17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.VoipService", "voip mgr init failed and not allow to continue accept incoming call");
                    return null;
                }
                if (z37) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0) t17).i();
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0) t17).l();
                }
                h2Var.D = new vq4.m0();
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j0.o(h2Var.z());
                intent.putExtra("Voip_User", str2);
                intent.putExtra("Voip_Outcall", z38);
                intent.putExtra("Voip_VideoCall", z37);
                intent.putExtra("Voip_LastPage_Hash", j19);
                intent.putExtra("Voip_CallRoomKey", j18);
                if (z29) {
                    intent.setFlags(603979776);
                    intent.addFlags(268435456);
                }
                if (android.os.Build.VERSION.SDK_INT >= 29 && !com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
                    h2Var.f258113w = j19;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipService", "start channel ring, now:" + h2Var.f258113w);
                }
                ((tf0.a) ((uf0.e) i95.n0.c(uf0.e.class))).wi(context2, intent, null, "", intent.getComponent().getClassName(), true, mx3.i0.h(str2), true, true);
                if (mx3.f0.j() && fp.e0.g()) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.grantUriPermission("com.android.systemui", com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.vfs.r6.j(new java.io.File(mx3.i0.j(str2).h()))), 1);
                }
                rq4.u.f480642a.c(false, z38);
                return null;
            }
        });
    }
}
