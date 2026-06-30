package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public final class wa extends le.d {

    /* renamed from: b, reason: collision with root package name */
    public pd.c f156867b = null;

    public wa() {
        cf.i.b("WeChatMultiProcessInitDelegateImpl<init>", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.ua(this));
    }

    @Override // le.e, pd.c
    public void a(pd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatMultiProcessInitDelegateImpl", "onInitComponent %s", bm5.f1.a());
        super.a(bVar);
        this.f156867b.a(bVar);
    }

    @Override // le.e, pd.c
    public void b(pd.d dVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatMultiProcessInitDelegateImpl", "onInitialize %s", bm5.f1.a());
        cf.i.b("NanoSdkLuggageInitDelegate", new le.b(this, dVar));
        cf.i.b("FullSdkLuggageInitDelegate", new le.c(this, dVar));
        this.f156867b.b(dVar);
        dVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.INSTANCE);
        dVar.b(ik1.k0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.ya.INSTANCE);
        dVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, new ch1.c());
        dVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, new ch1.d());
        dVar.b(oe.a.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatMultiProcessInitDelegateImpl", "onInitialize register WxaEntryPagePathKeyGetter");
        dVar.b(k91.b3.class, new nd1.l2());
        dVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.m0.INSTANCE);
        wo.n1.f529275f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.va(this);
    }
}
