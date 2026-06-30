package e81;

/* loaded from: classes12.dex */
public class e implements xg3.i0 {
    public static void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17;
        o72.r2 B;
        r45.bq0 bq0Var;
        if (f9Var.mo78013xfb85f7b0() != 1107296305 || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.J0(), "msg", null)) == null || d17.get(".msg.appmsg.announcement") == null || (bq0Var = (B = o72.x1.B(((java.lang.String) d17.get(".msg.appmsg.announcement")).replace("<group_notice_item", "<favitem").replace("group_notice_item>", "favitem>"), 18)).f67640x5ab01132) == null || bq0Var.f452497f.size() <= 0) {
            return;
        }
        java.util.Iterator it = B.f67640x5ab01132.f452497f.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            int i17 = gp0Var.I;
            if (i17 == 2 || i17 == 4 || i17 == 8 || i17 == 10130) {
                dm.a2 a2Var = new dm.a2();
                a2Var.f65845x297eb4f7 = f9Var.m124847x74d37ac6();
                a2Var.f65843xf604e54a = gp0Var.T;
                a2Var.f65844x8863ec94 = hx1.b.c(gp0Var);
                a2Var.f65847xe9deda16 = hx1.b.e(gp0Var);
                a2Var.f65846x22618426 = gp0Var.R + gp0Var.f456951l1;
                new m75.c(a2Var, true, null, null, "MicroMsg.SDK.BaseChatroomNoticeAttachIndex").a(com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.s.f156238e.Q4());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgListener", "insert item. msgId:%d, dataId:%s, dataPath:%s, thumbPath:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), gp0Var.T, a2Var.f65844x8863ec94, a2Var.f65847xe9deda16);
            }
        }
    }

    @Override // xg3.i0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (l0Var.f535944b == "insert") {
            java.util.Iterator it = l0Var.f535945c.iterator();
            while (it.hasNext()) {
                b((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next());
            }
        }
    }
}
