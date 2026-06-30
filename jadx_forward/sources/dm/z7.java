package dm;

/* loaded from: classes4.dex */
public class z7 extends l75.f0 {
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
    public static final l75.e0 f323022J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f323023t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f323024u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f323025v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f323026w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f323027x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f323028y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f323029z;

    /* renamed from: field_attrBuf */
    public byte[] f69400x4c58c87d;

    /* renamed from: field_commentListCount */
    public int f69401x6f1be417;

    /* renamed from: field_content */
    public byte[] f69402xad49e234;

    /* renamed from: field_createTime */
    public int f69403xac3be4e;

    /* renamed from: field_favoriteTime */
    public int f69404x2b7f11ae;

    /* renamed from: field_itemStoryFlag */
    public int f69405x686589a9;

    /* renamed from: field_localFlag */
    public int f69406x52c1d072;

    /* renamed from: field_postBuf */
    public byte[] f69407x5d40d76e;

    /* renamed from: field_readCount */
    public int f69408x56b3c014;

    /* renamed from: field_sourceType */
    public int f69409x76e81a5a;

    /* renamed from: field_storyID */
    public long f69410x443468b;

    /* renamed from: field_type */
    public int f69411x2262335f;

    /* renamed from: field_userName */
    public java.lang.String f69412xdde069b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f323030d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f323031e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323032f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f323033g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f323034h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f323035i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f323036m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f323037n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f323038o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f323039p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f323040q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f323041r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f323042s = true;

