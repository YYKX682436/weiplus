package x44;

/* loaded from: classes4.dex */
public final class d3 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        java.lang.String optString;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShowPhoneNumberMenu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        org.json.JSONArray optJSONArray = data.optJSONArray("phoneNumList");
        int length = optJSONArray != null ? optJSONArray.length() : 0;
        if (length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.PhoneMenu", "the phone count is 0");
            b(g(": there is no phone number!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShowPhoneNumberMenu");
            return;
        }
        if (env.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.PhoneMenu", "the activity is null");
            b(g("the activity is null!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShowPhoneNumberMenu");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < length; i17++) {
            if (optJSONArray != null && (optString = optJSONArray.optString(i17)) != null) {
                arrayList.add(optString);
            }
        }
        if (arrayList.size() > 1) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.q qVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.p.f272806a;
            if ((qVar != null ? ((ku5.t0) ku5.t0.f394148d).B(new x44.c3(qVar, env, arrayList)) : null) == null) {
                b(w44.d.k(this, 600002, "fail: show phone menu failed!", null, 4, null));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShowPhoneNumberMenu");
                return;
            }
            b(l());
        } else if (arrayList.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69787x3c09f1a8(env.a(), (java.lang.String) arrayList.get(0));
            b(l());
        } else {
            b(g("there is no phone number!!"));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShowPhoneNumberMenu");
    }
}
