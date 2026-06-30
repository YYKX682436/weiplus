package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class a7 extends com.tencent.mm.plugin.appbrand.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f74894b;

    public a7(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f74894b = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public java.lang.String b() {
        return "preloadWcWssNativeLibraries";
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void c() {
        if (com.tencent.mm.plugin.appbrand.networking.j0.f86092a.a()) {
            sk1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_wxapkg_md5_check_use_weapp_core, 1) == 1) {
            sk1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo.f75397m = true;
        }
        com.tencent.mm.plugin.appbrand.launching.g5 g5Var = com.tencent.mm.plugin.appbrand.launching.g5.f84619a;
        if (com.tencent.mm.plugin.appbrand.launching.g5.f84620b.a()) {
            sk1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel.B1 = true;
        }
        d();
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public boolean e() {
        return true;
    }
}
