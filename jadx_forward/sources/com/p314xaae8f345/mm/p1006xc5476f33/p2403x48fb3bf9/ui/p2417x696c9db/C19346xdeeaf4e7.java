package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper$BizFinderLineStatusChangedEventListenerImpl */
/* loaded from: classes8.dex */
public class C19346xdeeaf4e7 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5195x575f32c5> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f265419d;

    public C19346xdeeaf4e7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar) {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f265419d = new java.lang.ref.WeakReference(ldVar);
        this.f39173x3fe91575 = -1230141771;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5195x575f32c5 c5195x575f32c5) {
        java.lang.ref.WeakReference weakReference = this.f265419d;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIStyleHelper", "callback");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld) weakReference.get()).n();
        return false;
    }
}
