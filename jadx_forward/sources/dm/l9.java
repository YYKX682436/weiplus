package dm;

/* loaded from: classes8.dex */
public class l9 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f319837i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f319838m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319839n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319840o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319841p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319842q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319843r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319844s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f319845t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f319846u;

    /* renamed from: field_biz */
    public java.lang.String f67348x4b6e404e;

    /* renamed from: field_ret */
    public java.lang.String f67349x4b6e7bdc;

    /* renamed from: field_save_time */
    public long f67350xa597db4a;

    /* renamed from: field_score */
    public float f67351x29cc1f0d;

    /* renamed from: field_uid */
    public java.lang.String f67352x4b6e878b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319847d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319848e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319849f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319850g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319851h = true;

    static {
        p75.n0 n0Var = new p75.n0("PredictResultCache");
        f319837i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319838m = new java.lang.String[0];
        f319839n = 97555;
        f319840o = 115792;
        f319841p = 112801;
        f319842q = 184135759;
        f319843r = 109264530;
        f319844s = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "biz";
        ((java.util.HashMap) e0Var.f398488d).put("biz", "TEXT");
        e0Var.f398487c[1] = "uid";
        ((java.util.HashMap) e0Var.f398488d).put("uid", "TEXT");
        e0Var.f398487c[2] = "ret";
        ((java.util.HashMap) e0Var.f398488d).put("ret", "TEXT");
        e0Var.f398487c[3] = "save_time";
        ((java.util.HashMap) e0Var.f398488d).put("save_time", "LONG");
        e0Var.f398487c[4] = ya.b.f77498x4b14672;
        ((java.util.HashMap) e0Var.f398488d).put(ya.b.f77498x4b14672, "FLOAT");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " biz TEXT,  uid TEXT,  ret TEXT,  save_time LONG,  score FLOAT";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f319845t = e0Var;
        f319846u = new o75.e();
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
            if (f319839n == hashCode) {
                try {
                    this.f67348x4b6e404e = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredictResultCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319840o == hashCode) {
                try {
                    this.f67352x4b6e878b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredictResultCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319841p == hashCode) {
                try {
                    this.f67349x4b6e7bdc = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredictResultCache", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319842q == hashCode) {
                try {
                    this.f67350xa597db4a = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredictResultCache", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319843r == hashCode) {
                try {
                    this.f67351x29cc1f0d = cursor.getFloat(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredictResultCache", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319844s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319847d) {
            contentValues.put("biz", this.f67348x4b6e404e);
        }
        if (this.f319848e) {
            contentValues.put("uid", this.f67352x4b6e878b);
        }
        if (this.f319849f) {
            contentValues.put("ret", this.f67349x4b6e7bdc);
        }
        if (this.f319850g) {
            contentValues.put("save_time", java.lang.Long.valueOf(this.f67350xa597db4a));
        }
        if (this.f319851h) {
            contentValues.put(ya.b.f77498x4b14672, java.lang.Float.valueOf(this.f67351x29cc1f0d));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BasePredictResultCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PredictResultCache ( ");
        l75.e0 e0Var = f319845t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319838m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePredictResultCache", "createTableSql %s", str2);
            k0Var.A("PredictResultCache", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "PredictResultCache", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePredictResultCache", "updateTableSql %s", str3);
            k0Var.A("PredictResultCache", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePredictResultCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319845t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319846u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319837i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319837i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("biz")) {
            this.f67348x4b6e404e = contentValues.getAsString("biz");
            if (z17) {
                this.f319847d = true;
            }
        }
        if (contentValues.containsKey("uid")) {
            this.f67352x4b6e878b = contentValues.getAsString("uid");
            if (z17) {
                this.f319848e = true;
            }
        }
        if (contentValues.containsKey("ret")) {
            this.f67349x4b6e7bdc = contentValues.getAsString("ret");
            if (z17) {
                this.f319849f = true;
            }
        }
        if (contentValues.containsKey("save_time")) {
            this.f67350xa597db4a = contentValues.getAsLong("save_time").longValue();
            if (z17) {
                this.f319850g = true;
            }
        }
        if (contentValues.containsKey(ya.b.f77498x4b14672)) {
            this.f67351x29cc1f0d = contentValues.getAsFloat(ya.b.f77498x4b14672).floatValue();
            if (z17) {
                this.f319851h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
