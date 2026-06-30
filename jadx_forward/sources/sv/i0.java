package sv;

/* loaded from: classes5.dex */
public class i0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        r45.j4 j4Var = p0Var.f152259a;
        if (j4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BizSysCmdMsgListener", "AddMsg is null.");
            return;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f459094h);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BizSysCmdMsgListener", "msg content is null");
            return;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        if (d17 == null || d17.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BizSysCmdMsgListener", "receiveMessage, no sysmsg");
            return;
        }
        if (!"mmbizattrappsvr_BizAttrSync".equalsIgnoreCase((java.lang.String) d17.get(".sysmsg.$type"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BizSysCmdMsgListener", "receiveMessage, type not BizAttrSync.");
            return;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.mmbizattrappsvr_BizAttrSync.openflag"), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizSysCmdMsgListener", "BizAttrSync openFlag : %d.", java.lang.Integer.valueOf(P));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BIZ_ATTR_SYNC_OPEN_FLAG_INT, java.lang.Integer.valueOf(P));
        gm0.j1.u().c().i(true);
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
