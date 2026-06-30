package b34;

/* loaded from: classes11.dex */
public class a extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final l75.e0 f17685J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f17686t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f17687u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f17688v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f17689w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f17690x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f17691y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f17692z;
    public long field_createtime;
    public java.lang.String field_desc;
    public java.lang.String field_reserved1;
    public java.lang.String field_reserved2;
    public int field_reserved3;
    public byte[] field_reservedBuf;
    public int field_status;
    public int field_subtype;
    public long field_svrid;
    public java.lang.String field_tag;
    public java.lang.String field_thumburl;
    public java.lang.String field_title;
    public int field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17693d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17694e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17695f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17696g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17697h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17698i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17699m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17700n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17701o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17702p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17703q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17704r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17705s = true;

    static {
        p75.n0 n0Var = new p75.n0("ShakeMessage");
        f17686t = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f17687u = new java.lang.String[0];
        f17688v = 109833162;
        f17689w = 3575610;
        f17690x = -1867567750;
        f17691y = 1370166729;
        f17692z = 114586;
        A = -892481550;
        B = 110371416;
        C = 3079825;
        D = 1566948313;
        E = 2022955529;
        F = 2022955530;
        G = 2022955531;
        H = -1559901653;
        I = 108705909;
        f17685J = initAutoDBInfo(b34.a.class);
        K = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f316954c = strArr;
        strArr[0] = "svrid";
        e0Var.f316955d.put("svrid", "LONG default '0'  PRIMARY KEY ");
        e0Var.f316953b = "svrid";
        e0Var.f316954c[1] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[2] = "subtype";
        e0Var.f316955d.put("subtype", "INTEGER default '0' ");
        e0Var.f316954c[3] = "createtime";
        e0Var.f316955d.put("createtime", "LONG");
        e0Var.f316954c[4] = "tag";
        e0Var.f316955d.put("tag", "TEXT");
        e0Var.f316954c[5] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[6] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        e0Var.f316954c[7] = "desc";
        e0Var.f316955d.put("desc", "TEXT");
        e0Var.f316954c[8] = "thumburl";
        e0Var.f316955d.put("thumburl", "TEXT");
        e0Var.f316954c[9] = "reserved1";
        e0Var.f316955d.put("reserved1", "TEXT");
        e0Var.f316954c[10] = "reserved2";
        e0Var.f316955d.put("reserved2", "TEXT");
        e0Var.f316954c[11] = "reserved3";
        e0Var.f316955d.put("reserved3", "INTEGER");
        e0Var.f316954c[12] = "reservedBuf";
        e0Var.f316955d.put("reservedBuf", "BLOB");
        e0Var.f316954c[13] = "rowid";
        e0Var.f316956e = " svrid LONG default '0'  PRIMARY KEY ,  type INTEGER,  subtype INTEGER default '0' ,  createtime LONG,  tag TEXT,  status INTEGER,  title TEXT,  desc TEXT,  thumburl TEXT,  reserved1 TEXT,  reserved2 TEXT,  reserved3 INTEGER,  reservedBuf BLOB";
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
            if (f17688v == hashCode) {
                try {
                    this.field_svrid = cursor.getLong(i17);
                    this.f17693d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f17689w == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f17690x == hashCode) {
                try {
                    this.field_subtype = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f17691y == hashCode) {
                try {
                    this.field_createtime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f17692z == hashCode) {
                try {
                    this.field_tag = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_desc = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_thumburl = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_reserved1 = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_reserved2 = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_reserved3 = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_reservedBuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeMessage", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f17693d) {
            contentValues.put("svrid", java.lang.Long.valueOf(this.field_svrid));
        }
        if (this.f17694e) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f17695f) {
            contentValues.put("subtype", java.lang.Integer.valueOf(this.field_subtype));
        }
        if (this.f17696g) {
            contentValues.put("createtime", java.lang.Long.valueOf(this.field_createtime));
        }
        if (this.f17697h) {
            contentValues.put("tag", this.field_tag);
        }
        if (this.f17698i) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f17699m) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f17700n) {
            contentValues.put("desc", this.field_desc);
        }
        if (this.f17701o) {
            contentValues.put("thumburl", this.field_thumburl);
        }
        if (this.f17702p) {
            contentValues.put("reserved1", this.field_reserved1);
        }
        if (this.f17703q) {
            contentValues.put("reserved2", this.field_reserved2);
        }
        if (this.f17704r) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.field_reserved3));
        }
        if (this.f17705s) {
            contentValues.put("reservedBuf", this.field_reservedBuf);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseShakeMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ShakeMessage ( ");
        l75.e0 e0Var = f17685J;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f17687u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeMessage", "createTableSql %s", str2);
            k0Var.A("ShakeMessage", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ShakeMessage", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeMessage", "updateTableSql %s", str3);
            k0Var.A("ShakeMessage", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeMessage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f17685J;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return K;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_svrid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f17686t;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f17686t.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("svrid")) {
            this.field_svrid = contentValues.getAsLong("svrid").longValue();
            if (z17) {
                this.f17693d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f17694e = true;
            }
        }
        if (contentValues.containsKey("subtype")) {
            this.field_subtype = contentValues.getAsInteger("subtype").intValue();
            if (z17) {
                this.f17695f = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.field_createtime = contentValues.getAsLong("createtime").longValue();
            if (z17) {
                this.f17696g = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.field_tag = contentValues.getAsString("tag");
            if (z17) {
                this.f17697h = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f17698i = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f17699m = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z17) {
                this.f17700n = true;
            }
        }
        if (contentValues.containsKey("thumburl")) {
            this.field_thumburl = contentValues.getAsString("thumburl");
            if (z17) {
                this.f17701o = true;
            }
        }
        if (contentValues.containsKey("reserved1")) {
            this.field_reserved1 = contentValues.getAsString("reserved1");
            if (z17) {
                this.f17702p = true;
            }
        }
        if (contentValues.containsKey("reserved2")) {
            this.field_reserved2 = contentValues.getAsString("reserved2");
            if (z17) {
                this.f17703q = true;
            }
        }
        if (contentValues.containsKey("reserved3")) {
            this.field_reserved3 = contentValues.getAsInteger("reserved3").intValue();
            if (z17) {
                this.f17704r = true;
            }
        }
        if (contentValues.containsKey("reservedBuf")) {
            this.field_reservedBuf = contentValues.getAsByteArray("reservedBuf");
            if (z17) {
                this.f17705s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
