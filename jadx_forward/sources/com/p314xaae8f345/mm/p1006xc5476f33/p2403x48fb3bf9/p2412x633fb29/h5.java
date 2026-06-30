package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public final class h5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f264457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j5 f264458e;

    public h5(android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j5 j5Var) {
        this.f264457d = bundle;
        this.f264458e = j5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle = this.f264457d;
        java.lang.String string = bundle.getString("host");
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j5.f264503c;
        if (kz5.n0.O((java.util.HashSet) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j5.f264504d).mo141623x754a37bb(), string)) {
            return;
        }
        java.lang.String string2 = bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54552x8c62eff0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j5 j5Var = this.f264458e;
        sb6.append(j5Var.f264505a);
        sb6.append(',');
        sb6.append(string);
        sb6.append(',');
        sb6.append(string2);
        java.lang.String sb7 = sb6.toString();
        if (j5Var.f264506b.contains(sb7)) {
            return;
        }
        long j17 = j5Var.f264505a;
        if (string == null || string.length() == 0) {
            return;
        }
        if (string2 == null || string2.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26701, java.lang.Long.valueOf(j5Var.f264505a), string, string2);
        j5Var.f264506b.add(sb7);
    }
}
