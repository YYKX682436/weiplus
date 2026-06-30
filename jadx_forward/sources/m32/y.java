package m32;

/* loaded from: classes.dex */
public class y extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5951x51c5bdf0 c5951x51c5bdf0 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5951x51c5bdf0) abstractC20979x809547d1;
        java.util.ArrayList z07 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.ij().z0();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < z07.size(); i17++) {
            try {
                ny3.a aVar = (ny3.a) z07.get(i17);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.putOpt(ya.b.f77479x42930b2, java.lang.Integer.valueOf(aVar.f69149xe5044689));
                jSONObject.putOpt("msg", aVar.f69150xde32aff9);
                jSONArray.put(jSONObject);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("RtosOnGetQuickReplyListener", e17, e17.toString(), new java.lang.Object[0]);
            }
        }
        if (jSONArray.length() > 0) {
            c5951x51c5bdf0.f136249g.f88237a = ya.b.f77504xbb80cbe3;
        } else {
            c5951x51c5bdf0.f136249g.f88237a = "fail";
        }
        c5951x51c5bdf0.f136249g.f88238b = jSONArray.toString();
        return true;
    }
}
