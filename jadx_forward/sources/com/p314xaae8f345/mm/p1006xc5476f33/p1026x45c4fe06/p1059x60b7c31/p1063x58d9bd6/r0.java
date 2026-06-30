package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class r0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f160802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.s0 f160804f;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.s0 s0Var, c01.l2 l2Var, java.lang.String str) {
        this.f160804f = s0Var;
        this.f160802d = l2Var;
        this.f160803e = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        java.lang.String f17 = this.f160802d.f("appId", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onDestroy, appId:%s", f17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("operationType", "stop");
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.s0 s0Var = this.f160804f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589 c11986x4eded589 = s0Var.f160797g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11979xb06e4878 c11979xb06e4878 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11979xb06e4878(s0Var, c11986x4eded589.f160596g, c11986x4eded589.f160597h);
        c11979xb06e4878.f160568m = jSONObject.toString();
        c11979xb06e4878.f160567i = f17;
        c11979xb06e4878.s();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589 c11986x4eded5892 = s0Var.f160797g;
        if (c11986x4eded5892 != null) {
            c11986x4eded5892.x();
        }
        c01.l2 e17 = c01.n2.d().e(this.f160803e);
        if (e17 != null) {
            e17.h();
        }
    }
}
