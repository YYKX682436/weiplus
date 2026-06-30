package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public final class h6 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f75568e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.appcache.l6.f75644u, "PluginCodeUsageLRURecord")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f75569d;

    public h6(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.appcache.l6.f75644u, "PluginCodeUsageLRURecord", dm.i9.f237646i);
        this.f75569d = k0Var;
    }

    public void y0(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.appcache.l6 l6Var = new com.tencent.mm.plugin.appbrand.appcache.l6();
        l6Var.field_appId = str;
        l6Var.field_version = i17;
        super.delete(l6Var, com.tencent.mm.plugin.appbrand.appcache.l6.f75643t);
    }
}
