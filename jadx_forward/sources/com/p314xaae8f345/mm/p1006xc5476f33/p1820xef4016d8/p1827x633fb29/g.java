package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes8.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.i {
    public g(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetRedpacketFission", "packetId: %s senderUsername：%s msgCreateTime:%s,packetSource：%s sceneType:%s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.wm3 wm3Var = new r45.wm3();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = wm3Var;
        lVar.f152198b = new r45.xm3();
        lVar.f152200d = 6957;
        lVar.f152199c = "/cgi-bin/micromsg-bin/getredpacketfission";
        wm3Var.f470804d = str;
        wm3Var.f470805e = str2;
        wm3Var.f470806f = i17;
        wm3Var.f470807g = i18;
        wm3Var.f470808h = i19;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            try {
                byte[] decode = android.util.Base64.decode(str3, 2);
                if (decode != null && decode.length > 0) {
                    wm3Var.f470809i = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(decode);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CgiGetRedpacketFission", th6, "Fail to decode64.", new java.lang.Object[0]);
            }
        }
        p(lVar.a());
    }
}
