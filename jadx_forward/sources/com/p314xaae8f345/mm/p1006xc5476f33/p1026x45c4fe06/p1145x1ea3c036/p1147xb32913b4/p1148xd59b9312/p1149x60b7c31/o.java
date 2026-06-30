package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31;

/* loaded from: classes7.dex */
public final class o implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f167155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f167156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f167157c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.p f167158d;

    public o(org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.p pVar) {
        this.f167155a = jSONObject;
        this.f167156b = yVar;
        this.f167157c = i17;
        this.f167158d = pVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g
    public final void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.FunctionalJsApiNavigateToMiniProgram", "onNavigateResult, navigateToAppId:" + this.f167155a.optString("appId") + " ok:" + z17 + ", reason:" + str);
        if (z17) {
            return;
        }
        if (str == null) {
            str = "";
        }
        this.f167156b.a(this.f167157c, this.f167158d.o("fail: navigate error ".concat(str)));
    }
}
