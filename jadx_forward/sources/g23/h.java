package g23;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f349450a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f349451b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f349452c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f349453d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f349454e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f349455f;

    public h() {
        this.f349450a = false;
        this.f349451b = false;
        this.f349452c = false;
        this.f349455f = false;
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d17 = su4.o2.d("globalSearchInput");
        this.f349450a = d17.optInt("AIMergeSearch", 0) > 0;
        this.f349451b = d17.optInt("hideSearchBar", 0) > 0;
        this.f349452c = d17.optInt("hideNavBar", 0) > 0;
        d17.optInt("newBtnMode", 0);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(d17.optString("largeInputOption", ""));
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("checkboxes");
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        g23.g gVar = new g23.g();
                        gVar.f349447a = optJSONObject.optString("key", "");
                        gVar.f349448b = optJSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f349447a) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f349448b)) {
                            this.f349453d.add(gVar);
                        }
                    }
                }
            }
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("actionbuttons");
            if (optJSONArray2 != null) {
                for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                    org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i18);
                    if (optJSONObject2 != null) {
                        g23.f fVar = new g23.f();
                        java.util.List list = fVar.f349446f;
                        fVar.f349441a = optJSONObject2.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
                        fVar.f349442b = optJSONObject2.optString("type", "");
                        fVar.f349443c = optJSONObject2.optString("iconName", "");
                        fVar.f349444d = optJSONObject2.optLong("timeout", 3L);
                        org.json.JSONArray optJSONArray3 = optJSONObject2.optJSONArray("menus");
                        if (optJSONArray3 != null) {
                            for (int i19 = 0; i19 < optJSONArray3.length(); i19++) {
                                org.json.JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i19);
                                if (optJSONObject3 != null) {
                                    g23.i iVar = new g23.i();
                                    iVar.f349456a = optJSONObject3.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
                                    iVar.f349457b = optJSONObject3.optString("type", "");
                                    iVar.f349459d = optJSONObject3.optString("liteAppId", "");
                                    iVar.f349458c = optJSONObject3.optString("liteAppPath", "");
                                    iVar.f349462g = optJSONObject3.optString("minVersion", "");
                                    iVar.f349461f = optJSONObject3.optBoolean("isTransparent", false);
                                    iVar.f349460e = optJSONObject3.optJSONObject("liteAppQuery");
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f349456a) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f349457b) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f349459d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f349458c) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f349462g)) {
                                        if (fVar.f349445e == null) {
                                            fVar.f349445e = iVar;
                                        }
                                        ((java.util.ArrayList) list).add(iVar);
                                    }
                                }
                            }
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f349441a) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f349442b) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f349443c) && !((java.util.ArrayList) list).isEmpty()) {
                            this.f349454e.add(fVar);
                        }
                    }
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSGlobalSearchInputConfig", e17, "", new java.lang.Object[0]);
        }
        this.f349455f = true;
    }
}
