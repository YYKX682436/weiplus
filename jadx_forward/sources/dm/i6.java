package dm;

/* loaded from: classes4.dex */
public class i6 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f319123g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f319124h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f319125i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f319126m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319127n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319128o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f319129p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f319130q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319131d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319132e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319133f = true;

    /* renamed from: field_appusername */
    public java.lang.String f66969x84a2aa32;

    /* renamed from: field_score */
    public int f66970x29cc1f0d;

    /* renamed from: field_title */
    public java.lang.String f66971x29dd02d3;

    static {
        p75.n0 n0Var = new p75.n0("HardDeviceProfileRankDetail");
        f319123g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319124h = new java.lang.String[0];
        f319125i = 417550839;
        f319126m = 110371416;
        f319127n = 109264530;
        f319128o = 108705909;
        f319129p = m125119x3593deb(dm.i6.class);
        f319130q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125119x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "appusername";
        e0Var.f398488d.put("appusername", "TEXT");
        e0Var.f398487c[1] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "TEXT");
        e0Var.f398487c[2] = ya.b.f77498x4b14672;
        e0Var.f398488d.put(ya.b.f77498x4b14672, "INTEGER");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " appusername TEXT,  title TEXT,  score INTEGER";
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
            if (f319125i == hashCode) {
                try {
                    this.f66969x84a2aa32 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319126m == hashCode) {
                try {
                    this.f66971x29dd02d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319127n == hashCode) {
                try {
                    this.f66970x29cc1f0d = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319128o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319131d) {
            contentValues.put("appusername", this.f66969x84a2aa32);
        }
        if (this.f319132e) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f66971x29dd02d3);
        }
        if (this.f319133f) {
            contentValues.put(ya.b.f77498x4b14672, java.lang.Integer.valueOf(this.f66970x29cc1f0d));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardDeviceProfileRankDetail ( ");
        l75.e0 e0Var = f319129p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319124h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", "createTableSql %s", str2);
            k0Var.A("HardDeviceProfileRankDetail", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "HardDeviceProfileRankDetail", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", "updateTableSql %s", str3);
            k0Var.A("HardDeviceProfileRankDetail", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceProfileRankDetail", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319129p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319130q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319123g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319123g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appusername")) {
            this.f66969x84a2aa32 = contentValues.getAsString("appusername");
            if (z17) {
                this.f319131d = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            this.f66971x29dd02d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (z17) {
                this.f319132e = true;
            }
        }
        if (contentValues.containsKey(ya.b.f77498x4b14672)) {
            this.f66970x29cc1f0d = contentValues.getAsInteger(ya.b.f77498x4b14672).intValue();
            if (z17) {
                this.f319133f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
