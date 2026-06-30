package dm;

/* loaded from: classes4.dex */
public class db extends l75.f0 {
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
    public static final int f317976J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final l75.e0 U;
    public static final o75.e V;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.n0 f317977y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f317978z;

    /* renamed from: field_duration */
    public long f66281xa7075739;

    /* renamed from: field_favoriteMd5 */
    public java.lang.String f66282xf925067d;

    /* renamed from: field_interactTime */
    public long f66283x5b910148;

    /* renamed from: field_md5 */
    public java.lang.String f66284x4b6e68b9;

    /* renamed from: field_newThumbUrl */
    public java.lang.String f66285x140d09b4;

    /* renamed from: field_newVideoUrl */
    public java.lang.String f66286xfb4868ef;

    /* renamed from: field_preLoadResource */
    public long f66287x90029412;

    /* renamed from: field_preloadMediaId */
    public java.lang.String f66288xd9f687bb;

    /* renamed from: field_preloadStoryId */
    public long f66289x3194108c;

    /* renamed from: field_readId */
    public long f66290xe188436;

    /* renamed from: field_readTime */
    public long f66291xea0d6f28;

    /* renamed from: field_storyObjOneDay */
    public int f66292x4e43a39d;

    /* renamed from: field_storyPostTime */
    public int f66293xb7d4dd1d;

    /* renamed from: field_syncId */
    public long f66294x10ed17fb;

    /* renamed from: field_updateTime */
    public long f66295xa783a79b;

    /* renamed from: field_userInfo */
    public byte[] f66296xddbf0be;

    /* renamed from: field_userName */
    public java.lang.String f66297xdde069b;

    /* renamed from: field_userStoryFlag */
    public int f66298x544767f1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317979d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317980e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317981f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317982g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317983h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317984i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317985m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317986n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f317987o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f317988p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f317989q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f317990r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f317991s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f317992t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f317993u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f317994v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f317995w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f317996x = true;

