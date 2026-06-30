package dm;

/* loaded from: classes4.dex */
public class bb extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f317461m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f317462n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317463o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317464p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317465q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317466r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317467s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317468t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317469u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f317470v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f317471w;

    /* renamed from: field_commentFlag */
    public int f66007xe91a72a6;

    /* renamed from: field_readCommentId */
    public int f66008xae67405f;

    /* renamed from: field_readCommentTime */
    public int f66009xb19dc511;

    /* renamed from: field_storyId */
    public long f66010x44346ab;

    /* renamed from: field_syncCommentId */
    public int f66011xd21ed4fa;

    /* renamed from: field_syncCommentTime */
    public int f66012xc5c29eec;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317472d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317473e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317474f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317475g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317476h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317477i = true;

    static {
        p75.n0 n0Var = new p75.n0("StoryCommentSync");
        f317461m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317462n = new java.lang.String[0];
        f317463o = -1884251920;
        f317464p = 891095780;
        f317465q = 1490329471;
        f317466r = 1644888662;
        f317467s = 1982848049;
        f317468t = 2103122539;
        f317469u = 108705909;
        f317470v = m124823x3593deb(dm.bb.class);
        f317471w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124823x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "storyId";
        e0Var.f398488d.put("storyId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "storyId";
        e0Var.f398487c[1] = "readCommentId";
        e0Var.f398488d.put("readCommentId", "INTEGER");
        e0Var.f398487c[2] = "syncCommentId";
        e0Var.f398488d.put("syncCommentId", "INTEGER");
        e0Var.f398487c[3] = "readCommentTime";
        e0Var.f398488d.put("readCommentTime", "INTEGER");
        e0Var.f398487c[4] = "syncCommentTime";
        e0Var.f398488d.put("syncCommentTime", "INTEGER");
        e0Var.f398487c[5] = "commentFlag";
        e0Var.f398488d.put("commentFlag", "INTEGER");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " storyId LONG PRIMARY KEY ,  readCommentId INTEGER,  syncCommentId INTEGER,  readCommentTime INTEGER,  syncCommentTime INTEGER,  commentFlag INTEGER";
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
            if (f317463o == hashCode) {
                try {
                    this.f66010x44346ab = cursor.getLong(i17);
                    this.f317472d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryCommentSync", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317464p == hashCode) {
                try {
                    this.f66008xae67405f = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryCommentSync", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317465q == hashCode) {
                try {
                    this.f66011xd21ed4fa = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryCommentSync", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317466r == hashCode) {
                try {
                    this.f66009xb19dc511 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryCommentSync", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317467s == hashCode) {
                try {
                    this.f66012xc5c29eec = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryCommentSync", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317468t == hashCode) {
                try {
                    this.f66007xe91a72a6 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryCommentSync", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317469u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317472d) {
            contentValues.put("storyId", java.lang.Long.valueOf(this.f66010x44346ab));
        }
        if (this.f317473e) {
            contentValues.put("readCommentId", java.lang.Integer.valueOf(this.f66008xae67405f));
        }
        if (this.f317474f) {
            contentValues.put("syncCommentId", java.lang.Integer.valueOf(this.f66011xd21ed4fa));
        }
        if (this.f317475g) {
            contentValues.put("readCommentTime", java.lang.Integer.valueOf(this.f66009xb19dc511));
        }
        if (this.f317476h) {
            contentValues.put("syncCommentTime", java.lang.Integer.valueOf(this.f66012xc5c29eec));
        }
        if (this.f317477i) {
            contentValues.put("commentFlag", java.lang.Integer.valueOf(this.f66007xe91a72a6));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseStoryCommentSync", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS StoryCommentSync ( ");
        l75.e0 e0Var = f317470v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317462n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryCommentSync", "createTableSql %s", str2);
            k0Var.A("StoryCommentSync", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "StoryCommentSync", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryCommentSync", "updateTableSql %s", str3);
            k0Var.A("StoryCommentSync", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryCommentSync", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317470v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317471w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f66010x44346ab);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317461m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317461m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("storyId")) {
            this.f66010x44346ab = contentValues.getAsLong("storyId").longValue();
            if (z17) {
                this.f317472d = true;
            }
        }
        if (contentValues.containsKey("readCommentId")) {
            this.f66008xae67405f = contentValues.getAsInteger("readCommentId").intValue();
            if (z17) {
                this.f317473e = true;
            }
        }
        if (contentValues.containsKey("syncCommentId")) {
            this.f66011xd21ed4fa = contentValues.getAsInteger("syncCommentId").intValue();
            if (z17) {
                this.f317474f = true;
            }
        }
        if (contentValues.containsKey("readCommentTime")) {
            this.f66009xb19dc511 = contentValues.getAsInteger("readCommentTime").intValue();
            if (z17) {
                this.f317475g = true;
            }
        }
        if (contentValues.containsKey("syncCommentTime")) {
            this.f66012xc5c29eec = contentValues.getAsInteger("syncCommentTime").intValue();
            if (z17) {
                this.f317476h = true;
            }
        }
        if (contentValues.containsKey("commentFlag")) {
            this.f66007xe91a72a6 = contentValues.getAsInteger("commentFlag").intValue();
            if (z17) {
                this.f317477i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
