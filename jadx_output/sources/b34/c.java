package b34;

/* loaded from: classes8.dex */
public class c extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f17717i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f17718m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f17719n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f17720o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f17721p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f17722q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f17723r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f17724s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f17725t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f17726u;
    public long field_createtime;
    public java.lang.String field_deeplink;
    public java.lang.String field_iconurl;
    public java.lang.String field_title;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17727d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17728e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17729f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17730g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17731h = true;

    static {
        p75.n0 n0Var = new p75.n0("ShakeTvHistory");
        f17717i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f17718m = new java.lang.String[0];
        f17719n = -265713450;
        f17720o = 629233382;
        f17721p = 110371416;
        f17722q = 1638795862;
        f17723r = 1370166729;
        f17724s = 108705909;
        f17725t = initAutoDBInfo(b34.c.class);
        f17726u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_USERNAME;
        e0Var.f316954c[1] = "deeplink";
        e0Var.f316955d.put("deeplink", "TEXT default '' ");
        e0Var.f316954c[2] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT default '' ");
        e0Var.f316954c[3] = "iconurl";
        e0Var.f316955d.put("iconurl", "TEXT default '' ");
        e0Var.f316954c[4] = "createtime";
        e0Var.f316955d.put("createtime", "LONG default '' ");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " username TEXT default ''  PRIMARY KEY ,  deeplink TEXT default '' ,  title TEXT default '' ,  iconurl TEXT default '' ,  createtime LONG default '' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    @Override // l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        java.lang.String[] columnNames = cursor.getColumnNames();
        if (columnNames == null) {
            return;
        }
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            int hashCode = columnNames[i17].hashCode();
            if (f17719n == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                    this.f17727d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeTvHistory", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f17720o == hashCode) {
                try {
                    this.field_deeplink = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeTvHistory", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f17721p == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeTvHistory", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f17722q == hashCode) {
                try {
                    this.field_iconurl = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeTvHistory", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f17723r == hashCode) {
                try {
                    this.field_createtime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeTvHistory", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f17724s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f17727d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.field_deeplink == null) {
            this.field_deeplink = "";
        }
        if (this.f17728e) {
            contentValues.put("deeplink", this.field_deeplink);
        }
        if (this.field_title == null) {
            this.field_title = "";
        }
        if (this.f17729f) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.field_iconurl == null) {
            this.field_iconurl = "";
        }
        if (this.f17730g) {
            contentValues.put("iconurl", this.field_iconurl);
        }
        if (this.f17731h) {
            contentValues.put("createtime", java.lang.Long.valueOf(this.field_createtime));
        }
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    public void createMyTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseShakeTvHistory", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ShakeTvHistory ( ");
        l75.e0 e0Var = f17725t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f17718m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeTvHistory", "createTableSql %s", str2);
            k0Var.A("ShakeTvHistory", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ShakeTvHistory", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeTvHistory", "updateTableSql %s", str3);
            k0Var.A("ShakeTvHistory", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeTvHistory", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f17725t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f17726u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_username;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f17717i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f17717i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f17727d = true;
            }
        }
        if (contentValues.containsKey("deeplink")) {
            this.field_deeplink = contentValues.getAsString("deeplink");
            if (z17) {
                this.f17728e = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f17729f = true;
            }
        }
        if (contentValues.containsKey("iconurl")) {
            this.field_iconurl = contentValues.getAsString("iconurl");
            if (z17) {
                this.f17730g = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.field_createtime = contentValues.getAsLong("createtime").longValue();
            if (z17) {
                this.f17731h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
