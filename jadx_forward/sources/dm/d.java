package dm;

/* loaded from: classes8.dex */
public class d extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f317790p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f317791q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317792r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317793s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317794t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317795u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317796v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317797w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317798x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317799y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f317800z;

    /* renamed from: field_business */
    public java.lang.String f66189xd967c965;

    /* renamed from: field_endTime */
    public long f66190x14c61803;

    /* renamed from: field_expId */
    public java.lang.String f66191x29106093;

    /* renamed from: field_layerId */
    public java.lang.String f66192x72127c07;

    /* renamed from: field_needReport */
    public boolean f66193x672cb5cf;

    /* renamed from: field_prioritylevel */
    public int f66194xac21bddb;

    /* renamed from: field_rawXML */
    public java.lang.String f66195xde9f9b4;

    /* renamed from: field_sequence */
    public long f66196x6e338166;

    /* renamed from: field_startTime */
    public long f66197x1bb3b54a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317801d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317802e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317803f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317804g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317805h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317806i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317807m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317808n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f317809o = true;

    static {
        p75.n0 n0Var = new p75.n0("ABTestItem");
        f317790p = n0Var;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317791q = new java.lang.String[0];
        f317792r = -41955764;
        f317793s = -1146830912;
        f317794t = 96960536;
        f317795u = 1349547969;
        f317796v = 852985952;
        f317797w = -2129294769;
        f317798x = -1607243192;
        f317799y = -1375370902;
        f317800z = -938030385;
        A = 108705909;
        B = m124863x3593deb(dm.d.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124863x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "layerId";
        e0Var.f398488d.put("layerId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "layerId";
        e0Var.f398487c[1] = "business";
        e0Var.f398488d.put("business", "TEXT");
        e0Var.f398487c[2] = "expId";
        e0Var.f398488d.put("expId", "TEXT");
        e0Var.f398487c[3] = "sequence";
        e0Var.f398488d.put("sequence", "LONG");
        e0Var.f398487c[4] = "prioritylevel";
        e0Var.f398488d.put("prioritylevel", "INTEGER default '0' ");
        e0Var.f398487c[5] = "startTime";
        e0Var.f398488d.put("startTime", "LONG");
        e0Var.f398487c[6] = "endTime";
        e0Var.f398488d.put("endTime", "LONG");
        e0Var.f398487c[7] = "needReport";
        e0Var.f398488d.put("needReport", "INTEGER");
        e0Var.f398487c[8] = "rawXML";
        e0Var.f398488d.put("rawXML", "TEXT default '' ");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " layerId TEXT PRIMARY KEY ,  business TEXT,  expId TEXT,  sequence LONG,  prioritylevel INTEGER default '0' ,  startTime LONG,  endTime LONG,  needReport INTEGER,  rawXML TEXT default '' ";
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
            if (f317792r == hashCode) {
                try {
                    this.f66192x72127c07 = cursor.getString(i17);
                    this.f317801d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317793s == hashCode) {
                try {
                    this.f66189xd967c965 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317794t == hashCode) {
                try {
                    this.f66191x29106093 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317795u == hashCode) {
                try {
                    this.f66196x6e338166 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317796v == hashCode) {
                try {
                    this.f66194xac21bddb = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317797w == hashCode) {
                try {
                    this.f66197x1bb3b54a = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317798x == hashCode) {
                try {
                    this.f66190x14c61803 = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317799y == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f66193x672cb5cf = z17;
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestItem", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317800z == hashCode) {
                try {
                    this.f66195xde9f9b4 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseABTestItem", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317801d) {
            contentValues.put("layerId", this.f66192x72127c07);
        }
        if (this.f317802e) {
            contentValues.put("business", this.f66189xd967c965);
        }
        if (this.f317803f) {
            contentValues.put("expId", this.f66191x29106093);
        }
        if (this.f317804g) {
            contentValues.put("sequence", java.lang.Long.valueOf(this.f66196x6e338166));
        }
        if (this.f317805h) {
            contentValues.put("prioritylevel", java.lang.Integer.valueOf(this.f66194xac21bddb));
        }
        if (this.f317806i) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.f66197x1bb3b54a));
        }
        if (this.f317807m) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.f66190x14c61803));
        }
        if (this.f317808n) {
            if (this.f66193x672cb5cf) {
                contentValues.put("needReport", (java.lang.Integer) 1);
            } else {
                contentValues.put("needReport", (java.lang.Integer) 0);
            }
        }
        if (this.f66195xde9f9b4 == null) {
            this.f66195xde9f9b4 = "";
        }
        if (this.f317809o) {
            contentValues.put("rawXML", this.f66195xde9f9b4);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseABTestItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ABTestItem ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317791q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseABTestItem", "createTableSql %s", str2);
            k0Var.A("ABTestItem", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ABTestItem", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseABTestItem", "updateTableSql %s", str3);
            k0Var.A("ABTestItem", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseABTestItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return B;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return C;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66192x72127c07;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317790p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317790p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("layerId")) {
            this.f66192x72127c07 = contentValues.getAsString("layerId");
            if (z17) {
                this.f317801d = true;
            }
        }
        if (contentValues.containsKey("business")) {
            this.f66189xd967c965 = contentValues.getAsString("business");
            if (z17) {
                this.f317802e = true;
            }
        }
        if (contentValues.containsKey("expId")) {
            this.f66191x29106093 = contentValues.getAsString("expId");
            if (z17) {
                this.f317803f = true;
            }
        }
        if (contentValues.containsKey("sequence")) {
            this.f66196x6e338166 = contentValues.getAsLong("sequence").longValue();
            if (z17) {
                this.f317804g = true;
            }
        }
        if (contentValues.containsKey("prioritylevel")) {
            this.f66194xac21bddb = contentValues.getAsInteger("prioritylevel").intValue();
            if (z17) {
                this.f317805h = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.f66197x1bb3b54a = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f317806i = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.f66190x14c61803 = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f317807m = true;
            }
        }
        if (contentValues.containsKey("needReport")) {
            this.f66193x672cb5cf = contentValues.getAsInteger("needReport").intValue() != 0;
            if (z17) {
                this.f317808n = true;
            }
        }
        if (contentValues.containsKey("rawXML")) {
            this.f66195xde9f9b4 = contentValues.getAsString("rawXML");
            if (z17) {
                this.f317809o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
