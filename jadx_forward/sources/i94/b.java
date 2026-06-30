package i94;

/* loaded from: classes4.dex */
public final class b implements a84.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final h94.a f371295a;

    public b(h94.a foldAdInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(foldAdInfo, "foldAdInfo");
        this.f371295a = foldAdInfo;
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackApproveChannelData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackApproveChannelData");
        return "timeline_ad_feedback_click_positive_btn";
    }

    @Override // a84.r0
    public java.lang.String j() {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackApproveChannelData");
        h94.a aVar = this.f371295a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("baseInfo", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackApproveChannelData");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            jSONObject.put("snsid", aVar.c());
            jSONObject.put("uxinfo", aVar.e());
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReportExtraData", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportExtraData", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jSONObject.put("adExtInfo", aVar.f361274k));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("catching_tag", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("baseInfo", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackApproveChannelData");
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackApproveChannelData");
        return jSONObject2;
    }
}
