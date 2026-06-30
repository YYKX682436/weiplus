package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j f256571e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar, java.lang.String str) {
        this.f256571e = jVar;
        this.f256570d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256571e;
        java.lang.String str = this.f256570d;
        jVar.Q = com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j.a(jVar, str);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = jVar.f256519d.mo55332x76847179();
        jVar.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "enterFinderUI() called with: context = [" + mo55332x76847179 + "], json = [" + str + "]");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str).getJSONObject("open_finder_feed_ext_info");
            jSONObject2.put("requestCode", 16);
            java.lang.String optString = jSONObject2.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            java.lang.String str2 = jVar.f256521f.f458716e;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, optString);
            jSONObject3.put("topStorySessionId", str2);
            jSONObject2.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, jSONObject3);
            jSONObject.put("extInfo", jSONObject2);
            if (((zy2.b6) i95.n0.c(zy2.b6.class)) != null) {
                ya2.e1.f542005a.F(mo55332x76847179, jSONObject.toString(), null, null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", e17, "enterFinderUI error", new java.lang.Object[0]);
        }
    }
}
