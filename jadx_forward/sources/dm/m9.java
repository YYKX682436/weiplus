package dm;

/* loaded from: classes4.dex */
public class m9 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f320062n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f320063o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320064p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320065q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320066r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320067s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320068t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320069u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320070v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320071w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f320072x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f320073y;

    /* renamed from: field_appId */
    public java.lang.String f67450x28d45f97;

    /* renamed from: field_cgiList */
    public java.lang.String f67451x9f4a887e;

    /* renamed from: field_endTime */
    public long f67452x14c61803;

    /* renamed from: field_reportId */
    public int f67453x44eeb14;

    /* renamed from: field_sceneList */
    public java.lang.String f67454x1ae4245;

    /* renamed from: field_startTime */
    public long f67455x1bb3b54a;

    /* renamed from: field_username */
    public java.lang.String f67456xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320074d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320075e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320076f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320077g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320078h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320079i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320080m = true;

    static {
        p75.n0 n0Var = new p75.n0("PredownloadBlockCgiRequest");
        f320062n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320063o = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS PredownloadBlockCgiRequestAppIDIndex ON PredownloadBlockCgiRequest(appId)", "CREATE INDEX IF NOT EXISTS PredownloadBlockCgiRequestStartTimeIndex ON PredownloadBlockCgiRequest(startTime)", "CREATE INDEX IF NOT EXISTS PredownloadBlockCgiRequestEndTimeIndex ON PredownloadBlockCgiRequest(endTime)"};
        f320064p = -265713450;
        f320065q = 93028124;
        f320066r = -2129294769;
        f320067s = -1607243192;
        f320068t = 1729107786;
        f320069u = 716692163;
        f320070v = -427040401;
        f320071w = 108705909;
        f320072x = m125229x3593deb(dm.m9.class);
        f320073y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125229x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66875xa013b0d5;
        e0Var.f398487c[1] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[2] = "startTime";
        e0Var.f398488d.put("startTime", "LONG");
        e0Var.f398487c[3] = "endTime";
        e0Var.f398488d.put("endTime", "LONG");
        e0Var.f398487c[4] = "sceneList";
        e0Var.f398488d.put("sceneList", "TEXT");
        e0Var.f398487c[5] = "cgiList";
        e0Var.f398488d.put("cgiList", "TEXT");
        e0Var.f398487c[6] = "reportId";
        e0Var.f398488d.put("reportId", "INTEGER");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " username TEXT PRIMARY KEY ,  appId TEXT,  startTime LONG,  endTime LONG,  sceneList TEXT,  cgiList TEXT,  reportId INTEGER";
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
            if (f320064p == hashCode) {
                try {
                    this.f67456xdec927b = cursor.getString(i17);
                    this.f320074d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320065q == hashCode) {
                try {
                    this.f67450x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320066r == hashCode) {
                try {
                    this.f67455x1bb3b54a = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320067s == hashCode) {
                try {
                    this.f67452x14c61803 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320068t == hashCode) {
                try {
                    this.f67454x1ae4245 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320069u == hashCode) {
                try {
                    this.f67451x9f4a887e = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320070v == hashCode) {
                try {
                    this.f67453x44eeb14 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadBlockCgiRequest", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320071w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320074d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f67456xdec927b);
        }
        if (this.f320075e) {
            contentValues.put("appId", this.f67450x28d45f97);
        }
        if (this.f320076f) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.f67455x1bb3b54a));
        }
        if (this.f320077g) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.f67452x14c61803));
        }
        if (this.f320078h) {
            contentValues.put("sceneList", this.f67454x1ae4245);
        }
        if (this.f320079i) {
            contentValues.put("cgiList", this.f67451x9f4a887e);
        }
        if (this.f320080m) {
            contentValues.put("reportId", java.lang.Integer.valueOf(this.f67453x44eeb14));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BasePredownloadBlockCgiRequest", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PredownloadBlockCgiRequest ( ");
        l75.e0 e0Var = f320072x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320063o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePredownloadBlockCgiRequest", "createTableSql %s", str2);
            k0Var.A("PredownloadBlockCgiRequest", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "PredownloadBlockCgiRequest", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePredownloadBlockCgiRequest", "updateTableSql %s", str3);
            k0Var.A("PredownloadBlockCgiRequest", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePredownloadBlockCgiRequest", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320072x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320073y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67456xdec927b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320062n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320062n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f67456xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f320074d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.f67450x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f320075e = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.f67455x1bb3b54a = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f320076f = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.f67452x14c61803 = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f320077g = true;
            }
        }
        if (contentValues.containsKey("sceneList")) {
            this.f67454x1ae4245 = contentValues.getAsString("sceneList");
            if (z17) {
                this.f320078h = true;
            }
        }
        if (contentValues.containsKey("cgiList")) {
            this.f67451x9f4a887e = contentValues.getAsString("cgiList");
            if (z17) {
                this.f320079i = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.f67453x44eeb14 = contentValues.getAsInteger("reportId").intValue();
            if (z17) {
                this.f320080m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
