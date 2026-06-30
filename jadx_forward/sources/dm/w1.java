package dm;

/* loaded from: classes11.dex */
public class w1 extends l75.f0 {
    public static final java.lang.String[] A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f322250J;
    public static final int K;
    public static final int L;
    public static final l75.e0 M;
    public static final o75.e N;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f322251q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f322252r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f322253s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f322254t;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.d f322255u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f322256v;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.d f322257w;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.d f322258x;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.d f322259y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f322260z;

    /* renamed from: field_InteractiveMode */
    private int f68936xe08eb640;

    /* renamed from: field_menu */
    private java.lang.String f68937x225eb984;

    /* renamed from: field_openIMCustomInfo */
    private java.lang.String f68938x6cc8a7f2;

    /* renamed from: field_openIMDescId */
    private java.lang.String f68939x9ee61d3f;

    /* renamed from: field_openIMId */
    private java.lang.String f68940xffa9544e;

    /* renamed from: field_profileInfoDetail */
    private java.lang.String f68941x6451d523;

    /* renamed from: field_serviceAgreement */
    private java.lang.String f68942xbee8fb7a;

    /* renamed from: field_shortcutList */
    private java.lang.String f68943x45721d29;

    /* renamed from: field_toolbarFlag */
    private long f68944xd7f421c2;

    /* renamed from: field_userName */
    private java.lang.String f68945xdde069b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322261d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322262e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322263f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322264g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322265h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322266i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322267m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f322268n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f322269o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f322270p = false;

