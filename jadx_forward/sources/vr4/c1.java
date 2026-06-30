package vr4;

/* loaded from: classes8.dex */
public class c1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.util.LinkedList linkedList = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5957xbd0cae36) abstractC20979x809547d1).f136256g.f88894a;
        java.lang.String str = dt4.b.f324761a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        try {
            if (dt4.b.f324762b == null) {
                dt4.b.f324762b = new java.util.HashMap();
            }
            android.content.SharedPreferences.Editor edit = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("bank_logo", 0).edit();
            int size = linkedList.size();
            for (int i17 = 0; i17 < size; i17++) {
                org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) linkedList.get(i17));
                java.lang.String optString = c01.z1.I() ? jSONObject.optString("bank_desc") : jSONObject.optString("bank_type");
                jSONObject.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, currentTimeMillis);
                java.lang.String jSONObject2 = jSONObject.toString();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject2)) {
                    break;
                }
                edit.putString(optString, jSONObject2);
                ((java.util.HashMap) dt4.b.f324762b).put(optString, jSONObject2);
            }
            edit.commit();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBankLogoStorage", "parse band logo error. %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletBankLogoStorage", e17, "", new java.lang.Object[0]);
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5186xcb31c54e().e();
        return false;
    }
}
