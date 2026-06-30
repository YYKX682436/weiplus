package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class w2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f33871x366c91de = 52;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f33872x24728b = "login";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff invokeContext, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o oVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) invokeContext.f162546b;
        int i17 = invokeContext.f162549e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.r.f161233a;
        r45.k24 k24Var = new r45.k24();
        k24Var.f459858d = yVar.mo48798x74292566();
        k24Var.f459863i = yVar.t3().f156338p.f158814g;
        r45.nd7 nd7Var = new r45.nd7();
        c(nd7Var, yVar);
        k24Var.f459864m = nd7Var;
        ((km5.q) rVar.b(yVar, "/cgi-bin/mmbiz-bin/js-login", k24Var, r45.l24.class).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s2(yVar, i17, this)).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.t2(yVar, i17, this)).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u2(oVar))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v2(oVar, yVar, i17, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff invokeContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        org.json.JSONObject jSONObject = invokeContext.f162547c;
        try {
            if (!jSONObject.has("requestInQueue")) {
                jSONObject.put("requestInQueue", false);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.JsApiLoginLU", "invoke put KEY_IN_QUEUE e=" + e17.getMessage());
        }
        super.h(invokeContext);
    }
}
