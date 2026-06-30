package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.q2 f182552d;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.q2 q2Var) {
        this.f182552d = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        int u07;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1 x17;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.q2 q2Var = this.f182552d;
        if (!q2Var.f182602x || (c1163xf1deaba4 = q2Var.f182600v) == null || c1163xf1deaba4 == null) {
            return;
        }
        int d17 = q2Var.d(q2Var.f182596r, c1163xf1deaba4);
        if (d17 == 0) {
            q2Var.f182602x = false;
            return;
        }
        c1163xf1deaba4.scrollBy(0, d17);
        android.view.View k07 = c1163xf1deaba4.k0(q2Var.f182595q, q2Var.f182596r);
        if (k07 != null && (u07 = c1163xf1deaba4.u0(k07)) != -1 && u07 != q2Var.f182593o && (x17 = q2Var.f182586e.x(u07)) != null && x17.f182570c != Integer.MAX_VALUE) {
            q2Var.f182593o = u07;
            q2Var.f();
        }
        q2Var.f182601w.mo50297x7c4d7ca2(this, q2Var.f182588g.f182540c);
    }
}
