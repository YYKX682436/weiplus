package mq4;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.e37 f412324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mq4.f f412325e;

    public e(mq4.f fVar, r45.e37 e37Var) {
        this.f412325e = fVar;
        this.f412324d = e37Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.cu5 cu5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3;
        r45.cu5 cu5Var2;
        gq4.v.Bi().f258091a.B.c(1000L, 1000L);
        mq4.f fVar = this.f412325e;
        vq4.d0.c(fVar.f412330d.f412331h, "steve:doublelink timer started!");
        r45.e37 e37Var = this.f412324d;
        r45.do5 do5Var = e37Var.M;
        mq4.g gVar4 = fVar.f412330d;
        if (do5Var == null || do5Var.f454157d == 0) {
            r45.co5 co5Var = new r45.co5();
            co5Var.f453257d = 0;
            co5Var.f453258e = "";
            co5Var.f453259f = "";
            co5Var.f453260g = gVar4.f412329g.f258065x.f258380g;
            co5Var.f453261h = 4;
            co5Var.f453262i = 2;
            co5Var.f453263m = e37Var.f454509g;
            co5Var.f453264n = e37Var.f454517r;
            r45.do5 do5Var2 = new r45.do5();
            e37Var.M = do5Var2;
            do5Var2.f454157d = 1;
            do5Var2.f454158e = new java.util.LinkedList();
            e37Var.M.f454158e.add(co5Var);
        }
        r45.ve0 ve0Var = e37Var.N;
        if (ve0Var == null || ve0Var.f469681d == 0) {
            r45.ue0 ue0Var = new r45.ue0();
            ue0Var.f468813d = 1;
            ue0Var.f468814e = "";
            ue0Var.f468815f = "";
            ue0Var.f468816g = gVar4.f412329g.f258065x.f258380g;
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
        vq4.d0.c(gVar4.f412331h, "relay conn cnt: " + e37Var.M.f454157d);
        try {
            gVar4.f412329g.f258065x.f258427v1 = e37Var.M.mo14344x5f01b1f6();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(gVar4.f412331h, "relay conn info to byte array fail..");
        }
        try {
            gVar4.f412329g.f258065x.f258430w1 = e37Var.N.mo14344x5f01b1f6();
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(gVar4.f412331h, "direct conn info to byte array fail..");
        }
        try {
            r45.kj3 kj3Var = e37Var.P;
            if (kj3Var.f460271d > 0) {
                gVar4.f412329g.f258065x.f258433x1 = kj3Var.mo14344x5f01b1f6();
            }
        } catch (java.lang.Exception unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(gVar4.f412331h, "nic query info to byte array fail..");
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = e37Var.f454506d.f459877e.f453374f;
        if (gVar5 != null) {
            gVar4.f412329g.N(gVar5.g());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(gVar4.f412331h, "multiRelayData.PeerId.Buffer.getBuffer() is null");
        }
        r45.cu5 cu5Var3 = e37Var.f454515p;
        if (cu5Var3 != null && (gVar3 = cu5Var3.f453374f) != null && (cu5Var2 = e37Var.C) != null && cu5Var2.f453374f != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = gVar4.f412329g;
            byte[] g17 = gVar3.g();
            int i17 = e37Var.f454514o;
            int i18 = e37Var.f454523x;
            byte[] g18 = e37Var.C.f453374f.g();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = g1Var.f258065x;
            c18912x54425f62.f258431x = i17;
            c18912x54425f62.f258434y = g17;
            c18912x54425f62.f258379f1 = i18;
            c18912x54425f62.f258382g1 = g18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var2 = gVar4.f412329g;
        int i19 = e37Var.f454518s;
        int i27 = e37Var.f454519t;
        int i28 = e37Var.f454520u;
        int i29 = e37Var.f454521v;
        int i37 = e37Var.f454522w;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622 = g1Var2.f258065x;
        c18912x54425f622.W0 = i19;
        c18912x54425f622.X0 = i27;
        c18912x54425f622.Y0 = i28;
        c18912x54425f622.Z0 = i29;
        c18912x54425f622.f258364a1 = i37;
        c18912x54425f622.f258367b1 = e37Var.B;
        r45.cu5 cu5Var4 = e37Var.f454525z;
        if (cu5Var4 != null && (cu5Var = e37Var.A) != null && (gVar2 = cu5Var4.f453374f) != null && cu5Var.f453374f != null) {
            int i38 = e37Var.f454524y;
            byte[] g19 = gVar2.g();
            byte[] g27 = e37Var.A.f453374f.g();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f623 = g1Var2.f258065x;
            c18912x54425f623.f258400m1 = i38;
            c18912x54425f623.f258403n1 = g19;
            c18912x54425f623.f258406o1 = g27;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = e37Var.f454507e.f459877e.f453374f;
        if (gVar6 != null) {
            gVar4.f412329g.M(gVar6.g());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(gVar4.f412331h, "multiRelayData.CapInfo.Buffer.getBuffer() is null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var3 = gVar4.f412329g;
        int i39 = e37Var.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f624 = g1Var3.f258065x;
        c18912x54425f624.f258385h1 = i39;
        int i47 = e37Var.f454512m;
        int i48 = e37Var.f454513n;
        c18912x54425f624.A = i47;
        c18912x54425f624.B = i48;
        c18912x54425f624.f258388i1 = e37Var.F;
        r45.cu5 cu5Var5 = e37Var.H;
        if (cu5Var5 != null && (gVar = cu5Var5.f453374f) != null) {
            c18912x54425f624.F = gVar.g();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var4 = gVar4.f412329g;
        boolean z17 = g1Var4.f258046e;
        java.lang.String str = gVar4.f412331h;
        if (z17) {
            vq4.d0.c(str, "channel already success, start talk, pre-connect " + gVar4.f412329g.f258051j);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mq4.d(this));
        } else if (!g1Var4.f258051j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isPreConnect is false");
        } else {
            if (g1Var4.f258050i) {
                vq4.d0.c(str, "channel pre-connect already failed");
                gVar4.f412329g.v(1, -9000, "", -1);
                return;
            }
            vq4.d0.c(str, "channel pre-connect still connecting...");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var5 = gVar4.f412329g;
        g1Var5.f258051j = false;
        g1Var5.H();
        gVar4.f412329g.J();
    }
}
