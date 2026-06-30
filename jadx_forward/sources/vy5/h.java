package vy5;

/* loaded from: classes11.dex */
public final class h implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f523060d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 f523061e;

    /* renamed from: f, reason: collision with root package name */
    public vy5.g f523062f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f523063g = p3325xe03a0797.p3326xc267989b.z0.a(oz5.m.f431862d);

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f523063g = p3325xe03a0797.p3326xc267989b.z0.b();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        android.content.Context m137982x6e669035 = binding.m137982x6e669035();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137982x6e669035, "getApplicationContext(...)");
        this.f523060d = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(m137983x3b5b91dc, "dev.fluttercommunity.plus/connectivity");
        this.f523061e = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529(m137983x3b5b91dc, "dev.fluttercommunity.plus/connectivity_status");
        vy5.a aVar = new vy5.a((android.net.ConnectivityManager) m137982x6e669035.getSystemService("connectivity"));
        vy5.f fVar = new vy5.f(aVar, this.f523063g);
        vy5.g gVar = new vy5.g(new dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7.C28214x10e3f0b9(m137982x6e669035, aVar, this.f523063g));
        this.f523062f = gVar;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f523060d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(fVar);
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 c28681x6bf9b529 = this.f523061e;
        if (c28681x6bf9b529 != null) {
            c28681x6bf9b529.m138415x95b45268(gVar);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        p3325xe03a0797.p3326xc267989b.z0.e(this.f523063g, null, 1, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f523060d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 c28681x6bf9b529 = this.f523061e;
        if (c28681x6bf9b529 != null) {
            c28681x6bf9b529.m138415x95b45268(null);
        }
        vy5.g gVar = this.f523062f;
        if (gVar != null) {
            gVar.mo14279x3d6f0539(null);
        }
        this.f523060d = null;
        this.f523061e = null;
        this.f523062f = null;
    }
}
