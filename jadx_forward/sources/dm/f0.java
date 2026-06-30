package dm;

/* loaded from: classes7.dex */
public class f0 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final l75.e0 f318290J;
    public static final o75.e K;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.n0 f318291r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f318292s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f318293t;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.d f318294u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f318295v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f318296w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318297x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318298y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318299z;

    /* renamed from: field_appId */
    public java.lang.String f66466x28d45f97;

    /* renamed from: field_enterPath */
    public java.lang.String f66467x6777de18;

    /* renamed from: field_iconUrl */
    public java.lang.String f66468xd6403ff1;

    /* renamed from: field_isGuideShown */
    public boolean f66469x90d08364;

    /* renamed from: field_nickname */
    public java.lang.String f66470x21f9b213;

    /* renamed from: field_savedImgPath */
    public java.lang.String f66471x6de89926;

    /* renamed from: field_screenshotLastModified */
    public long f66472x127cb8ea;

    /* renamed from: field_screenshotMd5 */
    public java.lang.String f66473xe3a21bb3;

    /* renamed from: field_screenshotPath */
    public java.lang.String f66474x90a2b490;

    /* renamed from: field_showSourceView */
    public int f66475xccc1ea22;

    /* renamed from: field_versionType */
    public int f66476x94d24c6d;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318300d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318301e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318302f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318303g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318304h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318305i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318306m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318307n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f318308o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f318309p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f318310q = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandScreenshotInfo");
        f318291r = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318292s = new p75.d("screenshotPath", "string", tableName, "");
        f318293t = new p75.d("screenshotLastModified", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318294u = new p75.d("savedImgPath", "string", tableName, "");
        f318295v = new p75.d("isGuideShown", com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03, tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318296w = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS screenshotLastModifiedIndex ON AppBrandScreenshotInfo(screenshotLastModified)", "CREATE INDEX IF NOT EXISTS savedImgPathIndex ON AppBrandScreenshotInfo(savedImgPath)"};
        f318297x = -525976917;
        f318298y = 617739269;
        f318299z = 1784145464;
        A = 93028124;
        B = 70690926;
        C = 1638765110;
        D = -858148067;
        E = 1639770625;
        F = -2069572545;
        G = 482701373;
        H = 689108018;
        I = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[11];
        java.lang.String[] strArr = new java.lang.String[12];
        e0Var.f398487c = strArr;
        strArr[0] = "screenshotPath";
        ((java.util.HashMap) e0Var.f398488d).put("screenshotPath", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "screenshotPath";
        e0Var.f398487c[1] = "screenshotLastModified";
        ((java.util.HashMap) e0Var.f398488d).put("screenshotLastModified", "LONG");
        e0Var.f398487c[2] = "screenshotMd5";
        ((java.util.HashMap) e0Var.f398488d).put("screenshotMd5", "TEXT");
        e0Var.f398487c[3] = "appId";
        ((java.util.HashMap) e0Var.f398488d).put("appId", "TEXT");
        e0Var.f398487c[4] = "nickname";
        ((java.util.HashMap) e0Var.f398488d).put("nickname", "TEXT");
        e0Var.f398487c[5] = "iconUrl";
        ((java.util.HashMap) e0Var.f398488d).put("iconUrl", "TEXT");
        e0Var.f398487c[6] = "enterPath";
        ((java.util.HashMap) e0Var.f398488d).put("enterPath", "TEXT");
        e0Var.f398487c[7] = "savedImgPath";
        ((java.util.HashMap) e0Var.f398488d).put("savedImgPath", "TEXT");
        e0Var.f398487c[8] = "isGuideShown";
        ((java.util.HashMap) e0Var.f398488d).put("isGuideShown", "INTEGER default 'false' ");
        e0Var.f398487c[9] = "showSourceView";
        ((java.util.HashMap) e0Var.f398488d).put("showSourceView", "INTEGER default '0' ");
        e0Var.f398487c[10] = "versionType";
        ((java.util.HashMap) e0Var.f398488d).put("versionType", "INTEGER default '0' ");
        e0Var.f398487c[11] = "rowid";
        e0Var.f398489e = " screenshotPath TEXT PRIMARY KEY ,  screenshotLastModified LONG,  screenshotMd5 TEXT,  appId TEXT,  nickname TEXT,  iconUrl TEXT,  enterPath TEXT,  savedImgPath TEXT,  isGuideShown INTEGER default 'false' ,  showSourceView INTEGER default '0' ,  versionType INTEGER default '0' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f318290J = e0Var;
        K = new o75.e();
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
            if (f318297x == hashCode) {
                try {
                    this.f66474x90a2b490 = cursor.getString(i17);
                    this.f318300d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318298y == hashCode) {
                try {
                    this.f66472x127cb8ea = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318299z == hashCode) {
                try {
                    this.f66473xe3a21bb3 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f66466x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f66470x21f9b213 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f66468xd6403ff1 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f66467x6777de18 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f66471x6de89926 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f66469x90d08364 = z17;
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f66475xccc1ea22 = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f66476x94d24c6d = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandScreenshotInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318300d) {
            contentValues.put("screenshotPath", this.f66474x90a2b490);
        }
        if (this.f318301e) {
            contentValues.put("screenshotLastModified", java.lang.Long.valueOf(this.f66472x127cb8ea));
        }
        if (this.f318302f) {
            contentValues.put("screenshotMd5", this.f66473xe3a21bb3);
        }
        if (this.f318303g) {
            contentValues.put("appId", this.f66466x28d45f97);
        }
        if (this.f318304h) {
            contentValues.put("nickname", this.f66470x21f9b213);
        }
        if (this.f318305i) {
            contentValues.put("iconUrl", this.f66468xd6403ff1);
        }
        if (this.f318306m) {
            contentValues.put("enterPath", this.f66467x6777de18);
        }
        if (this.f318307n) {
            contentValues.put("savedImgPath", this.f66471x6de89926);
        }
        if (this.f318308o) {
            if (this.f66469x90d08364) {
                contentValues.put("isGuideShown", (java.lang.Integer) 1);
            } else {
                contentValues.put("isGuideShown", (java.lang.Integer) 0);
            }
        }
        if (this.f318309p) {
            contentValues.put("showSourceView", java.lang.Integer.valueOf(this.f66475xccc1ea22));
        }
        if (this.f318310q) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.f66476x94d24c6d));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandScreenshotInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandScreenshotInfo ( ");
        l75.e0 e0Var = f318290J;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318296w) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandScreenshotInfo", "createTableSql %s", str2);
            k0Var.A("AppBrandScreenshotInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandScreenshotInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandScreenshotInfo", "updateTableSql %s", str3);
            k0Var.A("AppBrandScreenshotInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandScreenshotInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318290J;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return K;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66474x90a2b490;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318291r;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318291r.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("screenshotPath")) {
            this.f66474x90a2b490 = contentValues.getAsString("screenshotPath");
            if (z17) {
                this.f318300d = true;
            }
        }
        if (contentValues.containsKey("screenshotLastModified")) {
            this.f66472x127cb8ea = contentValues.getAsLong("screenshotLastModified").longValue();
            if (z17) {
                this.f318301e = true;
            }
        }
        if (contentValues.containsKey("screenshotMd5")) {
            this.f66473xe3a21bb3 = contentValues.getAsString("screenshotMd5");
            if (z17) {
                this.f318302f = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.f66466x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f318303g = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.f66470x21f9b213 = contentValues.getAsString("nickname");
            if (z17) {
                this.f318304h = true;
            }
        }
        if (contentValues.containsKey("iconUrl")) {
            this.f66468xd6403ff1 = contentValues.getAsString("iconUrl");
            if (z17) {
                this.f318305i = true;
            }
        }
        if (contentValues.containsKey("enterPath")) {
            this.f66467x6777de18 = contentValues.getAsString("enterPath");
            if (z17) {
                this.f318306m = true;
            }
        }
        if (contentValues.containsKey("savedImgPath")) {
            this.f66471x6de89926 = contentValues.getAsString("savedImgPath");
            if (z17) {
                this.f318307n = true;
            }
        }
        if (contentValues.containsKey("isGuideShown")) {
            this.f66469x90d08364 = contentValues.getAsInteger("isGuideShown").intValue() != 0;
            if (z17) {
                this.f318308o = true;
            }
        }
        if (contentValues.containsKey("showSourceView")) {
            this.f66475xccc1ea22 = contentValues.getAsInteger("showSourceView").intValue();
            if (z17) {
                this.f318309p = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.f66476x94d24c6d = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f318310q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
