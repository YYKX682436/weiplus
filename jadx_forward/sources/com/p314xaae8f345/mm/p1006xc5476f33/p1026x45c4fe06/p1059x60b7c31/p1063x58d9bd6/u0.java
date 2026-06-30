package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class u0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f160818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f160819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e1 f160820f;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e1 e1Var, c01.l2 l2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f160820f = e1Var;
        this.f160818d = l2Var;
        this.f160819e = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        c01.l2 l2Var = this.f160818d;
        java.lang.String f17 = l2Var.f("appId", "");
        l2Var.e("pkgType", 0);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("operationType", "stop");
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e1 e1Var = this.f160820f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11980xcda6ee93 c11980xcda6ee93 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11980xcda6ee93(e1Var, this.f160819e, e1Var.f160712g.f160575m);
        c11980xcda6ee93.f160576n = jSONObject.toString();
        c11980xcda6ee93.f160577o = f17;
        c11980xcda6ee93.f160580r = -1;
        c11980xcda6ee93.f160571f = l2Var;
        c11980xcda6ee93.s();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        c01.l2 l2Var = this.f160818d;
        java.lang.String f17 = l2Var.f("appId", "");
        l2Var.e("pkgType", 0);
        int ordinal = w0Var.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f160819e;
            if (c0Var.t3().l2().f169323f == 1023) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("operationType", "pause");
            } catch (org.json.JSONException unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e1 e1Var = this.f160820f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11980xcda6ee93 c11980xcda6ee93 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11980xcda6ee93(e1Var, c0Var, e1Var.f160712g.f160575m);
            c11980xcda6ee93.f160576n = jSONObject.toString();
            c11980xcda6ee93.f160577o = f17;
            c11980xcda6ee93.f160571f = l2Var;
            c11980xcda6ee93.d();
        }
    }
}
