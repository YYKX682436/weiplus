package dm;

/* loaded from: classes8.dex */
public class o3 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f320420q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f320421r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320422s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320423t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320424u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320425v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320426w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f320427x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f320428y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f320429z;

    /* renamed from: field_failNum */
    public int f67779x33ce4d43;

    /* renamed from: field_favTime */
    public long f67780x347afa43;

    /* renamed from: field_imgDirPath */
    public java.lang.String f67781x9ec3d174;

    /* renamed from: field_imgPaths */
    public java.lang.String f67782xf37e0490;

    /* renamed from: field_isReport */
    public int f67783xe3c50a3;

    /* renamed from: field_path */
    public java.lang.String f67784x2260084a;

    /* renamed from: field_size */
    public long f67785x22618426;

    /* renamed from: field_status */
    public int f67786x10a0fed7;

    /* renamed from: field_updateTime */
    public long f67787xa783a79b;

    /* renamed from: field_url */
    public java.lang.String f67788x4b6e88aa;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320430d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320431e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320432f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320433g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320434h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320435i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320436m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320437n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f320438o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f320439p = true;

    static {
        p75.n0 n0Var = new p75.n0("FavOffline");
        f320420q = n0Var;
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
        f320421r = new java.lang.String[0];
        f320422s = 116079;
        f320423t = 3530753;
        f320424u = 3433509;
        f320425v = -442721009;
        f320426w = -709166357;
        f320427x = -1075295096;
        f320428y = -295931082;
        f320429z = -892481550;
        A = -1086611576;
        B = -260487426;
        C = 108705909;
        D = m125359x3593deb(dm.o3.class);
        E = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125359x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f398487c = strArr;
        strArr[0] = "url";
        e0Var.f398488d.put("url", "TEXT");
        e0Var.f398487c[1] = "size";
        e0Var.f398488d.put("size", "LONG");
        e0Var.f398487c[2] = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714;
        e0Var.f398488d.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "TEXT");
        e0Var.f398487c[3] = "imgDirPath";
        e0Var.f398488d.put("imgDirPath", "TEXT");
        e0Var.f398487c[4] = "imgPaths";
        e0Var.f398488d.put("imgPaths", "TEXT");
        e0Var.f398487c[5] = "favTime";
        e0Var.f398488d.put("favTime", "LONG");
        e0Var.f398487c[6] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[7] = "status";
        e0Var.f398488d.put("status", "INTEGER");
        e0Var.f398487c[8] = "failNum";
        e0Var.f398488d.put("failNum", "INTEGER");
        e0Var.f398487c[9] = "isReport";
        e0Var.f398488d.put("isReport", "INTEGER");
        e0Var.f398487c[10] = "rowid";
        e0Var.f398489e = " url TEXT,  size LONG,  path TEXT,  imgDirPath TEXT,  imgPaths TEXT,  favTime LONG,  updateTime LONG,  status INTEGER,  failNum INTEGER,  isReport INTEGER";
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
            if (f320422s == hashCode) {
                try {
                    this.f67788x4b6e88aa = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavOffline", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320423t == hashCode) {
                try {
                    this.f67785x22618426 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavOffline", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320424u == hashCode) {
                try {
                    this.f67784x2260084a = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavOffline", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320425v == hashCode) {
                try {
                    this.f67781x9ec3d174 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavOffline", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320426w == hashCode) {
                try {
                    this.f67782xf37e0490 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavOffline", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320427x == hashCode) {
                try {
                    this.f67780x347afa43 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavOffline", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320428y == hashCode) {
                try {
                    this.f67787xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavOffline", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320429z == hashCode) {
                try {
                    this.f67786x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavOffline", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67779x33ce4d43 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavOffline", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67783xe3c50a3 = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavOffline", th15, "convertFrom %s", columnNames[i17]);
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
        if (this.f320430d) {
            contentValues.put("url", this.f67788x4b6e88aa);
        }
        if (this.f320431e) {
            contentValues.put("size", java.lang.Long.valueOf(this.f67785x22618426));
        }
        if (this.f320432f) {
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f67784x2260084a);
        }
        if (this.f320433g) {
            contentValues.put("imgDirPath", this.f67781x9ec3d174);
        }
        if (this.f320434h) {
            contentValues.put("imgPaths", this.f67782xf37e0490);
        }
        if (this.f320435i) {
            contentValues.put("favTime", java.lang.Long.valueOf(this.f67780x347afa43));
        }
        if (this.f320436m) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f67787xa783a79b));
        }
        if (this.f320437n) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f67786x10a0fed7));
        }
        if (this.f320438o) {
            contentValues.put("failNum", java.lang.Integer.valueOf(this.f67779x33ce4d43));
        }
        if (this.f320439p) {
            contentValues.put("isReport", java.lang.Integer.valueOf(this.f67783xe3c50a3));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFavOffline", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FavOffline ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320421r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavOffline", "createTableSql %s", str2);
            k0Var.A("FavOffline", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FavOffline", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavOffline", "updateTableSql %s", str3);
            k0Var.A("FavOffline", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavOffline", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return f320420q;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320420q.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("url")) {
            this.f67788x4b6e88aa = contentValues.getAsString("url");
            if (z17) {
                this.f320430d = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.f67785x22618426 = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f320431e = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)) {
            this.f67784x2260084a = contentValues.getAsString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            if (z17) {
                this.f320432f = true;
            }
        }
        if (contentValues.containsKey("imgDirPath")) {
            this.f67781x9ec3d174 = contentValues.getAsString("imgDirPath");
            if (z17) {
                this.f320433g = true;
            }
        }
        if (contentValues.containsKey("imgPaths")) {
            this.f67782xf37e0490 = contentValues.getAsString("imgPaths");
            if (z17) {
                this.f320434h = true;
            }
        }
        if (contentValues.containsKey("favTime")) {
            this.f67780x347afa43 = contentValues.getAsLong("favTime").longValue();
            if (z17) {
                this.f320435i = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f67787xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f320436m = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f67786x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f320437n = true;
            }
        }
        if (contentValues.containsKey("failNum")) {
            this.f67779x33ce4d43 = contentValues.getAsInteger("failNum").intValue();
            if (z17) {
                this.f320438o = true;
            }
        }
        if (contentValues.containsKey("isReport")) {
            this.f67783xe3c50a3 = contentValues.getAsInteger("isReport").intValue();
            if (z17) {
                this.f320439p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
