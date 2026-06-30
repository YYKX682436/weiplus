package k01;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k01.j f384572a = new k01.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f384573b = kz5.c0.i("wx57f75d9ad73fa413", "wxb9fdcb9fdba754f3", "wxc954aec3c98f03e5");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f384574c = kz5.c0.i("gh_dbe35d1f01ff@app", "gh_143c22d410e7@app", "gh_1067e1418cf5@app");

    public final java.lang.Object a(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLiteGameUtil", "getLiteGameInfoJsonValue error, liteGameInfo:" + str + ", fieldName:" + str2);
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has(str2)) {
                return jSONObject.get(str2);
            }
            return null;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandLiteGameUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final boolean b(java.lang.String str, java.lang.String str2) {
        return kz5.n0.O(f384574c, str) || kz5.n0.O(f384573b, str2);
    }
}
