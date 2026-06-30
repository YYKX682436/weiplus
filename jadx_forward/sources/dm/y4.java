package dm;

/* loaded from: classes4.dex */
public class y4 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f322726f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f322727g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f322728h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f322729i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f322730m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f322731n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f322732o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322733d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322734e = true;

    /* renamed from: field_type */
    public int f69191x2262335f;

    /* renamed from: field_username */
    public java.lang.String f69192xdec927b;

    static {
        p75.n0 n0Var = new p75.n0("FinderOrAliasDeletingInfo");
        f322726f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322727g = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderOrAliasDeletingInfo_username_index ON FinderOrAliasDeletingInfo(username)"};
        f322728h = -265713450;
        f322729i = 3575610;
        f322730m = 108705909;
        f322731n = m125706x3593deb(dm.y4.class);
        f322732o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125706x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66875xa013b0d5;
        e0Var.f398487c[1] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " username TEXT default ''  PRIMARY KEY ,  type INTEGER";
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
            if (f322728h == hashCode) {
                try {
                    this.f69192xdec927b = cursor.getString(i17);
                    this.f322733d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322729i == hashCode) {
                try {
                    this.f69191x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322730m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f69192xdec927b == null) {
            this.f69192xdec927b = "";
        }
        if (this.f322733d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f69192xdec927b);
        }
        if (this.f322734e) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f69191x2262335f));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderOrAliasDeletingInfo ( ");
        l75.e0 e0Var = f322731n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322727g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", "createTableSql %s", str2);
            k0Var.A("FinderOrAliasDeletingInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderOrAliasDeletingInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", "updateTableSql %s", str3);
            k0Var.A("FinderOrAliasDeletingInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderOrAliasDeletingInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322731n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322732o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69192xdec927b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322726f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322726f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f69192xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f322733d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f69191x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f322734e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
