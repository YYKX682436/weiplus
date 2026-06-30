package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class b0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject) {
        uVar.D = false;
        java.lang.String optString = jSONObject.optString("webpageUrl");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            optString = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.b(c0Var.mo48798x74292566());
        }
        uVar.A = optString;
        uVar.I.put("is_weishi_video", java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = c0Var.t3().u0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11814xea430385 c11814xea430385 = u07.E;
        if (c11814xea430385 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11814xea430385.f158880g)) {
            return;
        }
        uVar.I.put("msg_img_path", u07.E.f158880g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713 c12236xd46e1713, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = c0Var.t3().u0();
        c12236xd46e1713.B = 3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11814xea430385 c11814xea430385 = u07.E;
        if (c11814xea430385 != null) {
            c12236xd46e1713.f164604p0 = c11814xea430385.f158881h;
            c12236xd46e1713.f164614x0 = c11814xea430385.f158882i;
            c12236xd46e1713.f164617y0 = c11814xea430385.f158883m;
            c12236xd46e1713.f164599l1 = c11814xea430385.f158878e;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c12236xd46e1713.f164603p)) {
                c12236xd46e1713.f164607r = u07.E.f158879f;
                c12236xd46e1713.f164608s = false;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16979, uVar.f164809v, uVar.f164795h, 0, 3);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.s
    public boolean e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar) {
        java.lang.String str = uVar.C;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        return str.startsWith("delayLoadFile://");
    }
}
