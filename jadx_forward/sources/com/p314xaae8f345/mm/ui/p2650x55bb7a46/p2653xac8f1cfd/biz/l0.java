package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes8.dex */
public class l0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.m0 f280330d;

    public l0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.m0 m0Var) {
        this.f280330d = m0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.m0 m0Var = this.f280330d;
        android.view.ViewTreeObserver viewTreeObserver = m0Var.f280338m;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                m0Var.f280338m = m0Var.f280337i.getViewTreeObserver();
            }
            m0Var.f280338m.removeGlobalOnLayoutListener(m0Var);
            m0Var.f280338m = null;
        }
        m0Var.getClass();
        m0Var.f280332d = null;
        m0Var.getClass();
    }
}
