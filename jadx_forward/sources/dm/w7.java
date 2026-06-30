package dm;

/* loaded from: classes15.dex */
public class w7 extends l75.f0 {
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
    public static final int f322359J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final l75.e0 N;
    public static final o75.e P;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.n0 f322360v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f322361w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f322362x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f322363y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f322364z;

    /* renamed from: field_audioBitrate */
    public int f69003xa78549dc;

    /* renamed from: field_cacheSize */
    public long f69004x799e9d9e;

    /* renamed from: field_codecFormat */
    public int f69005xc56863e8;

    /* renamed from: field_duration */
    public int f69006xa7075739;

    /* renamed from: field_dynamicRangeType */
    public int f69007xc0e4813d;

    /* renamed from: field_frameRate */
    public int f69008xbb1b16e8;

    /* renamed from: field_hasPlayed */
    public boolean f69009x84cd6908;

    /* renamed from: field_mediaId */
    public java.lang.String f69010xaca5bdda;

    /* renamed from: field_moovReady */
    public boolean f69011x84465715;

    /* renamed from: field_specFormat */
    public java.lang.String f69012x42ba17f7;

    /* renamed from: field_state */
    public int f69013x29d3a50c;

    /* renamed from: field_totalSize */
    public long f69014x78351860;

    /* renamed from: field_updateTime */
    public long f69015xa783a79b;

    /* renamed from: field_url */
    public java.lang.String f69016x4b6e88aa;

    /* renamed from: field_videoBitrate */
    public int f69017xfd4dbd97;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322365d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322366e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322367f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322368g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322369h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322370i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322371m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f322372n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f322373o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f322374p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f322375q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f322376r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f322377s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f322378t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f322379u = true;

