package wh4;

/* loaded from: classes4.dex */
public class b extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f527523h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f527524i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f527525m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f527526n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f527527o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f527528p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f527529q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f527530r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f527531s;

    /* renamed from: field_guardianUserName */
    public java.lang.String f77361x8d828e4c;

    /* renamed from: field_ticket */
    public java.lang.String f77362x11bb99f1;

    /* renamed from: field_time */
    public long f77363x2261f6f2;

    /* renamed from: field_wardUserName */
    public java.lang.String f77364xb1cc66b7;

    /* renamed from: d, reason: collision with root package name */
    public boolean f527532d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f527533e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f527534f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f527535g = true;

    static {
        p75.n0 n0Var = new p75.n0("TeenModeBindGuardian");
        f527523h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f527524i = new java.lang.String[0];
        f527525m = -356714073;
        f527526n = -1516193902;
        f527527o = -873960692;
        f527528p = 3560141;
        f527529q = 108705909;
        f527530r = m173808x3593deb(wh4.b.class);
        f527531s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m173808x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "guardianUserName";
        e0Var.f398488d.put("guardianUserName", "TEXT");
        e0Var.f398487c[1] = "wardUserName";
        e0Var.f398488d.put("wardUserName", "TEXT");
        e0Var.f398487c[2] = "ticket";
        e0Var.f398488d.put("ticket", "TEXT");
        e0Var.f398487c[3] = "time";
        e0Var.f398488d.put("time", "LONG");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " guardianUserName TEXT,  wardUserName TEXT,  ticket TEXT,  time LONG";
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
            if (f527525m == hashCode) {
                try {
                    this.f77361x8d828e4c = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTeenModeBindGuardian", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f527526n == hashCode) {
                try {
                    this.f77364xb1cc66b7 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTeenModeBindGuardian", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f527527o == hashCode) {
                try {
                    this.f77362x11bb99f1 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTeenModeBindGuardian", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f527528p == hashCode) {
                try {
                    this.f77363x2261f6f2 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTeenModeBindGuardian", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f527529q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f527532d) {
            contentValues.put("guardianUserName", this.f77361x8d828e4c);
        }
        if (this.f527533e) {
            contentValues.put("wardUserName", this.f77364xb1cc66b7);
        }
        if (this.f527534f) {
            contentValues.put("ticket", this.f77362x11bb99f1);
        }
        if (this.f527535g) {
            contentValues.put("time", java.lang.Long.valueOf(this.f77363x2261f6f2));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseTeenModeBindGuardian", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TeenModeBindGuardian ( ");
        l75.e0 e0Var = f527530r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f527524i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTeenModeBindGuardian", "createTableSql %s", str2);
            k0Var.A("TeenModeBindGuardian", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "TeenModeBindGuardian", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTeenModeBindGuardian", "updateTableSql %s", str3);
            k0Var.A("TeenModeBindGuardian", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTeenModeBindGuardian", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f527530r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f527531s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f527523h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f527523h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("guardianUserName")) {
            this.f77361x8d828e4c = contentValues.getAsString("guardianUserName");
            if (z17) {
                this.f527532d = true;
            }
        }
        if (contentValues.containsKey("wardUserName")) {
            this.f77364xb1cc66b7 = contentValues.getAsString("wardUserName");
            if (z17) {
                this.f527533e = true;
            }
        }
        if (contentValues.containsKey("ticket")) {
            this.f77362x11bb99f1 = contentValues.getAsString("ticket");
            if (z17) {
                this.f527534f = true;
            }
        }
        if (contentValues.containsKey("time")) {
            this.f77363x2261f6f2 = contentValues.getAsLong("time").longValue();
            if (z17) {
                this.f527535g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
