package dm;

/* loaded from: classes4.dex */
public class u extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f321747f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f321748g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f321749h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f321750i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321751m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f321752n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f321753o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321754d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321755e = true;

    /* renamed from: field_token */
    public java.lang.String f68527x29df9a74;

    /* renamed from: field_username */
    public java.lang.String f68528xdec927b;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandBackgroundFetchDataToken");
        f321747f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321748g = new java.lang.String[0];
        f321749h = -265713450;
        f321750i = 110541305;
        f321751m = 108705909;
        f321752n = m125524x3593deb(dm.u.class);
        f321753o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125524x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT");
        e0Var.f398487c[1] = "token";
        e0Var.f398488d.put("token", "TEXT");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " username TEXT,  token TEXT";
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
            if (f321749h == hashCode) {
                try {
                    this.f68528xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321750i == hashCode) {
                try {
                    this.f68527x29df9a74 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321751m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321754d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f68528xdec927b);
        }
        if (this.f321755e) {
            contentValues.put("token", this.f68527x29df9a74);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandBackgroundFetchDataToken ( ");
        l75.e0 e0Var = f321752n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321748g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", "createTableSql %s", str2);
            k0Var.A("AppBrandBackgroundFetchDataToken", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandBackgroundFetchDataToken", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", "updateTableSql %s", str3);
            k0Var.A("AppBrandBackgroundFetchDataToken", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandBackgroundFetchDataToken", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321752n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321753o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321747f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321747f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f68528xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f321754d = true;
            }
        }
        if (contentValues.containsKey("token")) {
            this.f68527x29df9a74 = contentValues.getAsString("token");
            if (z17) {
                this.f321755e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
