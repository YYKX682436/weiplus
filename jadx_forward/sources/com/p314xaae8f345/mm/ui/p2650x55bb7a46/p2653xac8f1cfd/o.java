package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes14.dex */
public final class o implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v f281136d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f281137e;

    public o(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v statefulStatInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statefulStatInfo, "statefulStatInfo");
        this.f281136d = statefulStatInfo;
        this.f281137e = "AppMsgWxaViewAttachStateChangeListener#" + statefulStatInfo.f281634a.f280987a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        this.f281136d.f281634a.b(null);
    }

    /* renamed from: toString */
    public java.lang.String m79507x9616526c() {
        return this.f281137e;
    }
}
