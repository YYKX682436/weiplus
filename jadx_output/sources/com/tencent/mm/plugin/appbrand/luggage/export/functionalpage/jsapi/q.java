package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class q implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f85626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f85627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.s f85628f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f85629g;

    public q(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.s sVar, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f85626d = lVar;
        this.f85627e = i17;
        this.f85628f = sVar;
        this.f85629g = mMActivity;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f85626d;
        if (lVar != null) {
            lVar.a(this.f85627e, this.f85628f.o("ok"));
        }
        this.f85629g.finish();
    }
}
