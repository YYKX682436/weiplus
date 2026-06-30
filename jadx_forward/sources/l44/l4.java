package l44;

/* loaded from: classes4.dex */
public class l4 extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f397773a;

    public l4(java.util.List list) {
        this.f397773a = list;
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
        try {
            jSONObject.putOpt("snsId", "");
            jSONObject.putOpt("uxinfo", "");
            jSONObject.putOpt("adExtInfo", "");
            jSONObject.putOpt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        java.util.List list = this.f397773a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
        if (a84.b0.b(list)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONObject.putOpt("totalCount", java.lang.Integer.valueOf(list.size()));
        jSONObject.putOpt("reportItemList", jSONArray);
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            c(jSONArray, (l44.n4) it.next());
            i17++;
            if (i17 >= 10) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
    }

    public final void c(org.json.JSONArray jSONArray, l44.n4 n4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillReportItem", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
        if (n4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillReportItem", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("snsId", ca4.z0.t0(n4Var.f397810b));
            jSONObject.putOpt("reserveSnsId", ca4.z0.t0(n4Var.f397809a));
            jSONArray.put(jSONObject);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillReportItem", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
    }

    @Override // a84.r0
    /* renamed from: getChannel */
    public java.lang.String mo650x69d8b8cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChannel", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChannel", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
        return "sns_ad_remove_consecutive_ad_report";
    }
}
