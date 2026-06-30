package dm;

/* loaded from: classes4.dex */
public class v extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f321959f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f321960g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f321961h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f321962i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321963m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f321964n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f321965o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321966d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321967e = true;

    /* renamed from: field_key */
    public java.lang.String f68630x4b6e619a;

    /* renamed from: field_value */
    public java.lang.String f68631x29f571ec;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandCommonKVData");
        f321959f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321960g = new java.lang.String[0];
        f321961h = 106079;
        f321962i = 111972721;
        f321963m = 108705909;
        f321964n = m125549x3593deb(dm.v.class);
        f321965o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125549x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "key";
        e0Var.f398488d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "key";
        e0Var.f398487c[1] = "value";
        e0Var.f398488d.put("value", "TEXT");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " key TEXT PRIMARY KEY ,  value TEXT";
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
            if (f321961h == hashCode) {
                try {
                    this.f68630x4b6e619a = cursor.getString(i17);
                    this.f321966d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandCommonKVData", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321962i == hashCode) {
                try {
                    this.f68631x29f571ec = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandCommonKVData", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321963m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321966d) {
            contentValues.put("key", this.f68630x4b6e619a);
        }
        if (this.f321967e) {
            contentValues.put("value", this.f68631x29f571ec);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandCommonKVData", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandCommonKVData ( ");
        l75.e0 e0Var = f321964n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321960g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandCommonKVData", "createTableSql %s", str2);
            k0Var.A("AppBrandCommonKVData", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandCommonKVData", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandCommonKVData", "updateTableSql %s", str3);
            k0Var.A("AppBrandCommonKVData", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandCommonKVData", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321964n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321965o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68630x4b6e619a;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321959f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321959f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.f68630x4b6e619a = contentValues.getAsString("key");
            if (z17) {
                this.f321966d = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.f68631x29f571ec = contentValues.getAsString("value");
            if (z17) {
                this.f321967e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
