package dm;

/* loaded from: classes7.dex */
public class u1 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f321767p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f321768q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321769r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321770s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321771t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321772u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f321773v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f321774w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f321775x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f321776y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f321777z;

    /* renamed from: field_allowMobileNetDownload */
    public java.lang.Boolean f68532x861ee3df;

    /* renamed from: field_downloadUrl */
    public java.lang.String f68533x238eb002;

    /* renamed from: field_downloadUrlHashCode */
    public int f68534xf70f9e3d;

    /* renamed from: field_filePath */
    public java.lang.String f68535xf1e9b966;

    /* renamed from: field_game_package_download */
    public java.lang.Boolean f68536x2e70f789;

    /* renamed from: field_httpsUrl */
    public java.lang.String f68537x15e22229;

    /* renamed from: field_mediaId */
    public java.lang.String f68538xaca5bdda;

    /* renamed from: field_verifyHeaders */
    public java.lang.String f68539xb20eea48;

    /* renamed from: field_wifiAutoDownload */
    public java.lang.Boolean f68540x7f378bb1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321778d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321779e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321780f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321781g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321782h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321783i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321784m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321785n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f321786o = true;

    static {
        p75.n0 n0Var = new p75.n0("CdnDownloadInfo");
        f321767p = n0Var;
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
        f321768q = new java.lang.String[0];
        f321769r = 940773407;
        f321770s = 140685570;
        f321771t = -1211148345;
        f321772u = -132179836;
        f321773v = -735662143;
        f321774w = 952415437;
        f321775x = 927624462;
        f321776y = -1737220358;
        f321777z = -596510964;
        A = 108705909;
        B = m125528x3593deb(dm.u1.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125528x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "mediaId";
        e0Var.f398488d.put("mediaId", "TEXT");
        e0Var.f398487c[1] = "downloadUrlHashCode";
        e0Var.f398488d.put("downloadUrlHashCode", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "downloadUrlHashCode";
        e0Var.f398487c[2] = "downloadUrl";
        e0Var.f398488d.put("downloadUrl", "TEXT");
        e0Var.f398487c[3] = "httpsUrl";
        e0Var.f398488d.put("httpsUrl", "TEXT");
        e0Var.f398487c[4] = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1;
        e0Var.f398488d.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "TEXT");
        e0Var.f398487c[5] = "verifyHeaders";
        e0Var.f398488d.put("verifyHeaders", "TEXT");
        e0Var.f398487c[6] = "game_package_download";
        e0Var.f398488d.put("game_package_download", "INTEGER");
        e0Var.f398487c[7] = "allowMobileNetDownload";
        e0Var.f398488d.put("allowMobileNetDownload", "INTEGER");
        e0Var.f398487c[8] = "wifiAutoDownload";
        e0Var.f398488d.put("wifiAutoDownload", "INTEGER");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " mediaId TEXT,  downloadUrlHashCode INTEGER PRIMARY KEY ,  downloadUrl TEXT,  httpsUrl TEXT,  filePath TEXT,  verifyHeaders TEXT,  game_package_download INTEGER,  allowMobileNetDownload INTEGER,  wifiAutoDownload INTEGER";
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
            if (f321769r == hashCode) {
                try {
                    this.f68538xaca5bdda = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCdnDownloadInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else {
                boolean z17 = true;
                if (f321770s == hashCode) {
                    try {
                        this.f68534xf70f9e3d = cursor.getInt(i17);
                        this.f321779e = true;
                    } catch (java.lang.Throwable th7) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCdnDownloadInfo", th7, "convertFrom %s", columnNames[i17]);
                        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                } else if (f321771t == hashCode) {
                    try {
                        this.f68533x238eb002 = cursor.getString(i17);
                    } catch (java.lang.Throwable th8) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCdnDownloadInfo", th8, "convertFrom %s", columnNames[i17]);
                        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                } else if (f321772u == hashCode) {
                    try {
                        this.f68537x15e22229 = cursor.getString(i17);
                    } catch (java.lang.Throwable th9) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCdnDownloadInfo", th9, "convertFrom %s", columnNames[i17]);
                        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                } else if (f321773v == hashCode) {
                    try {
                        this.f68535xf1e9b966 = cursor.getString(i17);
                    } catch (java.lang.Throwable th10) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCdnDownloadInfo", th10, "convertFrom %s", columnNames[i17]);
                        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                } else if (f321774w == hashCode) {
                    try {
                        this.f68539xb20eea48 = cursor.getString(i17);
                    } catch (java.lang.Throwable th11) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCdnDownloadInfo", th11, "convertFrom %s", columnNames[i17]);
                        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                } else if (f321775x == hashCode) {
                    try {
                        if (cursor.getInt(i17) == 0) {
                            z17 = false;
                        }
                        this.f68536x2e70f789 = java.lang.Boolean.valueOf(z17);
                    } catch (java.lang.Throwable th12) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCdnDownloadInfo", th12, "convertFrom %s", columnNames[i17]);
                        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                } else if (f321776y == hashCode) {
                    try {
                        if (cursor.getInt(i17) == 0) {
                            z17 = false;
                        }
                        this.f68532x861ee3df = java.lang.Boolean.valueOf(z17);
                    } catch (java.lang.Throwable th13) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCdnDownloadInfo", th13, "convertFrom %s", columnNames[i17]);
                        java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                } else if (f321777z == hashCode) {
                    try {
                        if (cursor.getInt(i17) == 0) {
                            z17 = false;
                        }
                        this.f68540x7f378bb1 = java.lang.Boolean.valueOf(z17);
                    } catch (java.lang.Throwable th14) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCdnDownloadInfo", th14, "convertFrom %s", columnNames[i17]);
                        java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                } else if (A == hashCode) {
                    this.f72763xa3c65b86 = cursor.getLong(i17);
                }
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321778d) {
            contentValues.put("mediaId", this.f68538xaca5bdda);
        }
        if (this.f321779e) {
            contentValues.put("downloadUrlHashCode", java.lang.Integer.valueOf(this.f68534xf70f9e3d));
        }
        if (this.f321780f) {
            contentValues.put("downloadUrl", this.f68533x238eb002);
        }
        if (this.f321781g) {
            contentValues.put("httpsUrl", this.f68537x15e22229);
        }
        if (this.f321782h) {
            contentValues.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, this.f68535xf1e9b966);
        }
        if (this.f321783i) {
            contentValues.put("verifyHeaders", this.f68539xb20eea48);
        }
        if (this.f321784m) {
            if (this.f68536x2e70f789.booleanValue()) {
                contentValues.put("game_package_download", (java.lang.Integer) 1);
            } else {
                contentValues.put("game_package_download", (java.lang.Integer) 0);
            }
        }
        if (this.f321785n) {
            if (this.f68532x861ee3df.booleanValue()) {
                contentValues.put("allowMobileNetDownload", (java.lang.Integer) 1);
            } else {
                contentValues.put("allowMobileNetDownload", (java.lang.Integer) 0);
            }
        }
        if (this.f321786o) {
            if (this.f68540x7f378bb1.booleanValue()) {
                contentValues.put("wifiAutoDownload", (java.lang.Integer) 1);
            } else {
                contentValues.put("wifiAutoDownload", (java.lang.Integer) 0);
            }
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseCdnDownloadInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CdnDownloadInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321768q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCdnDownloadInfo", "createTableSql %s", str2);
            k0Var.A("CdnDownloadInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "CdnDownloadInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCdnDownloadInfo", "updateTableSql %s", str3);
            k0Var.A("CdnDownloadInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCdnDownloadInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Integer.valueOf(this.f68534xf70f9e3d);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321767p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321767p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("mediaId")) {
            this.f68538xaca5bdda = contentValues.getAsString("mediaId");
            if (z17) {
                this.f321778d = true;
            }
        }
        if (contentValues.containsKey("downloadUrlHashCode")) {
            this.f68534xf70f9e3d = contentValues.getAsInteger("downloadUrlHashCode").intValue();
            if (z17) {
                this.f321779e = true;
            }
        }
        if (contentValues.containsKey("downloadUrl")) {
            this.f68533x238eb002 = contentValues.getAsString("downloadUrl");
            if (z17) {
                this.f321780f = true;
            }
        }
        if (contentValues.containsKey("httpsUrl")) {
            this.f68537x15e22229 = contentValues.getAsString("httpsUrl");
            if (z17) {
                this.f321781g = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1)) {
            this.f68535xf1e9b966 = contentValues.getAsString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
            if (z17) {
                this.f321782h = true;
            }
        }
        if (contentValues.containsKey("verifyHeaders")) {
            this.f68539xb20eea48 = contentValues.getAsString("verifyHeaders");
            if (z17) {
                this.f321783i = true;
            }
        }
        if (contentValues.containsKey("game_package_download")) {
            this.f68536x2e70f789 = java.lang.Boolean.valueOf(contentValues.getAsInteger("game_package_download").intValue() != 0);
            if (z17) {
                this.f321784m = true;
            }
        }
        if (contentValues.containsKey("allowMobileNetDownload")) {
            this.f68532x861ee3df = java.lang.Boolean.valueOf(contentValues.getAsInteger("allowMobileNetDownload").intValue() != 0);
            if (z17) {
                this.f321785n = true;
            }
        }
        if (contentValues.containsKey("wifiAutoDownload")) {
            this.f68540x7f378bb1 = java.lang.Boolean.valueOf(contentValues.getAsInteger("wifiAutoDownload").intValue() != 0);
            if (z17) {
                this.f321786o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
