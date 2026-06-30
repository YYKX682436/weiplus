package com.tencent.mm.modelcdntran;

/* loaded from: classes8.dex */
public class y2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: i, reason: collision with root package name */
    public static long f71167i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f71168m = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71169d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71170e;

    /* renamed from: g, reason: collision with root package name */
    public final int f71172g;

    /* renamed from: f, reason: collision with root package name */
    public long f71171f = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f71173h = "";

    public y2(int i17) {
        this.f71172g = 0;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn init Scene:%d  [%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.tb3();
        lVar.f70665b = new r45.ub3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getcdndns";
        lVar.f70667d = 379;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71169d = a17;
        this.f71172g = i17;
        r45.tb3 tb3Var = (r45.tb3) a17.f70710a.f70684a;
        tb3Var.f386272d = "";
        tb3Var.f386273e = i17;
    }

    public com.tencent.mars.cdn.CdnManager.CdnInfoParams H(r45.ls lsVar) {
        com.tencent.mars.cdn.CdnManager.CdnInfoParams cdnInfoParams = new com.tencent.mars.cdn.CdnManager.CdnInfoParams();
        cdnInfoParams.c2CretryIntervalMs = lsVar.f379793f;
        cdnInfoParams.c2CrwtimeoutMs = lsVar.f379795h;
        cdnInfoParams.c2CshowErrorDelayMs = lsVar.f379791d;
        cdnInfoParams.snsretryIntervalMs = lsVar.f379794g;
        cdnInfoParams.snsrwtimeoutMs = lsVar.f379796i;
        cdnInfoParams.snsshowErrorDelayMs = lsVar.f379792e;
        return cdnInfoParams;
    }

    public final java.lang.String I() {
        java.lang.String str;
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return null;
        }
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            boolean z17 = com.tencent.mm.app.w.INSTANCE.f53889n;
            str = "wifi_";
        } else {
            str = "mobile_" + com.tencent.mars.comm.NetStatusUtil.getNetTypeString(com.tencent.mm.sdk.platformtools.x2.f193071a) + "_" + com.tencent.mars.comm.NetStatusUtil.getISPCode(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        if (str == null || str.length() < 2) {
            return null;
        }
        java.lang.String format = java.lang.String.format("%x", java.lang.Integer.valueOf(str.hashCode()));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.modelcdntran.s1 Zi = com.tencent.mm.modelcdntran.s1.Zi();
        Zi.getClass();
        gm0.j1.b().c();
        java.lang.String str2 = gm0.j1.u().h() + "cdndnsinfo/";
        if (!Zi.f71129p) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
            java.lang.String str3 = a17.f213279f;
            if (str3 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            Zi.f71129p = true;
        }
        sb6.append(str2);
        sb6.append(format);
        return sb6.toString();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71170e = u0Var;
        int h17 = gm0.j1.b().h();
        if (h17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetCDNDns", "has not set uin.");
            return -1;
        }
        long j17 = f71167i;
        long j18 = h17;
        java.util.Map map = f71168m;
        if (j17 != j18) {
            f71167i = j18;
            ((java.util.HashMap) map).clear();
        }
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        int i18 = this.f71172g;
        if (i18 == 0) {
            java.lang.String I = I();
            java.lang.String str = I != null ? I : "";
            this.f71173h = str;
            com.tencent.mm.modelcdntran.x2 x2Var = (com.tencent.mm.modelcdntran.x2) ((java.util.HashMap) map).get(str);
            if (x2Var == null) {
                x2Var = new com.tencent.mm.modelcdntran.x2();
                ((java.util.HashMap) map).put(this.f71173h, x2Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn doScene NEW lastGetResult[%s] path[%s]", x2Var, this.f71173h);
            }
            long j19 = x2Var.f71160a;
            if (i17 > j19 && i17 - j19 < 10) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetCDNDns", "Last get dns at %d ago . ignore!, lastGetResult[%s]", java.lang.Long.valueOf(i17 - j19), x2Var);
                return -1;
            }
            long j27 = x2Var.f71161b;
            if (i17 > j27 && i17 - j27 < 3600 && x2Var.f71162c >= 90) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetCDNDns", "in 1 hour , get dns more than 90  (%d). ignore!, lastGetResult[%s]", java.lang.Long.valueOf(i17 - j27), x2Var);
                return -1;
            }
            x2Var.f71160a = i17;
            if (i17 >= j27) {
                long j28 = x2Var.f71162c;
                if (i17 - j28 <= 3600) {
                    x2Var.f71162c = j28 + 1;
                }
            }
            x2Var.f71161b = i17;
            x2Var.f71162c = 0L;
        } else {
            this.f71173h = "";
            java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
            if (it != null) {
                while (it.hasNext()) {
                    com.tencent.mm.modelcdntran.x2 x2Var2 = (com.tencent.mm.modelcdntran.x2) it.next();
                    if (x2Var2 != null) {
                        x2Var2.f71160a = i17;
                        if (i17 >= x2Var2.f71161b) {
                            long j29 = x2Var2.f71162c;
                            if (i17 - j29 <= 3600) {
                                x2Var2.f71162c = j29 + 1;
                            }
                        }
                        x2Var2.f71161b = i17;
                        x2Var2.f71162c = 0L;
                    }
                }
            }
        }
        this.f71171f = i17;
        jx3.f.INSTANCE.idkeyStat(546L, i18 == 0 ? 0L : 1L, 1L, true);
        return dispatch(sVar, this.f71169d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 379;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        byte[] bArr2;
        int i27;
        int i28;
        r45.ub3 ub3Var = (r45.ub3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 != 0 || i19 != 0 || ub3Var.f387191d == null) {
            jx3.f.INSTANCE.d(10769, -10004, 0, java.lang.Long.valueOf(this.f71171f));
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(i18);
            objArr[1] = java.lang.Integer.valueOf(i19);
            objArr[2] = java.lang.Boolean.valueOf(ub3Var.f387191d == null);
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd: [%d ,%d]  info is null :%b", objArr);
            this.f71170e.onSceneEnd(i18, i19, str, this);
            return;
        }
        java.lang.String I = I();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(I) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f71173h) && !I.equals(this.f71173h)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd revised cacheFullPath[%s] to [%s]", I, this.f71173h);
            jx3.f.INSTANCE.idkeyStat(546L, 6L, 1L, true);
        }
        ((java.util.HashMap) f71168m).clear();
        r45.cu5 cu5Var = ub3Var.f387194g;
        byte[] bArr3 = null;
        if (cu5Var == null || (i28 = cu5Var.f371839d) <= 0) {
            bArr2 = null;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd cdnrule:%d", java.lang.Integer.valueOf(i28));
            bArr2 = x51.j1.d(ub3Var.f387194g);
        }
        r45.cu5 cu5Var2 = ub3Var.f387195h;
        if (cu5Var2 != null && (i27 = cu5Var2.f371839d) > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd safecdnrule:%d", java.lang.Integer.valueOf(i27));
            bArr3 = x51.j1.d(ub3Var.f387195h);
        }
        byte[] bArr4 = bArr3;
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = ub3Var.f387196i;
        objArr2[1] = v0Var.getRespObj().getProfile() == null ? "" : v0Var.getRespObj().getProfile().f390551u;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd FakeDnsInfo:%s netlabel:%s", objArr2);
        r45.ms msVar = ub3Var.f387196i;
        if (msVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd FakeDnsInfo FakeUin:%d NewAuthKey:%s", java.lang.Integer.valueOf(msVar.f380771e), ub3Var.f387196i.f380777n);
        }
        if (!com.tencent.mm.modelcdntran.s1.cj().h(ub3Var.f387191d, ub3Var.f387192e, ub3Var.f387193f, bArr2, bArr4, ub3Var.f387196i, v0Var.getRespObj().getProfile() == null ? "" : v0Var.getRespObj().getProfile().f390551u)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd setCDNDnsInfo failed ");
            this.f71170e.onSceneEnd(i18, i19, str, this);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCDNDns", "getcdndns defaultcfg %s, disastercfg %s, getcdninterval %d", ub3Var.f387198n, ub3Var.f387199o, java.lang.Integer.valueOf(ub3Var.f387197m));
        r45.ls lsVar = ub3Var.f387198n;
        if (lsVar != null && ub3Var.f387199o != null) {
            ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).setCdnInfoParams(H(lsVar), H(ub3Var.f387199o), ub3Var.f387197m);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCDNDns", "getcdndns ipv6 %d, codec1limit %d", java.lang.Integer.valueOf(ub3Var.f387200p), java.lang.Integer.valueOf(ub3Var.f387203s));
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).setUseIPv6Cdn(ub3Var.f387200p == 1);
        if (ub3Var.f387203s == 0) {
            jx3.f.INSTANCE.w(546L, 20L, 1L);
        } else {
            jx3.f.INSTANCE.w(546L, 21L, 1L);
        }
        com.tencent.mm.modelcdntran.l1 cj6 = com.tencent.mm.modelcdntran.s1.cj();
        int i29 = ub3Var.f387203s;
        synchronized (cj6.f71051o) {
            cj6.f71052p = i29;
            cj6.f71053q.A("MicroMsg.CdnTransportEngine", i29);
        }
        this.f71170e.onSceneEnd(i18, i19, str, this);
    }
}
