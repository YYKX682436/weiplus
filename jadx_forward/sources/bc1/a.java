package bc1;

/* loaded from: classes7.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4191x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f4192x24728b = "getInvokeCost";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONObject jSONObject2;
        if (lVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.Cif mo50356x8f2ff6d2 = lVar.mo50356x8f2ff6d2();
        if (mo50356x8f2ff6d2 != null) {
            synchronized (mo50356x8f2ff6d2) {
                jSONObject2 = new org.json.JSONObject();
                for (java.util.Map.Entry entry : ((java.util.Map) ((jz5.n) mo50356x8f2ff6d2.f162849a).mo141623x754a37bb()).entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gf gfVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gf) entry.getValue();
                    long j17 = gfVar.f162796b / gfVar.f162795a;
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    jSONArray.put(gfVar.f162795a);
                    jSONArray.put(j17);
                    jSONObject2.put(str, jSONArray);
                }
            }
        } else {
            jSONObject2 = new org.json.JSONObject();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.Cif mo50356x8f2ff6d22 = lVar.mo50356x8f2ff6d2();
        if (mo50356x8f2ff6d22 != null) {
            synchronized (mo50356x8f2ff6d22) {
                ((java.util.Map) ((jz5.n) mo50356x8f2ff6d22.f162849a).mo141623x754a37bb()).clear();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetInvokeCost", "invoke env:" + lVar + " data:" + jSONObject + " result:" + jSONObject2);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject2);
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        lVar.a(i17, t("ok", hashMap));
    }
}
