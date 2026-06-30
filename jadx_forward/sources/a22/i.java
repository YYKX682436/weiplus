package a22;

/* loaded from: classes11.dex */
public class i implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        r45.j4 j4Var = p0Var.f152259a;
        int i17 = j4Var.f459093g;
        if (i17 != 10002) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "not new xml type:%d ", java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f459094h);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "msg content is null");
            return;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        if (d17 == null || d17.size() <= 0) {
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equalsIgnoreCase("NewRecommendEmotion")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "not emoji message type :" + str);
            return;
        }
        java.util.ArrayList a17 = a22.h.a(g17);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().f552321d.mo70514xb06685ab("EmojiGroupInfo", "recommand=? and type!=? and status!=?", new java.lang.String[]{"1", "2", "7"});
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        z85.d b17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b();
        b17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[insertRecommendEmojiGroupInfo]");
        b17.P1(a17);
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
