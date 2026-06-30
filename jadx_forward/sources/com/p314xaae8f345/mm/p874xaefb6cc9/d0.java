package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f150539d;

    public d0(android.app.Activity activity) {
        this.f150539d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            android.content.Intent intent = com.p314xaae8f345.mm.p874xaefb6cc9.f0.f150603c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(intent);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.WVAActivityDelegate", "WVA.resetContext: activity attached, [in post] start WVA.Activity again");
            com.p314xaae8f345.mm.p874xaefb6cc9.f0.a(com.p314xaae8f345.mm.p874xaefb6cc9.f0.f150601a, this.f150539d, intent, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WVA.WVAActivityDelegate", "WVA.resetContext: startActivityImpl failed", e17);
        }
    }
}
