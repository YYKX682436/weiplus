package j03;

/* loaded from: classes11.dex */
public final class d implements com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24633x745f7065, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {
    public static final /* synthetic */ java.lang.String a(j03.d dVar) {
        dVar.getClass();
        return "MicroMsg.FlutterUploadPlugin";
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24633x745f7065.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24633x745f7065.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24633x745f7065.Companion.m91336x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24633x745f7065.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24633x745f7065.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24633x745f7065.Companion.m91336x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24633x745f7065
    /* renamed from: uploadFile */
    public void mo91334xf17c8f1d(java.lang.String path, long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f394148d).g(new j03.c(path, callback, this, j17));
    }
}
