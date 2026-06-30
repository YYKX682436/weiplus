package com.tencent.mm.plugin.appbrand.wxassistant.cdp;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.cdp.e f92170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.appbrand.wxassistant.cdp.e eVar) {
        super(0);
        this.f92170d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.service.CdpCommandParams cdpCommandParams = this.f92170d.f92172b;
        kotlin.jvm.internal.o.d(cdpCommandParams);
        return cdpCommandParams.f88606f;
    }
}
