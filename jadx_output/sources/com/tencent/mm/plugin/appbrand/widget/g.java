package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public final class g implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f91135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.h f91136e;

    public g(android.view.View view, com.tencent.mm.plugin.appbrand.widget.h hVar) {
        this.f91135d = view;
        this.f91136e = hVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        this.f91135d.removeOnAttachStateChangeListener(this);
        com.tencent.mm.plugin.appbrand.widget.h hVar = this.f91136e;
        hVar.d();
        hVar.f91138b = false;
    }
}
