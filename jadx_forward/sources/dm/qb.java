package dm;

/* loaded from: classes4.dex */
public class qb extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f321020o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f321021p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321022q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321023r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321024s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321025t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321026u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f321027v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f321028w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f321029x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f321030y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f321031z;

    /* renamed from: field_content */
    public java.lang.String f68084xad49e234;

    /* renamed from: field_createTime */
    public long f68085xac3be4e;

    /* renamed from: field_direction */
    public int f68086x613e327a;

    /* renamed from: field_encryptTalker */
    public java.lang.String f68087x5285fa99;

    /* renamed from: field_msgSvrId */
    public long f68088xd09be28e;

    /* renamed from: field_status */
    public int f68089x10a0fed7;

    /* renamed from: field_talker */
    public java.lang.String f68090x114ef53e;

    /* renamed from: field_version */
    public long f68091x8987ca93;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321032d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321033e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321034f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321035g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321036h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321037i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321038m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321039n = true;

    static {
        p75.n0 n0Var = new p75.n0("VerifyRecordMsgInfo");
        f321020o = n0Var;
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
        f321021p = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS VerifyRecordMsgInfo_encryptTalker_index ON VerifyRecordMsgInfo(encryptTalker)"};
        f321022q = -1294411543;
        f321023r = -962590849;
        f321024s = 1369213417;
        f321025t = -892481550;
        f321026u = 351608024;
        f321027v = -881080743;
        f321028w = -650394338;
        f321029x = 951530617;
        f321030y = 108705909;
        f321031z = m125430x3593deb(dm.qb.class);
        A = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125430x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "msgSvrId";
        e0Var.f398488d.put("msgSvrId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "msgSvrId";
        e0Var.f398487c[1] = com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0;
        e0Var.f398488d.put(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, "INTEGER");
        e0Var.f398487c[2] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[3] = "status";
        e0Var.f398488d.put("status", "INTEGER");
        e0Var.f398487c[4] = "version";
        e0Var.f398488d.put("version", "LONG");
        e0Var.f398487c[5] = "talker";
        e0Var.f398488d.put("talker", "TEXT default '' ");
        e0Var.f398487c[6] = "encryptTalker";
        e0Var.f398488d.put("encryptTalker", "TEXT default '' ");
        e0Var.f398487c[7] = "content";
        e0Var.f398488d.put("content", "TEXT default '' ");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " msgSvrId LONG PRIMARY KEY ,  direction INTEGER,  createTime LONG,  status INTEGER,  version LONG,  talker TEXT default '' ,  encryptTalker TEXT default '' ,  content TEXT default '' ";
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
            if (f321022q == hashCode) {
                try {
                    this.f68088xd09be28e = cursor.getLong(i17);
                    this.f321032d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321023r == hashCode) {
                try {
                    this.f68086x613e327a = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321024s == hashCode) {
                try {
                    this.f68085xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321025t == hashCode) {
                try {
                    this.f68089x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321026u == hashCode) {
                try {
                    this.f68091x8987ca93 = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321027v == hashCode) {
                try {
                    this.f68090x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321028w == hashCode) {
                try {
                    this.f68087x5285fa99 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321029x == hashCode) {
                try {
                    this.f68084xad49e234 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321030y == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321032d) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.f68088xd09be28e));
        }
        if (this.f321033e) {
            contentValues.put(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, java.lang.Integer.valueOf(this.f68086x613e327a));
        }
        if (this.f321034f) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f68085xac3be4e));
        }
        if (this.f321035g) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f68089x10a0fed7));
        }
        if (this.f321036h) {
            contentValues.put("version", java.lang.Long.valueOf(this.f68091x8987ca93));
        }
        if (this.f68090x114ef53e == null) {
            this.f68090x114ef53e = "";
        }
        if (this.f321037i) {
            contentValues.put("talker", this.f68090x114ef53e);
        }
        if (this.f68087x5285fa99 == null) {
            this.f68087x5285fa99 = "";
        }
        if (this.f321038m) {
            contentValues.put("encryptTalker", this.f68087x5285fa99);
        }
        if (this.f68084xad49e234 == null) {
            this.f68084xad49e234 = "";
        }
        if (this.f321039n) {
            contentValues.put("content", this.f68084xad49e234);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseVerifyRecordMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS VerifyRecordMsgInfo ( ");
        l75.e0 e0Var = f321031z;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321021p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseVerifyRecordMsgInfo", "createTableSql %s", str2);
            k0Var.A("VerifyRecordMsgInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "VerifyRecordMsgInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseVerifyRecordMsgInfo", "updateTableSql %s", str3);
            k0Var.A("VerifyRecordMsgInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseVerifyRecordMsgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321031z;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f68088xd09be28e);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321020o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321020o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "msgSvrId", java.lang.Long.valueOf(this.f68088xd09be28e));
            n51.f.b(jSONObject, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, java.lang.Integer.valueOf(this.f68086x613e327a));
            n51.f.b(jSONObject, "createTime", java.lang.Long.valueOf(this.f68085xac3be4e));
            n51.f.b(jSONObject, "status", java.lang.Integer.valueOf(this.f68089x10a0fed7));
            n51.f.b(jSONObject, "version", java.lang.Long.valueOf(this.f68091x8987ca93));
            n51.f.b(jSONObject, "talker", this.f68090x114ef53e);
            n51.f.b(jSONObject, "encryptTalker", this.f68087x5285fa99);
            n51.f.b(jSONObject, "content", this.f68084xad49e234);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgSvrId")) {
            this.f68088xd09be28e = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f321032d = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0)) {
            this.f68086x613e327a = contentValues.getAsInteger(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0).intValue();
            if (z17) {
                this.f321033e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f68085xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f321034f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f68089x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f321035g = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.f68091x8987ca93 = contentValues.getAsLong("version").longValue();
            if (z17) {
                this.f321036h = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f68090x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f321037i = true;
            }
        }
        if (contentValues.containsKey("encryptTalker")) {
            this.f68087x5285fa99 = contentValues.getAsString("encryptTalker");
            if (z17) {
                this.f321038m = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.f68084xad49e234 = contentValues.getAsString("content");
            if (z17) {
                this.f321039n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
