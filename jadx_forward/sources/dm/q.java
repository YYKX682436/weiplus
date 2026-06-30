package dm;

/* loaded from: classes8.dex */
public class q extends l75.f0 {
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
    public static final l75.e0 f320837J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f320838t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f320839u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320840v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320841w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f320842x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f320843y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f320844z;

    /* renamed from: field_appId */
    public java.lang.String f67987x28d45f97;

    /* renamed from: field_extInfo */
    public java.lang.String f67988x26b3182a;

    /* renamed from: field_isServerPatch */
    public boolean f67989xf72be4b6;

    /* renamed from: field_newChannelApkPath */
    public java.lang.String f67990x867b0399;

    /* renamed from: field_noticeId */
    public int f67991x7c4053b8;

    /* renamed from: field_patchPath */
    public java.lang.String f67992x7c02bf88;

    /* renamed from: field_pkgName */
    public java.lang.String f67993x55b38832;

    /* renamed from: field_scene */
    public int f67994x29cbf907;

    /* renamed from: field_ssid */
    public int f67995x2261a7a0;

    /* renamed from: field_startTime */
    public long f67996x1bb3b54a;

    /* renamed from: field_taskStatus */
    public int f67997xf2f12e3c;

    /* renamed from: field_uiarea */
    public int f67998x136fa406;

    /* renamed from: field_userSessionId */
    public java.lang.String f67999x1294bc41;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320845d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320846e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320847f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320848g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320849h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320850i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320851m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320852n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f320853o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f320854p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f320855q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f320856r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f320857s = true;

