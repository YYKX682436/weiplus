package dm;

/* loaded from: classes4.dex */
public class f6 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f318379g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f318380h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f318381i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318382m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318383n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318384o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f318385p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f318386q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318387d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318388e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318389f = true;

    /* renamed from: field_championMotto */
    public java.lang.String f66504x6d53d39f;

    /* renamed from: field_championUrl */
    public java.lang.String f66505x850adc81;

    /* renamed from: field_username */
    public java.lang.String f66506xdec927b;

    static {
        p75.n0 n0Var = new p75.n0("HardDeviceChampionInfo");
        f318379g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318380h = new java.lang.String[0];
        f318381i = -265713450;
        f318382m = 424379462;
        f318383n = -200696284;
        f318384o = 108705909;
        f318385p = m124975x3593deb(dm.f6.class);
        f318386q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124975x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT");
        e0Var.f398487c[1] = "championUrl";
        e0Var.f398488d.put("championUrl", "TEXT");
        e0Var.f398487c[2] = "championMotto";
        e0Var.f398488d.put("championMotto", "TEXT");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " username TEXT,  championUrl TEXT,  championMotto TEXT";
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
            if (f318381i == hashCode) {
                try {
                    this.f66506xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceChampionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318382m == hashCode) {
                try {
                    this.f66505x850adc81 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceChampionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318383n == hashCode) {
                try {
                    this.f66504x6d53d39f = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceChampionInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318384o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318387d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f66506xdec927b);
        }
        if (this.f318388e) {
            contentValues.put("championUrl", this.f66505x850adc81);
        }
        if (this.f318389f) {
            contentValues.put("championMotto", this.f66504x6d53d39f);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseHardDeviceChampionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardDeviceChampionInfo ( ");
        l75.e0 e0Var = f318385p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318380h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceChampionInfo", "createTableSql %s", str2);
            k0Var.A("HardDeviceChampionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "HardDeviceChampionInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceChampionInfo", "updateTableSql %s", str3);
            k0Var.A("HardDeviceChampionInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceChampionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318385p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318386q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318379g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318379g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f66506xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f318387d = true;
            }
        }
        if (contentValues.containsKey("championUrl")) {
            this.f66505x850adc81 = contentValues.getAsString("championUrl");
            if (z17) {
                this.f318388e = true;
            }
        }
        if (contentValues.containsKey("championMotto")) {
            this.f66504x6d53d39f = contentValues.getAsString("championMotto");
            if (z17) {
                this.f318389f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
