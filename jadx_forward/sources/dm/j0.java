package dm;

/* loaded from: classes4.dex */
public class j0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f319252g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f319253h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f319254i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f319255m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319256n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319257o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f319258p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f319259q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319260d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319261e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319262f = true;

    /* renamed from: field_appId */
    public java.lang.String f67071x28d45f97;

    /* renamed from: field_versionMd5 */
    public java.lang.String f67072x912ff5eb;

    /* renamed from: field_versionType */
    public int f67073x94d24c6d;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandTestCodeVersionMarkTable");
        f319252g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319253h = new java.lang.String[0];
        f319254i = 93028124;
        f319255m = 689108018;
        f319256n = -670514810;
        f319257o = 108705909;
        f319258p = m125131x3593deb(dm.j0.class);
        f319259q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125131x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "versionType";
        e0Var.f398488d.put("versionType", "INTEGER");
        e0Var.f398487c[2] = "versionMd5";
        e0Var.f398488d.put("versionMd5", "TEXT");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " appId TEXT,  versionType INTEGER,  versionMd5 TEXT";
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
            if (f319254i == hashCode) {
                try {
                    this.f67071x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319255m == hashCode) {
                try {
                    this.f67073x94d24c6d = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319256n == hashCode) {
                try {
                    this.f67072x912ff5eb = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319257o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319260d) {
            contentValues.put("appId", this.f67071x28d45f97);
        }
        if (this.f319261e) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.f67073x94d24c6d));
        }
        if (this.f319262f) {
            contentValues.put("versionMd5", this.f67072x912ff5eb);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandTestCodeVersionMarkTable ( ");
        l75.e0 e0Var = f319258p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319253h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", "createTableSql %s", str2);
            k0Var.A("AppBrandTestCodeVersionMarkTable", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandTestCodeVersionMarkTable", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", "updateTableSql %s", str3);
            k0Var.A("AppBrandTestCodeVersionMarkTable", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandTestCodeVersionMarkTable", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319258p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319259q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319252g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319252g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f67071x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f319260d = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.f67073x94d24c6d = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f319261e = true;
            }
        }
        if (contentValues.containsKey("versionMd5")) {
            this.f67072x912ff5eb = contentValues.getAsString("versionMd5");
            if (z17) {
                this.f319262f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
