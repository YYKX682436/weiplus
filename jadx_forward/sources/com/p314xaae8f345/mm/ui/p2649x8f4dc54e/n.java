package com.p314xaae8f345.mm.ui.p2649x8f4dc54e;

/* loaded from: classes9.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21599xd87d9683 f279592d;

    public n(com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21599xd87d9683 activityC21599xd87d9683) {
        this.f279592d = activityC21599xd87d9683;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e31.k a17;
        com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21599xd87d9683 activityC21599xd87d9683 = this.f279592d;
        if (activityC21599xd87d9683.isFinishing() || activityC21599xd87d9683.isDestroyed()) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.ui.p2649x8f4dc54e.r.f279596o;
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("brs_timeline_auto_notify_education_has_shown", false) && (a17 = e31.n.f328620a.a("name_biz")) != null) {
            g31.l lVar = (g31.l) a17;
            if (lVar.f349627g) {
                k31.a aVar = lVar.f349621a;
                if (aVar != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(((k31.h) aVar).c()).i("HasReceivedAutoNotifySubscribeMsg", false) : false) {
                    z17 = true;
                }
            }
        }
        if (z17) {
            activityC21599xd87d9683.f279572v = true;
            new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.r(activityC21599xd87d9683).show();
        }
    }
}
