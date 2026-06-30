package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes12.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o f179117g;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179122e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179123f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f179120c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f179121d = false;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f179119b = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_EXPT_CONFIG_STRING, "");

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f179118a = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_EXPT_MAIN_TAB_CONFIG_STRING, "");

    public o() {
        b();
    }

    public static synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o oVar;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o.class) {
            if (f179117g == null) {
                f179117g = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.o();
            }
            oVar = f179117g;
        }
        return oVar;
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreExpt", "updateExpt: %s %s", this.f179119b, this.f179118a);
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f179119b)) {
                this.f179120c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(new org.json.JSONObject(this.f179119b).optString("second_strategy", "None"), "Paid");
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f179118a)) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f179118a);
            this.f179121d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(jSONObject.optString("strategy", "Recommend"), "FriendDownloads");
            this.f179122e = jSONObject.optString("tab_wording");
            this.f179123f = jSONObject.optString("list_wording");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiStoreExpt", e17, "", new java.lang.Object[0]);
            this.f179120c = false;
            this.f179121d = false;
        }
    }
}
