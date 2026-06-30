package xt1;

/* loaded from: classes8.dex */
public class i0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f538026d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f538027e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f538028f;

    /* renamed from: g, reason: collision with root package name */
    public int f538029g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f538030h;

    /* renamed from: i, reason: collision with root package name */
    public int f538031i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f538032m;

    public i0(java.util.LinkedList linkedList, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.fc3();
        lVar.f152198b = new r45.gc3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getcardlistfromapp";
        lVar.f152200d = 1079;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f538026d = a17;
        r45.fc3 fc3Var = (r45.fc3) a17.f152243a.f152217a;
        fc3Var.f455729d = linkedList;
        fc3Var.f455730e = i17;
        fc3Var.f455732g = str;
        fc3Var.f455733h = str2;
        fc3Var.f455735m = str3;
        fc3Var.f455734i = str4;
        fc3Var.f455736n = str5;
        fc3Var.f455737o = i18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f538027e = u0Var;
        return mo9409x10f9447a(sVar, this.f538026d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1079;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, errType = " + i18 + " errCode = " + i19 + " netType = 1079");
        if (i18 == 0 && i19 == 0) {
            java.lang.String str2 = ((r45.gc3) this.f538026d.f152244b.f152233a).f456616d;
            this.f538028f = str2;
            if (android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData json_ret is empty!");
            } else {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(this.f538028f);
                    this.f538029g = jSONObject.optInt("accept_button_status", 0);
                    this.f538030h = jSONObject.optString("accept_button_wording");
                    this.f538031i = jSONObject.optInt("private_status", 0);
                    this.f538032m = jSONObject.optString("private_wording");
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetCardListFromApp", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetCardListFromApp", "parseRespData:" + e17.getMessage());
                }
            }
        }
        this.f538027e.mo815x76e0bfae(i18, i19, str, this);
    }
}
