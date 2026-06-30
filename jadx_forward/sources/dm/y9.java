package dm;

/* loaded from: classes4.dex */
public class y9 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f322768p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f322769q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322770r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322771s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f322772t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f322773u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f322774v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f322775w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f322776x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f322777y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f322778z;

    /* renamed from: field_autologinwording */
    public java.lang.String f69202xd500f8e3;

    /* renamed from: field_clientVersion */
    public long f69203xa74c2c08;

    /* renamed from: field_createtime */
    public long f69204xad24a2e;

    /* renamed from: field_devicetype */
    public java.lang.String f69205xe7c5c6f5;

    /* renamed from: field_enableautologin */
    public boolean f69206xb74667b2;

    /* renamed from: field_name */
    public java.lang.String f69207x225f1eb0;

    /* renamed from: field_online */
    public boolean f69208x97de538;

    /* renamed from: field_supportautologin */
    public boolean f69209xebceb4d0;

    /* renamed from: field_uid */
    public java.lang.String f69210x4b6e878b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322779d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322780e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322781f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322782g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322783h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322784i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322785m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f322786n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f322787o = true;

    static {
        p75.n0 n0Var = new p75.n0("SafeDeviceInfo");
        f322768p = n0Var;
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
        f322769q = new java.lang.String[0];
        f322770r = 115792;
        f322771s = 3373707;
        f322772t = 782144144;
        f322773u = 1370166729;
        f322774v = -1012222381;
        f322775w = 771880589;
        f322776x = 1739826423;
        f322777y = 1225334827;
        f322778z = 842753086;
        A = 108705909;
        B = m125714x3593deb(dm.y9.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125714x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "uid";
        e0Var.f398488d.put("uid", "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = "uid";
        e0Var.f398487c[1] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "TEXT default '' ");
        e0Var.f398487c[2] = "devicetype";
        e0Var.f398488d.put("devicetype", "TEXT default '' ");
        e0Var.f398487c[3] = "createtime";
        e0Var.f398488d.put("createtime", "LONG default '0' ");
        e0Var.f398487c[4] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54484xa3651b27;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54484xa3651b27, "INTEGER default 'false' ");
        e0Var.f398487c[5] = "clientVersion";
        e0Var.f398488d.put("clientVersion", "LONG default '0' ");
        e0Var.f398487c[6] = "enableautologin";
        e0Var.f398488d.put("enableautologin", "INTEGER default 'false' ");
        e0Var.f398487c[7] = "supportautologin";
        e0Var.f398488d.put("supportautologin", "INTEGER default 'false' ");
        e0Var.f398487c[8] = "autologinwording";
        e0Var.f398488d.put("autologinwording", "TEXT default '' ");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " uid TEXT default ''  PRIMARY KEY ,  name TEXT default '' ,  devicetype TEXT default '' ,  createtime LONG default '0' ,  online INTEGER default 'false' ,  clientVersion LONG default '0' ,  enableautologin INTEGER default 'false' ,  supportautologin INTEGER default 'false' ,  autologinwording TEXT default '' ";
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
            if (f322770r == hashCode) {
                try {
                    this.f69210x4b6e878b = cursor.getString(i17);
                    this.f322779d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSafeDeviceInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322771s == hashCode) {
                try {
                    this.f69207x225f1eb0 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSafeDeviceInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322772t == hashCode) {
                try {
                    this.f69205xe7c5c6f5 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSafeDeviceInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322773u == hashCode) {
                try {
                    this.f69204xad24a2e = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSafeDeviceInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322774v == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f69208x97de538 = z17;
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSafeDeviceInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322775w == hashCode) {
                try {
                    this.f69203xa74c2c08 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSafeDeviceInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322776x == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f69206xb74667b2 = z17;
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSafeDeviceInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322777y == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f69209xebceb4d0 = z17;
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSafeDeviceInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322778z == hashCode) {
                try {
                    this.f69202xd500f8e3 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSafeDeviceInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f69210x4b6e878b == null) {
            this.f69210x4b6e878b = "";
        }
        if (this.f322779d) {
            contentValues.put("uid", this.f69210x4b6e878b);
        }
        if (this.f69207x225f1eb0 == null) {
            this.f69207x225f1eb0 = "";
        }
        if (this.f322780e) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, this.f69207x225f1eb0);
        }
        if (this.f69205xe7c5c6f5 == null) {
            this.f69205xe7c5c6f5 = "";
        }
        if (this.f322781f) {
            contentValues.put("devicetype", this.f69205xe7c5c6f5);
        }
        if (this.f322782g) {
            contentValues.put("createtime", java.lang.Long.valueOf(this.f69204xad24a2e));
        }
        if (this.f322783h) {
            if (this.f69208x97de538) {
                contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54484xa3651b27, (java.lang.Integer) 1);
            } else {
                contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54484xa3651b27, (java.lang.Integer) 0);
            }
        }
        if (this.f322784i) {
            contentValues.put("clientVersion", java.lang.Long.valueOf(this.f69203xa74c2c08));
        }
        if (this.f322785m) {
            if (this.f69206xb74667b2) {
                contentValues.put("enableautologin", (java.lang.Integer) 1);
            } else {
                contentValues.put("enableautologin", (java.lang.Integer) 0);
            }
        }
        if (this.f322786n) {
            if (this.f69209xebceb4d0) {
                contentValues.put("supportautologin", (java.lang.Integer) 1);
            } else {
                contentValues.put("supportautologin", (java.lang.Integer) 0);
            }
        }
        if (this.f69202xd500f8e3 == null) {
            this.f69202xd500f8e3 = "";
        }
        if (this.f322787o) {
            contentValues.put("autologinwording", this.f69202xd500f8e3);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSafeDeviceInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SafeDeviceInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322769q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSafeDeviceInfo", "createTableSql %s", str2);
            k0Var.A("SafeDeviceInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "SafeDeviceInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSafeDeviceInfo", "updateTableSql %s", str3);
            k0Var.A("SafeDeviceInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSafeDeviceInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.f69210x4b6e878b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322768p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322768p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("uid")) {
            this.f69210x4b6e878b = contentValues.getAsString("uid");
            if (z17) {
                this.f322779d = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d)) {
            this.f69207x225f1eb0 = contentValues.getAsString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            if (z17) {
                this.f322780e = true;
            }
        }
        if (contentValues.containsKey("devicetype")) {
            this.f69205xe7c5c6f5 = contentValues.getAsString("devicetype");
            if (z17) {
                this.f322781f = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.f69204xad24a2e = contentValues.getAsLong("createtime").longValue();
            if (z17) {
                this.f322782g = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54484xa3651b27)) {
            this.f69208x97de538 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54484xa3651b27).intValue() != 0;
            if (z17) {
                this.f322783h = true;
            }
        }
        if (contentValues.containsKey("clientVersion")) {
            this.f69203xa74c2c08 = contentValues.getAsLong("clientVersion").longValue();
            if (z17) {
                this.f322784i = true;
            }
        }
        if (contentValues.containsKey("enableautologin")) {
            this.f69206xb74667b2 = contentValues.getAsInteger("enableautologin").intValue() != 0;
            if (z17) {
                this.f322785m = true;
            }
        }
        if (contentValues.containsKey("supportautologin")) {
            this.f69209xebceb4d0 = contentValues.getAsInteger("supportautologin").intValue() != 0;
            if (z17) {
                this.f322786n = true;
            }
        }
        if (contentValues.containsKey("autologinwording")) {
            this.f69202xd500f8e3 = contentValues.getAsString("autologinwording");
            if (z17) {
                this.f322787o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
