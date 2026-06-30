package dm;

/* loaded from: classes7.dex */
public class jb extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f319423p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f319424q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319425r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319426s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319427t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319428u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319429v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319430w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319431x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319432y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f319433z;

    /* renamed from: field_appId */
    public java.lang.String f67159x28d45f97;

    /* renamed from: field_busiType */
    public int f67160xd95c4268;

    /* renamed from: field_createTime */
    public long f67161xac3be4e;

    /* renamed from: field_dataJson */
    public java.lang.String f67162x88617557;

    /* renamed from: field_expireTime */
    public long f67163x876650f1;

    /* renamed from: field_msgId */
    public java.lang.String f67164x297eb4f7;

    /* renamed from: field_msgType */
    public int f67165xc4aab016;

    /* renamed from: field_opType */
    public int f67166x98f67a0;

    /* renamed from: field_receiveTime */
    public long f67167xee5f688b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319434d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319435e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319436f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319437g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319438h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319439i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319440m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319441n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f319442o = true;

    static {
        p75.n0 n0Var = new p75.n0("TipsMsgInfo");
        f319423p = n0Var;
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
        f319424q = new java.lang.String[0];
        f319425r = 93028124;
        f319426s = 1369213417;
        f319427t = -2103439280;
        f319428u = -834724724;
        f319429v = -1011074885;
        f319430w = 104191100;
        f319431x = -1147586365;
        f319432y = 1343750747;
        f319433z = 1788767154;
        A = 108705909;
        B = m125152x3593deb(dm.jb.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125152x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[2] = "receiveTime";
        e0Var.f398488d.put("receiveTime", "LONG");
        e0Var.f398487c[3] = "expireTime";
        e0Var.f398488d.put("expireTime", "LONG");
        e0Var.f398487c[4] = "opType";
        e0Var.f398488d.put("opType", "INTEGER");
        e0Var.f398487c[5] = "msgId";
        e0Var.f398488d.put("msgId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "msgId";
        e0Var.f398487c[6] = "busiType";
        e0Var.f398488d.put("busiType", "INTEGER");
        e0Var.f398487c[7] = "msgType";
        e0Var.f398488d.put("msgType", "INTEGER");
        e0Var.f398487c[8] = "dataJson";
        e0Var.f398488d.put("dataJson", "TEXT");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " appId TEXT,  createTime LONG,  receiveTime LONG,  expireTime LONG,  opType INTEGER,  msgId TEXT PRIMARY KEY ,  busiType INTEGER,  msgType INTEGER,  dataJson TEXT";
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
            if (f319425r == hashCode) {
                try {
                    this.f67159x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTipsMsgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319426s == hashCode) {
                try {
                    this.f67161xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTipsMsgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319427t == hashCode) {
                try {
                    this.f67167xee5f688b = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTipsMsgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319428u == hashCode) {
                try {
                    this.f67163x876650f1 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTipsMsgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319429v == hashCode) {
                try {
                    this.f67166x98f67a0 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTipsMsgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319430w == hashCode) {
                try {
                    this.f67164x297eb4f7 = cursor.getString(i17);
                    this.f319439i = true;
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTipsMsgInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319431x == hashCode) {
                try {
                    this.f67160xd95c4268 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTipsMsgInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319432y == hashCode) {
                try {
                    this.f67165xc4aab016 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTipsMsgInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319433z == hashCode) {
                try {
                    this.f67162x88617557 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTipsMsgInfo", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f319434d) {
            contentValues.put("appId", this.f67159x28d45f97);
        }
        if (this.f319435e) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f67161xac3be4e));
        }
        if (this.f319436f) {
            contentValues.put("receiveTime", java.lang.Long.valueOf(this.f67167xee5f688b));
        }
        if (this.f319437g) {
            contentValues.put("expireTime", java.lang.Long.valueOf(this.f67163x876650f1));
        }
        if (this.f319438h) {
            contentValues.put("opType", java.lang.Integer.valueOf(this.f67166x98f67a0));
        }
        if (this.f319439i) {
            contentValues.put("msgId", this.f67164x297eb4f7);
        }
        if (this.f319440m) {
            contentValues.put("busiType", java.lang.Integer.valueOf(this.f67160xd95c4268));
        }
        if (this.f319441n) {
            contentValues.put("msgType", java.lang.Integer.valueOf(this.f67165xc4aab016));
        }
        if (this.f319442o) {
            contentValues.put("dataJson", this.f67162x88617557);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseTipsMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TipsMsgInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319424q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTipsMsgInfo", "createTableSql %s", str2);
            k0Var.A("TipsMsgInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "TipsMsgInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTipsMsgInfo", "updateTableSql %s", str3);
            k0Var.A("TipsMsgInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTipsMsgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.f67164x297eb4f7;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319423p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319423p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f67159x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f319434d = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f67161xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f319435e = true;
            }
        }
        if (contentValues.containsKey("receiveTime")) {
            this.f67167xee5f688b = contentValues.getAsLong("receiveTime").longValue();
            if (z17) {
                this.f319436f = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.f67163x876650f1 = contentValues.getAsLong("expireTime").longValue();
            if (z17) {
                this.f319437g = true;
            }
        }
        if (contentValues.containsKey("opType")) {
            this.f67166x98f67a0 = contentValues.getAsInteger("opType").intValue();
            if (z17) {
                this.f319438h = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.f67164x297eb4f7 = contentValues.getAsString("msgId");
            if (z17) {
                this.f319439i = true;
            }
        }
        if (contentValues.containsKey("busiType")) {
            this.f67160xd95c4268 = contentValues.getAsInteger("busiType").intValue();
            if (z17) {
                this.f319440m = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.f67165xc4aab016 = contentValues.getAsInteger("msgType").intValue();
            if (z17) {
                this.f319441n = true;
            }
        }
        if (contentValues.containsKey("dataJson")) {
            this.f67162x88617557 = contentValues.getAsString("dataJson");
            if (z17) {
                this.f319442o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
