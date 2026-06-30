package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public final class t1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f160814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u1 f160815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160816f;

    public t1(c01.l2 l2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u1 u1Var, java.lang.String str) {
        this.f160814d = l2Var;
        this.f160815e = u1Var;
        this.f160816f = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        java.lang.String f17 = this.f160814d.f("appId", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "onDestroy, appId:" + f17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("operationType", "stop");
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u1 u1Var = this.f160815e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11991xd822b749 c11991xd822b749 = u1Var.f160821g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11991xd822b749);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l service = c11991xd822b749.getService();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11991xd822b749 c11991xd822b7492 = u1Var.f160821g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11991xd822b7492);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11982xa07146f8 c11982xa07146f8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11982xa07146f8(u1Var, service, c11991xd822b7492.getCallbackId());
        c11982xa07146f8.K(jSONObject.toString());
        c11982xa07146f8.H(f17);
        c11982xa07146f8.s();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11991xd822b749 c11991xd822b7493 = u1Var.f160821g;
        if (c11991xd822b7493 != null) {
            c11991xd822b7493.x();
        }
        c01.l2 e17 = c01.n2.d().e(this.f160816f);
        if (e17 != null) {
            e17.h();
        }
    }
}
