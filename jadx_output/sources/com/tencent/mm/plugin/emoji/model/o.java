package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes12.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.plugin.emoji.model.o f97584g;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f97589e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f97590f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f97587c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f97588d = false;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f97586b = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_EXPT_CONFIG_STRING, "");

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f97585a = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_EXPT_MAIN_TAB_CONFIG_STRING, "");

    public o() {
        b();
    }

    public static synchronized com.tencent.mm.plugin.emoji.model.o a() {
        com.tencent.mm.plugin.emoji.model.o oVar;
        synchronized (com.tencent.mm.plugin.emoji.model.o.class) {
            if (f97584g == null) {
                f97584g = new com.tencent.mm.plugin.emoji.model.o();
            }
            oVar = f97584g;
        }
        return oVar;
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreExpt", "updateExpt: %s %s", this.f97586b, this.f97585a);
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f97586b)) {
                this.f97587c = com.tencent.mm.sdk.platformtools.t8.D0(new org.json.JSONObject(this.f97586b).optString("second_strategy", "None"), "Paid");
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f97585a)) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f97585a);
            this.f97588d = com.tencent.mm.sdk.platformtools.t8.D0(jSONObject.optString("strategy", "Recommend"), "FriendDownloads");
            this.f97589e = jSONObject.optString("tab_wording");
            this.f97590f = jSONObject.optString("list_wording");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiStoreExpt", e17, "", new java.lang.Object[0]);
            this.f97587c = false;
            this.f97588d = false;
        }
    }
}
