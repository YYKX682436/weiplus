package dm;

/* loaded from: classes7.dex */
public class p extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f320589n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f320590o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320591p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320592q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320593r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320594s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320595t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320596u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320597v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320598w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f320599x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f320600y;

    /* renamed from: field_id */
    private java.lang.String f67868xc8a07680;

    /* renamed from: field_message_aid */
    private long f67869x37b9a53f;

    /* renamed from: field_message_op_time */
    private long f67870xbc4ff4ee;

    /* renamed from: field_message_slotid */
    private long f67871xebad20b6;

    /* renamed from: field_message_traceid */
    private java.lang.String f67872xc84d33a3;

    /* renamed from: field_op_code */
    private int f67873x28ee8b46;

    /* renamed from: field_timestamp */
    private long f67874x9de75411;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320601d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320602e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320603f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320604g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320605h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320606i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320607m = false;

    static {
        p75.n0 n0Var = new p75.n0("AdvertisePushDBInfo");
        f320589n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320590o = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TimestampIndex ON AdvertisePushDBInfo(timestamp)", "CREATE INDEX IF NOT EXISTS AdvertisePushDBInfoSlotId ON AdvertisePushDBInfo(message_slotid)"};
        f320591p = 3355;
        f320592q = 55126294;
        f320593r = -1269047925;
        f320594s = -872788732;
        f320595t = 1001432785;
        f320596u = 1824338483;
        f320597v = 2025484520;
        f320598w = 108705909;
        f320599x = m125380x3593deb(dm.p.class);
        f320600y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125380x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66865x76d1ec5a;
        e0Var.f398488d.put(dm.i4.f66865x76d1ec5a, "TEXT PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66865x76d1ec5a;
        e0Var.f398487c[1] = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6;
        e0Var.f398488d.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "LONG default '0' ");
        e0Var.f398487c[2] = "op_code";
        e0Var.f398488d.put("op_code", "INTEGER default '0' ");
        e0Var.f398487c[3] = "message_aid";
        e0Var.f398488d.put("message_aid", "LONG default '0' ");
        e0Var.f398487c[4] = "message_slotid";
        e0Var.f398488d.put("message_slotid", "LONG default '0' ");
        e0Var.f398487c[5] = "message_op_time";
        e0Var.f398488d.put("message_op_time", "LONG default '0' ");
        e0Var.f398487c[6] = "message_traceid";
        e0Var.f398488d.put("message_traceid", "TEXT default '' ");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " id TEXT PRIMARY KEY ,  timestamp LONG default '0' ,  op_code INTEGER default '0' ,  message_aid LONG default '0' ,  message_slotid LONG default '0' ,  message_op_time LONG default '0' ,  message_traceid TEXT default '' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        return e0Var;
    }

    public void A0(java.lang.String str) {
        this.f67868xc8a07680 = str;
        this.f320601d = true;
    }

    public void D0(long j17) {
        this.f67869x37b9a53f = j17;
        this.f320604g = true;
    }

    public void F0(long j17) {
        this.f67870xbc4ff4ee = j17;
        this.f320606i = true;
    }

    public void G0(long j17) {
        this.f67871xebad20b6 = j17;
        this.f320605h = true;
    }

    public void I0(java.lang.String str) {
        this.f67872xc84d33a3 = str;
        this.f320607m = true;
    }

    public void J0(int i17) {
        this.f67873x28ee8b46 = i17;
        this.f320603f = true;
    }

    public void L0(long j17) {
        this.f67874x9de75411 = j17;
        this.f320602e = true;
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
            if (f320591p == hashCode) {
                try {
                    this.f67868xc8a07680 = cursor.getString(i17);
                    this.f320601d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdvertisePushDBInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320592q == hashCode) {
                try {
                    this.f67874x9de75411 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdvertisePushDBInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320593r == hashCode) {
                try {
                    this.f67873x28ee8b46 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdvertisePushDBInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320594s == hashCode) {
                try {
                    this.f67869x37b9a53f = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdvertisePushDBInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320595t == hashCode) {
                try {
                    this.f67871xebad20b6 = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdvertisePushDBInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320596u == hashCode) {
                try {
                    this.f67870xbc4ff4ee = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdvertisePushDBInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320597v == hashCode) {
                try {
                    this.f67872xc84d33a3 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdvertisePushDBInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320598w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320601d) {
            contentValues.put(dm.i4.f66865x76d1ec5a, this.f67868xc8a07680);
        }
        if (this.f320602e) {
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f67874x9de75411));
        }
        if (this.f320603f) {
            contentValues.put("op_code", java.lang.Integer.valueOf(this.f67873x28ee8b46));
        }
        if (this.f320604g) {
            contentValues.put("message_aid", java.lang.Long.valueOf(this.f67869x37b9a53f));
        }
        if (this.f320605h) {
            contentValues.put("message_slotid", java.lang.Long.valueOf(this.f67871xebad20b6));
        }
        if (this.f320606i) {
            contentValues.put("message_op_time", java.lang.Long.valueOf(this.f67870xbc4ff4ee));
        }
        if (this.f67872xc84d33a3 == null) {
            this.f67872xc84d33a3 = "";
        }
        if (this.f320607m) {
            contentValues.put("message_traceid", this.f67872xc84d33a3);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAdvertisePushDBInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AdvertisePushDBInfo ( ");
        l75.e0 e0Var = f320599x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320590o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAdvertisePushDBInfo", "createTableSql %s", str2);
            k0Var.A("AdvertisePushDBInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AdvertisePushDBInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAdvertisePushDBInfo", "updateTableSql %s", str3);
            k0Var.A("AdvertisePushDBInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAdvertisePushDBInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320599x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320600y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67868xc8a07680;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320589n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320589n.f434209a;
    }

    public long t0() {
        return this.f67869x37b9a53f;
    }

    public long u0() {
        return this.f67870xbc4ff4ee;
    }

    public long v0() {
        return this.f67871xebad20b6;
    }

    public java.lang.String w0() {
        return this.f67872xc84d33a3;
    }

    public int y0() {
        return this.f67873x28ee8b46;
    }

    public long z0() {
        return this.f67874x9de75411;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66865x76d1ec5a)) {
            this.f67868xc8a07680 = contentValues.getAsString(dm.i4.f66865x76d1ec5a);
            if (z17) {
                this.f320601d = true;
            }
        }
        if (contentValues.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            this.f67874x9de75411 = contentValues.getAsLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6).longValue();
            if (z17) {
                this.f320602e = true;
            }
        }
        if (contentValues.containsKey("op_code")) {
            this.f67873x28ee8b46 = contentValues.getAsInteger("op_code").intValue();
            if (z17) {
                this.f320603f = true;
            }
        }
        if (contentValues.containsKey("message_aid")) {
            this.f67869x37b9a53f = contentValues.getAsLong("message_aid").longValue();
            if (z17) {
                this.f320604g = true;
            }
        }
        if (contentValues.containsKey("message_slotid")) {
            this.f67871xebad20b6 = contentValues.getAsLong("message_slotid").longValue();
            if (z17) {
                this.f320605h = true;
            }
        }
        if (contentValues.containsKey("message_op_time")) {
            this.f67870xbc4ff4ee = contentValues.getAsLong("message_op_time").longValue();
            if (z17) {
                this.f320606i = true;
            }
        }
        if (contentValues.containsKey("message_traceid")) {
            this.f67872xc84d33a3 = contentValues.getAsString("message_traceid");
            if (z17) {
                this.f320607m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
