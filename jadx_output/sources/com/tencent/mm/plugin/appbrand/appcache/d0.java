package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.a9 f75483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.appbrand.appcache.a9 a9Var) {
        super(2);
        this.f75483d = a9Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.tencent.mm.plugin.appbrand.appcache.c9 c9Var = (com.tencent.mm.plugin.appbrand.appcache.c9) this.f75483d.f189736g;
        if (c9Var != null) {
            long j17 = longValue > longValue2 ? longValue2 : longValue;
            c9Var.d(this.f75483d.f(), new com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress(a06.d.b((((float) j17) / ((float) longValue2)) * 100.0f), j17, longValue2));
        }
        return jz5.f0.f302826a;
    }
}
