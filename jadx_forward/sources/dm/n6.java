package dm;

/* loaded from: classes4.dex */
public class n6 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f320232f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f320233g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f320234h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f320235i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320236m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f320237n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f320238o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320239d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320240e = true;

    /* renamed from: field_msgId */
    public long f67673x297eb4f7;

    /* renamed from: field_payMsgId */
    public java.lang.String f67674x6e706659;

    static {
        p75.n0 n0Var = new p75.n0("HoneyPayMsgRecord");
        f320232f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320233g = new java.lang.String[0];
        f320234h = 1353538740;
        f320235i = 104191100;
        f320236m = 108705909;
        f320237n = m125339x3593deb(dm.n6.class);
        f320238o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125339x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "payMsgId";
        e0Var.f398488d.put("payMsgId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "payMsgId";
        e0Var.f398487c[1] = "msgId";
        e0Var.f398488d.put("msgId", "LONG");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " payMsgId TEXT PRIMARY KEY ,  msgId LONG";
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
            if (f320234h == hashCode) {
                try {
                    this.f67674x6e706659 = cursor.getString(i17);
                    this.f320239d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHoneyPayMsgRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320235i == hashCode) {
                try {
                    this.f67673x297eb4f7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHoneyPayMsgRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320236m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320239d) {
            contentValues.put("payMsgId", this.f67674x6e706659);
        }
        if (this.f320240e) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f67673x297eb4f7));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseHoneyPayMsgRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HoneyPayMsgRecord ( ");
        l75.e0 e0Var = f320237n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320233g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHoneyPayMsgRecord", "createTableSql %s", str2);
            k0Var.A("HoneyPayMsgRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "HoneyPayMsgRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHoneyPayMsgRecord", "updateTableSql %s", str3);
            k0Var.A("HoneyPayMsgRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHoneyPayMsgRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320237n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320238o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67674x6e706659;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320232f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320232f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("payMsgId")) {
            this.f67674x6e706659 = contentValues.getAsString("payMsgId");
            if (z17) {
                this.f320239d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.f67673x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f320240e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
