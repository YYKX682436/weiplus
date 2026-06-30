package oh1;

/* loaded from: classes7.dex */
public enum o2 implements vg3.q4 {
    INSTANCE;

    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (str == null || !str.equals("UpdateWxaUserSwitchNotify")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaNotifySwitchMsgHandler", "subType not match, return");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaNotifySwitchMsgHandler", "consumeNewXml subType:%s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x51.j1.g(p0Var.f152259a.f459094h))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaNotifySwitchMsgHandler", "msg content is null");
            return null;
        }
        java.util.Iterator it = map.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            final oh1.c1 c1Var = oh1.c1.INSTANCE;
            if (!hasNext) {
                r45.et3 et3Var = new r45.et3();
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152200d = 2709;
                lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/getuserswitch";
                lVar.f152197a = et3Var;
                lVar.f152198b = new r45.ft3();
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v() { // from class: oh1.c1$$a
                    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
                    public final void a(int i17, int i18, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
                        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
                        oh1.c1.this.getClass();
                        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f152244b.f152233a) != null && (fVar instanceof r45.ft3)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a().putInt(".sysmsg.UpdateWxaUserSwitchNotify.DiscoveryEntranceUseFake", ((r45.ft3) fVar).f456126d);
                        }
                    }
                });
                return null;
            }
            java.lang.String str2 = (java.lang.String) it.next();
            if (str2.startsWith(".sysmsg.UpdateWxaUserSwitchNotify.")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a().putInt(str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2), 0));
            }
        }
    }
}
