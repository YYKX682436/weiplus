package dm;

/* loaded from: classes4.dex */
public class r9 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f321223i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f321224m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f321225n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321226o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321227p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321228q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321229r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321230s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f321231t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f321232u;

    /* renamed from: field_appId */
    public java.lang.String f68192x28d45f97;

    /* renamed from: field_appVersion */
    public int f68193x119cf7dc;

    /* renamed from: field_decryptKey */
    public java.lang.String f68194x344c79f7;

    /* renamed from: field_pkgMd5 */
    public java.lang.String f68195xb05c6f7;

    /* renamed from: field_reportId */
    public int f68196x44eeb14;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321233d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321234e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321235f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321236g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321237h = true;

    static {
        p75.n0 n0Var = new p75.n0("PushWxaPkgDecryptKeyTable");
        f321223i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321224m = new java.lang.String[0];
        f321225n = 93028124;
        f321226o = 1484112759;
        f321227p = 2066040210;
        f321228q = -986540014;
        f321229r = -427040401;
        f321230s = 108705909;
        f321231t = m125454x3593deb(dm.r9.class);
        f321232u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125454x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "appVersion";
        e0Var.f398488d.put("appVersion", "INTEGER");
        e0Var.f398487c[2] = "decryptKey";
        e0Var.f398488d.put("decryptKey", "TEXT");
        e0Var.f398487c[3] = "pkgMd5";
        e0Var.f398488d.put("pkgMd5", "TEXT");
        e0Var.f398487c[4] = "reportId";
        e0Var.f398488d.put("reportId", "INTEGER");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " appId TEXT,  appVersion INTEGER,  decryptKey TEXT,  pkgMd5 TEXT,  reportId INTEGER";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        return e0Var;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        java.lang.String[] columnNames = cursor.getColumnNames();
        if (columnNames == null) {
            return;
        }
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            int hashCode = columnNames[i17].hashCode();
            if (f321225n == hashCode) {
                try {
                    this.f68192x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321226o == hashCode) {
                try {
                    this.f68193x119cf7dc = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321227p == hashCode) {
                try {
                    this.f68194x344c79f7 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321228q == hashCode) {
                try {
                    this.f68195xb05c6f7 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321229r == hashCode) {
                try {
                    this.f68196x44eeb14 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321230s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321233d) {
            contentValues.put("appId", this.f68192x28d45f97);
        }
        if (this.f321234e) {
            contentValues.put("appVersion", java.lang.Integer.valueOf(this.f68193x119cf7dc));
        }
        if (this.f321235f) {
            contentValues.put("decryptKey", this.f68194x344c79f7);
        }
        if (this.f321236g) {
            contentValues.put("pkgMd5", this.f68195xb05c6f7);
        }
        if (this.f321237h) {
            contentValues.put("reportId", java.lang.Integer.valueOf(this.f68196x44eeb14));
        }
        long j17 = this.f72763xa3c65b86;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    /* renamed from: createMyTable */
    public void mo9764xdf360ce6(l75.k0 k0Var) {
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PushWxaPkgDecryptKeyTable ( ");
        l75.e0 e0Var = f321231t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321224m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", "createTableSql %s", str2);
            k0Var.A("PushWxaPkgDecryptKeyTable", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "PushWxaPkgDecryptKeyTable", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", "updateTableSql %s", str3);
            k0Var.A("PushWxaPkgDecryptKeyTable", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePushWxaPkgDecryptKeyTable", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321231t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321232u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321223i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321223i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f68192x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f321233d = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.f68193x119cf7dc = contentValues.getAsInteger("appVersion").intValue();
            if (z17) {
                this.f321234e = true;
            }
        }
        if (contentValues.containsKey("decryptKey")) {
            this.f68194x344c79f7 = contentValues.getAsString("decryptKey");
            if (z17) {
                this.f321235f = true;
            }
        }
        if (contentValues.containsKey("pkgMd5")) {
            this.f68195xb05c6f7 = contentValues.getAsString("pkgMd5");
            if (z17) {
                this.f321236g = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.f68196x44eeb14 = contentValues.getAsInteger("reportId").intValue();
            if (z17) {
                this.f321237h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
