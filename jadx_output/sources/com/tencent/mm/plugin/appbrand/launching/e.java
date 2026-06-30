package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class e implements com.tencent.mm.plugin.appbrand.launching.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f84578a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84579b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84580c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f84581d;

    public e(java.lang.String appId, boolean z17, boolean z18, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo pkgWrappingInfo) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pkgWrappingInfo, "pkgWrappingInfo");
        this.f84578a = appId;
        this.f84579b = z17;
        this.f84580c = z18;
        this.f84581d = pkgWrappingInfo;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.f
    public java.util.List a() {
        return this.f84581d.f75402g;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.f
    public java.lang.String b(java.lang.String fileEntryPath) {
        com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo;
        kotlin.jvm.internal.o.g(fileEntryPath, "fileEntryPath");
        java.util.LinkedList linkedList = this.f84581d.f75402g;
        if (linkedList == null || linkedList.isEmpty()) {
            modulePkgInfo = this.f84581d;
        } else {
            java.util.LinkedList moduleList = this.f84581d.f75402g;
            kotlin.jvm.internal.o.f(moduleList, "moduleList");
            modulePkgInfo = (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) ph1.i0.a(moduleList, fileEntryPath, "AheadRequestConfigStringReader", true);
            if (modulePkgInfo == null) {
                modulePkgInfo = this.f84581d;
            }
        }
        java.lang.String str = modulePkgInfo != null ? modulePkgInfo.pkgPath : null;
        if ((str == null || str.length() == 0) || !com.tencent.mm.vfs.w6.j(str)) {
            return null;
        }
        return com.tencent.mm.plugin.appbrand.appcache.y8.l(str, fileEntryPath);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.f
    public boolean c() {
        return this.f84580c;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.f
    public java.lang.String getAppId() {
        return this.f84578a;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.f
    public boolean k() {
        return this.f84579b;
    }
}
