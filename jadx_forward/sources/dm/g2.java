package dm;

/* loaded from: classes11.dex */
public class g2 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final l75.e0 C;
    public static final o75.e D;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f318560n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f318561o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f318562p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f318563q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f318564r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f318565s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f318566t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318567u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318568v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318569w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318570x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318571y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318572z;

    /* renamed from: field_createTime */
    public long f66583xac3be4e;

    /* renamed from: field_isTemporary */
    public boolean f66584x284d1882;

    /* renamed from: field_labelID */
    public int f66585x70ce48ca;

    /* renamed from: field_labelName */
    public java.lang.String f66586x7661fe9a;

    /* renamed from: field_labelPYFull */
    public java.lang.String f66587x68c44467;

    /* renamed from: field_labelPYShort */
    public java.lang.String f66588xb0759da4;

    /* renamed from: field_lastUseTime */
    public long f66589xd33ad9b9;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318573d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318574e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318575f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318576g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318577h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318578i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318579m = true;

    static {
        p75.n0 n0Var = new p75.n0("ContactLabel");
        f318560n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318561o = new p75.d("labelID", "int", tableName, "");
        f318562p = new p75.d("labelName", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318563q = new p75.d("createTime", "long", tableName, "");
        f318564r = new p75.d("isTemporary", com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03, tableName, "");
        f318565s = new p75.d("lastUseTime", "long", tableName, "");
        f318566t = new java.lang.String[0];
        f318567u = -63202545;
        f318568v = -607923297;
        f318569w = -50009044;
        f318570x = -1538658689;
        f318571y = 1369213417;
        f318572z = -1131560889;
        A = 1736147326;
        B = 108705909;
        C = m124997x3593deb(dm.g2.class);
        D = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124997x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "labelID";
        e0Var.f398488d.put("labelID", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "labelID";
        e0Var.f398487c[1] = "labelName";
        e0Var.f398488d.put("labelName", "TEXT");
        e0Var.f398487c[2] = "labelPYFull";
        e0Var.f398488d.put("labelPYFull", "TEXT");
        e0Var.f398487c[3] = "labelPYShort";
        e0Var.f398488d.put("labelPYShort", "TEXT");
        e0Var.f398487c[4] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[5] = "isTemporary";
        e0Var.f398488d.put("isTemporary", "INTEGER");
        e0Var.f398487c[6] = "lastUseTime";
        e0Var.f398488d.put("lastUseTime", "LONG");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " labelID INTEGER PRIMARY KEY ,  labelName TEXT,  labelPYFull TEXT,  labelPYShort TEXT,  createTime LONG,  isTemporary INTEGER,  lastUseTime LONG";
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
            if (f318567u == hashCode) {
                try {
                    this.f66585x70ce48ca = cursor.getInt(i17);
                    this.f318573d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseContactLabel", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318568v == hashCode) {
                try {
                    this.f66586x7661fe9a = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseContactLabel", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318569w == hashCode) {
                try {
                    this.f66587x68c44467 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseContactLabel", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318570x == hashCode) {
                try {
                    this.f66588xb0759da4 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseContactLabel", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318571y == hashCode) {
                try {
                    this.f66583xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseContactLabel", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318572z == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f66584x284d1882 = z17;
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseContactLabel", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f66589xd33ad9b9 = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseContactLabel", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
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
        if (this.f318573d) {
            contentValues.put("labelID", java.lang.Integer.valueOf(this.f66585x70ce48ca));
        }
        if (this.f318574e) {
            contentValues.put("labelName", this.f66586x7661fe9a);
        }
        if (this.f318575f) {
            contentValues.put("labelPYFull", this.f66587x68c44467);
        }
        if (this.f318576g) {
            contentValues.put("labelPYShort", this.f66588xb0759da4);
        }
        if (this.f318577h) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f66583xac3be4e));
        }
        if (this.f318578i) {
            if (this.f66584x284d1882) {
                contentValues.put("isTemporary", (java.lang.Integer) 1);
            } else {
                contentValues.put("isTemporary", (java.lang.Integer) 0);
            }
        }
        if (this.f318579m) {
            contentValues.put("lastUseTime", java.lang.Long.valueOf(this.f66589xd33ad9b9));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseContactLabel", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ContactLabel ( ");
        l75.e0 e0Var = C;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318566t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseContactLabel", "createTableSql %s", str2);
            k0Var.A("ContactLabel", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ContactLabel", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseContactLabel", "updateTableSql %s", str3);
            k0Var.A("ContactLabel", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseContactLabel", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Integer.valueOf(this.f66585x70ce48ca);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318560n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318560n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("labelID")) {
            this.f66585x70ce48ca = contentValues.getAsInteger("labelID").intValue();
            if (z17) {
                this.f318573d = true;
            }
        }
        if (contentValues.containsKey("labelName")) {
            this.f66586x7661fe9a = contentValues.getAsString("labelName");
            if (z17) {
                this.f318574e = true;
            }
        }
        if (contentValues.containsKey("labelPYFull")) {
            this.f66587x68c44467 = contentValues.getAsString("labelPYFull");
            if (z17) {
                this.f318575f = true;
            }
        }
        if (contentValues.containsKey("labelPYShort")) {
            this.f66588xb0759da4 = contentValues.getAsString("labelPYShort");
            if (z17) {
                this.f318576g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f66583xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f318577h = true;
            }
        }
        if (contentValues.containsKey("isTemporary")) {
            this.f66584x284d1882 = contentValues.getAsInteger("isTemporary").intValue() != 0;
            if (z17) {
                this.f318578i = true;
            }
        }
        if (contentValues.containsKey("lastUseTime")) {
            this.f66589xd33ad9b9 = contentValues.getAsLong("lastUseTime").longValue();
            if (z17) {
                this.f318579m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
