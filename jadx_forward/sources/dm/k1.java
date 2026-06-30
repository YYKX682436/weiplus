package dm;

/* loaded from: classes7.dex */
public class k1 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f319483o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f319484p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f319485q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f319486r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319487s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319488t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319489u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319490v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319491w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319492x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319493y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f319494z;

    /* renamed from: field_biz */
    public long f67187x4b6e404e;

    /* renamed from: field_idx */
    public long f67188x4b6e59f8;

    /* renamed from: field_itemShowType */
    public int f67189x1d6ee32f;

    /* renamed from: field_mid */
    public long f67190x4b6e6983;

    /* renamed from: field_screenshotMd5 */
    public java.lang.String f67191xe3a21bb3;

    /* renamed from: field_screenshotPath */
    public java.lang.String f67192x90a2b490;

    /* renamed from: field_screenshotTime */
    public long f67193x90a4a338;

    /* renamed from: field_url */
    public java.lang.String f67194x4b6e88aa;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319495d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319496e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319497f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319498g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319499h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319500i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319501m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319502n = true;

    static {
        p75.n0 n0Var = new p75.n0("BizScreenshotInfo");
        f319483o = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319484p = new p75.d("screenshotPath", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319485q = new p75.d("screenshotTime", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319486r = new java.lang.String[0];
        f319487s = 1784145464;
        f319488t = -525976917;
        f319489u = 116079;
        f319490v = -525850285;
        f319491w = 97555;
        f319492x = 108104;
        f319493y = 104125;
        f319494z = 289616906;
        A = 108705909;
        B = m125158x3593deb(dm.k1.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125158x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "screenshotMd5";
        e0Var.f398488d.put("screenshotMd5", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "screenshotMd5";
        e0Var.f398487c[1] = "screenshotPath";
        e0Var.f398488d.put("screenshotPath", "TEXT");
        e0Var.f398487c[2] = "url";
        e0Var.f398488d.put("url", "TEXT");
        e0Var.f398487c[3] = "screenshotTime";
        e0Var.f398488d.put("screenshotTime", "LONG");
        e0Var.f398487c[4] = "biz";
        e0Var.f398488d.put("biz", "LONG");
        e0Var.f398487c[5] = "mid";
        e0Var.f398488d.put("mid", "LONG");
        e0Var.f398487c[6] = "idx";
        e0Var.f398488d.put("idx", "LONG");
        e0Var.f398487c[7] = "itemShowType";
        e0Var.f398488d.put("itemShowType", "INTEGER");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " screenshotMd5 TEXT PRIMARY KEY ,  screenshotPath TEXT,  url TEXT,  screenshotTime LONG,  biz LONG,  mid LONG,  idx LONG,  itemShowType INTEGER";
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
            if (f319487s == hashCode) {
                try {
                    this.f67191xe3a21bb3 = cursor.getString(i17);
                    this.f319495d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizScreenshotInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319488t == hashCode) {
                try {
                    this.f67192x90a2b490 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizScreenshotInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319489u == hashCode) {
                try {
                    this.f67194x4b6e88aa = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizScreenshotInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319490v == hashCode) {
                try {
                    this.f67193x90a4a338 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizScreenshotInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319491w == hashCode) {
                try {
                    this.f67187x4b6e404e = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizScreenshotInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319492x == hashCode) {
                try {
                    this.f67190x4b6e6983 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizScreenshotInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319493y == hashCode) {
                try {
                    this.f67188x4b6e59f8 = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizScreenshotInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319494z == hashCode) {
                try {
                    this.f67189x1d6ee32f = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizScreenshotInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319495d) {
            contentValues.put("screenshotMd5", this.f67191xe3a21bb3);
        }
        if (this.f319496e) {
            contentValues.put("screenshotPath", this.f67192x90a2b490);
        }
        if (this.f319497f) {
            contentValues.put("url", this.f67194x4b6e88aa);
        }
        if (this.f319498g) {
            contentValues.put("screenshotTime", java.lang.Long.valueOf(this.f67193x90a4a338));
        }
        if (this.f319499h) {
            contentValues.put("biz", java.lang.Long.valueOf(this.f67187x4b6e404e));
        }
        if (this.f319500i) {
            contentValues.put("mid", java.lang.Long.valueOf(this.f67190x4b6e6983));
        }
        if (this.f319501m) {
            contentValues.put("idx", java.lang.Long.valueOf(this.f67188x4b6e59f8));
        }
        if (this.f319502n) {
            contentValues.put("itemShowType", java.lang.Integer.valueOf(this.f67189x1d6ee32f));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBizScreenshotInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizScreenshotInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319486r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizScreenshotInfo", "createTableSql %s", str2);
            k0Var.A("BizScreenshotInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BizScreenshotInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizScreenshotInfo", "updateTableSql %s", str3);
            k0Var.A("BizScreenshotInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizScreenshotInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return B;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return C;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67191xe3a21bb3;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319483o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319483o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("screenshotMd5")) {
            this.f67191xe3a21bb3 = contentValues.getAsString("screenshotMd5");
            if (z17) {
                this.f319495d = true;
            }
        }
        if (contentValues.containsKey("screenshotPath")) {
            this.f67192x90a2b490 = contentValues.getAsString("screenshotPath");
            if (z17) {
                this.f319496e = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.f67194x4b6e88aa = contentValues.getAsString("url");
            if (z17) {
                this.f319497f = true;
            }
        }
        if (contentValues.containsKey("screenshotTime")) {
            this.f67193x90a4a338 = contentValues.getAsLong("screenshotTime").longValue();
            if (z17) {
                this.f319498g = true;
            }
        }
        if (contentValues.containsKey("biz")) {
            this.f67187x4b6e404e = contentValues.getAsLong("biz").longValue();
            if (z17) {
                this.f319499h = true;
            }
        }
        if (contentValues.containsKey("mid")) {
            this.f67190x4b6e6983 = contentValues.getAsLong("mid").longValue();
            if (z17) {
                this.f319500i = true;
            }
        }
        if (contentValues.containsKey("idx")) {
            this.f67188x4b6e59f8 = contentValues.getAsLong("idx").longValue();
            if (z17) {
                this.f319501m = true;
            }
        }
        if (contentValues.containsKey("itemShowType")) {
            this.f67189x1d6ee32f = contentValues.getAsInteger("itemShowType").intValue();
            if (z17) {
                this.f319502n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
