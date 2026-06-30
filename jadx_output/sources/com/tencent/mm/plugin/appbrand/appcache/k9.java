package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class k9 extends qj1.e implements com.tencent.mm.plugin.appbrand.appcache.b4 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.g9 f75635f = new com.tencent.mm.plugin.appbrand.appcache.g9(null);

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f75636g;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f75637e;

    static {
        java.lang.String createSQLs = l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.appcache.o9.K, "AppBrandWxaPkgManifestRecordWithDesc");
        kotlin.jvm.internal.o.f(createSQLs, "getCreateSQLs(...)");
        f75636g = new java.lang.String[]{createSQLs};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.appbrand.appcache.o9.K, "AppBrandWxaPkgManifestRecordWithDesc", com.tencent.mm.plugin.appbrand.appcache.o9.I);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f75637e = db6;
        db6.A("AppBrandWxaPkgManifestRecordForDevPlugin", "DROP TABLE IF EXISTS AppBrandWxaPkgManifestRecordForDevPlugin");
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.b4
    public dm.k0 E(java.lang.String str, int i17, java.lang.String str2, java.lang.String[] columns) {
        kotlin.jvm.internal.o.g(columns, "columns");
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                java.lang.String[] strArr = columns.length == 0 ? null : (java.lang.String[]) java.util.Arrays.copyOf(columns, columns.length);
                java.lang.String[] KEYS = com.tencent.mm.plugin.appbrand.appcache.o9.f75712J;
                kotlin.jvm.internal.o.f(KEYS, "KEYS");
                java.lang.String d07 = kz5.z.d0(KEYS, " AND ", null, null, 0, null, com.tencent.mm.plugin.appbrand.appcache.j9.f75617d, 30, null);
                java.lang.String[] strArr2 = {str, java.lang.String.valueOf(i17), str2};
                try {
                    synchronized (this) {
                        android.database.Cursor f17 = this.f75637e.f(android.database.sqlite.SQLiteQueryBuilder.buildQueryString(false, getTableName(), strArr, d07, null, null, null, null), strArr2, 2);
                        if (f17 != null) {
                            try {
                                if (f17.moveToFirst()) {
                                    com.tencent.mm.plugin.appbrand.appcache.o9 o9Var = new com.tencent.mm.plugin.appbrand.appcache.o9();
                                    o9Var.convertFrom(f17);
                                    o9Var.field_appId = str;
                                    o9Var.field_debugType = i17;
                                    o9Var.field_versionDesc = str2;
                                    vz5.b.a(f17, null);
                                    return o9Var;
                                }
                                vz5.b.a(f17, null);
                            } finally {
                            }
                        }
                        return null;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("Luggage.WxaPkgIndexedWithDescStorage", "select_keyBy_appId_versionType_versionDesc(appId:" + str + ", versionType:" + i17 + ", versionDesc:" + str2 + "), exception=" + e17);
                    return null;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("Luggage.WxaPkgIndexedWithDescStorage", "select_keyBy_appId_versionType_versionDesc, invalid appId:" + str + " versionDesc:" + str2);
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.b4
    public dm.k0 L(java.lang.String str, int i17, int i18, java.lang.String[] columns) {
        kotlin.jvm.internal.o.g(columns, "columns");
        return f0(str, i18, (java.lang.String[]) java.util.Arrays.copyOf(columns, columns.length));
    }

    public boolean y0(com.tencent.mm.plugin.appbrand.appcache.o9 o9Var) {
        boolean z17;
        if (!com.tencent.mm.plugin.appbrand.appcache.g9.a(f75635f, o9Var)) {
            return false;
        }
        kotlin.jvm.internal.o.d(o9Var);
        java.lang.String[] KEYS = com.tencent.mm.plugin.appbrand.appcache.o9.f75712J;
        kotlin.jvm.internal.o.f(KEYS, "KEYS");
        java.lang.String d07 = kz5.z.d0(KEYS, " AND ", null, null, 0, null, com.tencent.mm.plugin.appbrand.appcache.h9.f75577d, 30, null);
        java.lang.String[] strArr = {o9Var.field_appId, java.lang.String.valueOf(o9Var.field_debugType), o9Var.field_versionDesc};
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Luggage.WxaPkgIndexedWithDescStorage", "hasManifestRecord(" + com.tencent.mm.plugin.appbrand.appcache.g9.b(f75635f, o9Var, false, 1, null) + "), exception:" + e17);
        }
        synchronized (this) {
            android.database.Cursor f17 = this.f75637e.f("select count(*) from " + getTableName() + " where " + d07, strArr, 2);
            if (f17 == null) {
                return false;
            }
            try {
                if (f17.moveToFirst()) {
                    if (f17.getInt(0) > 0) {
                        z17 = true;
                        vz5.b.a(f17, null);
                        return z17;
                    }
                }
                z17 = false;
                vz5.b.a(f17, null);
                return z17;
            } finally {
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.b4
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.appcache.o9 f0(java.lang.String str, int i17, java.lang.String... columns) {
        kotlin.jvm.internal.o.g(columns, "columns");
        if (str == null || str.length() == 0) {
            return null;
        }
        java.lang.String[] strArr = columns.length == 0 ? null : (java.lang.String[]) java.util.Arrays.copyOf(columns, columns.length);
        java.lang.String d07 = kz5.z.d0(new java.lang.String[]{"appId", "debugType"}, " AND ", null, null, 0, null, com.tencent.mm.plugin.appbrand.appcache.i9.f75599d, 30, null);
        java.lang.String[] strArr2 = {str, java.lang.String.valueOf(i17)};
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Luggage.WxaPkgIndexedWithDescStorage", "select_keyBy_appId_debugType(appId:" + str + ", versionType:" + i17 + "), exception:" + e17);
        }
        synchronized (this) {
            android.database.Cursor f17 = this.f75637e.f(android.database.sqlite.SQLiteQueryBuilder.buildQueryString(false, getTableName(), strArr, d07, null, null, "rowid desc", "1"), strArr2, 2);
            if (f17 != null) {
                try {
                    if (f17.moveToFirst()) {
                        com.tencent.mm.plugin.appbrand.appcache.o9 o9Var = new com.tencent.mm.plugin.appbrand.appcache.o9();
                        o9Var.convertFrom(f17);
                        o9Var.field_appId = str;
                        o9Var.field_debugType = i17;
                        vz5.b.a(f17, null);
                        return o9Var;
                    }
                    vz5.b.a(f17, null);
                } finally {
                }
            }
            return null;
        }
    }
}
