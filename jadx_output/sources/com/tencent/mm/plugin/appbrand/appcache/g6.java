package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public final class g6 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f75552e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.appcache.f6.f75527u, "PkgUsageLRURecord")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f75553d;

    public g6(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.appcache.f6.f75527u, "PkgUsageLRURecord", dm.h9.f237426i);
        this.f75553d = k0Var;
    }

    public void y0(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.appcache.f6 f6Var = new com.tencent.mm.plugin.appbrand.appcache.f6();
        f6Var.field_appId = str;
        f6Var.field_type = i17;
        super.delete(f6Var, com.tencent.mm.plugin.appbrand.appcache.f6.f75526t);
    }
}