    static {
        p75.n0 n0Var = new p75.n0("MMStoryInfo");
        f323023t = n0Var;
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
        f323024u = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS MMStoryInfo_id_Index ON MMStoryInfo(storyID)"};
        f323025v = -1884251952;
        f323026w = -266666762;
        f323027x = -1205623433;
        f323028y = 1369213417;
        f323029z = -866758798;
        A = 951530617;
        B = -674882878;
        C = -391239245;
        D = -1111431691;
        E = 3575610;
        F = -283421650;
        G = -1139436263;
        H = 525558409;
        I = 108705909;
        f323022J = m125773x3593deb(dm.z7.class);
        K = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125773x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f398487c = strArr;
        strArr[0] = "storyID";
        e0Var.f398488d.put("storyID", "LONG");
        e0Var.f398487c[1] = "userName";
        e0Var.f398488d.put("userName", "TEXT");
        e0Var.f398487c[2] = "localFlag";
        e0Var.f398488d.put("localFlag", "INTEGER");
        e0Var.f398487c[3] = "createTime";
        e0Var.f398488d.put("createTime", "INTEGER");
        e0Var.f398487c[4] = "commentListCount";
        e0Var.f398488d.put("commentListCount", "INTEGER");
        e0Var.f398487c[5] = "content";
        e0Var.f398488d.put("content", "BLOB");
        e0Var.f398487c[6] = "attrBuf";
        e0Var.f398488d.put("attrBuf", "BLOB");
        e0Var.f398487c[7] = "postBuf";
        e0Var.f398488d.put("postBuf", "BLOB");
        e0Var.f398487c[8] = "sourceType";
        e0Var.f398488d.put("sourceType", "INTEGER");
        e0Var.f398487c[9] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[10] = "itemStoryFlag";
        e0Var.f398488d.put("itemStoryFlag", "INTEGER");
        e0Var.f398487c[11] = "readCount";
        e0Var.f398488d.put("readCount", "INTEGER");
        e0Var.f398487c[12] = "favoriteTime";
        e0Var.f398488d.put("favoriteTime", "INTEGER");
        e0Var.f398487c[13] = "rowid";
        e0Var.f398489e = " storyID LONG,  userName TEXT,  localFlag INTEGER,  createTime INTEGER,  commentListCount INTEGER,  content BLOB,  attrBuf BLOB,  postBuf BLOB,  sourceType INTEGER,  type INTEGER,  itemStoryFlag INTEGER,  readCount INTEGER,  favoriteTime INTEGER";
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
            if (f323025v == hashCode) {
                try {
                    this.f69410x443468b = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323026w == hashCode) {
                try {
                    this.f69412xdde069b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323027x == hashCode) {
                try {
                    this.f69406x52c1d072 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323028y == hashCode) {
                try {
                    this.f69403xac3be4e = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323029z == hashCode) {
                try {
                    this.f69401x6f1be417 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f69402xad49e234 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f69400x4c58c87d = cursor.getBlob(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f69407x5d40d76e = cursor.getBlob(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f69409x76e81a5a = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f69411x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f69405x686589a9 = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f69408x56b3c014 = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f69404x2b7f11ae = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f323030d) {
            contentValues.put("storyID", java.lang.Long.valueOf(this.f69410x443468b));
        }
        if (this.f323031e) {
            contentValues.put("userName", this.f69412xdde069b);
        }
        if (this.f323032f) {
            contentValues.put("localFlag", java.lang.Integer.valueOf(this.f69406x52c1d072));
        }
        if (this.f323033g) {
            contentValues.put("createTime", java.lang.Integer.valueOf(this.f69403xac3be4e));
        }
        if (this.f323034h) {
            contentValues.put("commentListCount", java.lang.Integer.valueOf(this.f69401x6f1be417));
        }
        if (this.f323035i) {
            contentValues.put("content", this.f69402xad49e234);
        }
        if (this.f323036m) {
            contentValues.put("attrBuf", this.f69400x4c58c87d);
        }
        if (this.f323037n) {
            contentValues.put("postBuf", this.f69407x5d40d76e);
        }
        if (this.f323038o) {
            contentValues.put("sourceType", java.lang.Integer.valueOf(this.f69409x76e81a5a));
        }
        if (this.f323039p) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f69411x2262335f));
        }
        if (this.f323040q) {
            contentValues.put("itemStoryFlag", java.lang.Integer.valueOf(this.f69405x686589a9));
        }
        if (this.f323041r) {
            contentValues.put("readCount", java.lang.Integer.valueOf(this.f69408x56b3c014));
        }
        if (this.f323042s) {
            contentValues.put("favoriteTime", java.lang.Integer.valueOf(this.f69404x2b7f11ae));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseMMStoryInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MMStoryInfo ( ");
        l75.e0 e0Var = f323022J;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f323024u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMMStoryInfo", "createTableSql %s", str2);
            k0Var.A("MMStoryInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "MMStoryInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMMStoryInfo", "updateTableSql %s", str3);
            k0Var.A("MMStoryInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMMStoryInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f323022J;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return K;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f323023t;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f323023t.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("storyID")) {
            this.f69410x443468b = contentValues.getAsLong("storyID").longValue();
            if (z17) {
                this.f323030d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.f69412xdde069b = contentValues.getAsString("userName");
            if (z17) {
                this.f323031e = true;
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.f69406x52c1d072 = contentValues.getAsInteger("localFlag").intValue();
            if (z17) {
                this.f323032f = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f69403xac3be4e = contentValues.getAsInteger("createTime").intValue();
            if (z17) {
                this.f323033g = true;
            }
        }
        if (contentValues.containsKey("commentListCount")) {
            this.f69401x6f1be417 = contentValues.getAsInteger("commentListCount").intValue();
            if (z17) {
                this.f323034h = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.f69402xad49e234 = contentValues.getAsByteArray("content");
            if (z17) {
                this.f323035i = true;
            }
        }
        if (contentValues.containsKey("attrBuf")) {
            this.f69400x4c58c87d = contentValues.getAsByteArray("attrBuf");
            if (z17) {
                this.f323036m = true;
            }
        }
        if (contentValues.containsKey("postBuf")) {
            this.f69407x5d40d76e = contentValues.getAsByteArray("postBuf");
            if (z17) {
                this.f323037n = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.f69409x76e81a5a = contentValues.getAsInteger("sourceType").intValue();
            if (z17) {
                this.f323038o = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f69411x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f323039p = true;
            }
        }
        if (contentValues.containsKey("itemStoryFlag")) {
            this.f69405x686589a9 = contentValues.getAsInteger("itemStoryFlag").intValue();
            if (z17) {
                this.f323040q = true;
            }
        }
        if (contentValues.containsKey("readCount")) {
            this.f69408x56b3c014 = contentValues.getAsInteger("readCount").intValue();
            if (z17) {
                this.f323041r = true;
            }
        }
        if (contentValues.containsKey("favoriteTime")) {
            this.f69404x2b7f11ae = contentValues.getAsInteger("favoriteTime").intValue();
            if (z17) {
                this.f323042s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
