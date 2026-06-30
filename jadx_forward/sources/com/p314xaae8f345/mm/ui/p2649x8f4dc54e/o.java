package com.p314xaae8f345.mm.ui.p2649x8f4dc54e;

/* loaded from: classes9.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21599xd87d9683 f279593d;

    public o(com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21599xd87d9683 activityC21599xd87d9683) {
        this.f279593d = activityC21599xd87d9683;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21599xd87d9683 activityC21599xd87d9683 = this.f279593d;
        if (activityC21599xd87d9683.isFinishing() || activityC21599xd87d9683.isDestroyed()) {
            return;
        }
        activityC21599xd87d9683.f279571u.postDelayed(new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.n(activityC21599xd87d9683), 300L);
    }
}
