package dm;

/* loaded from: classes4.dex */
public class r0 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f321072g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f321073h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f321074i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321075m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f321076n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321077o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f321078p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f321079q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321080d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321081e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321082f = true;

    /* renamed from: field_deviceId */
    public java.lang.String f68115x5fdff3b6;

    /* renamed from: field_moveTime */
    public r45.dd f68116x1789bbe3;

    /* renamed from: field_sessionName */
    public java.lang.String f68117x6a658e7c;

    static {
        p75.n0 n0Var = new p75.n0("BackupMoveTime");
        f321072g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321073h = new java.lang.String[0];
        f321074i = 1109191185;
        f321075m = -22661567;
        f321076n = -104418754;
        f321077o = 108705909;
        f321078p = m125437x3593deb(dm.r0.class);
        f321079q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125437x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "deviceId";
        e0Var.f398488d.put("deviceId", "TEXT default '' ");
        e0Var.f398487c[1] = "sessionName";
        e0Var.f398488d.put("sessionName", "TEXT default '' ");
        e0Var.f398487c[2] = "moveTime";
        e0Var.f398488d.put("moveTime", "BLOB default '' ");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " deviceId TEXT default '' ,  sessionName TEXT default '' ,  moveTime BLOB default '' ";
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
            if (f321074i == hashCode) {
                try {
                    this.f68115x5fdff3b6 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBackupMoveTime", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321075m == hashCode) {
                try {
                    this.f68117x6a658e7c = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBackupMoveTime", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321076n == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f68116x1789bbe3 = (r45.dd) new r45.dd().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBackupMoveTime", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321077o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f68115x5fdff3b6 == null) {
            this.f68115x5fdff3b6 = "";
        }
        if (this.f321080d) {
            contentValues.put("deviceId", this.f68115x5fdff3b6);
        }
        if (this.f68117x6a658e7c == null) {
            this.f68117x6a658e7c = "";
        }
        if (this.f321081e) {
            contentValues.put("sessionName", this.f68117x6a658e7c);
        }
        if (this.f321082f) {
            r45.dd ddVar = this.f68116x1789bbe3;
            if (ddVar != null) {
                try {
                    contentValues.put("moveTime", ddVar.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBackupMoveTime", e17.getMessage());
                }
            } else {
                contentValues.put("moveTime", (byte[]) null);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBackupMoveTime", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BackupMoveTime ( ");
        l75.e0 e0Var = f321078p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321073h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBackupMoveTime", "createTableSql %s", str2);
            k0Var.A("BackupMoveTime", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BackupMoveTime", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBackupMoveTime", "updateTableSql %s", str3);
            k0Var.A("BackupMoveTime", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBackupMoveTime", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321078p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321079q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321072g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321072g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("deviceId")) {
            this.f68115x5fdff3b6 = contentValues.getAsString("deviceId");
            if (z17) {
                this.f321080d = true;
            }
        }
        if (contentValues.containsKey("sessionName")) {
            this.f68117x6a658e7c = contentValues.getAsString("sessionName");
            if (z17) {
                this.f321081e = true;
            }
        }
        if (contentValues.containsKey("moveTime")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("moveTime");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f68116x1789bbe3 = (r45.dd) new r45.dd().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f321082f = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBackupMoveTime", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
