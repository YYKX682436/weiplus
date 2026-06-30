package dm;

/* loaded from: classes4.dex */
public class u7 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f321881f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f321882g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f321883h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f321884i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321885m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f321886n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f321887o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321888d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321889e = true;

    /* renamed from: field_open_count */
    public int f68590xe177af3f;

    /* renamed from: field_send_id */
    public java.lang.String f68591xea95c2ed;

    static {
        p75.n0 n0Var = new p75.n0("LuckyMoneyDetailOpenRecord");
        f321881f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321882g = new java.lang.String[0];
        f321883h = 1979913522;
        f321884i = 676362970;
        f321885m = 108705909;
        f321886n = m125539x3593deb(dm.u7.class);
        f321887o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125539x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "send_id";
        e0Var.f398488d.put("send_id", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "send_id";
        e0Var.f398487c[1] = "open_count";
        e0Var.f398488d.put("open_count", "INTEGER");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " send_id TEXT PRIMARY KEY ,  open_count INTEGER";
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
            if (f321883h == hashCode) {
                try {
                    this.f68591xea95c2ed = cursor.getString(i17);
                    this.f321888d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321884i == hashCode) {
                try {
                    this.f68590xe177af3f = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321885m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321888d) {
            contentValues.put("send_id", this.f68591xea95c2ed);
        }
        if (this.f321889e) {
            contentValues.put("open_count", java.lang.Integer.valueOf(this.f68590xe177af3f));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LuckyMoneyDetailOpenRecord ( ");
        l75.e0 e0Var = f321886n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321882g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", "createTableSql %s", str2);
            k0Var.A("LuckyMoneyDetailOpenRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LuckyMoneyDetailOpenRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", "updateTableSql %s", str3);
            k0Var.A("LuckyMoneyDetailOpenRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLuckyMoneyDetailOpenRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321886n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321887o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68591xea95c2ed;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321881f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321881f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("send_id")) {
            this.f68591xea95c2ed = contentValues.getAsString("send_id");
            if (z17) {
                this.f321888d = true;
            }
        }
        if (contentValues.containsKey("open_count")) {
            this.f68590xe177af3f = contentValues.getAsInteger("open_count").intValue();
            if (z17) {
                this.f321889e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
