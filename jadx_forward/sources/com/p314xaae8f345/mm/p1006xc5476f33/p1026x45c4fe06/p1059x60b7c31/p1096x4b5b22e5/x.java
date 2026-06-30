package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public class x implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g f163811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f163812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f163813c;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, org.json.JSONObject jSONObject) {
        this.f163811a = gVar;
        this.f163812b = yVar;
        this.f163813c = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g gVar = this.f163811a;
        if (gVar != null) {
            gVar.a(z17, str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        java.lang.String str = c11808xe47dc718.f158811d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g gVar = this.f163811a;
        if (gVar != null) {
            gVar.b(c11808xe47dc718);
        }
        boolean z17 = ((ze.n) this.f163812b.mo32091x9a3f0ba2()).u0().f128817z == 7;
        boolean optBoolean = this.f163813c.optBoolean("useTransparentBackground", false);
        boolean Ni = true ^ ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Ni();
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) c11808xe47dc718;
        boolean z18 = c3897xbc286aa1.N.D;
        boolean f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.f();
        if (z17 && optBoolean && Ni && (z18 || f17)) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8 c3898xeaad22a8 = new com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3898xeaad22a8();
            c3898xeaad22a8.f128821f = k91.z3.TRANSPARENT;
            k91.y3 y3Var = k91.y3.DISABLED;
            c3898xeaad22a8.f128824i = y3Var;
            c3898xeaad22a8.f128825m = y3Var;
            c3897xbc286aa1.B1 = c3898xeaad22a8;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = this.f163812b.mo32091x9a3f0ba2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) mo32091x9a3f0ba2;
        wa1.a aVar = wa1.b.f525633a;
        if (aVar.b(o6Var)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 a17 = ((mo32091x9a3f0ba2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) && aVar.b(o6Var)) ? aVar.a(o6Var) : null;
            if (a17 == null || !android.text.TextUtils.equals(str, a17.f156336n)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateToMiniProgramWC", "close embedded wxa runtime. REASON[embedded wxa's host will be brought to front].");
            mo32091x9a3f0ba2.S();
        }
    }
}
