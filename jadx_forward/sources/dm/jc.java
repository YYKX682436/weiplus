package dm;

/* loaded from: classes8.dex */
public class jc extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f319443o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f319444p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319445q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319446r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319447s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319448t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319449u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319450v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319451w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319452x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319453y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f319454z;

    /* renamed from: field_downloadNetType */
    public int f67168xd4f0ff8a;

    /* renamed from: field_downloadUrl */
    public java.lang.String f67169x238eb002;

    /* renamed from: field_md5 */
    public java.lang.String f67170x4b6e68b9;

    /* renamed from: field_oldPath */
    public java.lang.String f67171x2258c8a7;

    /* renamed from: field_oldVersion */
    public java.lang.String f67172x3e015116;

    /* renamed from: field_pkgId */
    public java.lang.String f67173x29a55882;

    /* renamed from: field_pkgSize */
    public int f67174x55b5eda8;

    /* renamed from: field_version */
    public java.lang.String f67175x8987ca93;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319455d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319456e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319457f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319458g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319459h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319460i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319461m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319462n = true;

    static {
        p75.n0 n0Var = new p75.n0("WePkgDiffPackage");
        f319443o = n0Var;
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
        f319444p = new java.lang.String[0];
        f319445q = 106723335;
        f319446r = 351608024;
        f319447s = -2066080591;
        f319448t = -1379525908;
        f319449u = 107902;
        f319450v = -1211148345;
        f319451w = -517783571;
        f319452x = -2057421617;
        f319453y = 108705909;
        f319454z = m125154x3593deb(dm.jc.class);
        A = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125154x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "pkgId";
        e0Var.f398488d.put("pkgId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "pkgId";
        e0Var.f398487c[1] = "version";
        e0Var.f398488d.put("version", "TEXT");
        e0Var.f398487c[2] = "oldVersion";
        e0Var.f398488d.put("oldVersion", "TEXT");
        e0Var.f398487c[3] = "oldPath";
        e0Var.f398488d.put("oldPath", "TEXT");
        e0Var.f398487c[4] = "md5";
        e0Var.f398488d.put("md5", "TEXT");
        e0Var.f398487c[5] = "downloadUrl";
        e0Var.f398488d.put("downloadUrl", "TEXT");
        e0Var.f398487c[6] = "pkgSize";
        e0Var.f398488d.put("pkgSize", "INTEGER");
        e0Var.f398487c[7] = "downloadNetType";
        e0Var.f398488d.put("downloadNetType", "INTEGER");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " pkgId TEXT PRIMARY KEY ,  version TEXT,  oldVersion TEXT,  oldPath TEXT,  md5 TEXT,  downloadUrl TEXT,  pkgSize INTEGER,  downloadNetType INTEGER";
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
            if (f319445q == hashCode) {
                try {
                    this.f67173x29a55882 = cursor.getString(i17);
                    this.f319455d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWePkgDiffPackage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319446r == hashCode) {
                try {
                    this.f67175x8987ca93 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWePkgDiffPackage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319447s == hashCode) {
                try {
                    this.f67172x3e015116 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWePkgDiffPackage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319448t == hashCode) {
                try {
                    this.f67171x2258c8a7 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWePkgDiffPackage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319449u == hashCode) {
                try {
                    this.f67170x4b6e68b9 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWePkgDiffPackage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319450v == hashCode) {
                try {
                    this.f67169x238eb002 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWePkgDiffPackage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319451w == hashCode) {
                try {
                    this.f67174x55b5eda8 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWePkgDiffPackage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319452x == hashCode) {
                try {
                    this.f67168xd4f0ff8a = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWePkgDiffPackage", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319453y == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319455d) {
            contentValues.put("pkgId", this.f67173x29a55882);
        }
        if (this.f319456e) {
            contentValues.put("version", this.f67175x8987ca93);
        }
        if (this.f319457f) {
            contentValues.put("oldVersion", this.f67172x3e015116);
        }
        if (this.f319458g) {
            contentValues.put("oldPath", this.f67171x2258c8a7);
        }
        if (this.f319459h) {
            contentValues.put("md5", this.f67170x4b6e68b9);
        }
        if (this.f319460i) {
            contentValues.put("downloadUrl", this.f67169x238eb002);
        }
        if (this.f319461m) {
            contentValues.put("pkgSize", java.lang.Integer.valueOf(this.f67174x55b5eda8));
        }
        if (this.f319462n) {
            contentValues.put("downloadNetType", java.lang.Integer.valueOf(this.f67168xd4f0ff8a));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWePkgDiffPackage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WePkgDiffPackage ( ");
        l75.e0 e0Var = f319454z;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319444p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWePkgDiffPackage", "createTableSql %s", str2);
            k0Var.A("WePkgDiffPackage", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WePkgDiffPackage", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWePkgDiffPackage", "updateTableSql %s", str3);
            k0Var.A("WePkgDiffPackage", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWePkgDiffPackage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319454z;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67173x29a55882;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319443o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319443o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("pkgId")) {
            this.f67173x29a55882 = contentValues.getAsString("pkgId");
            if (z17) {
                this.f319455d = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.f67175x8987ca93 = contentValues.getAsString("version");
            if (z17) {
                this.f319456e = true;
            }
        }
        if (contentValues.containsKey("oldVersion")) {
            this.f67172x3e015116 = contentValues.getAsString("oldVersion");
            if (z17) {
                this.f319457f = true;
            }
        }
        if (contentValues.containsKey("oldPath")) {
            this.f67171x2258c8a7 = contentValues.getAsString("oldPath");
            if (z17) {
                this.f319458g = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.f67170x4b6e68b9 = contentValues.getAsString("md5");
            if (z17) {
                this.f319459h = true;
            }
        }
        if (contentValues.containsKey("downloadUrl")) {
            this.f67169x238eb002 = contentValues.getAsString("downloadUrl");
            if (z17) {
                this.f319460i = true;
            }
        }
        if (contentValues.containsKey("pkgSize")) {
            this.f67174x55b5eda8 = contentValues.getAsInteger("pkgSize").intValue();
            if (z17) {
                this.f319461m = true;
            }
        }
        if (contentValues.containsKey("downloadNetType")) {
            this.f67168xd4f0ff8a = contentValues.getAsInteger("downloadNetType").intValue();
            if (z17) {
                this.f319462n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
