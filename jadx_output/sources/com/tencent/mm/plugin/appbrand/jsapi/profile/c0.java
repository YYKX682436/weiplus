package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class c0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.profile.e0 f82783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ab0.a f82784e;

    public c0(com.tencent.mm.plugin.appbrand.jsapi.profile.e0 e0Var, ab0.a aVar) {
        this.f82783d = e0Var;
        this.f82784e = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenWeComUserProfile", "handleRequest, cancel");
        this.f82783d.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.profile.JumpToProfileResult(com.tencent.mm.plugin.appbrand.jsapi.profile.b0.f82776g, ""));
        ((cb0.d) this.f82784e).a();
    }
}
