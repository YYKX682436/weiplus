package ah0;

/* loaded from: classes4.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.j1 f86276e;

    public f2(ah0.g2 g2Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.j1 j1Var) {
        this.f86275d = str;
        this.f86276e = j1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(this.f86275d, "sysmsg", null);
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.hijackconfig.expiretime"), com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
        int i17 = 0;
        java.lang.String str = ".sysmsg.hijackconfig.domainlist.domain";
        while (true) {
            if (i17 > 0) {
                str = ".sysmsg.hijackconfig.domainlist.domain" + i17;
            }
            i17++;
            java.lang.String str2 = (java.lang.String) d17.get(str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.g0();
            g0Var.f67486x876650f1 = V;
            g0Var.f67487x225c99cd = str2;
            this.f86276e.mo880xb970c2b9(g0Var);
        }
    }
}
