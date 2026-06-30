package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class u5 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 f287197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f287198e;

    public u5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 w5Var, yz5.a aVar) {
        this.f287197d = w5Var;
        this.f287198e = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f287197d.f39493x8ad70635.removeOnAttachStateChangeListener(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgEcsGiftChatroom", "post async runnable");
        boolean c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o3.c();
        yz5.a aVar = this.f287198e;
        if (c17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a.d(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a6(aVar));
        } else {
            pm0.v.X(aVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }
}
