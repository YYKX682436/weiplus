package b34;

/* loaded from: classes11.dex */
public class a extends l75.f0 {
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
    public static final l75.e0 f99218J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f99219t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f99220u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f99221v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f99222w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f99223x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f99224y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f99225z;

    /* renamed from: field_createtime */
    public long f4158xad24a2e;

    /* renamed from: field_desc */
    public java.lang.String f4159x225aa2b6;

    /* renamed from: field_reserved1 */
    public java.lang.String f4160x13320504;

    /* renamed from: field_reserved2 */
    public java.lang.String f4161x13320505;

    /* renamed from: field_reserved3 */
    public int f4162x13320506;

    /* renamed from: field_reservedBuf */
    public byte[] f4163xec52266;

    /* renamed from: field_status */
    public int f4164x10a0fed7;

    /* renamed from: field_subtype */
    public int f4165x541db35;

    /* renamed from: field_svrid */
    public long f4166x29d4cc45;

    /* renamed from: field_tag */
    public java.lang.String f4167x4b6e82d5;

    /* renamed from: field_thumburl */
    public java.lang.String f4168x7b28c57e;

    /* renamed from: field_title */
    public java.lang.String f4169x29dd02d3;

    /* renamed from: field_type */
    public int f4170x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f99226d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99227e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f99228f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99229g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f99230h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f99231i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f99232m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f99233n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f99234o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f99235p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f99236q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f99237r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f99238s = true;

