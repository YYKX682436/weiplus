package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes4.dex */
public final class d1 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f76410e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.appusage.b.f76387r, "AppBrandAppLaunchUsernameDuplicateRecord2")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f76411d;

    public d1(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.appusage.b.f76387r, "AppBrandAppLaunchUsernameDuplicateRecord2", dm.s.f239750h);
        this.f76411d = k0Var;
    }

    public final boolean D0(java.lang.String str, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appusage.b bVar = new com.tencent.mm.plugin.appbrand.appusage.b();
        bVar.field_usernameHash = str.hashCode();
        bVar.field_username = str;
        boolean z17 = get(bVar, new java.lang.String[0]);
        bVar.field_updateTime = j17;
        return z17 ? update(bVar, new java.lang.String[0]) : insert(bVar);
    }

    public boolean y0(java.lang.String str) {
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appusage.b bVar = new com.tencent.mm.plugin.appbrand.appusage.b();
        bVar.field_usernameHash = str.hashCode();
        if (!get(bVar, "usernameHash") || (str2 = bVar.field_username) == null || !str2.equals(str)) {
            bVar = null;
        }
        return bVar != null && bVar.field_updateTime > 0;
    }

    public boolean z0(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appusage.b bVar = new com.tencent.mm.plugin.appbrand.appusage.b();
        bVar.field_username = str;
        bVar.field_usernameHash = str.hashCode();
        return super.delete(bVar, "usernameHash");
    }
}
