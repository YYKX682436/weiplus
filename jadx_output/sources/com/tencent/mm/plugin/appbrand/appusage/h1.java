package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes4.dex */
public final class h1 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f76452e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.appusage.f1.f76430s, "AppBrandLocalUsageRecord")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f76453d;

    public h1(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.appusage.f1.f76430s, "AppBrandLocalUsageRecord", dm.b0.f235781h);
        this.f76453d = k0Var;
    }

    public boolean y0(java.lang.String str, int i17, com.tencent.mm.plugin.appbrand.appusage.g1 g1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocalUsageStorage", "addUsage, username %s, type %d, scene %s", str, java.lang.Integer.valueOf(i17), g1Var);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appusage.f1 f1Var = new com.tencent.mm.plugin.appbrand.appusage.f1();
        f1Var.field_username = str;
        f1Var.field_versionType = i17;
        java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.appusage.f1.f76429r;
        if (super.get(f1Var, strArr)) {
            f1Var.field_updateTime = com.tencent.mm.sdk.platformtools.t8.i1();
            boolean update = super.update(f1Var.systemRowid, f1Var, false);
            if (update) {
                doNotify("single", 3, null);
            }
            return update;
        }
        f1Var.field_updateTime = com.tencent.mm.sdk.platformtools.t8.i1();
        super.insertNotify(f1Var, false);
        boolean z17 = super.get(f1Var, strArr);
        if (z17) {
            this.f76453d.A("AppBrandLocalUsageRecord", "delete from AppBrandLocalUsageRecord where rowid not in ( select rowid from AppBrandLocalUsageRecord order by updateTime desc  limit " + com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77224v + " offset 0)");
            doNotify("single", 2, null);
        }
        return z17;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean delete(com.tencent.mm.plugin.appbrand.appusage.f1 f1Var, boolean z17, java.lang.String... strArr) {
        if (z17) {
            return super.delete(f1Var, z17, strArr);
        }
        if (!get(f1Var, strArr)) {
            return false;
        }
        super.delete(f1Var, z17, strArr);
        return !get(f1Var, strArr);
    }
}
