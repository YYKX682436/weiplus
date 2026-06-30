package gm0;

/* loaded from: classes12.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final gm0.w f354820a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.r1 f354821b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f354822c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.s0 f354823d = new gm0.o(this);

    public y(com.p314xaae8f345.mm.p944x882e457a.h2 h2Var, gm0.w wVar) {
        if (com.p314xaae8f345.mm.p944x882e457a.r1.f152295y == null) {
            com.p314xaae8f345.mm.p944x882e457a.r1.f152295y = new com.p314xaae8f345.mm.p944x882e457a.r1(h2Var);
        }
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = com.p314xaae8f345.mm.p944x882e457a.r1.f152295y;
        this.f354821b = r1Var;
        r1Var.f152298e = gm0.j1.e();
        com.p314xaae8f345.mm.p944x882e457a.z2.f152380b = new gm0.n(this);
        this.f354820a = wVar;
    }

    public void a(com.p314xaae8f345.mm.p971x6de15a2e.s0 s0Var) {
        synchronized (this.f354822c) {
            this.f354822c.add(s0Var);
        }
    }

    public com.p314xaae8f345.mm.p944x882e457a.r1 b() {
        return this.f354821b;
    }

    public byte[] c(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = this.f354821b;
        if (r1Var != null) {
            try {
                com.p314xaae8f345.mm.p971x6de15a2e.s sVar = r1Var.f152297d;
                if (sVar != null && sVar.G() != null) {
                    return r1Var.f152297d.G().r(i17);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreNetwork", "get session key error, %s", e17.getMessage());
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreNetwork", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        return null;
    }

    public void d(com.p314xaae8f345.mm.p971x6de15a2e.s0 s0Var) {
        synchronized (this.f354822c) {
            this.f354822c.remove(s0Var);
        }
    }

    public void e() {
        this.f354821b.g(new c01.ra(new gm0.p(this), "reset accinfo"));
    }
}
