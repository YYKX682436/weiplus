package dm;

/* loaded from: classes4.dex */
public class c0 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f317524i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f317525m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f317526n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317527o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317528p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317529q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317530r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317531s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f317532t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f317533u;

    /* renamed from: field_appId */
    public java.lang.String f66029x28d45f97;

    /* renamed from: field_appServiceType */
    public int f66030xec8a2093;

    /* renamed from: field_lastLaunchTime */
    public long f66031xdd04fe3b;

    /* renamed from: field_maxFileStorageSize */
    public int f66032x28f6ab61;

    /* renamed from: field_wechatPluginApp */
    public int f66033xb52fe423;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317534d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317535e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317536f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317537g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317538h = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandMessInfoRecord");
        f317524i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317525m = new java.lang.String[0];
        f317526n = 93028124;
        f317527o = 1704796520;
        f317528p = 1015916206;
        f317529q = 558083068;
        f317530r = 755532886;
        f317531s = 108705909;
        f317532t = m124831x3593deb(dm.c0.class);
        f317533u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124831x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "appId";
        e0Var.f398487c[1] = "wechatPluginApp";
        e0Var.f398488d.put("wechatPluginApp", "INTEGER default '-1' ");
        e0Var.f398487c[2] = "appServiceType";
        e0Var.f398488d.put("appServiceType", "INTEGER default '-1' ");
        e0Var.f398487c[3] = "maxFileStorageSize";
        e0Var.f398488d.put("maxFileStorageSize", "INTEGER default '-1' ");
        e0Var.f398487c[4] = "lastLaunchTime";
        e0Var.f398488d.put("lastLaunchTime", "LONG");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " appId TEXT PRIMARY KEY ,  wechatPluginApp INTEGER default '-1' ,  appServiceType INTEGER default '-1' ,  maxFileStorageSize INTEGER default '-1' ,  lastLaunchTime LONG";
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
            if (f317526n == hashCode) {
                try {
                    this.f66029x28d45f97 = cursor.getString(i17);
                    this.f317534d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317527o == hashCode) {
                try {
                    this.f66033xb52fe423 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317528p == hashCode) {
                try {
                    this.f66030xec8a2093 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317529q == hashCode) {
                try {
                    this.f66032x28f6ab61 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317530r == hashCode) {
                try {
                    this.f66031xdd04fe3b = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandMessInfoRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317531s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317534d) {
            contentValues.put("appId", this.f66029x28d45f97);
        }
        if (this.f317535e) {
            contentValues.put("wechatPluginApp", java.lang.Integer.valueOf(this.f66033xb52fe423));
        }
        if (this.f317536f) {
            contentValues.put("appServiceType", java.lang.Integer.valueOf(this.f66030xec8a2093));
        }
        if (this.f317537g) {
            contentValues.put("maxFileStorageSize", java.lang.Integer.valueOf(this.f66032x28f6ab61));
        }
        if (this.f317538h) {
            contentValues.put("lastLaunchTime", java.lang.Long.valueOf(this.f66031xdd04fe3b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandMessInfoRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandMessInfoRecord ( ");
        l75.e0 e0Var = f317532t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317525m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandMessInfoRecord", "createTableSql %s", str2);
            k0Var.A("AppBrandMessInfoRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandMessInfoRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandMessInfoRecord", "updateTableSql %s", str3);
            k0Var.A("AppBrandMessInfoRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandMessInfoRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317532t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317533u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66029x28d45f97;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317524i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317524i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f66029x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f317534d = true;
            }
        }
        if (contentValues.containsKey("wechatPluginApp")) {
            this.f66033xb52fe423 = contentValues.getAsInteger("wechatPluginApp").intValue();
            if (z17) {
                this.f317535e = true;
            }
        }
        if (contentValues.containsKey("appServiceType")) {
            this.f66030xec8a2093 = contentValues.getAsInteger("appServiceType").intValue();
            if (z17) {
                this.f317536f = true;
            }
        }
        if (contentValues.containsKey("maxFileStorageSize")) {
            this.f66032x28f6ab61 = contentValues.getAsInteger("maxFileStorageSize").intValue();
            if (z17) {
                this.f317537g = true;
            }
        }
        if (contentValues.containsKey("lastLaunchTime")) {
            this.f66031xdd04fe3b = contentValues.getAsLong("lastLaunchTime").longValue();
            if (z17) {
                this.f317538h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
