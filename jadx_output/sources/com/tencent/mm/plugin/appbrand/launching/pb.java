package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class pb extends com.tencent.mm.plugin.appbrand.launching.hb {

    /* renamed from: h, reason: collision with root package name */
    public final long f84929h;

    public pb(long j17) {
        this.f84929h = j17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        return java.lang.Boolean.valueOf(com.tencent.luggage.sdk.jsapi.component.service.t1.f47540a.a(this.f84929h, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "ilinkres_ae0cf48a"));
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.hb
    public java.lang.String f() {
        return "MicroMsg.AppBrand.PrepareStepCheckDependLib";
    }
}
