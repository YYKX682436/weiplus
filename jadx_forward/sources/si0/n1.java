package si0;

/* loaded from: classes11.dex */
public final class n1 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2 {
    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2
    /* renamed from: getCachePath */
    public java.lang.String mo91961xde6c6811() {
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("sns_aff_cache");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getMainPath(...)");
        return c17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2
    /* renamed from: getMediaPath */
    public java.lang.String mo91962x7f002773() {
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("sns_aff_media");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getMainPath(...)");
        return c17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2
    /* renamed from: getPublishPath */
    public java.lang.String mo91963xb5319c9e() {
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("sns_aff_publish");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getMainPath(...)");
        return c17;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.Companion.m91965x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.Companion.m91965x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }
}
