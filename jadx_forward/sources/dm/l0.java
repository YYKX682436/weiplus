package dm;

/* loaded from: classes7.dex */
public class l0 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f319682n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f319683o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319684p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319685q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319686r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319687s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319688t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319689u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319690v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319691w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f319692x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f319693y;

    /* renamed from: field_appId */
    public java.lang.String f67271x28d45f97;

    /* renamed from: field_hitCount */
    public int f67272xcd821ae1;

    /* renamed from: field_packageKey */
    public java.lang.String f67273xbae6789e;

    /* renamed from: field_packageType */
    public int f67274xa1ecfcdb;

    /* renamed from: field_reportId */
    public int f67275x44eeb14;

    /* renamed from: field_source */
    public int f67276x10639700;

    /* renamed from: field_version */
    public int f67277x8987ca93;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319694d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319695e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319696f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319697g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319698h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319699i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319700m = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandWxaPkgPreDownloadStatistics2");
        f319682n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319683o = new java.lang.String[0];
        f319684p = 93028124;
        f319685q = 351608024;
        f319686r = 908960928;
        f319687s = 29312057;
        f319688t = -896505829;
        f319689u = -1346432708;
        f319690v = -427040401;
        f319691w = 108705909;
        f319692x = m125186x3593deb(dm.l0.class);
        f319693y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125186x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "version";
        e0Var.f398488d.put("version", "INTEGER");
        e0Var.f398487c[2] = "packageType";
        e0Var.f398488d.put("packageType", "INTEGER");
        e0Var.f398487c[3] = "packageKey";
        e0Var.f398488d.put("packageKey", "TEXT");
        e0Var.f398487c[4] = ya.b.f77502x92235c1b;
        e0Var.f398488d.put(ya.b.f77502x92235c1b, "INTEGER default '0' ");
        e0Var.f398487c[5] = "hitCount";
        e0Var.f398488d.put("hitCount", "INTEGER default '0' ");
        e0Var.f398487c[6] = "reportId";
        e0Var.f398488d.put("reportId", "INTEGER default '0' ");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " appId TEXT,  version INTEGER,  packageType INTEGER,  packageKey TEXT,  source INTEGER default '0' ,  hitCount INTEGER default '0' ,  reportId INTEGER default '0' ";
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
            if (f319684p == hashCode) {
                try {
                    this.f67271x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319685q == hashCode) {
                try {
                    this.f67277x8987ca93 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319686r == hashCode) {
                try {
                    this.f67274xa1ecfcdb = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319687s == hashCode) {
                try {
                    this.f67273xbae6789e = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319688t == hashCode) {
                try {
                    this.f67276x10639700 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319689u == hashCode) {
                try {
                    this.f67272xcd821ae1 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319690v == hashCode) {
                try {
                    this.f67275x44eeb14 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319691w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319694d) {
            contentValues.put("appId", this.f67271x28d45f97);
        }
        if (this.f319695e) {
            contentValues.put("version", java.lang.Integer.valueOf(this.f67277x8987ca93));
        }
        if (this.f319696f) {
            contentValues.put("packageType", java.lang.Integer.valueOf(this.f67274xa1ecfcdb));
        }
        if (this.f319697g) {
            contentValues.put("packageKey", this.f67273xbae6789e);
        }
        if (this.f319698h) {
            contentValues.put(ya.b.f77502x92235c1b, java.lang.Integer.valueOf(this.f67276x10639700));
        }
        if (this.f319699i) {
            contentValues.put("hitCount", java.lang.Integer.valueOf(this.f67272xcd821ae1));
        }
        if (this.f319700m) {
            contentValues.put("reportId", java.lang.Integer.valueOf(this.f67275x44eeb14));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandWxaPkgPreDownloadStatistics2 ( ");
        l75.e0 e0Var = f319692x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319683o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", "createTableSql %s", str2);
            k0Var.A("AppBrandWxaPkgPreDownloadStatistics2", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandWxaPkgPreDownloadStatistics2", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", "updateTableSql %s", str3);
            k0Var.A("AppBrandWxaPkgPreDownloadStatistics2", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandWxaPkgPreDownloadStatistics2", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319692x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319693y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319682n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319682n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f67271x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f319694d = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.f67277x8987ca93 = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f319695e = true;
            }
        }
        if (contentValues.containsKey("packageType")) {
            this.f67274xa1ecfcdb = contentValues.getAsInteger("packageType").intValue();
            if (z17) {
                this.f319696f = true;
            }
        }
        if (contentValues.containsKey("packageKey")) {
            this.f67273xbae6789e = contentValues.getAsString("packageKey");
            if (z17) {
                this.f319697g = true;
            }
        }
        if (contentValues.containsKey(ya.b.f77502x92235c1b)) {
            this.f67276x10639700 = contentValues.getAsInteger(ya.b.f77502x92235c1b).intValue();
            if (z17) {
                this.f319698h = true;
            }
        }
        if (contentValues.containsKey("hitCount")) {
            this.f67272xcd821ae1 = contentValues.getAsInteger("hitCount").intValue();
            if (z17) {
                this.f319699i = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.f67275x44eeb14 = contentValues.getAsInteger("reportId").intValue();
            if (z17) {
                this.f319700m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
