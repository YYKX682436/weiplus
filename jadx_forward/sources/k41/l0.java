package k41;

/* loaded from: classes11.dex */
public final class l0 implements com.p314xaae8f345.mm.p2621x8fb0427b.c8 {
    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.c8
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 get(java.lang.String str) {
        if ((str == null || str.length() == 0) || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str)) {
            return null;
        }
        k41.o0 o0Var = k41.o0.f385564a;
        if (str == null || str.length() == 0) {
            return null;
        }
        kk.j jVar = k41.o0.f385566c;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) ((lt0.f) jVar).i(str);
        if (z3Var != null) {
            java.lang.String d17 = z3Var.d1();
            if (!(d17 == null || d17.length() == 0)) {
                return z3Var;
            }
        }
        k41.g0 c17 = k41.o0.c(str);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 u07 = c17 != null ? c17.u0() : null;
        k41.o0 o0Var2 = k41.o0.f385564a;
        if (u07 == null) {
            return u07;
        }
        ((lt0.f) jVar).j(str, u07);
        return u07;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.c8
    public int o0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17) {
        return (z3Var == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(z3Var.d1())) ? -1 : 1;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.c8
    public void w0(com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
    }
}
