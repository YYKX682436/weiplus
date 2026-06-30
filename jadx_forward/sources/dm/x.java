package dm;

/* loaded from: classes4.dex */
public class x extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f322466i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f322467m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f322468n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f322469o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322470p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322471q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322472r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322473s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f322474t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f322475u;

    /* renamed from: field_appId */
    public java.lang.String f69057x28d45f97;

    /* renamed from: field_appVersion */
    public int f69058x119cf7dc;

    /* renamed from: field_isDarkMode */
    public boolean f69059xf1a1cde8;

    /* renamed from: field_screenshotFilePath */
    public java.lang.String f69060xead0d2ac;

    /* renamed from: field_versionType */
    public int f69061x94d24c6d;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322476d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322477e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322478f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322479g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322480h = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandFakeNativeSplashScreenshot");
        f322466i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322467m = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS AppBrandFakeNativeSplashScreenshotAPPIDINDEX ON AppBrandFakeNativeSplashScreenshot(appId)"};
        f322468n = 93028124;
        f322469o = 689108018;
        f322470p = 1484112759;
        f322471q = 947558787;
        f322472r = -484584633;
        f322473s = 108705909;
        f322474t = m125673x3593deb(dm.x.class);
        f322475u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125673x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "versionType";
        e0Var.f398488d.put("versionType", "INTEGER default '0' ");
        e0Var.f398487c[2] = "appVersion";
        e0Var.f398488d.put("appVersion", "INTEGER default '0' ");
        e0Var.f398487c[3] = "isDarkMode";
        e0Var.f398488d.put("isDarkMode", "INTEGER default 'false' ");
        e0Var.f398487c[4] = "screenshotFilePath";
        e0Var.f398488d.put("screenshotFilePath", "TEXT");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " appId TEXT,  versionType INTEGER default '0' ,  appVersion INTEGER default '0' ,  isDarkMode INTEGER default 'false' ,  screenshotFilePath TEXT";
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
            if (f322468n == hashCode) {
                try {
                    this.f69057x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322469o == hashCode) {
                try {
                    this.f69061x94d24c6d = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322470p == hashCode) {
                try {
                    this.f69058x119cf7dc = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322471q == hashCode) {
                try {
                    this.f69059xf1a1cde8 = cursor.getInt(i17) != 0;
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322472r == hashCode) {
                try {
                    this.f69060xead0d2ac = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322473s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322476d) {
            contentValues.put("appId", this.f69057x28d45f97);
        }
        if (this.f322477e) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.f69061x94d24c6d));
        }
        if (this.f322478f) {
            contentValues.put("appVersion", java.lang.Integer.valueOf(this.f69058x119cf7dc));
        }
        if (this.f322479g) {
            if (this.f69059xf1a1cde8) {
                contentValues.put("isDarkMode", (java.lang.Integer) 1);
            } else {
                contentValues.put("isDarkMode", (java.lang.Integer) 0);
            }
        }
        if (this.f322480h) {
            contentValues.put("screenshotFilePath", this.f69060xead0d2ac);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandFakeNativeSplashScreenshot ( ");
        l75.e0 e0Var = f322474t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322467m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", "createTableSql %s", str2);
            k0Var.A("AppBrandFakeNativeSplashScreenshot", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandFakeNativeSplashScreenshot", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", "updateTableSql %s", str3);
            k0Var.A("AppBrandFakeNativeSplashScreenshot", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandFakeNativeSplashScreenshot", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322474t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322475u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322466i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322466i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f69057x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f322476d = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.f69061x94d24c6d = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f322477e = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.f69058x119cf7dc = contentValues.getAsInteger("appVersion").intValue();
            if (z17) {
                this.f322478f = true;
            }
        }
        if (contentValues.containsKey("isDarkMode")) {
            this.f69059xf1a1cde8 = contentValues.getAsInteger("isDarkMode").intValue() != 0;
            if (z17) {
                this.f322479g = true;
            }
        }
        if (contentValues.containsKey("screenshotFilePath")) {
            this.f69060xead0d2ac = contentValues.getAsString("screenshotFilePath");
            if (z17) {
                this.f322480h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
