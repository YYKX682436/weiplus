package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public final class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f80995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f80996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f80997c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.fakenative.v f80998d;

    public u(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.fakenative.v vVar) {
        this.f80995a = o6Var;
        this.f80996b = c0Var;
        this.f80997c = i17;
        this.f80998d = vVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        gk1.c cVar = gk1.g.f272463f;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = this.f80995a.u0();
        kotlin.jvm.internal.o.f(u07, "getInitConfig(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(u07.f77278d);
        sb6.append('_');
        sb6.append(u07.f77281g);
        sb6.append('_');
        sb6.append(u07.L);
        sb6.append('_');
        sb6.append(com.tencent.mm.ui.bk.C() ? "dark" : "normal");
        sb6.append('_');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(".png");
        java.lang.String sb7 = sb6.toString();
        java.lang.String appId = u07.f77278d;
        kotlin.jvm.internal.o.f(appId, "appId");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(cVar.b(appId), sb7);
        com.tencent.mm.vfs.r6 s17 = r6Var.s();
        if (s17 != null) {
            s17.J();
        }
        java.lang.String r6Var2 = r6Var.toString();
        kotlin.jvm.internal.o.f(r6Var2, "toString(...)");
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f80996b;
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f80995a;
        int i17 = this.f80997c;
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.v vVar = this.f80998d;
        kotlin.jvm.internal.o.d(bitmap);
        com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, r6Var2, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSaveRuntimeSnapshot", "saveBitmap ok, appId=" + c0Var.getAppId() + ", path=" + r6Var2);
        gk1.b bVar = new gk1.b();
        bVar.field_appId = o6Var.f74803n;
        bVar.field_versionType = o6Var.f74805p.f77281g;
        bVar.field_appVersion = o6Var.d2();
        bVar.field_isDarkMode = com.tencent.mm.ui.bk.C();
        bVar.field_screenshotFilePath = r6Var2;
        uk0.a.b(bVar, com.tencent.mm.plugin.appbrand.jsapi.fakenative.s.f80990d, new com.tencent.mm.plugin.appbrand.jsapi.fakenative.t(c0Var, i17, vVar, r6Var2));
        return jz5.f0.f302826a;
    }
}
