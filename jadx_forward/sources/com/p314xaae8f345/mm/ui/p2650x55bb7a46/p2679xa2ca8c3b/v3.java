package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class v3 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 f287360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f287361e;

    public v3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var, java.lang.Runnable runnable) {
        this.f287360d = a4Var;
        this.f287361e = runnable;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f287360d.f39493x8ad70635.removeOnAttachStateChangeListener(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2C", "post async runnable %s", this.f287361e);
        java.lang.Runnable runnable = this.f287361e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o3.c()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a.d(runnable);
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
