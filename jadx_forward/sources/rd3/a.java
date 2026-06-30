package rd3;

/* loaded from: classes3.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f475769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd3.e f475770e;

    public a(lc3.a0 a0Var, rd3.e eVar) {
        this.f475769d = a0Var;
        this.f475770e = eVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        org.json.JSONArray optJSONArray = this.f475769d.optJSONArray("itemList");
        if (optJSONArray != null) {
            if (!(optJSONArray.length() > 0)) {
                optJSONArray = null;
            }
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        int optInt = optJSONObject.optInt("idx", 0);
                        java.lang.String str = "";
                        java.lang.String optString = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
                        java.lang.String optString2 = optJSONObject.optString("lightColor", "");
                        java.lang.String optString3 = optJSONObject.optString("darkColor", "");
                        this.f475770e.getClass();
                        if (com.p314xaae8f345.mm.ui.bk.C()) {
                            if (optString3 != null) {
                                str = optString3;
                            }
                        } else if (optString2 != null) {
                            str = optString2;
                        }
                        int parseColor = android.graphics.Color.parseColor(str);
                        int argb = android.graphics.Color.argb(android.graphics.Color.alpha(parseColor), android.graphics.Color.red(parseColor), android.graphics.Color.green(parseColor), android.graphics.Color.blue(parseColor));
                        g4Var.d(optInt, argb, optString);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiShowActionSheet", "itemIdx: " + optInt + ", itemTitle: " + optString + ", itemlightColor: " + optString2 + ", itemdarkColor: " + optString3 + ", itemColor: " + argb + ", isDarkMode: " + com.p314xaae8f345.mm.ui.bk.C());
                    }
                }
            }
        }
    }
}
