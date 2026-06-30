package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class p2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286761e;

    public p2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o2 o2Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        this.f286760d = f9Var;
        this.f286761e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f286760d;
        if (f9Var.k2()) {
            l15.c cVar = new l15.c();
            java.lang.String U1 = f9Var.U1();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (U1 == null) {
                U1 = "";
            }
            cVar.m126731xdc93280d(U1, true);
            if (cVar.k() != null) {
                v05.b k17 = cVar.k();
                if (k17.m75939xb282bd08(k17.f449898d + 6) == 19) {
                    dk5.m2.f316264a.a(f9Var.Q0(), f9Var, true);
                    this.f286761e.L(true);
                }
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(f9Var);
            this.f286761e.L(true);
        }
    }
}
