package dm;

/* loaded from: classes4.dex */
public class e6 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f318168h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f318169i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318170m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318171n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318172o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318173p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318174q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f318175r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f318176s;

    /* renamed from: field_chatroomname */
    public java.lang.String f66385x37548063;

    /* renamed from: field_queryState */
    public int f66386xae782d0e;

    /* renamed from: field_recentUseToolList */
    public java.lang.String f66387xea681f9d;

    /* renamed from: field_stickToollist */
    public java.lang.String f66388x66b87861;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318177d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318178e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318179f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318180g = true;

    static {
        p75.n0 n0Var = new p75.n0("GroupTools");
        f318168h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318169i = new java.lang.String[0];
        f318170m = 724095294;
        f318171n = -311541018;
        f318172o = 880484258;
        f318173p = -179242839;
        f318174q = 108705909;
        f318175r = m124903x3593deb(dm.e6.class);
        f318176s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124903x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "chatroomname";
        e0Var.f398488d.put("chatroomname", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "chatroomname";
        e0Var.f398487c[1] = "stickToollist";
        e0Var.f398488d.put("stickToollist", "TEXT");
        e0Var.f398487c[2] = "recentUseToolList";
        e0Var.f398488d.put("recentUseToolList", "TEXT");
        e0Var.f398487c[3] = "queryState";
        e0Var.f398488d.put("queryState", "INTEGER");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " chatroomname TEXT PRIMARY KEY ,  stickToollist TEXT,  recentUseToolList TEXT,  queryState INTEGER";
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
            if (f318170m == hashCode) {
                try {
                    this.f66385x37548063 = cursor.getString(i17);
                    this.f318177d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGroupTools", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318171n == hashCode) {
                try {
                    this.f66388x66b87861 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGroupTools", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318172o == hashCode) {
                try {
                    this.f66387xea681f9d = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGroupTools", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318173p == hashCode) {
                try {
                    this.f66386xae782d0e = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGroupTools", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318174q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318177d) {
            contentValues.put("chatroomname", this.f66385x37548063);
        }
        if (this.f318178e) {
            contentValues.put("stickToollist", this.f66388x66b87861);
        }
        if (this.f318179f) {
            contentValues.put("recentUseToolList", this.f66387xea681f9d);
        }
        if (this.f318180g) {
            contentValues.put("queryState", java.lang.Integer.valueOf(this.f66386xae782d0e));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGroupTools", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GroupTools ( ");
        l75.e0 e0Var = f318175r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318169i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGroupTools", "createTableSql %s", str2);
            k0Var.A("GroupTools", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GroupTools", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGroupTools", "updateTableSql %s", str3);
            k0Var.A("GroupTools", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGroupTools", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318175r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318176s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66385x37548063;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318168h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318168h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("chatroomname")) {
            this.f66385x37548063 = contentValues.getAsString("chatroomname");
            if (z17) {
                this.f318177d = true;
            }
        }
        if (contentValues.containsKey("stickToollist")) {
            this.f66388x66b87861 = contentValues.getAsString("stickToollist");
            if (z17) {
                this.f318178e = true;
            }
        }
        if (contentValues.containsKey("recentUseToolList")) {
            this.f66387xea681f9d = contentValues.getAsString("recentUseToolList");
            if (z17) {
                this.f318179f = true;
            }
        }
        if (contentValues.containsKey("queryState")) {
            this.f66386xae782d0e = contentValues.getAsInteger("queryState").intValue();
            if (z17) {
                this.f318180g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
