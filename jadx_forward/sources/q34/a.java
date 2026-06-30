package q34;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f441490a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f441491b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Integer f441492c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f441493d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f441494e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f441495f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f441496g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f441497h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f441498i;

    public final void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFromJson", "com.tencent.mm.plugin.sns.ad.adinfo.AdDynamicConfig");
        if (jSONObject != null) {
            this.f441490a = jSONObject.optInt("forbidAutoPlay") == 1;
            this.f441491b = jSONObject.optInt("hideFirstBossComment") == 1;
            this.f441492c = jSONObject.has("finderLiveStreamDisplayType") ? java.lang.Integer.valueOf(jSONObject.optInt("finderLiveStreamDisplayType")) : null;
            this.f441493d = jSONObject.optInt("hideGameGiftTag") == 1;
            this.f441494e = jSONObject.optInt("hideConsultBar") == 1;
            this.f441495f = jSONObject.optInt("hideAdChainStrengthenLabel") == 1;
            this.f441496g = jSONObject.optInt("showPersonalizedInfoInFeedback") == 1;
            this.f441497h = jSONObject.optInt("hideLikedAdsInFeedback") == 1;
            this.f441498i = jSONObject.optInt("showReasonToastInFeedback") == 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFromJson", "com.tencent.mm.plugin.sns.ad.adinfo.AdDynamicConfig");
    }
}
