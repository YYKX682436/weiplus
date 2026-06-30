package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f247572a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public s34.p0 f247573b = null;

    /* renamed from: c, reason: collision with root package name */
    public s34.p0 f247574c = null;

    /* renamed from: d, reason: collision with root package name */
    public s34.p0 f247575d = null;

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l a(java.lang.String str, java.util.Map map, java.lang.String str2) {
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdFeedbackInfo");
        java.lang.String str4 = str2 + ".adxml.feedbackInfo.feedbackList.item";
        int i17 = 0;
        while (true) {
            if (i17 > 0) {
                str3 = str4 + i17;
            } else {
                str3 = str4;
            }
            java.lang.String str5 = str3 + ".url";
            if (map.get(str5) == null || ((java.lang.String) map.get(str5)).length() <= 0) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m();
            java.lang.String str6 = (java.lang.String) map.get(str5);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str6 == null) {
                str6 = "";
            }
            mVar.f247593d = str6;
            java.lang.String str7 = (java.lang.String) map.get(str3 + ".Wording.zh");
            if (str7 == null) {
                str7 = "";
            }
            mVar.f247590a = str7;
            java.lang.String str8 = (java.lang.String) map.get(str3 + ".Wording.en");
            if (str8 == null) {
                str8 = "";
            }
            mVar.f247591b = str8;
            java.lang.String str9 = (java.lang.String) map.get(str3 + ".Wording.tw");
            mVar.f247592c = str9 != null ? str9 : "";
            if (mVar.f247590a.length() + mVar.f247591b.length() + mVar.f247592c.length() > 0) {
                ((java.util.LinkedList) this.f247572a).add(mVar);
            }
            i17++;
        }
        this.f247573b = s34.p0.a(map, str2 + ".adxml.feedbackInfo.receivedReasonClickAction");
        this.f247574c = s34.p0.a(map, str2 + ".adxml.feedbackInfo.likedAdsClickAction");
        this.f247575d = s34.p0.a(map, str2 + ".adxml.feedbackInfo.reasonToastClickAction");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdFeedbackInfo");
        return this;
    }
}
