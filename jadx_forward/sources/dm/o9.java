package dm;

/* loaded from: classes4.dex */
public class o9 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f320527i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f320528m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320529n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320530o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320531p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320532q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320533r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320534s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f320535t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f320536u;

    /* renamed from: field_appId */
    public java.lang.String f67842x28d45f97;

    /* renamed from: field_pkgMd5 */
    public java.lang.String f67843xb05c6f7;

    /* renamed from: field_pkgPath */
    public java.lang.String f67844x55b471cc;

    /* renamed from: field_type */
    public int f67845x2262335f;

    /* renamed from: field_version */
    public int f67846x8987ca93;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320537d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320538e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320539f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320540g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320541h = true;

    static {
        p75.n0 n0Var = new p75.n0("PredownloadEncryptPkgInfo");
        f320527i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320528m = new java.lang.String[0];
        f320529n = 93028124;
        f320530o = 351608024;
        f320531p = 3575610;
        f320532q = -986540014;
        f320533r = -517880815;
        f320534s = 108705909;
        f320535t = m125371x3593deb(dm.o9.class);
        f320536u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125371x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "version";
        e0Var.f398488d.put("version", "INTEGER");
        e0Var.f398487c[2] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[3] = "pkgMd5";
        e0Var.f398488d.put("pkgMd5", "TEXT");
        e0Var.f398487c[4] = "pkgPath";
        e0Var.f398488d.put("pkgPath", "TEXT");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " appId TEXT,  version INTEGER,  type INTEGER,  pkgMd5 TEXT,  pkgPath TEXT";
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
            if (f320529n == hashCode) {
                try {
                    this.f67842x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320530o == hashCode) {
                try {
                    this.f67846x8987ca93 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320531p == hashCode) {
                try {
                    this.f67845x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320532q == hashCode) {
                try {
                    this.f67843xb05c6f7 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320533r == hashCode) {
                try {
                    this.f67844x55b471cc = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320534s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320537d) {
            contentValues.put("appId", this.f67842x28d45f97);
        }
        if (this.f320538e) {
            contentValues.put("version", java.lang.Integer.valueOf(this.f67846x8987ca93));
        }
        if (this.f320539f) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f67845x2262335f));
        }
        if (this.f320540g) {
            contentValues.put("pkgMd5", this.f67843xb05c6f7);
        }
        if (this.f320541h) {
            contentValues.put("pkgPath", this.f67844x55b471cc);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PredownloadEncryptPkgInfo ( ");
        l75.e0 e0Var = f320535t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320528m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", "createTableSql %s", str2);
            k0Var.A("PredownloadEncryptPkgInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "PredownloadEncryptPkgInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", "updateTableSql %s", str3);
            k0Var.A("PredownloadEncryptPkgInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePredownloadEncryptPkgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320535t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320536u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320527i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320527i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f67842x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f320537d = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.f67846x8987ca93 = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f320538e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f67845x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f320539f = true;
            }
        }
        if (contentValues.containsKey("pkgMd5")) {
            this.f67843xb05c6f7 = contentValues.getAsString("pkgMd5");
            if (z17) {
                this.f320540g = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.f67844x55b471cc = contentValues.getAsString("pkgPath");
            if (z17) {
                this.f320541h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
