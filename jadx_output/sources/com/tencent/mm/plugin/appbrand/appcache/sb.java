package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class sb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.ac f75965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo f75966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(com.tencent.mm.plugin.appbrand.appcache.ac acVar, com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo) {
        super(1);
        this.f75965d = acVar;
        this.f75966e = modulePkgInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.x3 it = (com.tencent.mm.plugin.appbrand.appcache.x3) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.appcache.ac acVar = this.f75965d;
        it.f76040a = acVar.f75443b;
        it.f76041b = acVar.f75444c.pkgVersion();
        it.f76042c = this.f75966e.checksumMd5();
        return jz5.f0.f302826a;
    }
}
