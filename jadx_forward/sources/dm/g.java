package dm;

/* loaded from: classes4.dex */
public class g extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f318518n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f318519o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318520p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318521q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318522r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318523s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318524t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318525u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318526v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318527w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f318528x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f318529y;

    /* renamed from: field_cacheKey */
    public java.lang.String f66570x3ec3922;

    /* renamed from: field_canvasId */
    public long f66571x17759238;

    /* renamed from: field_canvasXml */
    public java.lang.String f66572xd73cee9a;

    /* renamed from: field_createTime */
    public long f66573xac3be4e;

    /* renamed from: field_dynamicInfo */
    public java.lang.String f66574x5c4f59c8;

    /* renamed from: field_source */
    public int f66575x10639700;

    /* renamed from: field_uxInfo */
    public java.lang.String f66576x14380cd6;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318530d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318531e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318532f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318533g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318534h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318535i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318536m = true;

    static {
        p75.n0 n0Var = new p75.n0("AdCanvasCacheInfo");
        f318518n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318519o = new java.lang.String[0];
        f318520p = -433508483;
        f318521q = -105740141;
        f318522r = 1017037727;
        f318523s = 1369213417;
        f318524t = -896505829;
        f318525u = -832250383;
        f318526v = -258997875;
        f318527w = 108705909;
        f318528x = m124991x3593deb(dm.g.class);
        f318529y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124991x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "cacheKey";
        e0Var.f398488d.put("cacheKey", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "cacheKey";
        e0Var.f398487c[1] = "canvasId";
        e0Var.f398488d.put("canvasId", "LONG");
        e0Var.f398487c[2] = "canvasXml";
        e0Var.f398488d.put("canvasXml", "TEXT");
        e0Var.f398487c[3] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[4] = ya.b.f77502x92235c1b;
        e0Var.f398488d.put(ya.b.f77502x92235c1b, "INTEGER");
        e0Var.f398487c[5] = "uxInfo";
        e0Var.f398488d.put("uxInfo", "TEXT");
        e0Var.f398487c[6] = "dynamicInfo";
        e0Var.f398488d.put("dynamicInfo", "TEXT");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " cacheKey TEXT PRIMARY KEY ,  canvasId LONG,  canvasXml TEXT,  createTime LONG,  source INTEGER,  uxInfo TEXT,  dynamicInfo TEXT";
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
            if (f318520p == hashCode) {
                try {
                    this.f66570x3ec3922 = cursor.getString(i17);
                    this.f318530d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdCanvasCacheInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318521q == hashCode) {
                try {
                    this.f66571x17759238 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdCanvasCacheInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318522r == hashCode) {
                try {
                    this.f66572xd73cee9a = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdCanvasCacheInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318523s == hashCode) {
                try {
                    this.f66573xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdCanvasCacheInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318524t == hashCode) {
                try {
                    this.f66575x10639700 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdCanvasCacheInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318525u == hashCode) {
                try {
                    this.f66576x14380cd6 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdCanvasCacheInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318526v == hashCode) {
                try {
                    this.f66574x5c4f59c8 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdCanvasCacheInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318527w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318530d) {
            contentValues.put("cacheKey", this.f66570x3ec3922);
        }
        if (this.f318531e) {
            contentValues.put("canvasId", java.lang.Long.valueOf(this.f66571x17759238));
        }
        if (this.f318532f) {
            contentValues.put("canvasXml", this.f66572xd73cee9a);
        }
        if (this.f318533g) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f66573xac3be4e));
        }
        if (this.f318534h) {
            contentValues.put(ya.b.f77502x92235c1b, java.lang.Integer.valueOf(this.f66575x10639700));
        }
        if (this.f318535i) {
            contentValues.put("uxInfo", this.f66576x14380cd6);
        }
        if (this.f318536m) {
            contentValues.put("dynamicInfo", this.f66574x5c4f59c8);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAdCanvasCacheInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AdCanvasCacheInfo ( ");
        l75.e0 e0Var = f318528x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318519o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAdCanvasCacheInfo", "createTableSql %s", str2);
            k0Var.A("AdCanvasCacheInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AdCanvasCacheInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAdCanvasCacheInfo", "updateTableSql %s", str3);
            k0Var.A("AdCanvasCacheInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAdCanvasCacheInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318528x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318529y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66570x3ec3922;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318518n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318518n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("cacheKey")) {
            this.f66570x3ec3922 = contentValues.getAsString("cacheKey");
            if (z17) {
                this.f318530d = true;
            }
        }
        if (contentValues.containsKey("canvasId")) {
            this.f66571x17759238 = contentValues.getAsLong("canvasId").longValue();
            if (z17) {
                this.f318531e = true;
            }
        }
        if (contentValues.containsKey("canvasXml")) {
            this.f66572xd73cee9a = contentValues.getAsString("canvasXml");
            if (z17) {
                this.f318532f = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f66573xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f318533g = true;
            }
        }
        if (contentValues.containsKey(ya.b.f77502x92235c1b)) {
            this.f66575x10639700 = contentValues.getAsInteger(ya.b.f77502x92235c1b).intValue();
            if (z17) {
                this.f318534h = true;
            }
        }
        if (contentValues.containsKey("uxInfo")) {
            this.f66576x14380cd6 = contentValues.getAsString("uxInfo");
            if (z17) {
                this.f318535i = true;
            }
        }
        if (contentValues.containsKey("dynamicInfo")) {
            this.f66574x5c4f59c8 = contentValues.getAsString("dynamicInfo");
            if (z17) {
                this.f318536m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
