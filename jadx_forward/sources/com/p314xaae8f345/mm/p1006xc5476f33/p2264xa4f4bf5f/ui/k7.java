package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class k7 implements ft.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 f255564a;

    public k7(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9) {
        this.f255564a = activityC18635xb8188ef9;
    }

    @Override // ft.p4
    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h6 h6Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9.C1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = this.f255564a;
        activityC18635xb8188ef9.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "handleAppBrandEmojiPanelDataCallBack: data:%s", str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(str2).optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            java.lang.String optString = optJSONObject != null ? optJSONObject.optString("iconId") : null;
            if (optString == null) {
                optString = "";
            }
            int optInt = optJSONObject != null ? optJSONObject.optInt("isfred") : 0;
            activityC18635xb8188ef9.S = 1 == (optJSONObject != null ? optJSONObject.optInt("is_rcmd") : 0);
            activityC18635xb8188ef9.N = optString;
            activityC18635xb8188ef9.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.r6(activityC18635xb8188ef9, optString));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "handleAppBrandEmojiPanelDataCallBack() called :" + activityC18635xb8188ef9.N + ", recentUse=" + optInt + ", isRecommend=" + activityC18635xb8188ef9.S);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "handleAppBrandEmojiPanelDataCallBack: e:%s data:%s", e17, str2);
        }
    }
}
