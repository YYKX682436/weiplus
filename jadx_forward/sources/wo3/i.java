package wo3;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f529699d = "0";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f529700e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        this.f529700e = "";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("oper", str2);
        if (str2.equals("changeto")) {
            if (android.text.TextUtils.isEmpty(str3)) {
                hashMap.put("verify_code", "");
            } else {
                hashMap.put("verify_code", str3);
            }
            hashMap.put("chg_fee", "" + i17);
            hashMap.put("bind_serialno", c19091x9511676c.f69225xed6d60f6);
            hashMap.put("bank_type", c19091x9511676c.f69223x58802fcb);
            hashMap.put("card_tail", c19091x9511676c.f69222x587fd4e1);
        }
        this.f529700e = c19091x9511676c.f69249x61dbf87;
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 50;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f529699d = jSONObject.optString("verify_flag");
            jSONObject.optString("limit_fee");
        }
    }
}
