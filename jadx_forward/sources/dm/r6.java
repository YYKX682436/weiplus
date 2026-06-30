package dm;

/* loaded from: classes8.dex */
public class r6 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f321169m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f321170n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321171o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321172p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321173q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321174r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321175s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321176t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321177u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f321178v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f321179w;

    /* renamed from: field_addressId */
    public long f68172xcebea32a;

    /* renamed from: field_calltime */
    public long f68173x138777d0;

    /* renamed from: field_duration */
    public long f68174xa7075739;

    /* renamed from: field_phoneType */
    public int f68175x5d4904c3;

    /* renamed from: field_phonenumber */
    public java.lang.String f68176x5b3f2672;

    /* renamed from: field_status */
    public int f68177x10a0fed7;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321180d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321181e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321182f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321183g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321184h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321185i = true;

    static {
        p75.n0 n0Var = new p75.n0("IPCallRecord");
        f321169m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321170n = new java.lang.String[0];
        f321171o = -276836809;
        f321172p = -171676117;
        f321173q = -1992012396;
        f321174r = -892481550;
        f321175s = 874543151;
        f321176t = -1028990520;
        f321177u = 108705909;
        f321178v = m125448x3593deb(dm.r6.class);
        f321179w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125448x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "phonenumber";
        e0Var.f398488d.put("phonenumber", "TEXT");
        e0Var.f398487c[1] = "calltime";
        e0Var.f398488d.put("calltime", "LONG");
        e0Var.f398487c[2] = "duration";
        e0Var.f398488d.put("duration", "LONG");
        e0Var.f398487c[3] = "status";
        e0Var.f398488d.put("status", "INTEGER");
        e0Var.f398487c[4] = "addressId";
        e0Var.f398488d.put("addressId", "LONG default '-1' ");
        e0Var.f398487c[5] = "phoneType";
        e0Var.f398488d.put("phoneType", "INTEGER default '-1' ");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " phonenumber TEXT,  calltime LONG,  duration LONG,  status INTEGER,  addressId LONG default '-1' ,  phoneType INTEGER default '-1' ";
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
            if (f321171o == hashCode) {
                try {
                    this.f68176x5b3f2672 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321172p == hashCode) {
                try {
                    this.f68173x138777d0 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321173q == hashCode) {
                try {
                    this.f68174xa7075739 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321174r == hashCode) {
                try {
                    this.f68177x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321175s == hashCode) {
                try {
                    this.f68172xcebea32a = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321176t == hashCode) {
                try {
                    this.f68175x5d4904c3 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseIPCallRecord", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321177u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321180d) {
            contentValues.put("phonenumber", this.f68176x5b3f2672);
        }
        if (this.f321181e) {
            contentValues.put("calltime", java.lang.Long.valueOf(this.f68173x138777d0));
        }
        if (this.f321182f) {
            contentValues.put("duration", java.lang.Long.valueOf(this.f68174xa7075739));
        }
        if (this.f321183g) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f68177x10a0fed7));
        }
        if (this.f321184h) {
            contentValues.put("addressId", java.lang.Long.valueOf(this.f68172xcebea32a));
        }
        if (this.f321185i) {
            contentValues.put("phoneType", java.lang.Integer.valueOf(this.f68175x5d4904c3));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseIPCallRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS IPCallRecord ( ");
        l75.e0 e0Var = f321178v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321170n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseIPCallRecord", "createTableSql %s", str2);
            k0Var.A("IPCallRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "IPCallRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseIPCallRecord", "updateTableSql %s", str3);
            k0Var.A("IPCallRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseIPCallRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321178v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321179w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321169m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321169m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("phonenumber")) {
            this.f68176x5b3f2672 = contentValues.getAsString("phonenumber");
            if (z17) {
                this.f321180d = true;
            }
        }
        if (contentValues.containsKey("calltime")) {
            this.f68173x138777d0 = contentValues.getAsLong("calltime").longValue();
            if (z17) {
                this.f321181e = true;
            }
        }
        if (contentValues.containsKey("duration")) {
            this.f68174xa7075739 = contentValues.getAsLong("duration").longValue();
            if (z17) {
                this.f321182f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f68177x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f321183g = true;
            }
        }
        if (contentValues.containsKey("addressId")) {
            this.f68172xcebea32a = contentValues.getAsLong("addressId").longValue();
            if (z17) {
                this.f321184h = true;
            }
        }
        if (contentValues.containsKey("phoneType")) {
            this.f68175x5d4904c3 = contentValues.getAsInteger("phoneType").intValue();
            if (z17) {
                this.f321185i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
