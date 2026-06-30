package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public final class r2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openFinderTopicView";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        boolean z17;
        try {
            java.lang.String string = new org.json.JSONObject(str).getString("extInfo");
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("extInfo", new org.json.JSONObject(string));
                android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                zy2.ta.e(ya2.e1.f542005a, ll6, jSONObject.toString(), null, 4, null);
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenFinderTopicView", e17, "openFinderTopic exception", new java.lang.Object[0]);
                z17 = false;
            }
            if (z17) {
                if (q5Var != null) {
                    q5Var.a(null, null);
                }
            } else if (q5Var != null) {
                q5Var.a("fail", null);
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenFinderTopicView", "paras data error: " + e18.getMessage());
            if (q5Var != null) {
                q5Var.a("fail", null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
