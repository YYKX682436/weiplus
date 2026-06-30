package dm;

/* loaded from: classes7.dex */
public class j7 extends l75.f0 {
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
    public static final p75.n0 f319355s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f319356t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319357u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319358v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319359w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319360x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319361y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f319362z;

    /* renamed from: field_actionsheetInfo */
    public r45.t1 f67119xd65b4ff2;

    /* renamed from: field_appId */
    public java.lang.String f67120x28d45f97;

    /* renamed from: field_appIdHash */
    public int f67121xe1fef145;

    /* renamed from: field_expiredAtTimestampSeconds */
    public long f67122x55ff97dc;

    /* renamed from: field_hostInfo */
    public r45.mc7 f67123xbd3c41b;

    /* renamed from: field_jsapiInfo */
    public r45.b10 f67124x7960ff7a;

    /* renamed from: field_launchAction */
    public r45.o54 f67125x2eee6aee;

    /* renamed from: field_opConfig */
    public java.lang.String f67126xc5c3da28;

    /* renamed from: field_openId */
    public java.lang.String f67127x996f3ea;

    /* renamed from: field_operationInfo */
    public r45.d25 f67128x7ec0d830;

    /* renamed from: field_showThirdBusiTips */
    public boolean f67129x71936746;

    /* renamed from: field_switchList */
    public r45.s54 f67130xa4705657;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319363d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319364e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319365f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319366g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319367h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319368i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319369m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319370n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f319371o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f319372p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f319373q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f319374r = true;

