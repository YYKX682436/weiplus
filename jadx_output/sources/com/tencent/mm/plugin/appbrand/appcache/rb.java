package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class rb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.ac f75952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(com.tencent.mm.plugin.appbrand.appcache.ac acVar) {
        super(0);
        this.f75952d = acVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.appcache.y8 y8Var;
        com.tencent.mm.plugin.appbrand.appcache.x3 x3Var = (com.tencent.mm.plugin.appbrand.appcache.x3) this.f75952d.f75447f.get(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME);
        if (x3Var == null || (y8Var = x3Var.f76043d) == null) {
            return null;
        }
        return y8Var.j();
    }
}
