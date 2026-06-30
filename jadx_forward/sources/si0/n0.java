package si0;

/* loaded from: classes4.dex */
public final class n0 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: f, reason: collision with root package name */
    public static si0.n0 f489670f;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.sns.C24777x9830b147 f489671d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f489672e = new java.lang.ref.WeakReference(null);

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        this.f489671d = new com.p314xaae8f345.p2845xc516c4b6.sns.C24777x9830b147(m137983x3b5b91dc, null, 2, null);
        this.f489672e = new java.lang.ref.WeakReference(binding.m137982x6e669035());
        f489670f = this;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f489671d = null;
        f489670f = null;
    }
}