    static {
        p75.n0 n0Var = new p75.n0("LaunchWxaAppRespTable");
        f319355s = n0Var;
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
        f319356t = new java.lang.String[0];
        f319357u = 1197524554;
        f319358v = 93028124;
        f319359w = 583187401;
        f319360x = -557656961;
        f319361y = -300893578;
        f319362z = -2033677001;
        A = 91660981;
        B = -1476341629;
        C = -1033321759;
        D = -1010580219;
        E = -1146722485;
        F = -347528718;
        G = 108705909;
        H = m125145x3593deb(dm.j7.class);
        I = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125145x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[12];
        java.lang.String[] strArr = new java.lang.String[13];
        e0Var.f398487c = strArr;
        strArr[0] = "appIdHash";
        e0Var.f398488d.put("appIdHash", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "appIdHash";
        e0Var.f398487c[1] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[2] = "launchAction";
        e0Var.f398488d.put("launchAction", "BLOB");
        e0Var.f398487c[3] = "jsapiInfo";
        e0Var.f398488d.put("jsapiInfo", "BLOB");
        e0Var.f398487c[4] = "hostInfo";
        e0Var.f398488d.put("hostInfo", "BLOB");
        e0Var.f398487c[5] = "actionsheetInfo";
        e0Var.f398488d.put("actionsheetInfo", "BLOB");
        e0Var.f398487c[6] = "operationInfo";
        e0Var.f398488d.put("operationInfo", "BLOB");
        e0Var.f398487c[7] = "opConfig";
        e0Var.f398488d.put("opConfig", "TEXT");
        e0Var.f398487c[8] = "expiredAtTimestampSeconds";
        e0Var.f398488d.put("expiredAtTimestampSeconds", "LONG");
        e0Var.f398487c[9] = "openId";
        e0Var.f398488d.put("openId", "TEXT");
        e0Var.f398487c[10] = "showThirdBusiTips";
        e0Var.f398488d.put("showThirdBusiTips", "INTEGER default 'false' ");
        e0Var.f398487c[11] = "switchList";
        e0Var.f398488d.put("switchList", "BLOB");
        e0Var.f398487c[12] = "rowid";
        e0Var.f398489e = " appIdHash INTEGER PRIMARY KEY ,  appId TEXT,  launchAction BLOB,  jsapiInfo BLOB,  hostInfo BLOB,  actionsheetInfo BLOB,  operationInfo BLOB,  opConfig TEXT,  expiredAtTimestampSeconds LONG,  openId TEXT,  showThirdBusiTips INTEGER default 'false' ,  switchList BLOB";
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
            if (f319357u == hashCode) {
                try {
                    this.f67121xe1fef145 = cursor.getInt(i17);
                    this.f319363d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319358v == hashCode) {
                try {
                    this.f67120x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319359w == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f67125x2eee6aee = (r45.o54) new r45.o54().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319360x == hashCode) {
                try {
                    byte[] blob2 = cursor.getBlob(i17);
                    if (blob2 != null && blob2.length > 0) {
                        this.f67124x7960ff7a = (r45.b10) new r45.b10().mo11468x92b714fd(blob2);
                    }
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319361y == hashCode) {
                try {
                    byte[] blob3 = cursor.getBlob(i17);
                    if (blob3 != null && blob3.length > 0) {
                        this.f67123xbd3c41b = (r45.mc7) new r45.mc7().mo11468x92b714fd(blob3);
                    }
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319362z == hashCode) {
                try {
                    byte[] blob4 = cursor.getBlob(i17);
                    if (blob4 != null && blob4.length > 0) {
                        this.f67119xd65b4ff2 = (r45.t1) new r45.t1().mo11468x92b714fd(blob4);
                    }
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    byte[] blob5 = cursor.getBlob(i17);
                    if (blob5 != null && blob5.length > 0) {
                        this.f67128x7ec0d830 = (r45.d25) new r45.d25().mo11468x92b714fd(blob5);
                    }
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67126xc5c3da28 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f67122x55ff97dc = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f67127x996f3ea = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f67129x71936746 = z17;
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    byte[] blob6 = cursor.getBlob(i17);
                    if (blob6 != null && blob6.length > 0) {
                        this.f67130xa4705657 = (r45.s54) new r45.s54().mo11468x92b714fd(blob6);
                    }
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLaunchWxaAppRespTable", th17, "convertFrom %s", columnNames[i17]);
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
        if (this.f319363d) {
            contentValues.put("appIdHash", java.lang.Integer.valueOf(this.f67121xe1fef145));
        }
        if (this.f319364e) {
            contentValues.put("appId", this.f67120x28d45f97);
        }
        if (this.f319365f) {
            r45.o54 o54Var = this.f67125x2eee6aee;
            if (o54Var != null) {
                try {
                    contentValues.put("launchAction", o54Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e17.getMessage());
                }
            } else {
                contentValues.put("launchAction", (byte[]) null);
            }
        }
        if (this.f319366g) {
            r45.b10 b10Var = this.f67124x7960ff7a;
            if (b10Var != null) {
                try {
                    contentValues.put("jsapiInfo", b10Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e18.getMessage());
                }
            } else {
                contentValues.put("jsapiInfo", (byte[]) null);
            }
        }
        if (this.f319367h) {
            r45.mc7 mc7Var = this.f67123xbd3c41b;
            if (mc7Var != null) {
                try {
                    contentValues.put("hostInfo", mc7Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e19.getMessage());
                }
            } else {
                contentValues.put("hostInfo", (byte[]) null);
            }
        }
        if (this.f319368i) {
            r45.t1 t1Var = this.f67119xd65b4ff2;
            if (t1Var != null) {
                try {
                    contentValues.put("actionsheetInfo", t1Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e27.getMessage());
                }
            } else {
                contentValues.put("actionsheetInfo", (byte[]) null);
            }
        }
        if (this.f319369m) {
            r45.d25 d25Var = this.f67128x7ec0d830;
            if (d25Var != null) {
                try {
                    contentValues.put("operationInfo", d25Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e28.getMessage());
                }
            } else {
                contentValues.put("operationInfo", (byte[]) null);
            }
        }
        if (this.f319370n) {
            contentValues.put("opConfig", this.f67126xc5c3da28);
        }
        if (this.f319371o) {
            contentValues.put("expiredAtTimestampSeconds", java.lang.Long.valueOf(this.f67122x55ff97dc));
        }
        if (this.f319372p) {
            contentValues.put("openId", this.f67127x996f3ea);
        }
        if (this.f319373q) {
            if (this.f67129x71936746) {
                contentValues.put("showThirdBusiTips", (java.lang.Integer) 1);
            } else {
                contentValues.put("showThirdBusiTips", (java.lang.Integer) 0);
            }
        }
        if (this.f319374r) {
            r45.s54 s54Var = this.f67130xa4705657;
            if (s54Var != null) {
                try {
                    contentValues.put("switchList", s54Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e29) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e29.getMessage());
                }
            } else {
                contentValues.put("switchList", (byte[]) null);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LaunchWxaAppRespTable ( ");
        l75.e0 e0Var = H;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319356t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLaunchWxaAppRespTable", "createTableSql %s", str2);
            k0Var.A("LaunchWxaAppRespTable", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LaunchWxaAppRespTable", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLaunchWxaAppRespTable", "updateTableSql %s", str3);
            k0Var.A("LaunchWxaAppRespTable", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLaunchWxaAppRespTable", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Integer.valueOf(this.f67121xe1fef145);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319355s;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319355s.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appIdHash")) {
            this.f67121xe1fef145 = contentValues.getAsInteger("appIdHash").intValue();
            if (z17) {
                this.f319363d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.f67120x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f319364e = true;
            }
        }
        if (contentValues.containsKey("launchAction")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("launchAction");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f67125x2eee6aee = (r45.o54) new r45.o54().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f319365f = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e17.getMessage());
            }
        }
        if (contentValues.containsKey("jsapiInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("jsapiInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.f67124x7960ff7a = (r45.b10) new r45.b10().mo11468x92b714fd(asByteArray2);
                    if (z17) {
                        this.f319366g = true;
                    }
                }
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e18.getMessage());
            }
        }
        if (contentValues.containsKey("hostInfo")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("hostInfo");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.f67123xbd3c41b = (r45.mc7) new r45.mc7().mo11468x92b714fd(asByteArray3);
                    if (z17) {
                        this.f319367h = true;
                    }
                }
            } catch (java.io.IOException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e19.getMessage());
            }
        }
        if (contentValues.containsKey("actionsheetInfo")) {
            try {
                byte[] asByteArray4 = contentValues.getAsByteArray("actionsheetInfo");
                if (asByteArray4 != null && asByteArray4.length > 0) {
                    this.f67119xd65b4ff2 = (r45.t1) new r45.t1().mo11468x92b714fd(asByteArray4);
                    if (z17) {
                        this.f319368i = true;
                    }
                }
            } catch (java.io.IOException e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e27.getMessage());
            }
        }
        if (contentValues.containsKey("operationInfo")) {
            try {
                byte[] asByteArray5 = contentValues.getAsByteArray("operationInfo");
                if (asByteArray5 != null && asByteArray5.length > 0) {
                    this.f67128x7ec0d830 = (r45.d25) new r45.d25().mo11468x92b714fd(asByteArray5);
                    if (z17) {
                        this.f319369m = true;
                    }
                }
            } catch (java.io.IOException e28) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e28.getMessage());
            }
        }
        if (contentValues.containsKey("opConfig")) {
            this.f67126xc5c3da28 = contentValues.getAsString("opConfig");
            if (z17) {
                this.f319370n = true;
            }
        }
        if (contentValues.containsKey("expiredAtTimestampSeconds")) {
            this.f67122x55ff97dc = contentValues.getAsLong("expiredAtTimestampSeconds").longValue();
            if (z17) {
                this.f319371o = true;
            }
        }
        if (contentValues.containsKey("openId")) {
            this.f67127x996f3ea = contentValues.getAsString("openId");
            if (z17) {
                this.f319372p = true;
            }
        }
        if (contentValues.containsKey("showThirdBusiTips")) {
            this.f67129x71936746 = contentValues.getAsInteger("showThirdBusiTips").intValue() != 0;
            if (z17) {
                this.f319373q = true;
            }
        }
        if (contentValues.containsKey("switchList")) {
            try {
                byte[] asByteArray6 = contentValues.getAsByteArray("switchList");
                if (asByteArray6 != null && asByteArray6.length > 0) {
                    this.f67130xa4705657 = (r45.s54) new r45.s54().mo11468x92b714fd(asByteArray6);
                    if (z17) {
                        this.f319374r = true;
                    }
                }
            } catch (java.io.IOException e29) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", e29.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
