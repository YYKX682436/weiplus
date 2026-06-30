package dm;

/* loaded from: classes4.dex */
public class wa extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f322419i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f322420m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f322421n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f322422o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322423p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322424q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322425r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322426s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f322427t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f322428u;

    /* renamed from: field_errorcount */
    public int f69033x1ae3b86c;

    /* renamed from: field_logsize */
    public int f69034x88feef00;

    /* renamed from: field_logtime */
    public long f69035x88ff61cc;

    /* renamed from: field_offset */
    public int f69036x90a9378;

    /* renamed from: field_value */
    public byte[] f69037x29f571ec;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322429d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322430e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322431f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322432g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322433h = true;

    static {
        p75.n0 n0Var = new p75.n0("SnsReportKv");
        f322419i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322420m = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS snsreport_kv_logtime ON SnsReportKv(logtime)"};
        f322421n = 342668305;
        f322422o = -1019779949;
        f322423p = 342638917;
        f322424q = 1639744519;
        f322425r = 111972721;
        f322426s = 108705909;
        f322427t = m125667x3593deb(dm.wa.class);
        f322428u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125667x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "logtime";
        e0Var.f398488d.put("logtime", "LONG");
        e0Var.f398487c[1] = "offset";
        e0Var.f398488d.put("offset", "INTEGER default '0' ");
        e0Var.f398487c[2] = "logsize";
        e0Var.f398488d.put("logsize", "INTEGER");
        e0Var.f398487c[3] = "errorcount";
        e0Var.f398488d.put("errorcount", "INTEGER");
        e0Var.f398487c[4] = "value";
        e0Var.f398488d.put("value", "BLOB");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " logtime LONG,  offset INTEGER default '0' ,  logsize INTEGER,  errorcount INTEGER,  value BLOB";
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
            if (f322421n == hashCode) {
                try {
                    this.f69035x88ff61cc = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsReportKv", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322422o == hashCode) {
                try {
                    this.f69036x90a9378 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsReportKv", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322423p == hashCode) {
                try {
                    this.f69034x88feef00 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsReportKv", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322424q == hashCode) {
                try {
                    this.f69033x1ae3b86c = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsReportKv", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322425r == hashCode) {
                try {
                    this.f69037x29f571ec = cursor.getBlob(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsReportKv", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322426s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322429d) {
            contentValues.put("logtime", java.lang.Long.valueOf(this.f69035x88ff61cc));
        }
        if (this.f322430e) {
            contentValues.put("offset", java.lang.Integer.valueOf(this.f69036x90a9378));
        }
        if (this.f322431f) {
            contentValues.put("logsize", java.lang.Integer.valueOf(this.f69034x88feef00));
        }
        if (this.f322432g) {
            contentValues.put("errorcount", java.lang.Integer.valueOf(this.f69033x1ae3b86c));
        }
        if (this.f322433h) {
            contentValues.put("value", this.f69037x29f571ec);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSnsReportKv", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsReportKv ( ");
        l75.e0 e0Var = f322427t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322420m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsReportKv", "createTableSql %s", str2);
            k0Var.A("SnsReportKv", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "SnsReportKv", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsReportKv", "updateTableSql %s", str3);
            k0Var.A("SnsReportKv", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsReportKv", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322427t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322428u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322419i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322419i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("logtime")) {
            this.f69035x88ff61cc = contentValues.getAsLong("logtime").longValue();
            if (z17) {
                this.f322429d = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.f69036x90a9378 = contentValues.getAsInteger("offset").intValue();
            if (z17) {
                this.f322430e = true;
            }
        }
        if (contentValues.containsKey("logsize")) {
            this.f69034x88feef00 = contentValues.getAsInteger("logsize").intValue();
            if (z17) {
                this.f322431f = true;
            }
        }
        if (contentValues.containsKey("errorcount")) {
            this.f69033x1ae3b86c = contentValues.getAsInteger("errorcount").intValue();
            if (z17) {
                this.f322432g = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.f69037x29f571ec = contentValues.getAsByteArray("value");
            if (z17) {
                this.f322433h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
