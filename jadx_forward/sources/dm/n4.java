package dm;

/* loaded from: classes4.dex */
public class n4 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f320203f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f320204g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f320205h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f320206i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320207m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f320208n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f320209o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320210d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320211e = true;

    /* renamed from: field_dislikeBannerId */
    public java.lang.String f67661xb1c9dc67;

    /* renamed from: field_timestamp */
    public long f67662x9de75411;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveDislikeBannerRecord");
        f320203f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320204g = new java.lang.String[0];
        f320205h = 1647778220;
        f320206i = 55126294;
        f320207m = 108705909;
        f320208n = m125335x3593deb(dm.n4.class);
        f320209o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125335x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "dislikeBannerId";
        e0Var.f398488d.put("dislikeBannerId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "dislikeBannerId";
        e0Var.f398487c[1] = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6;
        e0Var.f398488d.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "LONG");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " dislikeBannerId TEXT PRIMARY KEY ,  timestamp LONG";
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
            if (f320205h == hashCode) {
                try {
                    this.f67661xb1c9dc67 = cursor.getString(i17);
                    this.f320210d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320206i == hashCode) {
                try {
                    this.f67662x9de75411 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320207m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320210d) {
            contentValues.put("dislikeBannerId", this.f67661xb1c9dc67);
        }
        if (this.f320211e) {
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f67662x9de75411));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveDislikeBannerRecord ( ");
        l75.e0 e0Var = f320208n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320204g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", "createTableSql %s", str2);
            k0Var.A("FinderLiveDislikeBannerRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderLiveDislikeBannerRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", "updateTableSql %s", str3);
            k0Var.A("FinderLiveDislikeBannerRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveDislikeBannerRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320208n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320209o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67661xb1c9dc67;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320203f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320203f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("dislikeBannerId")) {
            this.f67661xb1c9dc67 = contentValues.getAsString("dislikeBannerId");
            if (z17) {
                this.f320210d = true;
            }
        }
        if (contentValues.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            this.f67662x9de75411 = contentValues.getAsLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6).longValue();
            if (z17) {
                this.f320211e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
