package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes7.dex */
public class r0 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f78970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.v0 f78972c;

    public r0(com.tencent.mm.plugin.appbrand.jsapi.appdownload.v0 v0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f78972c = v0Var;
        this.f78970a = e9Var;
        this.f78971b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        this.f78970a.a(this.f78971b, this.f78972c.o("ok"));
    }
}
