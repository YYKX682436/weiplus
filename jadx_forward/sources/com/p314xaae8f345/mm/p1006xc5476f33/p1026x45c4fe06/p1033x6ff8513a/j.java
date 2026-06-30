package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes4.dex */
public class j extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f157737e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i.f157728p, "AppBrandIdentifierInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f157738d;

    public j(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i.f157728p, "AppBrandIdentifierInfo", null);
        this.f157738d = k0Var;
    }

    public java.lang.String D0(java.lang.String str) {
        android.database.Cursor E = this.f157738d.E("AppBrandIdentifierInfo", new java.lang.String[]{dm.i4.f66875xa013b0d5}, "appId=?", new java.lang.String[]{str}, null, null, null);
        java.lang.String string = (E == null || !E.moveToFirst()) ? "" : E.getString(0);
        if (E != null) {
            E.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandIdentifierInfoStorage", "queryAppId: appId = [%s], userName = [%s]", str, string);
        return string;
    }

    public boolean y0(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return false;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.i();
            iVar.f69164x28d45f97 = str;
            iVar.f69165xdec927b = str2;
            return mo880xb970c2b9(iVar);
        } finally {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandIdentifierInfoStorage", "addIdentifierInfo: appId = [%s], userName = [%s], cost:%d", str, str2, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public java.lang.String z0(java.lang.String str) {
        android.database.Cursor E = this.f157738d.E("AppBrandIdentifierInfo", new java.lang.String[]{"appId"}, "username=?", new java.lang.String[]{str}, null, null, null);
        java.lang.String string = (E == null || !E.moveToFirst()) ? "" : E.getString(0);
        if (E != null) {
            E.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandIdentifierInfoStorage", "queryAppId: appId = [%s], userName = [%s]", string, str);
        return string;
    }
}
