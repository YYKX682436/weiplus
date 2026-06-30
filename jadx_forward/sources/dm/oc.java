package dm;

/* loaded from: classes8.dex */
public class oc extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f320566J;
    public static final int K;
    public static final l75.e0 L;
    public static final o75.e M;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.n0 f320567u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f320568v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320569w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f320570x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f320571y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f320572z;

    /* renamed from: field_autoDownloadCount */
    public int f67854x3483f3f3;

    /* renamed from: field_completeDownload */
    public boolean f67855xdf7ba986;

    /* renamed from: field_createTime */
    public long f67856xac3be4e;

    /* renamed from: field_downloadNetType */
    public int f67857xd4f0ff8a;

    /* renamed from: field_downloadUrl */
    public java.lang.String f67858x238eb002;

    /* renamed from: field_fileDownloadCount */
    public int f67859x9379b146;

    /* renamed from: field_filePath */
    public java.lang.String f67860xf1e9b966;

    /* renamed from: field_key */
    public java.lang.String f67861x4b6e619a;

    /* renamed from: field_md5 */
    public java.lang.String f67862x4b6e68b9;

    /* renamed from: field_mimeType */
    public java.lang.String f67863xcac8f733;

    /* renamed from: field_pkgId */
    public java.lang.String f67864x29a55882;

    /* renamed from: field_rid */
    public java.lang.String f67865x4b6e7c48;

    /* renamed from: field_size */
    public int f67866x22618426;

    /* renamed from: field_version */
    public java.lang.String f67867x8987ca93;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320573d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320574e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320575f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320576g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320577h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320578i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320579m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320580n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f320581o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f320582p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f320583q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f320584r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f320585s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f320586t = true;

    static {
        p75.n0 n0Var = new p75.n0("WepkgPreloadFiles");
        f320567u = n0Var;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320568v = new java.lang.String[0];
        f320569w = 106079;
        f320570x = 106723335;
        f320571y = 351608024;
        f320572z = -735662143;
        A = 112909;
        B = -1392120434;
        C = 107902;
        D = -1211148345;
        E = 3530753;
        F = -2057421617;
        G = 1018565857;
        H = 1369213417;
        I = 2123822072;
        f320566J = -577982133;
        K = 108705909;
        L = m125377x3593deb(dm.oc.class);
        M = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125377x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[14];
        java.lang.String[] strArr = new java.lang.String[15];
        e0Var.f398487c = strArr;
        strArr[0] = "key";
        e0Var.f398488d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "key";
        e0Var.f398487c[1] = "pkgId";
        e0Var.f398488d.put("pkgId", "TEXT");
        e0Var.f398487c[2] = "version";
        e0Var.f398488d.put("version", "TEXT");
        e0Var.f398487c[3] = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1;
        e0Var.f398488d.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "TEXT");
        e0Var.f398487c[4] = "rid";
        e0Var.f398488d.put("rid", "TEXT");
        e0Var.f398487c[5] = "mimeType";
        e0Var.f398488d.put("mimeType", "TEXT");
        e0Var.f398487c[6] = "md5";
        e0Var.f398488d.put("md5", "TEXT");
        e0Var.f398487c[7] = "downloadUrl";
        e0Var.f398488d.put("downloadUrl", "TEXT");
        e0Var.f398487c[8] = "size";
        e0Var.f398488d.put("size", "INTEGER");
        e0Var.f398487c[9] = "downloadNetType";
        e0Var.f398488d.put("downloadNetType", "INTEGER");
        e0Var.f398487c[10] = "completeDownload";
        e0Var.f398488d.put("completeDownload", "INTEGER default 'false' ");
        e0Var.f398487c[11] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[12] = "autoDownloadCount";
        e0Var.f398488d.put("autoDownloadCount", "INTEGER default '0' ");
        e0Var.f398487c[13] = "fileDownloadCount";
        e0Var.f398488d.put("fileDownloadCount", "INTEGER default '0' ");
        e0Var.f398487c[14] = "rowid";
        e0Var.f398489e = " key TEXT PRIMARY KEY ,  pkgId TEXT,  version TEXT,  filePath TEXT,  rid TEXT,  mimeType TEXT,  md5 TEXT,  downloadUrl TEXT,  size INTEGER,  downloadNetType INTEGER,  completeDownload INTEGER default 'false' ,  createTime LONG,  autoDownloadCount INTEGER default '0' ,  fileDownloadCount INTEGER default '0' ";
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
            if (f320569w == hashCode) {
                try {
                    this.f67861x4b6e619a = cursor.getString(i17);
                    this.f320573d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320570x == hashCode) {
                try {
                    this.f67864x29a55882 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320571y == hashCode) {
                try {
                    this.f67867x8987ca93 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320572z == hashCode) {
                try {
                    this.f67860xf1e9b966 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67865x4b6e7c48 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67863xcac8f733 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f67862x4b6e68b9 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f67858x238eb002 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f67866x22618426 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f67857xd4f0ff8a = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f67855xdf7ba986 = z17;
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f67856xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f67854x3483f3f3 = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320566J == hashCode) {
                try {
                    this.f67859x9379b146 = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWepkgPreloadFiles", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320573d) {
            contentValues.put("key", this.f67861x4b6e619a);
        }
        if (this.f320574e) {
            contentValues.put("pkgId", this.f67864x29a55882);
        }
        if (this.f320575f) {
            contentValues.put("version", this.f67867x8987ca93);
        }
        if (this.f320576g) {
            contentValues.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, this.f67860xf1e9b966);
        }
        if (this.f320577h) {
            contentValues.put("rid", this.f67865x4b6e7c48);
        }
        if (this.f320578i) {
            contentValues.put("mimeType", this.f67863xcac8f733);
        }
        if (this.f320579m) {
            contentValues.put("md5", this.f67862x4b6e68b9);
        }
        if (this.f320580n) {
            contentValues.put("downloadUrl", this.f67858x238eb002);
        }
        if (this.f320581o) {
            contentValues.put("size", java.lang.Integer.valueOf(this.f67866x22618426));
        }
        if (this.f320582p) {
            contentValues.put("downloadNetType", java.lang.Integer.valueOf(this.f67857xd4f0ff8a));
        }
        if (this.f320583q) {
            if (this.f67855xdf7ba986) {
                contentValues.put("completeDownload", (java.lang.Integer) 1);
            } else {
                contentValues.put("completeDownload", (java.lang.Integer) 0);
            }
        }
        if (this.f320584r) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f67856xac3be4e));
        }
        if (this.f320585s) {
            contentValues.put("autoDownloadCount", java.lang.Integer.valueOf(this.f67854x3483f3f3));
        }
        if (this.f320586t) {
            contentValues.put("fileDownloadCount", java.lang.Integer.valueOf(this.f67859x9379b146));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWepkgPreloadFiles", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WepkgPreloadFiles ( ");
        l75.e0 e0Var = L;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320568v) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWepkgPreloadFiles", "createTableSql %s", str2);
            k0Var.A("WepkgPreloadFiles", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WepkgPreloadFiles", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWepkgPreloadFiles", "updateTableSql %s", str3);
            k0Var.A("WepkgPreloadFiles", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWepkgPreloadFiles", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return L;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return M;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67861x4b6e619a;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320567u;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320567u.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.f67861x4b6e619a = contentValues.getAsString("key");
            if (z17) {
                this.f320573d = true;
            }
        }
        if (contentValues.containsKey("pkgId")) {
            this.f67864x29a55882 = contentValues.getAsString("pkgId");
            if (z17) {
                this.f320574e = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.f67867x8987ca93 = contentValues.getAsString("version");
            if (z17) {
                this.f320575f = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1)) {
            this.f67860xf1e9b966 = contentValues.getAsString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
            if (z17) {
                this.f320576g = true;
            }
        }
        if (contentValues.containsKey("rid")) {
            this.f67865x4b6e7c48 = contentValues.getAsString("rid");
            if (z17) {
                this.f320577h = true;
            }
        }
        if (contentValues.containsKey("mimeType")) {
            this.f67863xcac8f733 = contentValues.getAsString("mimeType");
            if (z17) {
                this.f320578i = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.f67862x4b6e68b9 = contentValues.getAsString("md5");
            if (z17) {
                this.f320579m = true;
            }
        }
        if (contentValues.containsKey("downloadUrl")) {
            this.f67858x238eb002 = contentValues.getAsString("downloadUrl");
            if (z17) {
                this.f320580n = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.f67866x22618426 = contentValues.getAsInteger("size").intValue();
            if (z17) {
                this.f320581o = true;
            }
        }
        if (contentValues.containsKey("downloadNetType")) {
            this.f67857xd4f0ff8a = contentValues.getAsInteger("downloadNetType").intValue();
            if (z17) {
                this.f320582p = true;
            }
        }
        if (contentValues.containsKey("completeDownload")) {
            this.f67855xdf7ba986 = contentValues.getAsInteger("completeDownload").intValue() != 0;
            if (z17) {
                this.f320583q = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f67856xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f320584r = true;
            }
        }
        if (contentValues.containsKey("autoDownloadCount")) {
            this.f67854x3483f3f3 = contentValues.getAsInteger("autoDownloadCount").intValue();
            if (z17) {
                this.f320585s = true;
            }
        }
        if (contentValues.containsKey("fileDownloadCount")) {
            this.f67859x9379b146 = contentValues.getAsInteger("fileDownloadCount").intValue();
            if (z17) {
                this.f320586t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