    static {
        p75.n0 n0Var = new p75.n0("MBThumbPlayerMediaInfoDbCache");
        f322360v = n0Var;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322361w = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS MBExternalVideo_Info_Id ON MBThumbPlayerMediaInfoDbCache(mediaId)", "CREATE INDEX IF NOT EXISTS MBExternalVideo_Info_State ON MBThumbPlayerMediaInfoDbCache(state)", "CREATE INDEX IF NOT EXISTS MBExternalVideo_Info_SpecFormat ON MBThumbPlayerMediaInfoDbCache(specFormat)", "CREATE INDEX IF NOT EXISTS MBExternalVideo_Info_UpdateTime ON MBThumbPlayerMediaInfoDbCache(updateTime)"};
        f322362x = 940773407;
        f322363y = 116079;
        f322364z = -577311387;
        A = -553618781;
        B = 109757585;
        C = -366002675;
        D = 1504250797;
        E = -1986862190;
        F = -295931082;
        G = -374854630;
        H = -249426318;
        I = -1688626505;
        f322359J = 545057773;
        K = -1992012396;
        L = 505343128;
        M = 108705909;
        N = m125659x3593deb(dm.w7.class);
        P = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125659x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[15];
        java.lang.String[] strArr = new java.lang.String[16];
        e0Var.f398487c = strArr;
        strArr[0] = "mediaId";
        e0Var.f398488d.put("mediaId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "mediaId";
        e0Var.f398487c[1] = "url";
        e0Var.f398488d.put("url", "TEXT");
        e0Var.f398487c[2] = "totalSize";
        e0Var.f398488d.put("totalSize", "LONG");
        e0Var.f398487c[3] = "cacheSize";
        e0Var.f398488d.put("cacheSize", "LONG");
        e0Var.f398487c[4] = "state";
        e0Var.f398488d.put("state", "INTEGER");
        e0Var.f398487c[5] = "hasPlayed";
        e0Var.f398488d.put("hasPlayed", "INTEGER");
        e0Var.f398487c[6] = "codecFormat";
        e0Var.f398488d.put("codecFormat", "INTEGER default '-1' ");
        e0Var.f398487c[7] = "specFormat";
        e0Var.f398488d.put("specFormat", "TEXT");
        e0Var.f398487c[8] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[9] = "moovReady";
        e0Var.f398488d.put("moovReady", "INTEGER default 'false' ");
        e0Var.f398487c[10] = "videoBitrate";
        e0Var.f398488d.put("videoBitrate", "INTEGER default '0' ");
        e0Var.f398487c[11] = "audioBitrate";
        e0Var.f398488d.put("audioBitrate", "INTEGER default '0' ");
        e0Var.f398487c[12] = "frameRate";
        e0Var.f398488d.put("frameRate", "INTEGER default '0' ");
        e0Var.f398487c[13] = "duration";
        e0Var.f398488d.put("duration", "INTEGER default '0' ");
        e0Var.f398487c[14] = "dynamicRangeType";
        e0Var.f398488d.put("dynamicRangeType", "INTEGER default '0' ");
        e0Var.f398487c[15] = "rowid";
        e0Var.f398489e = " mediaId TEXT PRIMARY KEY ,  url TEXT,  totalSize LONG,  cacheSize LONG,  state INTEGER,  hasPlayed INTEGER,  codecFormat INTEGER default '-1' ,  specFormat TEXT,  updateTime LONG,  moovReady INTEGER default 'false' ,  videoBitrate INTEGER default '0' ,  audioBitrate INTEGER default '0' ,  frameRate INTEGER default '0' ,  duration INTEGER default '0' ,  dynamicRangeType INTEGER default '0' ";
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
            boolean z17 = true;
            if (f322362x == hashCode) {
                try {
                    this.f69010xaca5bdda = cursor.getString(i17);
                    this.f322365d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322363y == hashCode) {
                try {
                    this.f69016x4b6e88aa = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322364z == hashCode) {
                try {
                    this.f69014x78351860 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f69004x799e9d9e = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f69013x29d3a50c = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f69009x84cd6908 = z17;
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f69005xc56863e8 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f69012x42ba17f7 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f69015xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f69011x84465715 = z17;
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f69017xfd4dbd97 = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f69003xa78549dc = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322359J == hashCode) {
                try {
                    this.f69008xbb1b16e8 = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f69006xa7075739 = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (L == hashCode) {
                try {
                    this.f69007xc0e4813d = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (M == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322365d) {
            contentValues.put("mediaId", this.f69010xaca5bdda);
        }
        if (this.f322366e) {
            contentValues.put("url", this.f69016x4b6e88aa);
        }
        if (this.f322367f) {
            contentValues.put("totalSize", java.lang.Long.valueOf(this.f69014x78351860));
        }
        if (this.f322368g) {
            contentValues.put("cacheSize", java.lang.Long.valueOf(this.f69004x799e9d9e));
        }
        if (this.f322369h) {
            contentValues.put("state", java.lang.Integer.valueOf(this.f69013x29d3a50c));
        }
        if (this.f322370i) {
            if (this.f69009x84cd6908) {
                contentValues.put("hasPlayed", (java.lang.Integer) 1);
            } else {
                contentValues.put("hasPlayed", (java.lang.Integer) 0);
            }
        }
        if (this.f322371m) {
            contentValues.put("codecFormat", java.lang.Integer.valueOf(this.f69005xc56863e8));
        }
        if (this.f322372n) {
            contentValues.put("specFormat", this.f69012x42ba17f7);
        }
        if (this.f322373o) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f69015xa783a79b));
        }
        if (this.f322374p) {
            if (this.f69011x84465715) {
                contentValues.put("moovReady", (java.lang.Integer) 1);
            } else {
                contentValues.put("moovReady", (java.lang.Integer) 0);
            }
        }
        if (this.f322375q) {
            contentValues.put("videoBitrate", java.lang.Integer.valueOf(this.f69017xfd4dbd97));
        }
        if (this.f322376r) {
            contentValues.put("audioBitrate", java.lang.Integer.valueOf(this.f69003xa78549dc));
        }
        if (this.f322377s) {
            contentValues.put("frameRate", java.lang.Integer.valueOf(this.f69008xbb1b16e8));
        }
        if (this.f322378t) {
            contentValues.put("duration", java.lang.Integer.valueOf(this.f69006xa7075739));
        }
        if (this.f322379u) {
            contentValues.put("dynamicRangeType", java.lang.Integer.valueOf(this.f69007xc0e4813d));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MBThumbPlayerMediaInfoDbCache ( ");
        l75.e0 e0Var = N;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322361w) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", "createTableSql %s", str2);
            k0Var.A("MBThumbPlayerMediaInfoDbCache", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "MBThumbPlayerMediaInfoDbCache", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", "updateTableSql %s", str3);
            k0Var.A("MBThumbPlayerMediaInfoDbCache", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMBThumbPlayerMediaInfoDbCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return N;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return P;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69010xaca5bdda;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322360v;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322360v.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("mediaId")) {
            this.f69010xaca5bdda = contentValues.getAsString("mediaId");
            if (z17) {
                this.f322365d = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.f69016x4b6e88aa = contentValues.getAsString("url");
            if (z17) {
                this.f322366e = true;
            }
        }
        if (contentValues.containsKey("totalSize")) {
            this.f69014x78351860 = contentValues.getAsLong("totalSize").longValue();
            if (z17) {
                this.f322367f = true;
            }
        }
        if (contentValues.containsKey("cacheSize")) {
            this.f69004x799e9d9e = contentValues.getAsLong("cacheSize").longValue();
            if (z17) {
                this.f322368g = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.f69013x29d3a50c = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f322369h = true;
            }
        }
        if (contentValues.containsKey("hasPlayed")) {
            this.f69009x84cd6908 = contentValues.getAsInteger("hasPlayed").intValue() != 0;
            if (z17) {
                this.f322370i = true;
            }
        }
        if (contentValues.containsKey("codecFormat")) {
            this.f69005xc56863e8 = contentValues.getAsInteger("codecFormat").intValue();
            if (z17) {
                this.f322371m = true;
            }
        }
        if (contentValues.containsKey("specFormat")) {
            this.f69012x42ba17f7 = contentValues.getAsString("specFormat");
            if (z17) {
                this.f322372n = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f69015xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f322373o = true;
            }
        }
        if (contentValues.containsKey("moovReady")) {
            this.f69011x84465715 = contentValues.getAsInteger("moovReady").intValue() != 0;
            if (z17) {
                this.f322374p = true;
            }
        }
        if (contentValues.containsKey("videoBitrate")) {
            this.f69017xfd4dbd97 = contentValues.getAsInteger("videoBitrate").intValue();
            if (z17) {
                this.f322375q = true;
            }
        }
        if (contentValues.containsKey("audioBitrate")) {
            this.f69003xa78549dc = contentValues.getAsInteger("audioBitrate").intValue();
            if (z17) {
                this.f322376r = true;
            }
        }
        if (contentValues.containsKey("frameRate")) {
            this.f69008xbb1b16e8 = contentValues.getAsInteger("frameRate").intValue();
            if (z17) {
                this.f322377s = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.f69006xa7075739 = contentValues.getAsInteger("duration").intValue();
            if (z17) {
                this.f322378t = true;
            }
        }
        if (contentValues.containsKey("dynamicRangeType")) {
            this.f69007xc0e4813d = contentValues.getAsInteger("dynamicRangeType").intValue();
            if (z17) {
                this.f322379u = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
