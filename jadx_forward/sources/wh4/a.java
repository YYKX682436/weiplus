package wh4;

/* loaded from: classes4.dex */
public class a extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f527506m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f527507n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f527508o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f527509p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f527510q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f527511r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f527512s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f527513t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f527514u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f527515v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f527516w;

    /* renamed from: field_businessKey */
    public java.lang.String f77355xb4c6a6ba;

    /* renamed from: field_businessType */
    public int f77356xe412923f;

    /* renamed from: field_guardianUserName */
    public java.lang.String f77357x8d828e4c;

    /* renamed from: field_msgSvrId */
    public long f77358xd09be28e;

    /* renamed from: field_time */
    public long f77359x2261f6f2;

    /* renamed from: field_wardUserName */
    public java.lang.String f77360xb1cc66b7;

    /* renamed from: d, reason: collision with root package name */
    public boolean f527517d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f527518e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f527519f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f527520g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f527521h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f527522i = true;

    static {
        p75.n0 n0Var = new p75.n0("TeenModeAuthorization");
        f527506m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f527507n = new java.lang.String[0];
        f527508o = 1225215615;
        f527509p = -672734438;
        f527510q = -356714073;
        f527511r = -1516193902;
        f527512s = -1294411543;
        f527513t = 3560141;
        f527514u = 108705909;
        f527515v = m173806x3593deb(wh4.a.class);
        f527516w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m173806x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "businessKey";
        e0Var.f398488d.put("businessKey", "TEXT");
        e0Var.f398487c[1] = "businessType";
        e0Var.f398488d.put("businessType", "INTEGER");
        e0Var.f398487c[2] = "guardianUserName";
        e0Var.f398488d.put("guardianUserName", "TEXT");
        e0Var.f398487c[3] = "wardUserName";
        e0Var.f398488d.put("wardUserName", "TEXT");
        e0Var.f398487c[4] = "msgSvrId";
        e0Var.f398488d.put("msgSvrId", "LONG");
        e0Var.f398487c[5] = "time";
        e0Var.f398488d.put("time", "LONG");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " businessKey TEXT,  businessType INTEGER,  guardianUserName TEXT,  wardUserName TEXT,  msgSvrId LONG,  time LONG";
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
            if (f527508o == hashCode) {
                try {
                    this.f77355xb4c6a6ba = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTeenModeAuthorization", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f527509p == hashCode) {
                try {
                    this.f77356xe412923f = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTeenModeAuthorization", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f527510q == hashCode) {
                try {
                    this.f77357x8d828e4c = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTeenModeAuthorization", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f527511r == hashCode) {
                try {
                    this.f77360xb1cc66b7 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTeenModeAuthorization", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f527512s == hashCode) {
                try {
                    this.f77358xd09be28e = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTeenModeAuthorization", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f527513t == hashCode) {
                try {
                    this.f77359x2261f6f2 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTeenModeAuthorization", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f527514u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f527517d) {
            contentValues.put("businessKey", this.f77355xb4c6a6ba);
        }
        if (this.f527518e) {
            contentValues.put("businessType", java.lang.Integer.valueOf(this.f77356xe412923f));
        }
        if (this.f527519f) {
            contentValues.put("guardianUserName", this.f77357x8d828e4c);
        }
        if (this.f527520g) {
            contentValues.put("wardUserName", this.f77360xb1cc66b7);
        }
        if (this.f527521h) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.f77358xd09be28e));
        }
        if (this.f527522i) {
            contentValues.put("time", java.lang.Long.valueOf(this.f77359x2261f6f2));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseTeenModeAuthorization", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TeenModeAuthorization ( ");
        l75.e0 e0Var = f527515v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f527507n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTeenModeAuthorization", "createTableSql %s", str2);
            k0Var.A("TeenModeAuthorization", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "TeenModeAuthorization", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTeenModeAuthorization", "updateTableSql %s", str3);
            k0Var.A("TeenModeAuthorization", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTeenModeAuthorization", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f527515v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f527516w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f527506m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f527506m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("businessKey")) {
            this.f77355xb4c6a6ba = contentValues.getAsString("businessKey");
            if (z17) {
                this.f527517d = true;
            }
        }
        if (contentValues.containsKey("businessType")) {
            this.f77356xe412923f = contentValues.getAsInteger("businessType").intValue();
            if (z17) {
                this.f527518e = true;
            }
        }
        if (contentValues.containsKey("guardianUserName")) {
            this.f77357x8d828e4c = contentValues.getAsString("guardianUserName");
            if (z17) {
                this.f527519f = true;
            }
        }
        if (contentValues.containsKey("wardUserName")) {
            this.f77360xb1cc66b7 = contentValues.getAsString("wardUserName");
            if (z17) {
                this.f527520g = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.f77358xd09be28e = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f527521h = true;
            }
        }
        if (contentValues.containsKey("time")) {
            this.f77359x2261f6f2 = contentValues.getAsLong("time").longValue();
            if (z17) {
                this.f527522i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
