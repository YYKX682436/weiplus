package m73;

/* loaded from: classes8.dex */
public final class m implements vg3.o4, i35.f {
    @Override // i35.f
    public void K0(java.lang.String str, int i17, r45.g25 g25Var) {
        java.util.Objects.toString(g25Var);
        if (i17 == 0) {
            if (str == null || r26.n0.N(str)) {
                return;
            }
            o73.j Bi = ((m73.q) i95.n0.c(m73.q.class)).Bi();
            if (str == null || r26.n0.N(str)) {
                return;
            }
            pm0.v.L("MicroMsg.HashInfo.HashUserNameMapStorage", true, new o73.g(Bi, str));
        }
    }

    @Override // vg3.o4
    public void M(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
        if (tn4Var == null || z3Var == null || !z3Var.r2()) {
            return;
        }
        o73.j Bi = ((m73.q) i95.n0.c(m73.q.class)).Bi();
        java.lang.String d17 = z3Var.d1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
        Bi.b4(d17);
    }

    @Override // vg3.o4
    public void b0(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
    }

    @Override // vg3.o4
    public void m1(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, r45.xb0 xb0Var) {
    }
}
