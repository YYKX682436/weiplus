package b34;

/* loaded from: classes4.dex */
public class b extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f17706g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f17707h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f17708i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17709m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f17710n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f17711o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f17712p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f17713q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17714d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17715e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17716f = true;
    public boolean field_isshowed;
    public int field_lastshaketime;
    public java.lang.String field_username;

    static {
        p75.n0 n0Var = new p75.n0("ShakeNewYearFriendInfo");
        f17706g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f17707h = new java.lang.String[0];
        f17708i = -265713450;
        f17709m = -1284856579;
        f17710n = 687022598;
        f17711o = 108705909;
        f17712p = initAutoDBInfo(b34.b.class);
        f17713q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_USERNAME;
        e0Var.f316954c[1] = "lastshaketime";
        e0Var.f316955d.put("lastshaketime", "INTEGER default '0' ");
        e0Var.f316954c[2] = "isshowed";
        e0Var.f316955d.put("isshowed", "INTEGER default 'false' ");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " username TEXT default ''  PRIMARY KEY ,  lastshaketime INTEGER default '0' ,  isshowed INTEGER default 'false' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    @Override // l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        java.lang.String[] columnNames = cursor.getColumnNames();
        if (columnNames == null) {
            return;
        }
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            int hashCode = columnNames[i17].hashCode();
            boolean z17 = true;
            if (f17708i == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                    this.f17714d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeNewYearFriendInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f17709m == hashCode) {
                try {
                    this.field_lastshaketime = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeNewYearFriendInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f17710n == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isshowed = z17;
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeNewYearFriendInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f17711o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f17714d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f17715e) {
            contentValues.put("lastshaketime", java.lang.Integer.valueOf(this.field_lastshaketime));
        }
        if (this.f17716f) {
            if (this.field_isshowed) {
                contentValues.put("isshowed", (java.lang.Integer) 1);
            } else {
                contentValues.put("isshowed", (java.lang.Integer) 0);
            }
        }
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    public void createMyTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseShakeNewYearFriendInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ShakeNewYearFriendInfo ( ");
        l75.e0 e0Var = f17712p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f17707h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeNewYearFriendInfo", "createTableSql %s", str2);
            k0Var.A("ShakeNewYearFriendInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ShakeNewYearFriendInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeNewYearFriendInfo", "updateTableSql %s", str3);
            k0Var.A("ShakeNewYearFriendInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeNewYearFriendInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f17712p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f17713q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_username;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f17706g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f17706g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f17714d = true;
            }
        }
        if (contentValues.containsKey("lastshaketime")) {
            this.field_lastshaketime = contentValues.getAsInteger("lastshaketime").intValue();
            if (z17) {
                this.f17715e = true;
            }
        }
        if (contentValues.containsKey("isshowed")) {
            this.field_isshowed = contentValues.getAsInteger("isshowed").intValue() != 0;
            if (z17) {
                this.f17716f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
