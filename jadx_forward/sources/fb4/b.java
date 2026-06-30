package fb4;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final fb4.b f342406a = new fb4.b();

    public final void a(org.json.JSONArray childsJson, java.util.List childsList, kb4.c node, int i17, int i18, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reserveTree", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.JsDataMapper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(childsJson, "childsJson");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(childsList, "childsList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(node, "node");
        int length = childsJson.length();
        for (int i19 = 0; i19 < length; i19++) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONObject optJSONObject = childsJson.optJSONObject(i19);
            java.lang.String optString = optJSONObject.optString("k");
            java.lang.String str = "";
            if (optString == null) {
                optString = "";
            }
            java.lang.String optString2 = optJSONObject.optString(org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            if (!r26.n0.N(optString2) || (map != null && (optString2 = (java.lang.String) map.get(optString)) != null)) {
                str = optString2;
            }
            kb4.c cVar = new kb4.c(optString, str, arrayList, node);
            childsList.add(cVar);
            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("childs");
            if (optJSONArray != null && i17 < i18) {
                f342406a.a(optJSONArray, arrayList, cVar, i17 + 1, i18, map);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reserveTree", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.JsDataMapper");
    }
}
