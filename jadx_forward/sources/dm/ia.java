package dm;

/* loaded from: classes4.dex */
public class ia extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f319191f;

    /* renamed from: g, reason: collision with root package name */
    public static final p75.d f319192g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.d f319193h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f319194i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f319195m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319196n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319197o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f319198p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f319199q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319200d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319201e = true;

    /* renamed from: field_showType */
    public int f67018x991217c;

    /* renamed from: field_snsId */
    public long f67019x29d1292e;

    static {
        p75.n0 n0Var = new p75.n0("ShowTeachSnsInfo");
        f319191f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319192g = new p75.d("snsId", "long", tableName, "");
        f319193h = new p75.d("showType", "int", tableName, "");
        f319194i = new java.lang.String[0];
        f319195m = 109594803;
        f319196n = -338815017;
        f319197o = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "snsId";
        ((java.util.HashMap) e0Var.f398488d).put("snsId", "LONG");
        e0Var.f398487c[1] = "showType";
        ((java.util.HashMap) e0Var.f398488d).put("showType", "INTEGER");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " snsId LONG,  showType INTEGER";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f319198p = e0Var;
        f319199q = new o75.e();
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
            if (f319195m == hashCode) {
                try {
                    this.f67019x29d1292e = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShowTeachSnsInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319196n == hashCode) {
                try {
                    this.f67018x991217c = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShowTeachSnsInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319197o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319200d) {
            contentValues.put("snsId", java.lang.Long.valueOf(this.f67019x29d1292e));
        }
        if (this.f319201e) {
            contentValues.put("showType", java.lang.Integer.valueOf(this.f67018x991217c));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseShowTeachSnsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ShowTeachSnsInfo ( ");
        l75.e0 e0Var = f319198p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319194i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShowTeachSnsInfo", "createTableSql %s", str2);
            k0Var.A("ShowTeachSnsInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ShowTeachSnsInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShowTeachSnsInfo", "updateTableSql %s", str3);
            k0Var.A("ShowTeachSnsInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShowTeachSnsInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319198p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319199q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319191f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319191f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("snsId")) {
            this.f67019x29d1292e = contentValues.getAsLong("snsId").longValue();
            if (z17) {
                this.f319200d = true;
            }
        }
        if (contentValues.containsKey("showType")) {
            this.f67018x991217c = contentValues.getAsInteger("showType").intValue();
            if (z17) {
                this.f319201e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
