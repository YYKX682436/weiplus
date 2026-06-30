package i54;

/* loaded from: classes4.dex */
public final class z implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiSetCanAutoFillData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiContext, "jsApiContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("status");
        java.lang.String b17 = jsApiContext.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdForm.SetAutoFill", "set auto fill is called!");
        eb4.s.e(optString, b17, new i54.y(jsApiContext));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiSetCanAutoFillData");
    }
}
