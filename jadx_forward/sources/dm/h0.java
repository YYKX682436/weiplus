package dm;

/* loaded from: classes7.dex */
public class h0 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f318816i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f318817m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318818n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318819o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318820p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318821q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318822r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318823s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f318824t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f318825u;

    /* renamed from: field_appPath */
    public java.lang.String f66722x453e07a1;

    /* renamed from: field_orderSequence */
    public long f66723x36496aaa;

    /* renamed from: field_updateTime */
    public long f66724xa783a79b;

    /* renamed from: field_username */
    public java.lang.String f66725xdec927b;

    /* renamed from: field_versionType */
    public int f66726x94d24c6d;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318826d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318827e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318828f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318829g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318830h = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandStarApp");
        f318816i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318817m = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS AppBrandStarAppUpdateTimeIndex ON AppBrandStarApp(updateTime)", "CREATE INDEX IF NOT EXISTS AppBrandStarAppOrderSequenceIndex ON AppBrandStarApp(orderSequence)"};
        f318818n = -265713450;
        f318819o = 689108018;
        f318820p = -295931082;
        f318821q = -1124125393;
        f318822r = -794076698;
        f318823s = 108705909;
        f318824t = m125020x3593deb(dm.h0.class);
        f318825u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125020x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT");
        e0Var.f398487c[1] = "versionType";
        e0Var.f398488d.put("versionType", "INTEGER");
        e0Var.f398487c[2] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[3] = "orderSequence";
        e0Var.f398488d.put("orderSequence", "LONG");
        e0Var.f398487c[4] = "appPath";
        e0Var.f398488d.put("appPath", "TEXT");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " username TEXT,  versionType INTEGER,  updateTime LONG,  orderSequence LONG,  appPath TEXT";
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
            if (f318818n == hashCode) {
                try {
                    this.f66725xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandStarApp", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318819o == hashCode) {
                try {
                    this.f66726x94d24c6d = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandStarApp", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318820p == hashCode) {
                try {
                    this.f66724xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandStarApp", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318821q == hashCode) {
                try {
                    this.f66723x36496aaa = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandStarApp", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318822r == hashCode) {
                try {
                    this.f66722x453e07a1 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandStarApp", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318823s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318826d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f66725xdec927b);
        }
        if (this.f318827e) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.f66726x94d24c6d));
        }
        if (this.f318828f) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f66724xa783a79b));
        }
        if (this.f318829g) {
            contentValues.put("orderSequence", java.lang.Long.valueOf(this.f66723x36496aaa));
        }
        if (this.f318830h) {
            contentValues.put("appPath", this.f66722x453e07a1);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandStarApp", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandStarApp ( ");
        l75.e0 e0Var = f318824t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318817m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandStarApp", "createTableSql %s", str2);
            k0Var.A("AppBrandStarApp", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandStarApp", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandStarApp", "updateTableSql %s", str3);
            k0Var.A("AppBrandStarApp", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandStarApp", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318824t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318825u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318816i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318816i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f66725xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f318826d = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.f66726x94d24c6d = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f318827e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f66724xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f318828f = true;
            }
        }
        if (contentValues.containsKey("orderSequence")) {
            this.f66723x36496aaa = contentValues.getAsLong("orderSequence").longValue();
            if (z17) {
                this.f318829g = true;
            }
        }
        if (contentValues.containsKey("appPath")) {
            this.f66722x453e07a1 = contentValues.getAsString("appPath");
            if (z17) {
                this.f318830h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
