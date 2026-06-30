package i54;

/* loaded from: classes4.dex */
public final class i implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiLiteAppFormAction");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiContext, "jsApiContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("actionData");
        if (optString == null || optString.length() == 0) {
            jsApiContext.a("data is empty", kz5.c1.l(new jz5.l("ret", "-1"), new jz5.l("err_msg", "the context is invalid!!!")));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, 60);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiLiteAppFormAction");
            return;
        }
        h54.a d17 = jsApiContext.d();
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l("event", "onFormWebviewPerformAction");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String a17 = jsApiContext.d().a();
        if (a17 == null) {
            a17 = "";
        }
        jSONObject.put("componentId", a17);
        java.lang.String b17 = jsApiContext.b();
        jSONObject.put("callbackId", b17 != null ? b17 : "");
        jSONObject.put("actionData", optString);
        lVarArr[1] = new jz5.l("params", jSONObject.toString());
        d17.c(kz5.c1.l(lVarArr));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiLiteAppFormAction");
    }
}
