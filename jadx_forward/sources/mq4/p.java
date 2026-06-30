package mq4;

/* loaded from: classes14.dex */
public class p implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.q f412338d;

    public p(mq4.q qVar) {
        this.f412338d = qVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.e83 e83Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a3 a3Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Invite response:");
        sb6.append(i17);
        sb6.append(" errCode:");
        sb6.append(i18);
        sb6.append(" status:");
        mq4.q qVar = this.f412338d;
        sb6.append(qVar.f412329g.f258041a);
        vq4.d0.c("MicroMsg.NetSceneVoipInvite", sb6.toString());
        r45.x27 x27Var = (r45.x27) qVar.K();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = qVar.f412329g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var = g1Var.f258065x.M1;
        l1Var.getClass();
        l1Var.I = java.lang.System.currentTimeMillis();
        g1Var.E = false;
        r45.w27 w27Var = (r45.w27) ((mq4.q) m1Var).f412326d.f152243a.f152217a;
        boolean z17 = gq4.v.Bi().f258091a.f257951h == 2;
        boolean z18 = gq4.v.Bi().f258091a.f257951h == 1;
        if (i18 != 238) {
            if (z17) {
                gq4.v.Bi().e(x27Var.f471239d, x27Var.f471242g, w27Var.f470350p);
                vq4.d0.b("MicroMsg.NetSceneVoipInvite", " steve:[simucall] new simul call invite response  return!, DO NOT use inviteresp info,  I'm callee!!");
                g1Var.f258067z.C(g1Var.f258065x.f258361J);
                vq4.d0.b("MicroMsg.NetSceneVoipInvite", " danial:[simucall] new simul call invite response return! auto accept, I'm callee");
                return;
            }
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var = gq4.v.Bi().f258091a;
                if ((d3Var.f257951h == 1) && (a3Var = d3Var.f257954k) != null) {
                    d3Var.d(a3Var.f257868d, a3Var.f257869e, 5, null, null, a3Var.f257865a);
                }
                vq4.d0.b("MicroMsg.NetSceneVoipInvite", " danial:[simucall] new simul call invite response  return!, send ack,  I'm caller!!");
            }
        }
        int i19 = g1Var.f258041a;
        if (i19 == 1) {
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - w27Var.f470351q);
            java.util.LinkedList linkedList = w27Var.f470343f;
            java.lang.String str2 = linkedList.size() > 0 ? ((r45.du5) linkedList.get(0)).f454289d : "";
            mq4.i iVar = new mq4.i(x27Var.f471239d, x27Var.f471242g, str2, "", w27Var.f470353s, 1, currentTimeMillis, w27Var.f470350p);
            vq4.d0.c("MicroMsg.NetSceneVoipInvite", "caller cancel before invite resp! send cancel invite, roomid " + x27Var.f471239d + " interval: " + currentTimeMillis + " + inviteId:" + w27Var.f470353s + " invitetype " + w27Var.f470350p + " talker" + str2);
            iVar.L();
            return;
        }
        if (i19 != 2) {
            if (i18 != 238) {
                vq4.d0.b("MicroMsg.NetSceneVoipInvite", " invite response with error status:" + g1Var.f258041a + " should:2");
                return;
            }
            if (z17) {
                gq4.v.Bi().f258092b.e0(true, w27Var.f470350p == 0);
                vq4.d0.b("MicroMsg.NetSceneVoipInvite", " danial:[simucall] resetStateMachine, isNewSimulCallee true");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = g1Var.f258065x;
        c18912x54425f62.M0 = x27Var.f471247o;
        c18912x54425f62.N0 = x27Var.f471248p;
        c18912x54425f62.O0 = x27Var.f471249q;
        c18912x54425f62.P0 = x27Var.f471250r;
        c18912x54425f62.R0 = x27Var.f471253u;
        c18912x54425f62.Q0 = x27Var.B;
        c18912x54425f62.f258409p1 = x27Var.C;
        c18912x54425f62.D = x27Var.F;
        c18912x54425f62.E = x27Var.K;
        c18912x54425f62.T0 = x27Var.H;
        c18912x54425f62.C = x27Var.f471254v;
        c18912x54425f62.I = x27Var.G;
        r45.cu5 cu5Var = x27Var.L;
        if (cu5Var == null || (gVar = cu5Var.f453374f) == null) {
            vq4.d0.b("MicroMsg.NetSceneVoipInvite", "voip general strategy is null");
        } else {
            c18912x54425f62.G = gVar.g();
            try {
                e83Var = (r45.e83) new r45.e83().mo11468x92b714fd(g1Var.f258065x.G);
            } catch (java.io.IOException unused) {
                vq4.d0.c("MicroMsg.NetSceneVoipInvite", "parse Voip general strategy fail");
                e83Var = null;
            }
            if (e83Var != null) {
                int i27 = e83Var.f454631f;
                vq4.d0.a("MicroMsg.NetSceneVoipInvite", "steve:nSvrBaseBRTuneRatio1:" + i27);
                g1Var.f258065x.S0 = i27;
            }
        }
        vq4.d0.c("MicroMsg.NetSceneVoipInvite", "setSvrConfig onInviteResp: audioTsdfBeyond3G = " + g1Var.f258065x.M0 + ",audioTsdEdge = " + g1Var.f258065x.N0 + ",passthroughQosAlgorithm = " + g1Var.f258065x.O0 + ",fastPlayRepair = " + g1Var.f258065x.P0 + ", audioDtx = " + g1Var.f258065x.R0 + ",switchtcpPktCnt = " + g1Var.f258065x.C + ",SvrCfgListV = " + g1Var.f258065x.Q0 + ", setMaxBRForRelay=" + g1Var.f258065x.T0 + ",EnableDataAccept = " + g1Var.f258065x.f258409p1 + ",WifiScanInterval = " + g1Var.f258065x.I + ",BaseBRTuneRatio=" + g1Var.f258065x.S0);
        g1Var.f258065x.U0 = x27Var.A;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("inviteResp AudioAecMode5 = ");
        sb7.append(g1Var.f258065x.U0);
        vq4.d0.c("MicroMsg.NetSceneVoipInvite", sb7.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var2 = g1Var.f258065x.M1;
        l1Var2.getClass();
        int currentTimeMillis2 = (int) (java.lang.System.currentTimeMillis() - l1Var2.H);
        l1Var2.g((long) currentTimeMillis2);
        int e17 = vq4.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622 = g1Var.f258065x;
            c18912x54425f622.f258410q = x27Var.f471239d;
            c18912x54425f622.f258416s = x27Var.f471242g;
            c18912x54425f622.f258413r = x27Var.f471243h;
            g1Var.D(4);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 1, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
            int i28 = x27Var.f471251s;
            if (i28 > 0) {
                long j17 = i28 * 1000;
                g1Var.T.c(j17, j17);
            }
            gq4.v.Bi().f258091a.B.c(1000L, 1000L);
            g1Var.B();
            vq4.d0.c("MicroMsg.NetSceneVoipInvite", "invite ok, roomid =" + g1Var.f258065x.f258410q + ",memberid = " + g1Var.f258065x.f258413r + "VoipSyncInterval = " + x27Var.f471251s);
            g1Var.f258067z.J();
            if (gq4.v.Bi().f258091a != null) {
                gq4.v.Bi().f258091a.getClass();
            }
            vq4.d0.j(gq4.v.Bi().m(), gq4.v.Bi().n(), 0, 1);
            return;
        }
        if (i17 != 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var3 = g1Var.f258065x.M1;
            l1Var3.f258246a = 12;
            l1Var3.f258248b = i18;
            l1Var3.f258259m = 99;
            l1Var3.f258265s = 6;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 9, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
            g1Var.v(1, -9004, "", 3);
            return;
        }
        vq4.d0.c("MicroMsg.NetSceneVoipInvite", "RoomId in InviteResp: " + x27Var.f471239d + "," + x27Var.f471242g);
        if (i18 == 211) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var4 = g1Var.f258065x.M1;
            l1Var4.f258246a = 12;
            l1Var4.f258259m = 12;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 8, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
        } else if (i18 != 241) {
            switch (i18) {
                case com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d /* 233 */:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var5 = g1Var.f258065x.M1;
                    l1Var5.f258246a = 12;
                    l1Var5.f258259m = 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 3, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
                    break;
                case 234:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var6 = g1Var.f258065x.M1;
                    l1Var6.f258246a = 13;
                    l1Var6.f258259m = 11;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 4, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
                    break;
                case 235:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var7 = g1Var.f258065x.M1;
                    l1Var7.f258246a = 13;
                    l1Var7.f258259m = 2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 2, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
                    break;
                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j6.f34370x366c91de /* 236 */:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var8 = g1Var.f258065x.M1;
                    l1Var8.f258246a = 12;
                    l1Var8.f258259m = 10;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 7, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
                    break;
                case 237:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var9 = g1Var.f258065x.M1;
                    l1Var9.f258246a = 13;
                    l1Var9.f258259m = 9;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 2, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
                    break;
                case 238:
                    g1Var.f258049h = true;
                    g1Var.f258051j = false;
                    g1Var.f258050i = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f623 = g1Var.f258065x;
                    c18912x54425f623.L0 = 0;
                    c18912x54425f623.K0 = 0;
                    g1Var.D(3);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f624 = g1Var.f258065x;
                    c18912x54425f624.f258410q = x27Var.f471239d;
                    c18912x54425f624.f258416s = x27Var.f471242g;
                    c18912x54425f624.f258413r = x27Var.f471243h;
                    c18912x54425f624.N1 |= 1;
                    vq4.d0.c("MicroMsg.NetSceneVoipInvite", "steve:[simucall]: use old svr-based simulcall! iSimulCallStatus: " + g1Var.f258065x.N1);
                    g1Var.f258067z.G(w27Var.f470350p);
                    return;
                default:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var10 = g1Var.f258065x.M1;
                    l1Var10.f258246a = 12;
                    l1Var10.f258259m = 99;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 5, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
                    break;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVoipInvite", "invite fail cuz server unavailable! reInvtieInterval is : " + x27Var.E + " seconds!");
            gq4.v.Bi().f258102l = java.lang.System.currentTimeMillis();
            if (x27Var.E != 0) {
                gq4.v.Bi().f258103m = x27Var.E * 1000;
            } else {
                gq4.v.Bi().f258103m = 30000L;
            }
        }
        g1Var.f258065x.M1.f258248b = i18;
        java.lang.String str3 = x27Var.M;
        java.lang.String str4 = str3 != null ? new java.lang.String(android.util.Base64.decode(str3, 0)) : null;
        g1Var.H();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c1 c1Var = g1Var.f258042a0;
        if (c1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3) c1Var).l(1, i18, str, -1, str4);
        }
    }
}
