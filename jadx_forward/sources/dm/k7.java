package dm;

/* loaded from: classes4.dex */
public class k7 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final l75.e0 E;
    public static final o75.e F;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f319578p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f319579q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f319580r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f319581s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f319582t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319583u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319584v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319585w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319586x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319587y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f319588z;

    /* renamed from: field_byteData */
    private byte[] f67225xae6a0a77;

    /* renamed from: field_pbData */
    private r45.rd0 f67231xa7757a1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319589d = false;

    /* renamed from: field_id */
    private java.lang.String f67227xc8a07680 = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f319590e = false;

    /* renamed from: field_info */
    private java.lang.String f67228x225d08d3 = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f319591f = false;

    /* renamed from: field_timestamp */
    private long f67233x9de75411 = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319592g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319593h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319594i = false;

    /* renamed from: field_doubleData */
    private double f67226xe78ac380 = 0.0d;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319595m = false;

    /* renamed from: field_shortData */
    private short f67232x21b57541 = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319596n = false;

    /* renamed from: field_intData */
    private int f67229xe93919f4 = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f319597o = false;

    /* renamed from: field_longData */
    private long f67230xa21695eb = 0;

    static {
        p75.n0 n0Var = new p75.n0("LiveDemoDBInfo");
        f319578p = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p75.d dVar = new p75.d(dm.i4.f66865x76d1ec5a, "string", tableName, "");
        f319579q = dVar;
        p75.d dVar2 = new p75.d("info", "string", tableName, "");
        p75.d dVar3 = new p75.d(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "long", tableName, "");
        f319580r = new p75.d("intData", "int", tableName, "");
        f319581s = new p75.d("longData", "long", tableName, "");
        p75.v f17 = n0Var.f("IdInfoTimestamp");
        f17.b(dVar, dVar2, dVar3);
        f319582t = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TimestampIndex ON LiveDemoDBInfo(timestamp)", f17.a().f434169a};
        f319583u = 3355;
        f319584v = 3237038;
        f319585w = 55126294;
        f319586x = -1868103470;
        f319587y = -995874628;
        f319588z = 778276635;
        A = -2028516794;
        B = 1957063737;
        C = -2074899386;
        D = 108705909;
        E = m125171x3593deb(dm.k7.class);
        F = new o75.e();
    }

    /* renamed from: createTable */
    public static void m125170xe1f0e832(l75.k0 k0Var) {
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLiveDemoDBInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiveDemoDBInfo ( ");
        l75.e0 e0Var = E;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319582t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveDemoDBInfo", "createTableSql %s", str2);
            k0Var.A("LiveDemoDBInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LiveDemoDBInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveDemoDBInfo", "updateTableSql %s", str3);
            k0Var.A("LiveDemoDBInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveDemoDBInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125171x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66865x76d1ec5a;
        e0Var.f398488d.put(dm.i4.f66865x76d1ec5a, "TEXT PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66865x76d1ec5a;
        e0Var.f398487c[1] = "info";
        e0Var.f398488d.put("info", "TEXT default '' ");
        e0Var.f398487c[2] = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6;
        e0Var.f398488d.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "LONG default '0' ");
        e0Var.f398487c[3] = "byteData";
        e0Var.f398488d.put("byteData", "BLOB");
        e0Var.f398487c[4] = "pbData";
        e0Var.f398488d.put("pbData", "BLOB");
        e0Var.f398487c[5] = "doubleData";
        e0Var.f398488d.put("doubleData", "DOUBLE default '0' ");
        e0Var.f398487c[6] = "shortData";
        e0Var.f398488d.put("shortData", "SHORT default '0' ");
        e0Var.f398487c[7] = "intData";
        e0Var.f398488d.put("intData", "INTEGER default '0' ");
        e0Var.f398487c[8] = "longData";
        e0Var.f398488d.put("longData", "LONG default '0' ");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " id TEXT PRIMARY KEY ,  info TEXT default '' ,  timestamp LONG default '0' ,  byteData BLOB,  pbData BLOB,  doubleData DOUBLE default '0' ,  shortData SHORT default '0' ,  intData INTEGER default '0' ,  longData LONG default '0' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        return e0Var;
    }

    public static final m75.c w0(dm.k7 k7Var, boolean z17) {
        if (!z17) {
            return new m75.c(k7Var, true, null, null, "MicroMsg.SDK.BaseLiveDemoDBInfo");
        }
        k7Var.getClass();
        o75.c cVar = new o75.c(o75.b.f425115c, java.lang.String.valueOf(k7Var.f67227xc8a07680), "MicroMsg.SDK.BaseLiveDemoDBInfo");
        cVar.f425123d = k7Var;
        return new m75.c(k7Var, true, cVar, F, "MicroMsg.SDK.BaseLiveDemoDBInfo");
    }

    public void A0(java.lang.String str) {
        this.f67228x225d08d3 = str;
        this.f319590e = true;
    }

    public void D0(int i17) {
        this.f67229xe93919f4 = i17;
        this.f319596n = true;
    }

    public void F0(long j17) {
        this.f67230xa21695eb = j17;
        this.f319597o = true;
    }

    public void G0(short s17) {
        this.f67232x21b57541 = s17;
        this.f319595m = true;
    }

    public void I0(long j17) {
        this.f67233x9de75411 = j17;
        this.f319591f = true;
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
            if (f319583u == hashCode) {
                try {
                    this.f67227xc8a07680 = cursor.getString(i17);
                    this.f319589d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveDemoDBInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319584v == hashCode) {
                try {
                    this.f67228x225d08d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveDemoDBInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319585w == hashCode) {
                try {
                    this.f67233x9de75411 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveDemoDBInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319586x == hashCode) {
                try {
                    this.f67225xae6a0a77 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveDemoDBInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319587y == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f67231xa7757a1 = (r45.rd0) new r45.rd0().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveDemoDBInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319588z == hashCode) {
                try {
                    this.f67226xe78ac380 = cursor.getDouble(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveDemoDBInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67232x21b57541 = cursor.getShort(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveDemoDBInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67229xe93919f4 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveDemoDBInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f67230xa21695eb = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveDemoDBInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319589d) {
            contentValues.put(dm.i4.f66865x76d1ec5a, this.f67227xc8a07680);
        }
        if (this.f67228x225d08d3 == null) {
            this.f67228x225d08d3 = "";
        }
        if (this.f319590e) {
            contentValues.put("info", this.f67228x225d08d3);
        }
        if (this.f319591f) {
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f67233x9de75411));
        }
        if (this.f319592g) {
            contentValues.put("byteData", this.f67225xae6a0a77);
        }
        if (this.f319593h) {
            r45.rd0 rd0Var = this.f67231xa7757a1;
            if (rd0Var != null) {
                try {
                    contentValues.put("pbData", rd0Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLiveDemoDBInfo", e17.getMessage());
                }
            } else {
                contentValues.put("pbData", (byte[]) null);
            }
        }
        if (this.f319594i) {
            contentValues.put("doubleData", java.lang.Double.valueOf(this.f67226xe78ac380));
        }
        if (this.f319595m) {
            contentValues.put("shortData", java.lang.Short.valueOf(this.f67232x21b57541));
        }
        if (this.f319596n) {
            contentValues.put("intData", java.lang.Integer.valueOf(this.f67229xe93919f4));
        }
        if (this.f319597o) {
            contentValues.put("longData", java.lang.Long.valueOf(this.f67230xa21695eb));
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
        m125170xe1f0e832(k0Var);
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return E;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return F;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67227xc8a07680;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319578p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319578p.f434209a;
    }

    public java.lang.String t0() {
        return this.f67227xc8a07680;
    }

    public java.lang.String u0() {
        return this.f67228x225d08d3;
    }

    public long v0() {
        return this.f67233x9de75411;
    }

    public void y0(double d17) {
        this.f67226xe78ac380 = d17;
        this.f319594i = true;
    }

    public void z0(java.lang.String str) {
        this.f67227xc8a07680 = str;
        this.f319589d = true;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66865x76d1ec5a)) {
            this.f67227xc8a07680 = contentValues.getAsString(dm.i4.f66865x76d1ec5a);
            if (z17) {
                this.f319589d = true;
            }
        }
        if (contentValues.containsKey("info")) {
            this.f67228x225d08d3 = contentValues.getAsString("info");
            if (z17) {
                this.f319590e = true;
            }
        }
        if (contentValues.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            this.f67233x9de75411 = contentValues.getAsLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6).longValue();
            if (z17) {
                this.f319591f = true;
            }
        }
        if (contentValues.containsKey("byteData")) {
            this.f67225xae6a0a77 = contentValues.getAsByteArray("byteData");
            if (z17) {
                this.f319592g = true;
            }
        }
        if (contentValues.containsKey("pbData")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("pbData");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f67231xa7757a1 = (r45.rd0) new r45.rd0().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f319593h = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLiveDemoDBInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("doubleData")) {
            this.f67226xe78ac380 = contentValues.getAsDouble("doubleData").doubleValue();
            if (z17) {
                this.f319594i = true;
            }
        }
        if (contentValues.containsKey("shortData")) {
            this.f67232x21b57541 = contentValues.getAsShort("shortData").shortValue();
            if (z17) {
                this.f319595m = true;
            }
        }
        if (contentValues.containsKey("intData")) {
            this.f67229xe93919f4 = contentValues.getAsInteger("intData").intValue();
            if (z17) {
                this.f319596n = true;
            }
        }
        if (contentValues.containsKey("longData")) {
            this.f67230xa21695eb = contentValues.getAsLong("longData").longValue();
            if (z17) {
                this.f319597o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
