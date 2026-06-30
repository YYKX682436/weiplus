package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class ud implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.md f83502d;

    public ud(com.tencent.mm.plugin.appbrand.jsapi.md mdVar) {
        this.f83502d = mdVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f83502d.f81606c.getRuntime().N.a(this.f83502d.f81612i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f83502d.f81606c.getRuntime().N.c(this.f83502d.f81612i);
    }
}
