package yi4;

/* loaded from: classes11.dex */
public final class e implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 f544136d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f544137e = jz5.h.b(yi4.b.f544133d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f544138f = jz5.h.b(yi4.d.f544135d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f544139g = jz5.h.b(yi4.c.f544134d);

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2271xd2ae381c.C18604xfac4609d f544140h;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.textstatus.flutter.FLTStatusPlugin$commonApiEventListener$1] */
    public e() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f544140h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5412x34d099ab>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.flutter.FLTStatusPlugin$commonApiEventListener$1
            {
                this.f39173x3fe91575 = -739648101;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5412x34d099ab c5412x34d099ab) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5412x34d099ab event = c5412x34d099ab;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                yi4.e.this.a().getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FLTStatusActionHost", "doCommonCallback: request is null");
                return false;
            }
        };
    }

    public final zi4.g0 a() {
        return (zi4.g0) ((jz5.n) this.f544137e).mo141623x754a37bb();
    }

    public final yi4.l b() {
        return (yi4.l) ((jz5.n) this.f544139g).mo141623x754a37bb();
    }

    public final yi4.h c() {
        return (yi4.h) ((jz5.n) this.f544138f).mo141623x754a37bb();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    public boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent) {
        a().getClass();
        synchronized (aj4.w.f86911a) {
            yz5.p pVar = (yz5.p) aj4.w.f86913c.remove(java.lang.Integer.valueOf(i17));
            if (pVar == null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusFlutterMediaResultRouter", "dispatch: requestCode=" + i17 + ", resultCode=" + i18);
            try {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(i18), intent);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatusFlutterMediaResultRouter", th6, "dispatch failed", new java.lang.Object[0]);
            }
            return true;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        java.lang.ref.WeakReference weakReference;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusPlugin", "onAttachedToActivity: ".concat(binding.mo137508x19263085().getClass().getSimpleName()));
        this.f544136d = binding;
        binding.mo137502xbf77c2e1(this);
        a().b(binding.mo137508x19263085());
        yi4.h c17 = c();
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        if (mo137508x19263085 != null) {
            c17.getClass();
            weakReference = new java.lang.ref.WeakReference(mo137508x19263085);
        } else {
            weakReference = null;
        }
        c17.f544146d = weakReference;
        b().a(binding.mo137508x19263085());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusPlugin", "onAttachedToEngine");
        zi4.g0 a17 = a();
        a17.getClass();
        a17.f554751d = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("StatusActionHost", null, 0, 6, null);
        zi4.g0 a18 = a();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        a18.f554749b = new com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24924xf55b6e2f(m137983x3b5b91dc, null, 2, null);
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24918xf3c08e91.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24918xf3c08e91.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24918xf3c08e91.Companion.m92265x97a46f3a(companion, m137983x3b5b91dc2, a(), null, 4, null);
        mo48813x58998cd();
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca.Companion companion2 = com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc3 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc3, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca.Companion.m92392x97a46f3a(companion2, m137983x3b5b91dc3, c(), null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24827x8c9371e3.Companion companion3 = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24827x8c9371e3.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc4 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc4, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24827x8c9371e3.Companion.m91973x97a46f3a(companion3, m137983x3b5b91dc4, b(), null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusPlugin", "onDetachedFromActivity");
        a().c(null);
        c().f544146d = null;
        b().a(null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusPlugin", "onDetachedFromActivityForConfigChanges");
        a().c(null);
        c().f544146d = null;
        b().a(null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusPlugin", "onDetachedFromEngine");
        mo48814x2efc64();
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24918xf3c08e91.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24918xf3c08e91.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24918xf3c08e91.Companion.m92265x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca.Companion companion2 = com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca.Companion.m92392x97a46f3a(companion2, m137983x3b5b91dc2, null, null, 4, null);
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24827x8c9371e3.Companion companion3 = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24827x8c9371e3.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc3 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc3, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24827x8c9371e3.Companion.m91973x97a46f3a(companion3, m137983x3b5b91dc3, null, null, 4, null);
        a().f554749b = null;
        zi4.g0 a17 = a();
        a17.getClass();
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = a17.f554751d;
        if (c20976x6ba6452a != null) {
            c20976x6ba6452a.m77667xac79a11b();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        java.lang.ref.WeakReference weakReference;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusPlugin", "onReattachedToActivityForConfigChanges");
        this.f544136d = binding;
        a().b(binding.mo137508x19263085());
        yi4.h c17 = c();
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        if (mo137508x19263085 != null) {
            c17.getClass();
            weakReference = new java.lang.ref.WeakReference(mo137508x19263085);
        } else {
            weakReference = null;
        }
        c17.f544146d = weakReference;
        b().a(binding.mo137508x19263085());
    }
}
