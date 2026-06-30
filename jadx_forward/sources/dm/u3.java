package dm;

/* loaded from: classes4.dex */
public class u3 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f321802i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f321803m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f321804n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321805o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321806p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321807q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321808r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321809s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f321810t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f321811u;

    /* renamed from: field_aeskey */
    public java.lang.String f68546xf11e6e15;

    /* renamed from: field_cgi */
    public java.lang.String f68547x4b6e43c0;

    /* renamed from: field_filePath */
    public java.lang.String f68548xf1e9b966;

    /* renamed from: field_msgSvrId */
    public long f68549xd09be28e;

    /* renamed from: field_overwriteNewMsgId */
    public long f68550x9431e762;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321812d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321813e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321814f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321815g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321816h = true;

    static {
        p75.n0 n0Var = new p75.n0("FileMsgInfo");
        f321802i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321803m = new java.lang.String[0];
        f321804n = -1294411543;
        f321805o = -565909657;
        f321806p = 98437;
        f321807q = -1421131984;
        f321808r = -735662143;
        f321809s = 108705909;
        f321810t = m125532x3593deb(dm.u3.class);
        f321811u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125532x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "msgSvrId";
        e0Var.f398488d.put("msgSvrId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "msgSvrId";
        e0Var.f398487c[1] = "overwriteNewMsgId";
        e0Var.f398488d.put("overwriteNewMsgId", "LONG");
        e0Var.f398487c[2] = "cgi";
        e0Var.f398488d.put("cgi", "TEXT default '' ");
        e0Var.f398487c[3] = "aeskey";
        e0Var.f398488d.put("aeskey", "TEXT default '' ");
        e0Var.f398487c[4] = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1;
        e0Var.f398488d.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "TEXT default '' ");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " msgSvrId LONG PRIMARY KEY ,  overwriteNewMsgId LONG,  cgi TEXT default '' ,  aeskey TEXT default '' ,  filePath TEXT default '' ";
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
            if (f321804n == hashCode) {
                try {
                    this.f68549xd09be28e = cursor.getLong(i17);
                    this.f321812d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFileMsgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321805o == hashCode) {
                try {
                    this.f68550x9431e762 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFileMsgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321806p == hashCode) {
                try {
                    this.f68547x4b6e43c0 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFileMsgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321807q == hashCode) {
                try {
                    this.f68546xf11e6e15 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFileMsgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321808r == hashCode) {
                try {
                    this.f68548xf1e9b966 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFileMsgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321809s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321812d) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.f68549xd09be28e));
        }
        if (this.f321813e) {
            contentValues.put("overwriteNewMsgId", java.lang.Long.valueOf(this.f68550x9431e762));
        }
        if (this.f68547x4b6e43c0 == null) {
            this.f68547x4b6e43c0 = "";
        }
        if (this.f321814f) {
            contentValues.put("cgi", this.f68547x4b6e43c0);
        }
        if (this.f68546xf11e6e15 == null) {
            this.f68546xf11e6e15 = "";
        }
        if (this.f321815g) {
            contentValues.put("aeskey", this.f68546xf11e6e15);
        }
        if (this.f68548xf1e9b966 == null) {
            this.f68548xf1e9b966 = "";
        }
        if (this.f321816h) {
            contentValues.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, this.f68548xf1e9b966);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFileMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FileMsgInfo ( ");
        l75.e0 e0Var = f321810t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321803m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFileMsgInfo", "createTableSql %s", str2);
            k0Var.A("FileMsgInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FileMsgInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFileMsgInfo", "updateTableSql %s", str3);
            k0Var.A("FileMsgInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFileMsgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321810t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321811u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f68549xd09be28e);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321802i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321802i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "msgSvrId", java.lang.Long.valueOf(this.f68549xd09be28e));
            n51.f.b(jSONObject, "overwriteNewMsgId", java.lang.Long.valueOf(this.f68550x9431e762));
            n51.f.b(jSONObject, "cgi", this.f68547x4b6e43c0);
            n51.f.b(jSONObject, "aeskey", this.f68546xf11e6e15);
            n51.f.b(jSONObject, com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, this.f68548xf1e9b966);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgSvrId")) {
            this.f68549xd09be28e = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f321812d = true;
            }
        }
        if (contentValues.containsKey("overwriteNewMsgId")) {
            this.f68550x9431e762 = contentValues.getAsLong("overwriteNewMsgId").longValue();
            if (z17) {
                this.f321813e = true;
            }
        }
        if (contentValues.containsKey("cgi")) {
            this.f68547x4b6e43c0 = contentValues.getAsString("cgi");
            if (z17) {
                this.f321814f = true;
            }
        }
        if (contentValues.containsKey("aeskey")) {
            this.f68546xf11e6e15 = contentValues.getAsString("aeskey");
            if (z17) {
                this.f321815g = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1)) {
            this.f68548xf1e9b966 = contentValues.getAsString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
            if (z17) {
                this.f321816h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
