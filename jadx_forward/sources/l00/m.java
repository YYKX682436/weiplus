package l00;

/* loaded from: classes7.dex */
public final class m implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23655xc19c5c17, l00.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f396263d;

    /* renamed from: e, reason: collision with root package name */
    public final dq0.q f396264e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f396265f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.ecs.C23651x33940179 f396266g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f396267h;

    public m(java.lang.String viewGroupId, dq0.q mbPlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroupId, "viewGroupId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mbPlugin, "mbPlugin");
        this.f396263d = viewGroupId;
        this.f396264e = mbPlugin;
        this.f396265f = "";
        this.f396267h = jz5.h.b(new l00.k(this));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23655xc19c5c17
    /* renamed from: invoke */
    public void mo87673xb9724478(java.lang.String bizName, java.lang.String apiName, byte[] bArr, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "apiName: ".concat(apiName));
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "Data is nil");
            return;
        }
        try {
            ((l00.h) ((jz5.n) this.f396267h).mo141623x754a37bb()).l(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d(apiName, new java.lang.String(bArr, r26.c.f450398a)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "json decode failed " + e17);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23655xc19c5c17.Companion companion = com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23655xc19c5c17.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23655xc19c5c17.Companion.m87675x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f396266g = new com.p314xaae8f345.p2845xc516c4b6.ecs.C23651x33940179(m137983x3b5b91dc2, null, 2, null);
        jc3.i0.p0((l00.h) ((jz5.n) this.f396267h).mo141623x754a37bb(), null, 1, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "onDetachedFromEngine");
        com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23655xc19c5c17.Companion companion = com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23655xc19c5c17.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23655xc19c5c17.Companion.m87675x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f396266g = null;
        this.f396264e.c(this.f396265f);
        ((l00.h) ((jz5.n) this.f396267h).mo141623x754a37bb()).mo133869x88fbd074();
    }
}
