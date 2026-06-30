package dm;

/* loaded from: classes8.dex */
public class o7 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f320495n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f320496o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320497p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320498q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320499r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320500s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320501t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320502u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320503v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320504w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f320505x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f320506y;

    /* renamed from: field_anchorUsername */
    public java.lang.String f67831x1e43a490;

    /* renamed from: field_hostRoomId */
    public java.lang.String f67832x7560f783;

    /* renamed from: field_isSender */
    public boolean f67833xff015a4;

    /* renamed from: field_liveId */
    public long f67834x41d5e0c;

    /* renamed from: field_liveName */
    public java.lang.String f67835x7240533c;

    /* renamed from: field_thumbUrl */
    public java.lang.String f67836x7b284d5e;

    /* renamed from: field_timeStamp */
    public long f67837x9c2463f1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320507d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320508e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320509f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320510g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320511h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320512i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320513m = true;

    static {
        p75.n0 n0Var = new p75.n0("LiveTipsBar");
        f320495n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320496o = new java.lang.String[0];
        f320497p = -1102434521;
        f320498q = -1137065186;
        f320499r = 1417496983;
        f320500s = 1566917561;
        f320501t = 1850157739;
        f320502u = -231928833;
        f320503v = 25573622;
        f320504w = 108705909;
        f320505x = m125367x3593deb(dm.o7.class);
        f320506y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125367x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "liveId";
        e0Var.f398488d.put("liveId", "LONG default '0'  PRIMARY KEY ");
        e0Var.f398486b = "liveId";
        e0Var.f398487c[1] = "hostRoomId";
        e0Var.f398488d.put("hostRoomId", "TEXT default '' ");
        e0Var.f398487c[2] = "liveName";
        e0Var.f398488d.put("liveName", "TEXT default '' ");
        e0Var.f398487c[3] = "thumbUrl";
        e0Var.f398488d.put("thumbUrl", "TEXT default '' ");
        e0Var.f398487c[4] = "anchorUsername";
        e0Var.f398488d.put("anchorUsername", "TEXT default '' ");
        e0Var.f398487c[5] = "isSender";
        e0Var.f398488d.put("isSender", "INTEGER default 'false' ");
        e0Var.f398487c[6] = "timeStamp";
        e0Var.f398488d.put("timeStamp", "LONG default '0' ");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " liveId LONG default '0'  PRIMARY KEY ,  hostRoomId TEXT default '' ,  liveName TEXT default '' ,  thumbUrl TEXT default '' ,  anchorUsername TEXT default '' ,  isSender INTEGER default 'false' ,  timeStamp LONG default '0' ";
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
            if (f320497p == hashCode) {
                try {
                    this.f67834x41d5e0c = cursor.getLong(i17);
                    this.f320507d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveTipsBar", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320498q == hashCode) {
                try {
                    this.f67832x7560f783 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveTipsBar", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320499r == hashCode) {
                try {
                    this.f67835x7240533c = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveTipsBar", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320500s == hashCode) {
                try {
                    this.f67836x7b284d5e = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveTipsBar", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320501t == hashCode) {
                try {
                    this.f67831x1e43a490 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveTipsBar", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320502u == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f67833xff015a4 = z17;
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveTipsBar", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320503v == hashCode) {
                try {
                    this.f67837x9c2463f1 = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveTipsBar", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320504w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320507d) {
            contentValues.put("liveId", java.lang.Long.valueOf(this.f67834x41d5e0c));
        }
        if (this.f67832x7560f783 == null) {
            this.f67832x7560f783 = "";
        }
        if (this.f320508e) {
            contentValues.put("hostRoomId", this.f67832x7560f783);
        }
        if (this.f67835x7240533c == null) {
            this.f67835x7240533c = "";
        }
        if (this.f320509f) {
            contentValues.put("liveName", this.f67835x7240533c);
        }
        if (this.f67836x7b284d5e == null) {
            this.f67836x7b284d5e = "";
        }
        if (this.f320510g) {
            contentValues.put("thumbUrl", this.f67836x7b284d5e);
        }
        if (this.f67831x1e43a490 == null) {
            this.f67831x1e43a490 = "";
        }
        if (this.f320511h) {
            contentValues.put("anchorUsername", this.f67831x1e43a490);
        }
        if (this.f320512i) {
            if (this.f67833xff015a4) {
                contentValues.put("isSender", (java.lang.Integer) 1);
            } else {
                contentValues.put("isSender", (java.lang.Integer) 0);
            }
        }
        if (this.f320513m) {
            contentValues.put("timeStamp", java.lang.Long.valueOf(this.f67837x9c2463f1));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLiveTipsBar", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiveTipsBar ( ");
        l75.e0 e0Var = f320505x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320496o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveTipsBar", "createTableSql %s", str2);
            k0Var.A("LiveTipsBar", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LiveTipsBar", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveTipsBar", "updateTableSql %s", str3);
            k0Var.A("LiveTipsBar", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveTipsBar", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320505x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320506y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f67834x41d5e0c);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320495n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320495n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("liveId")) {
            this.f67834x41d5e0c = contentValues.getAsLong("liveId").longValue();
            if (z17) {
                this.f320507d = true;
            }
        }
        if (contentValues.containsKey("hostRoomId")) {
            this.f67832x7560f783 = contentValues.getAsString("hostRoomId");
            if (z17) {
                this.f320508e = true;
            }
        }
        if (contentValues.containsKey("liveName")) {
            this.f67835x7240533c = contentValues.getAsString("liveName");
            if (z17) {
                this.f320509f = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.f67836x7b284d5e = contentValues.getAsString("thumbUrl");
            if (z17) {
                this.f320510g = true;
            }
        }
        if (contentValues.containsKey("anchorUsername")) {
            this.f67831x1e43a490 = contentValues.getAsString("anchorUsername");
            if (z17) {
                this.f320511h = true;
            }
        }
        if (contentValues.containsKey("isSender")) {
            this.f67833xff015a4 = contentValues.getAsInteger("isSender").intValue() != 0;
            if (z17) {
                this.f320512i = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.f67837x9c2463f1 = contentValues.getAsLong("timeStamp").longValue();
            if (z17) {
                this.f320513m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
