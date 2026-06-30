package dm;

/* loaded from: classes4.dex */
public class s3 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f321332m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f321333n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321334o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321335p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321336q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321337r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321338s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321339t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321340u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f321341v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f321342w;

    /* renamed from: field_feature_str */
    public java.lang.String f68246x554c55a3;

    /* renamed from: field_label */
    public int f68247x29685f6f;

    /* renamed from: field_model */
    public java.lang.String f68248x297cdba4;

    /* renamed from: field_sample_uid */
    public java.lang.String f68249xc1b4b8a0;

    /* renamed from: field_tag */
    public int f68250x4b6e82d5;

    /* renamed from: field_time */
    public long f68251x2261f6f2;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321343d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321344e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321345f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321346g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321347h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321348i = true;

    static {
        p75.n0 n0Var = new p75.n0("FewShotLearning");
        f321332m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321333n = new java.lang.String[0];
        f321334o = 3560141;
        f321335p = 104069929;
        f321336q = 143492155;
        f321337r = -376636056;
        f321338s = 102727412;
        f321339t = 114586;
        f321340u = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "time";
        ((java.util.HashMap) e0Var.f398488d).put("time", "LONG");
        e0Var.f398487c[1] = "model";
        ((java.util.HashMap) e0Var.f398488d).put("model", "TEXT");
        e0Var.f398487c[2] = "sample_uid";
        ((java.util.HashMap) e0Var.f398488d).put("sample_uid", "TEXT");
        e0Var.f398487c[3] = "feature_str";
        ((java.util.HashMap) e0Var.f398488d).put("feature_str", "TEXT");
        e0Var.f398487c[4] = "label";
        ((java.util.HashMap) e0Var.f398488d).put("label", "INTEGER");
        e0Var.f398487c[5] = "tag";
        ((java.util.HashMap) e0Var.f398488d).put("tag", "INTEGER");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " time LONG,  model TEXT,  sample_uid TEXT,  feature_str TEXT,  label INTEGER,  tag INTEGER";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f321341v = e0Var;
        f321342w = new o75.e();
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
            if (f321334o == hashCode) {
                try {
                    this.f68251x2261f6f2 = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFewShotLearning", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321335p == hashCode) {
                try {
                    this.f68248x297cdba4 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFewShotLearning", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321336q == hashCode) {
                try {
                    this.f68249xc1b4b8a0 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFewShotLearning", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321337r == hashCode) {
                try {
                    this.f68246x554c55a3 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFewShotLearning", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321338s == hashCode) {
                try {
                    this.f68247x29685f6f = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFewShotLearning", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321339t == hashCode) {
                try {
                    this.f68250x4b6e82d5 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFewShotLearning", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321340u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321343d) {
            contentValues.put("time", java.lang.Long.valueOf(this.f68251x2261f6f2));
        }
        if (this.f321344e) {
            contentValues.put("model", this.f68248x297cdba4);
        }
        if (this.f321345f) {
            contentValues.put("sample_uid", this.f68249xc1b4b8a0);
        }
        if (this.f321346g) {
            contentValues.put("feature_str", this.f68246x554c55a3);
        }
        if (this.f321347h) {
            contentValues.put("label", java.lang.Integer.valueOf(this.f68247x29685f6f));
        }
        if (this.f321348i) {
            contentValues.put("tag", java.lang.Integer.valueOf(this.f68250x4b6e82d5));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFewShotLearning", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FewShotLearning ( ");
        l75.e0 e0Var = f321341v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321333n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFewShotLearning", "createTableSql %s", str2);
            k0Var.A("FewShotLearning", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FewShotLearning", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFewShotLearning", "updateTableSql %s", str3);
            k0Var.A("FewShotLearning", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFewShotLearning", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321341v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321342w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321332m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321332m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("time")) {
            this.f68251x2261f6f2 = contentValues.getAsLong("time").longValue();
            if (z17) {
                this.f321343d = true;
            }
        }
        if (contentValues.containsKey("model")) {
            this.f68248x297cdba4 = contentValues.getAsString("model");
            if (z17) {
                this.f321344e = true;
            }
        }
        if (contentValues.containsKey("sample_uid")) {
            this.f68249xc1b4b8a0 = contentValues.getAsString("sample_uid");
            if (z17) {
                this.f321345f = true;
            }
        }
        if (contentValues.containsKey("feature_str")) {
            this.f68246x554c55a3 = contentValues.getAsString("feature_str");
            if (z17) {
                this.f321346g = true;
            }
        }
        if (contentValues.containsKey("label")) {
            this.f68247x29685f6f = contentValues.getAsInteger("label").intValue();
            if (z17) {
                this.f321347h = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.f68250x4b6e82d5 = contentValues.getAsInteger("tag").intValue();
            if (z17) {
                this.f321348i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
