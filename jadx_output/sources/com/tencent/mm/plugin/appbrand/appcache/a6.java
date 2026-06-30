package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class a6 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f75428d = {com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE, com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE, com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.PLUGIN_CODE};

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f75429a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f75430b;

    /* renamed from: c, reason: collision with root package name */
    public volatile java.lang.String f75431c;

    public a6(java.lang.String str, java.lang.String str2) {
        this.f75429a = str;
        this.f75430b = a(str2);
    }

    public static java.lang.String a(java.lang.String str) {
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || yo.a.b(f75428d, str)) ? str : com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
    }

    public java.lang.String toString() {
        java.lang.String str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f75431c)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f75429a);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f75430b)) {
                str = "";
            } else {
                str = "$" + this.f75430b;
            }
            sb6.append(str);
            this.f75431c = sb6.toString();
        }
        return this.f75431c;
    }

    public a6(java.lang.String str, java.lang.String str2, int i17) {
        if (i17 == 0) {
            this.f75430b = "";
        } else if (i17 == 6) {
            this.f75430b = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.PLUGIN_CODE;
        } else if (i17 == 12) {
            this.f75430b = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE;
        } else if (i17 == 13) {
            this.f75430b = a(str2) + "$__WITHOUT_PLUGINCODE__";
        } else if (i17 == 22) {
            this.f75430b = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE;
        } else if (i17 != 23) {
            this.f75430b = a(str2);
        } else {
            this.f75430b = a(str2) + "$__WITHOUT_MULTI_PLUGINCODE__";
        }
        this.f75429a = str;
    }

    public a6(java.lang.String str) {
        this.f75429a = str;
        this.f75430b = null;
    }
}
