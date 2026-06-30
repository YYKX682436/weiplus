package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class k9 extends qj1.e implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b4 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g9 f157168f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g9(null);

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f157169g;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f157170e;

    static {
        java.lang.String m145250x3fdc6f77 = l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9.K, "AppBrandWxaPkgManifestRecordWithDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m145250x3fdc6f77, "getCreateSQLs(...)");
        f157169g = new java.lang.String[]{m145250x3fdc6f77};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9.K, "AppBrandWxaPkgManifestRecordWithDesc", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9.I);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f157170e = db6;
        db6.A("AppBrandWxaPkgManifestRecordForDevPlugin", "DROP TABLE IF EXISTS AppBrandWxaPkgManifestRecordForDevPlugin");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b4
    public dm.k0 E(java.lang.String str, int i17, java.lang.String str2, java.lang.String[] columns) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(columns, "columns");
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                java.lang.String[] strArr = columns.length == 0 ? null : (java.lang.String[]) java.util.Arrays.copyOf(columns, columns.length);
                java.lang.String[] KEYS = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9.f157245J;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KEYS, "KEYS");
                java.lang.String d07 = kz5.z.d0(KEYS, " AND ", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j9.f157150d, 30, null);
                java.lang.String[] strArr2 = {str, java.lang.String.valueOf(i17), str2};
                try {
                    synchronized (this) {
                        android.database.Cursor f17 = this.f157170e.f(android.database.sqlite.SQLiteQueryBuilder.buildQueryString(false, mo145255x88e404c3(), strArr, d07, null, null, null, null), strArr2, 2);
                        if (f17 != null) {
                            try {
                                if (f17.moveToFirst()) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9 o9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9();
                                    o9Var.mo9015xbf5d97fd(f17);
                                    o9Var.f67177x28d45f97 = str;
                                    o9Var.f67180x8ecd6328 = i17;
                                    o9Var.f33477x94cabbc4 = str2;
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
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxaPkgIndexedWithDescStorage", "select_keyBy_appId_versionType_versionDesc(appId:" + str + ", versionType:" + i17 + ", versionDesc:" + str2 + "), exception=" + e17);
                    return null;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxaPkgIndexedWithDescStorage", "select_keyBy_appId_versionType_versionDesc, invalid appId:" + str + " versionDesc:" + str2);
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b4
    public dm.k0 L(java.lang.String str, int i17, int i18, java.lang.String[] columns) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(columns, "columns");
        return f0(str, i18, (java.lang.String[]) java.util.Arrays.copyOf(columns, columns.length));
    }

    public boolean y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9 o9Var) {
        boolean z17;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g9.a(f157168f, o9Var)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o9Var);
        java.lang.String[] KEYS = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9.f157245J;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KEYS, "KEYS");
        java.lang.String d07 = kz5.z.d0(KEYS, " AND ", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h9.f157110d, 30, null);
        java.lang.String[] strArr = {o9Var.f67177x28d45f97, java.lang.String.valueOf(o9Var.f67180x8ecd6328), o9Var.f33477x94cabbc4};
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxaPkgIndexedWithDescStorage", "hasManifestRecord(" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g9.b(f157168f, o9Var, false, 1, null) + "), exception:" + e17);
        }
        synchronized (this) {
            android.database.Cursor f17 = this.f157170e.f("select count(*) from " + mo145255x88e404c3() + " where " + d07, strArr, 2);
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b4
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9 f0(java.lang.String str, int i17, java.lang.String... columns) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(columns, "columns");
        if (str == null || str.length() == 0) {
            return null;
        }
        java.lang.String[] strArr = columns.length == 0 ? null : (java.lang.String[]) java.util.Arrays.copyOf(columns, columns.length);
        java.lang.String d07 = kz5.z.d0(new java.lang.String[]{"appId", "debugType"}, " AND ", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i9.f157132d, 30, null);
        java.lang.String[] strArr2 = {str, java.lang.String.valueOf(i17)};
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxaPkgIndexedWithDescStorage", "select_keyBy_appId_debugType(appId:" + str + ", versionType:" + i17 + "), exception:" + e17);
        }
        synchronized (this) {
            android.database.Cursor f17 = this.f157170e.f(android.database.sqlite.SQLiteQueryBuilder.buildQueryString(false, mo145255x88e404c3(), strArr, d07, null, null, "rowid desc", "1"), strArr2, 2);
            if (f17 != null) {
                try {
                    if (f17.moveToFirst()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9 o9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9();
                        o9Var.mo9015xbf5d97fd(f17);
                        o9Var.f67177x28d45f97 = str;
                        o9Var.f67180x8ecd6328 = i17;
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
