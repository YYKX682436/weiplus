package dm;

/* loaded from: classes4.dex */
public class fb extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f318470i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f318471m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318472n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318473o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318474p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318475q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318476r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318477s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f318478t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f318479u;

    /* renamed from: field_cacheSize */
    public int f66549x799e9d9e;

    /* renamed from: field_filePath */
    public java.lang.String f66550xf1e9b966;

    /* renamed from: field_storyId */
    public long f66551x44346ab;

    /* renamed from: field_totalSize */
    public int f66552x78351860;

    /* renamed from: field_url */
    public java.lang.String f66553x4b6e88aa;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318480d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318481e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318482f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318483g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318484h = true;

    static {
        p75.n0 n0Var = new p75.n0("StoryVideoCacheInfo");
        f318470i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318471m = new java.lang.String[0];
        f318472n = -1884251920;
        f318473o = 116079;
        f318474p = -735662143;
        f318475q = -577311387;
        f318476r = -553618781;
        f318477s = 108705909;
        f318478t = m124985x3593deb(dm.fb.class);
        f318479u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124985x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "storyId";
        e0Var.f398488d.put("storyId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "storyId";
        e0Var.f398487c[1] = "url";
        e0Var.f398488d.put("url", "TEXT");
        e0Var.f398487c[2] = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1;
        e0Var.f398488d.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "TEXT");
        e0Var.f398487c[3] = "totalSize";
        e0Var.f398488d.put("totalSize", "INTEGER");
        e0Var.f398487c[4] = "cacheSize";
        e0Var.f398488d.put("cacheSize", "INTEGER");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " storyId LONG PRIMARY KEY ,  url TEXT,  filePath TEXT,  totalSize INTEGER,  cacheSize INTEGER";
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
            if (f318472n == hashCode) {
                try {
                    this.f66551x44346ab = cursor.getLong(i17);
                    this.f318480d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryVideoCacheInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318473o == hashCode) {
                try {
                    this.f66553x4b6e88aa = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryVideoCacheInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318474p == hashCode) {
                try {
                    this.f66550xf1e9b966 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryVideoCacheInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318475q == hashCode) {
                try {
                    this.f66552x78351860 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryVideoCacheInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318476r == hashCode) {
                try {
                    this.f66549x799e9d9e = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryVideoCacheInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318477s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318480d) {
            contentValues.put("storyId", java.lang.Long.valueOf(this.f66551x44346ab));
        }
        if (this.f318481e) {
            contentValues.put("url", this.f66553x4b6e88aa);
        }
        if (this.f318482f) {
            contentValues.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, this.f66550xf1e9b966);
        }
        if (this.f318483g) {
            contentValues.put("totalSize", java.lang.Integer.valueOf(this.f66552x78351860));
        }
        if (this.f318484h) {
            contentValues.put("cacheSize", java.lang.Integer.valueOf(this.f66549x799e9d9e));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseStoryVideoCacheInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS StoryVideoCacheInfo ( ");
        l75.e0 e0Var = f318478t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318471m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryVideoCacheInfo", "createTableSql %s", str2);
            k0Var.A("StoryVideoCacheInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "StoryVideoCacheInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryVideoCacheInfo", "updateTableSql %s", str3);
            k0Var.A("StoryVideoCacheInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryVideoCacheInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318478t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318479u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f66551x44346ab);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318470i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318470i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("storyId")) {
            this.f66551x44346ab = contentValues.getAsLong("storyId").longValue();
            if (z17) {
                this.f318480d = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.f66553x4b6e88aa = contentValues.getAsString("url");
            if (z17) {
                this.f318481e = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1)) {
            this.f66550xf1e9b966 = contentValues.getAsString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
            if (z17) {
                this.f318482f = true;
            }
        }
        if (contentValues.containsKey("totalSize")) {
            this.f66552x78351860 = contentValues.getAsInteger("totalSize").intValue();
            if (z17) {
                this.f318483g = true;
            }
        }
        if (contentValues.containsKey("cacheSize")) {
            this.f66549x799e9d9e = contentValues.getAsInteger("cacheSize").intValue();
            if (z17) {
                this.f318484h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
