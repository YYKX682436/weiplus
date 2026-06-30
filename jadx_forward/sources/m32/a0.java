package m32;

/* loaded from: classes.dex */
public class a0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5952x5645b0f7 c5952x5645b0f7 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5952x5645b0f7) abstractC20979x809547d1;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(c5952x5645b0f7.f136250g.f88320a).getJSONArray("replyList");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                ny3.a aVar = new ny3.a();
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                aVar.f69149xe5044689 = jSONObject.getInt(ya.b.f77479x42930b2);
                aVar.f69150xde32aff9 = jSONObject.getString("msg");
                arrayList.add(aVar);
            }
            boolean isEmpty = arrayList.isEmpty();
            am.hs hsVar = c5952x5645b0f7.f136251h;
            if (isEmpty) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.ij().y0();
                hsVar.f88398a = "ok";
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.ij().y0();
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.ij().D0(arrayList);
                hsVar.f88398a = "ok";
            }
            ((my3.q) ((fy3.e) i95.n0.c(fy3.e.class))).mj();
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("RtosOnSaveQuickReplyListener", e17, e17.toString(), new java.lang.Object[0]);
            c5952x5645b0f7.f136251h.f88398a = "fail";
            return true;
        }
    }
}
