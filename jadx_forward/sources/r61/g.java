package r61;

/* loaded from: classes9.dex */
public class g extends c01.l implements com.p314xaae8f345.mm.p944x882e457a.i1 {
    @Override // c01.l
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 b(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        r45.j4 j4Var = p0Var.f152259a;
        java.lang.String g17 = x51.j1.g(j4Var.f459094h);
        if (g17 == null || g17.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardMsgExtension", "possible friend msg : content is null");
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.y8 i17 = com.p314xaae8f345.mm.p2621x8fb0427b.y8.i(g17);
        if (j4Var.f459093g == 66) {
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).cj(i17.A);
        }
        java.lang.String str4 = i17.f277891a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str4 == null) {
            str4 = "";
        }
        if (str4.length() > 0) {
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            r0Var.f152062a = i17.f277891a;
            r0Var.f152063b = 3;
            r0Var.f152067f = 1;
            r0Var.f152066e = i17.f277912v;
            r0Var.f152065d = i17.f277913w;
            r0Var.f152070i = -1;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
        }
        return super.b(p0Var, str, str2, str3);
    }
}
