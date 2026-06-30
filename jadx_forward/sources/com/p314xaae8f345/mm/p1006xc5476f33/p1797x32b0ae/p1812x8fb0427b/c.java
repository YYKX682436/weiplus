package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b;

/* loaded from: classes13.dex */
public class c extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f225741o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f225742p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f225743q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f225744r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f225745s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f225746t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f225747u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f225748v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f225749w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f225750x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f225751y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f225752z;

    /* renamed from: field_appId */
    public java.lang.String f37422x28d45f97;

    /* renamed from: field_configJson */
    public java.lang.String f37423xeab2a7af;

    /* renamed from: field_dynamicConfigPath */
    public java.lang.String f37424xfa022421;

    /* renamed from: field_iLinkVersion */
    public int f37425x32c0227a;

    /* renamed from: field_md5 */
    public java.lang.String f37426x4b6e68b9;

    /* renamed from: field_packageConfigPath */
    public java.lang.String f37427x7ec9db68;

    /* renamed from: field_signatureKey */
    public java.lang.String f37428xb47be1ac;

    /* renamed from: field_updateTime */
    public long f37429xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f225753d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f225754e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f225755f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f225756g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f225757h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f225758i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f225759m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f225760n = true;

    static {
        p75.n0 n0Var = new p75.n0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.f37328xee7e42bc);
        f225741o = n0Var;
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
        f225742p = new java.lang.String[0];
        f225743q = 93028124;
        f225744r = -1471139193;
        f225745s = -925050003;
        f225746t = -295931082;
        f225747u = 107902;
        f225748v = 1142236198;
        f225749w = 647263061;
        f225750x = 831222602;
        f225751y = 108705909;
        f225752z = m65842x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.c.class);
        A = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m65842x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "appId";
        e0Var.f398487c[1] = "signatureKey";
        e0Var.f398488d.put("signatureKey", "TEXT");
        e0Var.f398487c[2] = "packageConfigPath";
        e0Var.f398488d.put("packageConfigPath", "TEXT");
        e0Var.f398487c[3] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[4] = "md5";
        e0Var.f398488d.put("md5", "TEXT");
        e0Var.f398487c[5] = "dynamicConfigPath";
        e0Var.f398488d.put("dynamicConfigPath", "TEXT");
        e0Var.f398487c[6] = "iLinkVersion";
        e0Var.f398488d.put("iLinkVersion", "INTEGER");
        e0Var.f398487c[7] = "configJson";
        e0Var.f398488d.put("configJson", "TEXT");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " appId TEXT PRIMARY KEY ,  signatureKey TEXT,  packageConfigPath TEXT,  updateTime LONG,  md5 TEXT,  dynamicConfigPath TEXT,  iLinkVersion INTEGER,  configJson TEXT";
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
            if (f225743q == hashCode) {
                try {
                    this.f37422x28d45f97 = cursor.getString(i17);
                    this.f225753d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiteAppConfigInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f225744r == hashCode) {
                try {
                    this.f37428xb47be1ac = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiteAppConfigInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f225745s == hashCode) {
                try {
                    this.f37427x7ec9db68 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiteAppConfigInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f225746t == hashCode) {
                try {
                    this.f37429xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiteAppConfigInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f225747u == hashCode) {
                try {
                    this.f37426x4b6e68b9 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiteAppConfigInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f225748v == hashCode) {
                try {
                    this.f37424xfa022421 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiteAppConfigInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f225749w == hashCode) {
                try {
                    this.f37425x32c0227a = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiteAppConfigInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f225750x == hashCode) {
                try {
                    this.f37423xeab2a7af = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiteAppConfigInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f225751y == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f225753d) {
            contentValues.put("appId", this.f37422x28d45f97);
        }
        if (this.f225754e) {
            contentValues.put("signatureKey", this.f37428xb47be1ac);
        }
        if (this.f225755f) {
            contentValues.put("packageConfigPath", this.f37427x7ec9db68);
        }
        if (this.f225756g) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f37429xa783a79b));
        }
        if (this.f225757h) {
            contentValues.put("md5", this.f37426x4b6e68b9);
        }
        if (this.f225758i) {
            contentValues.put("dynamicConfigPath", this.f37424xfa022421);
        }
        if (this.f225759m) {
            contentValues.put("iLinkVersion", java.lang.Integer.valueOf(this.f37425x32c0227a));
        }
        if (this.f225760n) {
            contentValues.put("configJson", this.f37423xeab2a7af);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLiteAppConfigInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiteAppConfigInfo ( ");
        l75.e0 e0Var = f225752z;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f225742p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiteAppConfigInfo", "createTableSql %s", str2);
            k0Var.A(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.f37328xee7e42bc, str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.f37328xee7e42bc, k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiteAppConfigInfo", "updateTableSql %s", str3);
            k0Var.A(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1798xaf3f8342.C16192x8446fa43.f37328xee7e42bc, str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiteAppConfigInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f225752z;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f37422x28d45f97;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f225741o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f225741o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f37422x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f225753d = true;
            }
        }
        if (contentValues.containsKey("signatureKey")) {
            this.f37428xb47be1ac = contentValues.getAsString("signatureKey");
            if (z17) {
                this.f225754e = true;
            }
        }
        if (contentValues.containsKey("packageConfigPath")) {
            this.f37427x7ec9db68 = contentValues.getAsString("packageConfigPath");
            if (z17) {
                this.f225755f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f37429xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f225756g = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.f37426x4b6e68b9 = contentValues.getAsString("md5");
            if (z17) {
                this.f225757h = true;
            }
        }
        if (contentValues.containsKey("dynamicConfigPath")) {
            this.f37424xfa022421 = contentValues.getAsString("dynamicConfigPath");
            if (z17) {
                this.f225758i = true;
            }
        }
        if (contentValues.containsKey("iLinkVersion")) {
            this.f37425x32c0227a = contentValues.getAsInteger("iLinkVersion").intValue();
            if (z17) {
                this.f225759m = true;
            }
        }
        if (contentValues.containsKey("configJson")) {
            this.f37423xeab2a7af = contentValues.getAsString("configJson");
            if (z17) {
                this.f225760n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
