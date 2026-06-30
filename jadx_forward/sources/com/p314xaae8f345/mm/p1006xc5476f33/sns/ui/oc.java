package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class oc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f251626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pc f251627e;

    public oc(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pc pcVar, java.lang.Object obj) {
        this.f251627e = pcVar;
        this.f251626d = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator<java.lang.String> it;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pc pcVar = this.f251627e;
        java.lang.String X6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.X6(pcVar.f251744a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = pcVar.f251744a;
        java.lang.String str = activityC18007x6d5e9773.D;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str2 = (java.lang.String) this.f251626d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str3 = activityC18007x6d5e9773.f248288x1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str4 = activityC18007x6d5e9773.f248292y1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getADLandingPageInfosStrByDynamicDataUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        java.lang.String str5 = new java.lang.String(X6);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesParseHelper", "the jsonObject is " + jSONObject.toString());
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                if (next != null && (next instanceof java.lang.String)) {
                    java.lang.String str6 = next;
                    java.lang.String string = jSONObject.getString(str6);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        it = keys;
                        sb6.append("{{");
                        sb6.append(str6);
                        sb6.append("}}");
                        str5 = str5.replace(sb6.toString(), "<![CDATA[" + string + "]]>");
                        keys = it;
                    }
                }
                it = keys;
                keys = it;
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "the json is parsed error : " + X6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getADLandingPageInfosStrByDynamicDataUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str7 = activityC18007x6d5e9773.D;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        za4.x0 x0Var = new za4.x0(str5, str7, activityC18007x6d5e9773);
        activityC18007x6d5e9773.f248242g = x0Var.f552747a;
        activityC18007x6d5e9773.f248245h = x0Var.f552748b;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nc(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5$1");
    }
}
