package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes15.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f127685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 f127686e;

    public f0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133, java.util.HashMap hashMap) {
        this.f127686e = activityC3721x69b5f133;
        this.f127685d = hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        kx5.n.h().j(this.f127686e.f127613m, "setForbidRightGestureEnable", this.f127685d);
    }
}
