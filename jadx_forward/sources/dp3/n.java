package dp3;

/* loaded from: classes9.dex */
public class n extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a f323756d = null;

    public n(java.lang.String str, java.lang.String str2, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("trans_id", str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put("bill_id", str2);
        }
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 108;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a();
            this.f323756d = aVar;
            try {
                aVar.f234352a = com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9.a(jSONObject);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallOrderDetailObject", e17, "", new java.lang.Object[0]);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallOrderDetailObject", e18, "", new java.lang.Object[0]);
            }
            try {
                aVar.f234353b = aVar.e(jSONObject);
            } catch (org.json.JSONException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallOrderDetailObject", e19, "", new java.lang.Object[0]);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallOrderDetailObject", e27, "", new java.lang.Object[0]);
            }
            try {
                aVar.f234354c = aVar.c(jSONObject);
            } catch (org.json.JSONException e28) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallOrderDetailObject", e28, "", new java.lang.Object[0]);
            } catch (java.lang.Exception e29) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallOrderDetailObject", e29, "", new java.lang.Object[0]);
            }
            try {
                java.util.List b17 = aVar.b(jSONObject);
                aVar.f234355d = b17;
                aVar.a(b17, jSONObject);
            } catch (org.json.JSONException e37) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallOrderDetailObject", e37, "", new java.lang.Object[0]);
            } catch (java.lang.Exception e38) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallOrderDetailObject", e38, "", new java.lang.Object[0]);
            }
            aVar.f234356e = jSONObject.optString("safeguard_url");
            jSONObject.optString("share_url");
            int optInt = jSONObject.optInt("modifyTimeStamp");
            aVar.f234359h = optInt;
            dp3.c cVar = aVar.f234353b;
            if (cVar != null && optInt <= 0) {
                aVar.f234359h = cVar.f323736b;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9 = aVar.f234352a;
            if (c16774xbacd37e9 != null) {
                aVar.f234357f = c16774xbacd37e9.D;
                aVar.f234358g = c16774xbacd37e9.C;
            }
        }
    }
}
