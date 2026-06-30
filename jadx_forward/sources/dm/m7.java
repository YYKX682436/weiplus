package dm;

/* loaded from: classes7.dex */
public class m7 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f320027i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f320028m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320029n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320030o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320031p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320032q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320033r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320034s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f320035t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f320036u;

    /* renamed from: field_action */
    public int f67440xf102ad1b;

    /* renamed from: field_dayOfWeek */
    public int f67441x6f12d422;

    /* renamed from: field_hasDisturbance */
    public int f67442xa78282b9;

    /* renamed from: field_hourOfDay */
    public int f67443xd557edbc;

    /* renamed from: field_timestamp */
    public long f67444x9de75411;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320037d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320038e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320039f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320040g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320041h = true;

    static {
        p75.n0 n0Var = new p75.n0("LiveHomeNoRedDotEvent");
        f320027i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320028m = new java.lang.String[0];
        f320029n = -142210860;
        f320030o = -1422950858;
        f320031p = -730552025;
        f320032q = 985252545;
        f320033r = 55126294;
        f320034s = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "hasDisturbance";
        ((java.util.HashMap) e0Var.f398488d).put("hasDisturbance", "INTEGER");
        e0Var.f398487c[1] = "action";
        ((java.util.HashMap) e0Var.f398488d).put("action", "INTEGER");
        e0Var.f398487c[2] = "dayOfWeek";
        ((java.util.HashMap) e0Var.f398488d).put("dayOfWeek", "INTEGER");
        e0Var.f398487c[3] = "hourOfDay";
        ((java.util.HashMap) e0Var.f398488d).put("hourOfDay", "INTEGER");
        e0Var.f398487c[4] = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6;
        ((java.util.HashMap) e0Var.f398488d).put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "LONG");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " hasDisturbance INTEGER,  action INTEGER,  dayOfWeek INTEGER,  hourOfDay INTEGER,  timestamp LONG";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f320035t = e0Var;
        f320036u = new o75.e();
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
            if (f320029n == hashCode) {
                try {
                    this.f67442xa78282b9 = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320030o == hashCode) {
                try {
                    this.f67440xf102ad1b = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320031p == hashCode) {
                try {
                    this.f67441x6f12d422 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320032q == hashCode) {
                try {
                    this.f67443xd557edbc = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320033r == hashCode) {
                try {
                    this.f67444x9de75411 = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320034s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320037d) {
            contentValues.put("hasDisturbance", java.lang.Integer.valueOf(this.f67442xa78282b9));
        }
        if (this.f320038e) {
            contentValues.put("action", java.lang.Integer.valueOf(this.f67440xf102ad1b));
        }
        if (this.f320039f) {
            contentValues.put("dayOfWeek", java.lang.Integer.valueOf(this.f67441x6f12d422));
        }
        if (this.f320040g) {
            contentValues.put("hourOfDay", java.lang.Integer.valueOf(this.f67443xd557edbc));
        }
        if (this.f320041h) {
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f67444x9de75411));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiveHomeNoRedDotEvent ( ");
        l75.e0 e0Var = f320035t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320028m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", "createTableSql %s", str2);
            k0Var.A("LiveHomeNoRedDotEvent", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LiveHomeNoRedDotEvent", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", "updateTableSql %s", str3);
            k0Var.A("LiveHomeNoRedDotEvent", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveHomeNoRedDotEvent", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320035t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320036u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320027i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320027i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("hasDisturbance")) {
            this.f67442xa78282b9 = contentValues.getAsInteger("hasDisturbance").intValue();
            if (z17) {
                this.f320037d = true;
            }
        }
        if (contentValues.containsKey("action")) {
            this.f67440xf102ad1b = contentValues.getAsInteger("action").intValue();
            if (z17) {
                this.f320038e = true;
            }
        }
        if (contentValues.containsKey("dayOfWeek")) {
            this.f67441x6f12d422 = contentValues.getAsInteger("dayOfWeek").intValue();
            if (z17) {
                this.f320039f = true;
            }
        }
        if (contentValues.containsKey("hourOfDay")) {
            this.f67443xd557edbc = contentValues.getAsInteger("hourOfDay").intValue();
            if (z17) {
                this.f320040g = true;
            }
        }
        if (contentValues.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            this.f67444x9de75411 = contentValues.getAsLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6).longValue();
            if (z17) {
                this.f320041h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
