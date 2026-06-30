package w94;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final w94.a f525608a = new w94.a();

    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCoverVideoParam", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d rj6 = d11.s.fj().rj();
        rj6.f152737t = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761;
        rj6.f152728h = 30;
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_cover_finder_video_config, "", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverConfig", "getCoverVideoParam:" + Zi);
            org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
            if (jSONObject.optInt("width", 0) > 0 && jSONObject.optInt("height", 0) > 0) {
                rj6.f152724d = jSONObject.optInt("width", com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf);
                rj6.f152725e = jSONObject.optInt("height", 1280);
                if (jSONObject.optInt("thumbSize", 0) > 0) {
                    rj6.f152737t = jSONObject.optInt("thumbSize", com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761);
                }
                if (jSONObject.optInt("duration", 0) > 0) {
                    rj6.f152728h = jSONObject.optInt("duration", 30);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoverVideoParam", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
                return rj6;
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCoverConfig", "getCoverImageParam get config error");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoverVideoParam", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        return rj6;
    }

    public final boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useNewVersion", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("xlab");
        boolean z17 = false;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_COVER_NEW_INT_SYNC, 0);
        if (r17 == 1) {
            z17 = true;
        } else if (r17 != 2) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_cover_enable, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useNewVersion", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
            return fj6;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useNewVersion", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        return z17;
    }
}
