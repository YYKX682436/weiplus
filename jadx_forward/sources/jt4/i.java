package jt4;

/* loaded from: classes4.dex */
public class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f383190d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f383191e;

    /* renamed from: f, reason: collision with root package name */
    public r45.oz4 f383192f;

    /* renamed from: g, reason: collision with root package name */
    public int f383193g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383194h = "";

    public i(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.nz4();
        lVar.f152198b = new r45.oz4();
        lVar.f152200d = 1958;
        lVar.f152199c = "/cgi-bin/mmpay-bin/openecardauth";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f383191e = a17;
        r45.nz4 nz4Var = (r45.nz4) a17.f152243a.f152217a;
        nz4Var.f463307d = str;
        nz4Var.f463308e = str2;
        nz4Var.f463309f = i17;
        nz4Var.f463310g = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpenECardAuth", "cardType: %s, scene: %d, token: %s, wxp_passwd_enc==null: %s", str, java.lang.Integer.valueOf(i17), str3, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpenECardAuth", "cardType: %s, scene: %d", str, java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f383190d = u0Var;
        return mo9409x10f9447a(sVar, this.f383191e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1958;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpenECardAuth", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.oz4 oz4Var = (r45.oz4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f383192f = oz4Var;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(oz4Var.f464156d);
        r45.oz4 oz4Var2 = this.f383192f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpenECardAuth", "ret_code: %d, ret_msg: %s, is_token_invalid: %s", valueOf, oz4Var2.f464157e, java.lang.Boolean.valueOf(oz4Var2.f464161i));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f383192f.f464158f)) {
            java.lang.String str2 = this.f383192f.f464158f;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f383192f.f464158f);
                this.f383193g = jSONObject.optInt("retcode", 0);
                this.f383194h = jSONObject.optString("retmsg", "");
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneOpenECardAuth", e17, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f383190d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
