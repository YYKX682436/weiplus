package dm;

/* loaded from: classes4.dex */
public class fd extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f318505h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f318506i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318507m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318508n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318509o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318510p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318511q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f318512r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f318513s;

    /* renamed from: field_appId */
    public java.lang.String f66566x28d45f97;

    /* renamed from: field_exptInfo */
    public java.lang.String f66567xab29c8ea;

    /* renamed from: field_issueTimestampMs */
    public long f66568xbfd10768;

    /* renamed from: field_source */
    public int f66569x10639700;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318514d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318515e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318516f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318517g = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaWeDataExptInfo");
        f318505h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318506i = new java.lang.String[0];
        f318507m = 93028124;
        f318508n = 487289539;
        f318509o = -1922646203;
        f318510p = -896505829;
        f318511q = 108705909;
        f318512r = m124989x3593deb(dm.fd.class);
        f318513s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124989x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "appId";
        e0Var.f398487c[1] = "issueTimestampMs";
        e0Var.f398488d.put("issueTimestampMs", "LONG");
        e0Var.f398487c[2] = "exptInfo";
        e0Var.f398488d.put("exptInfo", "TEXT");
        e0Var.f398487c[3] = ya.b.f77502x92235c1b;
        e0Var.f398488d.put(ya.b.f77502x92235c1b, "INTEGER default '0' ");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " appId TEXT PRIMARY KEY ,  issueTimestampMs LONG,  exptInfo TEXT,  source INTEGER default '0' ";
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
            if (f318507m == hashCode) {
                try {
                    this.f66566x28d45f97 = cursor.getString(i17);
                    this.f318514d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaWeDataExptInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318508n == hashCode) {
                try {
                    this.f66568xbfd10768 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaWeDataExptInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318509o == hashCode) {
                try {
                    this.f66567xab29c8ea = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaWeDataExptInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318510p == hashCode) {
                try {
                    this.f66569x10639700 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaWeDataExptInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318511q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318514d) {
            contentValues.put("appId", this.f66566x28d45f97);
        }
        if (this.f318515e) {
            contentValues.put("issueTimestampMs", java.lang.Long.valueOf(this.f66568xbfd10768));
        }
        if (this.f318516f) {
            contentValues.put("exptInfo", this.f66567xab29c8ea);
        }
        if (this.f318517g) {
            contentValues.put(ya.b.f77502x92235c1b, java.lang.Integer.valueOf(this.f66569x10639700));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWxaWeDataExptInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaWeDataExptInfo ( ");
        l75.e0 e0Var = f318512r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318506i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaWeDataExptInfo", "createTableSql %s", str2);
            k0Var.A("WxaWeDataExptInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WxaWeDataExptInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaWeDataExptInfo", "updateTableSql %s", str3);
            k0Var.A("WxaWeDataExptInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaWeDataExptInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318512r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318513s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66566x28d45f97;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318505h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318505h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f66566x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f318514d = true;
            }
        }
        if (contentValues.containsKey("issueTimestampMs")) {
            this.f66568xbfd10768 = contentValues.getAsLong("issueTimestampMs").longValue();
            if (z17) {
                this.f318515e = true;
            }
        }
        if (contentValues.containsKey("exptInfo")) {
            this.f66567xab29c8ea = contentValues.getAsString("exptInfo");
            if (z17) {
                this.f318516f = true;
            }
        }
        if (contentValues.containsKey(ya.b.f77502x92235c1b)) {
            this.f66569x10639700 = contentValues.getAsInteger(ya.b.f77502x92235c1b).intValue();
            if (z17) {
                this.f318517g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
