package fu1;

/* loaded from: classes4.dex */
public class d extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f348358d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f348359e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348360f;

    /* renamed from: g, reason: collision with root package name */
    public int f348361g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f348362h;

    /* renamed from: i, reason: collision with root package name */
    public int f348363i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f348364m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f348365n;

    public d(java.lang.String str, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.oi4();
        lVar.f152198b = new r45.pi4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/marksharecard";
        lVar.f152200d = 1078;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f348358d = a17;
        r45.oi4 oi4Var = (r45.oi4) a17.f152243a.f152217a;
        oi4Var.f463812d = str;
        oi4Var.f463814f = i18;
        oi4Var.f463813e = i17;
        oi4Var.f463815g = i19;
        this.f348365n = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f348359e = u0Var;
        return mo9409x10f9447a(sVar, this.f348358d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1078;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMarkShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", 1078, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.pi4 pi4Var = (r45.pi4) this.f348358d.f152244b.f152233a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMarkShareCard", "json_ret:" + pi4Var.f464609g);
            java.lang.String str2 = pi4Var.f464609g;
            if (android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneMarkShareCard", "parseJson json_ret is empty!");
            } else {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    this.f348360f = jSONObject.optString("mark_user");
                    this.f348361g = jSONObject.optInt("mark_succ", 0);
                    this.f348362h = jSONObject.optString("mark_card_id");
                    this.f348363i = jSONObject.optInt("expire_time", 0);
                    this.f348364m = jSONObject.optString("pay_qrcode_wording");
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneMarkShareCard", e17, "", new java.lang.Object[0]);
                }
            }
        }
        this.f348359e.mo815x76e0bfae(i18, i19, str, this);
    }
}
