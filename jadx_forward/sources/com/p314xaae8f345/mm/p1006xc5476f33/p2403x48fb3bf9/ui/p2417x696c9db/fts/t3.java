package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e f266158e;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e activityC19391xc941d0e, int i17) {
        this.f266158e = activityC19391xc941d0e;
        this.f266157d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        if (this.f266158e.f265377p0 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String P9 = this.f266158e.P9();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P9)) {
                P9 = this.f266158e.F4.mo81005xdc5215a6().m80972xc738b2f5();
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.s3(this));
                i17 = 1;
            } else {
                i17 = 0;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P9)) {
                return;
            }
            try {
                jSONObject.put("query", P9);
                jSONObject.put("custom", this.f266158e.N9());
                jSONObject.put("tagList", this.f266158e.O9());
                jSONObject.put("isBackButtonClick", this.f266157d);
                jSONObject.put("type", this.f266158e.I4);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f266158e.K4);
                jSONObject.put("isHomePage", 0);
                jSONObject.put("fromRecommendSearchQuery", i17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", e17, "", new java.lang.Object[0]);
            }
            this.f266158e.f265377p0.e0(jSONObject);
            if (android.text.TextUtils.isEmpty(this.f266158e.N9())) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e activityC19391xc941d0e = this.f266158e;
            su4.k2.k(activityC19391xc941d0e.K4, activityC19391xc941d0e.B3, activityC19391xc941d0e.C3, activityC19391xc941d0e.f265778b4 == 0, activityC19391xc941d0e.N9(), this.f266158e.I4);
        }
    }
}
