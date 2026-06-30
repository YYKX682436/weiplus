package a22;

/* loaded from: classes11.dex */
public class i implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        r45.j4 j4Var = p0Var.f70726a;
        int i17 = j4Var.f377560g;
        if (i17 != 10002) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "not new xml type:%d ", java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "msg content is null");
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        if (d17 == null || d17.size() <= 0) {
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equalsIgnoreCase("NewRecommendEmotion")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiRecommnedSysCmdMsgListener", "not emoji message type :" + str);
            return;
        }
        java.util.ArrayList a17 = a22.h.a(g17);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().f470788d.delete("EmojiGroupInfo", "recommand=? and type!=? and status!=?", new java.lang.String[]{"1", "2", "7"});
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        z85.d b17 = com.tencent.mm.storage.n5.f().b();
        b17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[insertRecommendEmojiGroupInfo]");
        b17.P1(a17);
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
