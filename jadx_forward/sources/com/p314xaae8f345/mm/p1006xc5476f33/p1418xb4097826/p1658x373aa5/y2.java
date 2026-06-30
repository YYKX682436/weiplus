package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public class y2 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f214907d;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var) {
        this.f214907d = e3Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = this.f214907d;
        android.view.ViewTreeObserver viewTreeObserver = e3Var.f213497n;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                e3Var.f213497n = e3Var.f213496m.getViewTreeObserver();
            }
            e3Var.f213497n.removeGlobalOnLayoutListener(e3Var);
            e3Var.f213497n = null;
        }
        if (!e3Var.f213498o) {
            e3Var.f213490d = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d3 d3Var = e3Var.f213501r;
        if (d3Var != null) {
            d3Var.mo55682xb349b3ab();
        }
        e3Var.f213509z.removeAllViews();
        e3Var.D.clear();
    }
}
