package dm;

/* loaded from: classes8.dex */
public class l6 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f319795p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f319796q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319797r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319798s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319799t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319800u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319801v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319802w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319803x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319804y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f319805z;

    /* renamed from: field_aeskey */
    public java.lang.String f67333xf11e6e15;

    /* renamed from: field_cdnType */
    public int f67334x9a7652c2;

    /* renamed from: field_fileThumbUrl */
    public java.lang.String f67335x1dfc107a;

    /* renamed from: field_fileUrl */
    public java.lang.String f67336x419c440e;

    /* renamed from: field_fileid */
    public java.lang.String f67337xf9dbc27c;

    /* renamed from: field_md5 */
    public java.lang.String f67338x4b6e68b9;

    /* renamed from: field_msgid */
    public long f67339x297eb8d7;

    /* renamed from: field_size */
    public int f67340x22618426;

    /* renamed from: field_talker */
    public java.lang.String f67341x114ef53e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319806d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319807e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319808f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319809g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319810h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319811i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319812m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319813n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f319814o = true;

    static {
        p75.n0 n0Var = new p75.n0("HardIotCdnInfo");
        f319795p = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319796q = new java.lang.String[0];
        f319797r = 104192092;
        f319798s = -1274506345;
        f319799t = -1421131984;
        f319800u = 107902;
        f319801v = 3530753;
        f319802w = -881080743;
        f319803x = 635675911;
        f319804y = -855009709;
        f319805z = 298869077;
        A = 108705909;
        B = m125199x3593deb(dm.l6.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125199x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "msgid";
        e0Var.f398488d.put("msgid", "LONG PRIMARY KEY ");
        e0Var.f398486b = "msgid";
        e0Var.f398487c[1] = "fileid";
        e0Var.f398488d.put("fileid", "TEXT");
        e0Var.f398487c[2] = "aeskey";
        e0Var.f398488d.put("aeskey", "TEXT");
        e0Var.f398487c[3] = "md5";
        e0Var.f398488d.put("md5", "TEXT");
        e0Var.f398487c[4] = "size";
        e0Var.f398488d.put("size", "INTEGER");
        e0Var.f398487c[5] = "talker";
        e0Var.f398488d.put("talker", "TEXT");
        e0Var.f398487c[6] = "cdnType";
        e0Var.f398488d.put("cdnType", "INTEGER");
        e0Var.f398487c[7] = "fileUrl";
        e0Var.f398488d.put("fileUrl", "TEXT");
        e0Var.f398487c[8] = "fileThumbUrl";
        e0Var.f398488d.put("fileThumbUrl", "TEXT");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " msgid LONG PRIMARY KEY ,  fileid TEXT,  aeskey TEXT,  md5 TEXT,  size INTEGER,  talker TEXT,  cdnType INTEGER,  fileUrl TEXT,  fileThumbUrl TEXT";
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
            if (f319797r == hashCode) {
                try {
                    this.f67339x297eb8d7 = cursor.getLong(i17);
                    this.f319806d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotCdnInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319798s == hashCode) {
                try {
                    this.f67337xf9dbc27c = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotCdnInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319799t == hashCode) {
                try {
                    this.f67333xf11e6e15 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotCdnInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319800u == hashCode) {
                try {
                    this.f67338x4b6e68b9 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotCdnInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319801v == hashCode) {
                try {
                    this.f67340x22618426 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotCdnInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319802w == hashCode) {
                try {
                    this.f67341x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotCdnInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319803x == hashCode) {
                try {
                    this.f67334x9a7652c2 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotCdnInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319804y == hashCode) {
                try {
                    this.f67336x419c440e = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotCdnInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319805z == hashCode) {
                try {
                    this.f67335x1dfc107a = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotCdnInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319806d) {
            contentValues.put("msgid", java.lang.Long.valueOf(this.f67339x297eb8d7));
        }
        if (this.f319807e) {
            contentValues.put("fileid", this.f67337xf9dbc27c);
        }
        if (this.f319808f) {
            contentValues.put("aeskey", this.f67333xf11e6e15);
        }
        if (this.f319809g) {
            contentValues.put("md5", this.f67338x4b6e68b9);
        }
        if (this.f319810h) {
            contentValues.put("size", java.lang.Integer.valueOf(this.f67340x22618426));
        }
        if (this.f319811i) {
            contentValues.put("talker", this.f67341x114ef53e);
        }
        if (this.f319812m) {
            contentValues.put("cdnType", java.lang.Integer.valueOf(this.f67334x9a7652c2));
        }
        if (this.f319813n) {
            contentValues.put("fileUrl", this.f67336x419c440e);
        }
        if (this.f319814o) {
            contentValues.put("fileThumbUrl", this.f67335x1dfc107a);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseHardIotCdnInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardIotCdnInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319796q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardIotCdnInfo", "createTableSql %s", str2);
            k0Var.A("HardIotCdnInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "HardIotCdnInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardIotCdnInfo", "updateTableSql %s", str3);
            k0Var.A("HardIotCdnInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardIotCdnInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return B;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return C;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f67339x297eb8d7);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319795p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319795p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgid")) {
            this.f67339x297eb8d7 = contentValues.getAsLong("msgid").longValue();
            if (z17) {
                this.f319806d = true;
            }
        }
        if (contentValues.containsKey("fileid")) {
            this.f67337xf9dbc27c = contentValues.getAsString("fileid");
            if (z17) {
                this.f319807e = true;
            }
        }
        if (contentValues.containsKey("aeskey")) {
            this.f67333xf11e6e15 = contentValues.getAsString("aeskey");
            if (z17) {
                this.f319808f = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.f67338x4b6e68b9 = contentValues.getAsString("md5");
            if (z17) {
                this.f319809g = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.f67340x22618426 = contentValues.getAsInteger("size").intValue();
            if (z17) {
                this.f319810h = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f67341x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f319811i = true;
            }
        }
        if (contentValues.containsKey("cdnType")) {
            this.f67334x9a7652c2 = contentValues.getAsInteger("cdnType").intValue();
            if (z17) {
                this.f319812m = true;
            }
        }
        if (contentValues.containsKey("fileUrl")) {
            this.f67336x419c440e = contentValues.getAsString("fileUrl");
            if (z17) {
                this.f319813n = true;
            }
        }
        if (contentValues.containsKey("fileThumbUrl")) {
            this.f67335x1dfc107a = contentValues.getAsString("fileThumbUrl");
            if (z17) {
                this.f319814o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
