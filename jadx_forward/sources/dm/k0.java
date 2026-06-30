package dm;

/* loaded from: classes7.dex */
public class k0 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final l75.e0 G;
    public static final o75.e H;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.n0 f319463r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f319464s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f319465t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319466u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319467v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319468w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319469x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319470y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f319471z;

    /* renamed from: field_NewMd5 */
    public java.lang.String f67176xd0b3bac3;

    /* renamed from: field_appId */
    public java.lang.String f67177x28d45f97;

    /* renamed from: field_checksum */
    public long f67178x795e65e8;

    /* renamed from: field_createTime */
    public long f67179xac3be4e;

    /* renamed from: field_debugType */
    public int f67180x8ecd6328;

    /* renamed from: field_downloadURL */
    public java.lang.String f67181x238eac02;

    /* renamed from: field_endTime */
    public long f67182x14c61803;

    /* renamed from: field_pkgPath */
    public java.lang.String f67183x55b471cc;

    /* renamed from: field_startTime */
    public long f67184x1bb3b54a;

    /* renamed from: field_version */
    public int f67185x8987ca93;

    /* renamed from: field_versionMd5 */
    public java.lang.String f67186x912ff5eb;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319472d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319473e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319474f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319475g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319476h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319477i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319478m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319479n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f319480o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f319481p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f319482q = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandWxaPkgManifestRecord");
        f319463r = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319464s = new p75.d("appId", "string", tableName, "");
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
        f319465t = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS AppBrandWxaPkgManifestRecordPkgPathIndex ON AppBrandWxaPkgManifestRecord(pkgPath)"};
        f319466u = 93028124;
        f319467v = 351608024;
        f319468w = -670514810;
        f319469x = -1964995618;
        f319470y = 1536908355;
        f319471z = -517880815;
        A = 1369213417;
        B = -198232019;
        C = -1211149369;
        D = -2129294769;
        E = -1607243192;
        F = 108705909;
        G = m125156x3593deb(dm.k0.class);
        H = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125156x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[11];
        java.lang.String[] strArr = new java.lang.String[12];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "version";
        e0Var.f398488d.put("version", "INTEGER");
        e0Var.f398487c[2] = "versionMd5";
        e0Var.f398488d.put("versionMd5", "TEXT");
        e0Var.f398487c[3] = "NewMd5";
        e0Var.f398488d.put("NewMd5", "TEXT");
        e0Var.f398487c[4] = "checksum";
        e0Var.f398488d.put("checksum", "LONG");
        e0Var.f398487c[5] = "pkgPath";
        e0Var.f398488d.put("pkgPath", "TEXT");
        e0Var.f398487c[6] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[7] = "debugType";
        e0Var.f398488d.put("debugType", "INTEGER default '0' ");
        e0Var.f398487c[8] = "downloadURL";
        e0Var.f398488d.put("downloadURL", "TEXT");
        e0Var.f398487c[9] = "startTime";
        e0Var.f398488d.put("startTime", "LONG");
        e0Var.f398487c[10] = "endTime";
        e0Var.f398488d.put("endTime", "LONG");
        e0Var.f398487c[11] = "rowid";
        e0Var.f398489e = " appId TEXT,  version INTEGER,  versionMd5 TEXT,  NewMd5 TEXT,  checksum LONG,  pkgPath TEXT,  createTime LONG,  debugType INTEGER default '0' ,  downloadURL TEXT,  startTime LONG,  endTime LONG";
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
            if (f319466u == hashCode) {
                try {
                    this.f67177x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319467v == hashCode) {
                try {
                    this.f67185x8987ca93 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319468w == hashCode) {
                try {
                    this.f67186x912ff5eb = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319469x == hashCode) {
                try {
                    this.f67176xd0b3bac3 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319470y == hashCode) {
                try {
                    this.f67178x795e65e8 = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319471z == hashCode) {
                try {
                    this.f67183x55b471cc = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67179xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67180x8ecd6328 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f67181x238eac02 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f67184x1bb3b54a = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f67182x14c61803 = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319472d) {
            contentValues.put("appId", this.f67177x28d45f97);
        }
        if (this.f319473e) {
            contentValues.put("version", java.lang.Integer.valueOf(this.f67185x8987ca93));
        }
        if (this.f319474f) {
            contentValues.put("versionMd5", this.f67186x912ff5eb);
        }
        if (this.f319475g) {
            contentValues.put("NewMd5", this.f67176xd0b3bac3);
        }
        if (this.f319476h) {
            contentValues.put("checksum", java.lang.Long.valueOf(this.f67178x795e65e8));
        }
        if (this.f319477i) {
            contentValues.put("pkgPath", this.f67183x55b471cc);
        }
        if (this.f319478m) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f67179xac3be4e));
        }
        if (this.f319479n) {
            contentValues.put("debugType", java.lang.Integer.valueOf(this.f67180x8ecd6328));
        }
        if (this.f319480o) {
            contentValues.put("downloadURL", this.f67181x238eac02);
        }
        if (this.f319481p) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.f67184x1bb3b54a));
        }
        if (this.f319482q) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.f67182x14c61803));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandWxaPkgManifestRecord ( ");
        l75.e0 e0Var = G;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319465t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", "createTableSql %s", str2);
            k0Var.A("AppBrandWxaPkgManifestRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandWxaPkgManifestRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", "updateTableSql %s", str3);
            k0Var.A("AppBrandWxaPkgManifestRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandWxaPkgManifestRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return G;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return H;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319463r;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319463r.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f67177x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f319472d = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.f67185x8987ca93 = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f319473e = true;
            }
        }
        if (contentValues.containsKey("versionMd5")) {
            this.f67186x912ff5eb = contentValues.getAsString("versionMd5");
            if (z17) {
                this.f319474f = true;
            }
        }
        if (contentValues.containsKey("NewMd5")) {
            this.f67176xd0b3bac3 = contentValues.getAsString("NewMd5");
            if (z17) {
                this.f319475g = true;
            }
        }
        if (contentValues.containsKey("checksum")) {
            this.f67178x795e65e8 = contentValues.getAsLong("checksum").longValue();
            if (z17) {
                this.f319476h = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.f67183x55b471cc = contentValues.getAsString("pkgPath");
            if (z17) {
                this.f319477i = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f67179xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f319478m = true;
            }
        }
        if (contentValues.containsKey("debugType")) {
            this.f67180x8ecd6328 = contentValues.getAsInteger("debugType").intValue();
            if (z17) {
                this.f319479n = true;
            }
        }
        if (contentValues.containsKey("downloadURL")) {
            this.f67181x238eac02 = contentValues.getAsString("downloadURL");
            if (z17) {
                this.f319480o = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.f67184x1bb3b54a = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f319481p = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.f67182x14c61803 = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f319482q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
