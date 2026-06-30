package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class o extends l75.n0 implements com.tencent.mm.plugin.appbrand.appstorage.q1 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f76284g = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.appstorage.k.f76244t, "AppBrandKVData"), "DROP TABLE IF EXISTS AppBrandStorageKVData;"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f76285d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f76286e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f76287f;

    public o(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.appstorage.k.f76244t, "AppBrandKVData", null);
        this.f76286e = new com.tencent.mm.plugin.appbrand.appstorage.m(this);
        this.f76287f = new com.tencent.mm.plugin.appbrand.appstorage.n(this);
        this.f76285d = k0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public java.util.List G(int i17, java.lang.String str, java.util.List list) {
        return new java.util.ArrayList();
    }

    public final int J0(int i17, java.lang.String str, int i18) {
        int max = java.lang.Math.max(0, W0(i17, str) + i18);
        com.tencent.mm.plugin.appbrand.appstorage.k kVar = new com.tencent.mm.plugin.appbrand.appstorage.k();
        kVar.field_key = L0(i17, str, "@@@TOTAL@DATA@SIZE@@@");
        kVar.field_data = max + "";
        super.replace(kVar);
        return max;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public int K(java.lang.String str) {
        int i17 = 0;
        for (int i18 : com.tencent.mm.plugin.appbrand.appstorage.a2.f(str, this.f76286e, this.f76287f)) {
            i17 += W0(i18, str);
        }
        return i17;
    }

    public final java.lang.String L0(int i17, java.lang.String appId, java.lang.String key) {
        int i18 = com.tencent.mm.plugin.appbrand.appstorage.a2.f76137a;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(key, "key");
        return com.tencent.mm.plugin.appbrand.appstorage.a2.e(i17, appId, key, "++");
    }

    public final int P0(java.lang.String str) {
        android.database.Cursor D = this.f76285d.D("AppBrandKVData", new java.lang.String[]{"size"}, "key = ?", new java.lang.String[]{str}, null, null, null, 2);
        if (!D.moveToFirst()) {
            D.close();
            return 0;
        }
        int i17 = D.getInt(0);
        D.close();
        return i17;
    }

    public final int W0(int i17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appstorage.k kVar = new com.tencent.mm.plugin.appbrand.appstorage.k();
        kVar.field_key = L0(i17, str, "@@@TOTAL@DATA@SIZE@@@");
        if (super.get(kVar, new java.lang.String[0])) {
            return com.tencent.mm.sdk.platformtools.t8.P(kVar.field_data, 0);
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public void k(int i17, java.lang.String str) {
        java.lang.String str2;
        if (i17 == 0) {
            str2 = str + "__";
        } else {
            str2 = i17 + "__" + str + "__";
        }
        com.tencent.mm.plugin.appbrand.appstorage.a2.h(str, i17, this.f76286e, this.f76287f);
        this.f76285d.delete("AppBrandKVData", java.lang.String.format("%s like ? escape ? OR %s=?", "key", "key"), new java.lang.String[]{str2.replace("_", "\\_") + "%", "\\", L0(i17, str, "@@@TOTAL@DATA@SIZE@@@")});
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public com.tencent.mm.plugin.appbrand.appstorage.o1 l(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int b17 = com.tencent.mm.plugin.appbrand.appstorage.a2.b(str2, str3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return com.tencent.mm.plugin.appbrand.appstorage.o1.MISSING_PARAMS;
        }
        java.lang.String e17 = com.tencent.mm.plugin.appbrand.appstorage.a2.e(i17, str, str2, "__");
        int P0 = b17 - P0(e17);
        if (W0(i17, str) + P0 >= com.tencent.mm.plugin.appbrand.appstorage.a2.g(i17, str)) {
            return com.tencent.mm.plugin.appbrand.appstorage.o1.QUOTA_REACHED;
        }
        com.tencent.mm.plugin.appbrand.appstorage.k kVar = new com.tencent.mm.plugin.appbrand.appstorage.k();
        kVar.field_key = e17;
        kVar.field_data = str3;
        kVar.field_dataType = str4;
        kVar.field_size = b17;
        com.tencent.mm.plugin.appbrand.appstorage.l lVar = new com.tencent.mm.plugin.appbrand.appstorage.l(this, kVar, str, i17, P0);
        try {
            return (com.tencent.mm.plugin.appbrand.appstorage.o1) lVar.invoke();
        } catch (android.database.sqlite.SQLiteException e18) {
            java.lang.String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            if (!message.contains("no such table")) {
                throw e18;
            }
            com.tencent.mars.xlog.Log.e("AppBrandKVStorage", "set storageId[%d] appId[%s] key[%s], get exception[%s] try create table", java.lang.Integer.valueOf(i17), str, str2, e18);
            try {
                l75.e0 e0Var = com.tencent.mm.plugin.appbrand.appstorage.k.f76244t;
                java.lang.String tableName = getTableName();
                java.lang.String tableName2 = getTableName();
                l75.k0 k0Var = this.f76285d;
                for (java.lang.String str5 : l75.n0.getUpdateSQLs(e0Var, tableName2, k0Var)) {
                    if (!k0Var.A(tableName, str5)) {
                        com.tencent.mars.xlog.Log.e("AppBrandKVStorage", "updateColumnSQLs table failed %s, sql %s", tableName, str5);
                    }
                }
                return (com.tencent.mm.plugin.appbrand.appstorage.o1) lVar.invoke();
            } catch (android.database.sqlite.SQLiteException e19) {
                java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "set storageId[%d] appId[%s] key[%s], get exception[%s] after retry", java.lang.Integer.valueOf(i17), str, str2, e18);
                com.tencent.mars.xlog.Log.e("AppBrandKVStorage", format);
                throw new android.database.sqlite.SQLiteException(format, e19);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public java.lang.Object[] o(int i17, java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return new java.lang.Object[]{com.tencent.mm.plugin.appbrand.appstorage.o1.MISSING_PARAMS};
        }
        com.tencent.mm.plugin.appbrand.appstorage.k kVar = new com.tencent.mm.plugin.appbrand.appstorage.k();
        kVar.field_key = com.tencent.mm.plugin.appbrand.appstorage.a2.e(i17, str, str2, "__");
        try {
            return super.get(kVar, new java.lang.String[0]) ? new java.lang.Object[]{com.tencent.mm.plugin.appbrand.appstorage.o1.NONE, kVar.field_data, kVar.field_dataType} : com.tencent.mm.plugin.appbrand.appstorage.a2.f76138b;
        } catch (android.database.sqlite.SQLiteException e17) {
            java.lang.String message = e17.getMessage();
            if (message == null) {
                message = "";
            }
            if (message.contains("no such table")) {
                com.tencent.mars.xlog.Log.e("AppBrandKVStorage", "get storageId[%d] appId[%s] key[%s], no such table, return RET_GET_NO_SUCH_KEY", java.lang.Integer.valueOf(i17), str, str2);
                return com.tencent.mm.plugin.appbrand.appstorage.a2.f76138b;
            }
            if (e17.getClass().getName().endsWith("CursorWindowAllocationException")) {
                return new java.lang.Object[]{com.tencent.mm.plugin.appbrand.appstorage.o1.MEMORY_ISSUE};
            }
            throw e17;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public com.tencent.mm.plugin.appbrand.appstorage.o1 q(int i17, java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return com.tencent.mm.plugin.appbrand.appstorage.o1.MISSING_PARAMS;
        }
        java.lang.String e17 = com.tencent.mm.plugin.appbrand.appstorage.a2.e(i17, str, str2, "__");
        int J0 = J0(i17, str, -P0(e17));
        com.tencent.mm.plugin.appbrand.appstorage.k kVar = new com.tencent.mm.plugin.appbrand.appstorage.k();
        kVar.field_key = e17;
        super.delete(kVar, new java.lang.String[0]);
        if (J0 <= 0) {
            com.tencent.mm.plugin.appbrand.appstorage.a2.h(str, i17, this.f76286e, this.f76287f);
        }
        return com.tencent.mm.plugin.appbrand.appstorage.o1.NONE;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public java.lang.Object[] t(int i17, java.lang.String str) {
        java.lang.String str2;
        if (i17 == 0) {
            str2 = str + "__";
        } else {
            str2 = i17 + "__" + str + "__";
        }
        android.database.Cursor D = this.f76285d.D("AppBrandKVData", new java.lang.String[]{"key"}, "key like ? escape ?", new java.lang.String[]{str2.replace("_", "\\_") + "%", "\\"}, null, null, null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (D.moveToNext()) {
            arrayList.add(D.getString(0).replace(str2, ""));
        }
        D.close();
        return new java.lang.Object[]{arrayList, java.lang.Integer.valueOf(W0(i17, str)), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.appstorage.a2.g(i17, str))};
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public com.tencent.mm.plugin.appbrand.appstorage.o1 z(int i17, java.lang.String str, java.util.List list) {
        return com.tencent.mm.plugin.appbrand.appstorage.o1.UNKNOWN;
    }
}
