package ys4;

/* loaded from: classes9.dex */
public class f extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f546761d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f546762e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f546763f;

    /* renamed from: g, reason: collision with root package name */
    public int f546764g;

    public f(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19087x5acf574b c19087x5acf574b, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("flag", i17 + "");
        hashMap.put("passwd", str);
        hashMap.put("token", str2);
        hashMap.put("face_token", str3);
        hashMap.put("realname_scene", i18 + "");
        hashMap.put("session_id", str4);
        if (z17) {
            hashMap.put("is_close_marketing", z17 + "");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRealNameReg", "realname_scene=%d", java.lang.Integer.valueOf(i18));
        if (c19087x5acf574b != null) {
            c19087x5acf574b.a(hashMap);
        }
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1648;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 1648;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/realnamereg";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRealNameReg", "errCode=" + str + ";errMsg=" + str);
        this.f546761d = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        this.f546762e = jSONObject.optString("desc");
        this.f546763f = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
        this.f546764g = jSONObject.optInt("err_jump_page");
    }
}
