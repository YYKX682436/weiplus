package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes15.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f127717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 f127718e;

    public i1(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7, java.util.HashMap hashMap) {
        this.f127718e = activityC3722x408816c7;
        this.f127717d = hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        kx5.n.h().j(this.f127718e.f127570o, "setForbidRightGestureEnable", this.f127717d);
    }
}
