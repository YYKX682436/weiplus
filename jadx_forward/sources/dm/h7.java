package dm;

/* loaded from: classes4.dex */
public class h7 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f318925h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f318926i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318927m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318928n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318929o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318930p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318931q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f318932r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f318933s;

    /* renamed from: field_businessAppInfoKey */
    public java.lang.String f66785x181ecb5;

    /* renamed from: field_duration */
    public long f66786xa7075739;

    /* renamed from: field_lastUpdateTime */
    public long f66787xaacf9851;

    /* renamed from: field_respBuff */
    public byte[] f66788x965c1e8;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318934d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318935e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318936f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318937g = true;

    static {
        p75.n0 n0Var = new p75.n0("LaunchBusinessWxaAppInfo");
        f318925h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318926i = new java.lang.String[0];
        f318927m = -103879344;
        f318928n = -341657533;
        f318929o = -1992012396;
        f318930p = -86827412;
        f318931q = 108705909;
        f318932r = m125031x3593deb(dm.h7.class);
        f318933s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125031x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "businessAppInfoKey";
        e0Var.f398488d.put("businessAppInfoKey", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "businessAppInfoKey";
        e0Var.f398487c[1] = "respBuff";
        e0Var.f398488d.put("respBuff", "BLOB");
        e0Var.f398487c[2] = "duration";
        e0Var.f398488d.put("duration", "LONG");
        e0Var.f398487c[3] = "lastUpdateTime";
        e0Var.f398488d.put("lastUpdateTime", "LONG");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " businessAppInfoKey TEXT PRIMARY KEY ,  respBuff BLOB,  duration LONG,  lastUpdateTime LONG";
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
            if (f318927m == hashCode) {
                try {
                    this.f66785x181ecb5 = cursor.getString(i17);
                    this.f318934d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318928n == hashCode) {
                try {
                    this.f66788x965c1e8 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318929o == hashCode) {
                try {
                    this.f66786xa7075739 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318930p == hashCode) {
                try {
                    this.f66787xaacf9851 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318931q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318934d) {
            contentValues.put("businessAppInfoKey", this.f66785x181ecb5);
        }
        if (this.f318935e) {
            contentValues.put("respBuff", this.f66788x965c1e8);
        }
        if (this.f318936f) {
            contentValues.put("duration", java.lang.Long.valueOf(this.f66786xa7075739));
        }
        if (this.f318937g) {
            contentValues.put("lastUpdateTime", java.lang.Long.valueOf(this.f66787xaacf9851));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LaunchBusinessWxaAppInfo ( ");
        l75.e0 e0Var = f318932r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318926i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", "createTableSql %s", str2);
            k0Var.A("LaunchBusinessWxaAppInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LaunchBusinessWxaAppInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", "updateTableSql %s", str3);
            k0Var.A("LaunchBusinessWxaAppInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLaunchBusinessWxaAppInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318932r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318933s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66785x181ecb5;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318925h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318925h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("businessAppInfoKey")) {
            this.f66785x181ecb5 = contentValues.getAsString("businessAppInfoKey");
            if (z17) {
                this.f318934d = true;
            }
        }
        if (contentValues.containsKey("respBuff")) {
            this.f66788x965c1e8 = contentValues.getAsByteArray("respBuff");
            if (z17) {
                this.f318935e = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.f66786xa7075739 = contentValues.getAsLong("duration").longValue();
            if (z17) {
                this.f318936f = true;
            }
        }
        if (contentValues.containsKey("lastUpdateTime")) {
            this.f66787xaacf9851 = contentValues.getAsLong("lastUpdateTime").longValue();
            if (z17) {
                this.f318937g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
