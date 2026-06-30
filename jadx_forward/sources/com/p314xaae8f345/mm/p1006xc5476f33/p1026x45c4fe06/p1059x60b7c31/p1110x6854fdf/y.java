package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class y implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s {

    /* renamed from: a, reason: collision with root package name */
    public int f164845a;

    /* renamed from: b, reason: collision with root package name */
    public int f164846b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f164847c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f164848d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f164849e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f164850f;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject) {
        this.f164845a = jSONObject.optInt("appBrandPriority", -1);
        this.f164848d = jSONObject.optString("liteAppId");
        this.f164849e = jSONObject.optString("liteAppPath");
        this.f164850f = jSONObject.optString("liteAppQuery");
        this.f164847c = jSONObject.optString("liteAppBizData");
        this.f164846b = jSONObject.optInt("liteAppPriority", 0);
        uVar.I.put("is_native_game_card", java.lang.Boolean.TRUE);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713 c12236xd46e1713, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11806x808013c7 c11806x808013c7;
        c12236xd46e1713.B = 6;
        if (k01.j.f384572a.b(null, uVar.f164809v) && (c11806x808013c7 = (u07 = c0Var.t3().u0()).C1) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11806x808013c7.f158737e)) {
            c12236xd46e1713.E1 = u07.C1.f158737e;
        }
        c12236xd46e1713.F1 = this.f164845a;
        c12236xd46e1713.B1 = this.f164848d;
        c12236xd46e1713.C1 = this.f164849e;
        c12236xd46e1713.D1 = this.f164850f;
        c12236xd46e1713.H1 = this.f164846b;
        c12236xd46e1713.G1 = this.f164847c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public boolean e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar) {
        return false;
    }
}
