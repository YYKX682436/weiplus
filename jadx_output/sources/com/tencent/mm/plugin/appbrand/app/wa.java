package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class wa extends le.d {

    /* renamed from: b, reason: collision with root package name */
    public pd.c f75334b = null;

    public wa() {
        cf.i.b("WeChatMultiProcessInitDelegateImpl<init>", new com.tencent.mm.plugin.appbrand.app.ua(this));
    }

    @Override // le.e, pd.c
    public void a(pd.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatMultiProcessInitDelegateImpl", "onInitComponent %s", bm5.f1.a());
        super.a(bVar);
        this.f75334b.a(bVar);
    }

    @Override // le.e, pd.c
    public void b(pd.d dVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatMultiProcessInitDelegateImpl", "onInitialize %s", bm5.f1.a());
        cf.i.b("NanoSdkLuggageInitDelegate", new le.b(this, dVar));
        cf.i.b("FullSdkLuggageInitDelegate", new le.c(this, dVar));
        this.f75334b.b(dVar);
        dVar.b(com.tencent.mm.plugin.appbrand.ui.dd.class, com.tencent.mm.plugin.appbrand.ui.u8.INSTANCE);
        dVar.b(ik1.k0.class, com.tencent.mm.plugin.appbrand.app.ya.INSTANCE);
        dVar.a(com.tencent.mm.plugin.appbrand.profile.a.class, new ch1.c());
        dVar.a(com.tencent.mm.plugin.appbrand.profile.c.class, new ch1.d());
        dVar.b(oe.a.class, new com.tencent.mm.plugin.appbrand.luggage.customize.b());
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatMultiProcessInitDelegateImpl", "onInitialize register WxaEntryPagePathKeyGetter");
        dVar.b(k91.b3.class, new nd1.l2());
        dVar.b(com.tencent.mm.plugin.appbrand.networking.c0.class, com.tencent.mm.plugin.appbrand.networking.m0.INSTANCE);
        wo.n1.f447742f = new com.tencent.mm.plugin.appbrand.app.va(this);
    }
}
