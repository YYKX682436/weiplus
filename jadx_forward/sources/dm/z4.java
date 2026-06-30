package dm;

/* loaded from: classes8.dex */
public class z4 extends l75.f0 {
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
    public static final int f322980J;
    public static final int K;
    public static final int L;
    public static final l75.e0 M;
    public static final o75.e N;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.n0 f322981u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f322982v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f322983w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f322984x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f322985y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f322986z;

    /* renamed from: field_accRedDotExpStartTime */
    public long f69351x57df10a6;

    /* renamed from: field_banCnt */
    public r45.vb4 f69352xf2980dbf;

    /* renamed from: field_businessType */
    public int f69353xe412923f;

    /* renamed from: field_businessTypeBanModel */
    public r45.pc4 f69354xc9a807b9;

    /* renamed from: field_dicPath */
    public java.lang.String f69355xd7479b7e;

    /* renamed from: field_exposeCnt */
    public r45.vb4 f69356xb3d25a00;

    /* renamed from: field_exposeCntLimit */
    public int f69357x77f6419b;

    /* renamed from: field_exposeCntStrategy */
    public int f69358x3f426193;

    /* renamed from: field_feedid */
    public long f69359xf9a0321e;

    /* renamed from: field_findTabRedDotPath */
    public java.lang.String f69360x85c9cf74;

    /* renamed from: field_freqControlId */
    public java.lang.String f69361xe125913b;

    /* renamed from: field_isBusinessTypeBanModel */
    public boolean f69362xb1b71ac3;

    /* renamed from: field_isBusinessTypeRedDot */
    public boolean f69363xa49d1fa1;

