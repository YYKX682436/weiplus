package dm;

/* loaded from: classes8.dex */
public class e5 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final l75.e0 C;
    public static final o75.e D;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f318148o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f318149p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f318150q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f318151r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f318152s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318153t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318154u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318155v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318156w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318157x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318158y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318159z;

    /* renamed from: field_businessId */
    public int f66377x1e9b0d60;

    /* renamed from: field_completePlayCnt */
    public int f66378x8c3448d7;

    /* renamed from: field_courseId */
    public long f66379x7ce583b;

    /* renamed from: field_feedId */
    public long f66380xf9a02e3e;

    /* renamed from: field_maxProgress */
    public int f66381xa9367fec;

    /* renamed from: field_playTimeMs */
    public long f66382x189d520c;

    /* renamed from: field_progress */
    public int f66383xe217cbd2;

    /* renamed from: field_speedRatio */
    public float f66384xde17a869;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318160d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318161e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318162f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318163g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318164h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318165i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318166m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318167n = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderVideoState");
        f318148o = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318149p = new p75.d("businessId", "int", tableName, "");
        f318150q = new p75.d("feedId", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318151r = new p75.d("courseId", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318152s = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderVideoState_businessId_index ON FinderVideoState(businessId)", "CREATE INDEX IF NOT EXISTS FinderVideoState_feedId_index ON FinderVideoState(feedId)", "CREATE INDEX IF NOT EXISTS FinderVideoState_courseId_index ON FinderVideoState(courseId)"};
        f318153t = 1702091003;
        f318154u = -1278410919;
        f318155v = -1001078227;
        f318156w = 1601576359;
        f318157x = 619738116;
        f318158y = -368357738;
        f318159z = 1031219121;
        A = 1017218588;
        B = 108705909;
        C = m124901x3593deb(dm.e5.class);
        D = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124901x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "businessId";
        e0Var.f398488d.put("businessId", "INTEGER default '0' ");
        e0Var.f398487c[1] = "feedId";
        e0Var.f398488d.put("feedId", "LONG default '0' ");
        e0Var.f398487c[2] = "progress";
        e0Var.f398488d.put("progress", "INTEGER default '0' ");
        e0Var.f398487c[3] = "playTimeMs";
        e0Var.f398488d.put("playTimeMs", "LONG default '0' ");
        e0Var.f398487c[4] = "speedRatio";
        e0Var.f398488d.put("speedRatio", "FLOAT default '0' ");
        e0Var.f398487c[5] = "courseId";
        e0Var.f398488d.put("courseId", "LONG default '0' ");
        e0Var.f398487c[6] = "maxProgress";
        e0Var.f398488d.put("maxProgress", "INTEGER default '0' ");
        e0Var.f398487c[7] = "completePlayCnt";
        e0Var.f398488d.put("completePlayCnt", "INTEGER default '0' ");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " businessId INTEGER default '0' ,  feedId LONG default '0' ,  progress INTEGER default '0' ,  playTimeMs LONG default '0' ,  speedRatio FLOAT default '0' ,  courseId LONG default '0' ,  maxProgress INTEGER default '0' ,  completePlayCnt INTEGER default '0' ";
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
            if (f318153t == hashCode) {
                try {
                    this.f66377x1e9b0d60 = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderVideoState", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318154u == hashCode) {
                try {
                    this.f66380xf9a02e3e = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderVideoState", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318155v == hashCode) {
                try {
                    this.f66383xe217cbd2 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderVideoState", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318156w == hashCode) {
                try {
                    this.f66382x189d520c = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderVideoState", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318157x == hashCode) {
                try {
                    this.f66384xde17a869 = cursor.getFloat(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderVideoState", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318158y == hashCode) {
                try {
                    this.f66379x7ce583b = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderVideoState", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318159z == hashCode) {
                try {
                    this.f66381xa9367fec = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderVideoState", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f66378x8c3448d7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderVideoState", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318160d) {
            contentValues.put("businessId", java.lang.Integer.valueOf(this.f66377x1e9b0d60));
        }
        if (this.f318161e) {
            contentValues.put("feedId", java.lang.Long.valueOf(this.f66380xf9a02e3e));
        }
        if (this.f318162f) {
            contentValues.put("progress", java.lang.Integer.valueOf(this.f66383xe217cbd2));
        }
        if (this.f318163g) {
            contentValues.put("playTimeMs", java.lang.Long.valueOf(this.f66382x189d520c));
        }
        if (this.f318164h) {
            contentValues.put("speedRatio", java.lang.Float.valueOf(this.f66384xde17a869));
        }
        if (this.f318165i) {
            contentValues.put("courseId", java.lang.Long.valueOf(this.f66379x7ce583b));
        }
        if (this.f318166m) {
            contentValues.put("maxProgress", java.lang.Integer.valueOf(this.f66381xa9367fec));
        }
        if (this.f318167n) {
            contentValues.put("completePlayCnt", java.lang.Integer.valueOf(this.f66378x8c3448d7));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderVideoState", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderVideoState ( ");
        l75.e0 e0Var = C;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318152s) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderVideoState", "createTableSql %s", str2);
            k0Var.A("FinderVideoState", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderVideoState", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderVideoState", "updateTableSql %s", str3);
            k0Var.A("FinderVideoState", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderVideoState", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return C;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return D;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318148o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318148o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("businessId")) {
            this.f66377x1e9b0d60 = contentValues.getAsInteger("businessId").intValue();
            if (z17) {
                this.f318160d = true;
            }
        }
        if (contentValues.containsKey("feedId")) {
            this.f66380xf9a02e3e = contentValues.getAsLong("feedId").longValue();
            if (z17) {
                this.f318161e = true;
            }
        }
        if (contentValues.containsKey("progress")) {
            this.f66383xe217cbd2 = contentValues.getAsInteger("progress").intValue();
            if (z17) {
                this.f318162f = true;
            }
        }
        if (contentValues.containsKey("playTimeMs")) {
            this.f66382x189d520c = contentValues.getAsLong("playTimeMs").longValue();
            if (z17) {
                this.f318163g = true;
            }
        }
        if (contentValues.containsKey("speedRatio")) {
            this.f66384xde17a869 = contentValues.getAsFloat("speedRatio").floatValue();
            if (z17) {
                this.f318164h = true;
            }
        }
        if (contentValues.containsKey("courseId")) {
            this.f66379x7ce583b = contentValues.getAsLong("courseId").longValue();
            if (z17) {
                this.f318165i = true;
            }
        }
        if (contentValues.containsKey("maxProgress")) {
            this.f66381xa9367fec = contentValues.getAsInteger("maxProgress").intValue();
            if (z17) {
                this.f318166m = true;
            }
        }
        if (contentValues.containsKey("completePlayCnt")) {
            this.f66378x8c3448d7 = contentValues.getAsInteger("completePlayCnt").intValue();
            if (z17) {
                this.f318167n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
