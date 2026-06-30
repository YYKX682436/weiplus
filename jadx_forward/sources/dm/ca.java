package dm;

/* loaded from: classes4.dex */
public class ca extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f317730h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f317731i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f317732m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f317733n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317734o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317735p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317736q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f317737r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f317738s;

    /* renamed from: field_chatHistoryItem */
    public r45.ty f66169x260b3a0a;

    /* renamed from: field_historyId */
    public java.lang.String f66170x17743ca;

    /* renamed from: field_msgId */
    public long f66171x297eb4f7;

    /* renamed from: field_talker */
    public java.lang.String f66172x114ef53e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317739d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317740e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317741f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317742g = true;

    static {
        p75.n0 n0Var = new p75.n0("SelectRecord");
        f317730h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317731i = new java.lang.String[0];
        f317732m = 1725503695;
        f317733n = 104191100;
        f317734o = -881080743;
        f317735p = -696748209;
        f317736q = 108705909;
        f317737r = m124855x3593deb(dm.ca.class);
        f317738s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124855x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "historyId";
        e0Var.f398488d.put("historyId", "TEXT");
        e0Var.f398487c[1] = "msgId";
        e0Var.f398488d.put("msgId", "LONG");
        e0Var.f398487c[2] = "talker";
        e0Var.f398488d.put("talker", "TEXT");
        e0Var.f398487c[3] = "chatHistoryItem";
        e0Var.f398488d.put("chatHistoryItem", "BLOB");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " historyId TEXT,  msgId LONG,  talker TEXT,  chatHistoryItem BLOB";
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
            if (f317732m == hashCode) {
                try {
                    this.f66170x17743ca = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSelectRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317733n == hashCode) {
                try {
                    this.f66171x297eb4f7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSelectRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317734o == hashCode) {
                try {
                    this.f66172x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSelectRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317735p == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f66169x260b3a0a = (r45.ty) new r45.ty().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSelectRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317736q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317739d) {
            contentValues.put("historyId", this.f66170x17743ca);
        }
        if (this.f317740e) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f66171x297eb4f7));
        }
        if (this.f317741f) {
            contentValues.put("talker", this.f66172x114ef53e);
        }
        if (this.f317742g) {
            r45.ty tyVar = this.f66169x260b3a0a;
            if (tyVar != null) {
                try {
                    contentValues.put("chatHistoryItem", tyVar.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSelectRecord", e17.getMessage());
                }
            } else {
                contentValues.put("chatHistoryItem", (byte[]) null);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSelectRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SelectRecord ( ");
        l75.e0 e0Var = f317737r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317731i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSelectRecord", "createTableSql %s", str2);
            k0Var.A("SelectRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "SelectRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSelectRecord", "updateTableSql %s", str3);
            k0Var.A("SelectRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSelectRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317737r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317738s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317730h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317730h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("historyId")) {
            this.f66170x17743ca = contentValues.getAsString("historyId");
            if (z17) {
                this.f317739d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.f66171x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f317740e = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f66172x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f317741f = true;
            }
        }
        if (contentValues.containsKey("chatHistoryItem")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("chatHistoryItem");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f66169x260b3a0a = (r45.ty) new r45.ty().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f317742g = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSelectRecord", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
