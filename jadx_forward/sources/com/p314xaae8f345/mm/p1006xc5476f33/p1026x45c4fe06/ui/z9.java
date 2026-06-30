package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class z9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4 f171903d;

    public z9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4 activityC12683x695b32b4) {
        this.f171903d = activityC12683x695b32b4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishFallbackTimerTask.run(), isFinishing:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4 activityC12683x695b32b4 = this.f171903d;
        sb6.append(activityC12683x695b32b4.isFinishing());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", sb6.toString());
        activityC12683x695b32b4.finish();
    }
}
