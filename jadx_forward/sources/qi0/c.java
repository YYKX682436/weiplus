package qi0;

/* loaded from: classes11.dex */
public final class c implements com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24619xe5f9ca03, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f444999d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24616x67fd4f20 f445000e;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f445001f = p3325xe03a0797.p3326xc267989b.z0.i(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null));

    /* renamed from: g, reason: collision with root package name */
    public qi0.h f445002g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f445003h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f445004i;

    /* renamed from: m, reason: collision with root package name */
    public pi0.q f445005m;

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24619xe5f9ca03
    /* renamed from: disableSwipeBack */
    public void mo91318xc4ce4d39() {
        io.p3284xd2ae381c.Log.i("MicroMsg.FlutterNavigatorPlugin", "disableSwipeBack");
        this.f445003h = java.lang.Boolean.FALSE;
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f444999d;
        pi0.o0 o0Var = componentCallbacks2 instanceof pi0.o0 ? (pi0.o0) componentCallbacks2 : null;
        if (o0Var != null) {
            o0Var.S5(false);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24619xe5f9ca03
    /* renamed from: enableSwipeBack */
    public void mo91319xd71108fe() {
        io.p3284xd2ae381c.Log.i("MicroMsg.FlutterNavigatorPlugin", "enableSwipeBack");
        this.f445003h = java.lang.Boolean.TRUE;
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f444999d;
        pi0.o0 o0Var = componentCallbacks2 instanceof pi0.o0 ? (pi0.o0) componentCallbacks2 : null;
        if (o0Var != null) {
            o0Var.S5(true);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        if (!(mo137508x19263085 instanceof android.app.Activity)) {
            mo137508x19263085 = null;
        }
        this.f444999d = mo137508x19263085;
        java.lang.Boolean bool = this.f445003h;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            android.content.ComponentCallbacks2 componentCallbacks2 = this.f444999d;
            pi0.o0 o0Var = componentCallbacks2 instanceof pi0.o0 ? (pi0.o0) componentCallbacks2 : null;
            if (o0Var != null) {
                o0Var.S5(booleanValue);
            }
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        io.p3284xd2ae381c.Log.i("MicroMsg.FlutterNavigatorPlugin", "onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24619xe5f9ca03.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24619xe5f9ca03.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24619xe5f9ca03.Companion.m91322x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f445000e = new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24616x67fd4f20(m137983x3b5b91dc2, null, 2, null);
        new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binding.m137983x3b5b91dc(), "dev.flutter.pigeon.mm_auto_gen.FlutterNavigatorCallback.onNewRoute", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495).m138401x3bedc6cf(5);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f444999d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f444999d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24619xe5f9ca03.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24619xe5f9ca03.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24619xe5f9ca03.Companion.m91322x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f445000e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        if (!(mo137508x19263085 instanceof android.app.Activity)) {
            mo137508x19263085 = null;
        }
        this.f444999d = mo137508x19263085;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24619xe5f9ca03
    public void pop(java.lang.String plugin, java.lang.String route) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(route, "route");
        android.app.Activity activity = this.f444999d;
        if (activity != null) {
            activity.setResult(-1);
        }
        android.app.Activity activity2 = this.f444999d;
        if (activity2 instanceof pi0.o0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.flutter.base.IFlutterPageContainer");
            ((pi0.o0) activity2).pop();
        } else if (activity2 != 0) {
            activity2.finish();
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24619xe5f9ca03
    /* renamed from: push */
    public void mo91320x34af1a(java.lang.String plugin, java.lang.String route, java.util.Map arguments, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(route, "route");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arguments, "arguments");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(this.f445001f, null, null, new qi0.b(arguments, this, plugin, route, callback, null), 3, null);
    }
}