    static {
        p75.n0 n0Var = new p75.n0("ApkChannelPatchInfo");
        f320838t = n0Var;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320839u = new java.lang.String[0];
        f320840v = -517940617;
        f320841w = 2111942459;
        f320842x = -513502067;
        f320843y = -795999330;
        f320844z = 969538007;
        A = 93028124;
        B = 109254796;
        C = 3539835;
        D = -845384415;
        E = 1585269267;
        F = -1306498449;
        G = -1723169082;
        H = -2129294769;
        I = 108705909;
        f320837J = m125409x3593deb(dm.q.class);
        K = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125409x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f398487c = strArr;
        strArr[0] = "pkgName";
        e0Var.f398488d.put("pkgName", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "pkgName";
        e0Var.f398487c[1] = "isServerPatch";
        e0Var.f398488d.put("isServerPatch", "INTEGER default 'false' ");
        e0Var.f398487c[2] = "patchPath";
        e0Var.f398488d.put("patchPath", "TEXT");
        e0Var.f398487c[3] = "newChannelApkPath";
        e0Var.f398488d.put("newChannelApkPath", "TEXT");
        e0Var.f398487c[4] = "taskStatus";
        e0Var.f398488d.put("taskStatus", "INTEGER");
        e0Var.f398487c[5] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[6] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "INTEGER");
        e0Var.f398487c[7] = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f, "INTEGER");
        e0Var.f398487c[8] = "uiarea";
        e0Var.f398488d.put("uiarea", "INTEGER");
        e0Var.f398487c[9] = "noticeId";
        e0Var.f398488d.put("noticeId", "INTEGER");
        e0Var.f398487c[10] = "extInfo";
        e0Var.f398488d.put("extInfo", "TEXT");
        e0Var.f398487c[11] = "userSessionId";
        e0Var.f398488d.put("userSessionId", "TEXT");
        e0Var.f398487c[12] = "startTime";
        e0Var.f398488d.put("startTime", "LONG");
        e0Var.f398487c[13] = "rowid";
        e0Var.f398489e = " pkgName TEXT PRIMARY KEY ,  isServerPatch INTEGER default 'false' ,  patchPath TEXT,  newChannelApkPath TEXT,  taskStatus INTEGER,  appId TEXT,  scene INTEGER,  ssid INTEGER,  uiarea INTEGER,  noticeId INTEGER,  extInfo TEXT,  userSessionId TEXT,  startTime LONG";
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
            if (f320840v == hashCode) {
                try {
                    this.f67993x55b38832 = cursor.getString(i17);
                    this.f320845d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseApkChannelPatchInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320841w == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f67989xf72be4b6 = z17;
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseApkChannelPatchInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320842x == hashCode) {
                try {
                    this.f67992x7c02bf88 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseApkChannelPatchInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320843y == hashCode) {
                try {
                    this.f67990x867b0399 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseApkChannelPatchInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320844z == hashCode) {
                try {
                    this.f67997xf2f12e3c = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseApkChannelPatchInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67987x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseApkChannelPatchInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67994x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseApkChannelPatchInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f67995x2261a7a0 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseApkChannelPatchInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f67998x136fa406 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseApkChannelPatchInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f67991x7c4053b8 = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseApkChannelPatchInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f67988x26b3182a = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseApkChannelPatchInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f67999x1294bc41 = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseApkChannelPatchInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f67996x1bb3b54a = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseApkChannelPatchInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
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
        if (this.f320845d) {
            contentValues.put("pkgName", this.f67993x55b38832);
        }
        if (this.f320846e) {
            if (this.f67989xf72be4b6) {
                contentValues.put("isServerPatch", (java.lang.Integer) 1);
            } else {
                contentValues.put("isServerPatch", (java.lang.Integer) 0);
            }
        }
        if (this.f320847f) {
            contentValues.put("patchPath", this.f67992x7c02bf88);
        }
        if (this.f320848g) {
            contentValues.put("newChannelApkPath", this.f67990x867b0399);
        }
        if (this.f320849h) {
            contentValues.put("taskStatus", java.lang.Integer.valueOf(this.f67997xf2f12e3c));
        }
        if (this.f320850i) {
            contentValues.put("appId", this.f67987x28d45f97);
        }
        if (this.f320851m) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f67994x29cbf907));
        }
        if (this.f320852n) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f, java.lang.Integer.valueOf(this.f67995x2261a7a0));
        }
        if (this.f320853o) {
            contentValues.put("uiarea", java.lang.Integer.valueOf(this.f67998x136fa406));
        }
        if (this.f320854p) {
            contentValues.put("noticeId", java.lang.Integer.valueOf(this.f67991x7c4053b8));
        }
        if (this.f320855q) {
            contentValues.put("extInfo", this.f67988x26b3182a);
        }
        if (this.f320856r) {
            contentValues.put("userSessionId", this.f67999x1294bc41);
        }
        if (this.f320857s) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.f67996x1bb3b54a));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseApkChannelPatchInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ApkChannelPatchInfo ( ");
        l75.e0 e0Var = f320837J;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320839u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseApkChannelPatchInfo", "createTableSql %s", str2);
            k0Var.A("ApkChannelPatchInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ApkChannelPatchInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseApkChannelPatchInfo", "updateTableSql %s", str3);
            k0Var.A("ApkChannelPatchInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseApkChannelPatchInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320837J;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return K;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67993x55b38832;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320838t;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320838t.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("pkgName")) {
            this.f67993x55b38832 = contentValues.getAsString("pkgName");
            if (z17) {
                this.f320845d = true;
            }
        }
        if (contentValues.containsKey("isServerPatch")) {
            this.f67989xf72be4b6 = contentValues.getAsInteger("isServerPatch").intValue() != 0;
            if (z17) {
                this.f320846e = true;
            }
        }
        if (contentValues.containsKey("patchPath")) {
            this.f67992x7c02bf88 = contentValues.getAsString("patchPath");
            if (z17) {
                this.f320847f = true;
            }
        }
        if (contentValues.containsKey("newChannelApkPath")) {
            this.f67990x867b0399 = contentValues.getAsString("newChannelApkPath");
            if (z17) {
                this.f320848g = true;
            }
        }
        if (contentValues.containsKey("taskStatus")) {
            this.f67997xf2f12e3c = contentValues.getAsInteger("taskStatus").intValue();
            if (z17) {
                this.f320849h = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.f67987x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f320850i = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f67994x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f320851m = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f)) {
            this.f67995x2261a7a0 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f).intValue();
            if (z17) {
                this.f320852n = true;
            }
        }
        if (contentValues.containsKey("uiarea")) {
            this.f67998x136fa406 = contentValues.getAsInteger("uiarea").intValue();
            if (z17) {
                this.f320853o = true;
            }
        }
        if (contentValues.containsKey("noticeId")) {
            this.f67991x7c4053b8 = contentValues.getAsInteger("noticeId").intValue();
            if (z17) {
                this.f320854p = true;
            }
        }
        if (contentValues.containsKey("extInfo")) {
            this.f67988x26b3182a = contentValues.getAsString("extInfo");
            if (z17) {
                this.f320855q = true;
            }
        }
        if (contentValues.containsKey("userSessionId")) {
            this.f67999x1294bc41 = contentValues.getAsString("userSessionId");
            if (z17) {
                this.f320856r = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.f67996x1bb3b54a = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f320857s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
