package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class ma implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f288560d;

    public ma(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8, com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.AnonymousClass1 anonymousClass1) {
        this.f288560d = new java.lang.ref.WeakReference(activityC22325x8baa24f8);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = (com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8) this.f288560d.get();
        if (activityC22325x8baa24f8 == null) {
            return;
        }
        activityC22325x8baa24f8.moveTaskToBack(true);
    }
}
