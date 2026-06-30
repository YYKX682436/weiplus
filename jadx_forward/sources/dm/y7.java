package dm;

/* loaded from: classes4.dex */
public class y7 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f322744f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f322745g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f322746h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f322747i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f322748m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f322749n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f322750o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322751d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322752e = true;

    /* renamed from: field_count */
    public int f69195x28f0318a;

    /* renamed from: field_date */
    public java.lang.String f69196x225a93d3;

    static {
        p75.n0 n0Var = new p75.n0("MMStoryHistoryItem");
        f322744f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322745g = new java.lang.String[0];
        f322746h = 3076014;
        f322747i = 94851343;
        f322748m = 108705909;
        f322749n = m125710x3593deb(dm.y7.class);
        f322750o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125710x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37645x68f5f8be;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37645x68f5f8be, "TEXT");
        e0Var.f398487c[1] = "count";
        e0Var.f398488d.put("count", "INTEGER");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " date TEXT,  count INTEGER";
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
            if (f322746h == hashCode) {
                try {
                    this.f69196x225a93d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryHistoryItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322747i == hashCode) {
                try {
                    this.f69195x28f0318a = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMMStoryHistoryItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322748m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322751d) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37645x68f5f8be, this.f69196x225a93d3);
        }
        if (this.f322752e) {
            contentValues.put("count", java.lang.Integer.valueOf(this.f69195x28f0318a));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseMMStoryHistoryItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MMStoryHistoryItem ( ");
        l75.e0 e0Var = f322749n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322745g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMMStoryHistoryItem", "createTableSql %s", str2);
            k0Var.A("MMStoryHistoryItem", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "MMStoryHistoryItem", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMMStoryHistoryItem", "updateTableSql %s", str3);
            k0Var.A("MMStoryHistoryItem", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMMStoryHistoryItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322749n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322750o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322744f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322744f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37645x68f5f8be)) {
            this.f69196x225a93d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37645x68f5f8be);
            if (z17) {
                this.f322751d = true;
            }
        }
        if (contentValues.containsKey("count")) {
            this.f69195x28f0318a = contentValues.getAsInteger("count").intValue();
            if (z17) {
                this.f322752e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
