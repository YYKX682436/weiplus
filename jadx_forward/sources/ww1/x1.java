package ww1;

/* loaded from: classes9.dex */
public class x1 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public boolean f531866d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f531867e;

    /* renamed from: f, reason: collision with root package name */
    public int f531868f;

    /* renamed from: g, reason: collision with root package name */
    public final int f531869g;

    /* renamed from: h, reason: collision with root package name */
    public int f531870h;

    /* renamed from: i, reason: collision with root package name */
    public int f531871i;

    /* renamed from: m, reason: collision with root package name */
    public long f531872m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f531873n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f531874o;

    public x1(int i17, long j17, int i18, int i19, int i27) {
        this.f531866d = false;
        this.f531867e = false;
        this.f531874o = new java.util.ArrayList();
        this.f531869g = i18;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", "" + i17);
        hashMap.put("from_timestamp", "" + j17);
        hashMap.put("direction_flag", "" + i18);
        hashMap.put("num", "" + i19);
        hashMap.put("choose_flag", "" + i27);
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1993;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/f2frcvrcdhissta";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        jSONObject.toString();
        this.f531868f = jSONObject.optInt("choose_flag", 0);
        this.f531872m = jSONObject.optLong("from_timestamp", -1L);
        this.f531870h = jSONObject.optInt("finish_flag", 0);
        this.f531871i = jSONObject.optInt("try_num", 0);
        this.f531873n = jSONObject.optString("retmsg", "");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("records");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "empty records");
        } else {
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                try {
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i18);
                    ww1.n1 n1Var = new ww1.n1();
                    n1Var.f531781a = jSONObject2.optInt("type", 0);
                    n1Var.f531782b = jSONObject2.optLong("from_timestamp", 0L);
                    n1Var.f531783c = jSONObject2.optInt("total_num", 0);
                    n1Var.f531784d = jSONObject2.optInt("total_amt", 0);
                    this.f531874o.add(n1Var);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneTenpayF2fHistoryRecordList", e17, "", new java.lang.Object[0]);
                }
            }
        }
        if (this.f531870h == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayF2fHistoryRecordList", "finish query");
            this.f531866d = true;
        }
    }

    public x1(int i17, long j17, int i18, int i19, int i27, int i28) {
        this.f531866d = false;
        this.f531867e = false;
        this.f531874o = new java.util.ArrayList();
        this.f531867e = true;
        this.f531869g = i18;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", "" + i17);
        hashMap.put("from_timestamp", "" + j17);
        hashMap.put("direction_flag", "" + i18);
        hashMap.put("num", "" + i19);
        hashMap.put("choose_flag", "" + i27);
        hashMap.put("try_num", "" + i28);
        m83032xb4c13117(hashMap);
    }
}
