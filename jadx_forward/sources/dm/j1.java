package dm;

/* loaded from: classes4.dex */
public class j1 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f319263h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f319264i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f319265m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319266n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319267o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319268p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319269q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f319270r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f319271s;

    /* renamed from: field_exposeId */
    public java.lang.String f67074xaaf645a4;

    /* renamed from: field_exposeTime */
    public long f67075xc6808d16;

    /* renamed from: field_exposeType */
    public int f67076xc680c983;

    /* renamed from: field_msgId */
    public long f67077x297eb4f7;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319272d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319273e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319274f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319275g = true;

    static {
        p75.n0 n0Var = new p75.n0("BizRecExposeInfo");
        f319263h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319264i = new java.lang.String[0];
        f319265m = -1926022145;
        f319266n = 104191100;
        f319267o = 223959217;
        f319268p = 223974686;
        f319269q = 108705909;
        f319270r = m125133x3593deb(dm.j1.class);
        f319271s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125133x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "exposeId";
        e0Var.f398488d.put("exposeId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "exposeId";
        e0Var.f398487c[1] = "msgId";
        e0Var.f398488d.put("msgId", "LONG");
        e0Var.f398487c[2] = "exposeTime";
        e0Var.f398488d.put("exposeTime", "LONG");
        e0Var.f398487c[3] = "exposeType";
        e0Var.f398488d.put("exposeType", "INTEGER");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " exposeId TEXT PRIMARY KEY ,  msgId LONG,  exposeTime LONG,  exposeType INTEGER";
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
            if (f319265m == hashCode) {
                try {
                    this.f67074xaaf645a4 = cursor.getString(i17);
                    this.f319272d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizRecExposeInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319266n == hashCode) {
                try {
                    this.f67077x297eb4f7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizRecExposeInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319267o == hashCode) {
                try {
                    this.f67075xc6808d16 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizRecExposeInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319268p == hashCode) {
                try {
                    this.f67076xc680c983 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizRecExposeInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319269q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319272d) {
            contentValues.put("exposeId", this.f67074xaaf645a4);
        }
        if (this.f319273e) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f67077x297eb4f7));
        }
        if (this.f319274f) {
            contentValues.put("exposeTime", java.lang.Long.valueOf(this.f67075xc6808d16));
        }
        if (this.f319275g) {
            contentValues.put("exposeType", java.lang.Integer.valueOf(this.f67076xc680c983));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBizRecExposeInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizRecExposeInfo ( ");
        l75.e0 e0Var = f319270r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319264i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizRecExposeInfo", "createTableSql %s", str2);
            k0Var.A("BizRecExposeInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BizRecExposeInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizRecExposeInfo", "updateTableSql %s", str3);
            k0Var.A("BizRecExposeInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizRecExposeInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319270r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319271s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67074xaaf645a4;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319263h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319263h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("exposeId")) {
            this.f67074xaaf645a4 = contentValues.getAsString("exposeId");
            if (z17) {
                this.f319272d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.f67077x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f319273e = true;
            }
        }
        if (contentValues.containsKey("exposeTime")) {
            this.f67075xc6808d16 = contentValues.getAsLong("exposeTime").longValue();
            if (z17) {
                this.f319274f = true;
            }
        }
        if (contentValues.containsKey("exposeType")) {
            this.f67076xc680c983 = contentValues.getAsInteger("exposeType").intValue();
            if (z17) {
                this.f319275g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
