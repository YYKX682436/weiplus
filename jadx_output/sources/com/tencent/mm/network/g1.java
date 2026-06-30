package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class g1 extends com.tencent.mm.network.t implements com.tencent.mm.network.f, com.tencent.mm.network.s {
    public static java.lang.String B = "";
    public static java.lang.String C = "";

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mars.comm.MMWakerLock f71991i;

    /* renamed from: m, reason: collision with root package name */
    public final long f71992m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.network.AccInfo f71993n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.network.c2 f71994o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.network.e2 f71995p;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f71999t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.storage.j3 f72000u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.network.f1 f72001v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.network.y f72002w;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f72003x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.network.e0 f72004y;

    /* renamed from: e, reason: collision with root package name */
    public int f71987e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f71988f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f71989g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f71990h = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f71996q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f71997r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f71998s = 0;

    /* renamed from: z, reason: collision with root package name */
    public long f72005z = 0;
    public long A = 0;

    public g1(com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f71991i = null;
        this.f71999t = n3Var == null ? new com.tencent.mm.sdk.platformtools.n3() : n3Var;
        this.f71993n = new com.tencent.mm.network.AccInfo(this);
        com.tencent.mars.comm.MMWakerLock mMWakerLock = new com.tencent.mars.comm.MMWakerLock(com.tencent.mm.network.x2.d(), "MicroMsg.MMAutoAuth");
        this.f71991i = mMWakerLock;
        this.f71992m = M();
        this.f71994o = new com.tencent.mm.network.c2(this, mMWakerLock);
        this.f71995p = new com.tencent.mm.network.e2(this, mMWakerLock);
        this.f72000u = new com.tencent.mm.storage.j3(com.tencent.mm.storage.v3.f196273a + "autoauth.cfg");
    }

    public static long M() {
        return ((com.tencent.mm.plugin.zero.s0) i95.n0.c(com.tencent.mm.plugin.zero.s0.class)).T3();
    }

    public static void d(com.tencent.mm.network.g1 g1Var, com.tencent.mm.network.z0 z0Var, int i17, int i18, java.lang.String str) {
        com.tencent.mm.network.AccInfo accInfo = g1Var.f71993n;
        java.util.Objects.toString(accInfo);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "oreh doAutoAuth ticket:%s, login:%b", str, java.lang.Boolean.valueOf(accInfo.isLogin()));
        com.tencent.mars.xlog.Log.appenderFlush();
        if (accInfo.isLogin() || com.tencent.mm.network.x2.h().h() || com.tencent.mm.network.x2.h().q(z0Var, g1Var.f71994o, g1Var.f71993n, 1, null) >= 0) {
            return;
        }
        g1Var.T(3, -1, "");
    }

    public static int e(com.tencent.mm.network.g1 g1Var, com.tencent.mm.network.z0 z0Var, com.tencent.mm.network.o0 o0Var, int i17) {
        com.tencent.mm.network.ReqInfo Ag;
        g1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "dkcgi sendImp rr.type:%d callback:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(o0Var.hashCode()));
        if (i17 == 126) {
            z0Var.getType();
            com.tencent.mm.network.AccInfo accInfo = new com.tencent.mm.network.AccInfo(g1Var);
            accInfo.f71895e = z0Var.getReqObj().getUserName();
            int q17 = com.tencent.mm.network.x2.h().q(z0Var, o0Var, accInfo, 0, null);
            if (q17 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "register: net.send err");
                return q17;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "register: netid=" + q17);
            return q17;
        }
        if (i17 == 252) {
            int l17 = g1Var.l(z0Var, o0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "summerauths MMFunc_SecManualAuth netId[%s]", java.lang.Integer.valueOf(l17));
            return l17;
        }
        if (i17 == 701) {
            return g1Var.l(z0Var, o0Var);
        }
        z0Var.S6(240);
        try {
            Ag = z0Var.Ag(g1Var.f71993n.f71902o);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAutoAuth", th6, "nonauth exception.", new java.lang.Object[0]);
        }
        if (Ag == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "nonauth: reqInfo empty.");
            return -1;
        }
        int q18 = com.tencent.mm.network.x2.h().q(z0Var, o0Var, g1Var.f71993n, Ag.f71944q == 1 ? 1 : 0, Ag);
        if (q18 >= 0) {
            return q18;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "nonauth: in queue err");
        return q18;
    }

    public static void g(com.tencent.mm.network.g1 g1Var, com.tencent.mm.network.z0 z0Var, int i17, int i18) {
        if (g1Var.f71996q > 0) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = g1Var.f71996q;
            if (60000 >= elapsedRealtime - j17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "getcert lastGetCertSucTime=%d, curtime=%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                g1Var.T(3, -1, "");
                return;
            }
        }
        if (com.tencent.mm.network.x2.h().q(z0Var, g1Var.f71995p, g1Var.f71993n, 0, null) < 0) {
            g1Var.T(3, -1, "");
        }
    }

    public static void j(com.tencent.mm.network.g1 g1Var, int i17) {
        int i18;
        int i19;
        g1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "cancel: netid=" + i17);
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "error netid < 0, " + i17);
            return;
        }
        com.tencent.mm.network.q2 h17 = com.tencent.mm.network.x2.h();
        h17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "stopTask netId=" + i17);
        int i27 = h17.f72128a;
        if (i17 < 0 || i17 >= i27) {
            return;
        }
        synchronized (h17.f72129b) {
            com.tencent.mm.network.p2 p2Var = h17.f72129b[i17];
            if (p2Var != null) {
                i19 = p2Var.f72112k;
                i18 = p2Var.f72113l;
            } else {
                i18 = 0;
                i19 = 0;
            }
        }
        if (i19 != 0) {
            if (com.tencent.paymars.WeChatMars.isEnable() && 2 == i18) {
                ((com.tencent.paymars.stn.StnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.stn.StnManager.class)).stopTask(i19);
            } else {
                ((com.tencent.mars.stn.StnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.stn.StnManager.class)).stopTask(i19);
            }
        }
        synchronized (h17.f72129b) {
            if (h17.f72129b[i17] != null) {
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi stopTask outQueue: netId:%d hash:%d type:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(h17.f72129b[i17].f72108g.getType()), java.lang.Integer.valueOf(h17.f72129b[i17].f72108g.o2()));
                    h17.f72129b[i17] = null;
                } catch (android.os.RemoteException e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
        }
    }

    public void A() {
        this.f71991i.lock(this.f71992m, "MMAutoAuth.forceUpdateHostCache");
        new com.tencent.mm.network.z1(this, 3000L, -1).a(this.f71999t);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public java.lang.String A0() {
        return ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getNetworkServerIp();
    }

    @Override // com.tencent.mm.network.v
    public com.tencent.mm.network.h0 Ai() {
        return com.tencent.mm.network.x2.i();
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void B(java.lang.String str) {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).reportFailIp(str);
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).reportFailIp(str);
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void C(boolean z17) {
        if (com.tencent.mm.sdk.event.d.f192370d == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "loginevent but eventpool null, event:" + z17);
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int D(int[] iArr, boolean z17, long j17, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "uploadLog triggered, timespans: %s, isLogin: %s, uin: %s, beginHour: %s, endHour: %s, commextraInfo: %s, prefix: %s, suffix: %s", java.util.Arrays.toString(iArr), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, str3);
        return ((java.lang.Integer) new com.tencent.mm.network.m1(this, 2000L, null, i17, i18, iArr, z17, j17, str, str2, str3).a(this.f71999t)).intValue();
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int D0(java.lang.String str, boolean z17, java.util.List list) {
        return ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getSnsIpsForSceneWithHostName(list, str, z17);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void F() {
        ((com.tencent.mars.stn.StnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.stn.StnManager.class)).stopSignalling();
    }

    @Override // com.tencent.mm.network.s
    public com.tencent.mm.network.o G() {
        return this.f71993n;
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void H(long j17, long j18) {
        ((com.tencent.mars.stn.StnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.stn.StnManager.class)).setSignallingStrategy(j17, j18);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void I(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "killPush %s", str);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public synchronized int J(com.tencent.mm.network.z0 z0Var, com.tencent.mm.network.o0 o0Var, int i17) {
        try {
            z0Var.S6(235);
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "getProfileEnabled exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        this.f71991i.lock(this.f71992m, "MMAutoAuth.send");
        return ((java.lang.Integer) new com.tencent.mm.network.t1(this, 3000L, -1, z0Var, o0Var, i17).a(this.f71999t)).intValue();
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void J0() {
        ((com.tencent.mars.stn.StnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.stn.StnManager.class)).keepSignalling();
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public java.lang.String[] K() {
        com.tencent.mm.network.AccInfo accInfo = this.f71993n;
        if (accInfo != null) {
            return accInfo.K();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "accinfo is empty");
        return new java.lang.String[2];
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public long L() {
        return ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getMarsTimestamp();
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public byte[] N(int i17, int i18) {
        com.tencent.mars.mm.ConnectRecord[] recentConnectRecords = ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getRecentConnectRecords(i17, i18);
        if (recentConnectRecords != null && recentConnectRecords.length != 0) {
            try {
                return com.tencent.mars.mm.ConnectRecordSerializer.serialize(recentConnectRecords);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", e17.getLocalizedMessage());
            }
        }
        return null;
    }

    @Override // com.tencent.mm.network.v
    public void Nd(com.tencent.mm.network.f1 f1Var) {
        this.f72001v = f1Var;
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int P(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, com.tencent.mm.network.c1 c1Var) {
        return ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).doLiveSpeedTest(str, i17, i18, i19, i27, bArr, bArr2, c1Var);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public java.lang.String[] P0(java.lang.String str) {
        com.tencent.mars.mm.NetworkIdInfo networkId = ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getNetworkId(str);
        java.lang.String[] strArr = new java.lang.String[3];
        if (networkId != null) {
            byte[] bArr = networkId.networkId;
            if (bArr != null) {
                strArr[0] = new java.lang.String(bArr);
            } else {
                strArr[0] = "";
            }
            byte[] bArr2 = networkId.ctx;
            if (bArr2 != null) {
                strArr[1] = new java.lang.String(bArr2);
            } else {
                strArr[1] = "";
            }
            byte[] bArr3 = networkId.clientIp;
            if (bArr3 != null) {
                strArr[2] = new java.lang.String(bArr3);
            } else {
                strArr[2] = "";
            }
        } else {
            strArr[0] = "";
            strArr[1] = "";
            strArr[2] = "";
        }
        return strArr;
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void Q(java.lang.String[] strArr, int[] iArr) {
        this.f71991i.lock(this.f71992m, "MMAutoAuth.setMMTlsHostInfo");
        new com.tencent.mm.network.q1(this, 1000L, null, strArr, iArr).a(this.f71999t);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int Q0(int i17) {
        return ((java.lang.Integer) new com.tencent.mm.network.n1(this, 2000L, null, i17).a(this.f71999t)).intValue();
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void R(boolean z17) {
        new com.tencent.mm.network.u1(this, 3000L, -1, z17).a(this.f71999t);
    }

    public byte[] S() {
        byte[] bArr;
        byte[] bArr2;
        com.tencent.mm.network.AccInfo accInfo = this.f71993n;
        if (!accInfo.isLogin()) {
            return null;
        }
        boolean a17 = o45.ji.a();
        w11.b2 b2Var = w11.c2.f441991a;
        if (!a17) {
            o45.gi giVar = new o45.gi();
            giVar.f342938d = accInfo.f71902o;
            giVar.f342935a = b2Var.a();
            giVar.f342936b = o45.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            giVar.f342937c = o45.a.b();
            com.tencent.mars.mm.NetworkIdInfo networkId = ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getNetworkId("synccheck");
            if (networkId == null || (bArr = networkId.networkId) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "network id is empty");
            } else {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(bArr.length);
                byte[] bArr3 = networkId.ctx;
                objArr[1] = java.lang.Integer.valueOf(bArr3 == null ? 0 : bArr3.length);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "getnetworkid, id length: %d, ctx length %d,", objArr);
                giVar.f342940f = networkId.networkId;
                byte[] bArr4 = networkId.ctx;
                if (bArr4 != null) {
                    giVar.f342942h = bArr4;
                    giVar.f342941g = bArr4.length;
                } else {
                    giVar.f342941g = 0;
                }
            }
            try {
                byte[] protoBuf = giVar.toProtoBuf();
                this.f72003x = giVar.f342939e;
                return protoBuf;
            } catch (java.lang.Exception e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                return null;
            }
        }
        o45.fi fiVar = new o45.fi();
        fiVar.f342929d = accInfo.f71902o & io.flutter.embedding.android.KeyboardMap.kValueMask;
        fiVar.f342926a = b2Var.a();
        int i17 = o45.wf.f343023a;
        com.tencent.mm.sdk.platformtools.m2.d();
        fiVar.f342927b = o45.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        fiVar.f342928c = o45.a.b();
        com.tencent.mars.mm.NetworkIdInfo networkId2 = ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getNetworkId("synccheck");
        if (networkId2 == null || (bArr2 = networkId2.networkId) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "synccheck3 network id is empty");
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = java.lang.Integer.valueOf(bArr2.length);
            byte[] bArr5 = networkId2.ctx;
            objArr2[1] = java.lang.Integer.valueOf(bArr5 != null ? bArr5.length : 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "synccheck3 getnetworkid3, id length: %d, ctx length %d,", objArr2);
            fiVar.f342931f = networkId2.networkId;
            byte[] bArr6 = networkId2.ctx;
            if (bArr6 != null) {
                fiVar.f342932g = bArr6;
            }
        }
        try {
            byte[] protoBuf2 = fiVar.toProtoBuf();
            this.f72003x = fiVar.f342930e;
            return protoBuf2;
        } catch (java.lang.Exception e18) {
            jx3.f.INSTANCE.idkeyStat(2143L, 0L, 1L, true);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "synccheck3 exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            return null;
        }
    }

    public final void T(int i17, int i18, java.lang.String str) {
        int i19;
        int i27 = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("summerauth handleAutoAuthFail inErrType=");
        sb6.append(i27);
        sb6.append(", inErrCode=");
        sb6.append(i18);
        sb6.append(", errMsg=");
        sb6.append(str);
        sb6.append(" stack=");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", sb6.toString());
        int i28 = -3;
        if (i27 == 4 && (i18 == -106 || i18 == -3 || i18 == -5)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth errCode %s should be transfer to MM_ERR_AUTH_ANOTHERPLACE", java.lang.Integer.valueOf(i18));
            i19 = -100;
        } else {
            i19 = i18;
        }
        if (i27 == 5 && i18 == -13) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth should not be return MM_ERR_SESSIONTIMEOUT trans to MM_ERR_PASSWORD");
            U();
            jx3.f.INSTANCE.idkeyStat(148L, 42L, 1L, false);
            i27 = 4;
        } else {
            i28 = i19;
        }
        if ((i27 == 6 && i18 == -10001) || (i27 == 5 && i18 != -13)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth ENCODE ERROR check sp");
            android.content.SharedPreferences a17 = c01.h9.a();
            java.lang.String string = a17.getString("_auth_key", "");
            java.lang.String string2 = a17.getString("server_id", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string) && com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth ENCODE ERROR check sp aak and cookie null logout");
                jx3.f.INSTANCE.idkeyStat(148L, 52L, 1L, false);
                i28 = -104;
                i27 = 4;
            }
        }
        com.tencent.mm.network.x2.h().e(i27, i28, str);
        if (i27 == 4) {
            if (i28 == -100 || i28 == -2023 || i28 == -205 || i28 == -213) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_hold_prefs", 0).edit().putBoolean("auth_ishold", true).commit();
                reset();
            }
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int T0(java.lang.String str, int i17, int i18, java.util.List list) {
        return ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).combineGetHostIps(str, i17, i18, list);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void U() {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).clearMMtlsForbidenHostAndPsk();
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).clearMMtlsForbidenHostAndPsk();
        }
    }

    @Override // com.tencent.mm.network.v
    public void Uh(o45.mi miVar) {
        com.tencent.mm.network.q2 h17 = com.tencent.mm.network.x2.h();
        com.tencent.mm.network.p2[] p2VarArr = h17.f72129b;
        for (int i17 = 0; i17 < h17.f72128a; i17++) {
            try {
                com.tencent.mm.network.p2 p2Var = p2VarArr[i17];
                if (p2Var != null) {
                    p2Var.f72108g.getType();
                }
            } catch (android.os.RemoteException e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s, remove index:%d", com.tencent.mm.sdk.platformtools.z3.c(e17), java.lang.Integer.valueOf(i17));
                p2VarArr[i17] = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean V(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.network.g1.V(java.lang.String):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:92|(11:99|(3:(2:104|105)|106|105)|107|108|109|110|(1:112)|113|(1:123)(1:117)|118|(1:120))|127|(0)|107|108|109|110|(0)|113|(1:115)|123|118|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02cc, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", r0.getLocalizedMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02db A[Catch: RemoteException -> 0x0400, TryCatch #0 {RemoteException -> 0x0400, blocks: (B:84:0x01c4, B:87:0x0241, B:90:0x024c, B:92:0x0252, B:105:0x02b2, B:107:0x02bc, B:110:0x02d3, B:112:0x02db, B:113:0x02e6, B:115:0x02f0, B:117:0x02fa, B:118:0x0332, B:120:0x03da, B:123:0x032c, B:126:0x02cc, B:128:0x03e6, B:129:0x0248, B:130:0x023d, B:109:0x02c3), top: B:83:0x01c4, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03da A[Catch: RemoteException -> 0x0400, TryCatch #0 {RemoteException -> 0x0400, blocks: (B:84:0x01c4, B:87:0x0241, B:90:0x024c, B:92:0x0252, B:105:0x02b2, B:107:0x02bc, B:110:0x02d3, B:112:0x02db, B:113:0x02e6, B:115:0x02f0, B:117:0x02fa, B:118:0x0332, B:120:0x03da, B:123:0x032c, B:126:0x02cc, B:128:0x03e6, B:129:0x0248, B:130:0x023d, B:109:0x02c3), top: B:83:0x01c4, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W(int r30, int r31, int r32, java.lang.String r33, com.tencent.mm.network.z0 r34, byte[] r35, int r36) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.network.g1.W(int, int, int, java.lang.String, com.tencent.mm.network.z0, byte[], int):void");
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void W0(java.lang.String str) {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).setDebugHost(str);
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).setDebugHost(str);
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void X(boolean z17) {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).switchProcessActiveState(z17);
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).switchProcessActiveState(z17);
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void Y(boolean z17) {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).forceUseV6(z17);
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).forceUseV6(z17);
        }
    }

    public void Z(r45.wc wcVar, final long j17, final com.tencent.mm.network.a2 a2Var) {
        java.util.LinkedList linkedList;
        int i17;
        ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).updateAxAuthSecRespList(wcVar.getData());
        if (wcVar.f389057d == 0 || (linkedList = wcVar.f389058e) == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "ax host list is null");
            com.tencent.mm.network.AccInfo accInfo = this.f71993n;
            accInfo.I = true;
            accInfo.M();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "ax host list size [%d] scene [%s]", java.lang.Integer.valueOf(wcVar.f389057d), a2Var.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        final java.util.LinkedList linkedList2 = wcVar.f389058e;
        com.tencent.mm.network.AccInfo accInfo2 = this.f71993n;
        int size = linkedList2.size();
        long j18 = accInfo2.f71899i;
        if (j17 != j18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AccInfo", "setAxAuthRequestingCount timestamp mismatch, need:%s, income:%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
        } else {
            synchronized (accInfo2) {
                accInfo2.f71913z = size;
            }
        }
        if (linkedList2.isEmpty()) {
            com.tencent.mm.network.AccInfo accInfo3 = this.f71993n;
            accInfo3.I = true;
            accInfo3.M();
        }
        java.util.Iterator it = linkedList2.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            r45.vc vcVar = (r45.vc) it.next();
            r45.kx3 kx3Var = vcVar.f388090f;
            if (kx3Var != null) {
                try {
                    this.f71993n.Y0(vcVar.f388088d, true, j17);
                    this.f71993n.d(vcVar.f388088d, kx3Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAutoAuth", e17, "", new java.lang.Object[0]);
                }
            }
            a0(arrayList, arrayList2, arrayList3, kx3Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "after parse ax host list size [%d]", java.lang.Integer.valueOf(arrayList.size()));
        if (arrayList.size() > 0) {
            java.lang.String[] strArr = new java.lang.String[arrayList.size()];
            java.lang.String[] strArr2 = new java.lang.String[arrayList2.size()];
            int[] iArr = new int[arrayList3.size()];
            arrayList.toArray(strArr);
            arrayList2.toArray(strArr2);
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                iArr[i17] = ((java.lang.Integer) arrayList3.get(((java.lang.Integer) it6.next()).intValue())).intValue();
                i17++;
            }
            this.f71991i.lock(this.f71992m, "MMAutoAuth.addHostInfo");
            new com.tencent.mm.network.k1(this, 1000L, null, strArr, strArr2, iArr).a(this.f71999t);
        }
        boolean l17 = j62.e.g().l("clicfg_a2auth_run_sub_process", true, true, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "is_a2auth_run_sub_process %b", java.lang.Boolean.valueOf(l17));
        if (l17) {
            new com.tencent.mm.sdk.platformtools.n3("AxAuthScene").post(new java.lang.Runnable() { // from class: com.tencent.mm.network.g1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.network.g1.this.p(j17, a2Var, linkedList2);
                }
            });
        } else {
            p(j17, a2Var, linkedList2);
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int Z0(java.lang.String str, int i17, long j17, java.lang.String str2, java.lang.String str3) {
        return ((java.lang.Integer) new com.tencent.mm.network.l1(this, 2000L, null, str, i17, j17, str2, str3).a(this.f71999t)).intValue();
    }

    public final void a0(java.util.List list, java.util.List list2, java.util.List list3, r45.kx3 kx3Var) {
        java.util.LinkedList linkedList;
        if (kx3Var == null || (linkedList = kx3Var.f379024e) == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "host list size is zero");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "autoauth parse hostlist size [%d]", java.lang.Integer.valueOf(linkedList.size()));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.hx3 hx3Var = (r45.hx3) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "parse hostlist host org:%s sub:%s", hx3Var.f376535d, hx3Var.f376536e);
            list.add(hx3Var.f376535d);
            list2.add(hx3Var.f376536e);
            list3.add(java.lang.Integer.valueOf(hx3Var.f376537f));
            if (hx3Var.f376535d.equals(com.tencent.mm.network.k.f72055a)) {
                C = hx3Var.f376536e;
            }
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int ackActionNotify(java.lang.String str, long j17, int i17) {
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).mmAckActionNotify(str, j17, i17);
        }
        return ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).mmAckActionNotify(str, j17, i17);
    }

    public final boolean b0(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(str == null ? -1 : str.length());
        objArr[1] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "summerauths saveAAKAndCookieToSp aak[%s] uin[%s]", objArr);
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_hold_prefs", 0).edit().remove("auth_ishold").commit();
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4);
        boolean z17 = sharedPreferences.getBoolean("key_auth_info_prefs_created", false);
        int i18 = sharedPreferences.getInt("key_auth_update_version", 0);
        int i19 = sharedPreferences.getInt("_auth_uin", 0);
        java.lang.String string = sharedPreferences.getString("_auth_key", "");
        java.lang.String string2 = sharedPreferences.getString("server_id", "");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("key_auth_info_prefs_created", true);
        edit.putInt("key_auth_update_version", o45.wf.f343029g);
        edit.putInt("_auth_uin", i17);
        edit.putString("_auth_key", str);
        edit.putString("server_id", str2);
        if (!edit.commit()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed 1th!");
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(148L, 36L, 1L, false);
            if (!edit.commit()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed 2nd!");
                fVar.idkeyStat(148L, 37L, 1L, false);
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed 2th so ret false old vs new vs input create[%b, %b, %b] version[%d, %d, %d], uin[%d, %d, %d], aak[%s, %s, %s], cookie[%s, %s, %s]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(sharedPreferences.getBoolean("key_auth_info_prefs_created", false)), java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(sharedPreferences.getInt("key_auth_update_version", 0)), java.lang.Integer.valueOf(o45.wf.f343029g), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(sharedPreferences.getInt("_auth_uin", 0)), java.lang.Integer.valueOf(i17), string, sharedPreferences.getString("_auth_key", ""), str, string2, sharedPreferences.getString("server_id", ""), str2);
                com.tencent.mars.xlog.Log.appenderFlush();
                return false;
            }
        }
        boolean z18 = sharedPreferences.getBoolean("key_auth_info_prefs_created", false);
        int i27 = sharedPreferences.getInt("key_auth_update_version", 0);
        int i28 = sharedPreferences.getInt("_auth_uin", 0);
        java.lang.String string3 = sharedPreferences.getString("_auth_key", "");
        java.lang.String string4 = sharedPreferences.getString("server_id", "");
        if (!z18 || i27 != o45.wf.f343029g || i28 != i17 || !string3.equals(str) || !string4.equals(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed check not equal so ret false old vs new vs input create[%b, %b, %b] version[%d, %d, %d], uin[%d, %d, %d], aak[%s, %s, %s], cookie[%s, %s, %s]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(o45.wf.f343029g), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i17), string, string3, str, string2, string4, str2);
            com.tencent.mars.xlog.Log.appenderFlush();
            return false;
        }
        com.tencent.mm.storage.j3 j3Var = this.f72000u;
        synchronized (j3Var) {
            j3Var.f195048h = true;
        }
        this.f72000u.f(1, java.lang.Integer.valueOf(o45.wf.f343029g));
        this.f72000u.f(2, java.lang.Integer.valueOf(i17));
        this.f72000u.f(3, str);
        this.f72000u.f(4, str2);
        com.tencent.mm.storage.j3 j3Var2 = this.f72000u;
        synchronized (j3Var2) {
            j3Var2.f195048h = false;
            j3Var2.j();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "summerauth save aak & id ok old vs new vs input[%b, %b, %b, %b] version[%d, %d, %d. %d], uin[%d, %d, %d, %d], aak[%s, %s, %s, %s], cookie[%s, %s, %s, %s]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(!this.f72000u.f195044d), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(o45.wf.f343029g), (java.lang.Integer) this.f72000u.a(1), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i17), (java.lang.Integer) this.f72000u.a(2), string, string3, str, (java.lang.String) this.f72000u.a(3), string2, string4, str2, (java.lang.String) this.f72000u.a(4));
        return true;
    }

    public final void c0(byte[] bArr, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            return;
        }
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(bArr);
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4);
        if (!sharedPreferences.edit().putString("server_index_buffer", l17).commit()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "mmpack summerauth save serverIndexBuffer commit failed, retry");
            if (!sharedPreferences.edit().putString("server_index_buffer", l17).commit()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "mmpack summerauth save serverIndexBuffer commit failed 2nd, skip autoauthcfg");
                return;
            }
        }
        java.lang.String string = sharedPreferences.getString("server_index_buffer", "");
        if (!l17.equals(string)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "mmpack summerauth save serverIndexBuffer verify failed, written[%d] read[%d]", java.lang.Integer.valueOf(l17.length()), java.lang.Integer.valueOf(string.length()));
            return;
        }
        com.tencent.mm.storage.j3 j3Var = this.f72000u;
        synchronized (j3Var) {
            j3Var.f195048h = true;
        }
        j3Var.f(5, l17);
        synchronized (j3Var) {
            j3Var.f195048h = false;
            j3Var.j();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "mmpack summerauth save serverIndexBuffer ok len[%d] uin[%d]", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void d0(int i17) {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).setMMtlsRegion(i17);
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).setMMtlsRegion(i17);
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void d1() {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).startNetworkAnalysis();
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int e0() {
        return ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getMMtlsRegion();
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public java.lang.String[] e1(boolean z17) {
        return ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getIPsString(z17);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void f1(com.tencent.mm.network.b0 b0Var) {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).removeMMNetCommonCallback(b0Var);
    }

    public void finalize() {
        reset();
        super.finalize();
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public boolean g0() {
        return this.f71987e < 5;
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int getHostByName(java.lang.String str, java.util.List list) {
        return ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getHostByName(str, list);
    }

    public boolean h0() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f71989g;
        if (90000 >= elapsedRealtime - j17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "auto limit lastSessionTimeout=%d, curtime=%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "sessionTimeOut");
        this.f71989g = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.network.AccInfo accInfo = this.f71993n;
        accInfo.E(new byte[0], new byte[0], new byte[0], accInfo.f71902o, 0L);
        this.f71993n.i0();
        ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).setOriginalSessionKey(null);
        ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).updateMainSessionKey(null, null);
        ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).updateMainHostAlgo(null);
        ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).clearAxSession();
        return true;
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void h1(com.tencent.mm.network.b0 b0Var) {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).addMMNetCommonCallback(b0Var);
    }

    @Override // com.tencent.mm.network.v
    public void hh(com.tencent.mm.network.e0 e0Var) {
        this.f72004y = e0Var;
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void i1(int i17) {
        this.f71991i.lock(this.f71992m, java.lang.String.format("MMAutoAuth.cancel,%d", java.lang.Integer.valueOf(i17)));
        new com.tencent.mm.network.r1(this, 1000L, null, i17).a(this.f71999t);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void j0(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        this.f71991i.lock(this.f71992m, "MMAutoAuth.setHostInfo");
        if (strArr2 != null && strArr2.length > 0) {
            com.tencent.mm.network.AccInfo accInfo = this.f71993n;
            synchronized (accInfo.A) {
                accInfo.A.clear();
            }
            for (java.lang.String str : strArr2) {
                com.tencent.mm.network.AccInfo accInfo2 = this.f71993n;
                byte[] bytes = str.getBytes();
                synchronized (accInfo2.A) {
                    accInfo2.A.add(new java.lang.String(bytes));
                }
            }
        }
        new com.tencent.mm.network.j1(this, 1000L, null, strArr, strArr2, iArr).a(this.f71999t);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void j1(u31.c cVar) {
        com.tencent.mm.network.x2.g().f72184a = cVar;
    }

    public void k() {
        boolean l17 = j62.e.g().l("clicfg_pay_mmtls_switch_android", false, true, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "paymmtls: MMAutoAuth clicfg_pay_mmtls_switch_android: %s", java.lang.Boolean.valueOf(l17));
        if (l17 && com.tencent.paymars.WeChatMars.isEnable()) {
            com.tencent.mm.network.AccInfo accInfo = this.f71993n;
            new com.tencent.mm.network.o1(this, 1000L, null, accInfo.H, accInfo.G, accInfo.F).a(this.f71999t);
        }
    }

    public void k0(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.N0(new java.lang.String[0])) {
            return;
        }
        new com.tencent.mm.network.y1(this, 1000L, null, str, str2).a(this.f71999t);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void k1(java.lang.String str, java.lang.String str2, int[] iArr, int[] iArr2) {
        this.f71991i.lock(this.f71992m, "MMAutoAuth.setIDCHostInfo");
        java.util.List<o45.hh> d17 = o45.hh.d(str2);
        java.util.List<o45.hh> d18 = o45.hh.d(str);
        ((java.util.LinkedList) d18).size();
        ((java.util.LinkedList) d17).size();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (o45.hh hhVar : d17) {
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(hhVar.f342946d);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                hashMap.put(hhVar.f342946d, arrayList);
            }
            arrayList.add(hhVar.f342945c);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (o45.hh hhVar2 : d18) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) hashMap2.get(hhVar2.f342946d);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                hashMap2.put(hhVar2.f342946d, arrayList2);
            }
            arrayList2.add(hhVar2.f342945c);
        }
        new com.tencent.mm.network.v1(this, 3000L, -1, hashMap, iArr2, hashMap2, iArr).a(this.f71999t);
    }

    @Override // com.tencent.mm.network.v
    public void ke(com.tencent.mm.network.y yVar) {
        this.f72002w = yVar;
    }

    public final int l(com.tencent.mm.network.z0 z0Var, com.tencent.mm.network.o0 o0Var) {
        if (com.tencent.mm.network.x2.h().h()) {
            return -1;
        }
        o45.hg reqObj = z0Var.getReqObj();
        com.tencent.mm.network.AccInfo accInfo = new com.tencent.mm.network.AccInfo(this);
        accInfo.f71895e = reqObj.getUserName();
        int q17 = com.tencent.mm.network.x2.h().q(z0Var, o0Var, accInfo, 0, null);
        if (q17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "auth: net.send err");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "auth: netid=" + q17);
        }
        return q17;
    }

    public void l0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f71991i.lock(this.f71992m, "MMAutoAuth.setFixedHost");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "dkidc setFixedHost debug short:%s:%s long:%s:%s", str, str2, str3, str4);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "dkidc setFixedHost FAILED ! check assist");
        } else {
            new com.tencent.mm.network.w1(this, 3000L, -1, str, str2, str3, str4).a(this.f71999t);
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void m0() {
        com.tencent.mars.xlog.Log.appenderFlush();
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void n0(boolean z17) {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).reportV6Status(z17);
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).reportV6Status(z17);
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void n1(boolean z17) {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).setMmtlsCtrlInfo(z17);
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).setMmtlsCtrlInfo(z17);
        }
    }

    public final void o0(byte[] bArr, long j17, int i17) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "newreg parseHostInfo");
        try {
            r45.zv4 zv4Var = new r45.zv4();
            zv4Var.parseFrom(bArr);
            jx3.f.INSTANCE.idkeyStat(148L, 23L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "newreg start to parse main hostlist");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            a0(arrayList, arrayList2, arrayList3, zv4Var.A);
            int size = arrayList.size();
            java.lang.String[] strArr = new java.lang.String[size];
            java.lang.String[] strArr2 = new java.lang.String[arrayList2.size()];
            int[] iArr = new int[arrayList3.size()];
            arrayList.toArray(strArr);
            arrayList2.toArray(strArr2);
            java.util.Iterator it = arrayList3.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                iArr[i18] = ((java.lang.Integer) arrayList3.get(((java.lang.Integer) it.next()).intValue())).intValue();
                i18++;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "after parse main host list size [%d]", java.lang.Integer.valueOf(size));
            j0(strArr, strArr2, iArr);
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            r45.jo joVar = zv4Var.f392399p;
            if (joVar != null && (linkedList2 = joVar.f377985h) != null) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    r45.io ioVar = (r45.io) it6.next();
                    com.tencent.mm.protobuf.g gVar = ioVar.f377205g;
                    linkedList3.add(new o45.hh(ioVar.f377202d, ioVar.f377204f.i(), ioVar.f377203e, gVar != null ? gVar.i() : ""));
                    ioVar.f377204f.i();
                }
            }
            java.lang.String c17 = o45.hh.c(linkedList3);
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            r45.jo joVar2 = zv4Var.f392399p;
            if (joVar2 != null && (linkedList = joVar2.f377984g) != null) {
                java.util.Iterator it7 = linkedList.iterator();
                while (it7.hasNext()) {
                    r45.io ioVar2 = (r45.io) it7.next();
                    com.tencent.mm.protobuf.g gVar2 = ioVar2.f377205g;
                    linkedList4.add(new o45.hh(ioVar2.f377202d, ioVar2.f377204f.i(), ioVar2.f377203e, gVar2 != null ? gVar2.i() : ""));
                    ioVar2.f377204f.i();
                }
            }
            java.lang.String c18 = o45.hh.c(linkedList4);
            r45.rt4 rt4Var = zv4Var.f392403t;
            o45.gh b17 = (rt4Var == null || (str = rt4Var.f385201d) == null) ? null : o45.hh.b(str);
            if (b17 != null) {
                b17.getClass();
                k1(c17, c18, null, b17.f342934a);
            }
            r45.wc wcVar = zv4Var.R;
            if (wcVar.f389057d <= 0 || wcVar.f389058e.isEmpty()) {
                o45.b bVar = new o45.b(0, -1, -1, -1, -1, -1, "");
                jx3.f.INSTANCE.f(32791, bVar.b(), true, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "AxAuth Report %s", bVar.a());
            } else {
                Z(zv4Var.R, j17, com.tencent.mm.network.a2.REG);
            }
            r45.cu5 cu5Var = zv4Var.S;
            if (cu5Var == null || cu5Var.f371839d <= 0) {
                return;
            }
            byte[] bArr2 = cu5Var.f371841f.f192156a;
            if (com.tencent.mm.sdk.platformtools.t8.M0(bArr2)) {
                return;
            }
            ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).updateServerIndex(bArr2);
            this.f71993n.f71901n = bArr2;
            c0(bArr2, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", e17.getLocalizedMessage());
        }
    }

    public final void p(long j17, final com.tencent.mm.network.a2 a2Var, final java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            final r45.vc vcVar = (r45.vc) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "axauth start. cgi:%s id:%d", vcVar.f388093i, java.lang.Integer.valueOf(vcVar.f388091g));
            int i17 = vcVar.f388088d;
            int doScene = new w11.b0(i17, vcVar.f388091g, vcVar.f388093i, i17, vcVar.f388089e, vcVar.f388092h.f371841f.f192156a, 0, j17).doScene(this, new com.tencent.mm.modelbase.u0() { // from class: com.tencent.mm.network.g1$$c
                @Override // com.tencent.mm.modelbase.u0
                public final void onSceneEnd(int i18, int i19, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
                    if (com.tencent.mm.network.a2.this == com.tencent.mm.network.a2.REG) {
                        int size = linkedList.size();
                        r45.vc vcVar2 = vcVar;
                        o45.b bVar = new o45.b(size, 0, i19, i18, vcVar2.f388088d, vcVar2.f388091g, vcVar2.f388093i);
                        jx3.f.INSTANCE.f(32791, bVar.b(), true, true);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "AxAuth Report %s", bVar.a());
                    }
                }
            });
            if (doScene < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "send axauth fail");
                this.f71993n.Y0(vcVar.f388088d, false, j17);
                if (a2Var == com.tencent.mm.network.a2.REG) {
                    o45.b bVar = new o45.b(linkedList.size(), doScene, -1, -1, vcVar.f388088d, vcVar.f388091g, vcVar.f388093i);
                    jx3.f.INSTANCE.f(32791, bVar.b(), true, true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "AxAuth Report %s", bVar.a());
                }
            }
        }
    }

    public final void p0(byte[] bArr, long j17) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "autoauth parseHostInfo");
        if (bArr == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "null == response");
            return;
        }
        r45.sr6 sr6Var = new r45.sr6();
        try {
            sr6Var.parseFrom(bArr);
            int i17 = sr6Var.f385951d;
            if ((i17 & 4) != 0) {
                jx3.f.INSTANCE.idkeyStat(148L, 23L, 1L, false);
                r45.vt4 vt4Var = sr6Var.f385954g;
                if (vt4Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "autoauth start to parse main hostlist");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    a0(arrayList, arrayList2, arrayList3, vt4Var.f388517d);
                    int size = arrayList.size();
                    java.lang.String[] strArr = new java.lang.String[size];
                    java.lang.String[] strArr2 = new java.lang.String[arrayList2.size()];
                    int[] iArr = new int[arrayList3.size()];
                    arrayList.toArray(strArr);
                    arrayList2.toArray(strArr2);
                    java.util.Iterator it = arrayList3.iterator();
                    int i18 = 0;
                    while (it.hasNext()) {
                        iArr[i18] = ((java.lang.Integer) arrayList3.get(((java.lang.Integer) it.next()).intValue())).intValue();
                        i18++;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "after parse main host list size [%d]", java.lang.Integer.valueOf(size));
                    j0(strArr, strArr2, iArr);
                    java.util.LinkedList linkedList3 = new java.util.LinkedList();
                    r45.jo joVar = vt4Var.f388519f;
                    if (joVar != null && (linkedList2 = joVar.f377985h) != null) {
                        java.util.Iterator it6 = linkedList2.iterator();
                        while (it6.hasNext()) {
                            r45.io ioVar = (r45.io) it6.next();
                            com.tencent.mm.protobuf.g gVar = ioVar.f377205g;
                            linkedList3.add(new o45.hh(ioVar.f377202d, ioVar.f377204f.i(), ioVar.f377203e, gVar != null ? gVar.i() : ""));
                            ioVar.f377204f.i();
                        }
                    }
                    java.lang.String c17 = o45.hh.c(linkedList3);
                    java.util.LinkedList linkedList4 = new java.util.LinkedList();
                    r45.jo joVar2 = vt4Var.f388519f;
                    if (joVar2 != null && (linkedList = joVar2.f377984g) != null) {
                        java.util.Iterator it7 = linkedList.iterator();
                        while (it7.hasNext()) {
                            r45.io ioVar2 = (r45.io) it7.next();
                            com.tencent.mm.protobuf.g gVar2 = ioVar2.f377205g;
                            linkedList4.add(new o45.hh(ioVar2.f377202d, ioVar2.f377204f.i(), ioVar2.f377203e, gVar2 != null ? gVar2.i() : ""));
                            ioVar2.f377204f.i();
                        }
                    }
                    java.lang.String c18 = o45.hh.c(linkedList4);
                    r45.rt4 rt4Var = vt4Var.f388518e;
                    o45.gh b17 = (rt4Var == null || (str = rt4Var.f385201d) == null) ? null : o45.hh.b(str);
                    if (b17 != null) {
                        k1(c17, c18, null, b17.f342934a);
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "summerauth updateProfile networksect not set!");
            }
            r45.jx3 jx3Var = sr6Var.f385956i;
            com.tencent.mm.network.AccInfo accInfo = this.f71993n;
            int length = accInfo.r(1).length;
            int length2 = accInfo.r(2).length;
            int length3 = accInfo.r(3).length;
            ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).setOriginalSessionKey(accInfo.r(1));
            ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).updateMainSessionKey(accInfo.r(2), accInfo.r(3));
            ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).updateMainHostAlgo(jx3Var.getData());
            java.util.LinkedList linkedList5 = jx3Var.f378198e;
            if (linkedList5 == null || jx3Var.f378197d == 0 || linkedList5.size() <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "handleHostAlgo ignore. empty list");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AccInfo", "cleanMainHostAlgo");
                accInfo.B.clear();
                java.util.Iterator it8 = linkedList5.iterator();
                while (it8.hasNext()) {
                    r45.ix3 ix3Var = (r45.ix3) it8.next();
                    accInfo.e(ix3Var.f377389d, ix3Var.f377390e);
                }
            }
            if ((i17 & 8) != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "autoauth start to parse ax hostlist");
                Z(sr6Var.f385955h, j17, com.tencent.mm.network.a2.AUTH);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "autoauth no need parse ax hostlist");
                accInfo.I = true;
                accInfo.M();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", e17.getLocalizedMessage());
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void p1(java.lang.String str, java.lang.String str2, int i17) {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).setCgiDebugIP(str, str2, i17);
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).setCgiDebugIP(str, str2, i17);
        }
    }

    public final void q0(byte[] bArr) {
        r45.vt4 vt4Var;
        r45.xb xbVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "ILinkStreamSession setILinkInfo to accinfo");
        if (bArr == null || bArr.length == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "setILinkInfo: response is null or empty");
            return;
        }
        r45.sr6 sr6Var = new r45.sr6();
        try {
            sr6Var.parseFrom(bArr);
            int i17 = sr6Var.f385951d;
            int i18 = i17 & 1;
            com.tencent.mm.network.AccInfo accInfo = this.f71993n;
            if (i18 == 0 || (xbVar = sr6Var.f385952e) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "setILinkInfo: AuthSect not set or missing in response. unifyFlag:%d", java.lang.Integer.valueOf(i17));
            } else {
                r45.cu5 cu5Var = xbVar.F;
                if (cu5Var == null || cu5Var.f371839d <= 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "setILinkInfo: JWT data not set in AuthSectResp");
                } else {
                    accInfo.f71907t = cu5Var.f371841f.f192156a;
                }
            }
            if ((i17 & 4) == 0 || (vt4Var = sr6Var.f385954g) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "setILinkInfo: NetworkSect not set or missing in response. unifyFlag:%d", java.lang.Integer.valueOf(i17));
                return;
            }
            r45.cu5 cu5Var2 = vt4Var.f388522i;
            if (cu5Var2 == null || cu5Var2.f371839d <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "setILinkInfo: iLink network buffer not set in NetworkSectResp");
            } else {
                accInfo.f71908u = cu5Var2.f371841f.f192156a;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "setILinkInfo: parse response failed: " + e17.getLocalizedMessage());
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void q1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).setNetIdAndIsp(str, str2, str3);
    }

    public void r0(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        new com.tencent.mm.network.x1(this, 1000L, null, str, str2).a(this.f71999t);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void r1(boolean z17) {
        com.tencent.mm.sdk.platformtools.m2.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void reset() {
        this.f71991i.lock(this.f71992m, "MMAutoAuth.reset");
        new com.tencent.mm.network.s1(this, 1000L, null).a(this.f71999t);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void s0(java.lang.String str) {
        B = str;
    }

    @Override // com.tencent.mm.network.s
    public com.tencent.mm.network.h0 s1() {
        return null;
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void simpleTestCommand(java.lang.String str) {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).simpleTestCommand(str);
    }

    public final void t0(byte[] bArr, int i17) {
        if (bArr == null || bArr.length == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "mmpack setServerIndexBuffer: response is null or empty");
            return;
        }
        r45.sr6 sr6Var = new r45.sr6();
        try {
            sr6Var.parseFrom(bArr);
            r45.cu5 cu5Var = sr6Var.f385958n;
            if (cu5Var == null || cu5Var.f371839d <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "mmpack setServerIndexBuffer: ServerIndexBuffer not set in response");
                return;
            }
            byte[] bArr2 = cu5Var.f371841f.f192156a;
            if (com.tencent.mm.sdk.platformtools.t8.M0(bArr2)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "mmpack setServerIndexBuffer: buffer bytes is null or empty");
                return;
            }
            ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).updateServerIndex(bArr2);
            this.f71993n.f71901n = bArr2;
            c0(bArr2, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "mmpack setServerIndexBuffer: parse response failed: " + e17.getLocalizedMessage());
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void u0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "mmpack recoverySession uin");
        com.tencent.mars.account.AccountManager accountManager = (com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class);
        com.tencent.mm.network.AccInfo accInfo = this.f71993n;
        accountManager.setMainHostServerId(accInfo.f71900m);
        byte[] bArr = accInfo.f71901n;
        if (!com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).updateServerIndex(bArr);
        }
        ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).setOriginalSessionKey(accInfo.r(1));
        ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).updateMainSessionKey(accInfo.r(2), accInfo.r(3));
    }

    public void w(int i17, int i18, java.lang.String str, com.tencent.mm.network.z0 z0Var, byte[] bArr, int i19) {
        try {
            W(0, i17, i18, str, z0Var, bArr, i19);
        } catch (android.os.RemoteException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public void w0(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "synccheck response is empty");
            return;
        }
        java.lang.String str = "empty";
        boolean z17 = false;
        if (o45.ji.a()) {
            o45.hi hiVar = new o45.hi();
            try {
                hiVar.fromProtoBuf(bArr);
                byte[] bArr2 = hiVar.f342951e;
                byte[] bArr3 = hiVar.f342952f;
                if (bArr2 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "synccheck3 networkid3 is null");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "synccheck3 networkid3 " + bArr2.length);
                int i17 = hiVar.f342950d;
                boolean z18 = bArr2.length >= 31 && bArr2[0] == 0 && bArr2[10] == 0 && bArr2[20] == 0 && bArr2[30] == 0;
                if (bArr3 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "synccheck3 networkctx3 " + bArr3.length);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "synccheck3 networkctx3 is null");
                }
                com.tencent.mars.mm.MMStnManager mMStnManager = (com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class);
                if (!z18) {
                    str = new java.lang.String(bArr2);
                }
                mMStnManager.setNetworkId("synccheck", str, bArr3 != null ? new java.lang.String(bArr3) : "", i17);
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "synccheck3 parse failed. %s, hex:%s", e17.getLocalizedMessage(), com.tencent.mm.sdk.platformtools.t8.j(bArr));
                jx3.f.INSTANCE.idkeyStat(2143L, 1L, 1L, true);
                return;
            }
        }
        o45.ii iiVar = new o45.ii();
        try {
            iiVar.fromProtoBuf(bArr);
            byte[] bArr4 = iiVar.f342966f;
            if (bArr4 != null) {
                byte[] bArr5 = iiVar.f342967g;
                if (bArr4.length < 31) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "networkid too short: " + bArr4.length);
                } else if (bArr4[0] == 0 && bArr4[10] == 0 && bArr4[20] == 0 && bArr4[30] == 0) {
                    z17 = true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "networkid " + bArr4.length);
                if (bArr5 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "ctx " + bArr5.length);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "ctx is null");
                }
                com.tencent.mars.mm.MMStnManager mMStnManager2 = (com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class);
                if (!z17) {
                    str = new java.lang.String(bArr4);
                }
                mMStnManager2.setNetworkId("synccheck", str, new java.lang.String(bArr5), iiVar.f342965e);
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAutoAuth", "newsync parse failed " + e18.getLocalizedMessage());
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void y() {
        ((com.tencent.mars.stn.StnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.stn.StnManager.class)).makesureLongLinkConnected();
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void z(java.lang.String str) {
        this.f71991i.lock(this.f71992m, "MMAutoAuth.ipxxStatistics");
        new com.tencent.mm.network.h1(this, 1000L, null, str).a(this.f71999t);
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public java.lang.String z0() {
        return ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getIspId();
    }

    @Override // com.tencent.mm.network.v
    /* renamed from: G, reason: collision with other method in class */
    public com.tencent.mm.network.r mo101G() {
        return this.f71993n;
    }
}
