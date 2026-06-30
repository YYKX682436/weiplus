package x44;

/* loaded from: classes4.dex */
public final class h extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.BackToThirdApp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("appId");
        if (optString == null || optString.length() == 0) {
            b(g("the app id is empty!!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.BackToThirdApp");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.BackToThirdApp", "it is going to back to " + optString);
        if (((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai("nativeOpenAdCanvas", "", optString, 0, "")) {
            b(l());
        } else {
            b(w44.d.k(this, -1, "launchBackApp failed!!", null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.BackToThirdApp");
    }
}
