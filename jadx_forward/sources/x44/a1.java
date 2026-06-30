package x44;

/* loaded from: classes4.dex */
public final class a1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("customerServiceUrl");
        if (optString == null) {
            optString = "";
        }
        java.lang.String a17 = a54.h.a(env.b());
        if (optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.CustomerService", "the jump url is empty!!!");
            b(g("the jump url is empty!!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
            return;
        }
        android.app.Activity a18 = env.a();
        if (a18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.CustomerService", "the context is null!");
            b(g("the context is null!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
            return;
        }
        x44.y0 y0Var = new x44.y0(a18, a17, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestSignedUrl", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
        r45.ta0 ta0Var = new r45.ta0();
        ta0Var.f467763e = a17;
        ta0Var.f467762d = optString;
        ta0Var.f467764f = 1;
        k64.h.a(ta0Var, 2634, "/cgi-bin/mmoc-bin/adplayinfo/customer_service_sign", new x44.z0(optString, y0Var), (r45.js5) r45.ua0.class.newInstance(), false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestSignedUrl", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
    }
}
