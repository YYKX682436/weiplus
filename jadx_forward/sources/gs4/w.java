package gs4;

/* loaded from: classes9.dex */
public class w extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f356671d;

    /* renamed from: e, reason: collision with root package name */
    public final int f356672e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f356673f;

    /* renamed from: g, reason: collision with root package name */
    public int f356674g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f356675h = -1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f356676i = "";

    /* renamed from: m, reason: collision with root package name */
    public int f356677m = -1;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f356678n = "";

    public w(java.lang.String str, int i17, java.lang.String str2, int i18) {
        this.f356671d = str;
        this.f356672e = i17;
        this.f356673f = str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cre_id", fp.s0.a(str));
        hashMap.put("cre_type", fp.s0.a(i17 + ""));
        hashMap.put("true_name", fp.s0.a(str2));
        hashMap.put("verifyScene", i18 + "");
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 2784;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 2784;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/verifyuserrealnameinfo";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVerifyUserRealNameInfo", "onGYNetEnd, errCode: %s, errMsg: %s, json: %s", java.lang.Integer.valueOf(i17), str, jSONObject);
        if (i17 == 0) {
            jSONObject.optString("retcode");
            jSONObject.optString("retmsg");
            this.f356674g = jSONObject.optInt("is_support_face", 0);
            this.f356675h = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            this.f356676i = jSONObject.optString("package");
            this.f356677m = jSONObject.optInt("is_need_cert");
            this.f356678n = jSONObject.optString("packagesign");
        }
    }
}
