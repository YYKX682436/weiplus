package r01;

/* loaded from: classes8.dex */
public class a0 extends dm.i1 {

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f449549x = dm.i1.m125048x3593deb(r01.a0.class);

    public a0() {
    }

    public static boolean t0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        r01.a0 z07;
        if (f9Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.Q0())) {
            if (f9Var.P1() == 2) {
                return true;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.R1()) && r01.z.n(f9Var.Q0()) && (z07 = r01.q3.hj().z0(f9Var.R1())) != null && z07.f66822x22f1a1a == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // dm.i1, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f449549x;
    }

    public a0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, long j17) {
        this.f66824x996f3ea = str;
        this.f66820x7583f6f8 = str2;
        this.f66821xff000111 = str3;
        this.f66823x21f9b213 = str4;
        this.f66822x22f1a1a = i17;
        this.f66825xa783a79b = j17;
    }
}
