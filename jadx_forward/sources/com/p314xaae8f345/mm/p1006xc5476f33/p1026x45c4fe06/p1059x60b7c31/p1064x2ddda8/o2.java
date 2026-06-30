package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class o2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 {

    /* renamed from: CTRL_INDEX */
    public static final int f33861x366c91de = 52;

    /* renamed from: NAME */
    public static final java.lang.String f33862x24728b = "login";

    public o2() {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = ffVar.f162546b;
        org.json.JSONObject jSONObject = ffVar.f162547c;
        int i17 = ffVar.f162549e;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12003x30f468c2 c12003x30f468c2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12003x30f468c2();
        c12003x30f468c2.f160896p = lVar.mo48798x74292566();
        c12003x30f468c2.f160895o = "login";
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (z0Var != null) {
            c12003x30f468c2.f160900t = z0Var.f387385r.f156932d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.d(lVar.mo48798x74292566());
        if (d17 != null) {
            c12003x30f468c2.A = d17.f169323f;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        c12003x30f468c2.f160889f = this;
        c12003x30f468c2.f160890g = lVar;
        c12003x30f468c2.f160893m = jSONObject2;
        c12003x30f468c2.f160892i = i17;
        c12003x30f468c2.f160891h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g2(c12003x30f468c2, oVar);
        c12003x30f468c2.f160906z = new android.os.Bundle();
        if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) {
            c12003x30f468c2.B = 1;
        } else if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
            c12003x30f468c2.B = 2;
        }
        if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar).mo32091x9a3f0ba2().mo46316x322b85(new im5.a() { // from class: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask$$a
                @Override // im5.a
                /* renamed from: dead */
                public final void mo10668x2efc64() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12003x30f468c2.this.x();
                }
            });
        }
        c12003x30f468c2.d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar) {
        org.json.JSONObject jSONObject = ffVar.f162547c;
        try {
            if (!jSONObject.has("requestInQueue")) {
                jSONObject.put("requestInQueue", false);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLogin", "invoke put KEY_IN_QUEUE e=%s", e17.getMessage());
        }
        super.h(ffVar);
    }
}
