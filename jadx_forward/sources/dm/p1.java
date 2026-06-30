package dm;

/* loaded from: classes4.dex */
public class p1 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f320619f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f320620g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f320621h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f320622i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320623m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f320624n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f320625o;

    /* renamed from: field_Priority */
    private int f67878xdc25e769;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320626d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320627e = false;

    /* renamed from: field_Quota */
    private long f67879x27f52ed3 = 0;

    static {
        p75.n0 n0Var = new p75.n0("C2CQuotaQueryDBInfo");
        f320619f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320620g = new java.lang.String[0];
        f320621h = -1100816956;
        f320622i = -1835527912;
        f320623m = 108705909;
        f320624n = m125384x3593deb(dm.p1.class);
        f320625o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125384x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "Priority";
        e0Var.f398488d.put("Priority", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "Priority";
        e0Var.f398487c[1] = "sum(C2CPreDownloadDBInfo.LastLen)";
        e0Var.f398488d.put("sum(C2CPreDownloadDBInfo.LastLen)", "LONG default '0' ");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " Priority INTEGER PRIMARY KEY ,  sum(C2CPreDownloadDBInfo.LastLen) LONG default '0' ";
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
            if (f320621h == hashCode) {
                try {
                    this.f67878xdc25e769 = cursor.getInt(i17);
                    this.f320626d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320622i == hashCode) {
                try {
                    this.f67879x27f52ed3 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320623m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320626d) {
            contentValues.put("Priority", java.lang.Integer.valueOf(this.f67878xdc25e769));
        }
        if (this.f320627e) {
            contentValues.put("sum(C2CPreDownloadDBInfo.LastLen)", java.lang.Long.valueOf(this.f67879x27f52ed3));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS C2CQuotaQueryDBInfo ( ");
        l75.e0 e0Var = f320624n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320620g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", "createTableSql %s", str2);
            k0Var.A("C2CQuotaQueryDBInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "C2CQuotaQueryDBInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", "updateTableSql %s", str3);
            k0Var.A("C2CQuotaQueryDBInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseC2CQuotaQueryDBInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320624n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320625o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f67878xdc25e769);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320619f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320619f.f434209a;
    }

    public int t0() {
        return this.f67878xdc25e769;
    }

    public long u0() {
        return this.f67879x27f52ed3;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("Priority")) {
            this.f67878xdc25e769 = contentValues.getAsInteger("Priority").intValue();
            if (z17) {
                this.f320626d = true;
            }
        }
        if (contentValues.containsKey("sum(C2CPreDownloadDBInfo.LastLen)")) {
            this.f67879x27f52ed3 = contentValues.getAsLong("sum(C2CPreDownloadDBInfo.LastLen)").longValue();
            if (z17) {
                this.f320627e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
