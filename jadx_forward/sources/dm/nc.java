package dm;

/* loaded from: classes4.dex */
public class nc extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f320349i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f320350m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320351n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320352o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320353p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320354q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320355r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320356s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f320357t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f320358u;

    /* renamed from: field_appId */
    public java.lang.String f67755x28d45f97;

    /* renamed from: field_domin */
    public java.lang.String f67756x28fe2a62;

    /* renamed from: field_key */
    public java.lang.String f67757x4b6e619a;

    /* renamed from: field_recordId */
    public int f67758xee1faef1;

    /* renamed from: field_value */
    public java.lang.String f67759x29f571ec;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320359d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320360e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320361f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320362g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320363h = true;

    static {
        p75.n0 n0Var = new p75.n0("WebviewLocalData");
        f320349i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320350m = new java.lang.String[0];
        f320351n = -799234740;
        f320352o = 93028124;
        f320353p = 95767015;
        f320354q = 106079;
        f320355r = 111972721;
        f320356s = 108705909;
        f320357t = m125350x3593deb(dm.nc.class);
        f320358u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125350x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "recordId";
        e0Var.f398488d.put("recordId", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "recordId";
        e0Var.f398487c[1] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[2] = "domin";
        e0Var.f398488d.put("domin", "TEXT");
        e0Var.f398487c[3] = "key";
        e0Var.f398488d.put("key", "TEXT");
        e0Var.f398487c[4] = "value";
        e0Var.f398488d.put("value", "TEXT");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " recordId INTEGER PRIMARY KEY ,  appId TEXT,  domin TEXT,  key TEXT,  value TEXT";
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
            if (f320351n == hashCode) {
                try {
                    this.f67758xee1faef1 = cursor.getInt(i17);
                    this.f320359d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebviewLocalData", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320352o == hashCode) {
                try {
                    this.f67755x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebviewLocalData", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320353p == hashCode) {
                try {
                    this.f67756x28fe2a62 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebviewLocalData", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320354q == hashCode) {
                try {
                    this.f67757x4b6e619a = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebviewLocalData", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320355r == hashCode) {
                try {
                    this.f67759x29f571ec = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebviewLocalData", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320356s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320359d) {
            contentValues.put("recordId", java.lang.Integer.valueOf(this.f67758xee1faef1));
        }
        if (this.f320360e) {
            contentValues.put("appId", this.f67755x28d45f97);
        }
        if (this.f320361f) {
            contentValues.put("domin", this.f67756x28fe2a62);
        }
        if (this.f320362g) {
            contentValues.put("key", this.f67757x4b6e619a);
        }
        if (this.f320363h) {
            contentValues.put("value", this.f67759x29f571ec);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWebviewLocalData", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WebviewLocalData ( ");
        l75.e0 e0Var = f320357t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320350m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWebviewLocalData", "createTableSql %s", str2);
            k0Var.A("WebviewLocalData", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WebviewLocalData", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWebviewLocalData", "updateTableSql %s", str3);
            k0Var.A("WebviewLocalData", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWebviewLocalData", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320357t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320358u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f67758xee1faef1);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320349i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320349i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("recordId")) {
            this.f67758xee1faef1 = contentValues.getAsInteger("recordId").intValue();
            if (z17) {
                this.f320359d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.f67755x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f320360e = true;
            }
        }
        if (contentValues.containsKey("domin")) {
            this.f67756x28fe2a62 = contentValues.getAsString("domin");
            if (z17) {
                this.f320361f = true;
            }
        }
        if (contentValues.containsKey("key")) {
            this.f67757x4b6e619a = contentValues.getAsString("key");
            if (z17) {
                this.f320362g = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.f67759x29f571ec = contentValues.getAsString("value");
            if (z17) {
                this.f320363h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
