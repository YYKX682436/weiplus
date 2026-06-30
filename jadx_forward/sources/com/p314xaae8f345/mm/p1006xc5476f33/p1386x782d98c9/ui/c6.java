package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class c6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.m6 f180953d;

    public c6(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.m6 m6Var) {
        this.f180953d = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.m6 m6Var = this.f180953d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = m6Var.f181103a.f180877r;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        m6Var.f181103a.f180877r.dismiss();
        m6Var.f181103a.f180877r = null;
    }
}
