package ki4;

/* loaded from: classes11.dex */
public final class q implements com.p314xaae8f345.mm.p2621x8fb0427b.c8 {
    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.c8
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 get(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        if ((str == null || r26.n0.N(str)) || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(str)) {
            return null;
        }
        mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(str);
        if (Ai != null) {
            z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            java.lang.String str2 = Ai.f76640x21f9b213;
            z3Var.M1(str2 == null || r26.n0.N(str2) ? "\u200b" : Ai.f76640x21f9b213);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String str3 = Ai.f76640x21f9b213;
            ((ke0.e) xVar).getClass();
            z3Var.J2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str3);
            z3Var.X1(Ai.f76648xdde069b);
            z3Var.E2 = z3Var.f72763xa3c65b86;
        } else {
            z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        }
        z3Var.X1(str);
        return z3Var;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.c8
    public int o0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17) {
        return (z3Var != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(z3Var.d1())) ? 1 : -1;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.c8
    public void w0(com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
    }
}
