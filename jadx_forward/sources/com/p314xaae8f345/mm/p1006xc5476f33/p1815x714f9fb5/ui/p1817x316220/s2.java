package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes8.dex */
public class s2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 f226430d;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 q2Var) {
        this.f226430d = q2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 q2Var = this.f226430d;
        long longExtra = q2Var.n().getLongExtra("kFavInfoLocalId", -1L);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5296x2dd9a53 c5296x2dd9a53 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5296x2dd9a53();
        am.w3 w3Var = c5296x2dd9a53.f135617g;
        w3Var.f89791a = longExtra;
        w3Var.f89793c = 9;
        c5296x2dd9a53.e();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(java.lang.Boolean.valueOf(c5296x2dd9a53.f135618h.f89876a), false)) {
            q2Var.f226261d.finish();
        }
    }
}
