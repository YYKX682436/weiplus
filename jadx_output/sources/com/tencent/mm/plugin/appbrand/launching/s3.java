package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o3 f85136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o6 f85137e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.tencent.mm.plugin.appbrand.launching.o3 o3Var, com.tencent.mm.plugin.appbrand.launching.o6 o6Var) {
        super(1);
        this.f85136d = o3Var;
        this.f85137e = o6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress progress = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress) obj;
        kotlin.jvm.internal.o.g(progress, "progress");
        com.tencent.mm.plugin.appbrand.launching.o6 request = this.f85137e;
        kotlin.jvm.internal.o.f(request, "$request");
        this.f85136d.a(request, progress);
        return jz5.f0.f302826a;
    }
}
