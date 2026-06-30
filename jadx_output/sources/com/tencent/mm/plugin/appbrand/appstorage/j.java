package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes4.dex */
public class j extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f76204e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.appstorage.i.f76195p, "AppBrandIdentifierInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f76205d;

    public j(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.appstorage.i.f76195p, "AppBrandIdentifierInfo", null);
        this.f76205d = k0Var;
    }

    public java.lang.String D0(java.lang.String str) {
        android.database.Cursor E = this.f76205d.E("AppBrandIdentifierInfo", new java.lang.String[]{dm.i4.COL_USERNAME}, "appId=?", new java.lang.String[]{str}, null, null, null);
        java.lang.String string = (E == null || !E.moveToFirst()) ? "" : E.getString(0);
        if (E != null) {
            E.close();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandIdentifierInfoStorage", "queryAppId: appId = [%s], userName = [%s]", str, string);
        return string;
    }

    public boolean y0(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return false;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            com.tencent.mm.plugin.appbrand.appstorage.i iVar = new com.tencent.mm.plugin.appbrand.appstorage.i();
            iVar.field_appId = str;
            iVar.field_username = str2;
            return insert(iVar);
        } finally {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandIdentifierInfoStorage", "addIdentifierInfo: appId = [%s], userName = [%s], cost:%d", str, str2, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public java.lang.String z0(java.lang.String str) {
        android.database.Cursor E = this.f76205d.E("AppBrandIdentifierInfo", new java.lang.String[]{"appId"}, "username=?", new java.lang.String[]{str}, null, null, null);
        java.lang.String string = (E == null || !E.moveToFirst()) ? "" : E.getString(0);
        if (E != null) {
            E.close();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandIdentifierInfoStorage", "queryAppId: appId = [%s], userName = [%s]", string, str);
        return string;
    }
}
