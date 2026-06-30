package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.m f75681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.appbrand.appcache.m mVar, java.lang.String str) {
        super(1);
        this.f75681d = mVar;
        this.f75682e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.m it = (com.tencent.mm.plugin.appbrand.appcache.m) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f75681d.field_versionMd5 = this.f75682e;
        return jz5.f0.f302826a;
    }
}
