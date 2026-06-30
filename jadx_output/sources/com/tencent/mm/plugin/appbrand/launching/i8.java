package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class i8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.r8 f84668d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(com.tencent.mm.plugin.appbrand.launching.r8 r8Var) {
        super(1);
        this.f84668d = r8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress progress = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress) obj;
        kotlin.jvm.internal.o.g(progress, "progress");
        com.tencent.mm.plugin.appbrand.launching.r8 r8Var = this.f84668d;
        if (!r8Var.f85116q) {
            ((com.tencent.mm.plugin.appbrand.launching.mb) r8Var).f84792s.k();
            r8Var.f85116q = true;
        }
        com.tencent.mm.plugin.appbrand.launching.mb mbVar = (com.tencent.mm.plugin.appbrand.launching.mb) r8Var;
        com.tencent.mm.plugin.appbrand.launching.lb lbVar = mbVar.f84792s;
        if (!lbVar.f84771q || !mbVar.f84791r.getAndSet(true)) {
            lbVar.j(progress.f75394d);
        }
        return jz5.f0.f302826a;
    }
}
