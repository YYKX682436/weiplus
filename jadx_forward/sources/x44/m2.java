package x44;

/* loaded from: classes4.dex */
public final class m2 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("requestIcon", "");
        java.lang.String optString2 = data.optString("requestName", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (!(optString.length() == 0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            if (!(optString2.length() == 0)) {
                android.app.Activity a17 = env.a();
                if (!(a17 instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.RequestPhoneNumber", "the activity is null or not fragmentActivity!!");
                    b(g("the activity is or not fragmentActivity!!"));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber");
                    return;
                } else {
                    java.lang.String m69867x92bb0121 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69867x92bb0121();
                    java.lang.String str = m69867x92bb0121 == null ? "" : m69867x92bb0121;
                    java.lang.String a18 = com.p314xaae8f345.mm.ui.fg.a(str);
                    ((ku5.t0) ku5.t0.f394148d).B(new x44.l2(a17, a18 == null ? "" : a18, optString2, optString, this, str));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber");
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.RequestPhoneNumber", "the request icon or request name is empty!!");
        b(g("the request icon or request name is empty!!"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber");
    }
}
