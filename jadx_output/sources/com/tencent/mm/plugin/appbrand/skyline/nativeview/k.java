package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes14.dex */
public class k implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnFocusChangeListener f88900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.skyline.nativeview.l f88901e;

    public k(com.tencent.mm.plugin.appbrand.skyline.nativeview.l lVar, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f88901e = lVar;
        this.f88900d = onFocusChangeListener;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.appbrand.skyline.nativeview.l lVar = this.f88901e;
        this.f88900d.onFocusChange(lVar, io.flutter.util.ViewUtils.childHasFocus(lVar));
    }
}
