package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827;

/* loaded from: classes7.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f160294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f160295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o f160296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f160297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f160298h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f160299i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yz5.l lVar, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o oVar, int i17, yz5.a aVar, yz5.l lVar2) {
        super(1);
        this.f160294d = lVar;
        this.f160295e = jSONObject;
        this.f160296f = oVar;
        this.f160297g = i17;
        this.f160298h = aVar;
        this.f160299i = lVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) obj;
        if (e9Var == null) {
            this.f160294d.mo146xb9724478("service_null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = e9Var.mo32091x9a3f0ba2();
            if (mo32091x9a3f0ba2 == null || mo32091x9a3f0ba2.S || mo32091x9a3f0ba2.L0()) {
                this.f160294d.mo146xb9724478("runtime_unavailable");
            } else {
                try {
                    java.lang.String optString = this.f160295e.optString("appId");
                    java.lang.String optString2 = this.f160295e.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, null);
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.a(this.f160295e.optString("envVersion"), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.RELEASE).f163727d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.d();
                    int i18 = this.f160297g;
                    org.json.JSONObject jSONObject = this.f160295e;
                    dVar.f163737a = i18;
                    dVar.f163738b = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
                    dVar.f163739c = jSONObject.optString("sceneNote");
                    dVar.f163740d = jSONObject.optInt("preScene", 0);
                    dVar.f163741e = jSONObject.optString("preSceneNote");
                    dVar.f163743g = jSONObject.optInt("sourcetype", 0);
                    dVar.f163742f = jSONObject.optString("agentId");
                    dVar.f163744h = jSONObject.optString("adInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.q0.f163794b.c(e9Var, optString, i17, optString2, dVar, this.f160295e, this.f160296f.C(this.f160295e), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.l(this.f160298h, this.f160299i));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] navigate exception: " + e17.getMessage() + ", fallback to launchCommon2");
                    this.f160294d.mo146xb9724478("exception:" + e17.getMessage());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
