package dm;

/* loaded from: classes4.dex */
public class d0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f317810g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f317811h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f317812i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f317813m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f317814n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317815o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f317816p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f317817q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317818d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317819e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317820f = true;

    /* renamed from: field_appId */
    public java.lang.String f66198x28d45f97;

    /* renamed from: field_prefetchUpdateTime */
    public long f66199xcacd07f2;

    /* renamed from: field_username */
    public java.lang.String f66200xdec927b;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandPrefetchWxaAttrsMarkTable");
        f317810g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317811h = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS AppBrandPrefetchWxaAttrsMarkTableAppIdIndex ON AppBrandPrefetchWxaAttrsMarkTable(appId)"};
        f317812i = -265713450;
        f317813m = 93028124;
        f317814n = -1021704051;
        f317815o = 108705909;
        f317816p = m124865x3593deb(dm.d0.class);
        f317817q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124865x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66875xa013b0d5;
        e0Var.f398487c[1] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[2] = "prefetchUpdateTime";
        e0Var.f398488d.put("prefetchUpdateTime", "LONG");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " username TEXT PRIMARY KEY ,  appId TEXT,  prefetchUpdateTime LONG";
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
            if (f317812i == hashCode) {
                try {
                    this.f66200xdec927b = cursor.getString(i17);
                    this.f317818d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317813m == hashCode) {
                try {
                    this.f66198x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317814n == hashCode) {
                try {
                    this.f66199xcacd07f2 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317815o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317818d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f66200xdec927b);
        }
        if (this.f317819e) {
            contentValues.put("appId", this.f66198x28d45f97);
        }
        if (this.f317820f) {
            contentValues.put("prefetchUpdateTime", java.lang.Long.valueOf(this.f66199xcacd07f2));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandPrefetchWxaAttrsMarkTable ( ");
        l75.e0 e0Var = f317816p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317811h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", "createTableSql %s", str2);
            k0Var.A("AppBrandPrefetchWxaAttrsMarkTable", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandPrefetchWxaAttrsMarkTable", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", "updateTableSql %s", str3);
            k0Var.A("AppBrandPrefetchWxaAttrsMarkTable", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandPrefetchWxaAttrsMarkTable", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317816p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317817q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66200xdec927b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317810g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317810g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f66200xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f317818d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.f66198x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f317819e = true;
            }
        }
        if (contentValues.containsKey("prefetchUpdateTime")) {
            this.f66199xcacd07f2 = contentValues.getAsLong("prefetchUpdateTime").longValue();
            if (z17) {
                this.f317820f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
