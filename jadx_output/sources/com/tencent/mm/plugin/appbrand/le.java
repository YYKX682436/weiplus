package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class le extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.me f85486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(com.tencent.mm.plugin.appbrand.me meVar) {
        super(1);
        this.f85486d = meVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cf.m lifecycle = (cf.m) obj;
        kotlin.jvm.internal.o.g(lifecycle, "$this$lifecycle");
        com.tencent.mm.plugin.appbrand.me meVar = this.f85486d;
        com.tencent.mm.plugin.appbrand.je jeVar = new com.tencent.mm.plugin.appbrand.je(meVar);
        lifecycle.f40828e.put(u81.b.FOREGROUND, jeVar);
        lifecycle.a(new com.tencent.mm.plugin.appbrand.ke(meVar));
        return jz5.f0.f302826a;
    }
}
