package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9;

/* loaded from: classes4.dex */
public final class a extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f245201a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f245202b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f245203c;

    /* renamed from: d, reason: collision with root package name */
    public int f245204d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f245205e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f245206f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Long f245207g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Long f245208h;

    /* renamed from: i, reason: collision with root package name */
    public int f245209i;

    /* renamed from: j, reason: collision with root package name */
    public int f245210j;

    /* renamed from: k, reason: collision with root package name */
    public int f245211k;

    /* renamed from: l, reason: collision with root package name */
    public int f245212l;

    /* renamed from: m, reason: collision with root package name */
    public int f245213m;

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("snsid", this.f245201a);
            } catch (java.lang.Throwable unused) {
            }
        }
        if (jSONObject != null) {
            jSONObject.putOpt("uxinfo", this.f245202b);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("adExtInfo", this.f245203c);
        }
        if (jSONObject != null) {
            jSONObject.putOpt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f245204d));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("totalPlayTime", this.f245205e);
            } catch (java.lang.Throwable unused) {
            }
        }
        if (jSONObject != null) {
            jSONObject.putOpt("joinLiveFlag", this.f245206f);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("joinLiveStartTimestamp", this.f245207g);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("joinLiveEndTimestamp", this.f245208h);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("displayType", java.lang.Integer.valueOf(this.f245209i));
        }
        if (this.f245209i == 1) {
            if (jSONObject != null) {
                jSONObject.putOpt("showFrontImage", java.lang.Integer.valueOf(this.f245210j));
            }
            if (jSONObject != null) {
                jSONObject.putOpt("showBrandWallpaperImage", java.lang.Integer.valueOf(this.f245211k));
            }
            if (jSONObject != null) {
                jSONObject.putOpt("horizontalGravity", java.lang.Integer.valueOf(this.f245212l));
            }
            if (jSONObject != null) {
                jSONObject.putOpt("verticalGravity", java.lang.Integer.valueOf(this.f245213m));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderLiveStreamData");
        return "sns_ad_finder_live_stream_report";
    }
}
