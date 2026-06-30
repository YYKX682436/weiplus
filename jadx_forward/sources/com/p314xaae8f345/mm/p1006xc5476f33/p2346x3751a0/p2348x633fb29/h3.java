package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.k37 f258146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i3 f258147e;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i3 i3Var, r45.k37 k37Var) {
        this.f258147e = i3Var;
        this.f258146d = k37Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.cu5 cu5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3;
        r45.cu5 cu5Var2;
        r45.cu5 cu5Var3;
        r45.k37 k37Var;
        r45.cu5 cu5Var4;
        r45.c27 c27Var;
        r45.do5 do5Var;
        r45.cu5 cu5Var5;
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "__onMultiRelayData begin");
        try {
            r45.e37 e37Var = (r45.e37) new r45.e37().mo11468x92b714fd(this.f258146d.f459877e.f453374f.g());
            r45.k37 k37Var2 = e37Var.f454506d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i3 i3Var = this.f258147e;
            if (k37Var2 != null && (cu5Var5 = k37Var2.f459877e) != null && cu5Var5.f453374f != null) {
                i3Var.f258211b.f454506d = k37Var2;
            }
            r45.k37 k37Var3 = e37Var.f454507e;
            r45.cu5 cu5Var6 = k37Var3.f459877e;
            if (cu5Var6 != null && cu5Var6.f453374f != null) {
                i3Var.f258211b.f454507e = k37Var3;
            }
            int i17 = e37Var.f454508f;
            if (i17 != 0) {
                i3Var.f258211b.f454508f = i17;
            }
            r45.c27 c27Var2 = e37Var.f454509g;
            if (c27Var2 != null && c27Var2.f452782d != 0) {
                i3Var.f258211b.f454509g = c27Var2;
            }
            r45.c27 c27Var3 = e37Var.f454510h;
            if (c27Var3 != null && c27Var3.f452782d != 0) {
                i3Var.f258211b.f454510h = c27Var3;
            }
            java.util.LinkedList linkedList = e37Var.L;
            if (linkedList != null && linkedList.size() != 0) {
                r45.e37 e37Var2 = i3Var.f258211b;
                e37Var2.L = e37Var.L;
                e37Var2.K = e37Var.L.size();
            }
            int i18 = e37Var.f454512m;
            if (i18 != 0) {
                i3Var.f258211b.f454512m = i18;
            }
            int i19 = e37Var.f454513n;
            if (i19 != 0) {
                i3Var.f258211b.f454513n = i19;
            }
            r45.c27 c27Var4 = e37Var.f454517r;
            if (c27Var4.f452782d != 0) {
                i3Var.f258211b.f454517r = c27Var4;
            }
            int i27 = e37Var.f454518s;
            if (i27 > 0) {
                i3Var.f258211b.f454518s = i27;
            } else {
                i3Var.f258211b.f454518s = 0;
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no ARQstrategy in mrdata");
            }
            int i28 = e37Var.f454523x;
            if (i28 > 0) {
                i3Var.f258211b.f454523x = i28 - 1;
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[ENCRYPT] got encryptStrategy[" + i3Var.f258211b.f454523x + "] from relaydata");
            } else {
                i3Var.f258211b.f454523x = 1;
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no EncryptStrategy in mrdata");
            }
            int i29 = e37Var.f454519t;
            if (i29 > 0) {
                r45.e37 e37Var3 = i3Var.f258211b;
                e37Var3.f454519t = i29;
                e37Var3.f454520u = e37Var.f454520u;
                e37Var3.f454521v = e37Var.f454521v;
                e37Var3.f454522w = e37Var.f454522w;
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got ARQCacheLen: " + e37Var.f454519t + ", ARQRttThreshold: " + e37Var.f454520u + ", ARQUsedRateThreshold: " + e37Var.f454521v + ", ARQRespRateThreshold: " + e37Var.f454522w);
            } else {
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no ARQKeyParameters in mrdata");
            }
            int i37 = e37Var.B;
            if (i37 > 0) {
                i3Var.f258211b.B = i37;
            } else {
                i3Var.f258211b.B = 0;
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no QosStrategy in mrdata");
            }
            r45.e37 e37Var4 = i3Var.f258211b;
            e37Var4.E = e37Var.E;
            r45.r24 r24Var = e37Var.G;
            if (r24Var != null) {
                e37Var4.G = r24Var;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = i3Var.f258210a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = g1Var.f258065x;
            int i38 = c18912x54425f62.f258410q;
            if (i38 != 0) {
                long j17 = c18912x54425f62.f258416s;
                if (j17 != 0) {
                    r45.k37 k37Var4 = e37Var4.f454506d;
                    if (!((k37Var4 == null || (cu5Var3 = k37Var4.f459877e) == null || cu5Var3.f453374f == null || e37Var4.f454508f == 0 || (k37Var = e37Var4.f454507e) == null || (cu5Var4 = k37Var.f459877e) == null || cu5Var4.f453374f == null || (((c27Var = e37Var4.f454509g) == null || c27Var.f452782d == 0) && ((do5Var = e37Var.M) == null || do5Var.f454157d <= 0))) ? false : true)) {
                        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "__onMultiRelayData end");
                        return;
                    }
                    e37Var4.f454505J = e37Var.f454505J;
                    e37Var4.I = e37Var.I;
                    g1Var.O.b(e37Var.f454505J, e37Var.I, i38, j17);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("multiRelayData recv all, update. RedirectReqThreshold = ");
                    r45.e37 e37Var5 = i3Var.f258211b;
                    sb6.append(e37Var5.E);
                    sb6.append(" BothSideSwitchFlag = ");
                    sb6.append(e37Var.F);
                    vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", sb6.toString());
                    int i39 = e37Var5.f454508f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622 = g1Var.f258065x;
                    c18912x54425f622.M1.f258253g = (byte) 1;
                    c18912x54425f622.f258437z = i39;
                    g1Var.N(e37Var5.f454506d.f459877e.f453374f.g());
                    r45.cu5 cu5Var7 = e37Var.f454515p;
                    if (cu5Var7 != null && (gVar3 = cu5Var7.f453374f) != null && (cu5Var2 = e37Var.C) != null && cu5Var2.f453374f != null) {
                        byte[] g17 = gVar3.g();
                        int i47 = e37Var.f454514o;
                        int i48 = e37Var5.f454523x;
                        byte[] g18 = e37Var.C.f453374f.g();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f623 = g1Var.f258065x;
                        c18912x54425f623.f258431x = i47;
                        c18912x54425f623.f258434y = g17;
                        c18912x54425f623.f258379f1 = i48;
                        c18912x54425f623.f258382g1 = g18;
                    }
                    if (gq4.v.Bi().m() != 0) {
                        g1Var.M(e37Var5.f454507e.f459877e.f453374f.g());
                    }
                    r45.do5 do5Var2 = e37Var.M;
                    if (do5Var2 == null || do5Var2.f454157d == 0) {
                        r45.co5 co5Var = new r45.co5();
                        co5Var.f453257d = 0;
                        co5Var.f453258e = "";
                        co5Var.f453259f = "";
                        co5Var.f453260g = g1Var.f258065x.f258380g;
                        co5Var.f453261h = 4;
                        co5Var.f453262i = 2;
                        co5Var.f453263m = e37Var.f454509g;
                        co5Var.f453264n = e37Var.f454517r;
                        r45.do5 do5Var3 = new r45.do5();
                        e37Var.M = do5Var3;
                        do5Var3.f454157d = 1;
                        do5Var3.f454158e = new java.util.LinkedList();
                        e37Var.M.f454158e.add(co5Var);
                    }
                    r45.ve0 ve0Var = e37Var.N;
                    if (ve0Var == null || ve0Var.f469681d == 0) {
                        r45.ue0 ue0Var = new r45.ue0();
                        ue0Var.f468813d = 1;
                        ue0Var.f468814e = "";
                        ue0Var.f468815f = "";
                        ue0Var.f468816g = g1Var.f258065x.f258380g;
                        ue0Var.f468817h = 4;
                        ue0Var.f468818i = 2;
                        ue0Var.f468819m = e37Var.f454510h;
                        ue0Var.f468820n = e37Var.K;
                        ue0Var.f468821o = e37Var.L;
                        r45.ve0 ve0Var2 = new r45.ve0();
                        e37Var.N = ve0Var2;
                        ve0Var2.f469681d = 1;
                        ve0Var2.f469682e = new java.util.LinkedList();
                        e37Var.N.f469682e.add(ue0Var);
                    }
                    vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "relay conn cnt: " + e37Var.M.f454157d);
                    try {
                        g1Var.f258065x.f258427v1 = e37Var.M.mo14344x5f01b1f6();
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.VoipSyncHandle", "relay conn info to byte array fail..");
                    }
                    try {
                        g1Var.f258065x.f258430w1 = e37Var.N.mo14344x5f01b1f6();
                    } catch (java.lang.Exception unused2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.VoipSyncHandle", "direct conn info to byte array fail..");
                    }
                    try {
                        r45.kj3 kj3Var = e37Var.P;
                        if (kj3Var.f460271d > 0) {
                            g1Var.f258065x.f258433x1 = kj3Var.mo14344x5f01b1f6();
                        }
                    } catch (java.lang.Exception unused3) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.VoipSyncHandle", "nic query info to byte array fail..");
                    }
                    vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onMultiRelayData natsvr =" + e37Var5.K);
                    int i49 = e37Var5.f454518s;
                    int i57 = e37Var5.f454519t;
                    int i58 = e37Var5.f454520u;
                    int i59 = e37Var5.f454521v;
                    int i66 = e37Var5.f454522w;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f624 = g1Var.f258065x;
                    c18912x54425f624.W0 = i49;
                    c18912x54425f624.X0 = i57;
                    c18912x54425f624.Y0 = i58;
                    c18912x54425f624.Z0 = i59;
                    c18912x54425f624.f258364a1 = i66;
                    c18912x54425f624.f258367b1 = e37Var5.B;
                    int i67 = e37Var5.f454512m;
                    int i68 = e37Var5.f454513n;
                    c18912x54425f624.A = i67;
                    c18912x54425f624.B = i68;
                    c18912x54425f624.f258385h1 = e37Var5.E;
                    c18912x54425f624.f258388i1 = e37Var.F;
                    r45.cu5 cu5Var8 = e37Var.H;
                    if (cu5Var8 != null && (gVar2 = cu5Var8.f453374f) != null) {
                        c18912x54425f624.F = gVar2.g();
                    }
                    r45.cu5 cu5Var9 = e37Var.f454525z;
                    if (cu5Var9 != null && (gVar = cu5Var9.f453374f) != null && (cu5Var = e37Var.A) != null && cu5Var.f453374f != null) {
                        int i69 = e37Var.f454524y;
                        byte[] g19 = gVar.g();
                        byte[] g27 = e37Var.A.f453374f.g();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f625 = g1Var.f258065x;
                        c18912x54425f625.f258400m1 = i69;
                        c18912x54425f625.f258403n1 = g19;
                        c18912x54425f625.f258406o1 = g27;
                    }
                    r45.r24 r24Var2 = e37Var5.G;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f626 = g1Var.f258065x;
                    c18912x54425f626.getClass();
                    vq4.d0.a("MicroMsg.Voip", "v2protocal updateJbmBitrateRsSvrParam BitrateFlag : " + r24Var2.f466001e + " Bitrate: " + r24Var2.f466002f);
                    c18912x54425f626.f38622xab062d7d = 27;
                    c18912x54425f626.f38620xf35c6632 = r5;
                    int[] iArr = {r24Var2.f466000d, r24Var2.f466001e, r24Var2.f466002f, r24Var2.f466003g, r24Var2.f466004h, r24Var2.f466005i, r24Var2.f466006m, r24Var2.f466009p, r24Var2.f466011q, r24Var2.f466014t, r24Var2.f466015u, r24Var2.f466018x, r24Var2.f466020y, r24Var2.B, r24Var2.C, r24Var2.F, r24Var2.G, r24Var2.f465999J, r24Var2.K, r24Var2.N, r24Var2.P, r24Var2.S, r24Var2.T, r24Var2.W, r24Var2.X, r24Var2.f466010p0, r24Var2.f466019x0};
                    c18912x54425f626.f38623xe6689e6c = 20;
                    c18912x54425f626.f38621x15e1ae21 = r5;
                    double[] dArr = {r24Var2.f466007n, r24Var2.f466008o, r24Var2.f466012r, r24Var2.f466013s, r24Var2.f466016v, r24Var2.f466017w, r24Var2.f466021z, r24Var2.A, r24Var2.D, r24Var2.E, r24Var2.H, r24Var2.I, r24Var2.L, r24Var2.M, r24Var2.Q, r24Var2.R, r24Var2.U, r24Var2.V, r24Var2.Y, r24Var2.Z};
                    g1Var.J();
                    vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "__onMultiRelayData end");
                    return;
                }
            }
            vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "not in valid room, __onMultiRelayData end");
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Voip.VoipSyncHandle", e17, "", new java.lang.Object[0]);
        }
    }
}
