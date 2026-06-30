package dm;

/* loaded from: classes7.dex */
public class e8 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f318181m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f318182n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318183o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318184p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318185q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318186r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318187s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318188t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318189u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f318190v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f318191w;

    /* renamed from: field_msgId */
    public long f66416x297eb4f7;

    /* renamed from: field_msgSvrId */
    public long f66417xd09be28e;

    /* renamed from: field_quotedMsgId */
    public long f66418xb3e44c2f;

    /* renamed from: field_quotedMsgSvrId */
    public long f66419x34d46056;

    /* renamed from: field_quotedMsgTalker */
    public java.lang.String f66420x66425b6d;

    /* renamed from: field_status */
    public int f66421x10a0fed7;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318192d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318193e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318194f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318195g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318196h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318197i = true;

    static {
        p75.n0 n0Var = new p75.n0("MsgQuote");
        f318181m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318182n = new java.lang.String[0];
        f318183o = 104191100;
        f318184p = -1294411543;
        f318185q = 1210381300;
        f318186r = -2066225551;
        f318187s = -892481550;
        f318188t = 380606642;
        f318189u = 108705909;
        f318190v = m124951x3593deb(dm.e8.class);
        f318191w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124951x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "msgId";
        e0Var.f398488d.put("msgId", "LONG");
        e0Var.f398487c[1] = "msgSvrId";
        e0Var.f398488d.put("msgSvrId", "LONG");
        e0Var.f398487c[2] = "quotedMsgId";
        e0Var.f398488d.put("quotedMsgId", "LONG");
        e0Var.f398487c[3] = "quotedMsgSvrId";
        e0Var.f398488d.put("quotedMsgSvrId", "LONG");
        e0Var.f398487c[4] = "status";
        e0Var.f398488d.put("status", "INTEGER");
        e0Var.f398487c[5] = "quotedMsgTalker";
        e0Var.f398488d.put("quotedMsgTalker", "TEXT");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " msgId LONG,  msgSvrId LONG,  quotedMsgId LONG,  quotedMsgSvrId LONG,  status INTEGER,  quotedMsgTalker TEXT";
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
            if (f318183o == hashCode) {
                try {
                    this.f66416x297eb4f7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMsgQuote", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318184p == hashCode) {
                try {
                    this.f66417xd09be28e = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMsgQuote", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318185q == hashCode) {
                try {
                    this.f66418xb3e44c2f = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMsgQuote", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318186r == hashCode) {
                try {
                    this.f66419x34d46056 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMsgQuote", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318187s == hashCode) {
                try {
                    this.f66421x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMsgQuote", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318188t == hashCode) {
                try {
                    this.f66420x66425b6d = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMsgQuote", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318189u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318192d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f66416x297eb4f7));
        }
        if (this.f318193e) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.f66417xd09be28e));
        }
        if (this.f318194f) {
            contentValues.put("quotedMsgId", java.lang.Long.valueOf(this.f66418xb3e44c2f));
        }
        if (this.f318195g) {
            contentValues.put("quotedMsgSvrId", java.lang.Long.valueOf(this.f66419x34d46056));
        }
        if (this.f318196h) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f66421x10a0fed7));
        }
        if (this.f318197i) {
            contentValues.put("quotedMsgTalker", this.f66420x66425b6d);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseMsgQuote", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MsgQuote ( ");
        l75.e0 e0Var = f318190v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318182n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMsgQuote", "createTableSql %s", str2);
            k0Var.A("MsgQuote", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "MsgQuote", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMsgQuote", "updateTableSql %s", str3);
            k0Var.A("MsgQuote", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMsgQuote", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318190v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318191w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318181m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318181m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.f66416x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f318192d = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.f66417xd09be28e = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f318193e = true;
            }
        }
        if (contentValues.containsKey("quotedMsgId")) {
            this.f66418xb3e44c2f = contentValues.getAsLong("quotedMsgId").longValue();
            if (z17) {
                this.f318194f = true;
            }
        }
        if (contentValues.containsKey("quotedMsgSvrId")) {
            this.f66419x34d46056 = contentValues.getAsLong("quotedMsgSvrId").longValue();
            if (z17) {
                this.f318195g = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f66421x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f318196h = true;
            }
        }
        if (contentValues.containsKey("quotedMsgTalker")) {
            this.f66420x66425b6d = contentValues.getAsString("quotedMsgTalker");
            if (z17) {
                this.f318197i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
