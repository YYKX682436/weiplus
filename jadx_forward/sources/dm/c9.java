package dm;

/* loaded from: classes4.dex */
public class c9 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f317721f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f317722g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f317723h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f317724i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f317725m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f317726n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f317727o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317728d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317729e = true;

    /* renamed from: field_cardUserId */
    public java.lang.String f66167xe3413ddb;

    /* renamed from: field_retryCount */
    public int f66168x73c8dbac;

    static {
        p75.n0 n0Var = new p75.n0("PendingCardId");
        f317721f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317722g = new java.lang.String[0];
        f317723h = 706349430;
        f317724i = -1163811001;
        f317725m = 108705909;
        f317726n = m124853x3593deb(dm.c9.class);
        f317727o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124853x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "cardUserId";
        e0Var.f398488d.put("cardUserId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "cardUserId";
        e0Var.f398487c[1] = "retryCount";
        e0Var.f398488d.put("retryCount", "INTEGER");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " cardUserId TEXT PRIMARY KEY ,  retryCount INTEGER";
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
            if (f317723h == hashCode) {
                try {
                    this.f66167xe3413ddb = cursor.getString(i17);
                    this.f317728d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePendingCardId", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317724i == hashCode) {
                try {
                    this.f66168x73c8dbac = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePendingCardId", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317725m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317728d) {
            contentValues.put("cardUserId", this.f66167xe3413ddb);
        }
        if (this.f317729e) {
            contentValues.put("retryCount", java.lang.Integer.valueOf(this.f66168x73c8dbac));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BasePendingCardId", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PendingCardId ( ");
        l75.e0 e0Var = f317726n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317722g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePendingCardId", "createTableSql %s", str2);
            k0Var.A("PendingCardId", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "PendingCardId", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePendingCardId", "updateTableSql %s", str3);
            k0Var.A("PendingCardId", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePendingCardId", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317726n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317727o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66167xe3413ddb;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317721f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317721f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("cardUserId")) {
            this.f66167xe3413ddb = contentValues.getAsString("cardUserId");
            if (z17) {
                this.f317728d = true;
            }
        }
        if (contentValues.containsKey("retryCount")) {
            this.f66168x73c8dbac = contentValues.getAsInteger("retryCount").intValue();
            if (z17) {
                this.f317729e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
