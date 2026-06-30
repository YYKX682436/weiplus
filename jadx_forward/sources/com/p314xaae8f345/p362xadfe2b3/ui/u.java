package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f127758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 f127759e;

    public u(com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063, java.util.HashMap hashMap) {
        this.f127759e = c3719xb0aa2063;
        this.f127758d = hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        kx5.n.h().j(this.f127759e.f127563o, "setForbidRightGestureEnable", this.f127758d);
    }
}
