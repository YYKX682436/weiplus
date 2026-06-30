package com.p314xaae8f345.mm.p1006xc5476f33;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/FlutterScreenshotCallbackPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "Lcom/tencent/mm/sdk/platformtools/f7;", "<init>", "()V", "plugin-flutter-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.FlutterScreenshotCallbackPlugin */
/* loaded from: classes8.dex */
public final class C11333x46b61afa implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, p012xc85e97e9.p093xedfae76a.v, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f153936d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f153937e = "MicroMsg.FlutterScreenshotCallbackPlugin";

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f153938f;

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f153937e, "onAttachedToActivity");
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        this.f153938f = mo137508x19263085;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = mo137508x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo137508x19263085 : null;
        if (activityC0065xcd7aa112 == null || (mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f153936d = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(binding.m137983x3b5b91dc(), "Flutter.onScreenShot");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        android.app.Activity activity = this.f153938f;
        sb6.append(activity != null ? java.lang.Boolean.valueOf(activity.isFinishing()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f153937e, sb6.toString());
        android.app.Activity activity2 = this.f153938f;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = activity2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity2 : null;
        if (activityC0065xcd7aa112 != null && (mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4()) != null) {
            mo273xed6858b4.c(this);
        }
        this.f153938f = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f153938f = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f153936d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f153938f = binding.mo137508x19263085();
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.String str = this.f153937e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onStateChanged() event = " + event);
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_RESUME) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_flutter_enable_screen_shot_callback, 0) == 1;
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z17 && context != null) {
                try {
                    ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(context, this);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "registerScreenShotCallback fail e:%s", e17.getMessage());
                }
            }
        }
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_PAUSE) {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_flutter_enable_screen_shot_callback, 0) == 1;
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z18 && context2 != null) {
                try {
                    ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(context2, this);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "unregisterScreenShotCallback fail e:%s", e18.getMessage());
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        d75.b.g(new c61.rb(this));
    }
}
