package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class x7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o6 f85413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.p6 f85414b;

    public x7(com.tencent.mm.plugin.appbrand.launching.o6 o6Var, com.tencent.mm.plugin.appbrand.launching.p6 p6Var) {
        this.f85413a = o6Var;
        this.f85414b = p6Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = this.f85413a.f84851d;
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.a6.a(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.PLUGIN_CODE);
        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str3);
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                str2 = "";
            } else {
                str2 = "$" + a17;
            }
            sb6.append(str2);
            str = sb6.toString();
        } else {
            str = null;
        }
        com.tencent.mm.plugin.appbrand.appcache.k6.b(str, this.f85414b.f84892a.pkgVersion());
        return null;
    }
}
