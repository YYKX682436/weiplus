package dm;

/* loaded from: classes8.dex */
public class v1 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f321981i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f321982m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f321983n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321984o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321985p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321986q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321987r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321988s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f321989t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f321990u;

    /* renamed from: field_businessId */
    public int f68636x1e9b0d60;

    /* renamed from: field_delayTime */
    public long f68637x7ea831eb;

    /* renamed from: field_itemInfo */
    public byte[] f68638x63ed9c06;

    /* renamed from: field_localItemReportId */
    public long f68639x95cc68a8;

    /* renamed from: field_reportTime */
    public long f68640x2c459686;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321991d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321992e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321993f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321994g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321995h = true;

    static {
        p75.n0 n0Var = new p75.n0("CgiReportLocalItemDataCache");
        f321981i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321982m = new java.lang.String[0];
        f321983n = -539006803;
        f321984o = 1177195105;
        f321985p = 1702091003;
        f321986q = 1931371041;
        f321987r = -469104912;
        f321988s = 108705909;
        f321989t = m125553x3593deb(dm.v1.class);
        f321990u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125553x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "localItemReportId";
        e0Var.f398488d.put("localItemReportId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "localItemReportId";
        e0Var.f398487c[1] = "itemInfo";
        e0Var.f398488d.put("itemInfo", "BLOB");
        e0Var.f398487c[2] = "businessId";
        e0Var.f398488d.put("businessId", "INTEGER");
        e0Var.f398487c[3] = "reportTime";
        e0Var.f398488d.put("reportTime", "LONG");
        e0Var.f398487c[4] = "delayTime";
        e0Var.f398488d.put("delayTime", "LONG");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " localItemReportId LONG PRIMARY KEY ,  itemInfo BLOB,  businessId INTEGER,  reportTime LONG,  delayTime LONG";
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
            if (f321983n == hashCode) {
                try {
                    this.f68639x95cc68a8 = cursor.getLong(i17);
                    this.f321991d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321984o == hashCode) {
                try {
                    this.f68638x63ed9c06 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321985p == hashCode) {
                try {
                    this.f68636x1e9b0d60 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321986q == hashCode) {
                try {
                    this.f68640x2c459686 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321987r == hashCode) {
                try {
                    this.f68637x7ea831eb = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321988s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321991d) {
            contentValues.put("localItemReportId", java.lang.Long.valueOf(this.f68639x95cc68a8));
        }
        if (this.f321992e) {
            contentValues.put("itemInfo", this.f68638x63ed9c06);
        }
        if (this.f321993f) {
            contentValues.put("businessId", java.lang.Integer.valueOf(this.f68636x1e9b0d60));
        }
        if (this.f321994g) {
            contentValues.put("reportTime", java.lang.Long.valueOf(this.f68640x2c459686));
        }
        if (this.f321995h) {
            contentValues.put("delayTime", java.lang.Long.valueOf(this.f68637x7ea831eb));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CgiReportLocalItemDataCache ( ");
        l75.e0 e0Var = f321989t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321982m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", "createTableSql %s", str2);
            k0Var.A("CgiReportLocalItemDataCache", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "CgiReportLocalItemDataCache", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", "updateTableSql %s", str3);
            k0Var.A("CgiReportLocalItemDataCache", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCgiReportLocalItemDataCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321989t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321990u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f68639x95cc68a8);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321981i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321981i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("localItemReportId")) {
            this.f68639x95cc68a8 = contentValues.getAsLong("localItemReportId").longValue();
            if (z17) {
                this.f321991d = true;
            }
        }
        if (contentValues.containsKey("itemInfo")) {
            this.f68638x63ed9c06 = contentValues.getAsByteArray("itemInfo");
            if (z17) {
                this.f321992e = true;
            }
        }
        if (contentValues.containsKey("businessId")) {
            this.f68636x1e9b0d60 = contentValues.getAsInteger("businessId").intValue();
            if (z17) {
                this.f321993f = true;
            }
        }
        if (contentValues.containsKey("reportTime")) {
            this.f68640x2c459686 = contentValues.getAsLong("reportTime").longValue();
            if (z17) {
                this.f321994g = true;
            }
        }
        if (contentValues.containsKey("delayTime")) {
            this.f68637x7ea831eb = contentValues.getAsLong("delayTime").longValue();
            if (z17) {
                this.f321995h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
