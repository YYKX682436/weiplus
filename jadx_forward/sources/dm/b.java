package dm;

/* loaded from: classes4.dex */
public class b extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f317300h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f317301i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f317302m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f317303n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317304o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317305p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317306q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f317307r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f317308s;

    /* renamed from: field_billNo */
    public java.lang.String f65950xf308770d;

    /* renamed from: field_insertmsg */
    public boolean f65951x83b3e923;

    /* renamed from: field_localMsgId */
    public long f65952x5de2436;

    /* renamed from: field_status */
    public int f65953x10a0fed7;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317309d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317310e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317311f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317312g = true;

    static {
        p75.n0 n0Var = new p75.n0("AARecord");
        f317300h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317301i = new java.lang.String[0];
        f317302m = -1389017048;
        f317303n = -384451032;
        f317304o = 1287057361;
        f317305p = -892481550;
        f317306q = 108705909;
        f317307r = m124802x3593deb(dm.b.class);
        f317308s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124802x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "billNo";
        e0Var.f398488d.put("billNo", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "billNo";
        e0Var.f398487c[1] = "insertmsg";
        e0Var.f398488d.put("insertmsg", "INTEGER");
        e0Var.f398487c[2] = "localMsgId";
        e0Var.f398488d.put("localMsgId", "LONG");
        e0Var.f398487c[3] = "status";
        e0Var.f398488d.put("status", "INTEGER default '-1' ");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " billNo TEXT PRIMARY KEY ,  insertmsg INTEGER,  localMsgId LONG,  status INTEGER default '-1' ";
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
            if (f317302m == hashCode) {
                try {
                    this.f65950xf308770d = cursor.getString(i17);
                    this.f317309d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAARecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317303n == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f65951x83b3e923 = z17;
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAARecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317304o == hashCode) {
                try {
                    this.f65952x5de2436 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAARecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317305p == hashCode) {
                try {
                    this.f65953x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAARecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317306q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317309d) {
            contentValues.put("billNo", this.f65950xf308770d);
        }
        if (this.f317310e) {
            if (this.f65951x83b3e923) {
                contentValues.put("insertmsg", (java.lang.Integer) 1);
            } else {
                contentValues.put("insertmsg", (java.lang.Integer) 0);
            }
        }
        if (this.f317311f) {
            contentValues.put("localMsgId", java.lang.Long.valueOf(this.f65952x5de2436));
        }
        if (this.f317312g) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f65953x10a0fed7));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAARecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AARecord ( ");
        l75.e0 e0Var = f317307r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317301i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAARecord", "createTableSql %s", str2);
            k0Var.A("AARecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AARecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAARecord", "updateTableSql %s", str3);
            k0Var.A("AARecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAARecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317307r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317308s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f65950xf308770d;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317300h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317300h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("billNo")) {
            this.f65950xf308770d = contentValues.getAsString("billNo");
            if (z17) {
                this.f317309d = true;
            }
        }
        if (contentValues.containsKey("insertmsg")) {
            this.f65951x83b3e923 = contentValues.getAsInteger("insertmsg").intValue() != 0;
            if (z17) {
                this.f317310e = true;
            }
        }
        if (contentValues.containsKey("localMsgId")) {
            this.f65952x5de2436 = contentValues.getAsLong("localMsgId").longValue();
            if (z17) {
                this.f317311f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f65953x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f317312g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
