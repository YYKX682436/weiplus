package mq4;

/* loaded from: classes14.dex */
public class b0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.c0 f412317d;

    public b0(mq4.c0 c0Var) {
        this.f412317d = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var;
        r45.k37 k37Var;
        int i19;
        boolean z17;
        r45.d37 d37Var;
        vq4.d0.c("MicroMsg.NetSceneVoipSync", "onSceneEnd type:" + m1Var.mo808xfb85f7b0() + " errType:" + i17 + " errCode:" + i18);
        mq4.c0 c0Var = this.f412317d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var = c0Var.f412329g.f258065x.M1;
        l1Var.getClass();
        l1Var.g((long) ((int) (java.lang.System.currentTimeMillis() - l1Var.O)));
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var2 = c0Var.f412329g;
        if (i17 != 0) {
            vq4.d0.b("MicroMsg.NetSceneVoipSync", "VoipSync Failed, type:" + m1Var.mo808xfb85f7b0() + " errType:" + i17 + " errCode:" + i18);
            if (i17 == 4) {
                try {
                    r45.x37 x37Var = (r45.x37) c0Var.K();
                    if (x37Var.f471291d != g1Var2.f258065x.f258410q) {
                        vq4.d0.b("MicroMsg.NetSceneVoipSync", "syncOnSceneEnd: recv roomId %d " + x37Var.f471291d + " != current roomid %d " + g1Var2.f258065x.f258410q);
                        return;
                    }
                } catch (java.lang.Exception unused) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var2 = g1Var2.f258065x.M1;
                l1Var2.f258265s = 3;
                l1Var2.f258246a = 11;
                l1Var2.f258249c = i18;
                l1Var2.f258248b = i18;
                if (i17 == 1) {
                    l1Var2.f258259m = 8;
                } else {
                    l1Var2.f258259m = 99;
                }
                g1Var2.v(1, -9004, "", 3);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i3 i3Var = g1Var2.B;
        i3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipSyncHandle", "____VoipSyncResp");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var3 = i3Var.f258210a;
        g1Var3.F = false;
        mq4.c0 c0Var2 = (mq4.c0) m1Var;
        r45.x37 x37Var2 = (r45.x37) c0Var2.K();
        byte[] bArr = g1Var3.C;
        if (bArr == null) {
            return;
        }
        int length = bArr.length;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = g1Var3.f258065x;
        c18912x54425f62.m72836x4f987384(bArr, length);
        int i27 = c18912x54425f62.f38646x9f5dcaed;
        int i28 = c18912x54425f62.f38638x78bc7c0e;
        int i29 = c18912x54425f62.f38615x8fec9670;
        c18912x54425f62.m72836x4f987384(x37Var2.f471292e.f453374f.g(), x37Var2.f471292e.f453372d);
        int i37 = c18912x54425f62.f38646x9f5dcaed;
        int i38 = c18912x54425f62.f38638x78bc7c0e;
        int i39 = c18912x54425f62.f38615x8fec9670;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipSyncHandle", "VoipSyncResp: oldStatusSyncKey:" + i27 + " oldRelayDataSyncKey:" + i28 + " oldConnectingStatusSyncKey:" + i29);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipSyncHandle", "VoipSyncResp: newStatusSyncKey:" + i37 + " newRelayDataSyncKey:" + i38 + " newConnectingStatusSyncKey:" + i39);
        g1Var3.C = x37Var2.f471292e.f453374f.g();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("voipSync response: continueflag=");
        sb6.append(x37Var2.f471294g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipSyncHandle", sb6.toString());
        java.util.LinkedList linkedList = x37Var2.f471293f.f459869e;
        if (linkedList != null && linkedList.size() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipSyncHandle", " syncOnSceneEnd cmdlist size" + linkedList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipSyncHandle", " syncOnSceneEnd cmdlist size:" + linkedList.size() + ",selector = " + ((r45.w37) c0Var2.f412326d.f152243a.f152217a).f470399i);
            int i47 = 0;
            while (i47 < linkedList.size()) {
                r45.j27 j27Var = (r45.j27) linkedList.get(i47);
                int i48 = j27Var.f459056d;
                java.util.LinkedList linkedList2 = linkedList;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipSyncHandle", "__parse sync resp, item cmdid:" + i48);
                if (i48 == 1) {
                    if (i37 > i27) {
                        if (c18912x54425f62.f258410q == 0) {
                            vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "voipSyncStatus ignored , roomid = 0");
                        } else {
                            try {
                                r45.v37 v37Var = (r45.v37) new r45.v37().mo11468x92b714fd(j27Var.f459057e.f453374f.g());
                                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus in...from user=" + j27Var.f459058f + ",itemStatus =  " + v37Var.f469391e);
                                i3Var.c(v37Var, 3);
                                g1Var = g1Var3;
                            } catch (java.io.IOException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Voip.VoipSyncHandle", e17, "", new java.lang.Object[0]);
                            }
                            i47++;
                            linkedList = linkedList2;
                            g1Var3 = g1Var;
                        }
                    }
                    g1Var = g1Var3;
                    i47++;
                    linkedList = linkedList2;
                    g1Var3 = g1Var;
                } else if (i48 == 2) {
                    if (i38 > i28) {
                        if (c18912x54425f62.f258410q == 0) {
                            vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "RelayData ignored , roomid = 0");
                        } else {
                            try {
                                k37Var = (r45.k37) new r45.k37().mo11468x92b714fd(j27Var.f459057e.f453374f.g());
                                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncRelayData ...relayType = " + k37Var.f459876d + ",from user = " + j27Var.f459058f);
                                i19 = k37Var.f459876d;
                            } catch (java.io.IOException e18) {
                                g1Var = g1Var3;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Voip.VoipSyncHandle", e18, "", new java.lang.Object[0]);
                            }
                            if (i19 == 5) {
                                gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h3(i3Var, k37Var));
                            } else {
                                r45.e37 e37Var = i3Var.f258211b;
                                if (i19 == 3) {
                                    g1Var3.M(k37Var.f459877e.f453374f.g());
                                    r45.cu5 cu5Var = k37Var.f459877e;
                                    if (cu5Var != null && cu5Var.f453374f != null) {
                                        e37Var.f454507e = k37Var;
                                    }
                                } else if (i19 == 2) {
                                    g1Var3.N(k37Var.f459877e.f453374f.g());
                                    r45.cu5 cu5Var2 = k37Var.f459877e;
                                    if (cu5Var2 != null && cu5Var2.f453374f != null) {
                                        e37Var.f454506d = k37Var;
                                    }
                                } else if (i19 == 1) {
                                    g1Var3.f258065x.f258428w = k37Var.f459877e.f453374f.g();
                                    g1Var3.o();
                                } else if (i19 == 6) {
                                    try {
                                        d37Var = (r45.d37) new r45.d37().mo11468x92b714fd(k37Var.f459877e.f453374f.g());
                                        z17 = false;
                                    } catch (java.io.IOException e19) {
                                        z17 = false;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Voip.VoipSyncHandle", e19, "", new java.lang.Object[0]);
                                        d37Var = null;
                                    }
                                    if (d37Var != null) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i3 i3Var2 = g1Var3.B;
                                        i3Var2.getClass();
                                        g1Var = g1Var3;
                                        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g3(i3Var2, d37Var, z17));
                                        i47++;
                                        linkedList = linkedList2;
                                        g1Var3 = g1Var;
                                    }
                                }
                            }
                        }
                    }
                    g1Var = g1Var3;
                    i47++;
                    linkedList = linkedList2;
                    g1Var3 = g1Var;
                } else {
                    g1Var = g1Var3;
                    if (i48 == 3 && i39 > i29) {
                        if (c18912x54425f62.f258410q == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.VoipSyncHandle", "voipSync(ClientStatus) ignored , roomid = 0");
                        } else {
                            try {
                                r45.cu5 cu5Var3 = new r45.cu5();
                                cu5Var3.b(j27Var.f459057e.f453374f.g());
                                if (j27Var.f459058f.equals(c01.z1.r())) {
                                    vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "svr response: local connecting status changed.");
                                } else {
                                    i3Var.b(cu5Var3);
                                }
                            } catch (java.io.IOException e27) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Voip.VoipSyncHandle", e27, "", new java.lang.Object[0]);
                            }
                        }
                    }
                    i47++;
                    linkedList = linkedList2;
                    g1Var3 = g1Var;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipSyncHandle", "__parse sync resp end");
        r45.k27 k27Var = i3Var.f258212c;
        if ((k27Var == null || k27Var.f459868d <= 0) && i3Var.f258213d <= 0) {
            return;
        }
        i3Var.a(null, false, 7);
    }
}
