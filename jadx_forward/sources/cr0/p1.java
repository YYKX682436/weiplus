package cr0;

/* loaded from: classes12.dex */
public final class p1 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public cr0.k0 f303241b;

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        cr0.k0 k0Var = new cr0.k0();
        cr0.u0 g17 = cr0.u1.f303293a.g();
        if (g17.f303290a) {
            g17.c().m40834x32c52b(new cr0.i0(k0Var, g17));
        }
        this.f303241b = k0Var;
        cr0.u1 u1Var = cr0.u1.f303293a;
        synchronized (u1Var.c()) {
            u1Var.c().clear();
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        java.lang.Throwable th6;
        cr0.k0 k0Var = this.f303241b;
        if (k0Var != null) {
            cr0.k0 k0Var2 = new cr0.k0();
            cr0.u1 u1Var = cr0.u1.f303293a;
            cr0.u0 g17 = u1Var.g();
            if (g17.f303290a) {
                g17.c().m40834x32c52b(new cr0.i0(k0Var2, g17));
            }
            cr0.j0 j0Var = new cr0.j0(k0Var, k0Var2);
            long j17 = j0Var.f477020d;
            if (j17 > 600000 && (!((cr0.k0) j0Var.f477019c).b().isEmpty())) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.r2) i95.n0.c(ob0.r2.class))).Ri(j17, j0Var, linkedHashMap, new cr0.o1(j0Var, linkedHashMap, j17));
                long c17 = a06.d.c((((cr0.k0) j0Var.f477019c).f303323g.f477085a.floatValue() * 100.0f) / ((float) j17));
                long j18 = j17 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
                synchronized (u1Var.c()) {
                    th6 = (java.lang.Throwable) u1Var.c().get(((cr0.r) kz5.n0.X(((cr0.k0) j0Var.f477019c).b())).f303258d);
                }
                ap.a.a(1, "statsBinderProxy", th6, linkedHashMap, java.lang.String.valueOf(j18), ((cr0.r) ((cr0.k0) j0Var.f477019c).b().get(0)).f303258d, java.lang.String.valueOf(((cr0.k0) j0Var.f477019c).f303322f.f477085a.longValue() / j18), java.lang.String.valueOf(c17));
            }
        }
        cr0.u1 u1Var2 = cr0.u1.f303293a;
        synchronized (u1Var2.c()) {
            u1Var2.c().clear();
        }
        this.f303241b = null;
    }
}
