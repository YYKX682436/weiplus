package dm;

/* loaded from: classes4.dex */
public class u0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f321756g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f321757h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f321758i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321759m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f321760n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321761o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f321762p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f321763q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321764d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321765e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321766f = true;

    /* renamed from: field_aId */
    public java.lang.String f68529x4b6e3897;

    /* renamed from: field_exposeTime */
    public long f68530xc6808d16;

    /* renamed from: field_msgId */
    public long f68531x297eb4f7;

    static {
        p75.n0 n0Var = new p75.n0("BizAdInfo");
        f321756g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321757h = new java.lang.String[0];
        f321758i = 95580;
        f321759m = 104191100;
        f321760n = 223959217;
        f321761o = 108705909;
        f321762p = m125526x3593deb(dm.u0.class);
        f321763q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125526x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "aId";
        e0Var.f398488d.put("aId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "aId";
        e0Var.f398487c[1] = "msgId";
        e0Var.f398488d.put("msgId", "LONG");
        e0Var.f398487c[2] = "exposeTime";
        e0Var.f398488d.put("exposeTime", "LONG");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " aId TEXT PRIMARY KEY ,  msgId LONG,  exposeTime LONG";
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
            if (f321758i == hashCode) {
                try {
                    this.f68529x4b6e3897 = cursor.getString(i17);
                    this.f321764d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizAdInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321759m == hashCode) {
                try {
                    this.f68531x297eb4f7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizAdInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321760n == hashCode) {
                try {
                    this.f68530xc6808d16 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizAdInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321761o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321764d) {
            contentValues.put("aId", this.f68529x4b6e3897);
        }
        if (this.f321765e) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f68531x297eb4f7));
        }
        if (this.f321766f) {
            contentValues.put("exposeTime", java.lang.Long.valueOf(this.f68530xc6808d16));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBizAdInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizAdInfo ( ");
        l75.e0 e0Var = f321762p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321757h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizAdInfo", "createTableSql %s", str2);
            k0Var.A("BizAdInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BizAdInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizAdInfo", "updateTableSql %s", str3);
            k0Var.A("BizAdInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizAdInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321762p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321763q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68529x4b6e3897;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321756g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321756g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("aId")) {
            this.f68529x4b6e3897 = contentValues.getAsString("aId");
            if (z17) {
                this.f321764d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.f68531x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f321765e = true;
            }
        }
        if (contentValues.containsKey("exposeTime")) {
            this.f68530xc6808d16 = contentValues.getAsLong("exposeTime").longValue();
            if (z17) {
                this.f321766f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
