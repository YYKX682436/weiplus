package dm;

/* loaded from: classes8.dex */
public class f5 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f318359p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f318360q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318361r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318362s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318363t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318364u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318365v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318366w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318367x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318368y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318369z;

    /* renamed from: field_CreateTime */
    public long f66495x81959a6e;

    /* renamed from: field_Description */
    public java.lang.String f66496x685e8417;

    /* renamed from: field_ExpiredTime */
    public long f66497xc9a553ad;

    /* renamed from: field_ExtInfo */
    public java.lang.String f66498x89ebb00a;

    /* renamed from: field_ForcePushId */
    public java.lang.String f66499xaeadb4bb;

    /* renamed from: field_Status */
    public int f66500xda05eaf7;

    /* renamed from: field_Type */
    public int f66501x2253a77f;

    /* renamed from: field_UserIcon */
    public java.lang.String f66502x11b62ca9;

    /* renamed from: field_UserName */
    public java.lang.String f66503x11b86abb;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318370d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318371e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318372f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318373g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318374h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318375i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318376m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318377n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f318378o = true;

    static {
        p75.n0 n0Var = new p75.n0("ForceNotifyData");
        f318359p = n0Var;
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
        f318360q = new java.lang.String[0];
        f318361r = 1122917504;
        f318362s = -932289015;
        f318363t = 1575353202;
        f318364u = -56677412;
        f318365v = -202169596;
        f318366w = -202022634;
        f318367x = 358154831;
        f318368y = -1808614382;
        f318369z = 2622298;
        A = 108705909;
        B = m124973x3593deb(dm.f5.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124973x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "ForcePushId";
        e0Var.f398488d.put("ForcePushId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "ForcePushId";
        e0Var.f398487c[1] = "CreateTime";
        e0Var.f398488d.put("CreateTime", "LONG");
        e0Var.f398487c[2] = "ExpiredTime";
        e0Var.f398488d.put("ExpiredTime", "LONG");
        e0Var.f398487c[3] = "Description";
        e0Var.f398488d.put("Description", "TEXT");
        e0Var.f398487c[4] = "UserIcon";
        e0Var.f398488d.put("UserIcon", "TEXT");
        e0Var.f398487c[5] = "UserName";
        e0Var.f398488d.put("UserName", "TEXT");
        e0Var.f398487c[6] = "ExtInfo";
        e0Var.f398488d.put("ExtInfo", "TEXT");
        e0Var.f398487c[7] = "Status";
        e0Var.f398488d.put("Status", "INTEGER default '0' ");
        e0Var.f398487c[8] = "Type";
        e0Var.f398488d.put("Type", "INTEGER default '0' ");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " ForcePushId TEXT PRIMARY KEY ,  CreateTime LONG,  ExpiredTime LONG,  Description TEXT,  UserIcon TEXT,  UserName TEXT,  ExtInfo TEXT,  Status INTEGER default '0' ,  Type INTEGER default '0' ";
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
            if (f318361r == hashCode) {
                try {
                    this.f66499xaeadb4bb = cursor.getString(i17);
                    this.f318370d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseForceNotifyData", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318362s == hashCode) {
                try {
                    this.f66495x81959a6e = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseForceNotifyData", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318363t == hashCode) {
                try {
                    this.f66497xc9a553ad = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseForceNotifyData", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318364u == hashCode) {
                try {
                    this.f66496x685e8417 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseForceNotifyData", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318365v == hashCode) {
                try {
                    this.f66502x11b62ca9 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseForceNotifyData", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318366w == hashCode) {
                try {
                    this.f66503x11b86abb = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseForceNotifyData", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318367x == hashCode) {
                try {
                    this.f66498x89ebb00a = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseForceNotifyData", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318368y == hashCode) {
                try {
                    this.f66500xda05eaf7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseForceNotifyData", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318369z == hashCode) {
                try {
                    this.f66501x2253a77f = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseForceNotifyData", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f318370d) {
            contentValues.put("ForcePushId", this.f66499xaeadb4bb);
        }
        if (this.f318371e) {
            contentValues.put("CreateTime", java.lang.Long.valueOf(this.f66495x81959a6e));
        }
        if (this.f318372f) {
            contentValues.put("ExpiredTime", java.lang.Long.valueOf(this.f66497xc9a553ad));
        }
        if (this.f318373g) {
            contentValues.put("Description", this.f66496x685e8417);
        }
        if (this.f318374h) {
            contentValues.put("UserIcon", this.f66502x11b62ca9);
        }
        if (this.f318375i) {
            contentValues.put("UserName", this.f66503x11b86abb);
        }
        if (this.f318376m) {
            contentValues.put("ExtInfo", this.f66498x89ebb00a);
        }
        if (this.f318377n) {
            contentValues.put("Status", java.lang.Integer.valueOf(this.f66500xda05eaf7));
        }
        if (this.f318378o) {
            contentValues.put("Type", java.lang.Integer.valueOf(this.f66501x2253a77f));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseForceNotifyData", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ForceNotifyData ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318360q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseForceNotifyData", "createTableSql %s", str2);
            k0Var.A("ForceNotifyData", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ForceNotifyData", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseForceNotifyData", "updateTableSql %s", str3);
            k0Var.A("ForceNotifyData", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseForceNotifyData", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.f66499xaeadb4bb;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318359p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318359p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("ForcePushId")) {
            this.f66499xaeadb4bb = contentValues.getAsString("ForcePushId");
            if (z17) {
                this.f318370d = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.f66495x81959a6e = contentValues.getAsLong("CreateTime").longValue();
            if (z17) {
                this.f318371e = true;
            }
        }
        if (contentValues.containsKey("ExpiredTime")) {
            this.f66497xc9a553ad = contentValues.getAsLong("ExpiredTime").longValue();
            if (z17) {
                this.f318372f = true;
            }
        }
        if (contentValues.containsKey("Description")) {
            this.f66496x685e8417 = contentValues.getAsString("Description");
            if (z17) {
                this.f318373g = true;
            }
        }
        if (contentValues.containsKey("UserIcon")) {
            this.f66502x11b62ca9 = contentValues.getAsString("UserIcon");
            if (z17) {
                this.f318374h = true;
            }
        }
        if (contentValues.containsKey("UserName")) {
            this.f66503x11b86abb = contentValues.getAsString("UserName");
            if (z17) {
                this.f318375i = true;
            }
        }
        if (contentValues.containsKey("ExtInfo")) {
            this.f66498x89ebb00a = contentValues.getAsString("ExtInfo");
            if (z17) {
                this.f318376m = true;
            }
        }
        if (contentValues.containsKey("Status")) {
            this.f66500xda05eaf7 = contentValues.getAsInteger("Status").intValue();
            if (z17) {
                this.f318377n = true;
            }
        }
        if (contentValues.containsKey("Type")) {
            this.f66501x2253a77f = contentValues.getAsInteger("Type").intValue();
            if (z17) {
                this.f318378o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
