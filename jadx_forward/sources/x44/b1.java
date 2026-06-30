package x44;

/* loaded from: classes4.dex */
public final class b1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenEmojiStore");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("emojiProductId");
        int optInt = data.optInt("precedingScene", 22);
        int optInt2 = data.optInt("entranceScene", 33);
        java.lang.String a17 = a54.h.a(env.b());
        if (env.a() == null) {
            b(g("activity is null!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenEmojiStore");
            return;
        }
        if (optString == null || r26.n0.N(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.EmojiStore", "the emoji id is empty!");
            b(w44.d.k(this, 6, ": emoji id is empty!", null, 4, null));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenEmojiStore");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        qk.c0 c0Var = new qk.c0(optString);
        c0Var.f445731g = optInt;
        c0Var.f445688a = optInt2;
        c0Var.f445739o = a17;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
        if (p6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.EmojiStore", "emoticon liteapp service not found");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenEmojiStore");
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(env.a(), c0Var);
        android.app.Activity a18 = env.a();
        if (a18 != null) {
            a18.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        }
        b(l());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenEmojiStore");
    }
}
