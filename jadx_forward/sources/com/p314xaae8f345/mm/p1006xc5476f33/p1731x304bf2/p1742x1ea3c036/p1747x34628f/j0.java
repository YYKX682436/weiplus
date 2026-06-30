package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k0 f221441d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k0 k0Var) {
        this.f221441d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k0 k0Var = this.f221441d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = k0Var.f221442a;
        if (x0Var.T1) {
            x0Var.T1 = false;
            if (((android.app.Activity) x0Var.f488143d).isFinishing()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var2 = k0Var.f221442a;
            x0Var2.U1 = true;
            sd.w wVar = ((sd.u) x0Var2.f488145f).f488186a;
            java.lang.String s17 = x0Var2.s();
            android.os.Bundle bundle = x0Var2.f488190n;
            sd.k a17 = wVar.f488199g.a(s17, bundle);
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggagePageContainer", "No page specified for url %s", s17);
                return;
            }
            a17.b(s17, bundle);
            wVar.f488195c.postDelayed(new sd.q(wVar, a17), 500L);
        }
    }
}
