package t74;

/* loaded from: classes4.dex */
public final class i2 extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f497691a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f497692b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f497693c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f497694d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f497695e;

    /* renamed from: f, reason: collision with root package name */
    public int f497696f;

    /* renamed from: g, reason: collision with root package name */
    public int f497697g;

    /* renamed from: h, reason: collision with root package name */
    public int f497698h;

    /* renamed from: i, reason: collision with root package name */
    public final t74.h2 f497699i;

    /* renamed from: j, reason: collision with root package name */
    public final t74.h2 f497700j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f497701k;

    public i2() {
        t74.h2 h2Var = new t74.h2();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        h2Var.f497681a = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        this.f497699i = h2Var;
        t74.h2 h2Var2 = new t74.h2();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        h2Var2.f497681a = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        this.f497700j = h2Var2;
        this.f497701k = new java.util.ArrayList();
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("snsid", this.f497692b);
            } catch (java.lang.Throwable unused) {
            }
        }
        if (jSONObject != null) {
            jSONObject.putOpt("uxinfo", this.f497693c);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("adExtInfo", this.f497694d);
        }
        if (jSONObject != null) {
            jSONObject.putOpt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f497691a));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        if (jSONObject != null) {
            jSONObject.putOpt("touchCount", java.lang.Integer.valueOf(this.f497695e));
        }
        if (jSONObject != null) {
            jSONObject.putOpt("flipCount", java.lang.Integer.valueOf(this.f497696f));
        }
        if (jSONObject != null) {
            jSONObject.putOpt("cardClickCount", java.lang.Integer.valueOf(this.f497697g));
        }
        if (jSONObject != null) {
            jSONObject.putOpt("learnMoreClickCount", java.lang.Integer.valueOf(this.f497698h));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillReportItemListJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f497701k;
        if (!arrayList.isEmpty()) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t74.h2 h2Var = (t74.h2) it.next();
                h2Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                try {
                    jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt(ya.b.f77479x42930b2, java.lang.Integer.valueOf(h2Var.f497681a));
                    jSONObject2.putOpt(dm.n.f67499xab3e7a9, java.lang.Integer.valueOf(h2Var.f497682b));
                    jSONObject2.putOpt("playCount", java.lang.Integer.valueOf(h2Var.f497683c));
                    jSONObject2.putOpt("finishPlayCount", java.lang.Integer.valueOf(h2Var.f497684d));
                    jSONObject2.putOpt("playTotalTime", java.lang.Integer.valueOf(h2Var.f497685e + h2Var.f497687g));
                    jSONObject2.putOpt("videoTotalTime", java.lang.Integer.valueOf(h2Var.f497686f));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                } catch (java.lang.Throwable unused) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJson", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    jSONArray.put(jSONObject2);
                }
            }
            if (jSONArray.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlipCardAdChannelData", "fillReportItemListJsonArray, but jsonArray length less than 1");
            } else if (jSONObject != null) {
                jSONObject.putOpt("reportItemList", jSONArray);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillReportItemListJsonArray", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
    }

    public final void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        if (i17 == 0) {
            t74.h2 h2Var = this.f497699i;
            h2Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            int i18 = h2Var.f497682b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            h2Var.f497682b = i18 + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        } else {
            t74.h2 h2Var2 = this.f497700j;
            h2Var2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            int i19 = h2Var2.f497682b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
            h2Var2.f497682b = i19 + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFlipCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        this.f497696f++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFlipCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
    }

    public final void e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updatePlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        if (i17 == 0) {
            t74.h2 h2Var = this.f497699i;
            h2Var.d(h2Var.b() + h2Var.a());
            h2Var.c(0);
        } else {
            t74.h2 h2Var2 = this.f497700j;
            h2Var2.d(h2Var2.b() + h2Var2.a());
            h2Var2.c(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        return "sns_ad_flip_card_report";
    }
}
