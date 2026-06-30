package dm;

/* loaded from: classes4.dex */
public class h2 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f318856f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f318857g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f318858h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f318859i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318860m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f318861n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f318862o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318863d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318864e = true;

    /* renamed from: field_contactName */
    public java.lang.String f66749x6e2c5b06;

    /* renamed from: field_labelId */
    public java.lang.String f66750x70ce48ea;

    static {
        p75.n0 n0Var = new p75.n0("ContactLabelCache");
        f318856f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318857g = new java.lang.String[0];
        f318858h = -63202513;
        f318859i = 40698571;
        f318860m = 108705909;
        f318861n = m125024x3593deb(dm.h2.class);
        f318862o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125024x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "labelId";
        e0Var.f398488d.put("labelId", "TEXT");
        e0Var.f398487c[1] = "contactName";
        e0Var.f398488d.put("contactName", "TEXT");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " labelId TEXT,  contactName TEXT";
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
            if (f318858h == hashCode) {
                try {
                    this.f66750x70ce48ea = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseContactLabelCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318859i == hashCode) {
                try {
                    this.f66749x6e2c5b06 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseContactLabelCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318860m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318863d) {
            contentValues.put("labelId", this.f66750x70ce48ea);
        }
        if (this.f318864e) {
            contentValues.put("contactName", this.f66749x6e2c5b06);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseContactLabelCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ContactLabelCache ( ");
        l75.e0 e0Var = f318861n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318857g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseContactLabelCache", "createTableSql %s", str2);
            k0Var.A("ContactLabelCache", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ContactLabelCache", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseContactLabelCache", "updateTableSql %s", str3);
            k0Var.A("ContactLabelCache", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseContactLabelCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318861n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318862o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318856f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318856f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("labelId")) {
            this.f66750x70ce48ea = contentValues.getAsString("labelId");
            if (z17) {
                this.f318863d = true;
            }
        }
        if (contentValues.containsKey("contactName")) {
            this.f66749x6e2c5b06 = contentValues.getAsString("contactName");
            if (z17) {
                this.f318864e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
