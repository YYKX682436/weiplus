package dm;

/* loaded from: classes7.dex */
public class w extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f322222n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f322223o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322224p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322225q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322226r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322227s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f322228t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f322229u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f322230v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f322231w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f322232x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f322233y;

    /* renamed from: field_appPath */
    public java.lang.String f68927x453e07a1;

    /* renamed from: field_commonUseInfo */
    public byte[] f68928xbb7037e5;

    /* renamed from: field_recordId */
    public int f68929xee1faef1;

    /* renamed from: field_saveIndex */
    public int f68930xa45f0850;

    /* renamed from: field_updateTime */
    public long f68931xa783a79b;

    /* renamed from: field_username */
    public java.lang.String f68932xdec927b;

    /* renamed from: field_versionType */
    public int f68933x94d24c6d;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322234d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322235e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322236f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322237g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322238h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322239i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322240m = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandCommonUseApp");
        f322222n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322223o = new java.lang.String[0];
        f322224p = -799234740;
        f322225q = -265713450;
        f322226r = 689108018;
        f322227s = -295931082;
        f322228t = 1109787242;
        f322229u = 163634517;
        f322230v = -794076698;
        f322231w = 108705909;
        f322232x = m125645x3593deb(dm.w.class);
        f322233y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125645x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "recordId";
        e0Var.f398488d.put("recordId", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "recordId";
        e0Var.f398487c[1] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT");
        e0Var.f398487c[2] = "versionType";
        e0Var.f398488d.put("versionType", "INTEGER");
        e0Var.f398487c[3] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[4] = "commonUseInfo";
        e0Var.f398488d.put("commonUseInfo", "BLOB");
        e0Var.f398487c[5] = "saveIndex";
        e0Var.f398488d.put("saveIndex", "INTEGER");
        e0Var.f398487c[6] = "appPath";
        e0Var.f398488d.put("appPath", "TEXT");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " recordId INTEGER PRIMARY KEY ,  username TEXT,  versionType INTEGER,  updateTime LONG,  commonUseInfo BLOB,  saveIndex INTEGER,  appPath TEXT";
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
            if (f322224p == hashCode) {
                try {
                    this.f68929xee1faef1 = cursor.getInt(i17);
                    this.f322234d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandCommonUseApp", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322225q == hashCode) {
                try {
                    this.f68932xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandCommonUseApp", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322226r == hashCode) {
                try {
                    this.f68933x94d24c6d = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandCommonUseApp", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322227s == hashCode) {
                try {
                    this.f68931xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandCommonUseApp", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322228t == hashCode) {
                try {
                    this.f68928xbb7037e5 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandCommonUseApp", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322229u == hashCode) {
                try {
                    this.f68930xa45f0850 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandCommonUseApp", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322230v == hashCode) {
                try {
                    this.f68927x453e07a1 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandCommonUseApp", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322231w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322234d) {
            contentValues.put("recordId", java.lang.Integer.valueOf(this.f68929xee1faef1));
        }
        if (this.f322235e) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f68932xdec927b);
        }
        if (this.f322236f) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.f68933x94d24c6d));
        }
        if (this.f322237g) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f68931xa783a79b));
        }
        if (this.f322238h) {
            contentValues.put("commonUseInfo", this.f68928xbb7037e5);
        }
        if (this.f322239i) {
            contentValues.put("saveIndex", java.lang.Integer.valueOf(this.f68930xa45f0850));
        }
        if (this.f322240m) {
            contentValues.put("appPath", this.f68927x453e07a1);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandCommonUseApp", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandCommonUseApp ( ");
        l75.e0 e0Var = f322232x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322223o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandCommonUseApp", "createTableSql %s", str2);
            k0Var.A("AppBrandCommonUseApp", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandCommonUseApp", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandCommonUseApp", "updateTableSql %s", str3);
            k0Var.A("AppBrandCommonUseApp", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandCommonUseApp", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322232x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322233y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f68929xee1faef1);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322222n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322222n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("recordId")) {
            this.f68929xee1faef1 = contentValues.getAsInteger("recordId").intValue();
            if (z17) {
                this.f322234d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f68932xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f322235e = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.f68933x94d24c6d = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f322236f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f68931xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f322237g = true;
            }
        }
        if (contentValues.containsKey("commonUseInfo")) {
            this.f68928xbb7037e5 = contentValues.getAsByteArray("commonUseInfo");
            if (z17) {
                this.f322238h = true;
            }
        }
        if (contentValues.containsKey("saveIndex")) {
            this.f68930xa45f0850 = contentValues.getAsInteger("saveIndex").intValue();
            if (z17) {
                this.f322239i = true;
            }
        }
        if (contentValues.containsKey("appPath")) {
            this.f68927x453e07a1 = contentValues.getAsString("appPath");
            if (z17) {
                this.f322240m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
