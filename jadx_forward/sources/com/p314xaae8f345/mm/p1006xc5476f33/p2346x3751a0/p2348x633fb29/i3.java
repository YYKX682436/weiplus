package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 f258210a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.e37 f258211b = new r45.e37();

    /* renamed from: c, reason: collision with root package name */
    public r45.k27 f258212c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f258213d = 0;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var) {
        this.f258210a = null;
        this.f258210a = g1Var;
    }

    public int a(r45.k27 k27Var, boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = this.f258210a;
        if (g1Var.f258065x.f258410q == 0) {
            vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", fp.k.c() + "failed to do voip sync , roomid = 0");
            return 0;
        }
        if (g1Var.F) {
            vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", fp.k.c() + "voip syncing, push to cache...");
            if (k27Var == null) {
                vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "failed to pushVoipCmdList , VoipCmdList = null");
                this.f258213d++;
            } else {
                if (this.f258212c == null) {
                    this.f258212c = new r45.k27();
                }
                for (int i18 = 0; i18 < k27Var.f459868d; i18++) {
                    this.f258212c.f459869e.add((r45.j27) k27Var.f459869e.get(i18));
                }
                r45.k27 k27Var2 = this.f258212c;
                k27Var2.f459868d = k27Var2.f459869e.size();
            }
            return 0;
        }
        g1Var.F = true;
        if (k27Var == null) {
            k27Var = new r45.k27();
            k27Var.f459868d = 0;
            k27Var.f459869e = new java.util.LinkedList();
        }
        r45.k27 k27Var3 = k27Var;
        r45.k27 k27Var4 = this.f258212c;
        if (k27Var4 != null && k27Var4.f459868d > 0) {
            int i19 = 0;
            while (true) {
                r45.k27 k27Var5 = this.f258212c;
                if (i19 >= k27Var5.f459868d) {
                    break;
                }
                k27Var3.f459869e.add((r45.j27) k27Var5.f459869e.get(i19));
                i19++;
            }
            k27Var3.f459868d = k27Var3.f459869e.size();
            r45.k27 k27Var6 = this.f258212c;
            if (k27Var6 != null) {
                k27Var6.f459869e.clear();
                this.f258212c.f459868d = 0;
                this.f258212c = null;
                this.f258213d = 0;
            }
        }
        this.f258213d = 0;
        if (g1Var.C == null) {
            g1Var.C = "".getBytes();
        }
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "____doVoipSync, fromjni:" + z17 + ",cmdList:" + k27Var3.f459868d + ",syncKey.length:" + g1Var.C.length + ",selector:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = g1Var.f258065x;
        mq4.c0 c0Var = new mq4.c0(c18912x54425f62.f258410q, k27Var3, g1Var.C, c18912x54425f62.f258416s, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var = c18912x54425f62.M1;
        l1Var.getClass();
        l1Var.O = java.lang.System.currentTimeMillis();
        c0Var.L();
        return 0;
    }

    public void b(r45.cu5 cu5Var) {
        byte[] g17 = cu5Var.f453374f.g();
        int i17 = 0;
        for (int i18 = 0; i18 < 4; i18++) {
            i17 |= (g17[i18] & 255) << (i18 * 8);
        }
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "voipSync remote status changed, status = " + i17);
        int i19 = i17 & 255;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = this.f258210a;
        g1Var.getClass();
        if (8 != i19 && 9 != i19) {
            g1Var.f258062u = i19;
            g1Var.f258060s = i19;
        }
        if (1 == i19 || 3 == i19) {
            g1Var.I(2, true);
            gq4.v.Bi().f258091a.f257965v = false;
        }
        gq4.v.Bi().H();
        g1Var.f258067z.O(i19);
    }

    public void c(r45.v37 v37Var, int i17) {
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onStatusChanged:  status:" + v37Var.f469391e + " dataFlag:" + i17);
        int i18 = v37Var.f469391e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = this.f258210a;
        if (i18 != 1) {
            if (i18 == 6) {
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACKED");
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: try use pre-connect");
                g1Var.f258051j = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = g1Var.f258065x;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var = c18912x54425f62.M1;
                l1Var.getClass();
                l1Var.G = java.lang.System.currentTimeMillis();
                c18912x54425f62.K0 = 1;
                g1Var.J();
                return;
            }
            if (i18 == 8) {
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACK BUSY");
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var2 = g1Var.f258065x.M1;
                l1Var2.f258248b = 211;
                l1Var2.f258246a = 11;
                l1Var2.f258259m = 12;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11519, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 3);
                g1Var.v(1, 211, "", -1);
                g1Var.H();
                return;
            }
            if (i18 == 2) {
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus...MM_VOIP_SYNC_STATUS_REJECT");
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var3 = g1Var.f258065x.M1;
                l1Var3.f258246a = 103;
                l1Var3.f258259m = 4;
                l1Var3.f258266t = (int) (java.lang.System.currentTimeMillis() - g1Var.f258065x.M1.f258258l);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11519, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 1);
                g1Var.H();
                g1Var.v(4, 0, "", -1);
                return;
            }
            if (i18 == 3) {
                g1Var.f258065x.M1.f258259m = 5;
                return;
            }
            if (i18 != 4) {
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onStatusChanged: unknow status:" + v37Var.f469391e);
                return;
            }
            vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus...MM_VOIP_SYNC_STATUS_SHUTDOWN");
            int i19 = g1Var.f258041a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622 = g1Var.f258065x;
            if (i19 < 6) {
                c18912x54425f622.M1.f258260n = 1;
            }
            c18912x54425f622.M1.f258246a = 110;
            g1Var.v(6, 0, "", -1);
            g1Var.H();
            return;
        }
        if (gq4.v.Bi().f258091a.f257966w) {
            g1Var.f258047f = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f623 = g1Var.f258065x;
            if (1 == i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var4 = c18912x54425f623.M1;
                if (0 == l1Var4.C) {
                    l1Var4.C = java.lang.System.currentTimeMillis();
                    vq4.d0.c("MicroMsg.VoipDailReport", "accept received timestamp:" + l1Var4.C);
                }
            }
            if (3 == i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var5 = c18912x54425f623.M1;
                if (0 == l1Var5.D) {
                    l1Var5.D = java.lang.System.currentTimeMillis();
                    vq4.d0.c("MicroMsg.VoipDailReport", "sync accept received timestamp:" + l1Var5.D);
                }
            }
            if (4 == i17) {
                c18912x54425f623.M1.e();
                g1Var.y(2);
            }
            g1Var.f258067z.T();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = gq4.v.Bi().f258091a.f257968y;
            if (b4Var != null) {
                vq4.d0.c("MicroMsg.Voip.VoipServiceEx", "devincdai: voip reset timecount");
                b4Var.d();
                b4Var.c(60000L, 60000L);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11519, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 2);
        } else {
            if (!g1Var.f258048g || !g1Var.f258051j) {
                return;
            }
            if (4 == i17) {
                g1Var.f258065x.M1.e();
            }
        }
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[DataAccept]onVoipSyncStatus:ACCEPTdata Flag: " + i17);
        g1Var.f258049h = true;
        if (g1Var.f258051j) {
            g1Var.f258051j = false;
            if (g1Var.f258046e) {
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus:ACCEPT, channel already success, pre-connect " + g1Var.f258051j);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e3(this));
            } else {
                if (g1Var.f258050i) {
                    vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: accept, channel pre-connect already failed");
                    g1Var.v(1, -9000, "", -1);
                    return;
                }
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACCEPT, pre-connect still connecting...");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipSyncHandle", "isPreConnect is false");
        }
        g1Var.J();
        g1Var.H();
    }
}
