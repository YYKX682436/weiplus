package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f127730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 f127731e;

    public l(com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329, java.util.HashMap hashMap) {
        this.f127731e = c3717xac6c2329;
        this.f127730d = hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        kx5.n.h().j(this.f127731e.f127577h, "setForbidRightGestureEnable", this.f127730d);
    }
}
