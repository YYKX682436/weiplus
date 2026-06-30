package dm;

/* loaded from: classes4.dex */
public class p0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f320608g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f320609h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f320610i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320611m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320612n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320613o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f320614p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f320615q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320616d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320617e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320618f = true;

    /* renamed from: field_appId */
    public java.lang.String f67875x28d45f97;

    /* renamed from: field_flag */
    public long f67876x225ba391;

    /* renamed from: field_sortId */
    public int f67877x10623e3e;

    static {
        p75.n0 n0Var = new p75.n0("AppSort");
        f320608g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320609h = new java.lang.String[0];
        f320610i = 3145580;
        f320611m = 93028124;
        f320612n = -896594087;
        f320613o = 108705909;
        f320614p = m125382x3593deb(dm.p0.class);
        f320615q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125382x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "flag";
        e0Var.f398488d.put("flag", "LONG default '0' ");
        e0Var.f398487c[1] = "appId";
        e0Var.f398488d.put("appId", "TEXT default '' ");
        e0Var.f398487c[2] = "sortId";
        e0Var.f398488d.put("sortId", "INTEGER default '0' ");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " flag LONG default '0' ,  appId TEXT default '' ,  sortId INTEGER default '0' ";
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
            if (f320610i == hashCode) {
                try {
                    this.f67876x225ba391 = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppSort", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320611m == hashCode) {
                try {
                    this.f67875x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppSort", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320612n == hashCode) {
                try {
                    this.f67877x10623e3e = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppSort", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320613o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320616d) {
            contentValues.put("flag", java.lang.Long.valueOf(this.f67876x225ba391));
        }
        if (this.f67875x28d45f97 == null) {
            this.f67875x28d45f97 = "";
        }
        if (this.f320617e) {
            contentValues.put("appId", this.f67875x28d45f97);
        }
        if (this.f320618f) {
            contentValues.put("sortId", java.lang.Integer.valueOf(this.f67877x10623e3e));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppSort", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppSort ( ");
        l75.e0 e0Var = f320614p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320609h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppSort", "createTableSql %s", str2);
            k0Var.A("AppSort", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppSort", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppSort", "updateTableSql %s", str3);
            k0Var.A("AppSort", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppSort", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320614p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320615q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320608g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320608g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("flag")) {
            this.f67876x225ba391 = contentValues.getAsLong("flag").longValue();
            if (z17) {
                this.f320616d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.f67875x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f320617e = true;
            }
        }
        if (contentValues.containsKey("sortId")) {
            this.f67877x10623e3e = contentValues.getAsInteger("sortId").intValue();
            if (z17) {
                this.f320618f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
