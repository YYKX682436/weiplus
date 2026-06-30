package dm4;

/* loaded from: classes11.dex */
public final class a implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24974x811b93cf {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f323286d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f323287e;

    public a(yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f323286d = callback;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24974x811b93cf
    /* renamed from: onAddItemsSuccess */
    public void mo92624xe656eb85() {
        if (this.f323287e) {
            return;
        }
        this.f323287e = true;
        this.f323286d.mo149xb9724478(null, java.lang.Boolean.FALSE);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24974x811b93cf.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24974x811b93cf.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24974x811b93cf.Companion.m92627x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24974x811b93cf.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24974x811b93cf.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24974x811b93cf.Companion.m92627x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        if (this.f323287e) {
            return;
        }
        this.f323287e = true;
        this.f323286d.mo149xb9724478(null, java.lang.Boolean.TRUE);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC24974x811b93cf
    /* renamed from: onPickListSuccess */
    public void mo92625x1981a2c5(byte[] albumData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(albumData, "albumData");
        if (this.f323287e) {
            return;
        }
        this.f323287e = true;
        this.f323286d.mo149xb9724478(new bw5.o50().mo11468x92b714fd(albumData), java.lang.Boolean.FALSE);
    }
}
