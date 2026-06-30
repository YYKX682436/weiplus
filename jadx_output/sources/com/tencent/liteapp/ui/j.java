package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f46186a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.android.RenderMode f46187b = io.flutter.embedding.android.RenderMode.surface;

    /* renamed from: c, reason: collision with root package name */
    public final io.flutter.embedding.android.TransparencyMode f46188c = io.flutter.embedding.android.TransparencyMode.transparent;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f46189d = true;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f46190e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.liteapp.storage.WxaLiteAppInfo f46191f;

    public j(java.lang.Class cls) {
        this.f46186a = cls;
    }

    public com.tencent.liteapp.ui.WxaLiteAppBaseFragment a() {
        java.lang.Class cls = this.f46186a;
        try {
            com.tencent.liteapp.ui.WxaLiteAppBaseFragment wxaLiteAppBaseFragment = (com.tencent.liteapp.ui.WxaLiteAppBaseFragment) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (wxaLiteAppBaseFragment != null) {
                wxaLiteAppBaseFragment.setArguments(b());
                return wxaLiteAppBaseFragment;
            }
            throw new java.lang.RuntimeException("The FlutterFragment subclass sent in the constructor (" + cls.getCanonicalName() + ") does not match the expected return type.");
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("Could not instantiate FlutterFragment subclass (" + cls.getName() + ")", e17);
        }
    }

    public android.os.Bundle b() {
        android.os.Bundle bundle = new android.os.Bundle();
        io.flutter.embedding.android.RenderMode renderMode = this.f46187b;
        if (renderMode == null) {
            renderMode = io.flutter.embedding.android.RenderMode.surface;
        }
        bundle.putString("flutterview_render_mode", renderMode.name());
        io.flutter.embedding.android.TransparencyMode transparencyMode = this.f46188c;
        bundle.putString("flutterview_transparency_mode", transparencyMode != null ? transparencyMode.name() : io.flutter.embedding.android.TransparencyMode.transparent.name());
        bundle.putBoolean("should_attach_engine_to_activity", this.f46189d);
        bundle.putBoolean("destroy_engine_with_fragment", true);
        java.lang.String str = this.f46190e;
        if (str != null) {
            bundle.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP_ID, str);
        }
        bundle.putBoolean(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_NEW_TAB, false);
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = this.f46191f;
        if (wxaLiteAppInfo != null) {
            bundle.putParcelable(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP, wxaLiteAppInfo);
        }
        return bundle;
    }
}
