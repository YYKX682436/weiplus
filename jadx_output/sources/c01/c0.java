package c01;

/* loaded from: classes5.dex */
public class c0 implements c01.t {
    public com.tencent.mm.modelbase.q0 a(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.brand_username");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.revoke_climsgid");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.replacemsg");
        java.util.LinkedList b27 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).b2(str2, str3);
        if (b27 != null && !b27.isEmpty()) {
            java.util.Iterator it = b27.iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                int i17 = f9Var.F & 4;
                if (i17 != 4) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizChatSysCmdMsgConsumerHandleRevokeMsg", "doRevokeMsg revokeFlag=%d msgId=%s talker=%s type=%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(f9Var.getMsgId()), str2, java.lang.Integer.valueOf(f9Var.getType()));
                    f9Var.d1(str4);
                    f9Var.setType(10000);
                    c01.w9.n(f9Var, p0Var);
                    ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
                }
                com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(str2);
                if (p17 != null && p17.d1() > 0) {
                    if (p17.d1() >= ((com.tencent.mm.storage.g9) c01.d9.b().u()).w8(f9Var)) {
                        p17.Y1(p17.d1() - 1);
                        ((com.tencent.mm.storage.m4) c01.d9.b().r()).W(p17, p17.h1());
                    }
                }
                gm0.j1.e().j(new c01.b0(this, f9Var));
            }
        }
        return null;
    }
}
