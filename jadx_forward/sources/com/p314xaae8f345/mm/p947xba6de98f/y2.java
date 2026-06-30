package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes8.dex */
public class y2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: i, reason: collision with root package name */
    public static long f152700i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f152701m = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f152702d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152703e;

    /* renamed from: g, reason: collision with root package name */
    public final int f152705g;

    /* renamed from: f, reason: collision with root package name */
    public long f152704f = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f152706h = "";

    public y2(int i17) {
        this.f152705g = 0;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn init Scene:%d  [%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.tb3();
        lVar.f152198b = new r45.ub3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getcdndns";
        lVar.f152200d = 379;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f152702d = a17;
        this.f152705g = i17;
        r45.tb3 tb3Var = (r45.tb3) a17.f152243a.f152217a;
        tb3Var.f467805d = "";
        tb3Var.f467806e = i17;
    }

    public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfoParams H(r45.ls lsVar) {
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfoParams cdnInfoParams = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfoParams();
        cdnInfoParams.f18020xe7f97d9f = lsVar.f461326f;
        cdnInfoParams.f18021xd0e737ce = lsVar.f461328h;
        cdnInfoParams.f18022x229408f2 = lsVar.f461324d;
        cdnInfoParams.f18023x6441419b = lsVar.f461327g;
        cdnInfoParams.f18024x46c859ca = lsVar.f461329i;
        cdnInfoParams.f18025x2f44c476 = lsVar.f461325e;
        return cdnInfoParams;
    }

    public final java.lang.String I() {
        java.lang.String str;
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return null;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            boolean z17 = com.p314xaae8f345.mm.app.w.INSTANCE.f135422n;
            str = "wifi_";
        } else {
            str = "mobile_" + com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) + "_" + com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40065x82653f5d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        if (str == null || str.length() < 2) {
            return null;
        }
        java.lang.String format = java.lang.String.format("%x", java.lang.Integer.valueOf(str.hashCode()));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p947xba6de98f.s1 Zi = com.p314xaae8f345.mm.p947xba6de98f.s1.Zi();
        Zi.getClass();
        gm0.j1.b().c();
        java.lang.String str2 = gm0.j1.u().h() + "cdndnsinfo/";
        if (!Zi.f152662p) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
            java.lang.String str3 = a17.f294812f;
            if (str3 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
                com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
            Zi.f152662p = true;
        }
        sb6.append(str2);
        sb6.append(format);
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152703e = u0Var;
        int h17 = gm0.j1.b().h();
        if (h17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetCDNDns", "has not set uin.");
            return -1;
        }
        long j17 = f152700i;
        long j18 = h17;
        java.util.Map map = f152701m;
        if (j17 != j18) {
            f152700i = j18;
            ((java.util.HashMap) map).clear();
        }
        long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        int i18 = this.f152705g;
        if (i18 == 0) {
            java.lang.String I = I();
            java.lang.String str = I != null ? I : "";
            this.f152706h = str;
            com.p314xaae8f345.mm.p947xba6de98f.x2 x2Var = (com.p314xaae8f345.mm.p947xba6de98f.x2) ((java.util.HashMap) map).get(str);
            if (x2Var == null) {
                x2Var = new com.p314xaae8f345.mm.p947xba6de98f.x2();
                ((java.util.HashMap) map).put(this.f152706h, x2Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn doScene NEW lastGetResult[%s] path[%s]", x2Var, this.f152706h);
            }
            long j19 = x2Var.f152693a;
            if (i17 > j19 && i17 - j19 < 10) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetCDNDns", "Last get dns at %d ago . ignore!, lastGetResult[%s]", java.lang.Long.valueOf(i17 - j19), x2Var);
                return -1;
            }
            long j27 = x2Var.f152694b;
            if (i17 > j27 && i17 - j27 < 3600 && x2Var.f152695c >= 90) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetCDNDns", "in 1 hour , get dns more than 90  (%d). ignore!, lastGetResult[%s]", java.lang.Long.valueOf(i17 - j27), x2Var);
                return -1;
            }
            x2Var.f152693a = i17;
            if (i17 >= j27) {
                long j28 = x2Var.f152695c;
                if (i17 - j28 <= 3600) {
                    x2Var.f152695c = j28 + 1;
                }
            }
            x2Var.f152694b = i17;
            x2Var.f152695c = 0L;
        } else {
            this.f152706h = "";
            java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
            if (it != null) {
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p947xba6de98f.x2 x2Var2 = (com.p314xaae8f345.mm.p947xba6de98f.x2) it.next();
                    if (x2Var2 != null) {
                        x2Var2.f152693a = i17;
                        if (i17 >= x2Var2.f152694b) {
                            long j29 = x2Var2.f152695c;
                            if (i17 - j29 <= 3600) {
                                x2Var2.f152695c = j29 + 1;
                            }
                        }
                        x2Var2.f152694b = i17;
                        x2Var2.f152695c = 0L;
                    }
                }
            }
        }
        this.f152704f = i17;
        jx3.f.INSTANCE.mo68477x336bdfd8(546L, i18 == 0 ? 0L : 1L, 1L, true);
        return mo9409x10f9447a(sVar, this.f152702d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 379;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        byte[] bArr2;
        int i27;
        int i28;
        r45.ub3 ub3Var = (r45.ub3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 != 0 || i19 != 0 || ub3Var.f468724d == null) {
            jx3.f.INSTANCE.d(10769, -10004, 0, java.lang.Long.valueOf(this.f152704f));
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(i18);
            objArr[1] = java.lang.Integer.valueOf(i19);
            objArr[2] = java.lang.Boolean.valueOf(ub3Var.f468724d == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd: [%d ,%d]  info is null :%b", objArr);
            this.f152703e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        java.lang.String I = I();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(I) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152706h) && !I.equals(this.f152706h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd revised cacheFullPath[%s] to [%s]", I, this.f152706h);
            jx3.f.INSTANCE.mo68477x336bdfd8(546L, 6L, 1L, true);
        }
        ((java.util.HashMap) f152701m).clear();
        r45.cu5 cu5Var = ub3Var.f468727g;
        byte[] bArr3 = null;
        if (cu5Var == null || (i28 = cu5Var.f453372d) <= 0) {
            bArr2 = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd cdnrule:%d", java.lang.Integer.valueOf(i28));
            bArr2 = x51.j1.d(ub3Var.f468727g);
        }
        r45.cu5 cu5Var2 = ub3Var.f468728h;
        if (cu5Var2 != null && (i27 = cu5Var2.f453372d) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd safecdnrule:%d", java.lang.Integer.valueOf(i27));
            bArr3 = x51.j1.d(ub3Var.f468728h);
        }
        byte[] bArr4 = bArr3;
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = ub3Var.f468729i;
        objArr2[1] = v0Var.mo13821x7f35c2d1().m150576x2b5bc573() == null ? "" : v0Var.mo13821x7f35c2d1().m150576x2b5bc573().f472084u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd FakeDnsInfo:%s netlabel:%s", objArr2);
        r45.ms msVar = ub3Var.f468729i;
        if (msVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd FakeDnsInfo FakeUin:%d NewAuthKey:%s", java.lang.Integer.valueOf(msVar.f462304e), ub3Var.f468729i.f462310n);
        }
        if (!com.p314xaae8f345.mm.p947xba6de98f.s1.cj().h(ub3Var.f468724d, ub3Var.f468725e, ub3Var.f468726f, bArr2, bArr4, ub3Var.f468729i, v0Var.mo13821x7f35c2d1().m150576x2b5bc573() == null ? "" : v0Var.mo13821x7f35c2d1().m150576x2b5bc573().f472084u)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd setCDNDnsInfo failed ");
            this.f152703e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCDNDns", "getcdndns defaultcfg %s, disastercfg %s, getcdninterval %d", ub3Var.f468731n, ub3Var.f468732o, java.lang.Integer.valueOf(ub3Var.f468730m));
        r45.ls lsVar = ub3Var.f468731n;
        if (lsVar != null && ub3Var.f468732o != null) {
            ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37769xc87f7a9f(H(lsVar), H(ub3Var.f468732o), ub3Var.f468730m);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCDNDns", "getcdndns ipv6 %d, codec1limit %d", java.lang.Integer.valueOf(ub3Var.f468733p), java.lang.Integer.valueOf(ub3Var.f468736s));
        ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37781xfd4d4b61(ub3Var.f468733p == 1);
        if (ub3Var.f468736s == 0) {
            jx3.f.INSTANCE.w(546L, 20L, 1L);
        } else {
            jx3.f.INSTANCE.w(546L, 21L, 1L);
        }
        com.p314xaae8f345.mm.p947xba6de98f.l1 cj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj();
        int i29 = ub3Var.f468736s;
        synchronized (cj6.f152584o) {
            cj6.f152585p = i29;
            cj6.f152586q.A("MicroMsg.CdnTransportEngine", i29);
        }
        this.f152703e.mo815x76e0bfae(i18, i19, str, this);
    }
}
