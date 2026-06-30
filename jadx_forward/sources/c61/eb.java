package c61;

/* loaded from: classes11.dex */
public final class eb implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24605x80ea9d54 {
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24605x80ea9d54
    /* renamed from: load */
    public byte[] mo14267x32c4e6(java.lang.String key) {
        a03.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.HashMap hashMap = a03.g.f81955a;
        java.util.HashMap hashMap2 = a03.g.f81955a;
        synchronized (hashMap2) {
            fVar = (a03.f) hashMap2.get(key);
            if (fVar == null) {
                fVar = a03.g.f81956b;
            }
        }
        if (fVar == null) {
            return null;
        }
        java.lang.String substring = key.substring(10);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return com.p314xaae8f345.mm.vfs.w6.N("assets:///".concat(substring), 0, -1);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24605x80ea9d54
    /* renamed from: loadString */
    public java.lang.String mo14268xf3234c97(java.lang.String key, boolean z17) {
        a03.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.HashMap hashMap = a03.g.f81955a;
        java.util.HashMap hashMap2 = a03.g.f81955a;
        synchronized (hashMap2) {
            fVar = (a03.f) hashMap2.get(key);
            if (fVar == null) {
                fVar = a03.g.f81956b;
            }
        }
        if (fVar == null) {
            return null;
        }
        java.lang.String substring = key.substring(10);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return com.p314xaae8f345.mm.vfs.w6.M("assets:///".concat(substring));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24605x80ea9d54.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24605x80ea9d54.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24605x80ea9d54.Companion.m91247x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24605x80ea9d54.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24605x80ea9d54.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24605x80ea9d54.Companion.m91247x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }
}
