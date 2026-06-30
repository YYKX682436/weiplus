package dm;

/* loaded from: classes4.dex */
public class aa extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f317228p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f317229q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317230r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317231s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317232t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317233u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317234v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317235w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317236x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317237y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f317238z;

    /* renamed from: field_brand */
    public java.lang.String f65911x28e32c02;

    /* renamed from: field_fromLang */
    public java.lang.String f65912xd38f425d;

    /* renamed from: field_originMD5 */
    public java.lang.String f65913x8ebc8b93;

    /* renamed from: field_originalImageAesKey */
    public java.lang.String f65914xc84b1af5;

    /* renamed from: field_originalImageFileId */
    public java.lang.String f65915xd108e39c;

    /* renamed from: field_resultFile */
    public java.lang.String f65916x970b0f9e;

    /* renamed from: field_resultImageAesKey */
    public java.lang.String f65917x195a47e9;

    /* renamed from: field_resultImageFileId */
    public java.lang.String f65918x22181090;

    /* renamed from: field_toLang */
    public java.lang.String f65919x12058dee;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317239d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317240e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317241f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317242g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317243h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317244i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317245m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317246n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f317247o = true;

    static {
        p75.n0 n0Var = new p75.n0("ScanTranslationResult");
        f317228p = n0Var;
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
        f317229q = new java.lang.String[0];
        f317230r = -199335784;
        f317231s = -572269767;
        f317232t = -1244907336;
        f317233u = -869114103;
        f317234v = 93997959;
        f317235w = -497289631;
        f317236x = -643945030;
        f317237y = 1814761621;
        f317238z = 1668106222;
        A = 108705909;
        B = m124795x3593deb(dm.aa.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124795x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "originMD5";
        e0Var.f398488d.put("originMD5", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "originMD5";
        e0Var.f398487c[1] = "resultFile";
        e0Var.f398488d.put("resultFile", "TEXT");
        e0Var.f398487c[2] = "fromLang";
        e0Var.f398488d.put("fromLang", "TEXT");
        e0Var.f398487c[3] = "toLang";
        e0Var.f398488d.put("toLang", "TEXT");
        e0Var.f398487c[4] = "brand";
        e0Var.f398488d.put("brand", "TEXT");
        e0Var.f398487c[5] = "originalImageFileId";
        e0Var.f398488d.put("originalImageFileId", "TEXT");
        e0Var.f398487c[6] = "originalImageAesKey";
        e0Var.f398488d.put("originalImageAesKey", "TEXT");
        e0Var.f398487c[7] = "resultImageFileId";
        e0Var.f398488d.put("resultImageFileId", "TEXT");
        e0Var.f398487c[8] = "resultImageAesKey";
        e0Var.f398488d.put("resultImageAesKey", "TEXT");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " originMD5 TEXT PRIMARY KEY ,  resultFile TEXT,  fromLang TEXT,  toLang TEXT,  brand TEXT,  originalImageFileId TEXT,  originalImageAesKey TEXT,  resultImageFileId TEXT,  resultImageAesKey TEXT";
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
            if (f317230r == hashCode) {
                try {
                    this.f65913x8ebc8b93 = cursor.getString(i17);
                    this.f317239d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanTranslationResult", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317231s == hashCode) {
                try {
                    this.f65916x970b0f9e = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanTranslationResult", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317232t == hashCode) {
                try {
                    this.f65912xd38f425d = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanTranslationResult", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317233u == hashCode) {
                try {
                    this.f65919x12058dee = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanTranslationResult", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317234v == hashCode) {
                try {
                    this.f65911x28e32c02 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanTranslationResult", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317235w == hashCode) {
                try {
                    this.f65915xd108e39c = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanTranslationResult", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317236x == hashCode) {
                try {
                    this.f65914xc84b1af5 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanTranslationResult", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317237y == hashCode) {
                try {
                    this.f65918x22181090 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanTranslationResult", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317238z == hashCode) {
                try {
                    this.f65917x195a47e9 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseScanTranslationResult", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317239d) {
            contentValues.put("originMD5", this.f65913x8ebc8b93);
        }
        if (this.f317240e) {
            contentValues.put("resultFile", this.f65916x970b0f9e);
        }
        if (this.f317241f) {
            contentValues.put("fromLang", this.f65912xd38f425d);
        }
        if (this.f317242g) {
            contentValues.put("toLang", this.f65919x12058dee);
        }
        if (this.f317243h) {
            contentValues.put("brand", this.f65911x28e32c02);
        }
        if (this.f317244i) {
            contentValues.put("originalImageFileId", this.f65915xd108e39c);
        }
        if (this.f317245m) {
            contentValues.put("originalImageAesKey", this.f65914xc84b1af5);
        }
        if (this.f317246n) {
            contentValues.put("resultImageFileId", this.f65918x22181090);
        }
        if (this.f317247o) {
            contentValues.put("resultImageAesKey", this.f65917x195a47e9);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseScanTranslationResult", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ScanTranslationResult ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317229q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseScanTranslationResult", "createTableSql %s", str2);
            k0Var.A("ScanTranslationResult", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ScanTranslationResult", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseScanTranslationResult", "updateTableSql %s", str3);
            k0Var.A("ScanTranslationResult", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseScanTranslationResult", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return B;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return C;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f65913x8ebc8b93;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317228p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317228p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("originMD5")) {
            this.f65913x8ebc8b93 = contentValues.getAsString("originMD5");
            if (z17) {
                this.f317239d = true;
            }
        }
        if (contentValues.containsKey("resultFile")) {
            this.f65916x970b0f9e = contentValues.getAsString("resultFile");
            if (z17) {
                this.f317240e = true;
            }
        }
        if (contentValues.containsKey("fromLang")) {
            this.f65912xd38f425d = contentValues.getAsString("fromLang");
            if (z17) {
                this.f317241f = true;
            }
        }
        if (contentValues.containsKey("toLang")) {
            this.f65919x12058dee = contentValues.getAsString("toLang");
            if (z17) {
                this.f317242g = true;
            }
        }
        if (contentValues.containsKey("brand")) {
            this.f65911x28e32c02 = contentValues.getAsString("brand");
            if (z17) {
                this.f317243h = true;
            }
        }
        if (contentValues.containsKey("originalImageFileId")) {
            this.f65915xd108e39c = contentValues.getAsString("originalImageFileId");
            if (z17) {
                this.f317244i = true;
            }
        }
        if (contentValues.containsKey("originalImageAesKey")) {
            this.f65914xc84b1af5 = contentValues.getAsString("originalImageAesKey");
            if (z17) {
                this.f317245m = true;
            }
        }
        if (contentValues.containsKey("resultImageFileId")) {
            this.f65918x22181090 = contentValues.getAsString("resultImageFileId");
            if (z17) {
                this.f317246n = true;
            }
        }
        if (contentValues.containsKey("resultImageAesKey")) {
            this.f65917x195a47e9 = contentValues.getAsString("resultImageAesKey");
            if (z17) {
                this.f317247o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
