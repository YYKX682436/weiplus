package ue3;

/* loaded from: classes7.dex */
public class a extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final l75.e0 H;
    public static final o75.e I;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.n0 f508404s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f508405t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f508406u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f508407v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f508408w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f508409x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f508410y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f508411z;

    /* renamed from: field_lastUseTime */
    public long f76956xd33ad9b9;

    /* renamed from: field_md5 */
    public java.lang.String f76957x4b6e68b9;

    /* renamed from: field_originalName */
    public java.lang.String f76958x8b97d721;

    /* renamed from: field_patchId */
    public java.lang.String f76959x4563e53e;

    /* renamed from: field_pkgId */
    public java.lang.String f76960x29a55882;

    /* renamed from: field_pkgPath */
    public java.lang.String f76961x55b471cc;

    /* renamed from: field_pkgType */
    public int f76962x55b69ce1;

    /* renamed from: field_unZipPath */
    public java.lang.String f76963x5313fd08;

    /* renamed from: field_updateTime */
    public long f76964xa783a79b;

    /* renamed from: field_url */
    public java.lang.String f76965x4b6e88aa;

    /* renamed from: field_version */
    public java.lang.String f76966x8987ca93;

    /* renamed from: field_wxaPkgPath */
    public java.lang.String f76967x680b2eb6;

    /* renamed from: d, reason: collision with root package name */
    public boolean f508412d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f508413e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f508414f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f508415g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f508416h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f508417i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f508418m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f508419n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f508420o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f508421p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f508422q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f508423r = true;

    static {
        p75.n0 n0Var = new p75.n0("MagicPkgInfo");
        f508404s = n0Var;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f508405t = new java.lang.String[0];
        f508406u = 106723335;
        f508407v = -517880815;
        f508408w = -1200238067;
        f508409x = -517738714;
        f508410y = -791595133;
        f508411z = -295931082;
        A = 351608024;
        B = 116079;
        C = 107902;
        D = 1736147326;
        E = -1360790959;
        F = 2137794556;
        G = 108705909;
        H = m167898x3593deb(ue3.a.class);
        I = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m167898x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[12];
        java.lang.String[] strArr = new java.lang.String[13];
        e0Var.f398487c = strArr;
        strArr[0] = "pkgId";
        e0Var.f398488d.put("pkgId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "pkgId";
        e0Var.f398487c[1] = "pkgPath";
        e0Var.f398488d.put("pkgPath", "TEXT");
        e0Var.f398487c[2] = "unZipPath";
        e0Var.f398488d.put("unZipPath", "TEXT");
        e0Var.f398487c[3] = "pkgType";
        e0Var.f398488d.put("pkgType", "INTEGER");
        e0Var.f398487c[4] = "patchId";
        e0Var.f398488d.put("patchId", "TEXT");
        e0Var.f398487c[5] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[6] = "version";
        e0Var.f398488d.put("version", "TEXT");
        e0Var.f398487c[7] = "url";
        e0Var.f398488d.put("url", "TEXT");
        e0Var.f398487c[8] = "md5";
        e0Var.f398488d.put("md5", "TEXT");
        e0Var.f398487c[9] = "lastUseTime";
        e0Var.f398488d.put("lastUseTime", "LONG");
        e0Var.f398487c[10] = "wxaPkgPath";
        e0Var.f398488d.put("wxaPkgPath", "TEXT");
        e0Var.f398487c[11] = "originalName";
        e0Var.f398488d.put("originalName", "TEXT");
        e0Var.f398487c[12] = "rowid";
        e0Var.f398489e = " pkgId TEXT PRIMARY KEY ,  pkgPath TEXT,  unZipPath TEXT,  pkgType INTEGER,  patchId TEXT,  updateTime LONG,  version TEXT,  url TEXT,  md5 TEXT,  lastUseTime LONG,  wxaPkgPath TEXT,  originalName TEXT";
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
            if (f508406u == hashCode) {
                try {
                    this.f76960x29a55882 = cursor.getString(i17);
                    this.f508412d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicPkgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f508407v == hashCode) {
                try {
                    this.f76961x55b471cc = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicPkgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f508408w == hashCode) {
                try {
                    this.f76963x5313fd08 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicPkgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f508409x == hashCode) {
                try {
                    this.f76962x55b69ce1 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicPkgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f508410y == hashCode) {
                try {
                    this.f76959x4563e53e = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicPkgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f508411z == hashCode) {
                try {
                    this.f76964xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicPkgInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f76966x8987ca93 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicPkgInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f76965x4b6e88aa = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicPkgInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f76957x4b6e68b9 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicPkgInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f76956xd33ad9b9 = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicPkgInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f76967x680b2eb6 = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicPkgInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f76958x8b97d721 = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicPkgInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f508412d) {
            contentValues.put("pkgId", this.f76960x29a55882);
        }
        if (this.f508413e) {
            contentValues.put("pkgPath", this.f76961x55b471cc);
        }
        if (this.f508414f) {
            contentValues.put("unZipPath", this.f76963x5313fd08);
        }
        if (this.f508415g) {
            contentValues.put("pkgType", java.lang.Integer.valueOf(this.f76962x55b69ce1));
        }
        if (this.f508416h) {
            contentValues.put("patchId", this.f76959x4563e53e);
        }
        if (this.f508417i) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f76964xa783a79b));
        }
        if (this.f508418m) {
            contentValues.put("version", this.f76966x8987ca93);
        }
        if (this.f508419n) {
            contentValues.put("url", this.f76965x4b6e88aa);
        }
        if (this.f508420o) {
            contentValues.put("md5", this.f76957x4b6e68b9);
        }
        if (this.f508421p) {
            contentValues.put("lastUseTime", java.lang.Long.valueOf(this.f76956xd33ad9b9));
        }
        if (this.f508422q) {
            contentValues.put("wxaPkgPath", this.f76967x680b2eb6);
        }
        if (this.f508423r) {
            contentValues.put("originalName", this.f76958x8b97d721);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseMagicPkgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MagicPkgInfo ( ");
        l75.e0 e0Var = H;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f508405t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMagicPkgInfo", "createTableSql %s", str2);
            k0Var.A("MagicPkgInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "MagicPkgInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMagicPkgInfo", "updateTableSql %s", str3);
            k0Var.A("MagicPkgInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMagicPkgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return H;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return I;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f76960x29a55882;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f508404s;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f508404s.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("pkgId")) {
            this.f76960x29a55882 = contentValues.getAsString("pkgId");
            if (z17) {
                this.f508412d = true;
            }
        }
        if (contentValues.containsKey("pkgPath")) {
            this.f76961x55b471cc = contentValues.getAsString("pkgPath");
            if (z17) {
                this.f508413e = true;
            }
        }
        if (contentValues.containsKey("unZipPath")) {
            this.f76963x5313fd08 = contentValues.getAsString("unZipPath");
            if (z17) {
                this.f508414f = true;
            }
        }
        if (contentValues.containsKey("pkgType")) {
            this.f76962x55b69ce1 = contentValues.getAsInteger("pkgType").intValue();
            if (z17) {
                this.f508415g = true;
            }
        }
        if (contentValues.containsKey("patchId")) {
            this.f76959x4563e53e = contentValues.getAsString("patchId");
            if (z17) {
                this.f508416h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f76964xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f508417i = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.f76966x8987ca93 = contentValues.getAsString("version");
            if (z17) {
                this.f508418m = true;
            }
        }
        if (contentValues.containsKey("url")) {
            this.f76965x4b6e88aa = contentValues.getAsString("url");
            if (z17) {
                this.f508419n = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.f76957x4b6e68b9 = contentValues.getAsString("md5");
            if (z17) {
                this.f508420o = true;
            }
        }
        if (contentValues.containsKey("lastUseTime")) {
            this.f76956xd33ad9b9 = contentValues.getAsLong("lastUseTime").longValue();
            if (z17) {
                this.f508421p = true;
            }
        }
        if (contentValues.containsKey("wxaPkgPath")) {
            this.f76967x680b2eb6 = contentValues.getAsString("wxaPkgPath");
            if (z17) {
                this.f508422q = true;
            }
        }
        if (contentValues.containsKey("originalName")) {
            this.f76958x8b97d721 = contentValues.getAsString("originalName");
            if (z17) {
                this.f508423r = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
