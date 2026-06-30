package dm;

/* loaded from: classes4.dex */
public class v0 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f321968h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f321969i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321970m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f321971n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321972o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321973p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321974q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f321975r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f321976s;

    /* renamed from: field_aScene */
    public int f68632xf0196b90;

    /* renamed from: field_appMsgReportContextId */
    public long f68633x1ec7cd11;

    /* renamed from: field_reportTime */
    public long f68634x2c459686;

    /* renamed from: field_url */
    public java.lang.String f68635x4b6e88aa;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321977d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321978e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321979f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321980g = true;

    static {
        p75.n0 n0Var = new p75.n0("BizAppMsgReportContext");
        f321968h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321969i = new java.lang.String[0];
        f321970m = 664879766;
        f321971n = 116079;
        f321972o = 1931371041;
        f321973p = -1438237525;
        f321974q = 108705909;
        f321975r = m125551x3593deb(dm.v0.class);
        f321976s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125551x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "appMsgReportContextId";
        e0Var.f398488d.put("appMsgReportContextId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "appMsgReportContextId";
        e0Var.f398487c[1] = "url";
        e0Var.f398488d.put("url", "TEXT");
        e0Var.f398487c[2] = "reportTime";
        e0Var.f398488d.put("reportTime", "LONG");
        e0Var.f398487c[3] = "aScene";
        e0Var.f398488d.put("aScene", "INTEGER");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " appMsgReportContextId LONG PRIMARY KEY ,  url TEXT,  reportTime LONG,  aScene INTEGER";
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
            if (f321970m == hashCode) {
                try {
                    this.f68633x1ec7cd11 = cursor.getLong(i17);
                    this.f321977d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizAppMsgReportContext", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321971n == hashCode) {
                try {
                    this.f68635x4b6e88aa = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizAppMsgReportContext", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321972o == hashCode) {
                try {
                    this.f68634x2c459686 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizAppMsgReportContext", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321973p == hashCode) {
                try {
                    this.f68632xf0196b90 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizAppMsgReportContext", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321974q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321977d) {
            contentValues.put("appMsgReportContextId", java.lang.Long.valueOf(this.f68633x1ec7cd11));
        }
        if (this.f321978e) {
            contentValues.put("url", this.f68635x4b6e88aa);
        }
        if (this.f321979f) {
            contentValues.put("reportTime", java.lang.Long.valueOf(this.f68634x2c459686));
        }
        if (this.f321980g) {
            contentValues.put("aScene", java.lang.Integer.valueOf(this.f68632xf0196b90));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBizAppMsgReportContext", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizAppMsgReportContext ( ");
        l75.e0 e0Var = f321975r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321969i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizAppMsgReportContext", "createTableSql %s", str2);
            k0Var.A("BizAppMsgReportContext", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BizAppMsgReportContext", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizAppMsgReportContext", "updateTableSql %s", str3);
            k0Var.A("BizAppMsgReportContext", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizAppMsgReportContext", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321975r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321976s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f68633x1ec7cd11);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321968h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321968h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appMsgReportContextId")) {
            this.f68633x1ec7cd11 = contentValues.getAsLong("appMsgReportContextId").longValue();
            if (z17) {
                this.f321977d = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.f68635x4b6e88aa = contentValues.getAsString("url");
            if (z17) {
                this.f321978e = true;
            }
        }
        if (contentValues.containsKey("reportTime")) {
            this.f68634x2c459686 = contentValues.getAsLong("reportTime").longValue();
            if (z17) {
                this.f321979f = true;
            }
        }
        if (contentValues.containsKey("aScene")) {
            this.f68632xf0196b90 = contentValues.getAsInteger("aScene").intValue();
            if (z17) {
                this.f321980g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
