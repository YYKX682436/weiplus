package zi3;

/* loaded from: classes14.dex */
public class f extends xm1.i {

    /* renamed from: u, reason: collision with root package name */
    public static f25.m0 f554702u;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e f554703k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f554704l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f554705m;

    /* renamed from: n, reason: collision with root package name */
    public final f25.f f554706n = new zi3.c(this);

    /* renamed from: o, reason: collision with root package name */
    public final xm1.o f554707o;

    /* renamed from: p, reason: collision with root package name */
    public final cv.u0 f554708p;

    /* renamed from: q, reason: collision with root package name */
    public int f554709q;

    /* renamed from: r, reason: collision with root package name */
    public cv.v0 f554710r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 f554711s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Toast f554712t;

    public f() {
        zi3.b bVar = new zi3.b(this);
        this.f554707o = new xm1.o(bVar);
        this.f554708p = new cv.u0(bVar, 3);
        i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BluetoothMgr", "refreshForbiddenCauseVoipRequest，".concat("multitalke"));
        an1.c.f90369d = true;
        om1.a.f427798c = 0;
        this.f554709q = -1;
    }

    public static final void C(zi3.f fVar, cv.v0 v0Var, boolean z17) {
        fVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "switchUIVoicePlayDevice: " + v0Var + ", " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = fVar.f554711s;
        if (serviceConnectionC16581x3d1d6bd2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "setVoicePlayDevice: " + v0Var);
            if (v0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 b0Var = serviceConnectionC16581x3d1d6bd2.f231775u;
                b0Var.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVoicePlayDevice: ");
                int i17 = v0Var.f304049a;
                sb6.append(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", sb6.toString());
                if (i17 == 3 || i17 == 4) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().a(true);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().a(false);
                }
                b0Var.f231791f.mo7808x76db6cb1(java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.z(i17));
            }
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new zi3.e(fVar, v0Var));
    }

    public static /* synthetic */ void P(zi3.f fVar, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchOutput");
        }
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        fVar.O(i17, z17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r0.f257971a == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(boolean r6) {
        /*
            r5 = this;
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.MT.MultiTalkAudioManager"
            java.lang.String r2 = "setSpeakerPhoneOn, isSpeakerPhoneOn: %b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            r5.A(r6)
            com.tencent.mm.plugin.voip.model.e r0 = r5.f554703k
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r3 = r0.f257971a
            r4 = 1
            if (r3 != r4) goto L1d
            goto L1e
        L1d:
            r4 = r2
        L1e:
            if (r4 == 0) goto L26
            if (r0 == 0) goto L26
            boolean r2 = r0.j(r6)
        L26:
            r5.f554704l = r2
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r0 = "setSpeakerPhoneOn, result %b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0, r6)
            boolean r6 = r5.f554704l
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zi3.f.D(boolean):boolean");
    }

    public final int E() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = this.f554703k;
        if (eVar != null) {
            return eVar.g();
        }
        return 0;
    }

    public final boolean F() {
        return m(3) || m(4);
    }

    public void G() {
        if (!e()) {
            H();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new zi3.d(this));
    }

    public void H() {
        v();
        a(false);
        q("multitalke");
        this.f554707o.b();
        f25.m0 m0Var = f554702u;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        f554702u = null;
    }

    public final void I(boolean z17, int i17) {
        if (i17 != 0) {
            this.f536710i = null;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "close");
            bundle.putInt("streamType", E());
            ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.MULTITALK, bundle);
        } else if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj() || ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "requestAudioDeviceToStartRing but waitting the bt connected");
            M(z17);
            this.f536710i = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "requestAudioDeviceToStartRing ignore bluetooth or not bt plug");
            M(z17);
        }
        if (z17 || mx3.f0.f414081a.k()) {
            Q();
        }
    }

    public final void J() {
        Q();
        boolean Ui = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(m(3));
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(m(4));
        i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "startPlay, isHeadsetPlugged: %b, isBluetoothConnected: %b, isUsingExternalAudioDevice:%b, isBluetoothCanUse:%b, %s", valueOf, valueOf2, java.lang.Boolean.valueOf(an1.c.f90367b || an1.d.f90372b), java.lang.Boolean.valueOf(Ui), java.lang.Integer.valueOf(hashCode()));
        f25.n0 n0Var = (f25.n0) i95.n0.c(f25.n0.class);
        f25.u uVar = f25.u.f340646c;
        f554702u = n0Var.m9(uVar, null);
        if (Ui) {
            O(4, false);
        } else if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj()) {
            O(3, false);
        } else {
            O(1, false);
        }
        f25.m0 m0Var = f554702u;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(uVar, this.f554706n);
        f554702u = m96;
        if (m96 != null && ((g25.e) m96).f349513c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "requestAudioFocus: gain focus");
            N(false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "requestAudioFocus: not gain focus");
            N(true);
        }
    }

    public final void K() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "requestPreviousDevice: " + this.f554710r);
        cv.v0 v0Var = this.f554710r;
        if (v0Var == null) {
            J();
        } else {
            O(v0Var != null ? v0Var.f304049a : 1, false);
        }
    }

    public final void L(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2, boolean z17) {
        this.f554711s = serviceConnectionC16581x3d1d6bd2;
        if (serviceConnectionC16581x3d1d6bd2 == null) {
            if (z17) {
                this.f554710r = null;
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "setMultiTalkUIProxy: " + this.f554711s + ", " + this.f554710r);
        ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).wi(this.f554708p);
    }

    public final void M(boolean z17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("isOutCall", z17);
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "start");
        ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.MULTITALK, bundle);
    }

    public final void N(boolean z17) {
        if (j65.e.b() && j65.e.g()) {
            this.f554705m = z17;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = this.f554703k;
            if (eVar != null) {
                eVar.R = z17;
            }
            yx3.v Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai();
            if (Ai != null) {
                Ai.f549481h = z17;
                yx3.k kVar = Ai.f549476c;
                if (kVar != null) {
                    kVar.i(z17);
                }
            }
        }
    }

    public final void O(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "switchOutput: " + i17 + ", " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().M(i17 != 2);
        this.f554707o.c(i17, z17);
    }

    public final void Q() {
        if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "tryRequestBluetoothDevice, ret:" + r("multitalke", 4));
        }
    }

    public void R() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "MultiTalkAudioManager: unInit");
        G();
        this.f554711s = null;
        this.f554710r = null;
        ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).oj(this.f554708p);
        ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).m131720x41012807();
    }

    @Override // xm1.h
    public void o(int i17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231709s == sj3.e4.Init) {
            super.o(i17);
            return;
        }
        super.o(i17);
        boolean z17 = false;
        switch (i17) {
            case 1:
            case 3:
            case 6:
            case 7:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "qipeng, BCT_BT_ScoStateDisconnected");
                boolean z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().A() && !m(3);
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().A() && !m(3)) {
                    z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231697g;
                }
                if (m(3)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().a(true);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().c(z18);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "isSpeakerAfterBluetoothDisconnected: isHeadsetPlugged: %s, isHandsFree: %s, isHandsFreeUIStatus: %s, isRingStop: %s, isBluetoothConnected: %s, isSpeaker: %s", java.lang.Boolean.valueOf(m(3)), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231696f), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231697g), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().A()), java.lang.Boolean.valueOf(m(4)), java.lang.Boolean.valueOf(z18));
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().R(z18);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().a(false);
                if (m(3)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().P(false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().a(true);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().P(true);
                }
                if (z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().m(1);
                    return;
                } else if (m(3)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().m(3);
                    return;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().m(2);
                    return;
                }
            case 2:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "qipeng, BCT_BT_ScoStateConnected");
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().P(false);
                a(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().R(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().a(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().c(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().m(4);
                return;
            case 4:
            case 5:
            default:
                return;
            case 8:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "qipeng, BCT_HP_HeadsetPlugged");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "isHeadsetPlug connected, isHandsFree: %s, isHandsFreeUIStatus: %s, isRingStop: %s, isBluetoothConnected: %s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231696f), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231697g), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().A()), java.lang.Boolean.valueOf(m(3)));
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().P(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().R(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().m(3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().a(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().c(false);
                return;
            case 9:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "qipeng, BCT_HP_HeadsetUnPlugged");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAudioManager", "isHeadsetPlug disconnected, isHandsFree: %s, isHandsFreeUIStatus: %s, isRingStop: %s, isBluetoothConnected: %s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231696f), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231697g), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().A()), java.lang.Boolean.valueOf(m(4)));
                boolean z19 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().A() ? com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231697g : true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().a(false);
                if (m(4)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().a(true);
                } else {
                    z17 = z19;
                }
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().m(1);
                } else if (m(4)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().m(4);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().m(2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().R(z17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().P(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Bi().c(z17);
                return;
        }
    }
}
