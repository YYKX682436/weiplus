package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class r extends com.tencent.luggage.sdk.jsapi.component.service.u {

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f47523l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f47524m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f47525n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.luggage.sdk.jsapi.component.service.n nVar, java.lang.String str, android.content.res.AssetFileDescriptor assetFileDescriptor, com.tencent.luggage.sdk.jsapi.component.service.y yVar, com.tencent.luggage.sdk.jsapi.component.service.n nVar2, boolean z17, java.lang.Runnable runnable) {
        super(str, assetFileDescriptor, yVar, nVar2, z17, (com.tencent.luggage.sdk.jsapi.component.service.o) null);
        this.f47525n = runnable;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.u, com.tencent.mm.plugin.appbrand.utils.c3
    public void a(cl.k1 k1Var) {
        super.a(k1Var);
        if (this.f47524m && "Abort for empty source".equals(this.f47523l)) {
            this.f47525n.run();
        } else {
            super.b(this.f47523l);
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.u, com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("Luggage.AppBrandMiniProgramServiceLogicImp", "execInternalInitScript with fd, onFailure:%s", str);
        this.f47523l = str;
        this.f47524m = true;
    }
}
