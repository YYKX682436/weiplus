package dm;

/* loaded from: classes4.dex */
public class s0 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f321293f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f321294g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f321295h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f321296i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321297m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f321298n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f321299o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321300d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321301e = true;

    /* renamed from: field_msgListDataId */
    public java.lang.String f68234xd5d4f07f;

    /* renamed from: field_sessionName */
    public java.lang.String f68235x6a658e7c;

    static {
        p75.n0 n0Var = new p75.n0("BackupRecoverMsgListDataId");
        f321293f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321294g = new java.lang.String[0];
        f321295h = 1552595716;
        f321296i = -22661567;
        f321297m = 108705909;
        f321298n = m125462x3593deb(dm.s0.class);
        f321299o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125462x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "msgListDataId";
        e0Var.f398488d.put("msgListDataId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "msgListDataId";
        e0Var.f398487c[1] = "sessionName";
        e0Var.f398488d.put("sessionName", "TEXT default '' ");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " msgListDataId TEXT PRIMARY KEY ,  sessionName TEXT default '' ";
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
            if (f321295h == hashCode) {
                try {
                    this.f68234xd5d4f07f = cursor.getString(i17);
                    this.f321300d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBackupRecoverMsgListDataId", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321296i == hashCode) {
                try {
                    this.f68235x6a658e7c = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBackupRecoverMsgListDataId", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321297m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321300d) {
            contentValues.put("msgListDataId", this.f68234xd5d4f07f);
        }
        if (this.f68235x6a658e7c == null) {
            this.f68235x6a658e7c = "";
        }
        if (this.f321301e) {
            contentValues.put("sessionName", this.f68235x6a658e7c);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBackupRecoverMsgListDataId", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BackupRecoverMsgListDataId ( ");
        l75.e0 e0Var = f321298n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321294g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBackupRecoverMsgListDataId", "createTableSql %s", str2);
            k0Var.A("BackupRecoverMsgListDataId", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BackupRecoverMsgListDataId", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBackupRecoverMsgListDataId", "updateTableSql %s", str3);
            k0Var.A("BackupRecoverMsgListDataId", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBackupRecoverMsgListDataId", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321298n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321299o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68234xd5d4f07f;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321293f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321293f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgListDataId")) {
            this.f68234xd5d4f07f = contentValues.getAsString("msgListDataId");
            if (z17) {
                this.f321300d = true;
            }
        }
        if (contentValues.containsKey("sessionName")) {
            this.f68235x6a658e7c = contentValues.getAsString("sessionName");
            if (z17) {
                this.f321301e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