    static {
        p75.n0 n0Var = new p75.n0("ChatBotConfig");
        f322251q = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322252r = new p75.d("userName", "string", tableName, "");
        f322253s = new p75.d("menu", "string", tableName, "");
        f322254t = new p75.d("profileInfoDetail", "string", tableName, "");
        f322255u = new p75.d("serviceAgreement", "string", tableName, "");
        f322256v = new p75.d("toolbarFlag", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322257w = new p75.d("openIMId", "string", tableName, "");
        f322258x = new p75.d("openIMDescId", "string", tableName, "");
        f322259y = new p75.d("openIMCustomInfo", "string", tableName, "");
        f322260z = new p75.d("shortcutList", "string", tableName, "");
        A = new java.lang.String[0];
        B = -266666762;
        C = 3347807;
        D = -1369123544;
        E = 472082133;
        F = 1815398791;
        G = -1862536315;
        H = -505001303;
        I = -1833275878;
        f322250J = -905768115;
        K = 960916996;
        L = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f398487c = strArr;
        strArr[0] = "userName";
        ((java.util.HashMap) e0Var.f398488d).put("userName", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "userName";
        e0Var.f398487c[1] = "menu";
        ((java.util.HashMap) e0Var.f398488d).put("menu", "TEXT");
        e0Var.f398487c[2] = "profileInfoDetail";
        ((java.util.HashMap) e0Var.f398488d).put("profileInfoDetail", "TEXT");
        e0Var.f398487c[3] = "serviceAgreement";
        ((java.util.HashMap) e0Var.f398488d).put("serviceAgreement", "TEXT");
        e0Var.f398487c[4] = "toolbarFlag";
        ((java.util.HashMap) e0Var.f398488d).put("toolbarFlag", "LONG");
        e0Var.f398487c[5] = "InteractiveMode";
        ((java.util.HashMap) e0Var.f398488d).put("InteractiveMode", "INTEGER");
        e0Var.f398487c[6] = "openIMId";
        ((java.util.HashMap) e0Var.f398488d).put("openIMId", "TEXT");
        e0Var.f398487c[7] = "openIMDescId";
        ((java.util.HashMap) e0Var.f398488d).put("openIMDescId", "TEXT");
        e0Var.f398487c[8] = "openIMCustomInfo";
        ((java.util.HashMap) e0Var.f398488d).put("openIMCustomInfo", "TEXT");
        e0Var.f398487c[9] = "shortcutList";
        ((java.util.HashMap) e0Var.f398488d).put("shortcutList", "TEXT");
        e0Var.f398487c[10] = "rowid";
        e0Var.f398489e = " userName TEXT PRIMARY KEY ,  menu TEXT,  profileInfoDetail TEXT,  serviceAgreement TEXT,  toolbarFlag LONG,  InteractiveMode INTEGER,  openIMId TEXT,  openIMDescId TEXT,  openIMCustomInfo TEXT,  shortcutList TEXT";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        M = e0Var;
        N = new o75.e();
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
            if (B == hashCode) {
                try {
                    this.f68945xdde069b = cursor.getString(i17);
                    this.f322261d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatBotConfig", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f68937x225eb984 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatBotConfig", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f68941x6451d523 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatBotConfig", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f68942xbee8fb7a = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatBotConfig", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f68944xd7f421c2 = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatBotConfig", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f68936xe08eb640 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatBotConfig", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f68940xffa9544e = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatBotConfig", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f68939x9ee61d3f = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatBotConfig", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322250J == hashCode) {
                try {
                    this.f68938x6cc8a7f2 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatBotConfig", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f68943x45721d29 = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatBotConfig", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (L == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322261d) {
            contentValues.put("userName", this.f68945xdde069b);
        }
        if (this.f322262e) {
            contentValues.put("menu", this.f68937x225eb984);
        }
        if (this.f322263f) {
            contentValues.put("profileInfoDetail", this.f68941x6451d523);
        }
        if (this.f322264g) {
            contentValues.put("serviceAgreement", this.f68942xbee8fb7a);
        }
        if (this.f322265h) {
            contentValues.put("toolbarFlag", java.lang.Long.valueOf(this.f68944xd7f421c2));
        }
        if (this.f322266i) {
            contentValues.put("InteractiveMode", java.lang.Integer.valueOf(this.f68936xe08eb640));
        }
        if (this.f322267m) {
            contentValues.put("openIMId", this.f68940xffa9544e);
        }
        if (this.f322268n) {
            contentValues.put("openIMDescId", this.f68939x9ee61d3f);
        }
        if (this.f322269o) {
            contentValues.put("openIMCustomInfo", this.f68938x6cc8a7f2);
        }
        if (this.f322270p) {
            contentValues.put("shortcutList", this.f68943x45721d29);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseChatBotConfig", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ChatBotConfig ( ");
        l75.e0 e0Var = M;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : A) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChatBotConfig", "createTableSql %s", str2);
            k0Var.A("ChatBotConfig", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ChatBotConfig", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChatBotConfig", "updateTableSql %s", str3);
            k0Var.A("ChatBotConfig", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChatBotConfig", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return M;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return N;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68945xdde069b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322251q;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322251q.f434209a;
    }

    /* renamed from: setUserName */
    public void m125649x66ad9b78(java.lang.String str) {
        this.f68945xdde069b = str;
        this.f322261d = true;
    }

    public android.content.ContentValues t0() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("userName", this.f68945xdde069b);
        contentValues.put("menu", this.f68937x225eb984);
        contentValues.put("profileInfoDetail", this.f68941x6451d523);
        contentValues.put("serviceAgreement", this.f68942xbee8fb7a);
        contentValues.put("toolbarFlag", java.lang.Long.valueOf(this.f68944xd7f421c2));
        contentValues.put("InteractiveMode", java.lang.Integer.valueOf(this.f68936xe08eb640));
        contentValues.put("openIMId", this.f68940xffa9544e);
        contentValues.put("openIMDescId", this.f68939x9ee61d3f);
        contentValues.put("openIMCustomInfo", this.f68938x6cc8a7f2);
        contentValues.put("shortcutList", this.f68943x45721d29);
        long j17 = this.f72763xa3c65b86;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("userName")) {
            this.f68945xdde069b = contentValues.getAsString("userName");
            if (z17) {
                this.f322261d = true;
            }
        }
        if (contentValues.containsKey("menu")) {
            this.f68937x225eb984 = contentValues.getAsString("menu");
            if (z17) {
                this.f322262e = true;
            }
        }
        if (contentValues.containsKey("profileInfoDetail")) {
            this.f68941x6451d523 = contentValues.getAsString("profileInfoDetail");
            if (z17) {
                this.f322263f = true;
            }
        }
        if (contentValues.containsKey("serviceAgreement")) {
            this.f68942xbee8fb7a = contentValues.getAsString("serviceAgreement");
            if (z17) {
                this.f322264g = true;
            }
        }
        if (contentValues.containsKey("toolbarFlag")) {
            this.f68944xd7f421c2 = contentValues.getAsLong("toolbarFlag").longValue();
            if (z17) {
                this.f322265h = true;
            }
        }
        if (contentValues.containsKey("InteractiveMode")) {
            this.f68936xe08eb640 = contentValues.getAsInteger("InteractiveMode").intValue();
            if (z17) {
                this.f322266i = true;
            }
        }
        if (contentValues.containsKey("openIMId")) {
            this.f68940xffa9544e = contentValues.getAsString("openIMId");
            if (z17) {
                this.f322267m = true;
            }
        }
        if (contentValues.containsKey("openIMDescId")) {
            this.f68939x9ee61d3f = contentValues.getAsString("openIMDescId");
            if (z17) {
                this.f322268n = true;
            }
        }
        if (contentValues.containsKey("openIMCustomInfo")) {
            this.f68938x6cc8a7f2 = contentValues.getAsString("openIMCustomInfo");
            if (z17) {
                this.f322269o = true;
            }
        }
        if (contentValues.containsKey("shortcutList")) {
            this.f68943x45721d29 = contentValues.getAsString("shortcutList");
            if (z17) {
                this.f322270p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
