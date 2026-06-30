package cd3;

/* loaded from: classes7.dex */
public final class c extends dq0.a0 implements jc3.r {

    /* renamed from: r, reason: collision with root package name */
    public final oe3.c f122190r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dq0.q mbPlugin) {
        super(mbPlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mbPlugin, "mbPlugin");
        this.f122190r = new oe3.c();
    }

    @Override // dq0.a0
    public java.util.Map j() {
        return kz5.c1.m(this.f323831q, kz5.c1.k(new jz5.l("testFailed", new cd3.a(this)), new jz5.l("testOk", new cd3.b(this))));
    }

    @Override // dq0.a0
    public void m(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        super.m(binding);
        this.f122190r.mo123041x5cd39ffa();
    }

    @Override // dq0.a0, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        super.mo261xdddc9e60(binding);
        this.f122190r.mo123044x68ac462();
    }

    @Override // dq0.a0
    public hq0.i0 t() {
        return this.f122190r;
    }
}
