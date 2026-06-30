package dm;

/* loaded from: classes4.dex */
public class t0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f321521g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f321522h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f321523i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321524m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f321525n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321526o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f321527p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f321528q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321529d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321530e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321531f = true;

    /* renamed from: field_endTime */
    public long f68367x14c61803;

    /* renamed from: field_sessionName */
    public java.lang.String f68368x6a658e7c;

    /* renamed from: field_startTime */
    public long f68369x1bb3b54a;

    static {
        p75.n0 n0Var = new p75.n0("BackupTempMoveTime");
        f321521g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321522h = new java.lang.String[0];
        f321523i = -22661567;
        f321524m = -2129294769;
        f321525n = -1607243192;
        f321526o = 108705909;
        f321527p = m125500x3593deb(dm.t0.class);
        f321528q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125500x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "sessionName";
        e0Var.f398488d.put("sessionName", "TEXT default '' ");
        e0Var.f398487c[1] = "startTime";
        e0Var.f398488d.put("startTime", "LONG default '0' ");
        e0Var.f398487c[2] = "endTime";
        e0Var.f398488d.put("endTime", "LONG default '0' ");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " sessionName TEXT default '' ,  startTime LONG default '0' ,  endTime LONG default '0' ";
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
            if (f321523i == hashCode) {
                try {
                    this.f68368x6a658e7c = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBackupTempMoveTime", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321524m == hashCode) {
                try {
                    this.f68369x1bb3b54a = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBackupTempMoveTime", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321525n == hashCode) {
                try {
                    this.f68367x14c61803 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBackupTempMoveTime", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321526o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f68368x6a658e7c == null) {
            this.f68368x6a658e7c = "";
        }
        if (this.f321529d) {
            contentValues.put("sessionName", this.f68368x6a658e7c);
        }
        if (this.f321530e) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.f68369x1bb3b54a));
        }
        if (this.f321531f) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.f68367x14c61803));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBackupTempMoveTime", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BackupTempMoveTime ( ");
        l75.e0 e0Var = f321527p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321522h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBackupTempMoveTime", "createTableSql %s", str2);
            k0Var.A("BackupTempMoveTime", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BackupTempMoveTime", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBackupTempMoveTime", "updateTableSql %s", str3);
            k0Var.A("BackupTempMoveTime", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBackupTempMoveTime", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321527p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321528q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321521g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321521g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("sessionName")) {
            this.f68368x6a658e7c = contentValues.getAsString("sessionName");
            if (z17) {
                this.f321529d = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.f68369x1bb3b54a = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f321530e = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.f68367x14c61803 = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f321531f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
