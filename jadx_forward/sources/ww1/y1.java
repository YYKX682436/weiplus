package ww1;

/* loaded from: classes9.dex */
public class y1 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public int f531893d;

    /* renamed from: e, reason: collision with root package name */
    public int f531894e;

    /* renamed from: f, reason: collision with root package name */
    public long f531895f;

    /* renamed from: g, reason: collision with root package name */
    public int f531896g;

    /* renamed from: i, reason: collision with root package name */
    public final int f531898i;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f531897h = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f531899m = false;

    public y1(int i17, long j17, java.lang.String str, int i18) {
        this.f531898i = i18;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", java.lang.String.valueOf(i17));
        hashMap.put("from_timestamp", java.lang.String.valueOf(j17));
        hashMap.put("last_bill_id", str);
        hashMap.put("num", java.lang.String.valueOf(i18));
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1963;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/f2frcvdlist";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f531893d = jSONObject.optInt("total_num");
        this.f531894e = jSONObject.optInt("total_amt");
        this.f531895f = jSONObject.optLong("from_timestamp", 0L);
        this.f531896g = jSONObject.optInt("type", 0);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("records");
        java.util.List list = this.f531897h;
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayF2fRecordList", "empty records");
        } else {
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                try {
                    ((java.util.ArrayList) list).add(ww1.g.a(optJSONArray.getJSONObject(i18)));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneTenpayF2fRecordList", e17, "", new java.lang.Object[0]);
                }
            }
        }
        if (((java.util.ArrayList) list).size() < this.f531898i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayF2fRecordList", "finish query");
            this.f531899m = true;
        }
    }
}
