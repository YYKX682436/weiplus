package x44;

/* loaded from: classes4.dex */
public final class w0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenChatUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString(dm.i4.f66875xa013b0d5);
        if (optString == null || r26.n0.N(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.JsApi", "the user name is empty!");
            b(w44.d.h(this, null, 1, null));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenChatUI");
            return;
        }
        android.app.Activity a17 = env.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.JsApi", "the activity is null!");
            b(w44.d.h(this, null, 1, null));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenChatUI");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", optString);
        intent.putExtra("key_has_add_contact", true);
        intent.putExtra("finish_direct", true);
        intent.setClassName(a17, "com.tencent.mm.ui.chatting.ChattingUI");
        a84.d0.e(a17, intent);
        a17.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        b(l());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenChatUI");
    }
}
