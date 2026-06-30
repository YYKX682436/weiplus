package dm;

/* loaded from: classes4.dex */
public class j4 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f319310f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f319311g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f319312h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f319313i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f319314m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f319315n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f319316o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319317d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319318e = true;

    /* renamed from: field_actionTag */
    public java.lang.String f67096xa66fc07f;

    /* renamed from: field_actionTime */
    public long f67097x27886e88;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveActionRecord");
        f319310f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319311g = new java.lang.String[0];
        f319312h = 198284676;
        f319313i = 1851865635;
        f319314m = 108705909;
        f319315n = m125139x3593deb(dm.j4.class);
        f319316o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125139x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "actionTag";
        e0Var.f398488d.put("actionTag", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "actionTag";
        e0Var.f398487c[1] = "actionTime";
        e0Var.f398488d.put("actionTime", "LONG");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " actionTag TEXT PRIMARY KEY ,  actionTime LONG";
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
            if (f319312h == hashCode) {
                try {
                    this.f67096xa66fc07f = cursor.getString(i17);
                    this.f319317d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveActionRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319313i == hashCode) {
                try {
                    this.f67097x27886e88 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveActionRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319314m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319317d) {
            contentValues.put("actionTag", this.f67096xa66fc07f);
        }
        if (this.f319318e) {
            contentValues.put("actionTime", java.lang.Long.valueOf(this.f67097x27886e88));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderLiveActionRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveActionRecord ( ");
        l75.e0 e0Var = f319315n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319311g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveActionRecord", "createTableSql %s", str2);
            k0Var.A("FinderLiveActionRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderLiveActionRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveActionRecord", "updateTableSql %s", str3);
            k0Var.A("FinderLiveActionRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveActionRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319315n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319316o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67096xa66fc07f;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319310f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319310f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("actionTag")) {
            this.f67096xa66fc07f = contentValues.getAsString("actionTag");
            if (z17) {
                this.f319317d = true;
            }
        }
        if (contentValues.containsKey("actionTime")) {
            this.f67097x27886e88 = contentValues.getAsLong("actionTime").longValue();
            if (z17) {
                this.f319318e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
