package dm;

/* loaded from: classes4.dex */
public class a extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f317044h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f317045i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f317046m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f317047n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317048o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317049p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317050q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f317051r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f317052s;

    /* renamed from: field_chatroom */
    public java.lang.String f65821x737db1d8;

    /* renamed from: field_insertmsg */
    public boolean f65822x83b3e923;

    /* renamed from: field_msgId */
    public long f65823x297eb4f7;

    /* renamed from: field_payMsgId */
    public java.lang.String f65824x6e706659;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317053d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317054e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317055f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317056g = true;

    static {
        p75.n0 n0Var = new p75.n0("AAPayRecord");
        f317044h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317045i = new java.lang.String[0];
        f317046m = 1353538740;
        f317047n = -384451032;
        f317048o = 1438296115;
        f317049p = 104191100;
        f317050q = 108705909;
        f317051r = m124775x3593deb(dm.a.class);
        f317052s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124775x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "payMsgId";
        e0Var.f398488d.put("payMsgId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "payMsgId";
        e0Var.f398487c[1] = "insertmsg";
        e0Var.f398488d.put("insertmsg", "INTEGER");
        e0Var.f398487c[2] = "chatroom";
        e0Var.f398488d.put("chatroom", "TEXT");
        e0Var.f398487c[3] = "msgId";
        e0Var.f398488d.put("msgId", "LONG");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " payMsgId TEXT PRIMARY KEY ,  insertmsg INTEGER,  chatroom TEXT,  msgId LONG";
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
            if (f317046m == hashCode) {
                try {
                    this.f65824x6e706659 = cursor.getString(i17);
                    this.f317053d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAAPayRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317047n == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f65822x83b3e923 = z17;
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAAPayRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317048o == hashCode) {
                try {
                    this.f65821x737db1d8 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAAPayRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317049p == hashCode) {
                try {
                    this.f65823x297eb4f7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAAPayRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317050q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317053d) {
            contentValues.put("payMsgId", this.f65824x6e706659);
        }
        if (this.f317054e) {
            if (this.f65822x83b3e923) {
                contentValues.put("insertmsg", (java.lang.Integer) 1);
            } else {
                contentValues.put("insertmsg", (java.lang.Integer) 0);
            }
        }
        if (this.f317055f) {
            contentValues.put("chatroom", this.f65821x737db1d8);
        }
        if (this.f317056g) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f65823x297eb4f7));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAAPayRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AAPayRecord ( ");
        l75.e0 e0Var = f317051r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317045i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAAPayRecord", "createTableSql %s", str2);
            k0Var.A("AAPayRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AAPayRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAAPayRecord", "updateTableSql %s", str3);
            k0Var.A("AAPayRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAAPayRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317051r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317052s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f65824x6e706659;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317044h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317044h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("payMsgId")) {
            this.f65824x6e706659 = contentValues.getAsString("payMsgId");
            if (z17) {
                this.f317053d = true;
            }
        }
        if (contentValues.containsKey("insertmsg")) {
            this.f65822x83b3e923 = contentValues.getAsInteger("insertmsg").intValue() != 0;
            if (z17) {
                this.f317054e = true;
            }
        }
        if (contentValues.containsKey("chatroom")) {
            this.f65821x737db1d8 = contentValues.getAsString("chatroom");
            if (z17) {
                this.f317055f = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.f65823x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f317056g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
