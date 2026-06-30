package com.tencent.mm.plugin;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/FlutterScreenshotCallbackPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "Lcom/tencent/mm/sdk/platformtools/f7;", "<init>", "()V", "plugin-flutter-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FlutterScreenshotCallbackPlugin implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, androidx.lifecycle.v, com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f72403d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f72404e = "MicroMsg.FlutterScreenshotCallbackPlugin";

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f72405f;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f72404e, "onAttachedToActivity");
        android.app.Activity activity = binding.getActivity();
        this.f72405f = activity;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = activity instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity : null;
        if (appCompatActivity == null || (mo133getLifecycle = appCompatActivity.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f72403d = new io.flutter.plugin.common.MethodChannel(binding.getBinaryMessenger(), "Flutter.onScreenShot");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        androidx.lifecycle.o mo133getLifecycle;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        android.app.Activity activity = this.f72405f;
        sb6.append(activity != null ? java.lang.Boolean.valueOf(activity.isFinishing()) : null);
        com.tencent.mars.xlog.Log.i(this.f72404e, sb6.toString());
        android.app.Activity activity2 = this.f72405f;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = activity2 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity2 : null;
        if (appCompatActivity != null && (mo133getLifecycle = appCompatActivity.mo133getLifecycle()) != null) {
            mo133getLifecycle.c(this);
        }
        this.f72405f = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f72405f = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f72403d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f72405f = binding.getActivity();
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String str = this.f72404e;
        com.tencent.mars.xlog.Log.i(str, "onStateChanged() event = " + event);
        if (event == androidx.lifecycle.m.ON_RESUME) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_flutter_enable_screen_shot_callback, 0) == 1;
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z17 && context != null) {
                try {
                    ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(context, this);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w(str, "registerScreenShotCallback fail e:%s", e17.getMessage());
                }
            }
        }
        if (event == androidx.lifecycle.m.ON_PAUSE) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_flutter_enable_screen_shot_callback, 0) == 1;
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z18 && context2 != null) {
                try {
                    ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(context2, this);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.w(str, "unregisterScreenShotCallback fail e:%s", e18.getMessage());
                }
            }
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        d75.b.g(new c61.rb(this));
    }
}
