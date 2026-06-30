package dm;

/* loaded from: classes4.dex */
public class z8 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f323043g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f323044h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f323045i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f323046m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f323047n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f323048o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f323049p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f323050q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f323051d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f323052e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323053f = true;

    /* renamed from: field_isRead */
    public java.lang.String f69413xff7b64c5;

    /* renamed from: field_msgContentXml */
    public java.lang.String f69414xea7bb0ba;

    /* renamed from: field_msgId */
    public java.lang.String f69415x297eb4f7;

    static {
        p75.n0 n0Var = new p75.n0("OrderCommonMsgXml");
        f323043g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f323044h = new java.lang.String[0];
        f323045i = 104191100;
        f323046m = 1899068223;
        f323047n = -1180158496;
        f323048o = 108705909;
        f323049p = m125775x3593deb(dm.z8.class);
        f323050q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125775x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "msgId";
        e0Var.f398488d.put("msgId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "msgId";
        e0Var.f398487c[1] = "msgContentXml";
        e0Var.f398488d.put("msgContentXml", "TEXT");
        e0Var.f398487c[2] = "isRead";
        e0Var.f398488d.put("isRead", "TEXT");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " msgId TEXT PRIMARY KEY ,  msgContentXml TEXT,  isRead TEXT";
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
            if (f323045i == hashCode) {
                try {
                    this.f69415x297eb4f7 = cursor.getString(i17);
                    this.f323051d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOrderCommonMsgXml", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323046m == hashCode) {
                try {
                    this.f69414xea7bb0ba = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOrderCommonMsgXml", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323047n == hashCode) {
                try {
                    this.f69413xff7b64c5 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOrderCommonMsgXml", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323048o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f323051d) {
            contentValues.put("msgId", this.f69415x297eb4f7);
        }
        if (this.f323052e) {
            contentValues.put("msgContentXml", this.f69414xea7bb0ba);
        }
        if (this.f323053f) {
            contentValues.put("isRead", this.f69413xff7b64c5);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOrderCommonMsgXml", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OrderCommonMsgXml ( ");
        l75.e0 e0Var = f323049p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f323044h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOrderCommonMsgXml", "createTableSql %s", str2);
            k0Var.A("OrderCommonMsgXml", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "OrderCommonMsgXml", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOrderCommonMsgXml", "updateTableSql %s", str3);
            k0Var.A("OrderCommonMsgXml", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOrderCommonMsgXml", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f323049p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f323050q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69415x297eb4f7;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f323043g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f323043g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.f69415x297eb4f7 = contentValues.getAsString("msgId");
            if (z17) {
                this.f323051d = true;
            }
        }
        if (contentValues.containsKey("msgContentXml")) {
            this.f69414xea7bb0ba = contentValues.getAsString("msgContentXml");
            if (z17) {
                this.f323052e = true;
            }
        }
        if (contentValues.containsKey("isRead")) {
            this.f69413xff7b64c5 = contentValues.getAsString("isRead");
            if (z17) {
                this.f323053f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
