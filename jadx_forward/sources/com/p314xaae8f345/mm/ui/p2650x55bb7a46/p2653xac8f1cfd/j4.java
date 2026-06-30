package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public final class j4 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o4 f280785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280786f;

    public j4(android.view.View view, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o4 o4Var, java.lang.String str) {
        this.f280784d = view;
        this.f280785e = o4Var;
        this.f280786f = str;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f280784d.removeOnAttachStateChangeListener(this);
        this.f280785e.f281153e.remove(this.f280786f);
    }
}
