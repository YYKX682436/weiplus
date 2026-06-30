package x44;

/* loaded from: classes4.dex */
public final class g1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenLocationPage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        double optDouble = data.optDouble("slat");
        double optDouble2 = data.optDouble("slong");
        int optInt = data.optInt("scale");
        java.lang.String optString = data.optString("poiname", "");
        java.lang.String optString2 = data.optString(ya.b.f77489x9ff58fb5, "");
        if (java.lang.Math.abs(optDouble) > 90.0d || java.lang.Math.abs(optDouble2) > 180.0d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("", "the slat is " + optDouble + " , the slong is " + optDouble2);
            b(g("the slat or slong is invalid!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenLocationPage");
            return;
        }
        if (env.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("", "the activity is null");
            b(g("the activity is null"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenLocationPage");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 1);
        intent.putExtra("kwebmap_slat", optDouble);
        intent.putExtra("kwebmap_lng", optDouble2);
        intent.putExtra("kwebmap_scale", optInt);
        intent.putExtra("kPoiName", optString);
        intent.putExtra("Kwebmap_locaion", optString2);
        j45.l.n(env.a(), ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, 2002);
        android.app.Activity a17 = env.a();
        if (a17 != null) {
            a17.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        }
        b(l());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenLocationPage");
    }
}
