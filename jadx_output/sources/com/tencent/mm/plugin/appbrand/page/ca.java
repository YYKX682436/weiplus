package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class ca extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ia f86466h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(com.tencent.mm.plugin.appbrand.page.ia iaVar, long j17, java.lang.Boolean bool) {
        super(j17, bool);
        this.f86466h = iaVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        try {
            com.tencent.mm.plugin.appbrand.page.ia.d(this.f86466h);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWebViewCustomViewContainer", "removeAll error " + e17);
        }
        return java.lang.Boolean.FALSE;
    }
}
