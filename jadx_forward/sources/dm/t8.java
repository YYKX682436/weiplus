package dm;

/* loaded from: classes4.dex */
public class t8 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f321682f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f321683g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f321684h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f321685i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321686m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f321687n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f321688o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321689d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321690e = true;

    /* renamed from: field_finder_username */
    public java.lang.String f68492xbb25cf8a;

    /* renamed from: field_openIMUsername */
    public java.lang.String f68493x315f5dc9;

    static {
        p75.n0 n0Var = new p75.n0("OpenIMFinderInfoNew");
        f321682f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321683g = new java.lang.String[0];
        f321684h = -2124225564;
        f321685i = 1804799183;
        f321686m = 108705909;
        f321687n = m125516x3593deb(dm.t8.class);
        f321688o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125516x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "openIMUsername";
        e0Var.f398488d.put("openIMUsername", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "openIMUsername";
        e0Var.f398487c[1] = "finder_username";
        e0Var.f398488d.put("finder_username", "TEXT");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " openIMUsername TEXT PRIMARY KEY ,  finder_username TEXT";
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
            if (f321684h == hashCode) {
                try {
                    this.f68493x315f5dc9 = cursor.getString(i17);
                    this.f321689d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMFinderInfoNew", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321685i == hashCode) {
                try {
                    this.f68492xbb25cf8a = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMFinderInfoNew", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321686m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321689d) {
            contentValues.put("openIMUsername", this.f68493x315f5dc9);
        }
        if (this.f321690e) {
            contentValues.put("finder_username", this.f68492xbb25cf8a);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOpenIMFinderInfoNew", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OpenIMFinderInfoNew ( ");
        l75.e0 e0Var = f321687n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321683g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenIMFinderInfoNew", "createTableSql %s", str2);
            k0Var.A("OpenIMFinderInfoNew", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "OpenIMFinderInfoNew", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenIMFinderInfoNew", "updateTableSql %s", str3);
            k0Var.A("OpenIMFinderInfoNew", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenIMFinderInfoNew", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321687n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321688o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68493x315f5dc9;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321682f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321682f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "openIMUsername", this.f68493x315f5dc9);
            n51.f.b(jSONObject, "finder_username", this.f68492xbb25cf8a);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("openIMUsername")) {
            this.f68493x315f5dc9 = contentValues.getAsString("openIMUsername");
            if (z17) {
                this.f321689d = true;
            }
        }
        if (contentValues.containsKey("finder_username")) {
            this.f68492xbb25cf8a = contentValues.getAsString("finder_username");
            if (z17) {
                this.f321690e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
