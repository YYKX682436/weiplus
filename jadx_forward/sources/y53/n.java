package y53;

/* loaded from: classes8.dex */
public final class n implements com.p314xaae8f345.mm.p2621x8fb0427b.c8 {
    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.c8
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 get(java.lang.String str) {
        if ((str == null || str.length() == 0) || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(str)) {
            return null;
        }
        y53.m Di = ((y53.x) i95.n0.c(y53.x.class)).Di(((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Bi(str));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 v07 = Di != null ? Di.v0() : new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        v07.X1(str);
        return v07;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.c8
    public int o0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17) {
        return (z3Var != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(z3Var.d1())) ? 1 : -1;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.c8
    public void w0(com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
    }
}
