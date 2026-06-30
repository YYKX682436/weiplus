package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f236044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f236045e;

    public p5(java.lang.ref.WeakReference weakReference, boolean z17) {
        this.f236044d = weakReference;
        this.f236045e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90) this.f236044d.get();
        if (c16892x4a36dc90 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = c16892x4a36dc90.f235731d;
        if (activityC16840x4302a3e2.isFinishing() || activityC16840x4302a3e2.isDestroyed() || !this.f236045e || (m0Var = c16892x4a36dc90.f235753y) == null) {
            return;
        }
        m0Var.h();
    }
}
