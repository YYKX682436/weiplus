package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* renamed from: com.tencent.wechat.aff.chatbot.ZIDL_fc3cA08LjB */
/* loaded from: classes14.dex */
class C27226x2813e350 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q0 f297588a;

    public C27226x2813e350(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q0 q0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q0) obj;
        this.f297588a = q0Var;
        q0Var.getClass();
    }

    /* renamed from: ZIDL_AX */
    private native void m111992x1964d17f(long j17, long j18);

    /* renamed from: ZIDL_BX */
    private native void m111993x1964d19e(long j17, long j18);

    /* renamed from: ZIDL_CX */
    private native void m111994x1964d1bd(long j17, long j18);

    /* renamed from: ZIDL_DX */
    private native void m111995x1964d1dc(long j17, long j18);

    /* renamed from: ZIDL_EX */
    private native void m111996x1964d1fb(long j17, long j18);

    /* renamed from: ZIDL_FX */
    private native void m111997x1964d21a(long j17, long j18);

    /* renamed from: ZIDL_GX */
    private native void m111998x1964d239(long j17, long j18);

    /* renamed from: ZIDL_HX */
    private native void m111999x1964d258(long j17, long j18);

    /* renamed from: ZIDL_IX */
    private native void m112000x1964d277(long j17, long j18);

    /* renamed from: ZIDL_JX */
    private native void m112001x1964d296(long j17, long j18);

    /* renamed from: ZIDL_KX */
    private native void m112002x1964d2b5(long j17, long j18);

    /* renamed from: ZIDL_LX */
    private native void m112003x1964d2d4(long j17, long j18);

    /* renamed from: ZIDL_MX */
    private native void m112004x1964d2f3(long j17, long j18);

    /* renamed from: ZIDL_NX */
    private native void m112005x1964d312(long j17, long j18);

    /* renamed from: ZIDL_OX */
    private native void m112006x1964d331(long j17, long j18);

    /* renamed from: ZIDL_PX */
    private native void m112007x1964d350(long j17, long j18);

    /* renamed from: ZIDL_QX */
    private native void m112008x1964d36f(long j17, long j18);

    /* renamed from: ZIDL_RX */
    private native void m112009x1964d38e(long j17, long j18);

    /* renamed from: ZIDL_SX */
    private native void m112010x1964d3ad(long j17, long j18);

    /* renamed from: ZIDL_VX */
    private native void m112011x1964d40a(long j17, long j18);

    /* renamed from: ZIDL_WX */
    private native void m112012x1964d429(long j17, long j18);

    /* renamed from: ZIDL_XX */
    private native void m112013x1964d448(long j17, long j18);

    /* renamed from: ZIDL_AV */
    public void m112014x1964d17d(long j17) {
        ((wx.o) this.f297588a).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotIamCoreCenter", "talkSuccAsync");
        hy.b0 b0Var = hy.b0.f367261a;
        hy.b0.f367263c = true;
        java.util.List<hy.a0> a17 = b0Var.a();
        if (a17.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "routeTalkSucc: no sessions, isRoomTalkSucc marked for future sessions");
            return;
        }
        for (hy.a0 a0Var : a17) {
            a0Var.f367259f = true;
            a0Var.f367257d.post(new hy.x(a0Var));
        }
    }

    /* renamed from: ZIDL_BV */
    public void m112015x1964d19c(long j17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.q0 q0Var = this.f297588a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) q0Var).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotIamCoreCenter", "callEndAsync voipSessionID=".concat(str));
        hy.b0 b0Var = hy.b0.f367261a;
        hy.b0.f367263c = false;
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "routeCallEnd: voipSessionID is empty, broadcasting to all sessions");
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367259f = false;
                a0Var.f367257d.post(new hy.e(a0Var));
                b0Var.c(a0Var);
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "routeCallEnd: no session found for voipSessionID=".concat(str));
            return;
        }
        d17.f367259f = false;
        d17.f367257d.post(new hy.e(d17));
        b0Var.c(d17);
    }

    /* renamed from: ZIDL_CV */
    public void m112016x1964d1bb(long j17, byte[] bArr, int i17, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w.a(i17);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.n(a0Var, bArr, a17));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str);
        if (d17 != null) {
            d17.f367257d.post(new hy.n(d17, bArr, a17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str));
        }
    }

    /* renamed from: ZIDL_DV */
    public void m112017x1964d1da(long j17, byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j jVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j.f297821f, bArr);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.v(a0Var, jVar));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str);
        if (d17 != null) {
            d17.f367257d.post(new hy.v(d17, jVar));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str));
        }
    }

    /* renamed from: ZIDL_EV */
    public void m112018x1964d1f9(long j17, byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j jVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j.f297821f, bArr);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.w(a0Var, jVar));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str);
        if (d17 != null) {
            d17.f367257d.post(new hy.w(d17, jVar));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str));
        }
    }

    /* renamed from: ZIDL_FV */
    public void m112019x1964d218(long j17, boolean z17, byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.c(a0Var, z17));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str);
        if (d17 != null) {
            d17.f367257d.post(new hy.c(d17, z17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str));
        }
    }

    /* renamed from: ZIDL_GV */
    public void m112020x1964d237(long j17, byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.f fVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.f) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.f.f297720q, bArr);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.h(a0Var, fVar));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str);
        if (d17 != null) {
            d17.f367257d.post(new hy.h(d17, fVar));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str));
        }
    }

    /* renamed from: ZIDL_HV */
    public void m112021x1964d256(long j17, byte[] bArr, int i17, int i18, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str3 = new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str4 = new java.lang.String(bArr4, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str4.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.l(a0Var, str, i17, i18, str2, str3));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str4);
        if (d17 != null) {
            d17.f367257d.post(new hy.l(d17, str, i17, i18, str2, str3));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str4));
        }
    }

    /* renamed from: ZIDL_IV */
    public void m112022x1964d275(long j17, byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.t1 t1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.t1) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.t1.f297995h, bArr);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.j(a0Var, t1Var));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str);
        if (d17 != null) {
            d17.f367257d.post(new hy.j(d17, t1Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str));
        }
    }

    /* renamed from: ZIDL_JV */
    public void m112023x1964d294(long j17, byte[] bArr, byte[] bArr2) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str2.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.q(a0Var, str));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str2);
        if (d17 != null) {
            d17.f367257d.post(new hy.q(d17, str));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str2));
        }
    }

    /* renamed from: ZIDL_KV */
    public void m112024x1964d2b3(long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u uVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u.f298004m, bArr);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr4, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str2.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.p(a0Var, uVar, str, bArr3));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str2);
        if (d17 != null) {
            d17.f367257d.post(new hy.p(d17, uVar, str, bArr3));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str2));
        }
    }

    /* renamed from: ZIDL_LV */
    public void m112025x1964d2d2(long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z17, boolean z18, int i17, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
        new java.lang.String(bArr4, java.nio.charset.StandardCharsets.UTF_8);
        new java.lang.String(bArr6, java.nio.charset.StandardCharsets.UTF_8);
        this.f297588a.getClass();
    }

    /* renamed from: ZIDL_MV */
    public void m112026x1964d2f1(long j17, byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g.f297741s, bArr);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.r(a0Var, gVar));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str);
        if (d17 != null) {
            d17.f367257d.post(new hy.r(d17, gVar));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str));
        }
    }

    /* renamed from: ZIDL_NV */
    public void m112027x1964d310(long j17, byte[] bArr, boolean z17, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str3 = new java.lang.String(bArr4, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str3.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.i(a0Var, str, z17, str2, bArr3));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str3);
        if (d17 != null) {
            d17.f367257d.post(new hy.i(d17, str, z17, str2, bArr3));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str3));
        }
    }

    /* renamed from: ZIDL_OV */
    public void m112028x1964d32f(long j17, byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e0 e0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e0) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.e0.f297704p, bArr);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.u(a0Var, e0Var));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str);
        if (d17 != null) {
            d17.f367257d.post(new hy.u(d17, e0Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str));
        }
    }

    /* renamed from: ZIDL_PV */
    public void m112029x1964d34e(long j17, byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.k1 k1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.k1) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.k1.B, bArr);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.g(a0Var, k1Var));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str);
        if (d17 != null) {
            d17.f367257d.post(new hy.g(d17, k1Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str));
        }
    }

    /* renamed from: ZIDL_QV */
    public void m112030x1964d36d(long j17, byte[] bArr, byte[] bArr2) {
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.k(a0Var, bArr));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str);
        if (d17 != null) {
            d17.f367257d.post(new hy.k(d17, bArr));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str));
        }
    }

    /* renamed from: ZIDL_RV */
    public void m112031x1964d38c(long j17, int i17) {
        ((wx.o) this.f297588a).getClass();
        for (hy.a0 a0Var : hy.b0.f367261a.a()) {
            a0Var.f367257d.post(new hy.s(a0Var, i17));
        }
    }

    /* renamed from: ZIDL_SV */
    public void m112032x1964d3ab(long j17, byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b3 b3Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b3) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b3.f297629g, bArr);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.m(a0Var, b3Var));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str);
        if (d17 != null) {
            d17.f367257d.post(new hy.m(d17, b3Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str));
        }
    }

    /* renamed from: ZIDL_T */
    public byte[] m112033x9db8ee0c() {
        java.lang.String o17;
        ((wx.o) this.f297588a).getClass();
        com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
        java.lang.Object obj = new java.util.LinkedList(kz5.b0.c("chatbot_weapp_loading_check_model")).get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) e0Var).Ui("ilinkres_51db20b7", (java.lang.String) obj);
        if (Ui == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotWeAppLoadingCheckModelManager", "udr res null");
            o17 = null;
        } else {
            java.lang.String o18 = new com.p314xaae8f345.mm.vfs.r6(Ui.c(), "ChatBotWeAppLoadingCheckModel").o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
            o17 = new com.p314xaae8f345.mm.vfs.r6(o18, "model.tflite").o();
        }
        if (o17 == null) {
            o17 = "";
        }
        return o17.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    /* renamed from: ZIDL_U */
    public byte[] m112034x9db8ee0d() {
        java.lang.String o17;
        ((wx.o) this.f297588a).getClass();
        com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
        java.lang.Object obj = new java.util.LinkedList(kz5.b0.c("chatbot_weapp_loading_check_model")).get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) e0Var).Ui("ilinkres_51db20b7", (java.lang.String) obj);
        if (Ui == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotWeAppLoadingCheckModelManager", "udr res null");
            o17 = null;
        } else {
            java.lang.String o18 = new com.p314xaae8f345.mm.vfs.r6(Ui.c(), "ChatBotWeAppLoadingCheckModel").o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
            o17 = new com.p314xaae8f345.mm.vfs.r6(o18, "config.json").o();
        }
        if (o17 == null) {
            o17 = "";
        }
        return o17.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    /* renamed from: ZIDL_VV */
    public void m112035x1964d408(long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i17, byte[] bArr5) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str3 = new java.lang.String(bArr4, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str4 = new java.lang.String(bArr5, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        hy.b0 b0Var = hy.b0.f367261a;
        if (str4.length() == 0) {
            for (hy.a0 a0Var : b0Var.a()) {
                a0Var.f367257d.post(new hy.f(a0Var, str, bArr2, str2, str3, i17));
            }
            return;
        }
        hy.a0 d17 = b0Var.d(str4);
        if (d17 != null) {
            d17.f367257d.post(new hy.f(d17, str, bArr2, str2, str3, i17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatBotVoIPSessionMgr", "forSession: no session found for voipSessionID=".concat(str4));
        }
    }

    /* renamed from: ZIDL_WV */
    public void m112036x1964d427(long j17, byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((wx.o) this.f297588a).getClass();
        for (hy.a0 a0Var : hy.b0.f367261a.a()) {
            a0Var.f367257d.post(new hy.o(a0Var, str));
        }
    }

    /* renamed from: ZIDL_XV */
    public void m112037x1964d446(long j17, int i17, int i18) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w openScene = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w.a(i17);
        ((wx.o) this.f297588a).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openScene, "openScene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotIamCoreCenter", "onShowLinkErrMsgAsync openScene:" + openScene + " errorCode:" + i18);
        for (hy.a0 a0Var : hy.b0.f367261a.a()) {
            a0Var.getClass();
            a0Var.f367257d.post(new hy.t(a0Var, openScene, i18));
        }
    }
}
