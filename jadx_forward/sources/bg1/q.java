package bg1;

/* loaded from: classes7.dex */
public class q implements zf.d {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b f101435a;

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17;
        if (n5Var != null) {
            if (!n5Var.k().equalsIgnoreCase("onXWebLivePusherEvent") && !n5Var.k().equalsIgnoreCase("onXWebLivePusherNetStatus")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "dispatch event:%s, data:%s", n5Var.k(), jSONObject.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 r17 = n5Var.r(jSONObject.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = this.f101435a;
            if (bVar == null || (m17 = bVar.m()) == null) {
                return;
            }
            if (m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) m17).i(r17, null);
            } else if (m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) m17).i(r17, null);
            } else {
                m17.i(r17, null);
            }
        }
    }

    public void b(int i17, jc1.d dVar, int i18, java.lang.String str, java.util.HashMap hashMap) {
        bg1.n nVar = new bg1.n(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("viewId", i17);
            jSONObject.put("errno", dVar.f380436a);
            jSONObject.put("errCode", i18);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("errMsg", str);
            if (hashMap != null && !hashMap.isEmpty()) {
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject(hashMap));
            }
            a(nVar, jSONObject);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandLivePusherEventHandler", "onXWebLivePusherError fail", e17);
        }
    }
}
