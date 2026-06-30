package dm;

/* loaded from: classes8.dex */
public class c extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f317504o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f317505p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317506q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317507r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317508s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317509t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317510u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317511v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317512w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317513x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317514y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f317515z;

    /* renamed from: field_abtestkey */
    public java.lang.String f66021x37f6a047;

    /* renamed from: field_endTime */
    public long f66022x14c61803;

    /* renamed from: field_expId */
    public java.lang.String f66023x29106093;

    /* renamed from: field_noReport */
    public boolean f66024x420943fa;

    /* renamed from: field_prioritylevel */
    public int f66025xac21bddb;

    /* renamed from: field_sequence */
    public long f66026x6e338166;

    /* renamed from: field_startTime */
    public long f66027x1bb3b54a;

    /* renamed from: field_value */
    public java.lang.String f66028x29f571ec;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317516d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317517e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317518f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317519g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317520h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317521i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317522m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317523n = true;

    static {
        p75.n0 n0Var = new p75.n0("ABTestInfo");
        f317504o = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317505p = new java.lang.String[0];
        f317506q = -1655147188;
        f317507r = 111972721;
        f317508s = 96960536;
        f317509t = 1349547969;
        f317510u = 852985952;
        f317511v = -2129294769;
        f317512w = -1607243192;
        f317513x = 608582229;
        f317514y = 108705909;
        f317515z = m124829x3593deb(dm.c.class);
        A = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124829x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "abtestkey";
        e0Var.f398488d.put("abtestkey", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "abtestkey";
        e0Var.f398487c[1] = "value";
        e0Var.f398488d.put("value", "TEXT");
        e0Var.f398487c[2] = "expId";
        e0Var.f398488d.put("expId", "TEXT");
        e0Var.f398487c[3] = "sequence";
        e0Var.f398488d.put("sequence", "LONG");
        e0Var.f398487c[4] = "prioritylevel";
        e0Var.f398488d.put("prioritylevel", "INTEGER");
        e0Var.f398487c[5] = "startTime";
        e0Var.f398488d.put("startTime", "LONG");
        e0Var.f398487c[6] = "endTime";
        e0Var.f398488d.put("endTime", "LONG");
        e0Var.f398487c[7] = "noReport";
        e0Var.f398488d.put("noReport", "INTEGER");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " abtestkey TEXT PRIMARY KEY ,  value TEXT,  expId TEXT,  sequence LONG,  prioritylevel INTEGER,  startTime LONG,  endTime LONG,  noReport INTEGER";
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
            boolean z17 = true;
            if (f317506q == hashCode) {
                try {
                    this.f66021x37f6a047 = cursor.getString(i17);
                    this.f317516d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317507r == hashCode) {
                try {
                    this.f66028x29f571ec = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317508s == hashCode) {
                try {
                    this.f66023x29106093 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317509t == hashCode) {
                try {
                    this.f66026x6e338166 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317510u == hashCode) {
                try {
                    this.f66025xac21bddb = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317511v == hashCode) {
                try {
                    this.f66027x1bb3b54a = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317512w == hashCode) {
                try {
                    this.f66022x14c61803 = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317513x == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f66024x420943fa = z17;
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317514y == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317516d) {
            contentValues.put("abtestkey", this.f66021x37f6a047);
        }
        if (this.f317517e) {
            contentValues.put("value", this.f66028x29f571ec);
        }
        if (this.f317518f) {
            contentValues.put("expId", this.f66023x29106093);
        }
        if (this.f317519g) {
            contentValues.put("sequence", java.lang.Long.valueOf(this.f66026x6e338166));
        }
        if (this.f317520h) {
            contentValues.put("prioritylevel", java.lang.Integer.valueOf(this.f66025xac21bddb));
        }
        if (this.f317521i) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.f66027x1bb3b54a));
        }
        if (this.f317522m) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.f66022x14c61803));
        }
        if (this.f317523n) {
            if (this.f66024x420943fa) {
                contentValues.put("noReport", (java.lang.Integer) 1);
            } else {
                contentValues.put("noReport", (java.lang.Integer) 0);
            }
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseABTestInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ABTestInfo ( ");
        l75.e0 e0Var = f317515z;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317505p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseABTestInfo", "createTableSql %s", str2);
            k0Var.A("ABTestInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ABTestInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseABTestInfo", "updateTableSql %s", str3);
            k0Var.A("ABTestInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseABTestInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317515z;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66021x37f6a047;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317504o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317504o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("abtestkey")) {
            this.f66021x37f6a047 = contentValues.getAsString("abtestkey");
            if (z17) {
                this.f317516d = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.f66028x29f571ec = contentValues.getAsString("value");
            if (z17) {
                this.f317517e = true;
            }
        }
        if (contentValues.containsKey("expId")) {
            this.f66023x29106093 = contentValues.getAsString("expId");
            if (z17) {
                this.f317518f = true;
            }
        }
        if (contentValues.containsKey("sequence")) {
            this.f66026x6e338166 = contentValues.getAsLong("sequence").longValue();
            if (z17) {
                this.f317519g = true;
            }
        }
        if (contentValues.containsKey("prioritylevel")) {
            this.f66025xac21bddb = contentValues.getAsInteger("prioritylevel").intValue();
            if (z17) {
                this.f317520h = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.f66027x1bb3b54a = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f317521i = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.f66022x14c61803 = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f317522m = true;
            }
        }
        if (contentValues.containsKey("noReport")) {
            this.f66024x420943fa = contentValues.getAsInteger("noReport").intValue() != 0;
            if (z17) {
                this.f317523n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
