package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes15.dex */
public class c5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        int c17;
        java.lang.String optString = jSONObject.optString("url");
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString)) {
            optString = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f224975e.f380557a, optString);
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(optString);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiPreloadVideo", "no need preload, file exist:%s", optString);
                this.f224975e.d();
                return;
            }
        }
        java.lang.String str3 = optString;
        jd.c cVar = this.f224975e;
        java.lang.String m65312x55c41065 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65312x55c41065(str, cVar.f380557a, cVar.f380559c, str3);
        int optInt = jSONObject.optInt("ratio");
        if (j62.e.g().l("clicfg_liteapp_video_use_finder", false, true, true)) {
            ha3.i0 i0Var = ha3.j0.f361419a;
            c17 = ha3.j0.f361420b.d(m65312x55c41065, optInt);
        } else {
            c17 = x03.x0.f532694d.a().f532697b.c(m65312x55c41065, optInt);
        }
        if (c17 == 0) {
            this.f224975e.d();
        } else {
            this.f224975e.b("preload video fail.");
        }
    }
}
