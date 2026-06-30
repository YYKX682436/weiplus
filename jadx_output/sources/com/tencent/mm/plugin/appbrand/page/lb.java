package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class lb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mb f86859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(com.tencent.mm.plugin.appbrand.page.mb mbVar) {
        super(0);
        this.f86859d = mbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.jsapi.l F = this.f86859d.f86880a.F();
        kotlin.jvm.internal.o.d(F);
        com.tencent.mm.plugin.appbrand.appcache.a4 o17 = com.tencent.mm.plugin.appbrand.appcache.la.o(((com.tencent.luggage.sdk.jsapi.component.b) F).t3(), false);
        kotlin.jvm.internal.o.e(o17, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.IWxaPkgRuntimeReader");
        return o17;
    }
}
