package kx5;

/* loaded from: classes15.dex */
public class p implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: d, reason: collision with root package name */
    public lx5.b f394858d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f394859e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f394860f = new kx5.o(this);

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        nx5.c.c("WxaRouter.WxaRouterPlugin", "onAttachedToEngine", new java.lang.Object[0]);
        lx5.b bVar = new lx5.b(flutterPluginBinding.m137983x3b5b91dc(), "com.tencent.wxa/wxa_router");
        this.f394858d = bVar;
        bVar.f403693c = this.f394860f;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        nx5.c.c("WxaRouter.WxaRouterPlugin", "onDetachedFromEngine", new java.lang.Object[0]);
        lx5.b bVar = this.f394858d;
        if (bVar != null) {
            bVar.f403693c = null;
        }
    }
}
