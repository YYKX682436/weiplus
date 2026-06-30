package dm;

/* loaded from: classes4.dex */
public class t6 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f321653f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f321654g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f321655h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f321656i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321657m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f321658n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f321659o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321660d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321661e = true;

    /* renamed from: field_liftTime */
    public long f68482x57c9021d;

    /* renamed from: field_logId */
    public int f68483x296ecbfa;

    static {
        p75.n0 n0Var = new p75.n0("JsLogBlockList");
        f321653f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321654g = new java.lang.String[0];
        f321655h = 103148415;
        f321656i = 973469816;
        f321657m = 108705909;
        f321658n = m125512x3593deb(dm.t6.class);
        f321659o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125512x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "logId";
        e0Var.f398488d.put("logId", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "logId";
        e0Var.f398487c[1] = "liftTime";
        e0Var.f398488d.put("liftTime", "LONG");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " logId INTEGER PRIMARY KEY ,  liftTime LONG";
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
            if (f321655h == hashCode) {
                try {
                    this.f68483x296ecbfa = cursor.getInt(i17);
                    this.f321660d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseJsLogBlockList", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321656i == hashCode) {
                try {
                    this.f68482x57c9021d = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseJsLogBlockList", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321657m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321660d) {
            contentValues.put("logId", java.lang.Integer.valueOf(this.f68483x296ecbfa));
        }
        if (this.f321661e) {
            contentValues.put("liftTime", java.lang.Long.valueOf(this.f68482x57c9021d));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseJsLogBlockList", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS JsLogBlockList ( ");
        l75.e0 e0Var = f321658n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321654g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseJsLogBlockList", "createTableSql %s", str2);
            k0Var.A("JsLogBlockList", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "JsLogBlockList", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseJsLogBlockList", "updateTableSql %s", str3);
            k0Var.A("JsLogBlockList", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseJsLogBlockList", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321658n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321659o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f68483x296ecbfa);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321653f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321653f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("logId")) {
            this.f68483x296ecbfa = contentValues.getAsInteger("logId").intValue();
            if (z17) {
                this.f321660d = true;
            }
        }
        if (contentValues.containsKey("liftTime")) {
            this.f68482x57c9021d = contentValues.getAsLong("liftTime").longValue();
            if (z17) {
                this.f321661e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
