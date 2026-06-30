package c01;

/* loaded from: classes11.dex */
public final class sa extends jm0.k {
    @Override // n75.a
    public java.util.Set N6() {
        return kz5.o1.c(new com.p314xaae8f345.mm.p2621x8fb0427b.s1());
    }

    @Override // jm0.k, n75.b
    public l75.k0 Q4() {
        l75.k0 Q4 = super.Q4();
        if (Q4 != null || !gm0.j1.a()) {
            return Q4;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().h());
        sb6.append("UnEncryptNewBiz.db");
        return O6(sb6.toString()) ? super.Q4() : Q4;
    }

    @Override // jm0.k
    public boolean Q6() {
        return false;
    }
}
