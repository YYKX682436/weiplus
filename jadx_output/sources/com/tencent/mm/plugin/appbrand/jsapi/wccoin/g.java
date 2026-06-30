package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes8.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.wccoin.j f83764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult f83765e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.appbrand.jsapi.wccoin.j jVar, com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinResult consumeWCCoinResult) {
        super(1);
        this.f83764d = jVar;
        this.f83765e = consumeWCCoinResult;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        pr4.b it = (pr4.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.j jVar = this.f83764d;
        str = jVar.TAG;
        com.tencent.mars.xlog.Log.i(str, ya.b.SUCCESS);
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.j.k(this.f83765e, jVar, java.lang.String.valueOf(it.f357986a));
        return jz5.f0.f302826a;
    }
}
