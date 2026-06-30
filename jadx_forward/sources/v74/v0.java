package v74;

/* loaded from: classes4.dex */
public final class v0 extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f515464a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f515465b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f515466c = "";

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f515467d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f515468e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public int f515469f;

    /* renamed from: g, reason: collision with root package name */
    public int f515470g;

    /* renamed from: h, reason: collision with root package name */
    public v74.u0 f515471h;

    public v0(int i17) {
        this.f515464a = i17;
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("snsid", this.f515466c);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookStatistic", "fillBaseJsonObject exp=" + e17);
            }
        }
        java.lang.String str = "";
        java.lang.String str2 = null;
        if (jSONObject != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f515465b;
            java.lang.String m70375x338a8cc7 = c17933xe8d1b226 != null ? c17933xe8d1b226.m70375x338a8cc7() : null;
            if (m70375x338a8cc7 == null) {
                m70375x338a8cc7 = "";
            }
            jSONObject.putOpt("uxinfo", m70375x338a8cc7);
        }
        if (jSONObject != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f515465b;
            if (c17933xe8d1b2262 != null && (m70354x74235b3e = c17933xe8d1b2262.m70354x74235b3e()) != null) {
                str2 = m70354x74235b3e.f38172xd73c98cc;
            }
            if (str2 != null) {
                str = str2;
            }
            jSONObject.putOpt("adExtInfo", str);
        }
        int i17 = this.f515464a == 0 ? 1 : 2;
        if (jSONObject != null) {
            jSONObject.putOpt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        int i17;
        int i18;
        r45.jj4 b17;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f515465b;
        boolean z17 = true;
        if (!(c17933xe8d1b226 != null && c17933xe8d1b226.m70401x59316745())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookStatistic", "getReportStr, not lookbookAd, snsId=" + this.f515466c);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            return;
        }
        if (jSONObject != null) {
            try {
                jSONObject.put("scrollCount", this.f515469f);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookStatistic", "fillExtJsonObject exp=" + e17);
                ca4.q.c("AdLookbookStatistic, fillExtJsonObject exp", e17);
            }
        }
        if (jSONObject != null) {
            jSONObject.put("slideCount", this.f515470g);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = this.f515468e.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            v74.u0 u0Var = (v74.u0) entry.getValue();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            v74.q e18 = e(intValue);
            if ((e18 == null || e18.c() != z17) ? false : z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMEDIA_TYPE_SIGHT", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMEDIA_TYPE_SIGHT$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMEDIA_TYPE_SIGHT$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMEDIA_TYPE_SIGHT", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
                i17 = 2;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMEDIA_TYPE_IMAGE", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMEDIA_TYPE_IMAGE$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMEDIA_TYPE_IMAGE$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMEDIA_TYPE_IMAGE", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
                i17 = 1;
            }
            jSONObject2.put(ya.b.f77479x42930b2, intValue);
            jSONObject2.put("mediaType", i17);
            java.util.Iterator it6 = it;
            jSONObject2.put(dm.n.f67499xab3e7a9, u0Var.c());
            jSONObject2.put("clickCount", u0Var.a());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMEDIA_TYPE_SIGHT", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMEDIA_TYPE_SIGHT$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMEDIA_TYPE_SIGHT$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMEDIA_TYPE_SIGHT", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
            if (i17 == 2) {
                if (u0Var.b() > 0) {
                    i18 = u0Var.b();
                } else {
                    v74.q e19 = e(intValue);
                    i18 = (int) (((e19 == null || (b17 = e19.b()) == null) ? 0.0f : b17.R) * 1000);
                }
                if (u0Var.d() <= 0 || i18 <= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                    i19 = u0Var.f515458d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                } else {
                    i19 = i18;
                }
                int g17 = u0Var.g() + u0Var.e();
                u0Var.g();
                u0Var.e();
                u0Var.h(0);
                jSONObject2.put("playCount", u0Var.f());
                jSONObject2.put("finishPlayCount", u0Var.d());
                jSONObject2.put("playTotalTime", g17);
                jSONObject2.put("maxPlayTime", i19);
                jSONObject2.put("videoTotalTime", i18);
            }
            jSONArray.put(jSONObject2);
            it = it6;
            z17 = true;
        }
        if (jSONObject != null) {
            jSONObject.put("reportItemList", jSONArray);
        }
        v74.u0 u0Var2 = this.f515471h;
        if (u0Var2 != null && jSONObject != null) {
            jSONObject.put("brandNewItem", g(u0Var2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearStatisticData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookStatistic", "clearStatisticData");
        this.f515469f = 0;
        this.f515470g = 0;
        this.f515468e.clear();
        this.f515467d.clear();
        this.f515471h = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearStatisticData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
    }

    public final v74.u0 d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        if (f(i17)) {
            java.util.HashMap hashMap = this.f515468e;
            v74.u0 u0Var = (v74.u0) hashMap.get(java.lang.Integer.valueOf(i17));
            if (u0Var == null) {
                u0Var = new v74.u0();
                hashMap.put(java.lang.Integer.valueOf(i17), u0Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            return u0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookStatistic", "!isValidPosition, return fake ItemData, pos=" + i17 + ", snsId=" + this.f515466c);
        v74.u0 u0Var2 = new v74.u0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        return u0Var2;
    }

    public final v74.q e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        v74.m mVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLookbookItem", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        v74.q qVar = null;
        if (f(i17) && (c17933xe8d1b226 = this.f515465b) != null && (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) != null && (mVar = m70354x74235b3e.f38191xf4087299) != null) {
            qVar = (v74.q) mVar.c().get(i17);
        }
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookStatistic", "getLookbookItemData err, pos=" + i17 + ", snsId=" + this.f515466c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLookbookItem", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        return qVar;
    }

    public final boolean f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        v74.m mVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f515465b;
        if (c17933xe8d1b226 != null && c17933xe8d1b226.m70401x59316745()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f515465b;
            java.util.List c17 = (c17933xe8d1b2262 == null || (m70354x74235b3e = c17933xe8d1b2262.m70354x74235b3e()) == null || (mVar = m70354x74235b3e.f38191xf4087299) == null) ? null : mVar.c();
            boolean z17 = c17 != null && i17 >= 0 && i17 < c17.size();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            return z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookStatistic", "!isValidPosition, pos=" + i17 + ", snsId=" + this.f515466c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        return false;
    }

    public final org.json.JSONObject g(v74.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeSplashCardDataJson", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.f77479x42930b2, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMEDIA_TYPE_SIGHT", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMEDIA_TYPE_SIGHT$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMEDIA_TYPE_SIGHT$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMEDIA_TYPE_SIGHT", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
        jSONObject.put("mediaType", 2);
        jSONObject.put(dm.n.f67499xab3e7a9, u0Var.c());
        jSONObject.put("clickCount", u0Var.a());
        jSONObject.put("playCount", u0Var.f());
        jSONObject.put("finishPlayCount", u0Var.d());
        jSONObject.put("playTotalTime", u0Var.g());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
        int i17 = u0Var.f515458d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
        jSONObject.put("maxPlayTime", i17);
        jSONObject.put("videoTotalTime", u0Var.b());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeSplashCardDataJson", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        return jSONObject;
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        return "sns_ad_lookbook_report";
    }

    public final void h(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        if (f(i17)) {
            v74.u0 d17 = d(i17);
            int c17 = d17.c() + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
            d17.f515461g = c17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookStatistic", "onItemExposure, pos=" + i17 + ", total=" + d(i17).c());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookStatistic", "onItemExposure, invalid pos=" + i17 + ", total=" + d(i17).c());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
    }

    public final void i(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemVisibleCheck", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        java.util.Set set = this.f515467d;
        if (!set.contains(java.lang.Integer.valueOf(i17))) {
            h(i17);
            set.add(java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemVisibleCheck", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
    }

    @Override // a84.s0, a84.r0
    public java.lang.String j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        java.lang.String j17 = super.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        return j17;
    }
}
