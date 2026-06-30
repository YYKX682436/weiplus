package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
class f2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f160722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f160724f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e2 f160725g;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e2 e2Var, c01.l2 l2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f160725g = e2Var;
        this.f160722d = l2Var;
        this.f160723e = lVar;
        this.f160724f = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        java.lang.String f17 = this.f160722d.f("appId", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "onDestroy, appId:%s", f17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("operationType", "stop");
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11987x6396ea86 c11987x6396ea86 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11987x6396ea86(this.f160725g, this.f160723e, this.f160724f);
        c11987x6396ea86.f160613n = jSONObject.toString();
        c11987x6396ea86.f160611i = f17;
        c11987x6396ea86.s();
    }
}
