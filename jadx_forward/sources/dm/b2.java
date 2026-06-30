package dm;

/* loaded from: classes13.dex */
public class b2 extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f317342o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f317343p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317344q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317345r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317346s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317347t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317348u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317349v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317350w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317351x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317352y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f317353z;

    /* renamed from: field_action */
    public int f65963xf102ad1b;

    /* renamed from: field_dayOfWeek */
    public int f65964x6f12d422;

    /* renamed from: field_hourOfDay */
    public int f65965xd557edbc;

    /* renamed from: field_isfrom */
    public int f65966xff84aeb9;

    /* renamed from: field_msgid */
    public long f65967x297eb8d7;

    /* renamed from: field_talker */
    public java.lang.String f65968x114ef53e;

    /* renamed from: field_timestamp */
    public long f65969x9de75411;

    /* renamed from: field_type */
    public int f65970x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317354d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317355e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317356f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317357g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317358h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317359i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317360m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317361n = true;

    static {
        p75.n0 n0Var = new p75.n0("ChattingEvent");
        f317342o = n0Var;
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
        f317343p = new java.lang.String[0];
        f317344q = -881080743;
        f317345r = 104192092;
        f317346s = -1179549740;
        f317347t = -1422950858;
        f317348u = -730552025;
        f317349v = 985252545;
        f317350w = 3575610;
        f317351x = 55126294;
        f317352y = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "talker";
        ((java.util.HashMap) e0Var.f398488d).put("talker", "TEXT");
        e0Var.f398487c[1] = "msgid";
        ((java.util.HashMap) e0Var.f398488d).put("msgid", "LONG");
        e0Var.f398487c[2] = "isfrom";
        ((java.util.HashMap) e0Var.f398488d).put("isfrom", "INTEGER");
        e0Var.f398487c[3] = "action";
        ((java.util.HashMap) e0Var.f398488d).put("action", "INTEGER");
        e0Var.f398487c[4] = "dayOfWeek";
        ((java.util.HashMap) e0Var.f398488d).put("dayOfWeek", "INTEGER");
        e0Var.f398487c[5] = "hourOfDay";
        ((java.util.HashMap) e0Var.f398488d).put("hourOfDay", "INTEGER");
        e0Var.f398487c[6] = "type";
        ((java.util.HashMap) e0Var.f398488d).put("type", "INTEGER");
        e0Var.f398487c[7] = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6;
        ((java.util.HashMap) e0Var.f398488d).put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "LONG");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " talker TEXT,  msgid LONG,  isfrom INTEGER,  action INTEGER,  dayOfWeek INTEGER,  hourOfDay INTEGER,  type INTEGER,  timestamp LONG";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f317353z = e0Var;
        A = new o75.e();
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
            if (f317344q == hashCode) {
                try {
                    this.f65968x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChattingEvent", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317345r == hashCode) {
                try {
                    this.f65967x297eb8d7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChattingEvent", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317346s == hashCode) {
                try {
                    this.f65966xff84aeb9 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChattingEvent", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317347t == hashCode) {
                try {
                    this.f65963xf102ad1b = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChattingEvent", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317348u == hashCode) {
                try {
                    this.f65964x6f12d422 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChattingEvent", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317349v == hashCode) {
                try {
                    this.f65965xd557edbc = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChattingEvent", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317350w == hashCode) {
                try {
                    this.f65970x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChattingEvent", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317351x == hashCode) {
                try {
                    this.f65969x9de75411 = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChattingEvent", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317352y == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317354d) {
            contentValues.put("talker", this.f65968x114ef53e);
        }
        if (this.f317355e) {
            contentValues.put("msgid", java.lang.Long.valueOf(this.f65967x297eb8d7));
        }
        if (this.f317356f) {
            contentValues.put("isfrom", java.lang.Integer.valueOf(this.f65966xff84aeb9));
        }
        if (this.f317357g) {
            contentValues.put("action", java.lang.Integer.valueOf(this.f65963xf102ad1b));
        }
        if (this.f317358h) {
            contentValues.put("dayOfWeek", java.lang.Integer.valueOf(this.f65964x6f12d422));
        }
        if (this.f317359i) {
            contentValues.put("hourOfDay", java.lang.Integer.valueOf(this.f65965xd557edbc));
        }
        if (this.f317360m) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f65970x2262335f));
        }
        if (this.f317361n) {
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f65969x9de75411));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseChattingEvent", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ChattingEvent ( ");
        l75.e0 e0Var = f317353z;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317343p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChattingEvent", "createTableSql %s", str2);
            k0Var.A("ChattingEvent", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ChattingEvent", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChattingEvent", "updateTableSql %s", str3);
            k0Var.A("ChattingEvent", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChattingEvent", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317353z;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317342o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317342o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("talker")) {
            this.f65968x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f317354d = true;
            }
        }
        if (contentValues.containsKey("msgid")) {
            this.f65967x297eb8d7 = contentValues.getAsLong("msgid").longValue();
            if (z17) {
                this.f317355e = true;
            }
        }
        if (contentValues.containsKey("isfrom")) {
            this.f65966xff84aeb9 = contentValues.getAsInteger("isfrom").intValue();
            if (z17) {
                this.f317356f = true;
            }
        }
        if (contentValues.containsKey("action")) {
            this.f65963xf102ad1b = contentValues.getAsInteger("action").intValue();
            if (z17) {
                this.f317357g = true;
            }
        }
        if (contentValues.containsKey("dayOfWeek")) {
            this.f65964x6f12d422 = contentValues.getAsInteger("dayOfWeek").intValue();
            if (z17) {
                this.f317358h = true;
            }
        }
        if (contentValues.containsKey("hourOfDay")) {
            this.f65965xd557edbc = contentValues.getAsInteger("hourOfDay").intValue();
            if (z17) {
                this.f317359i = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f65970x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f317360m = true;
            }
        }
        if (contentValues.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            this.f65969x9de75411 = contentValues.getAsLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6).longValue();
            if (z17) {
                this.f317361n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
