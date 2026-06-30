package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public final class m0 implements com.tencent.luggage.sdk.launching.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f82250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f82251b;

    public m0(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f82250a = o6Var;
        this.f82251b = appBrandInitConfigWC;
    }

    @Override // com.tencent.luggage.sdk.launching.i
    public void a(android.os.Parcelable parcelable) {
        com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult miniProgramNavigationBackResult = (com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult) parcelable;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC token = this.f82251b;
        kotlin.jvm.internal.o.g(token, "token");
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f82250a;
        if (o6Var != null) {
            o6Var.n1(token, miniProgramNavigationBackResult);
        }
    }
}
