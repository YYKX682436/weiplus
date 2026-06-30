package dm;

/* loaded from: classes13.dex */
public class n7 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f320241q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f320242r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320243s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320244t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320245u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320246v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320247w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f320248x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f320249y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f320250z;

    /* renamed from: field_action */
    public int f67675xf102ad1b;

    /* renamed from: field_anchorId */
    public java.lang.String f67676xe3dffc55;

    /* renamed from: field_dayOfWeek */
    public int f67677x6f12d422;

    /* renamed from: field_hasDisturbance */
    public int f67678xa78282b9;

    /* renamed from: field_hourOfDay */
    public int f67679xd557edbc;

    /* renamed from: field_isReddotScoreValid */
    public int f67680xa04cfe71;

    /* renamed from: field_reddotId */
    public java.lang.String f67681xef3863f8;

    /* renamed from: field_reddotScore */
    public float f67682x53c79e95;

    /* renamed from: field_timestamp */
    public long f67683x9de75411;

    /* renamed from: field_title */
    public java.lang.String f67684x29dd02d3;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320251d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320252e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320253f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320254g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320255h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320256i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320257m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320258n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f320259o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f320260p = true;

    static {
        p75.n0 n0Var = new p75.n0("LiveHomeRedDotEvent");
        f320241q = n0Var;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320242r = new java.lang.String[0];
        f320243s = -780838317;
        f320244t = -1734738164;
        f320245u = -402110886;
        f320246v = -971181392;
        f320247w = 110371416;
        f320248x = -142210860;
        f320249y = -1422950858;
        f320250z = -730552025;
        A = 985252545;
        B = 55126294;
        C = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f398487c = strArr;
        strArr[0] = "reddotId";
        ((java.util.HashMap) e0Var.f398488d).put("reddotId", "TEXT");
        e0Var.f398487c[1] = "isReddotScoreValid";
        ((java.util.HashMap) e0Var.f398488d).put("isReddotScoreValid", "INTEGER");
        e0Var.f398487c[2] = "reddotScore";
        ((java.util.HashMap) e0Var.f398488d).put("reddotScore", "FLOAT");
        e0Var.f398487c[3] = "anchorId";
        ((java.util.HashMap) e0Var.f398488d).put("anchorId", "TEXT");
        e0Var.f398487c[4] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        ((java.util.HashMap) e0Var.f398488d).put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "TEXT");
        e0Var.f398487c[5] = "hasDisturbance";
        ((java.util.HashMap) e0Var.f398488d).put("hasDisturbance", "INTEGER");
        e0Var.f398487c[6] = "action";
        ((java.util.HashMap) e0Var.f398488d).put("action", "INTEGER");
        e0Var.f398487c[7] = "dayOfWeek";
        ((java.util.HashMap) e0Var.f398488d).put("dayOfWeek", "INTEGER");
        e0Var.f398487c[8] = "hourOfDay";
        ((java.util.HashMap) e0Var.f398488d).put("hourOfDay", "INTEGER");
        e0Var.f398487c[9] = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6;
        ((java.util.HashMap) e0Var.f398488d).put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "LONG");
        e0Var.f398487c[10] = "rowid";
        e0Var.f398489e = " reddotId TEXT,  isReddotScoreValid INTEGER,  reddotScore FLOAT,  anchorId TEXT,  title TEXT,  hasDisturbance INTEGER,  action INTEGER,  dayOfWeek INTEGER,  hourOfDay INTEGER,  timestamp LONG";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        D = e0Var;
        E = new o75.e();
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
            if (f320243s == hashCode) {
                try {
                    this.f67681xef3863f8 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320244t == hashCode) {
                try {
                    this.f67680xa04cfe71 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320245u == hashCode) {
                try {
                    this.f67682x53c79e95 = cursor.getFloat(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320246v == hashCode) {
                try {
                    this.f67676xe3dffc55 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320247w == hashCode) {
                try {
                    this.f67684x29dd02d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320248x == hashCode) {
                try {
                    this.f67678xa78282b9 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320249y == hashCode) {
                try {
                    this.f67675xf102ad1b = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320250z == hashCode) {
                try {
                    this.f67677x6f12d422 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67679xd557edbc = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67683x9de75411 = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeRedDotEvent", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320251d) {
            contentValues.put("reddotId", this.f67681xef3863f8);
        }
        if (this.f320252e) {
            contentValues.put("isReddotScoreValid", java.lang.Integer.valueOf(this.f67680xa04cfe71));
        }
        if (this.f320253f) {
            contentValues.put("reddotScore", java.lang.Float.valueOf(this.f67682x53c79e95));
        }
        if (this.f320254g) {
            contentValues.put("anchorId", this.f67676xe3dffc55);
        }
        if (this.f320255h) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f67684x29dd02d3);
        }
        if (this.f320256i) {
            contentValues.put("hasDisturbance", java.lang.Integer.valueOf(this.f67678xa78282b9));
        }
        if (this.f320257m) {
            contentValues.put("action", java.lang.Integer.valueOf(this.f67675xf102ad1b));
        }
        if (this.f320258n) {
            contentValues.put("dayOfWeek", java.lang.Integer.valueOf(this.f67677x6f12d422));
        }
        if (this.f320259o) {
            contentValues.put("hourOfDay", java.lang.Integer.valueOf(this.f67679xd557edbc));
        }
        if (this.f320260p) {
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f67683x9de75411));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLiveHomeRedDotEvent", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiveHomeRedDotEvent ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320242r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveHomeRedDotEvent", "createTableSql %s", str2);
            k0Var.A("LiveHomeRedDotEvent", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LiveHomeRedDotEvent", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveHomeRedDotEvent", "updateTableSql %s", str3);
            k0Var.A("LiveHomeRedDotEvent", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveHomeRedDotEvent", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return D;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return E;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320241q;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320241q.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("reddotId")) {
            this.f67681xef3863f8 = contentValues.getAsString("reddotId");
            if (z17) {
                this.f320251d = true;
            }
        }
        if (contentValues.containsKey("isReddotScoreValid")) {
            this.f67680xa04cfe71 = contentValues.getAsInteger("isReddotScoreValid").intValue();
            if (z17) {
                this.f320252e = true;
            }
        }
        if (contentValues.containsKey("reddotScore")) {
            this.f67682x53c79e95 = contentValues.getAsFloat("reddotScore").floatValue();
            if (z17) {
                this.f320253f = true;
            }
        }
        if (contentValues.containsKey("anchorId")) {
            this.f67676xe3dffc55 = contentValues.getAsString("anchorId");
            if (z17) {
                this.f320254g = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            this.f67684x29dd02d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (z17) {
                this.f320255h = true;
            }
        }
        if (contentValues.containsKey("hasDisturbance")) {
            this.f67678xa78282b9 = contentValues.getAsInteger("hasDisturbance").intValue();
            if (z17) {
                this.f320256i = true;
            }
        }
        if (contentValues.containsKey("action")) {
            this.f67675xf102ad1b = contentValues.getAsInteger("action").intValue();
            if (z17) {
                this.f320257m = true;
            }
        }
        if (contentValues.containsKey("dayOfWeek")) {
            this.f67677x6f12d422 = contentValues.getAsInteger("dayOfWeek").intValue();
            if (z17) {
                this.f320258n = true;
            }
        }
        if (contentValues.containsKey("hourOfDay")) {
            this.f67679xd557edbc = contentValues.getAsInteger("hourOfDay").intValue();
            if (z17) {
                this.f320259o = true;
            }
        }
        if (contentValues.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            this.f67683x9de75411 = contentValues.getAsLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6).longValue();
            if (z17) {
                this.f320260p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
