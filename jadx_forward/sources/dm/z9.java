package dm;

/* loaded from: classes4.dex */
public class z9 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f323054m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f323055n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f323056o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f323057p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f323058q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f323059r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f323060s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f323061t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f323062u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f323063v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f323064w;

    /* renamed from: field_ScanTime */
    public long f69416xec8974af;

    /* renamed from: field_funcType */
    public int f69417x70042dc3;

    /* renamed from: field_productId */
    public java.lang.String f69418x5bec8165;

    /* renamed from: field_qrcodeUrl */
    public java.lang.String f69419x873c61fc;

    /* renamed from: field_scene */
    public int f69420x29cbf907;

    /* renamed from: field_xmlContent */
    public java.lang.String f69421xcba638c7;

    /* renamed from: d, reason: collision with root package name */
    public boolean f323065d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f323066e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323067f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f323068g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f323069h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f323070i = true;

    static {
        p75.n0 n0Var = new p75.n0("ScanHistoryItem");
        f323054m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f323055n = new java.lang.String[0];
        f323056o = -1051830678;
        f323057p = 310314082;
        f323058q = -825857270;
        f323059r = 1380000798;
        f323060s = -325175551;
        f323061t = 109254796;
        f323062u = 108705909;
        f323063v = m125777x3593deb(dm.z9.class);
        f323064w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125777x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "productId";
        e0Var.f398488d.put("productId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "productId";
        e0Var.f398487c[1] = "xmlContent";
        e0Var.f398488d.put("xmlContent", "TEXT");
        e0Var.f398487c[2] = "ScanTime";
        e0Var.f398488d.put("ScanTime", "LONG");
        e0Var.f398487c[3] = "funcType";
        e0Var.f398488d.put("funcType", "INTEGER");
        e0Var.f398487c[4] = "qrcodeUrl";
        e0Var.f398488d.put("qrcodeUrl", "TEXT");
        e0Var.f398487c[5] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "INTEGER");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " productId TEXT PRIMARY KEY ,  xmlContent TEXT,  ScanTime LONG,  funcType INTEGER,  qrcodeUrl TEXT,  scene INTEGER";
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
            if (f323056o == hashCode) {
                try {
                    this.f69418x5bec8165 = cursor.getString(i17);
                    this.f323065d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanHistoryItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323057p == hashCode) {
                try {
                    this.f69421xcba638c7 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanHistoryItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323058q == hashCode) {
                try {
                    this.f69416xec8974af = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanHistoryItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323059r == hashCode) {
                try {
                    this.f69417x70042dc3 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanHistoryItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323060s == hashCode) {
                try {
                    this.f69419x873c61fc = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanHistoryItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323061t == hashCode) {
                try {
                    this.f69420x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanHistoryItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323062u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f323065d) {
            contentValues.put("productId", this.f69418x5bec8165);
        }
        if (this.f323066e) {
            contentValues.put("xmlContent", this.f69421xcba638c7);
        }
        if (this.f323067f) {
            contentValues.put("ScanTime", java.lang.Long.valueOf(this.f69416xec8974af));
        }
        if (this.f323068g) {
            contentValues.put("funcType", java.lang.Integer.valueOf(this.f69417x70042dc3));
        }
        if (this.f323069h) {
            contentValues.put("qrcodeUrl", this.f69419x873c61fc);
        }
        if (this.f323070i) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f69420x29cbf907));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseScanHistoryItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ScanHistoryItem ( ");
        l75.e0 e0Var = f323063v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f323055n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseScanHistoryItem", "createTableSql %s", str2);
            k0Var.A("ScanHistoryItem", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ScanHistoryItem", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseScanHistoryItem", "updateTableSql %s", str3);
            k0Var.A("ScanHistoryItem", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseScanHistoryItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f323063v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f323064w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69418x5bec8165;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f323054m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f323054m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("productId")) {
            this.f69418x5bec8165 = contentValues.getAsString("productId");
            if (z17) {
                this.f323065d = true;
            }
        }
        if (contentValues.containsKey("xmlContent")) {
            this.f69421xcba638c7 = contentValues.getAsString("xmlContent");
            if (z17) {
                this.f323066e = true;
            }
        }
        if (contentValues.containsKey("ScanTime")) {
            this.f69416xec8974af = contentValues.getAsLong("ScanTime").longValue();
            if (z17) {
                this.f323067f = true;
            }
        }
        if (contentValues.containsKey("funcType")) {
            this.f69417x70042dc3 = contentValues.getAsInteger("funcType").intValue();
            if (z17) {
                this.f323068g = true;
            }
        }
        if (contentValues.containsKey("qrcodeUrl")) {
            this.f69419x873c61fc = contentValues.getAsString("qrcodeUrl");
            if (z17) {
                this.f323069h = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f69420x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f323070i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
