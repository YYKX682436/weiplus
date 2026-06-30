package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class p6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f236046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.iam.biz.h f236047e;

    public p6(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.p3133xd0ce8b26.iam.biz.h hVar) {
        this.f236046d = weakReference;
        this.f236047e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference = this.f236046d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90) weakReference.get();
        if (c16892x4a36dc90 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = c16892x4a36dc90.f235731d;
        if (activityC16840x4302a3e2.isFinishing() || activityC16840x4302a3e2.isDestroyed()) {
            return;
        }
        boolean z17 = false;
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.h hVar = this.f236047e;
        if (hVar != null && hVar.f299281d == 2) {
            z17 = true;
        }
        if (z17) {
            ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Bi(2).d(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.o6(weakReference));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[PhotoAccountGuide] showCreatedSheet skip: identity=");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f299281d) : null);
        sb6.append(", not Photo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", sb6.toString());
    }
}
