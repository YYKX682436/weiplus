package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b;

/* loaded from: classes8.dex */
public class a extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f225706i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f225707m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f225708n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f225709o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f225710p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f225711q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f225712r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f225713s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f225714t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f225715u;

    /* renamed from: field_headerMap */
    public java.lang.String f37406x8de74e8a;

    /* renamed from: field_host */
    public java.lang.String f37407x225c99cd;

    /* renamed from: field_param */
    public java.lang.String f37408x29a0f908;

    /* renamed from: field_paramMap */
    public java.lang.String f37409x63953734;

    /* renamed from: field_updateTime */
    public long f37410xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f225716d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f225717e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f225718f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f225719g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f225720h = true;

    static {
        p75.n0 n0Var = new p75.n0("LiteAppAuthInfo");
        f225706i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f225707m = new java.lang.String[0];
        f225708n = 3208616;
        f225709o = 106436749;
        f225710p = -213310577;
        f225711q = 1171402127;
        f225712r = -295931082;
        f225713s = 108705909;
        f225714t = m65838x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.a.class);
        f225715u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m65838x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "host";
        e0Var.f398488d.put("host", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "host";
        e0Var.f398487c[1] = "param";
        e0Var.f398488d.put("param", "TEXT");
        e0Var.f398487c[2] = "headerMap";
        e0Var.f398488d.put("headerMap", "TEXT");
        e0Var.f398487c[3] = "paramMap";
        e0Var.f398488d.put("paramMap", "TEXT");
        e0Var.f398487c[4] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " host TEXT PRIMARY KEY ,  param TEXT,  headerMap TEXT,  paramMap TEXT,  updateTime LONG";
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
            if (f225708n == hashCode) {
                try {
                    this.f37407x225c99cd = cursor.getString(i17);
                    this.f225716d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiteAppAuthInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f225709o == hashCode) {
                try {
                    this.f37408x29a0f908 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiteAppAuthInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f225710p == hashCode) {
                try {
                    this.f37406x8de74e8a = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiteAppAuthInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f225711q == hashCode) {
                try {
                    this.f37409x63953734 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiteAppAuthInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f225712r == hashCode) {
                try {
                    this.f37410xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiteAppAuthInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f225713s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f225716d) {
            contentValues.put("host", this.f37407x225c99cd);
        }
        if (this.f225717e) {
            contentValues.put("param", this.f37408x29a0f908);
        }
        if (this.f225718f) {
            contentValues.put("headerMap", this.f37406x8de74e8a);
        }
        if (this.f225719g) {
            contentValues.put("paramMap", this.f37409x63953734);
        }
        if (this.f225720h) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f37410xa783a79b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLiteAppAuthInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiteAppAuthInfo ( ");
        l75.e0 e0Var = f225714t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f225707m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiteAppAuthInfo", "createTableSql %s", str2);
            k0Var.A("LiteAppAuthInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LiteAppAuthInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiteAppAuthInfo", "updateTableSql %s", str3);
            k0Var.A("LiteAppAuthInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiteAppAuthInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f225714t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f225715u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f37407x225c99cd;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f225706i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f225706i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("host")) {
            this.f37407x225c99cd = contentValues.getAsString("host");
            if (z17) {
                this.f225716d = true;
            }
        }
        if (contentValues.containsKey("param")) {
            this.f37408x29a0f908 = contentValues.getAsString("param");
            if (z17) {
                this.f225717e = true;
            }
        }
        if (contentValues.containsKey("headerMap")) {
            this.f37406x8de74e8a = contentValues.getAsString("headerMap");
            if (z17) {
                this.f225718f = true;
            }
        }
        if (contentValues.containsKey("paramMap")) {
            this.f37409x63953734 = contentValues.getAsString("paramMap");
            if (z17) {
                this.f225719g = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f37410xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f225720h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
