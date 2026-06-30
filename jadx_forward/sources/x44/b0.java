package x44;

/* loaded from: classes4.dex */
public final class b0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvasExtra");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("canvasKey");
        if (optString == null || optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.VangoghCanvasExtra", "the canvas key is empty, please check it!!!");
            b(g("the canvas key is empty!!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvasExtra");
            return;
        }
        m54.j jVar = m54.j.f405815a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (!m54.j.h(jVar.c(optString))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.VangoghCanvasExtra", "the canvas key has no vangogh element, canvas key is ".concat(optString));
            b(g("the canvas key has no vangogh element"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvasExtra");
            return;
        }
        java.lang.String p17 = env.b().p();
        if (p17 == null) {
            p17 = "";
        }
        java.lang.String f17 = env.b().f();
        if (f17 == null) {
            f17 = "";
        }
        java.lang.String b17 = env.b().b();
        java.lang.String str = b17 != null ? b17 : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", p17);
        jSONObject.put("rewardCommInfo", f17);
        jSONObject.put("rewardParams", str);
        m(jSONObject);
        b(jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvasExtra");
    }
}
