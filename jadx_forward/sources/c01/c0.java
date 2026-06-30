package c01;

/* loaded from: classes5.dex */
public class c0 implements c01.t {
    public com.p314xaae8f345.mm.p944x882e457a.q0 a(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.brand_username");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.revoke_climsgid");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.replacemsg");
        java.util.LinkedList b27 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).b2(str2, str3);
        if (b27 != null && !b27.isEmpty()) {
            java.util.Iterator it = b27.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                int i17 = f9Var.F & 4;
                if (i17 != 4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatSysCmdMsgConsumerHandleRevokeMsg", "doRevokeMsg revokeFlag=%d msgId=%s talker=%s type=%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), str2, java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()));
                    f9Var.d1(str4);
                    f9Var.m124850x7650bebc(10000);
                    c01.w9.n(f9Var, p0Var);
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(str2);
                if (p17 != null && p17.d1() > 0) {
                    if (p17.d1() >= ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).w8(f9Var)) {
                        p17.Y1(p17.d1() - 1);
                        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).W(p17, p17.h1());
                    }
                }
                gm0.j1.e().j(new c01.b0(this, f9Var));
            }
        }
        return null;
    }
}
