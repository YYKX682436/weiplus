package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 f266269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357 f266270f;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357 activityC19379x488a6357, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 b0Var) {
        this.f266270f = activityC19379x488a6357;
        this.f266268d = i17;
        this.f266269e = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        if (this.f266270f.f265377p0 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String P9 = this.f266270f.P9();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P9)) {
                P9 = this.f266270f.F4.mo81005xdc5215a6().m80972xc738b2f5();
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.y0(this));
                i17 = 1;
            } else {
                i17 = 0;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P9)) {
                return;
            }
            try {
                jSONObject.put("query", P9);
                jSONObject.put("custom", this.f266270f.N9());
                jSONObject.put("tagList", this.f266270f.O9());
                jSONObject.put("isBackButtonClick", this.f266268d);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 b0Var = this.f266269e;
                jSONObject.put("type", b0Var != null ? b0Var.f265879d : this.f266270f.I4);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f266270f.K4);
                jSONObject.put("isHomePage", 0);
                jSONObject.put("fromRecommendSearchQuery", i17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.FTSBaseWebViewUI", e17, "", new java.lang.Object[0]);
            }
            this.f266270f.f265377p0.e0(jSONObject);
            if (android.text.TextUtils.isEmpty(this.f266270f.N9())) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357 activityC19379x488a6357 = this.f266270f;
            su4.k2.k(activityC19379x488a6357.K4, activityC19379x488a6357.B3, activityC19379x488a6357.C3, activityC19379x488a6357.f265778b4 == 0, activityC19379x488a6357.N9(), this.f266270f.I4);
        }
    }
}
