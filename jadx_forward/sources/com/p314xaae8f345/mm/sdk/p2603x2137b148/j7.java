package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public final class j7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f274301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f274302f;

    public j7(java.lang.String str, long j17, boolean z17) {
        this.f274300d = str;
        this.f274301e = j17;
        this.f274302f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274393e;
        java.lang.String str = this.f274300d;
        long j17 = this.f274301e;
        boolean z17 = this.f274302f;
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 f7Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.f7) weakReference.get();
                if (f7Var != null) {
                    f7Var.z0(str, j17, z17);
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274393e.remove(weakReference);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenShotUtil", "invokeAllCallbacks, " + weakReference + " failed: " + e17.getMessage());
            }
        }
    }
}
