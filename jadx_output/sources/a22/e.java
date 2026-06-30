package a22;

/* loaded from: classes11.dex */
public class e implements c01.yc {
    public static void b(a22.d dVar) {
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "xml is null.");
            return;
        }
        if (dVar.f828a > 0) {
            gm0.j1.u().c().w(208899, java.lang.Boolean.TRUE);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().r(262147, true);
        }
        if (dVar.f829b > 0) {
            gm0.j1.u().c().w(208913, java.lang.Boolean.TRUE);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().r(262149, true);
        }
        java.lang.String str = dVar.f830c;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            gm0.j1.u().c().w(229633, "");
            gm0.j1.u().c().w(229634, "");
            return;
        }
        gm0.j1.u().c().w(229633, str);
        gm0.j1.u().c().w(229634, java.lang.System.currentTimeMillis() + "");
    }

    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        r45.j4 j4Var = p0Var.f70726a;
        int i17 = j4Var.f377560g;
        if (i17 != 10002) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "not new xml type:%d ", java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "msg content is null");
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        if (d17 == null || d17.size() <= 0) {
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equalsIgnoreCase("emotionstore")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "not emoji message type :" + str);
            return;
        }
        try {
            java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.emotionstore.productid");
            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.emotionstore.newcount");
            java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.emotionstore.freecount");
            a22.d dVar = new a22.d(this, !com.tencent.mm.sdk.platformtools.t8.K0(str3) ? java.lang.Integer.valueOf(str3).intValue() : 0, !android.text.TextUtils.isEmpty(str4) ? java.lang.Integer.valueOf(str4).intValue() : 0, (java.lang.String) d17.get(".sysmsg.emotionstore.thumburl"), str2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                b(dVar);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "new xml productid is %s. now try to get download flag", str2);
                gm0.j1.n().f273288b.g(new z12.p(str2, dVar));
            }
            java.lang.String str5 = (java.lang.String) d17.get(".sysmsg.personalemotion.newcount");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str5) && java.lang.Integer.valueOf(str5).intValue() > 0) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, java.lang.Boolean.TRUE);
            }
            java.lang.String str6 = (java.lang.String) d17.get(".sysmsg.personalemoji.emojicount");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str6) || java.lang.Integer.valueOf(str6).intValue() <= 0) {
                return;
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_NEW_DESIGNER_EMOJI_BOOLEAN, java.lang.Boolean.TRUE);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiNewFreeSysCmdMsgListener", "onRecieveMsg:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
