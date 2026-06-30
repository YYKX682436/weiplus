package dm;

/* loaded from: classes4.dex */
public class p6 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f320693n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f320694o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320695p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320696q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320697r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320698s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320699t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320700u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320701v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320702w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f320703x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f320704y;

    /* renamed from: field_content */
    public java.lang.String f67907xad49e234;

    /* renamed from: field_descUrl */
    public java.lang.String f67908xd15e26d9;

    /* renamed from: field_isRead */
    public short f67909xff7b64c5;

    /* renamed from: field_msgType */
    public int f67910xc4aab016;

    /* renamed from: field_pushTime */
    public long f67911x879e62ac;

    /* renamed from: field_svrId */
    public long f67912x29d4c865;

    /* renamed from: field_title */
    public java.lang.String f67913x29dd02d3;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320705d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320706e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320707f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320708g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320709h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320710i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320711m = true;

    static {
        p75.n0 n0Var = new p75.n0("IPCallMsg");
        f320693n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320694o = new java.lang.String[0];
        f320695p = 109832170;
        f320696q = -1180158496;
        f320697r = 110371416;
        f320698s = 951530617;
        f320699t = 1775982855;
        f320700u = 1343750747;
        f320701v = 1556838686;
        f320702w = 108705909;
        f320703x = m125394x3593deb(dm.p6.class);
        f320704y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125394x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "svrId";
        e0Var.f398488d.put("svrId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "svrId";
        e0Var.f398487c[1] = "isRead";
        e0Var.f398488d.put("isRead", "SHORT default '0' ");
        e0Var.f398487c[2] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "TEXT");
        e0Var.f398487c[3] = "content";
        e0Var.f398488d.put("content", "TEXT");
        e0Var.f398487c[4] = "pushTime";
        e0Var.f398488d.put("pushTime", "LONG");
        e0Var.f398487c[5] = "msgType";
        e0Var.f398488d.put("msgType", "INTEGER");
        e0Var.f398487c[6] = "descUrl";
        e0Var.f398488d.put("descUrl", "TEXT");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " svrId LONG PRIMARY KEY ,  isRead SHORT default '0' ,  title TEXT,  content TEXT,  pushTime LONG,  msgType INTEGER,  descUrl TEXT";
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
            if (f320695p == hashCode) {
                try {
                    this.f67912x29d4c865 = cursor.getLong(i17);
                    this.f320705d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallMsg", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320696q == hashCode) {
                try {
                    this.f67909xff7b64c5 = cursor.getShort(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallMsg", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320697r == hashCode) {
                try {
                    this.f67913x29dd02d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallMsg", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320698s == hashCode) {
                try {
                    this.f67907xad49e234 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallMsg", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320699t == hashCode) {
                try {
                    this.f67911x879e62ac = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallMsg", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320700u == hashCode) {
                try {
                    this.f67910xc4aab016 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallMsg", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320701v == hashCode) {
                try {
                    this.f67908xd15e26d9 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallMsg", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320702w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320705d) {
            contentValues.put("svrId", java.lang.Long.valueOf(this.f67912x29d4c865));
        }
        if (this.f320706e) {
            contentValues.put("isRead", java.lang.Short.valueOf(this.f67909xff7b64c5));
        }
        if (this.f320707f) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f67913x29dd02d3);
        }
        if (this.f320708g) {
            contentValues.put("content", this.f67907xad49e234);
        }
        if (this.f320709h) {
            contentValues.put("pushTime", java.lang.Long.valueOf(this.f67911x879e62ac));
        }
        if (this.f320710i) {
            contentValues.put("msgType", java.lang.Integer.valueOf(this.f67910xc4aab016));
        }
        if (this.f320711m) {
            contentValues.put("descUrl", this.f67908xd15e26d9);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseIPCallMsg", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS IPCallMsg ( ");
        l75.e0 e0Var = f320703x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320694o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseIPCallMsg", "createTableSql %s", str2);
            k0Var.A("IPCallMsg", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "IPCallMsg", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseIPCallMsg", "updateTableSql %s", str3);
            k0Var.A("IPCallMsg", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseIPCallMsg", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320703x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320704y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f67912x29d4c865);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320693n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320693n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("svrId")) {
            this.f67912x29d4c865 = contentValues.getAsLong("svrId").longValue();
            if (z17) {
                this.f320705d = true;
            }
        }
        if (contentValues.containsKey("isRead")) {
            this.f67909xff7b64c5 = contentValues.getAsShort("isRead").shortValue();
            if (z17) {
                this.f320706e = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            this.f67913x29dd02d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (z17) {
                this.f320707f = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.f67907xad49e234 = contentValues.getAsString("content");
            if (z17) {
                this.f320708g = true;
            }
        }
        if (contentValues.containsKey("pushTime")) {
            this.f67911x879e62ac = contentValues.getAsLong("pushTime").longValue();
            if (z17) {
                this.f320709h = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.f67910xc4aab016 = contentValues.getAsInteger("msgType").intValue();
            if (z17) {
                this.f320710i = true;
            }
        }
        if (contentValues.containsKey("descUrl")) {
            this.f67908xd15e26d9 = contentValues.getAsString("descUrl");
            if (z17) {
                this.f320711m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
