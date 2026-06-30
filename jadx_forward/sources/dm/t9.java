package dm;

/* loaded from: classes9.dex */
public class t9 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final l75.e0 H;
    public static final o75.e I;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.n0 f321691r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f321692s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f321693t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f321694u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f321695v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f321696w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f321697x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f321698y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f321699z;

    /* renamed from: field_dataProto */
    public r45.bq0 f68494x84214f59;

    /* renamed from: field_desc */
    public java.lang.String f68495x225aa2b6;

    /* renamed from: field_favFrom */
    public java.lang.String f68496x3474bf20;

    /* renamed from: field_localId */
    public int f68497x88be67a1;

    /* renamed from: field_msgId */
    public long f68498x297eb4f7;

    /* renamed from: field_oriMsgId */
    public long f68499x6e8b9edb;

    /* renamed from: field_oriMsgTalker */
    public java.lang.String f68500x2687819;

    /* renamed from: field_status */
    public int f68501x10a0fed7;

    /* renamed from: field_title */
    public java.lang.String f68502x29dd02d3;

    /* renamed from: field_toUser */
    public java.lang.String f68503x1209e7cb;

    /* renamed from: field_type */
    public int f68504x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321700d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321701e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321702f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321703g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321704h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321705i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321706m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321707n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f321708o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f321709p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f321710q = true;

    static {
        p75.n0 n0Var = new p75.n0("RecordMessageInfo");
        f321691r = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321692s = new p75.d("msgId", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321693t = new p75.d("type", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321694u = new java.lang.String[0];
        f321695v = 338409958;
        f321696w = 104191100;
        f321697x = 1355322678;
        f321698y = -868828954;
        f321699z = 110371416;
        A = 3079825;
        B = -377281442;
        C = 3575610;
        D = -892481550;
        E = -1075703451;
        F = -163788556;
        G = 108705909;
        H = m125518x3593deb(dm.t9.class);
        I = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125518x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[11];
        java.lang.String[] strArr = new java.lang.String[12];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66867x2a5c95c7;
        e0Var.f398488d.put(dm.i4.f66867x2a5c95c7, "INTEGER PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66867x2a5c95c7;
        e0Var.f398487c[1] = "msgId";
        e0Var.f398488d.put("msgId", "LONG default '-1' ");
        e0Var.f398487c[2] = "oriMsgId";
        e0Var.f398488d.put("oriMsgId", "LONG default '-1' ");
        e0Var.f398487c[3] = "toUser";
        e0Var.f398488d.put("toUser", "TEXT default '' ");
        e0Var.f398487c[4] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "TEXT");
        e0Var.f398487c[5] = "desc";
        e0Var.f398488d.put("desc", "TEXT");
        e0Var.f398487c[6] = "dataProto";
        e0Var.f398488d.put("dataProto", "BLOB");
        e0Var.f398487c[7] = "type";
        e0Var.f398488d.put("type", "INTEGER default '0' ");
        e0Var.f398487c[8] = "status";
        e0Var.f398488d.put("status", "INTEGER default '0' ");
        e0Var.f398487c[9] = "favFrom";
        e0Var.f398488d.put("favFrom", "TEXT");
        e0Var.f398487c[10] = "oriMsgTalker";
        e0Var.f398488d.put("oriMsgTalker", "TEXT default '' ");
        e0Var.f398487c[11] = "rowid";
        e0Var.f398489e = " localId INTEGER PRIMARY KEY ,  msgId LONG default '-1' ,  oriMsgId LONG default '-1' ,  toUser TEXT default '' ,  title TEXT,  desc TEXT,  dataProto BLOB,  type INTEGER default '0' ,  status INTEGER default '0' ,  favFrom TEXT,  oriMsgTalker TEXT default '' ";
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
            if (f321695v == hashCode) {
                try {
                    this.f68497x88be67a1 = cursor.getInt(i17);
                    this.f321700d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordMessageInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321696w == hashCode) {
                try {
                    this.f68498x297eb4f7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordMessageInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321697x == hashCode) {
                try {
                    this.f68499x6e8b9edb = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordMessageInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321698y == hashCode) {
                try {
                    this.f68503x1209e7cb = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordMessageInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321699z == hashCode) {
                try {
                    this.f68502x29dd02d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordMessageInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f68495x225aa2b6 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordMessageInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f68494x84214f59 = (r45.bq0) new r45.bq0().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordMessageInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f68504x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordMessageInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f68501x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordMessageInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f68496x3474bf20 = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordMessageInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f68500x2687819 = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordMessageInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321700d) {
            contentValues.put(dm.i4.f66867x2a5c95c7, java.lang.Integer.valueOf(this.f68497x88be67a1));
        }
        if (this.f321701e) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f68498x297eb4f7));
        }
        if (this.f321702f) {
            contentValues.put("oriMsgId", java.lang.Long.valueOf(this.f68499x6e8b9edb));
        }
        if (this.f68503x1209e7cb == null) {
            this.f68503x1209e7cb = "";
        }
        if (this.f321703g) {
            contentValues.put("toUser", this.f68503x1209e7cb);
        }
        if (this.f321704h) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f68502x29dd02d3);
        }
        if (this.f321705i) {
            contentValues.put("desc", this.f68495x225aa2b6);
        }
        if (this.f321706m) {
            r45.bq0 bq0Var = this.f68494x84214f59;
            if (bq0Var != null) {
                try {
                    contentValues.put("dataProto", bq0Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseRecordMessageInfo", e17.getMessage());
                }
            } else {
                contentValues.put("dataProto", (byte[]) null);
            }
        }
        if (this.f321707n) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f68504x2262335f));
        }
        if (this.f321708o) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f68501x10a0fed7));
        }
        if (this.f321709p) {
            contentValues.put("favFrom", this.f68496x3474bf20);
        }
        if (this.f68500x2687819 == null) {
            this.f68500x2687819 = "";
        }
        if (this.f321710q) {
            contentValues.put("oriMsgTalker", this.f68500x2687819);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseRecordMessageInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS RecordMessageInfo ( ");
        l75.e0 e0Var = H;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321694u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRecordMessageInfo", "createTableSql %s", str2);
            k0Var.A("RecordMessageInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "RecordMessageInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRecordMessageInfo", "updateTableSql %s", str3);
            k0Var.A("RecordMessageInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRecordMessageInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return H;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return I;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f68497x88be67a1);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321691r;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321691r.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66867x2a5c95c7)) {
            this.f68497x88be67a1 = contentValues.getAsInteger(dm.i4.f66867x2a5c95c7).intValue();
            if (z17) {
                this.f321700d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.f68498x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f321701e = true;
            }
        }
        if (contentValues.containsKey("oriMsgId")) {
            this.f68499x6e8b9edb = contentValues.getAsLong("oriMsgId").longValue();
            if (z17) {
                this.f321702f = true;
            }
        }
        if (contentValues.containsKey("toUser")) {
            this.f68503x1209e7cb = contentValues.getAsString("toUser");
            if (z17) {
                this.f321703g = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            this.f68502x29dd02d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (z17) {
                this.f321704h = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.f68495x225aa2b6 = contentValues.getAsString("desc");
            if (z17) {
                this.f321705i = true;
            }
        }
        if (contentValues.containsKey("dataProto")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("dataProto");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f68494x84214f59 = (r45.bq0) new r45.bq0().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f321706m = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseRecordMessageInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("type")) {
            this.f68504x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f321707n = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f68501x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f321708o = true;
            }
        }
        if (contentValues.containsKey("favFrom")) {
            this.f68496x3474bf20 = contentValues.getAsString("favFrom");
            if (z17) {
                this.f321709p = true;
            }
        }
        if (contentValues.containsKey("oriMsgTalker")) {
            this.f68500x2687819 = contentValues.getAsString("oriMsgTalker");
            if (z17) {
                this.f321710q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
