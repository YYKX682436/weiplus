package ww1;

/* loaded from: classes9.dex */
public class w1 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public int f531854d;

    /* renamed from: e, reason: collision with root package name */
    public int f531855e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f531856f;

    public w1(java.lang.String str, int i17, long j17) {
        this.f531856f = str;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bill_id", str);
        hashMap.put("type", java.lang.String.valueOf(i17));
        hashMap.put("from_timestamp", java.lang.String.valueOf(j17));
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1964;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/f2frmrcvdrcd";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f531854d = jSONObject.optInt("total_num", 0);
        this.f531855e = jSONObject.optInt("total_amt", 0);
        jSONObject.optInt("type", 0);
        jSONObject.optLong("from_timestamp", 0L);
    }
}
