package dm;

/* loaded from: classes4.dex */
public class o1 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f320395g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.d f320396h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f320397i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320398m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320399n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320400o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320401p;

    /* renamed from: q, reason: collision with root package name */
    public static final l75.e0 f320402q;

    /* renamed from: r, reason: collision with root package name */
    public static final o75.e f320403r;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320404d = false;

    /* renamed from: field_MsgId */
    private long f67774x27bbc4d7 = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320405e = false;

    /* renamed from: field_CachePath */
    private java.lang.String f67772xf10f41a2 = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f320406f = false;

    /* renamed from: field_DownloadTime */
    private long f67773x58120eba = 0;

    static {
        p75.n0 n0Var = new p75.n0("C2CPreloadFileCache");
        f320395g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320396h = new p75.d("DownloadTime", "long", tableName, "");
        f320397i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS MsgIdIndex ON C2CPreloadFileCache(MsgId)", "CREATE INDEX IF NOT EXISTS TimeIndex ON C2CPreloadFileCache(DownloadTime)"};
        f320398m = 74638428;
        f320399n = 1450192141;
        f320400o = 1273388949;
        f320401p = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "MsgId";
        ((java.util.HashMap) e0Var.f398488d).put("MsgId", "LONG default '0' ");
        e0Var.f398487c[1] = "CacheName";
        ((java.util.HashMap) e0Var.f398488d).put("CacheName", "TEXT default '' ");
        e0Var.f398487c[2] = "DownloadTime";
        ((java.util.HashMap) e0Var.f398488d).put("DownloadTime", "LONG default '0' ");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " MsgId LONG default '0' ,  CacheName TEXT default '' ,  DownloadTime LONG default '0' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f320402q = e0Var;
        f320403r = new o75.e();
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
            if (f320398m == hashCode) {
                try {
                    this.f67774x27bbc4d7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreloadFileCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320399n == hashCode) {
                try {
                    this.f67772xf10f41a2 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreloadFileCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320400o == hashCode) {
                try {
                    this.f67773x58120eba = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreloadFileCache", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320401p == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320404d) {
            contentValues.put("MsgId", java.lang.Long.valueOf(this.f67774x27bbc4d7));
        }
        if (this.f67772xf10f41a2 == null) {
            this.f67772xf10f41a2 = "";
        }
        if (this.f320405e) {
            contentValues.put("CacheName", this.f67772xf10f41a2);
        }
        if (this.f320406f) {
            contentValues.put("DownloadTime", java.lang.Long.valueOf(this.f67773x58120eba));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseC2CPreloadFileCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS C2CPreloadFileCache ( ");
        l75.e0 e0Var = f320402q;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320397i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseC2CPreloadFileCache", "createTableSql %s", str2);
            k0Var.A("C2CPreloadFileCache", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "C2CPreloadFileCache", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseC2CPreloadFileCache", "updateTableSql %s", str3);
            k0Var.A("C2CPreloadFileCache", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseC2CPreloadFileCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320402q;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320403r;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320395g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320395g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("MsgId")) {
            this.f67774x27bbc4d7 = contentValues.getAsLong("MsgId").longValue();
            if (z17) {
                this.f320404d = true;
            }
        }
        if (contentValues.containsKey("CacheName")) {
            this.f67772xf10f41a2 = contentValues.getAsString("CacheName");
            if (z17) {
                this.f320405e = true;
            }
        }
        if (contentValues.containsKey("DownloadTime")) {
            this.f67773x58120eba = contentValues.getAsLong("DownloadTime").longValue();
            if (z17) {
                this.f320406f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
