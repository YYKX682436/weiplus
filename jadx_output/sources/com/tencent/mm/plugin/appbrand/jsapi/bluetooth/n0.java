package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class n0 implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 f80089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80090b;

    public n0(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var, java.lang.String str) {
        this.f80089a = w0Var;
        this.f80090b = str;
    }

    @Override // ob1.d
    public final void a(ob1.m mVar) {
        com.tencent.mars.xlog.Log.i(this.f80089a.f80124e, "closeAllConnection, deviceId: " + this.f80090b + ", result: " + mVar);
    }
}
