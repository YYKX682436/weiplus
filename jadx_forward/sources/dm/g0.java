package dm;

/* loaded from: classes4.dex */
public class g0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f318537g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f318538h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f318539i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318540m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318541n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318542o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f318543p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f318544q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318545d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318546e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318547f = true;

    /* renamed from: field_appId */
    public java.lang.String f66577x28d45f97;

    /* renamed from: field_appVersion */
    public int f66578x119cf7dc;

    /* renamed from: field_isSeparatedPluginsUsed */
    public int f66579x1dbcfc4b;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandSeparatedPluginsCompatMarkTable");
        f318537g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318538h = new java.lang.String[0];
        f318539i = 93028124;
        f318540m = 1484112759;
        f318541n = 806500198;
        f318542o = 108705909;
        f318543p = m124993x3593deb(dm.g0.class);
        f318544q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124993x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "appVersion";
        e0Var.f398488d.put("appVersion", "INTEGER");
        e0Var.f398487c[2] = "isSeparatedPluginsUsed";
        e0Var.f398488d.put("isSeparatedPluginsUsed", "INTEGER");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " appId TEXT,  appVersion INTEGER,  isSeparatedPluginsUsed INTEGER";
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
            if (f318539i == hashCode) {
                try {
                    this.f66577x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318540m == hashCode) {
                try {
                    this.f66578x119cf7dc = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318541n == hashCode) {
                try {
                    this.f66579x1dbcfc4b = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318542o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318545d) {
            contentValues.put("appId", this.f66577x28d45f97);
        }
        if (this.f318546e) {
            contentValues.put("appVersion", java.lang.Integer.valueOf(this.f66578x119cf7dc));
        }
        if (this.f318547f) {
            contentValues.put("isSeparatedPluginsUsed", java.lang.Integer.valueOf(this.f66579x1dbcfc4b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandSeparatedPluginsCompatMarkTable ( ");
        l75.e0 e0Var = f318543p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318538h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", "createTableSql %s", str2);
            k0Var.A("AppBrandSeparatedPluginsCompatMarkTable", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandSeparatedPluginsCompatMarkTable", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", "updateTableSql %s", str3);
            k0Var.A("AppBrandSeparatedPluginsCompatMarkTable", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandSeparatedPluginsCompatMarkTable", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318543p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318544q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318537g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318537g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f66577x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f318545d = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.f66578x119cf7dc = contentValues.getAsInteger("appVersion").intValue();
            if (z17) {
                this.f318546e = true;
            }
        }
        if (contentValues.containsKey("isSeparatedPluginsUsed")) {
            this.f66579x1dbcfc4b = contentValues.getAsInteger("isSeparatedPluginsUsed").intValue();
            if (z17) {
                this.f318547f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
