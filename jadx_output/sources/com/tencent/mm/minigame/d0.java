package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f69006d;

    public d0(android.app.Activity activity) {
        this.f69006d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            android.content.Intent intent = com.tencent.mm.minigame.f0.f69070c;
            kotlin.jvm.internal.o.d(intent);
            com.tencent.mars.xlog.Log.i("WVA.WVAActivityDelegate", "WVA.resetContext: activity attached, [in post] start WVA.Activity again");
            com.tencent.mm.minigame.f0.a(com.tencent.mm.minigame.f0.f69068a, this.f69006d, intent, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("WVA.WVAActivityDelegate", "WVA.resetContext: startActivityImpl failed", e17);
        }
    }
}
