package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes.dex */
public final class t implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f85634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f85635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.v f85636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f85637g;

    public t(com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.v vVar, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f85634d = yVar;
        this.f85635e = i17;
        this.f85636f = vVar;
        this.f85637g = mMActivity;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.y yVar = this.f85634d;
        if (yVar != null) {
            yVar.a(this.f85635e, this.f85636f.o("ok"));
        }
        this.f85637g.finish();
    }
}
