package j74;

/* loaded from: classes4.dex */
public class a implements a84.r0 {

    /* renamed from: a, reason: collision with root package name */
    public long f379584a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f379585b;

    /* renamed from: c, reason: collision with root package name */
    public int f379586c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379587d;

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        return "timeline_ad_feedback_click_positive_btn";
    }

    @Override // a84.r0
    public java.lang.String j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("baseInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("snsid", java.lang.String.valueOf(this.f379584a));
            java.lang.String str = this.f379585b;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("uxinfo", str);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f379586c);
            java.lang.String str3 = this.f379587d;
            if (str3 != null) {
                str2 = str3;
            }
            jSONObject.put("adExtInfo", str2);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("baseInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        java.lang.String jSONObject2 = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        return jSONObject2;
    }
}
