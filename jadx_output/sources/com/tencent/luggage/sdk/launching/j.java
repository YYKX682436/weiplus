package com.tencent.luggage.sdk.launching;

/* loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder f47617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.launching.OnWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1 f47618e;

    public j(com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder onWXAppResultEventBinder, com.tencent.luggage.sdk.launching.OnWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1 onWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1) {
        this.f47617d = onWXAppResultEventBinder;
        this.f47618e = onWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EventBinder finalized, instance:");
        com.tencent.luggage.sdk.launching.OnWXAppResultEventBinder onWXAppResultEventBinder = this.f47617d;
        sb6.append(onWXAppResultEventBinder.f47593d);
        sb6.append(", processName:");
        sb6.append(onWXAppResultEventBinder.f47594e);
        com.tencent.mars.xlog.Log.i("MicroMsg.OnWXAppResultXPCLeakFreeWrapper.Helper", sb6.toString());
        dead();
    }
}
