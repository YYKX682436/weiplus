package dm;

/* loaded from: classes7.dex */
public class m6 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f320010m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f320011n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320012o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320013p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320014q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320015r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320016s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320017t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320018u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f320019v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f320020w;

    /* renamed from: field_deviceId */
    public java.lang.String f67434x5fdff3b6;

    /* renamed from: field_deviceType */
    public int f67435xe7b73b15;

    /* renamed from: field_iconUrl */
    public java.lang.String f67436xd6403ff1;

    /* renamed from: field_nickName */
    public java.lang.String f67437x21eb2633;

    /* renamed from: field_productType */
    public int f67438x12d71904;

    /* renamed from: field_supportMsgTypeList */
    public java.lang.String f67439xdd8701af;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320021d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320022e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320023f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320024g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320025h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320026i = true;

    static {
        p75.n0 n0Var = new p75.n0("HardIotDeviceInfo");
        f320010m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320011n = new java.lang.String[0];
        f320012o = 1109191185;
        f320013p = 781190832;
        f320014q = 69737614;
        f320015r = 1638765110;
        f320016s = -707526070;
        f320017t = -1491615543;
        f320018u = 108705909;
        f320019v = m125224x3593deb(dm.m6.class);
        f320020w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125224x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "deviceId";
        e0Var.f398488d.put("deviceId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "deviceId";
        e0Var.f398487c[1] = "deviceType";
        e0Var.f398488d.put("deviceType", "INTEGER");
        e0Var.f398487c[2] = "nickName";
        e0Var.f398488d.put("nickName", "TEXT");
        e0Var.f398487c[3] = "iconUrl";
        e0Var.f398488d.put("iconUrl", "TEXT");
        e0Var.f398487c[4] = "supportMsgTypeList";
        e0Var.f398488d.put("supportMsgTypeList", "TEXT");
        e0Var.f398487c[5] = "productType";
        e0Var.f398488d.put("productType", "INTEGER");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " deviceId TEXT PRIMARY KEY ,  deviceType INTEGER,  nickName TEXT,  iconUrl TEXT,  supportMsgTypeList TEXT,  productType INTEGER";
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
            if (f320012o == hashCode) {
                try {
                    this.f67434x5fdff3b6 = cursor.getString(i17);
                    this.f320021d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotDeviceInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320013p == hashCode) {
                try {
                    this.f67435xe7b73b15 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotDeviceInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320014q == hashCode) {
                try {
                    this.f67437x21eb2633 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotDeviceInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320015r == hashCode) {
                try {
                    this.f67436xd6403ff1 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotDeviceInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320016s == hashCode) {
                try {
                    this.f67439xdd8701af = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotDeviceInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320017t == hashCode) {
                try {
                    this.f67438x12d71904 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardIotDeviceInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320018u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320021d) {
            contentValues.put("deviceId", this.f67434x5fdff3b6);
        }
        if (this.f320022e) {
            contentValues.put("deviceType", java.lang.Integer.valueOf(this.f67435xe7b73b15));
        }
        if (this.f320023f) {
            contentValues.put("nickName", this.f67437x21eb2633);
        }
        if (this.f320024g) {
            contentValues.put("iconUrl", this.f67436xd6403ff1);
        }
        if (this.f320025h) {
            contentValues.put("supportMsgTypeList", this.f67439xdd8701af);
        }
        if (this.f320026i) {
            contentValues.put("productType", java.lang.Integer.valueOf(this.f67438x12d71904));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseHardIotDeviceInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardIotDeviceInfo ( ");
        l75.e0 e0Var = f320019v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320011n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardIotDeviceInfo", "createTableSql %s", str2);
            k0Var.A("HardIotDeviceInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "HardIotDeviceInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardIotDeviceInfo", "updateTableSql %s", str3);
            k0Var.A("HardIotDeviceInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardIotDeviceInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320019v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320020w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67434x5fdff3b6;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320010m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320010m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("deviceId")) {
            this.f67434x5fdff3b6 = contentValues.getAsString("deviceId");
            if (z17) {
                this.f320021d = true;
            }
        }
        if (contentValues.containsKey("deviceType")) {
            this.f67435xe7b73b15 = contentValues.getAsInteger("deviceType").intValue();
            if (z17) {
                this.f320022e = true;
            }
        }
        if (contentValues.containsKey("nickName")) {
            this.f67437x21eb2633 = contentValues.getAsString("nickName");
            if (z17) {
                this.f320023f = true;
            }
        }
        if (contentValues.containsKey("iconUrl")) {
            this.f67436xd6403ff1 = contentValues.getAsString("iconUrl");
            if (z17) {
                this.f320024g = true;
            }
        }
        if (contentValues.containsKey("supportMsgTypeList")) {
            this.f67439xdd8701af = contentValues.getAsString("supportMsgTypeList");
            if (z17) {
                this.f320025h = true;
            }
        }
        if (contentValues.containsKey("productType")) {
            this.f67438x12d71904 = contentValues.getAsInteger("productType").intValue();
            if (z17) {
                this.f320026i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
