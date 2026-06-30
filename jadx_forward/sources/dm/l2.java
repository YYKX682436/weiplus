package dm;

/* loaded from: classes4.dex */
public class l2 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f319730g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f319731h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f319732i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f319733m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319734n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319735o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f319736p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f319737q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319738d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319739e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319740f = true;

    /* renamed from: field_appId */
    public java.lang.String f67309x28d45f97;

    /* renamed from: field_extJson */
    public java.lang.String f67310x26b3a064;

    /* renamed from: field_versionType */
    public int f67311x94d24c6d;

    static {
        p75.n0 n0Var = new p75.n0("DevPkgLaunchExtInfo");
        f319730g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319731h = new java.lang.String[0];
        f319732i = 93028124;
        f319733m = 689108018;
        f319734n = -1306463575;
        f319735o = 108705909;
        f319736p = m125190x3593deb(dm.l2.class);
        f319737q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125190x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "versionType";
        e0Var.f398488d.put("versionType", "INTEGER");
        e0Var.f398487c[2] = "extJson";
        e0Var.f398488d.put("extJson", "TEXT");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " appId TEXT,  versionType INTEGER,  extJson TEXT";
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
            if (f319732i == hashCode) {
                try {
                    this.f67309x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319733m == hashCode) {
                try {
                    this.f67311x94d24c6d = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319734n == hashCode) {
                try {
                    this.f67310x26b3a064 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319735o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319738d) {
            contentValues.put("appId", this.f67309x28d45f97);
        }
        if (this.f319739e) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.f67311x94d24c6d));
        }
        if (this.f319740f) {
            contentValues.put("extJson", this.f67310x26b3a064);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS DevPkgLaunchExtInfo ( ");
        l75.e0 e0Var = f319736p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319731h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", "createTableSql %s", str2);
            k0Var.A("DevPkgLaunchExtInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "DevPkgLaunchExtInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", "updateTableSql %s", str3);
            k0Var.A("DevPkgLaunchExtInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseDevPkgLaunchExtInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319736p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319737q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319730g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319730g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f67309x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f319738d = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.f67311x94d24c6d = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f319739e = true;
            }
        }
        if (contentValues.containsKey("extJson")) {
            this.f67310x26b3a064 = contentValues.getAsString("extJson");
            if (z17) {
                this.f319740f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
