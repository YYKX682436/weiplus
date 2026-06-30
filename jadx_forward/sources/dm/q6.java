package dm;

/* loaded from: classes4.dex */
public class q6 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f320946g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f320947h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f320948i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320949m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320950n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320951o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f320952p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f320953q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320954d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320955e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320956f = true;

    /* renamed from: field_callTimeCount */
    public long f68049xf7d16aff;

    /* renamed from: field_countryCode */
    public int f68050x13b516de;

    /* renamed from: field_lastCallTime */
    public long f68051x9b559226;

    static {
        p75.n0 n0Var = new p75.n0("IPCallPopularCountry");
        f320946g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320947h = new java.lang.String[0];
        f320948i = -1477067101;
        f320949m = 2122790276;
        f320950n = -1893080319;
        f320951o = 108705909;
        f320952p = m125421x3593deb(dm.q6.class);
        f320953q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125421x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "countryCode";
        e0Var.f398488d.put("countryCode", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "countryCode";
        e0Var.f398487c[1] = "callTimeCount";
        e0Var.f398488d.put("callTimeCount", "LONG");
        e0Var.f398487c[2] = "lastCallTime";
        e0Var.f398488d.put("lastCallTime", "LONG");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " countryCode INTEGER PRIMARY KEY ,  callTimeCount LONG,  lastCallTime LONG";
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
            if (f320948i == hashCode) {
                try {
                    this.f68050x13b516de = cursor.getInt(i17);
                    this.f320954d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallPopularCountry", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320949m == hashCode) {
                try {
                    this.f68049xf7d16aff = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallPopularCountry", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320950n == hashCode) {
                try {
                    this.f68051x9b559226 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallPopularCountry", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320951o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320954d) {
            contentValues.put("countryCode", java.lang.Integer.valueOf(this.f68050x13b516de));
        }
        if (this.f320955e) {
            contentValues.put("callTimeCount", java.lang.Long.valueOf(this.f68049xf7d16aff));
        }
        if (this.f320956f) {
            contentValues.put("lastCallTime", java.lang.Long.valueOf(this.f68051x9b559226));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseIPCallPopularCountry", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS IPCallPopularCountry ( ");
        l75.e0 e0Var = f320952p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320947h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseIPCallPopularCountry", "createTableSql %s", str2);
            k0Var.A("IPCallPopularCountry", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "IPCallPopularCountry", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseIPCallPopularCountry", "updateTableSql %s", str3);
            k0Var.A("IPCallPopularCountry", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseIPCallPopularCountry", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320952p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320953q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f68050x13b516de);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320946g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320946g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("countryCode")) {
            this.f68050x13b516de = contentValues.getAsInteger("countryCode").intValue();
            if (z17) {
                this.f320954d = true;
            }
        }
        if (contentValues.containsKey("callTimeCount")) {
            this.f68049xf7d16aff = contentValues.getAsLong("callTimeCount").longValue();
            if (z17) {
                this.f320955e = true;
            }
        }
        if (contentValues.containsKey("lastCallTime")) {
            this.f68051x9b559226 = contentValues.getAsLong("lastCallTime").longValue();
            if (z17) {
                this.f320956f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
