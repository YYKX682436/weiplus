package dm;

/* loaded from: classes7.dex */
public class f9 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f318431n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f318432o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318433p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318434q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318435r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318436s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318437t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318438u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318439v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318440w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f318441x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f318442y;

    /* renamed from: field_fileCacheComplete */
    public int f66531xeb81a6ba;

    /* renamed from: field_fileName */
    public java.lang.String f66532xf1e8cfcc;

    /* renamed from: field_indexBitData */
    public byte[] f66533x2895804a;

    /* renamed from: field_musicId */
    public java.lang.String f66534xc8c6afdb;

    /* renamed from: field_musicUrl */
    public java.lang.String f66535x500f7aaf;

    /* renamed from: field_pieceFileMIMEType */
    public java.lang.String f66536x1308913;

    /* renamed from: field_removeDirtyBit */
    public int f66537x607a0a64;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318443d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318444e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318445f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318446g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318447h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318448i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318449m = true;

    static {
        p75.n0 n0Var = new p75.n0("PieceMusicInfo");
        f318431n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318432o = new java.lang.String[0];
        f318433p = 1412694560;
        f318434q = 843870474;
        f318435r = -735721945;
        f318436s = 476696869;
        f318437t = 898934463;
        f318438u = 1262717208;
        f318439v = -1333948289;
        f318440w = 108705909;
        f318441x = m124981x3593deb(dm.f9.class);
        f318442y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124981x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "musicId";
        e0Var.f398488d.put("musicId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "musicId";
        e0Var.f398487c[1] = "musicUrl";
        e0Var.f398488d.put("musicUrl", "TEXT");
        e0Var.f398487c[2] = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207;
        e0Var.f398488d.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, "TEXT");
        e0Var.f398487c[3] = "indexBitData";
        e0Var.f398488d.put("indexBitData", "BLOB");
        e0Var.f398487c[4] = "fileCacheComplete";
        e0Var.f398488d.put("fileCacheComplete", "INTEGER");
        e0Var.f398487c[5] = "pieceFileMIMEType";
        e0Var.f398488d.put("pieceFileMIMEType", "TEXT");
        e0Var.f398487c[6] = "removeDirtyBit";
        e0Var.f398488d.put("removeDirtyBit", "INTEGER");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " musicId TEXT PRIMARY KEY ,  musicUrl TEXT,  fileName TEXT,  indexBitData BLOB,  fileCacheComplete INTEGER,  pieceFileMIMEType TEXT,  removeDirtyBit INTEGER";
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
            if (f318433p == hashCode) {
                try {
                    this.f66534xc8c6afdb = cursor.getString(i17);
                    this.f318443d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePieceMusicInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318434q == hashCode) {
                try {
                    this.f66535x500f7aaf = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePieceMusicInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318435r == hashCode) {
                try {
                    this.f66532xf1e8cfcc = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePieceMusicInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318436s == hashCode) {
                try {
                    this.f66533x2895804a = cursor.getBlob(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePieceMusicInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318437t == hashCode) {
                try {
                    this.f66531xeb81a6ba = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePieceMusicInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318438u == hashCode) {
                try {
                    this.f66536x1308913 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePieceMusicInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318439v == hashCode) {
                try {
                    this.f66537x607a0a64 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePieceMusicInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318440w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318443d) {
            contentValues.put("musicId", this.f66534xc8c6afdb);
        }
        if (this.f318444e) {
            contentValues.put("musicUrl", this.f66535x500f7aaf);
        }
        if (this.f318445f) {
            contentValues.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, this.f66532xf1e8cfcc);
        }
        if (this.f318446g) {
            contentValues.put("indexBitData", this.f66533x2895804a);
        }
        if (this.f318447h) {
            contentValues.put("fileCacheComplete", java.lang.Integer.valueOf(this.f66531xeb81a6ba));
        }
        if (this.f318448i) {
            contentValues.put("pieceFileMIMEType", this.f66536x1308913);
        }
        if (this.f318449m) {
            contentValues.put("removeDirtyBit", java.lang.Integer.valueOf(this.f66537x607a0a64));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BasePieceMusicInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PieceMusicInfo ( ");
        l75.e0 e0Var = f318441x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318432o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePieceMusicInfo", "createTableSql %s", str2);
            k0Var.A("PieceMusicInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "PieceMusicInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePieceMusicInfo", "updateTableSql %s", str3);
            k0Var.A("PieceMusicInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePieceMusicInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318441x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318442y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66534xc8c6afdb;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318431n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318431n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("musicId")) {
            this.f66534xc8c6afdb = contentValues.getAsString("musicId");
            if (z17) {
                this.f318443d = true;
            }
        }
        if (contentValues.containsKey("musicUrl")) {
            this.f66535x500f7aaf = contentValues.getAsString("musicUrl");
            if (z17) {
                this.f318444e = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207)) {
            this.f66532xf1e8cfcc = contentValues.getAsString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
            if (z17) {
                this.f318445f = true;
            }
        }
        if (contentValues.containsKey("indexBitData")) {
            this.f66533x2895804a = contentValues.getAsByteArray("indexBitData");
            if (z17) {
                this.f318446g = true;
            }
        }
        if (contentValues.containsKey("fileCacheComplete")) {
            this.f66531xeb81a6ba = contentValues.getAsInteger("fileCacheComplete").intValue();
            if (z17) {
                this.f318447h = true;
            }
        }
        if (contentValues.containsKey("pieceFileMIMEType")) {
            this.f66536x1308913 = contentValues.getAsString("pieceFileMIMEType");
            if (z17) {
                this.f318448i = true;
            }
        }
        if (contentValues.containsKey("removeDirtyBit")) {
            this.f66537x607a0a64 = contentValues.getAsInteger("removeDirtyBit").intValue();
            if (z17) {
                this.f318449m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
