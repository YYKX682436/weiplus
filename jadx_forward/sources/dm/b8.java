package dm;

/* loaded from: classes7.dex */
public class b8 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f317413n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f317414o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317415p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317416q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317417r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317418s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317419t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317420u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317421v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317422w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f317423x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f317424y;

    /* renamed from: field_appId */
    public java.lang.String f65990x28d45f97;

    /* renamed from: field_bluetoothDeviceId */
    public java.lang.String f65991x19e082da;

    /* renamed from: field_entryPackage */
    public java.lang.String f65992x13d36e99;

    /* renamed from: field_isBlocked */
    public boolean f65993x76c8545d;

    /* renamed from: field_updateTime */
    public long f65994xa783a79b;

    /* renamed from: field_versionType */
    public int f65995x94d24c6d;

    /* renamed from: field_wechatToken */
    public java.lang.String f65996x62fb9eae;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317425d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317426e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317427f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317428g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317429h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317430i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317431m = true;

    static {
        p75.n0 n0Var = new p75.n0("MonitoredBluetoothDeviceInfoV2");
        f317413n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317414o = new java.lang.String[0];
        f317415p = 93028124;
        f317416q = 1676903135;
        f317417r = -147044749;
        f317418s = 689108018;
        f317419t = 128434036;
        f317420u = -295931082;
        f317421v = -601216670;
        f317422w = 108705909;
        f317423x = m124817x3593deb(dm.b8.class);
        f317424y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124817x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "bluetoothDeviceId";
        e0Var.f398488d.put("bluetoothDeviceId", "TEXT");
        e0Var.f398487c[2] = "wechatToken";
        e0Var.f398488d.put("wechatToken", "TEXT");
        e0Var.f398487c[3] = "versionType";
        e0Var.f398488d.put("versionType", "INTEGER");
        e0Var.f398487c[4] = "entryPackage";
        e0Var.f398488d.put("entryPackage", "TEXT");
        e0Var.f398487c[5] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[6] = "isBlocked";
        e0Var.f398488d.put("isBlocked", "INTEGER default 'false' ");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " appId TEXT,  bluetoothDeviceId TEXT,  wechatToken TEXT,  versionType INTEGER,  entryPackage TEXT,  updateTime LONG,  isBlocked INTEGER default 'false' ";
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
            if (f317415p == hashCode) {
                try {
                    this.f65990x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317416q == hashCode) {
                try {
                    this.f65991x19e082da = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317417r == hashCode) {
                try {
                    this.f65996x62fb9eae = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317418s == hashCode) {
                try {
                    this.f65995x94d24c6d = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317419t == hashCode) {
                try {
                    this.f65992x13d36e99 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317420u == hashCode) {
                try {
                    this.f65994xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317421v == hashCode) {
                try {
                    this.f65993x76c8545d = cursor.getInt(i17) != 0;
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317422w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317425d) {
            contentValues.put("appId", this.f65990x28d45f97);
        }
        if (this.f317426e) {
            contentValues.put("bluetoothDeviceId", this.f65991x19e082da);
        }
        if (this.f317427f) {
            contentValues.put("wechatToken", this.f65996x62fb9eae);
        }
        if (this.f317428g) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.f65995x94d24c6d));
        }
        if (this.f317429h) {
            contentValues.put("entryPackage", this.f65992x13d36e99);
        }
        if (this.f317430i) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f65994xa783a79b));
        }
        if (this.f317431m) {
            if (this.f65993x76c8545d) {
                contentValues.put("isBlocked", (java.lang.Integer) 1);
            } else {
                contentValues.put("isBlocked", (java.lang.Integer) 0);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MonitoredBluetoothDeviceInfoV2 ( ");
        l75.e0 e0Var = f317423x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317414o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", "createTableSql %s", str2);
            k0Var.A("MonitoredBluetoothDeviceInfoV2", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "MonitoredBluetoothDeviceInfoV2", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", "updateTableSql %s", str3);
            k0Var.A("MonitoredBluetoothDeviceInfoV2", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMonitoredBluetoothDeviceInfoV2", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317423x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317424y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317413n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317413n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f65990x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f317425d = true;
            }
        }
        if (contentValues.containsKey("bluetoothDeviceId")) {
            this.f65991x19e082da = contentValues.getAsString("bluetoothDeviceId");
            if (z17) {
                this.f317426e = true;
            }
        }
        if (contentValues.containsKey("wechatToken")) {
            this.f65996x62fb9eae = contentValues.getAsString("wechatToken");
            if (z17) {
                this.f317427f = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.f65995x94d24c6d = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f317428g = true;
            }
        }
        if (contentValues.containsKey("entryPackage")) {
            this.f65992x13d36e99 = contentValues.getAsString("entryPackage");
            if (z17) {
                this.f317429h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f65994xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f317430i = true;
            }
        }
        if (contentValues.containsKey("isBlocked")) {
            this.f65993x76c8545d = contentValues.getAsInteger("isBlocked").intValue() != 0;
            if (z17) {
                this.f317431m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
