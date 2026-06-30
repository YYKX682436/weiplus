package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class aa implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f89506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI f89507e;

    public aa(android.view.View view, com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI appBrandUIMoveTaskToBackStubUI) {
        this.f89506d = view;
        this.f89507e = appBrandUIMoveTaskToBackStubUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f89506d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.appbrand.ui.y9 y9Var = com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89437g;
        com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI appBrandUIMoveTaskToBackStubUI = this.f89507e;
        appBrandUIMoveTaskToBackStubUI.getContentView().postDelayed(appBrandUIMoveTaskToBackStubUI.f89441d, 300L);
        return true;
    }
}
