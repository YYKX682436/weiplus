package jt4;

/* loaded from: classes9.dex */
public class h extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f383182d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f383183e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qz4 f383184f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f383185g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f383186h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f383187i;

    /* renamed from: m, reason: collision with root package name */
    public int f383188m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383189n;

    public h(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, boolean z17, boolean z18, int i18, java.lang.String str6) {
        this(str, str2, str3, str4, str5, i17, z17, false, z18, i18, str6);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f383182d = u0Var;
        return mo9409x10f9447a(sVar, this.f383183e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27791x324eeed3;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpenECard", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.qz4 qz4Var = (r45.qz4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f383184f = qz4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpenECard", "ret_code: %d, ret_msg: %s", java.lang.Integer.valueOf(qz4Var.f465899d), this.f383184f.f465900e);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f383184f.f465901f)) {
            java.lang.String str2 = this.f383184f.f465901f;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.f383184f.f465901f);
                this.f383188m = jSONObject.optInt("retcode", 0);
                this.f383189n = jSONObject.optString("retmsg", "");
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneOpenECard", e17, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f383182d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    public h(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, boolean z17, boolean z18, boolean z19, int i18, java.lang.String str6) {
        this.f383188m = 0;
        this.f383189n = "";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pz4();
        lVar.f152198b = new r45.qz4();
        lVar.f152200d = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27791x324eeed3;
        lVar.f152199c = "/cgi-bin/mmpay-bin/openecard";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f383183e = a17;
        r45.pz4 pz4Var = (r45.pz4) a17.f152243a.f152217a;
        pz4Var.f465024d = str;
        pz4Var.f465025e = str2;
        a17.m47986x306cfea3(true);
        if (z17) {
            pz4Var.f465026f = str3;
        } else {
            pz4Var.f465027g = str3;
        }
        if (z18) {
            pz4Var.f465031n = 1;
        } else {
            pz4Var.f465031n = 0;
        }
        pz4Var.f465028h = str4;
        pz4Var.f465029i = str5;
        pz4Var.f465030m = i17;
        pz4Var.f465032o = z19;
        pz4Var.f465033p = i18;
        pz4Var.f465034q = str6;
        this.f383185g = str3;
        this.f383186h = str4;
        this.f383187i = str5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpenECard", "cardType: %s, reqSerial: %s, openScene: %s, mobileNo: %s, bankType: %s, bankCardInfo: %s, fromScene: %s", str, str2, java.lang.Integer.valueOf(i17), str4, str5, str6, java.lang.Integer.valueOf(i18));
    }

    public h(java.lang.String str, java.lang.String str2, int i17) {
        this.f383188m = 0;
        this.f383189n = "";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pz4();
        lVar.f152198b = new r45.qz4();
        lVar.f152200d = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27791x324eeed3;
        lVar.f152199c = "/cgi-bin/mmpay-bin/openecard";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f383183e = a17;
        r45.pz4 pz4Var = (r45.pz4) a17.f152243a.f152217a;
        pz4Var.f465024d = str;
        pz4Var.f465025e = str2;
        a17.m47986x306cfea3(true);
        pz4Var.f465031n = 0;
        pz4Var.f465030m = i17;
        pz4Var.f465033p = 1;
        pz4Var.f465032o = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneOpenECard", "create NetSceneOpenECard with reuse exist card, cardType: %s, reqSerial: %s, openScene: %s", str, str2, java.lang.Integer.valueOf(i17));
    }
}
