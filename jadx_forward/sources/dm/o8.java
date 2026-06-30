package dm;

/* loaded from: classes4.dex */
public class o8 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f320514h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f320515i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320516m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320517n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320518o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320519p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320520q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f320521r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f320522s;

    /* renamed from: field_ack_key */
    public java.lang.String f67838x2ecf8764;

    /* renamed from: field_receive_time */
    public long f67839xde2d9dce;

    /* renamed from: field_reqkey */
    public java.lang.String f67840xe1fe7e6;

    /* renamed from: field_status */
    public int f67841x10a0fed7;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320523d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320524e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320525f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320526g = true;

    static {
        p75.n0 n0Var = new p75.n0("OfflineOrderStatus");
        f320514h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320515i = new java.lang.String[0];
        f320516m = -934495999;
        f320517n = -1170417239;
        f320518o = -892481550;
        f320519p = -771625303;
        f320520q = 108705909;
        f320521r = m125369x3593deb(dm.o8.class);
        f320522s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125369x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "reqkey";
        e0Var.f398488d.put("reqkey", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "reqkey";
        e0Var.f398487c[1] = "ack_key";
        e0Var.f398488d.put("ack_key", "TEXT");
        e0Var.f398487c[2] = "status";
        e0Var.f398488d.put("status", "INTEGER");
        e0Var.f398487c[3] = "receive_time";
        e0Var.f398488d.put("receive_time", "LONG");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " reqkey TEXT PRIMARY KEY ,  ack_key TEXT,  status INTEGER,  receive_time LONG";
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
            if (f320516m == hashCode) {
                try {
                    this.f67840xe1fe7e6 = cursor.getString(i17);
                    this.f320523d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOfflineOrderStatus", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320517n == hashCode) {
                try {
                    this.f67838x2ecf8764 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOfflineOrderStatus", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320518o == hashCode) {
                try {
                    this.f67841x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOfflineOrderStatus", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320519p == hashCode) {
                try {
                    this.f67839xde2d9dce = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOfflineOrderStatus", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320520q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320523d) {
            contentValues.put("reqkey", this.f67840xe1fe7e6);
        }
        if (this.f320524e) {
            contentValues.put("ack_key", this.f67838x2ecf8764);
        }
        if (this.f320525f) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f67841x10a0fed7));
        }
        if (this.f320526g) {
            contentValues.put("receive_time", java.lang.Long.valueOf(this.f67839xde2d9dce));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOfflineOrderStatus", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OfflineOrderStatus ( ");
        l75.e0 e0Var = f320521r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320515i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOfflineOrderStatus", "createTableSql %s", str2);
            k0Var.A("OfflineOrderStatus", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "OfflineOrderStatus", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOfflineOrderStatus", "updateTableSql %s", str3);
            k0Var.A("OfflineOrderStatus", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOfflineOrderStatus", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320521r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320522s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67840xe1fe7e6;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320514h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320514h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("reqkey")) {
            this.f67840xe1fe7e6 = contentValues.getAsString("reqkey");
            if (z17) {
                this.f320523d = true;
            }
        }
        if (contentValues.containsKey("ack_key")) {
            this.f67838x2ecf8764 = contentValues.getAsString("ack_key");
            if (z17) {
                this.f320524e = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f67841x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f320525f = true;
            }
        }
        if (contentValues.containsKey("receive_time")) {
            this.f67839xde2d9dce = contentValues.getAsLong("receive_time").longValue();
            if (z17) {
                this.f320526g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
