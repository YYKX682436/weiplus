package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public final class o extends qj1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f75692f = com.tencent.mm.plugin.appbrand.appcache.m.f75662s;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f75693e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.appbrand.appcache.m.f75663t, "AppBrandTestCodeVersionMarkTable", dm.j0.f237720h);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f75693e = db6;
    }

    public final void D0(java.lang.String appId, int i17, java.lang.String versionMd5) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(versionMd5, "versionMd5");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTestCodeVersionMarkStorage", "setVersion appId:" + appId + " versionType:" + i17 + " versionMd5:" + versionMd5);
        com.tencent.mm.plugin.appbrand.appcache.m mVar = new com.tencent.mm.plugin.appbrand.appcache.m();
        mVar.field_appId = appId;
        mVar.field_versionType = i17;
        com.tencent.mm.plugin.appbrand.appcache.n nVar = new com.tencent.mm.plugin.appbrand.appcache.n(mVar, versionMd5);
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        l75.k0 k0Var = this.f75693e;
        long F = k0Var.F(valueOf);
        if (get(mVar, new java.lang.String[0])) {
            nVar.invoke(mVar);
            super.update(mVar, new java.lang.String[0]);
        } else {
            nVar.invoke(mVar);
            super.insert(mVar);
        }
        k0Var.w(java.lang.Long.valueOf(F));
    }

    public final void y0(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTestCodeVersionMarkStorage", "clearVersion appId:" + appId + " versionType:" + i17);
        com.tencent.mm.plugin.appbrand.appcache.m mVar = new com.tencent.mm.plugin.appbrand.appcache.m();
        mVar.field_appId = appId;
        mVar.field_versionType = i17;
        super.delete(mVar, new java.lang.String[0]);
    }

    public final java.lang.String z0(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.plugin.appbrand.appcache.m mVar = new com.tencent.mm.plugin.appbrand.appcache.m();
        mVar.field_appId = appId;
        mVar.field_versionType = i17;
        java.lang.String str = get(mVar, new java.lang.String[0]) ? mVar.field_versionMd5 : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTestCodeVersionMarkStorage", "getVersion for appId:" + appId + ", versionType:" + i17 + ", return " + str);
        return str;
    }
}
