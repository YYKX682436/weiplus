package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class u6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15035xa57e2b0a f211437d;

    public u6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15035xa57e2b0a activityC15035xa57e2b0a) {
        this.f211437d = activityC15035xa57e2b0a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishFallbackTimerTask, isFinishing:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15035xa57e2b0a activityC15035xa57e2b0a = this.f211437d;
        sb6.append(activityC15035xa57e2b0a.isFinishing());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeAnimUI", sb6.toString());
        if (activityC15035xa57e2b0a.isFinishing()) {
            return;
        }
        activityC15035xa57e2b0a.finish();
    }
}
