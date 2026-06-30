package i54;

/* loaded from: classes.dex */
public final class s implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiContext, "jsApiContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("requestName");
        java.lang.String optString2 = data.optString("requestIconUrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdForm.PhoneNumber", "name is " + optString + ", iconUrl is " + optString2);
        if (!(optString == null || optString.length() == 0)) {
            if (!(optString2 == null || optString2.length() == 0)) {
                java.lang.String m69867x92bb0121 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69867x92bb0121();
                android.content.Context c17 = jsApiContext.c();
                if (c17 instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
                    eb4.d.f332417a.a((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) c17, m69867x92bb0121, optString, optString2, new i54.r(jsApiContext));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdForm.PhoneNumber", "the context is invalid!");
                    jsApiContext.a("params error", kz5.c1.l(new jz5.l("ret", "-4"), new jz5.l("err_msg", "the context is invalid!!!")));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber");
            }
        }
        jsApiContext.a("params error", kz5.c1.l(new jz5.l("ret", "-1"), new jz5.l("err_msg", "the context is invalid!!!")));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber");
    }
}
