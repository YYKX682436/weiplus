package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class r6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f236066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f236067e;

    public r6(java.lang.ref.WeakReference weakReference, boolean z17) {
        this.f236066d = weakReference;
        this.f236067e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference = this.f236066d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90) weakReference.get();
        if (c16892x4a36dc90 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = c16892x4a36dc90.f235731d;
        if (activityC16840x4302a3e2.isFinishing() || activityC16840x4302a3e2.isDestroyed()) {
            return;
        }
        if (!this.f236067e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] showCreatedSheet skip: hasPhotoLogged=false");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = c16892x4a36dc90.f235753y;
        if (m0Var != null) {
            m0Var.h();
        }
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g.f299275b.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.q6(weakReference));
    }
}
