package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult f83766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.wccoin.j f83767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult consumeWCCoinResult, com.tencent.mm.plugin.appbrand.jsapi.wccoin.j jVar) {
        super(1);
        this.f83766d = consumeWCCoinResult;
        this.f83767e = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.a it = (pr4.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int ordinal = it.f357985a.ordinal();
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.j jVar = this.f83767e;
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult consumeWCCoinResult = this.f83766d;
        if (ordinal == 0) {
            com.tencent.mm.plugin.appbrand.jsapi.wccoin.j.h(consumeWCCoinResult, jVar);
        } else if (ordinal == 1) {
            com.tencent.mm.plugin.appbrand.jsapi.wccoin.j.i(consumeWCCoinResult, jVar);
        } else if (ordinal == 2) {
            com.tencent.mm.plugin.appbrand.jsapi.wccoin.j.j(consumeWCCoinResult, jVar);
        }
        return jz5.f0.f302826a;
    }
}