    /* renamed from: field_reportExtInfo */
    public java.lang.String f69364xf67a6016;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322987d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322988e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322989f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322990g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322991h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322992i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322993m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f322994n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f322995o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f322996p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f322997q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f322998r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f322999s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f323000t = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderRedDotFreqControl");
        f322981u = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322982v = new p75.d("freqControlId", "string", tableName, "");
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
        f322983w = new java.lang.String[0];
        f322984x = 1742429120;
        f322985y = -807612551;
        f322986z = -672734438;
        A = 422850309;
        B = -1396384038;
        C = 1622705707;
        D = 1656024515;
        E = -1112775300;
        F = -1005824546;
        G = -491303532;
        H = -939931722;
        I = -1990893160;
        f322980J = -1278409927;
        K = 2100308635;
        L = 108705909;
        M = m125731x3593deb(dm.z4.class);
        N = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125731x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[14];
        java.lang.String[] strArr = new java.lang.String[15];
        e0Var.f398487c = strArr;
        strArr[0] = "freqControlId";
        e0Var.f398488d.put("freqControlId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "freqControlId";
        e0Var.f398487c[1] = "findTabRedDotPath";
        e0Var.f398488d.put("findTabRedDotPath", "TEXT");
        e0Var.f398487c[2] = "businessType";
        e0Var.f398488d.put("businessType", "INTEGER default '0' ");
        e0Var.f398487c[3] = "exposeCnt";
        e0Var.f398488d.put("exposeCnt", "BLOB");
        e0Var.f398487c[4] = "banCnt";
        e0Var.f398488d.put("banCnt", "BLOB");
        e0Var.f398487c[5] = "accRedDotExpStartTime";
        e0Var.f398488d.put("accRedDotExpStartTime", "LONG");
        e0Var.f398487c[6] = "dicPath";
        e0Var.f398488d.put("dicPath", "TEXT");
        e0Var.f398487c[7] = "isBusinessTypeRedDot";
        e0Var.f398488d.put("isBusinessTypeRedDot", "INTEGER");
        e0Var.f398487c[8] = "isBusinessTypeBanModel";
        e0Var.f398488d.put("isBusinessTypeBanModel", "INTEGER");
        e0Var.f398487c[9] = "businessTypeBanModel";
        e0Var.f398488d.put("businessTypeBanModel", "BLOB");
        e0Var.f398487c[10] = "exposeCntLimit";
        e0Var.f398488d.put("exposeCntLimit", "INTEGER");
        e0Var.f398487c[11] = "exposeCntStrategy";
        e0Var.f398488d.put("exposeCntStrategy", "INTEGER");
        e0Var.f398487c[12] = "feedid";
        e0Var.f398488d.put("feedid", "LONG");
        e0Var.f398487c[13] = "reportExtInfo";
        e0Var.f398488d.put("reportExtInfo", "TEXT");
        e0Var.f398487c[14] = "rowid";
        e0Var.f398489e = " freqControlId TEXT PRIMARY KEY ,  findTabRedDotPath TEXT,  businessType INTEGER default '0' ,  exposeCnt BLOB,  banCnt BLOB,  accRedDotExpStartTime LONG,  dicPath TEXT,  isBusinessTypeRedDot INTEGER,  isBusinessTypeBanModel INTEGER,  businessTypeBanModel BLOB,  exposeCntLimit INTEGER,  exposeCntStrategy INTEGER,  feedid LONG,  reportExtInfo TEXT";
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
            if (f322984x == hashCode) {
                try {
                    this.f69361xe125913b = cursor.getString(i17);
                    this.f322987d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322985y == hashCode) {
                try {
                    this.f69360x85c9cf74 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322986z == hashCode) {
                try {
                    this.f69353xe412923f = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f69356xb3d25a00 = (r45.vb4) new r45.vb4().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    byte[] blob2 = cursor.getBlob(i17);
                    if (blob2 != null && blob2.length > 0) {
                        this.f69352xf2980dbf = (r45.vb4) new r45.vb4().mo11468x92b714fd(blob2);
                    }
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f69351x57df10a6 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f69355xd7479b7e = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f69363xa49d1fa1 = z17;
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f69362xb1b71ac3 = z17;
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    byte[] blob3 = cursor.getBlob(i17);
                    if (blob3 != null && blob3.length > 0) {
                        this.f69354xc9a807b9 = (r45.pc4) new r45.pc4().mo11468x92b714fd(blob3);
                    }
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f69357x77f6419b = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f69358x3f426193 = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322980J == hashCode) {
                try {
                    this.f69359xf9a0321e = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f69364xf67a6016 = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotFreqControl", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
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
        if (this.f322987d) {
            contentValues.put("freqControlId", this.f69361xe125913b);
        }
        if (this.f322988e) {
            contentValues.put("findTabRedDotPath", this.f69360x85c9cf74);
        }
        if (this.f322989f) {
            contentValues.put("businessType", java.lang.Integer.valueOf(this.f69353xe412923f));
        }
        if (this.f322990g) {
            r45.vb4 vb4Var = this.f69356xb3d25a00;
            if (vb4Var != null) {
                try {
                    contentValues.put("exposeCnt", vb4Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", e17.getMessage());
                }
            } else {
                contentValues.put("exposeCnt", (byte[]) null);
            }
        }
        if (this.f322991h) {
            r45.vb4 vb4Var2 = this.f69352xf2980dbf;
            if (vb4Var2 != null) {
                try {
                    contentValues.put("banCnt", vb4Var2.mo14344x5f01b1f6());
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", e18.getMessage());
                }
            } else {
                contentValues.put("banCnt", (byte[]) null);
            }
        }
        if (this.f322992i) {
            contentValues.put("accRedDotExpStartTime", java.lang.Long.valueOf(this.f69351x57df10a6));
        }
        if (this.f322993m) {
            contentValues.put("dicPath", this.f69355xd7479b7e);
        }
        if (this.f322994n) {
            if (this.f69363xa49d1fa1) {
                contentValues.put("isBusinessTypeRedDot", (java.lang.Integer) 1);
            } else {
                contentValues.put("isBusinessTypeRedDot", (java.lang.Integer) 0);
            }
        }
        if (this.f322995o) {
            if (this.f69362xb1b71ac3) {
                contentValues.put("isBusinessTypeBanModel", (java.lang.Integer) 1);
            } else {
                contentValues.put("isBusinessTypeBanModel", (java.lang.Integer) 0);
            }
        }
        if (this.f322996p) {
            r45.pc4 pc4Var = this.f69354xc9a807b9;
            if (pc4Var != null) {
                try {
                    contentValues.put("businessTypeBanModel", pc4Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", e19.getMessage());
                }
            } else {
                contentValues.put("businessTypeBanModel", (byte[]) null);
            }
        }
        if (this.f322997q) {
            contentValues.put("exposeCntLimit", java.lang.Integer.valueOf(this.f69357x77f6419b));
        }
        if (this.f322998r) {
            contentValues.put("exposeCntStrategy", java.lang.Integer.valueOf(this.f69358x3f426193));
        }
        if (this.f322999s) {
            contentValues.put("feedid", java.lang.Long.valueOf(this.f69359xf9a0321e));
        }
        if (this.f323000t) {
            contentValues.put("reportExtInfo", this.f69364xf67a6016);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderRedDotFreqControl ( ");
        l75.e0 e0Var = M;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322983w) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderRedDotFreqControl", "createTableSql %s", str2);
            k0Var.A("FinderRedDotFreqControl", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderRedDotFreqControl", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderRedDotFreqControl", "updateTableSql %s", str3);
            k0Var.A("FinderRedDotFreqControl", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderRedDotFreqControl", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.f69361xe125913b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322981u;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322981u.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("freqControlId")) {
            this.f69361xe125913b = contentValues.getAsString("freqControlId");
            if (z17) {
                this.f322987d = true;
            }
        }
        if (contentValues.containsKey("findTabRedDotPath")) {
            this.f69360x85c9cf74 = contentValues.getAsString("findTabRedDotPath");
            if (z17) {
                this.f322988e = true;
            }
        }
        if (contentValues.containsKey("businessType")) {
            this.f69353xe412923f = contentValues.getAsInteger("businessType").intValue();
            if (z17) {
                this.f322989f = true;
            }
        }
        if (contentValues.containsKey("exposeCnt")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("exposeCnt");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f69356xb3d25a00 = (r45.vb4) new r45.vb4().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f322990g = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", e17.getMessage());
            }
        }
        if (contentValues.containsKey("banCnt")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("banCnt");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.f69352xf2980dbf = (r45.vb4) new r45.vb4().mo11468x92b714fd(asByteArray2);
                    if (z17) {
                        this.f322991h = true;
                    }
                }
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", e18.getMessage());
            }
        }
        if (contentValues.containsKey("accRedDotExpStartTime")) {
            this.f69351x57df10a6 = contentValues.getAsLong("accRedDotExpStartTime").longValue();
            if (z17) {
                this.f322992i = true;
            }
        }
        if (contentValues.containsKey("dicPath")) {
            this.f69355xd7479b7e = contentValues.getAsString("dicPath");
            if (z17) {
                this.f322993m = true;
            }
        }
        if (contentValues.containsKey("isBusinessTypeRedDot")) {
            this.f69363xa49d1fa1 = contentValues.getAsInteger("isBusinessTypeRedDot").intValue() != 0;
            if (z17) {
                this.f322994n = true;
            }
        }
        if (contentValues.containsKey("isBusinessTypeBanModel")) {
            this.f69362xb1b71ac3 = contentValues.getAsInteger("isBusinessTypeBanModel").intValue() != 0;
            if (z17) {
                this.f322995o = true;
            }
        }
        if (contentValues.containsKey("businessTypeBanModel")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("businessTypeBanModel");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.f69354xc9a807b9 = (r45.pc4) new r45.pc4().mo11468x92b714fd(asByteArray3);
                    if (z17) {
                        this.f322996p = true;
                    }
                }
            } catch (java.io.IOException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotFreqControl", e19.getMessage());
            }
        }
        if (contentValues.containsKey("exposeCntLimit")) {
            this.f69357x77f6419b = contentValues.getAsInteger("exposeCntLimit").intValue();
            if (z17) {
                this.f322997q = true;
            }
        }
        if (contentValues.containsKey("exposeCntStrategy")) {
            this.f69358x3f426193 = contentValues.getAsInteger("exposeCntStrategy").intValue();
            if (z17) {
                this.f322998r = true;
            }
        }
        if (contentValues.containsKey("feedid")) {
            this.f69359xf9a0321e = contentValues.getAsLong("feedid").longValue();
            if (z17) {
                this.f322999s = true;
            }
        }
        if (contentValues.containsKey("reportExtInfo")) {
            this.f69364xf67a6016 = contentValues.getAsString("reportExtInfo");
            if (z17) {
                this.f323000t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
