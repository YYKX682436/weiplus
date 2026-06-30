package dm;

/* loaded from: classes8.dex */
public class xb extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f322633n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f322634o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322635p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322636q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322637r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322638s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f322639t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f322640u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f322641v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f322642w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f322643x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f322644y;

    /* renamed from: field_canRecvMsg */
    public boolean f69155xa5ffa630;

    /* renamed from: field_isHello */
    public int f69156xef647383;

    /* renamed from: field_selfUserName */
    public java.lang.String f69157x5568d387;

    /* renamed from: field_sessionId */
    public java.lang.String f69158xbed8694c;

    /* renamed from: field_status */
    public int f69159x10a0fed7;

    /* renamed from: field_talkerUserName */
    public java.lang.String f69160x3e123854;

    /* renamed from: field_updateTime */
    public long f69161xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322645d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322646e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322647f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322648g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322649h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322650i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322651m = true;

    static {
        p75.n0 n0Var = new p75.n0("W1wSessionInfo");
        f322633n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322634o = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS W1wSessionInfo_sessionId_index ON W1wSessionInfo(sessionId)", "CREATE INDEX IF NOT EXISTS W1wSessionInfo_talkerUserName_index ON W1wSessionInfo(talkerUserName)", "CREATE INDEX IF NOT EXISTS W1wSessionInfo_status_index ON W1wSessionInfo(status)", "CREATE INDEX IF NOT EXISTS W1wSessionInfo_selfUserName_index ON W1wSessionInfo(selfUserName)"};
        f322635p = 607796817;
        f322636q = -1911177617;
        f322637r = -295931082;
        f322638s = -892481550;
        f322639t = 1228743778;
        f322640u = -321359413;
        f322641v = 2060568008;
        f322642w = 108705909;
        f322643x = m125693x3593deb(dm.xb.class);
        f322644y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125693x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984;
        e0Var.f398488d.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984;
        e0Var.f398487c[1] = "talkerUserName";
        e0Var.f398488d.put("talkerUserName", "TEXT default '' ");
        e0Var.f398487c[2] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[3] = "status";
        e0Var.f398488d.put("status", "INTEGER");
        e0Var.f398487c[4] = "selfUserName";
        e0Var.f398488d.put("selfUserName", "TEXT default '' ");
        e0Var.f398487c[5] = "canRecvMsg";
        e0Var.f398488d.put("canRecvMsg", "INTEGER default 'true' ");
        e0Var.f398487c[6] = "isHello";
        e0Var.f398488d.put("isHello", "INTEGER default '0' ");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " sessionId TEXT default ''  PRIMARY KEY ,  talkerUserName TEXT default '' ,  updateTime LONG default '0' ,  status INTEGER,  selfUserName TEXT default '' ,  canRecvMsg INTEGER default 'true' ,  isHello INTEGER default '0' ";
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
            if (f322635p == hashCode) {
                try {
                    this.f69158xbed8694c = cursor.getString(i17);
                    this.f322645d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wSessionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322636q == hashCode) {
                try {
                    this.f69160x3e123854 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wSessionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322637r == hashCode) {
                try {
                    this.f69161xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wSessionInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322638s == hashCode) {
                try {
                    this.f69159x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wSessionInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322639t == hashCode) {
                try {
                    this.f69157x5568d387 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wSessionInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322640u == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f69155xa5ffa630 = z17;
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wSessionInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322641v == hashCode) {
                try {
                    this.f69156xef647383 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wSessionInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322642w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f69158xbed8694c == null) {
            this.f69158xbed8694c = "";
        }
        if (this.f322645d) {
            contentValues.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f69158xbed8694c);
        }
        if (this.f69160x3e123854 == null) {
            this.f69160x3e123854 = "";
        }
        if (this.f322646e) {
            contentValues.put("talkerUserName", this.f69160x3e123854);
        }
        if (this.f322647f) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f69161xa783a79b));
        }
        if (this.f322648g) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f69159x10a0fed7));
        }
        if (this.f69157x5568d387 == null) {
            this.f69157x5568d387 = "";
        }
        if (this.f322649h) {
            contentValues.put("selfUserName", this.f69157x5568d387);
        }
        if (this.f322650i) {
            if (this.f69155xa5ffa630) {
                contentValues.put("canRecvMsg", (java.lang.Integer) 1);
            } else {
                contentValues.put("canRecvMsg", (java.lang.Integer) 0);
            }
        }
        if (this.f322651m) {
            contentValues.put("isHello", java.lang.Integer.valueOf(this.f69156xef647383));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseW1wSessionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS W1wSessionInfo ( ");
        l75.e0 e0Var = f322643x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322634o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseW1wSessionInfo", "createTableSql %s", str2);
            k0Var.A("W1wSessionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "W1wSessionInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseW1wSessionInfo", "updateTableSql %s", str3);
            k0Var.A("W1wSessionInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseW1wSessionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322643x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322644y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69158xbed8694c;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322633n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322633n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) {
            this.f69158xbed8694c = contentValues.getAsString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            if (z17) {
                this.f322645d = true;
            }
        }
        if (contentValues.containsKey("talkerUserName")) {
            this.f69160x3e123854 = contentValues.getAsString("talkerUserName");
            if (z17) {
                this.f322646e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f69161xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f322647f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f69159x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f322648g = true;
            }
        }
        if (contentValues.containsKey("selfUserName")) {
            this.f69157x5568d387 = contentValues.getAsString("selfUserName");
            if (z17) {
                this.f322649h = true;
            }
        }
        if (contentValues.containsKey("canRecvMsg")) {
            this.f69155xa5ffa630 = contentValues.getAsInteger("canRecvMsg").intValue() != 0;
            if (z17) {
                this.f322650i = true;
            }
        }
        if (contentValues.containsKey("isHello")) {
            this.f69156xef647383 = contentValues.getAsInteger("isHello").intValue();
            if (z17) {
                this.f322651m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
