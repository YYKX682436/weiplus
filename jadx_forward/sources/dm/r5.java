package dm;

/* loaded from: classes4.dex */
public class r5 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f321160f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f321161g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f321162h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f321163i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321164m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f321165n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f321166o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321167d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321168e = true;

    /* renamed from: field_consumeMsgId */
    public long f68170xd811b505;

    /* renamed from: field_contentId */
    public java.lang.String f68171x825a2e6f;

    static {
        p75.n0 n0Var = new p75.n0("GameMsgRelativeContent");
        f321160f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321161g = new java.lang.String[0];
        f321162h = -407108748;
        f321163i = -874117664;
        f321164m = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "contentId";
        ((java.util.HashMap) e0Var.f398488d).put("contentId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "contentId";
        e0Var.f398487c[1] = "consumeMsgId";
        ((java.util.HashMap) e0Var.f398488d).put("consumeMsgId", "LONG default '0' ");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " contentId TEXT PRIMARY KEY ,  consumeMsgId LONG default '0' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f321165n = e0Var;
        f321166o = new o75.e();
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
            if (f321162h == hashCode) {
                try {
                    this.f68171x825a2e6f = cursor.getString(i17);
                    this.f321167d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameMsgRelativeContent", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321163i == hashCode) {
                try {
                    this.f68170xd811b505 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameMsgRelativeContent", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321164m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321167d) {
            contentValues.put("contentId", this.f68171x825a2e6f);
        }
        if (this.f321168e) {
            contentValues.put("consumeMsgId", java.lang.Long.valueOf(this.f68170xd811b505));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameMsgRelativeContent", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameMsgRelativeContent ( ");
        l75.e0 e0Var = f321165n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321161g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameMsgRelativeContent", "createTableSql %s", str2);
            k0Var.A("GameMsgRelativeContent", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GameMsgRelativeContent", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameMsgRelativeContent", "updateTableSql %s", str3);
            k0Var.A("GameMsgRelativeContent", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameMsgRelativeContent", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321165n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321166o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68171x825a2e6f;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321160f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321160f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("contentId")) {
            this.f68171x825a2e6f = contentValues.getAsString("contentId");
            if (z17) {
                this.f321167d = true;
            }
        }
        if (contentValues.containsKey("consumeMsgId")) {
            this.f68170xd811b505 = contentValues.getAsLong("consumeMsgId").longValue();
            if (z17) {
                this.f321168e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
