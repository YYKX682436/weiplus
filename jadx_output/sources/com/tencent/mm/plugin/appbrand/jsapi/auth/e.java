package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class e implements com.tencent.mm.plugin.appbrand.jsapi.auth.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f79441e;

    public e(java.lang.String str, yz5.a aVar) {
        this.f79440d = str;
        this.f79441e = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.o
    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthJSAPIConcurrentQueue", "runTask() done, " + this.f79440d);
        this.f79441e.invoke();
    }
}
