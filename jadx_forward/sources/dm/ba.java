package dm;

/* loaded from: classes4.dex */
public class ba extends l75.f0 {
    public static final l75.e0 A;
    public static final o75.e B;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f317441o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f317442p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f317443q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317444r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317445s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317446t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317447u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317448v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317449w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317450x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317451y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f317452z;

    /* renamed from: field_createTime */
    public long f65999xac3be4e;

    /* renamed from: field_data */
    public byte[] f66000x225a93cf;

    /* renamed from: field_expireTime */
    public long f66001x876650f1;

    /* renamed from: field_id */
    public java.lang.String f66002xc8a07680;

    /* renamed from: field_indexData */
    public java.lang.String f66003x6a74fe97;

    /* renamed from: field_originId */
    public java.lang.String f66004x6ff59086;

    /* renamed from: field_type */
    public int f66005x2262335f;

    /* renamed from: field_updateTime */
    public long f66006xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317453d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317454e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317455f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317456g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317457h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317458i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317459m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317460n = true;

    static {
        p75.n0 n0Var = new p75.n0("SecReportDataInfo");
        f317441o = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317442p = new p75.d("expireTime", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317443q = new java.lang.String[0];
        f317444r = 3355;
        f317445s = 1379043041;
        f317446t = 1369213417;
        f317447u = -295931082;
        f317448v = -834724724;
        f317449w = 3575610;
        f317450x = 3076010;
        f317451y = -808004708;
        f317452z = 108705909;
        A = m124821x3593deb(dm.ba.class);
        B = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124821x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66865x76d1ec5a;
        e0Var.f398488d.put(dm.i4.f66865x76d1ec5a, "TEXT PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66865x76d1ec5a;
        e0Var.f398487c[1] = "originId";
        e0Var.f398488d.put("originId", "TEXT default '' ");
        e0Var.f398487c[2] = "createTime";
        e0Var.f398488d.put("createTime", "LONG default '0' ");
        e0Var.f398487c[3] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[4] = "expireTime";
        e0Var.f398488d.put("expireTime", "LONG default '0' ");
        e0Var.f398487c[5] = "type";
        e0Var.f398488d.put("type", "INTEGER default '0' ");
        e0Var.f398487c[6] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "BLOB");
        e0Var.f398487c[7] = "indexData";
        e0Var.f398488d.put("indexData", "TEXT default '' ");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " id TEXT PRIMARY KEY ,  originId TEXT default '' ,  createTime LONG default '0' ,  updateTime LONG default '0' ,  expireTime LONG default '0' ,  type INTEGER default '0' ,  data BLOB,  indexData TEXT default '' ";
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
            if (f317444r == hashCode) {
                try {
                    this.f66002xc8a07680 = cursor.getString(i17);
                    this.f317453d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSecReportDataInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317445s == hashCode) {
                try {
                    this.f66004x6ff59086 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSecReportDataInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317446t == hashCode) {
                try {
                    this.f65999xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSecReportDataInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317447u == hashCode) {
                try {
                    this.f66006xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSecReportDataInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317448v == hashCode) {
                try {
                    this.f66001x876650f1 = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSecReportDataInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317449w == hashCode) {
                try {
                    this.f66005x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSecReportDataInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317450x == hashCode) {
                try {
                    this.f66000x225a93cf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSecReportDataInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317451y == hashCode) {
                try {
                    this.f66003x6a74fe97 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSecReportDataInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317452z == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317453d) {
            contentValues.put(dm.i4.f66865x76d1ec5a, this.f66002xc8a07680);
        }
        if (this.f66004x6ff59086 == null) {
            this.f66004x6ff59086 = "";
        }
        if (this.f317454e) {
            contentValues.put("originId", this.f66004x6ff59086);
        }
        if (this.f317455f) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f65999xac3be4e));
        }
        if (this.f317456g) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f66006xa783a79b));
        }
        if (this.f317457h) {
            contentValues.put("expireTime", java.lang.Long.valueOf(this.f66001x876650f1));
        }
        if (this.f317458i) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f66005x2262335f));
        }
        if (this.f317459m) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f66000x225a93cf);
        }
        if (this.f66003x6a74fe97 == null) {
            this.f66003x6a74fe97 = "";
        }
        if (this.f317460n) {
            contentValues.put("indexData", this.f66003x6a74fe97);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSecReportDataInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SecReportDataInfo ( ");
        l75.e0 e0Var = A;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317443q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSecReportDataInfo", "createTableSql %s", str2);
            k0Var.A("SecReportDataInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "SecReportDataInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSecReportDataInfo", "updateTableSql %s", str3);
            k0Var.A("SecReportDataInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSecReportDataInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return B;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66002xc8a07680;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317441o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317441o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66865x76d1ec5a)) {
            this.f66002xc8a07680 = contentValues.getAsString(dm.i4.f66865x76d1ec5a);
            if (z17) {
                this.f317453d = true;
            }
        }
        if (contentValues.containsKey("originId")) {
            this.f66004x6ff59086 = contentValues.getAsString("originId");
            if (z17) {
                this.f317454e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f65999xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f317455f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f66006xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f317456g = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.f66001x876650f1 = contentValues.getAsLong("expireTime").longValue();
            if (z17) {
                this.f317457h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f66005x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f317458i = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)) {
            this.f66000x225a93cf = contentValues.getAsByteArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            if (z17) {
                this.f317459m = true;
            }
        }
        if (contentValues.containsKey("indexData")) {
            this.f66003x6a74fe97 = contentValues.getAsString("indexData");
            if (z17) {
                this.f317460n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
