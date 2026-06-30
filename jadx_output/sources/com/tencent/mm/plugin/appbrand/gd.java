package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class gd implements com.tencent.mm.plugin.appbrand.jsapi.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.md f78251b;

    public gd(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.md mdVar) {
        this.f78250a = o6Var;
        this.f78251b = mdVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a0
    public final void onReady() {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.fd(this.f78250a, this.f78251b));
    }
}
