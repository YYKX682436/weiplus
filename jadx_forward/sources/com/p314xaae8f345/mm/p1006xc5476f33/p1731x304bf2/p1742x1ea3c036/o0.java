package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes8.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f221394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 f221396f;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 activityC15876x18f56825, android.view.View view, java.lang.String str) {
        this.f221396f = activityC15876x18f56825;
        this.f221394d = view;
        this.f221395e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f221394d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 activityC15876x18f56825 = this.f221396f;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = activityC15876x18f56825.f221031h;
        java.lang.String str = this.f221395e;
        frameLayout.removeView((android.view.View) concurrentHashMap.get(str));
        activityC15876x18f56825.f221031h.remove(str);
    }
}
