package dm;

/* loaded from: classes4.dex */
public class l8 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f319826g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f319827h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f319828i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f319829m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319830n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319831o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f319832p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f319833q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319834d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319835e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319836f = true;

    /* renamed from: field_cacheTime */
    public long f67345x799f106a;

    /* renamed from: field_isKeyView */
    public boolean f67346x47757815;

    /* renamed from: field_reportStr */
    public java.lang.String f67347x858e9f58;

    static {
        p75.n0 n0Var = new p75.n0("NewUserBehaviourCache");
        f319826g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319827h = new java.lang.String[0];
        f319828i = -553589393;
        f319829m = -353340323;
        f319830n = -1395176166;
        f319831o = 108705909;
        f319832p = m125203x3593deb(dm.l8.class);
        f319833q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125203x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "cacheTime";
        e0Var.f398488d.put("cacheTime", "LONG");
        e0Var.f398487c[1] = "reportStr";
        e0Var.f398488d.put("reportStr", "TEXT");
        e0Var.f398487c[2] = "isKeyView";
        e0Var.f398488d.put("isKeyView", "INTEGER");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " cacheTime LONG,  reportStr TEXT,  isKeyView INTEGER";
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
            if (f319828i == hashCode) {
                try {
                    this.f67345x799f106a = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewUserBehaviourCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319829m == hashCode) {
                try {
                    this.f67347x858e9f58 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewUserBehaviourCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319830n == hashCode) {
                try {
                    this.f67346x47757815 = cursor.getInt(i17) != 0;
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewUserBehaviourCache", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319831o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319834d) {
            contentValues.put("cacheTime", java.lang.Long.valueOf(this.f67345x799f106a));
        }
        if (this.f319835e) {
            contentValues.put("reportStr", this.f67347x858e9f58);
        }
        if (this.f319836f) {
            if (this.f67346x47757815) {
                contentValues.put("isKeyView", (java.lang.Integer) 1);
            } else {
                contentValues.put("isKeyView", (java.lang.Integer) 0);
            }
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseNewUserBehaviourCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS NewUserBehaviourCache ( ");
        l75.e0 e0Var = f319832p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319827h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseNewUserBehaviourCache", "createTableSql %s", str2);
            k0Var.A("NewUserBehaviourCache", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "NewUserBehaviourCache", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseNewUserBehaviourCache", "updateTableSql %s", str3);
            k0Var.A("NewUserBehaviourCache", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseNewUserBehaviourCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319832p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319833q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319826g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319826g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("cacheTime")) {
            this.f67345x799f106a = contentValues.getAsLong("cacheTime").longValue();
            if (z17) {
                this.f319834d = true;
            }
        }
        if (contentValues.containsKey("reportStr")) {
            this.f67347x858e9f58 = contentValues.getAsString("reportStr");
            if (z17) {
                this.f319835e = true;
            }
        }
        if (contentValues.containsKey("isKeyView")) {
            this.f67346x47757815 = contentValues.getAsInteger("isKeyView").intValue() != 0;
            if (z17) {
                this.f319836f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