    static {
        p75.n0 n0Var = new p75.n0("StoryExtItem");
        f317977y = n0Var;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317978z = new java.lang.String[0];
        A = -266666762;
        B = 107902;
        C = -620940682;
        D = -1471303303;
        E = -1886842700;
        F = -295931082;
        G = -887494378;
        H = -934980271;
        I = 1049274274;
        f317976J = -1639503432;
        K = -867539581;
        L = -2120771929;
        M = 704253398;
        N = 1081069911;
        P = -1992012396;
        Q = -266803431;
        R = -1922716094;
        S = 1332040227;
        T = 108705909;
        U = m124884x3593deb(dm.db.class);
        V = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124884x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[18];
        java.lang.String[] strArr = new java.lang.String[19];
        e0Var.f398487c = strArr;
        strArr[0] = "userName";
        e0Var.f398488d.put("userName", "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = "userName";
        e0Var.f398487c[1] = "md5";
        e0Var.f398488d.put("md5", "TEXT");
        e0Var.f398487c[2] = "userStoryFlag";
        e0Var.f398488d.put("userStoryFlag", "INTEGER");
        e0Var.f398487c[3] = "newThumbUrl";
        e0Var.f398488d.put("newThumbUrl", "TEXT");
        e0Var.f398487c[4] = "newVideoUrl";
        e0Var.f398488d.put("newVideoUrl", "TEXT");
        e0Var.f398487c[5] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[6] = "syncId";
        e0Var.f398488d.put("syncId", "LONG");
        e0Var.f398487c[7] = "readId";
        e0Var.f398488d.put("readId", "LONG");
        e0Var.f398487c[8] = "storyPostTime";
        e0Var.f398488d.put("storyPostTime", "INTEGER");
        e0Var.f398487c[9] = "storyObjOneDay";
        e0Var.f398488d.put("storyObjOneDay", "INTEGER");
        e0Var.f398487c[10] = "readTime";
        e0Var.f398488d.put("readTime", "LONG");
        e0Var.f398487c[11] = "preloadStoryId";
        e0Var.f398488d.put("preloadStoryId", "LONG");
        e0Var.f398487c[12] = "preloadMediaId";
        e0Var.f398488d.put("preloadMediaId", "TEXT");
        e0Var.f398487c[13] = "preLoadResource";
        e0Var.f398488d.put("preLoadResource", "LONG");
        e0Var.f398487c[14] = "duration";
        e0Var.f398488d.put("duration", "LONG");
        e0Var.f398487c[15] = "userInfo";
        e0Var.f398488d.put("userInfo", "BLOB");
        e0Var.f398487c[16] = "favoriteMd5";
        e0Var.f398488d.put("favoriteMd5", "TEXT");
        e0Var.f398487c[17] = "interactTime";
        e0Var.f398488d.put("interactTime", "LONG");
        e0Var.f398487c[18] = "rowid";
        e0Var.f398489e = " userName TEXT default ''  PRIMARY KEY ,  md5 TEXT,  userStoryFlag INTEGER,  newThumbUrl TEXT,  newVideoUrl TEXT,  updateTime LONG,  syncId LONG,  readId LONG,  storyPostTime INTEGER,  storyObjOneDay INTEGER,  readTime LONG,  preloadStoryId LONG,  preloadMediaId TEXT,  preLoadResource LONG,  duration LONG,  userInfo BLOB,  favoriteMd5 TEXT,  interactTime LONG";
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
            if (A == hashCode) {
                try {
                    this.f66297xdde069b = cursor.getString(i17);
                    this.f317979d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f66284x4b6e68b9 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f66298x544767f1 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f66285x140d09b4 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f66286xfb4868ef = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f66295xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f66294x10ed17fb = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f66290xe188436 = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f66293xb7d4dd1d = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317976J == hashCode) {
                try {
                    this.f66292x4e43a39d = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f66291xea0d6f28 = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (L == hashCode) {
                try {
                    this.f66289x3194108c = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (M == hashCode) {
                try {
                    this.f66288xd9f687bb = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (N == hashCode) {
                try {
                    this.f66287x90029412 = cursor.getLong(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (P == hashCode) {
                try {
                    this.f66281xa7075739 = cursor.getLong(i17);
                } catch (java.lang.Throwable th20) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (Q == hashCode) {
                try {
                    this.f66296xddbf0be = cursor.getBlob(i17);
                } catch (java.lang.Throwable th21) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (R == hashCode) {
                try {
                    this.f66282xf925067d = cursor.getString(i17);
                } catch (java.lang.Throwable th22) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (S == hashCode) {
                try {
                    this.f66283x5b910148 = cursor.getLong(i17);
                } catch (java.lang.Throwable th23) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryExtItem", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (T == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f66297xdde069b == null) {
            this.f66297xdde069b = "";
        }
        if (this.f317979d) {
            contentValues.put("userName", this.f66297xdde069b);
        }
        if (this.f317980e) {
            contentValues.put("md5", this.f66284x4b6e68b9);
        }
        if (this.f317981f) {
            contentValues.put("userStoryFlag", java.lang.Integer.valueOf(this.f66298x544767f1));
        }
        if (this.f317982g) {
            contentValues.put("newThumbUrl", this.f66285x140d09b4);
        }
        if (this.f317983h) {
            contentValues.put("newVideoUrl", this.f66286xfb4868ef);
        }
        if (this.f317984i) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f66295xa783a79b));
        }
        if (this.f317985m) {
            contentValues.put("syncId", java.lang.Long.valueOf(this.f66294x10ed17fb));
        }
        if (this.f317986n) {
            contentValues.put("readId", java.lang.Long.valueOf(this.f66290xe188436));
        }
        if (this.f317987o) {
            contentValues.put("storyPostTime", java.lang.Integer.valueOf(this.f66293xb7d4dd1d));
        }
        if (this.f317988p) {
            contentValues.put("storyObjOneDay", java.lang.Integer.valueOf(this.f66292x4e43a39d));
        }
        if (this.f317989q) {
            contentValues.put("readTime", java.lang.Long.valueOf(this.f66291xea0d6f28));
        }
        if (this.f317990r) {
            contentValues.put("preloadStoryId", java.lang.Long.valueOf(this.f66289x3194108c));
        }
        if (this.f317991s) {
            contentValues.put("preloadMediaId", this.f66288xd9f687bb);
        }
        if (this.f317992t) {
            contentValues.put("preLoadResource", java.lang.Long.valueOf(this.f66287x90029412));
        }
        if (this.f317993u) {
            contentValues.put("duration", java.lang.Long.valueOf(this.f66281xa7075739));
        }
        if (this.f317994v) {
            contentValues.put("userInfo", this.f66296xddbf0be);
        }
        if (this.f317995w) {
            contentValues.put("favoriteMd5", this.f66282xf925067d);
        }
        if (this.f317996x) {
            contentValues.put("interactTime", java.lang.Long.valueOf(this.f66283x5b910148));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseStoryExtItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS StoryExtItem ( ");
        l75.e0 e0Var = U;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317978z) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryExtItem", "createTableSql %s", str2);
            k0Var.A("StoryExtItem", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "StoryExtItem", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryExtItem", "updateTableSql %s", str3);
            k0Var.A("StoryExtItem", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryExtItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return U;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return V;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66297xdde069b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317977y;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317977y.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("userName")) {
            this.f66297xdde069b = contentValues.getAsString("userName");
            if (z17) {
                this.f317979d = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.f66284x4b6e68b9 = contentValues.getAsString("md5");
            if (z17) {
                this.f317980e = true;
            }
        }
        if (contentValues.containsKey("userStoryFlag")) {
            this.f66298x544767f1 = contentValues.getAsInteger("userStoryFlag").intValue();
            if (z17) {
                this.f317981f = true;
            }
        }
        if (contentValues.containsKey("newThumbUrl")) {
            this.f66285x140d09b4 = contentValues.getAsString("newThumbUrl");
            if (z17) {
                this.f317982g = true;
            }
        }
        if (contentValues.containsKey("newVideoUrl")) {
            this.f66286xfb4868ef = contentValues.getAsString("newVideoUrl");
            if (z17) {
                this.f317983h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f66295xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f317984i = true;
            }
        }
        if (contentValues.containsKey("syncId")) {
            this.f66294x10ed17fb = contentValues.getAsLong("syncId").longValue();
            if (z17) {
                this.f317985m = true;
            }
        }
        if (contentValues.containsKey("readId")) {
            this.f66290xe188436 = contentValues.getAsLong("readId").longValue();
            if (z17) {
                this.f317986n = true;
            }
        }
        if (contentValues.containsKey("storyPostTime")) {
            this.f66293xb7d4dd1d = contentValues.getAsInteger("storyPostTime").intValue();
            if (z17) {
                this.f317987o = true;
            }
        }
        if (contentValues.containsKey("storyObjOneDay")) {
            this.f66292x4e43a39d = contentValues.getAsInteger("storyObjOneDay").intValue();
            if (z17) {
                this.f317988p = true;
            }
        }
        if (contentValues.containsKey("readTime")) {
            this.f66291xea0d6f28 = contentValues.getAsLong("readTime").longValue();
            if (z17) {
                this.f317989q = true;
            }
        }
        if (contentValues.containsKey("preloadStoryId")) {
            this.f66289x3194108c = contentValues.getAsLong("preloadStoryId").longValue();
            if (z17) {
                this.f317990r = true;
            }
        }
        if (contentValues.containsKey("preloadMediaId")) {
            this.f66288xd9f687bb = contentValues.getAsString("preloadMediaId");
            if (z17) {
                this.f317991s = true;
            }
        }
        if (contentValues.containsKey("preLoadResource")) {
            this.f66287x90029412 = contentValues.getAsLong("preLoadResource").longValue();
            if (z17) {
                this.f317992t = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.f66281xa7075739 = contentValues.getAsLong("duration").longValue();
            if (z17) {
                this.f317993u = true;
            }
        }
        if (contentValues.containsKey("userInfo")) {
            this.f66296xddbf0be = contentValues.getAsByteArray("userInfo");
            if (z17) {
                this.f317994v = true;
            }
        }
        if (contentValues.containsKey("favoriteMd5")) {
            this.f66282xf925067d = contentValues.getAsString("favoriteMd5");
            if (z17) {
                this.f317995w = true;
            }
        }
        if (contentValues.containsKey("interactTime")) {
            this.f66283x5b910148 = contentValues.getAsLong("interactTime").longValue();
            if (z17) {
                this.f317996x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
