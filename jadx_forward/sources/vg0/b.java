package vg0;

/* loaded from: classes8.dex */
public final class b implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f517979a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f517980b;

    public b(java.lang.ref.WeakReference callbackRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackRef, "callbackRef");
        this.f517979a = callbackRef;
        this.f517980b = "downloadPageDataForFastLoad";
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.Object obj = map != null ? map.get("itemList") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        if (((tg0.q1) this.f517979a.get()) != null) {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                if (optJSONObject == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.hitest.FTSFlutterSearchUIC", "downloadPageDataForFastLoad invalid item index: " + i17);
                } else {
                    java.lang.String optString = optJSONObject.optString("url");
                    int optInt = optJSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1);
                    int optInt2 = optJSONObject.optInt("item_show_type", -1);
                    java.lang.String optString2 = optJSONObject.optString("brand_user_name");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "downloadPageDataForFastLoad itemShowType: " + optInt2 + ", openScene: " + optInt + ", url: " + optString);
                    ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(optInt)) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                        if (optString.length() > 0) {
                            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(optString, optInt2, optInt, optString2, new java.lang.Object[0]);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.hitest.FTSFlutterSearchUIC", "downloadPageDataForFastLoad can not preload openScene: " + optInt);
                    }
                }
            }
        }
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f517980b;
    }
}
