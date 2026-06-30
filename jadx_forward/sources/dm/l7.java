package dm;

/* loaded from: classes4.dex */
public class l7 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f319815g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f319816h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f319817i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f319818m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319819n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319820o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f319821p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f319822q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319823d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319824e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319825f = true;

    /* renamed from: field_id */
    public java.lang.String f67342xc8a07680;

    /* renamed from: field_md5 */
    public java.lang.String f67343x4b6e68b9;

    /* renamed from: field_path */
    public java.lang.String f67344x2260084a;

    static {
        p75.n0 n0Var = new p75.n0("LiveElementMediaResource");
        f319815g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319816h = new java.lang.String[0];
        f319817i = 3355;
        f319818m = 3433509;
        f319819n = 107902;
        f319820o = 108705909;
        f319821p = m125201x3593deb(dm.l7.class);
        f319822q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125201x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66865x76d1ec5a;
        e0Var.f398488d.put(dm.i4.f66865x76d1ec5a, "TEXT PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66865x76d1ec5a;
        e0Var.f398487c[1] = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714;
        e0Var.f398488d.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "TEXT");
        e0Var.f398487c[2] = "md5";
        e0Var.f398488d.put("md5", "TEXT");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " id TEXT PRIMARY KEY ,  path TEXT,  md5 TEXT";
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
            if (f319817i == hashCode) {
                try {
                    this.f67342xc8a07680 = cursor.getString(i17);
                    this.f319823d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveElementMediaResource", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319818m == hashCode) {
                try {
                    this.f67344x2260084a = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveElementMediaResource", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319819n == hashCode) {
                try {
                    this.f67343x4b6e68b9 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLiveElementMediaResource", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319820o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319823d) {
            contentValues.put(dm.i4.f66865x76d1ec5a, this.f67342xc8a07680);
        }
        if (this.f319824e) {
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f67344x2260084a);
        }
        if (this.f319825f) {
            contentValues.put("md5", this.f67343x4b6e68b9);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLiveElementMediaResource", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LiveElementMediaResource ( ");
        l75.e0 e0Var = f319821p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319816h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveElementMediaResource", "createTableSql %s", str2);
            k0Var.A("LiveElementMediaResource", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LiveElementMediaResource", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveElementMediaResource", "updateTableSql %s", str3);
            k0Var.A("LiveElementMediaResource", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLiveElementMediaResource", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319821p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319822q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67342xc8a07680;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319815g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319815g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66865x76d1ec5a)) {
            this.f67342xc8a07680 = contentValues.getAsString(dm.i4.f66865x76d1ec5a);
            if (z17) {
                this.f319823d = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)) {
            this.f67344x2260084a = contentValues.getAsString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            if (z17) {
                this.f319824e = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.f67343x4b6e68b9 = contentValues.getAsString("md5");
            if (z17) {
                this.f319825f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
