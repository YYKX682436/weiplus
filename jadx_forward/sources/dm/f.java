package dm;

/* loaded from: classes4.dex */
public class f extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f318277h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f318278i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318279m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318280n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318281o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318282p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318283q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f318284r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f318285s;

    /* renamed from: field_dau */
    public int f66462x4b6e46d3;

    /* renamed from: field_key */
    public int f66463x4b6e619a;

    /* renamed from: field_mau */
    public int f66464x4b6e689c;

    /* renamed from: field_useTime */
    public long f66465x6bc01eaf;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318286d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318287e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318288f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318289g = true;

    static {
        p75.n0 n0Var = new p75.n0("ActiveInfo");
        f318277h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318278i = new java.lang.String[0];
        f318279m = 106079;
        f318280n = 107873;
        f318281o = 99224;
        f318282p = -148016908;
        f318283q = 108705909;
        f318284r = m124964x3593deb(dm.f.class);
        f318285s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124964x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "key";
        e0Var.f398488d.put("key", "INTEGER PRIMARY KEY  COLLATE NOCASE ");
        e0Var.f398486b = "key";
        e0Var.f398487c[1] = "mau";
        e0Var.f398488d.put("mau", "INTEGER");
        e0Var.f398487c[2] = "dau";
        e0Var.f398488d.put("dau", "INTEGER");
        e0Var.f398487c[3] = "useTime";
        e0Var.f398488d.put("useTime", "LONG");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " key INTEGER PRIMARY KEY  COLLATE NOCASE ,  mau INTEGER,  dau INTEGER,  useTime LONG";
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
            if (f318279m == hashCode) {
                try {
                    this.f66463x4b6e619a = cursor.getInt(i17);
                    this.f318286d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseActiveInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318280n == hashCode) {
                try {
                    this.f66464x4b6e689c = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseActiveInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318281o == hashCode) {
                try {
                    this.f66462x4b6e46d3 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseActiveInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318282p == hashCode) {
                try {
                    this.f66465x6bc01eaf = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseActiveInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318283q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318286d) {
            contentValues.put("key", java.lang.Integer.valueOf(this.f66463x4b6e619a));
        }
        if (this.f318287e) {
            contentValues.put("mau", java.lang.Integer.valueOf(this.f66464x4b6e689c));
        }
        if (this.f318288f) {
            contentValues.put("dau", java.lang.Integer.valueOf(this.f66462x4b6e46d3));
        }
        if (this.f318289g) {
            contentValues.put("useTime", java.lang.Long.valueOf(this.f66465x6bc01eaf));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseActiveInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ActiveInfo ( ");
        l75.e0 e0Var = f318284r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318278i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseActiveInfo", "createTableSql %s", str2);
            k0Var.A("ActiveInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ActiveInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseActiveInfo", "updateTableSql %s", str3);
            k0Var.A("ActiveInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseActiveInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318284r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318285s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f66463x4b6e619a);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318277h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318277h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.f66463x4b6e619a = contentValues.getAsInteger("key").intValue();
            if (z17) {
                this.f318286d = true;
            }
        }
        if (contentValues.containsKey("mau")) {
            this.f66464x4b6e689c = contentValues.getAsInteger("mau").intValue();
            if (z17) {
                this.f318287e = true;
            }
        }
        if (contentValues.containsKey("dau")) {
            this.f66462x4b6e46d3 = contentValues.getAsInteger("dau").intValue();
            if (z17) {
                this.f318288f = true;
            }
        }
        if (contentValues.containsKey("useTime")) {
            this.f66465x6bc01eaf = contentValues.getAsLong("useTime").longValue();
            if (z17) {
                this.f318289g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
