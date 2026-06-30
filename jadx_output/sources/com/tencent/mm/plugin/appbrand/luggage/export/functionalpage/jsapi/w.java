package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class w implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f85642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f85643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.y f85644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f85645g;

    public w(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.y yVar, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f85642d = d0Var;
        this.f85643e = i17;
        this.f85644f = yVar;
        this.f85645g = mMActivity;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        this.f85642d.a(this.f85643e, this.f85644f.o("ok"));
        this.f85645g.finish();
    }
}
