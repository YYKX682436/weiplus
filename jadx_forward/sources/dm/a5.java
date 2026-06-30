package dm;

/* loaded from: classes8.dex */
public class a5 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final l75.e0 I;

    /* renamed from: J, reason: collision with root package name */
    public static final o75.e f317154J;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.n0 f317155s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f317156t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f317157u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317158v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317159w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317160x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317161y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f317162z;

    /* renamed from: field_aiScene */
    public long f65872x37bc22ff;

    /* renamed from: field_businessType */
    public int f65873xe412923f;

    /* renamed from: field_ctrInfo */
    public r45.vs2 f65874xb5f7102a;

    /* renamed from: field_ctrType */
    public int f65875xb5fc3ab6;

    /* renamed from: field_expiredTime */
    public long f65876x663babcd;

    /* renamed from: field_exposeInfo */
    public r45.g03 f65877xc67b9ef7;

    /* renamed from: field_revokeId */
    public java.lang.String f65878xe8897e6;

    /* renamed from: field_time */
    public long f65879x2261f6f2;

    /* renamed from: field_tipsId */
    public java.lang.String f65880x11c19d58;

    /* renamed from: field_tipsShowEntranceExtInfo */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e f65881x115e537f;

    /* renamed from: field_tips_uuid */
    public java.lang.String f65882x5364c75d;

    /* renamed from: field_username */
    public java.lang.String f65883xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317163d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317164e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317165f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317166g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317167h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317168i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317169m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317170n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f317171o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f317172p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f317173q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f317174r = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderRedDotInfo2");
        f317155s = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317156t = new p75.d("tips_uuid", "string", tableName, "");
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
        f317157u = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS Finder_RedDot_tips_uuid ON FinderRedDotInfo2(tips_uuid)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_tips_id ON FinderRedDotInfo2(tipsId)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_revoke_id ON FinderRedDotInfo2(revokeId)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_ctrType ON FinderRedDotInfo2(ctrType)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_expiredTime ON FinderRedDotInfo2(expiredTime)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_ai_scene ON FinderRedDotInfo2(aiScene)"};
        f317158v = -1194943390;
        f317159w = -873566605;
        f317160x = 1097097839;
        f317161y = 3560141;
        f317162z = -255488447;
        A = 1236302788;
        B = 1097436411;
        C = -92515438;
        D = -1020693180;
        E = -265713450;
        F = -672734438;
        G = 223636114;
        H = 108705909;
        I = m124787x3593deb(dm.a5.class);
        f317154J = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124787x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[12];
        java.lang.String[] strArr = new java.lang.String[13];
        e0Var.f398487c = strArr;
        strArr[0] = "tips_uuid";
        e0Var.f398488d.put("tips_uuid", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "tips_uuid";
        e0Var.f398487c[1] = "tipsId";
        e0Var.f398488d.put("tipsId", "TEXT");
        e0Var.f398487c[2] = "ctrInfo";
        e0Var.f398488d.put("ctrInfo", "BLOB");
        e0Var.f398487c[3] = "time";
        e0Var.f398488d.put("time", "LONG");
        e0Var.f398487c[4] = "revokeId";
        e0Var.f398488d.put("revokeId", "TEXT");
        e0Var.f398487c[5] = "tipsShowEntranceExtInfo";
        e0Var.f398488d.put("tipsShowEntranceExtInfo", "BLOB");
        e0Var.f398487c[6] = "ctrType";
        e0Var.f398488d.put("ctrType", "INTEGER");
        e0Var.f398487c[7] = "expiredTime";
        e0Var.f398488d.put("expiredTime", "LONG");
        e0Var.f398487c[8] = "aiScene";
        e0Var.f398488d.put("aiScene", "LONG");
        e0Var.f398487c[9] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT default '' ");
        e0Var.f398487c[10] = "businessType";
        e0Var.f398488d.put("businessType", "INTEGER default '0' ");
        e0Var.f398487c[11] = "exposeInfo";
        e0Var.f398488d.put("exposeInfo", "BLOB");
        e0Var.f398487c[12] = "rowid";
        e0Var.f398489e = " tips_uuid TEXT PRIMARY KEY ,  tipsId TEXT,  ctrInfo BLOB,  time LONG,  revokeId TEXT,  tipsShowEntranceExtInfo BLOB,  ctrType INTEGER,  expiredTime LONG,  aiScene LONG,  username TEXT default '' ,  businessType INTEGER default '0' ,  exposeInfo BLOB";
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
            if (f317158v == hashCode) {
                try {
                    this.f65882x5364c75d = cursor.getString(i17);
                    this.f317163d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317159w == hashCode) {
                try {
                    this.f65880x11c19d58 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317160x == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f65874xb5f7102a = (r45.vs2) new r45.vs2().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317161y == hashCode) {
                try {
                    this.f65879x2261f6f2 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317162z == hashCode) {
                try {
                    this.f65878xe8897e6 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    byte[] blob2 = cursor.getBlob(i17);
                    if (blob2 != null && blob2.length > 0) {
                        this.f65881x115e537f = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e().mo11468x92b714fd(blob2);
                    }
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f65875xb5fc3ab6 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f65876x663babcd = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f65872x37bc22ff = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f65883xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f65873xe412923f = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    byte[] blob3 = cursor.getBlob(i17);
                    if (blob3 != null && blob3.length > 0) {
                        this.f65877xc67b9ef7 = (r45.g03) new r45.g03().mo11468x92b714fd(blob3);
                    }
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderRedDotInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317163d) {
            contentValues.put("tips_uuid", this.f65882x5364c75d);
        }
        if (this.f317164e) {
            contentValues.put("tipsId", this.f65880x11c19d58);
        }
        if (this.f317165f) {
            r45.vs2 vs2Var = this.f65874xb5f7102a;
            if (vs2Var != null) {
                try {
                    contentValues.put("ctrInfo", vs2Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", e17.getMessage());
                }
            } else {
                contentValues.put("ctrInfo", (byte[]) null);
            }
        }
        if (this.f317166g) {
            contentValues.put("time", java.lang.Long.valueOf(this.f65879x2261f6f2));
        }
        if (this.f317167h) {
            contentValues.put("revokeId", this.f65878xe8897e6);
        }
        if (this.f317168i) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e c19795xce8b809e = this.f65881x115e537f;
            if (c19795xce8b809e != null) {
                try {
                    contentValues.put("tipsShowEntranceExtInfo", c19795xce8b809e.mo14344x5f01b1f6());
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", e18.getMessage());
                }
            } else {
                contentValues.put("tipsShowEntranceExtInfo", (byte[]) null);
            }
        }
        if (this.f317169m) {
            contentValues.put("ctrType", java.lang.Integer.valueOf(this.f65875xb5fc3ab6));
        }
        if (this.f317170n) {
            contentValues.put("expiredTime", java.lang.Long.valueOf(this.f65876x663babcd));
        }
        if (this.f317171o) {
            contentValues.put("aiScene", java.lang.Long.valueOf(this.f65872x37bc22ff));
        }
        if (this.f65883xdec927b == null) {
            this.f65883xdec927b = "";
        }
        if (this.f317172p) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f65883xdec927b);
        }
        if (this.f317173q) {
            contentValues.put("businessType", java.lang.Integer.valueOf(this.f65873xe412923f));
        }
        if (this.f317174r) {
            r45.g03 g03Var = this.f65877xc67b9ef7;
            if (g03Var != null) {
                try {
                    contentValues.put("exposeInfo", g03Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", e19.getMessage());
                }
            } else {
                contentValues.put("exposeInfo", (byte[]) null);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderRedDotInfo2 ( ");
        l75.e0 e0Var = I;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317157u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderRedDotInfo", "createTableSql %s", str2);
            k0Var.A("FinderRedDotInfo2", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderRedDotInfo2", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderRedDotInfo", "updateTableSql %s", str3);
            k0Var.A("FinderRedDotInfo2", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderRedDotInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return I;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317154J;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f65882x5364c75d;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317155s;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317155s.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("tips_uuid")) {
            this.f65882x5364c75d = contentValues.getAsString("tips_uuid");
            if (z17) {
                this.f317163d = true;
            }
        }
        if (contentValues.containsKey("tipsId")) {
            this.f65880x11c19d58 = contentValues.getAsString("tipsId");
            if (z17) {
                this.f317164e = true;
            }
        }
        if (contentValues.containsKey("ctrInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("ctrInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f65874xb5f7102a = (r45.vs2) new r45.vs2().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f317165f = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("time")) {
            this.f65879x2261f6f2 = contentValues.getAsLong("time").longValue();
            if (z17) {
                this.f317166g = true;
            }
        }
        if (contentValues.containsKey("revokeId")) {
            this.f65878xe8897e6 = contentValues.getAsString("revokeId");
            if (z17) {
                this.f317167h = true;
            }
        }
        if (contentValues.containsKey("tipsShowEntranceExtInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("tipsShowEntranceExtInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.f65881x115e537f = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e().mo11468x92b714fd(asByteArray2);
                    if (z17) {
                        this.f317168i = true;
                    }
                }
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", e18.getMessage());
            }
        }
        if (contentValues.containsKey("ctrType")) {
            this.f65875xb5fc3ab6 = contentValues.getAsInteger("ctrType").intValue();
            if (z17) {
                this.f317169m = true;
            }
        }
        if (contentValues.containsKey("expiredTime")) {
            this.f65876x663babcd = contentValues.getAsLong("expiredTime").longValue();
            if (z17) {
                this.f317170n = true;
            }
        }
        if (contentValues.containsKey("aiScene")) {
            this.f65872x37bc22ff = contentValues.getAsLong("aiScene").longValue();
            if (z17) {
                this.f317171o = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f65883xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f317172p = true;
            }
        }
        if (contentValues.containsKey("businessType")) {
            this.f65873xe412923f = contentValues.getAsInteger("businessType").intValue();
            if (z17) {
                this.f317173q = true;
            }
        }
        if (contentValues.containsKey("exposeInfo")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("exposeInfo");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.f65877xc67b9ef7 = (r45.g03) new r45.g03().mo11468x92b714fd(asByteArray3);
                    if (z17) {
                        this.f317174r = true;
                    }
                }
            } catch (java.io.IOException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", e19.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
