package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes7.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f256567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.m2 f256569f;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.m2 m2Var, int i17, java.lang.String str) {
        this.f256569f = m2Var;
        this.f256567d = i17;
        this.f256568e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f256568e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.m2 m2Var = this.f256569f;
        int i17 = this.f256567d;
        try {
            java.lang.String str2 = (java.lang.String) m2Var.f256580g.get(java.lang.Integer.valueOf(i17));
            org.json.JSONArray jSONArray = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? new org.json.JSONArray() : new org.json.JSONArray(str2);
            jSONArray.put(str);
            m2Var.d(i17, jSONArray.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "addNegDocId finish: %s, %s", java.lang.Integer.valueOf(i17), str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryWebViewMgr", "addNegDocId, exception: " + e17.getMessage());
        }
    }
}
