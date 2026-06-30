package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class v6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f236159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f236160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f236161f;

    public v6(java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, boolean z17) {
        this.f236159d = weakReference;
        this.f236160e = weakReference2;
        this.f236161f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f236159d.get();
        if (u3Var != null) {
            if (!u3Var.isShowing()) {
                u3Var = null;
            }
            if (u3Var != null) {
                u3Var.dismiss();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90) this.f236160e.get();
        if (c16892x4a36dc90 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = c16892x4a36dc90.f235731d;
        if (activityC16840x4302a3e2.isFinishing() || activityC16840x4302a3e2.isDestroyed()) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[PhotoAccountGuide] switchToPhoto result: ");
        boolean z17 = this.f236161f;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", sb6.toString());
        if (z17) {
            db5.t7.i(activityC16840x4302a3e2, activityC16840x4302a3e2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o8f), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = c16892x4a36dc90.f235753y;
            if (m0Var != null) {
                m0Var.h();
            }
        }
    }
}