    static {
        p75.n0 n0Var = new p75.n0("ShakeMessage");
        f99219t = n0Var;
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
        f99220u = new java.lang.String[0];
        f99221v = 109833162;
        f99222w = 3575610;
        f99223x = -1867567750;
        f99224y = 1370166729;
        f99225z = 114586;
        A = -892481550;
        B = 110371416;
        C = 3079825;
        D = 1566948313;
        E = 2022955529;
        F = 2022955530;
        G = 2022955531;
        H = -1559901653;
        I = 108705909;
        f99218J = m9761x3593deb(b34.a.class);
        K = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m9761x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f398487c = strArr;
        strArr[0] = "svrid";
        e0Var.f398488d.put("svrid", "LONG default '0'  PRIMARY KEY ");
        e0Var.f398486b = "svrid";
        e0Var.f398487c[1] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[2] = "subtype";
        e0Var.f398488d.put("subtype", "INTEGER default '0' ");
        e0Var.f398487c[3] = "createtime";
        e0Var.f398488d.put("createtime", "LONG");
        e0Var.f398487c[4] = "tag";
        e0Var.f398488d.put("tag", "TEXT");
        e0Var.f398487c[5] = "status";
        e0Var.f398488d.put("status", "INTEGER");
        e0Var.f398487c[6] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "TEXT");
        e0Var.f398487c[7] = "desc";
        e0Var.f398488d.put("desc", "TEXT");
        e0Var.f398487c[8] = "thumburl";
        e0Var.f398488d.put("thumburl", "TEXT");
        e0Var.f398487c[9] = "reserved1";
        e0Var.f398488d.put("reserved1", "TEXT");
        e0Var.f398487c[10] = "reserved2";
        e0Var.f398488d.put("reserved2", "TEXT");
        e0Var.f398487c[11] = "reserved3";
        e0Var.f398488d.put("reserved3", "INTEGER");
        e0Var.f398487c[12] = "reservedBuf";
        e0Var.f398488d.put("reservedBuf", "BLOB");
        e0Var.f398487c[13] = "rowid";
        e0Var.f398489e = " svrid LONG default '0'  PRIMARY KEY ,  type INTEGER,  subtype INTEGER default '0' ,  createtime LONG,  tag TEXT,  status INTEGER,  title TEXT,  desc TEXT,  thumburl TEXT,  reserved1 TEXT,  reserved2 TEXT,  reserved3 INTEGER,  reservedBuf BLOB";
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
            if (f99221v == hashCode) {
                try {
                    this.f4166x29d4cc45 = cursor.getLong(i17);
                    this.f99226d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeMessage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f99222w == hashCode) {
                try {
                    this.f4170x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeMessage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f99223x == hashCode) {
                try {
                    this.f4165x541db35 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeMessage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f99224y == hashCode) {
                try {
                    this.f4158xad24a2e = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeMessage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f99225z == hashCode) {
                try {
                    this.f4167x4b6e82d5 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeMessage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f4164x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeMessage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f4169x29dd02d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeMessage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f4159x225aa2b6 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeMessage", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f4168x7b28c57e = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeMessage", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f4160x13320504 = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeMessage", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f4161x13320505 = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeMessage", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f4162x13320506 = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeMessage", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f4163xec52266 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeMessage", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f99226d) {
            contentValues.put("svrid", java.lang.Long.valueOf(this.f4166x29d4cc45));
        }
        if (this.f99227e) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f4170x2262335f));
        }
        if (this.f99228f) {
            contentValues.put("subtype", java.lang.Integer.valueOf(this.f4165x541db35));
        }
        if (this.f99229g) {
            contentValues.put("createtime", java.lang.Long.valueOf(this.f4158xad24a2e));
        }
        if (this.f99230h) {
            contentValues.put("tag", this.f4167x4b6e82d5);
        }
        if (this.f99231i) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f4164x10a0fed7));
        }
        if (this.f99232m) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f4169x29dd02d3);
        }
        if (this.f99233n) {
            contentValues.put("desc", this.f4159x225aa2b6);
        }
        if (this.f99234o) {
            contentValues.put("thumburl", this.f4168x7b28c57e);
        }
        if (this.f99235p) {
            contentValues.put("reserved1", this.f4160x13320504);
        }
        if (this.f99236q) {
            contentValues.put("reserved2", this.f4161x13320505);
        }
        if (this.f99237r) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.f4162x13320506));
        }
        if (this.f99238s) {
            contentValues.put("reservedBuf", this.f4163xec52266);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseShakeMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ShakeMessage ( ");
        l75.e0 e0Var = f99218J;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f99220u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShakeMessage", "createTableSql %s", str2);
            k0Var.A("ShakeMessage", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ShakeMessage", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShakeMessage", "updateTableSql %s", str3);
            k0Var.A("ShakeMessage", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShakeMessage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f99218J;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return K;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f4166x29d4cc45);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f99219t;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f99219t.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("svrid")) {
            this.f4166x29d4cc45 = contentValues.getAsLong("svrid").longValue();
            if (z17) {
                this.f99226d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f4170x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f99227e = true;
            }
        }
        if (contentValues.containsKey("subtype")) {
            this.f4165x541db35 = contentValues.getAsInteger("subtype").intValue();
            if (z17) {
                this.f99228f = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.f4158xad24a2e = contentValues.getAsLong("createtime").longValue();
            if (z17) {
                this.f99229g = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.f4167x4b6e82d5 = contentValues.getAsString("tag");
            if (z17) {
                this.f99230h = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f4164x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f99231i = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            this.f4169x29dd02d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (z17) {
                this.f99232m = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.f4159x225aa2b6 = contentValues.getAsString("desc");
            if (z17) {
                this.f99233n = true;
            }
        }
        if (contentValues.containsKey("thumburl")) {
            this.f4168x7b28c57e = contentValues.getAsString("thumburl");
            if (z17) {
                this.f99234o = true;
            }
        }
        if (contentValues.containsKey("reserved1")) {
            this.f4160x13320504 = contentValues.getAsString("reserved1");
            if (z17) {
                this.f99235p = true;
            }
        }
        if (contentValues.containsKey("reserved2")) {
            this.f4161x13320505 = contentValues.getAsString("reserved2");
            if (z17) {
                this.f99236q = true;
            }
        }
        if (contentValues.containsKey("reserved3")) {
            this.f4162x13320506 = contentValues.getAsInteger("reserved3").intValue();
            if (z17) {
                this.f99237r = true;
            }
        }
        if (contentValues.containsKey("reservedBuf")) {
            this.f4163xec52266 = contentValues.getAsByteArray("reservedBuf");
            if (z17) {
                this.f99238s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
