package yf1;

/* loaded from: classes7.dex */
public class k implements xf.b {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b f543177a;

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17;
        if (n5Var != null) {
            if (!n5Var.k().equalsIgnoreCase("onXWebLivePlayerEvent") && !n5Var.k().equalsIgnoreCase("onXWebLivePlayerNetStatus") && !n5Var.k().equalsIgnoreCase("onXWebLivePlayerAudioVolume")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "dispatch event:%s, data:%s", n5Var.k(), jSONObject.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 r17 = n5Var.r(jSONObject.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = this.f543177a;
            if (bVar == null || (m17 = bVar.m()) == null) {
                return;
            }
            if (!(m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9)) {
                if (m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) m17).i(r17, null);
                    return;
                } else {
                    m17.i(r17, null);
                    return;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) m17;
            e9Var.i(r17, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
            if (V0 != null) {
                V0.i(r17, null);
            }
        }
    }

    public void b(int i17, boolean z17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("viewId", i17);
            jSONObject.put("playInBackground", z17);
            a(new yf1.h(null), jSONObject);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePlayerEventHandler", "onXWebLivePlayerBackgroundPlaybackChange fail", e17);
        }
    }
}
