package dm;

/* loaded from: classes4.dex */
public class q5 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f320937f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f320938g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f320939h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f320940i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320941m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f320942n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f320943o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320944d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320945e = true;

    /* renamed from: field_dateTimeRange */
    public java.lang.String f68047xe044d7dd;

    /* renamed from: field_pullCount */
    public int f68048xffc900c5;

    static {
        p75.n0 n0Var = new p75.n0("GameMsgPullRecord");
        f320937f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320938g = new java.lang.String[0];
        f320939h = 1727701602;
        f320940i = 1697306058;
        f320941m = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "dateTimeRange";
        ((java.util.HashMap) e0Var.f398488d).put("dateTimeRange", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "dateTimeRange";
        e0Var.f398487c[1] = "pullCount";
        ((java.util.HashMap) e0Var.f398488d).put("pullCount", "INTEGER default '0' ");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " dateTimeRange TEXT PRIMARY KEY ,  pullCount INTEGER default '0' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f320942n = e0Var;
        f320943o = new o75.e();
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
            if (f320939h == hashCode) {
                try {
                    this.f68047xe044d7dd = cursor.getString(i17);
                    this.f320944d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameMsgPullRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320940i == hashCode) {
                try {
                    this.f68048xffc900c5 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameMsgPullRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320941m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320944d) {
            contentValues.put("dateTimeRange", this.f68047xe044d7dd);
        }
        if (this.f320945e) {
            contentValues.put("pullCount", java.lang.Integer.valueOf(this.f68048xffc900c5));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameMsgPullRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameMsgPullRecord ( ");
        l75.e0 e0Var = f320942n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320938g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameMsgPullRecord", "createTableSql %s", str2);
            k0Var.A("GameMsgPullRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GameMsgPullRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameMsgPullRecord", "updateTableSql %s", str3);
            k0Var.A("GameMsgPullRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameMsgPullRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320942n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320943o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68047xe044d7dd;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320937f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320937f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("dateTimeRange")) {
            this.f68047xe044d7dd = contentValues.getAsString("dateTimeRange");
            if (z17) {
                this.f320944d = true;
            }
        }
        if (contentValues.containsKey("pullCount")) {
            this.f68048xffc900c5 = contentValues.getAsInteger("pullCount").intValue();
            if (z17) {
                this.f320945e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
