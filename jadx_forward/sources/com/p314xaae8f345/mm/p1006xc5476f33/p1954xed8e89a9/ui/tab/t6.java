package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class t6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f236132d;

    public t6(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90) {
        this.f236132d = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90) this.f236132d.get();
        if (c16892x4a36dc90 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] login event: widget gone, skip");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = c16892x4a36dc90.f235731d;
        if (activityC16840x4302a3e2.isFinishing() || activityC16840x4302a3e2.isDestroyed()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] isWaitingRegister=" + c16892x4a36dc90.K + ", publishReturned=" + c16892x4a36dc90.L);
        if (c16892x4a36dc90.K && c16892x4a36dc90.L) {
            if (!(activityC16840x4302a3e2 instanceof android.app.Activity)) {
                activityC16840x4302a3e2 = null;
            }
            if (activityC16840x4302a3e2 == null || activityC16840x4302a3e2.isFinishing() || activityC16840x4302a3e2.isDestroyed()) {
                return;
            }
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g.f299275b.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s6(new java.lang.ref.WeakReference(c16892x4a36dc90)));
        }
    }
}
