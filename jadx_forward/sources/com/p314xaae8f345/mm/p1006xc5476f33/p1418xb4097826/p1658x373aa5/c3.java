package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public class c3 extends y9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f213280a;

    public c3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var) {
        this.f213280a = e3Var;
    }

    @Override // y9.c
    public void a(android.view.View view, float f17) {
    }

    @Override // y9.c
    public void b(android.view.View view, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStateChanged ");
        sb6.append(i17);
        sb6.append(", isShowing:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = this.f213280a;
        sb6.append(e3Var.f213490d.isShowing());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderBottomSheet", sb6.toString());
        if (i17 == 4 && e3Var.d() && e3Var.f213490d.isShowing()) {
            e3Var.h();
        }
    }
}
