package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class r0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 {

    /* renamed from: CTRL_INDEX */
    private static final int f33865x366c91de = 54;

    /* renamed from: NAME */
    private static final java.lang.String f33866x24728b = "authorize";

    /* renamed from: g, reason: collision with root package name */
    public final bm5.x0 f161234g = new bm5.x0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12009x65cd523());

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) ffVar.f162546b;
        org.json.JSONObject jSONObject = ffVar.f162547c;
        int i17 = ffVar.f162549e;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = yVar.mo32091x9a3f0ba2();
        if (mo32091x9a3f0ba2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) mo32091x9a3f0ba2).Y1.f167634d : false) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o1) this.f161234g.b()).C(ffVar, oVar);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042 c11999x85898042 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042();
        c11999x85898042.f160870p = yVar.mo48798x74292566();
        if (ffVar.f162548d != null) {
            r45.me7 me7Var = new r45.me7();
            c11999x85898042.f160871q = me7Var;
            me7Var.f461965d = ffVar.f162548d.optString("appId");
            ne.e eVar = (ne.e) yVar.mo32091x9a3f0ba2().p0(ne.e.class, false);
            if (eVar != null) {
                r45.me7 me7Var2 = c11999x85898042.f160871q;
                me7Var2.f461967f = eVar.a(me7Var2.f461965d);
            }
        }
        c11999x85898042.f160869o = "authorize";
        k91.z0 E0 = yVar.mo32091x9a3f0ba2().E0();
        if (E0 != null) {
            c11999x85898042.f160873s = E0.f387385r.f156932d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.d(yVar.mo48798x74292566());
        if (d17 != null) {
            c11999x85898042.I = d17.f169323f;
        }
        c11999x85898042.Q = G(jSONObject.optJSONArray("scope"), yVar.mo32091x9a3f0ba2());
        java.lang.String jSONObject2 = jSONObject.toString();
        c11999x85898042.f160863f = this;
        c11999x85898042.f160864g = yVar;
        c11999x85898042.f160867m = jSONObject2;
        c11999x85898042.f160866i = i17;
        c11999x85898042.f160865h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s0(c11999x85898042, oVar);
        c11999x85898042.F = new android.os.Bundle();
        if (yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) {
            c11999x85898042.f160862J = 1;
        } else if (yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
            c11999x85898042.f160862J = 2;
        }
        yVar.mo32091x9a3f0ba2().mo46316x322b85(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.t0(c11999x85898042));
        c11999x85898042.d();
    }
}
