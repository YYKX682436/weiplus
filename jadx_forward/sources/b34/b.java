package b34;

/* loaded from: classes4.dex */
public class b extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f99239g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f99240h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f99241i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f99242m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f99243n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f99244o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f99245p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f99246q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f99247d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99248e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f99249f = true;

    /* renamed from: field_isshowed */
    public boolean f4171x46b62bab;

    /* renamed from: field_lastshaketime */
    public int f4172x2cb4da78;

    /* renamed from: field_username */
    public java.lang.String f4173xdec927b;

    static {
        p75.n0 n0Var = new p75.n0("ShakeNewYearFriendInfo");
        f99239g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f99240h = new java.lang.String[0];
        f99241i = -265713450;
        f99242m = -1284856579;
        f99243n = 687022598;
        f99244o = 108705909;
        f99245p = m9770x3593deb(b34.b.class);
        f99246q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m9770x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66875xa013b0d5;
        e0Var.f398487c[1] = "lastshaketime";
        e0Var.f398488d.put("lastshaketime", "INTEGER default '0' ");
        e0Var.f398487c[2] = "isshowed";
        e0Var.f398488d.put("isshowed", "INTEGER default 'false' ");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " username TEXT default ''  PRIMARY KEY ,  lastshaketime INTEGER default '0' ,  isshowed INTEGER default 'false' ";
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
            if (f99241i == hashCode) {
                try {
                    this.f4173xdec927b = cursor.getString(i17);
                    this.f99247d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeNewYearFriendInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f99242m == hashCode) {
                try {
                    this.f4172x2cb4da78 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeNewYearFriendInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f99243n == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f4171x46b62bab = z17;
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeNewYearFriendInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f99244o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f4173xdec927b == null) {
            this.f4173xdec927b = "";
        }
        if (this.f99247d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f4173xdec927b);
        }
        if (this.f99248e) {
            contentValues.put("lastshaketime", java.lang.Integer.valueOf(this.f4172x2cb4da78));
        }
        if (this.f99249f) {
            if (this.f4171x46b62bab) {
                contentValues.put("isshowed", (java.lang.Integer) 1);
            } else {
                contentValues.put("isshowed", (java.lang.Integer) 0);
            }
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseShakeNewYearFriendInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ShakeNewYearFriendInfo ( ");
        l75.e0 e0Var = f99245p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f99240h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShakeNewYearFriendInfo", "createTableSql %s", str2);
            k0Var.A("ShakeNewYearFriendInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ShakeNewYearFriendInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShakeNewYearFriendInfo", "updateTableSql %s", str3);
            k0Var.A("ShakeNewYearFriendInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShakeNewYearFriendInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f99245p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f99246q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f4173xdec927b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f99239g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f99239g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f4173xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f99247d = true;
            }
        }
        if (contentValues.containsKey("lastshaketime")) {
            this.f4172x2cb4da78 = contentValues.getAsInteger("lastshaketime").intValue();
            if (z17) {
                this.f99248e = true;
            }
        }
        if (contentValues.containsKey("isshowed")) {
            this.f4171x46b62bab = contentValues.getAsInteger("isshowed").intValue() != 0;
            if (z17) {
                this.f99249f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
