package x44;

/* loaded from: classes4.dex */
public final class v0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("weAppUserName");
        java.lang.String optString2 = data.optString("businessId");
        java.lang.String optString3 = data.optString("weAppId");
        java.lang.String optString4 = data.optString("sessionFrom");
        boolean optBoolean = data.optBoolean("showMessageCard");
        java.lang.String optString5 = data.optString("sendMessageTitle");
        java.lang.String optString6 = data.optString("sendMessagePath");
        java.lang.String optString7 = data.optString("sendMessageImg");
        java.lang.String a17 = a54.h.a(env.b());
        if (env.a() == null) {
            b(g("activity is null"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat");
            return;
        }
        if (optString2 == null || r26.n0.N(optString2)) {
            x44.y2 y2Var = x44.y2.f533469a;
            android.app.Activity a18 = env.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString7);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doEnterChattingOnMainThread$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
            y2Var.a(a18, optString, optString3, optString4, optBoolean ? 1 : 0, optString5, optString6, optString7, a17, "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doEnterChattingOnMainThread$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
            b(l());
        } else {
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(env.a())) {
                android.app.Activity context = env.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                x44.u0 u0Var = new x44.u0(env, optString, optString3, optString4, optBoolean ? 1 : 0, optString5, optString6, optString7, a17, this);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSubBusinessInfo", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = new r45.po3();
                lVar.f152198b = new r45.qo3();
                lVar.f152199c = "/cgi-bin/mmbiz-bin/wxausrevent/getsubbusinessinfo";
                lVar.f152200d = 1303;
                lVar.f152201e = 0;
                lVar.f152202f = 0;
                com.p314xaae8f345.mm.p944x882e457a.o a19 = lVar.a();
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a19.f152243a.f152217a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetSubBusinessInfoRequest");
                r45.po3 po3Var = (r45.po3) fVar;
                po3Var.f464784d = optString;
                po3Var.f464785e = optString2;
                ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a19, new x44.x2(u0Var));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSubBusinessInfo", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
                str = "doAction";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdJs.ServiceChat", "there is no network");
            b(w44.d.k(this, 300001, "fail:get network failed", null, 4, null));
        }
        str = "doAction";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat");
    }
}
