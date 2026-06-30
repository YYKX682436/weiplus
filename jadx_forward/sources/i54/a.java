package i54;

/* loaded from: classes4.dex */
public final class a implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiControlFloatComp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiContext, "jsApiContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("action");
        if (optString == null) {
            optString = "";
        }
        java.lang.String a17 = jsApiContext.d().a();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("componentId", a17);
        jSONObject.put("action", p3321xbce91901.jvm.p3324x21ffc6bd.o.b("show", optString) ? "show" : "hide");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdForm.ControlFloat", "the float comp param is " + jSONObject);
        h54.a d17 = jsApiContext.d();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("event", "onEventFloatBarVisibility");
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        linkedHashMap.put("params", jSONObject2);
        d17.c(linkedHashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiControlFloatComp");
    }
}
