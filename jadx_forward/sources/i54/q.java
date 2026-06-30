package i54;

/* loaded from: classes4.dex */
public final class q implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestAppointment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiContext, "jsApiContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int optInt = data.optInt("opType", -1);
        java.lang.String optString = data.optString("phoneNumber");
        if (optString == null) {
            optString = "";
        }
        long optLong = data.optLong("appointmentId");
        java.lang.String a17 = a54.h.a(jsApiContext.e());
        b54.b.f99628a.a(optInt, optLong, a17, optString, new i54.p(jsApiContext));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestAppointment");
    }
}
