package dm;

/* loaded from: classes7.dex */
public class a0 extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f317057o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f317058p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317059q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317060r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317061s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317062t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317063u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317064v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317065w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317066x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317067y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f317068z;

    /* renamed from: field_appPath */
    public java.lang.String f65825x453e07a1;

    /* renamed from: field_brandId */
    public java.lang.String f65826x7cc83cbd;

    /* renamed from: field_recordId */
    public int f65827xee1faef1;

    /* renamed from: field_scene */
    public int f65828x29cbf907;

    /* renamed from: field_thirdPartyAppUsingDesc */
    public java.lang.String f65829x773b0858;

    /* renamed from: field_updateTime */
    public long f65830xa783a79b;

    /* renamed from: field_usedInThirdPartyAppRecently */
    public boolean f65831x73e938c3;

    /* renamed from: field_versionType */
    public int f65832x94d24c6d;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317069d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317070e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317071f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317072g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317073h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317074i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317075m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317076n = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandLauncherLayoutItem");
        f317057o = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317058p = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemUpdateTimeIndex ON AppBrandLauncherLayoutItem(updateTime)", "CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemSceneIndex ON AppBrandLauncherLayoutItem(scene)"};
        f317059q = -799234740;
        f317060r = 137727746;
        f317061s = 689108018;
        f317062t = -295931082;
        f317063u = 109254796;
        f317064v = 1790162568;
        f317065w = -1987034253;
        f317066x = -794076698;
        f317067y = 108705909;
        f317068z = m124777x3593deb(dm.a0.class);
        A = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124777x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "recordId";
        e0Var.f398488d.put("recordId", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "recordId";
        e0Var.f398487c[1] = "brandId";
        e0Var.f398488d.put("brandId", "TEXT");
        e0Var.f398487c[2] = "versionType";
        e0Var.f398488d.put("versionType", "INTEGER");
        e0Var.f398487c[3] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[4] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "INTEGER");
        e0Var.f398487c[5] = "usedInThirdPartyAppRecently";
        e0Var.f398488d.put("usedInThirdPartyAppRecently", "INTEGER default 'false' ");
        e0Var.f398487c[6] = "thirdPartyAppUsingDesc";
        e0Var.f398488d.put("thirdPartyAppUsingDesc", "TEXT");
        e0Var.f398487c[7] = "appPath";
        e0Var.f398488d.put("appPath", "TEXT");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " recordId INTEGER PRIMARY KEY ,  brandId TEXT,  versionType INTEGER,  updateTime LONG,  scene INTEGER,  usedInThirdPartyAppRecently INTEGER default 'false' ,  thirdPartyAppUsingDesc TEXT,  appPath TEXT";
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
            boolean z17 = true;
            if (f317059q == hashCode) {
                try {
                    this.f65827xee1faef1 = cursor.getInt(i17);
                    this.f317069d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317060r == hashCode) {
                try {
                    this.f65826x7cc83cbd = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317061s == hashCode) {
                try {
                    this.f65832x94d24c6d = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317062t == hashCode) {
                try {
                    this.f65830xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317063u == hashCode) {
                try {
                    this.f65828x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317064v == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f65831x73e938c3 = z17;
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317065w == hashCode) {
                try {
                    this.f65829x773b0858 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317066x == hashCode) {
                try {
                    this.f65825x453e07a1 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317067y == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317069d) {
            contentValues.put("recordId", java.lang.Integer.valueOf(this.f65827xee1faef1));
        }
        if (this.f317070e) {
            contentValues.put("brandId", this.f65826x7cc83cbd);
        }
        if (this.f317071f) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.f65832x94d24c6d));
        }
        if (this.f317072g) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f65830xa783a79b));
        }
        if (this.f317073h) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f65828x29cbf907));
        }
        if (this.f317074i) {
            if (this.f65831x73e938c3) {
                contentValues.put("usedInThirdPartyAppRecently", (java.lang.Integer) 1);
            } else {
                contentValues.put("usedInThirdPartyAppRecently", (java.lang.Integer) 0);
            }
        }
        if (this.f317075m) {
            contentValues.put("thirdPartyAppUsingDesc", this.f65829x773b0858);
        }
        if (this.f317076n) {
            contentValues.put("appPath", this.f65825x453e07a1);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandLauncherLayoutItem ( ");
        l75.e0 e0Var = f317068z;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317058p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", "createTableSql %s", str2);
            k0Var.A("AppBrandLauncherLayoutItem", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandLauncherLayoutItem", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", "updateTableSql %s", str3);
            k0Var.A("AppBrandLauncherLayoutItem", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandLauncherLayoutItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317068z;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f65827xee1faef1);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317057o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317057o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("recordId")) {
            this.f65827xee1faef1 = contentValues.getAsInteger("recordId").intValue();
            if (z17) {
                this.f317069d = true;
            }
        }
        if (contentValues.containsKey("brandId")) {
            this.f65826x7cc83cbd = contentValues.getAsString("brandId");
            if (z17) {
                this.f317070e = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.f65832x94d24c6d = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f317071f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f65830xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f317072g = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f65828x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f317073h = true;
            }
        }
        if (contentValues.containsKey("usedInThirdPartyAppRecently")) {
            this.f65831x73e938c3 = contentValues.getAsInteger("usedInThirdPartyAppRecently").intValue() != 0;
            if (z17) {
                this.f317074i = true;
            }
        }
        if (contentValues.containsKey("thirdPartyAppUsingDesc")) {
            this.f65829x773b0858 = contentValues.getAsString("thirdPartyAppUsingDesc");
            if (z17) {
                this.f317075m = true;
            }
        }
        if (contentValues.containsKey("appPath")) {
            this.f65825x453e07a1 = contentValues.getAsString("appPath");
            if (z17) {
                this.f317076n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
