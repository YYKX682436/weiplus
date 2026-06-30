package com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2;

/* renamed from: com.tencent.wechat.aff.game.ZIDL_gfwlHBPoB */
/* loaded from: classes8.dex */
class C27326xb053050d extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.e f298444a;

    /* renamed from: ZIDL_A */
    public void m112994x9db8edf9(int i17, int i18, byte[][] bArr, boolean z17) {
        r45.vs2 vs2Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.e eVar = this.f298444a;
        java.util.ArrayList m119629xd40dd8d = com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(bw5.id.f110068g, bArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e2 e2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e2) eVar;
        e2Var.getClass();
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m119629xd40dd8d.size()), java.lang.Boolean.valueOf(z17)};
        java.lang.String str = e2Var.f221835a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleCmd businessType:%d syncScene:%d cmdList.size:%d handleFinderSync:%b", objArr);
        if (m119629xd40dd8d.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleCmd cmdList is empty");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.n1.GAME_REDDOT_EXIT_UNKNOWN);
            return;
        }
        java.util.Iterator it = m119629xd40dd8d.iterator();
        while (it.hasNext()) {
            bw5.id idVar = (bw5.id) it.next();
            if (idVar != null) {
                int i19 = idVar.f110069d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleCmd cmdId:%d", java.lang.Integer.valueOf(i19));
                boolean[] zArr = idVar.f110071f;
                if (i19 == 60000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "processTabTips cmdId:%d syncScene:%d", java.lang.Integer.valueOf(idVar.f110069d), java.lang.Integer.valueOf(i18));
                    try {
                        byte[] g17 = (zArr[2] ? idVar.f110070e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).g();
                        if (g17.length == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "processTabTips CmdBuf is empty");
                        } else {
                            r45.dz2 dz2Var = new r45.dz2();
                            dz2Var.mo11468x92b714fd(g17);
                            if (dz2Var.m75941xfb821914(0) != null && !dz2Var.m75941xfb821914(0).isEmpty()) {
                                java.util.Iterator it6 = dz2Var.m75941xfb821914(0).iterator();
                                while (it6.hasNext()) {
                                    r45.gz2 gz2Var = (r45.gz2) it6.next();
                                    if (gz2Var != null && ((r45.vs2) gz2Var.m75936x14adae67(0)) != null && (gVar = (vs2Var = (r45.vs2) gz2Var.m75936x14adae67(0)).f470021f) != null && gVar.f273689a.length > 0) {
                                        r45.xs2 xs2Var = new r45.xs2();
                                        xs2Var.mo11468x92b714fd(vs2Var.f470021f.g());
                                        if (xs2Var.m75934xbce7f2f(7) != null && xs2Var.m75934xbce7f2f(7).f273689a.length > 0) {
                                            r45.ez2 ez2Var = new r45.ez2();
                                            ez2Var.mo11468x92b714fd(xs2Var.m75934xbce7f2f(7).g());
                                            if (ez2Var.m75934xbce7f2f(4) != null && ez2Var.m75934xbce7f2f(4).f273689a.length > 0) {
                                                java.lang.String str2 = new java.lang.String(ez2Var.m75934xbce7f2f(4).g(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "processTabTips gameDataJson length:%d", java.lang.Integer.valueOf(str2.length()));
                                                e2Var.b(str2);
                                            }
                                        }
                                    }
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "processTabTips tab_tips_info is empty");
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "processTabTips failed", new java.lang.Object[0]);
                    }
                } else if (i19 == 60001) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "processRevokeTabTips cmdId:%d", java.lang.Integer.valueOf(idVar.f110069d));
                    try {
                        byte[] g18 = (zArr[2] ? idVar.f110070e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).g();
                        if (g18.length == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "processRevokeTabTips CmdBuf is empty");
                        } else {
                            bw5.kv kvVar = new bw5.kv();
                            kvVar.mo11468x92b714fd(g18);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "processRevokeTabTips revoke tabTips successfully");
                            java.util.Iterator it7 = kvVar.f111086d.iterator();
                            while (it7.hasNext()) {
                                bw5.lv lvVar = (bw5.lv) it7.next();
                                java.lang.String str3 = lvVar.f111526f[1] ? lvVar.f111524d : "";
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "revoke msg_id:%s", str3);
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().h(str3, true);
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e18, "processRevokeTabTips failed", new java.lang.Object[0]);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "handleCmd unknown cmdId:%d", java.lang.Integer.valueOf(i19));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        this.f298444a = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.e) obj;
    }
}
