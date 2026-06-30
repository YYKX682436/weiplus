package et;

@j95.b
/* loaded from: classes7.dex */
public class i2 extends i95.w implements ft.l4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f337999d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f338000e = new java.util.concurrent.ConcurrentSkipListSet(new et.C28303x5deea58());

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        this.f337999d.set(true);
        k91.k4.g().add(ea1.p.f332073d);
        while (true) {
            java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = this.f338000e;
            if (concurrentSkipListSet.isEmpty()) {
                return;
            }
            l75.q0 q0Var = (l75.q0) concurrentSkipListSet.pollFirst();
            if (q0Var != null && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().add(q0Var);
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        java.lang.Object obj;
        super.mo836xb8969aab(context);
        this.f337999d.set(false);
        try {
            bm5.i1 i1Var = k91.k4.f387196e;
            synchronized (i1Var) {
                obj = i1Var.f104226c;
            }
            k91.k4 k4Var = (k91.k4) obj;
            if (k4Var != null) {
                k4Var.mo49775xc84af884(ea1.p.f332073d);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 wi(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef4;
        android.database.Cursor E;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj() == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f3 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj();
        hj6.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (E = hj6.f157967e.E("AppBrandLauncherLayoutItem", null, java.lang.String.format(java.util.Locale.US, "%s=? and %s=?", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "recordId"), new java.lang.String[]{java.lang.String.valueOf(2), str}, null, null, null)) == null) {
            c11712x63ef1ef4 = null;
        } else {
            if (E.moveToFirst()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c3 c3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c3();
                c3Var.mo9015xbf5d97fd(E);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c3Var.f65826x7cc83cbd)) {
                    c11712x63ef1ef4 = k91.k4.b(java.lang.String.valueOf(c3Var.f65827xee1faef1), c3Var.f65826x7cc83cbd, c3Var.f65832x94d24c6d, c3Var.f65830xa783a79b, c3Var.f65831x73e938c3, c3Var.f65829x773b0858);
                    c11712x63ef1ef4.f157899i = c3Var.f65825x453e07a1;
                    E.close();
                }
            }
            c11712x63ef1ef4 = null;
            E.close();
        }
        if (c11712x63ef1ef4 == null) {
            return null;
        }
        return c11712x63ef1ef4;
    }
}
