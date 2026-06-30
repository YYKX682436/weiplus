package sy5;

/* loaded from: classes13.dex */
public class e implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f495435d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 f495436e;

    /* renamed from: f, reason: collision with root package name */
    public dev.p3272xc19e574d.p3273x348d9a.p3274x72a369b7.C28213x10e3f0b9 f495437f;

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = flutterPluginBinding.m137983x3b5b91dc();
        android.content.Context m137982x6e669035 = flutterPluginBinding.m137982x6e669035();
        this.f495435d = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(m137983x3b5b91dc, "dev.fluttercommunity.plus/connectivity");
        this.f495436e = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529(m137983x3b5b91dc, "dev.fluttercommunity.plus/connectivity_status");
        sy5.a aVar = new sy5.a((android.net.ConnectivityManager) m137982x6e669035.getSystemService("connectivity"));
        sy5.d dVar = new sy5.d(aVar);
        this.f495437f = new dev.p3272xc19e574d.p3273x348d9a.p3274x72a369b7.C28213x10e3f0b9(m137982x6e669035, aVar);
        this.f495435d.m138441xdf757329(dVar);
        this.f495436e.m138415x95b45268(this.f495437f);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        this.f495435d.m138441xdf757329(null);
        this.f495436e.m138415x95b45268(null);
        this.f495437f.mo14279x3d6f0539(null);
        this.f495435d = null;
        this.f495436e = null;
        this.f495437f = null;
    }
}
