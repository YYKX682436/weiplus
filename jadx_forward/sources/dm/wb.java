package dm;

/* loaded from: classes11.dex */
public class wb extends l75.f0 {
    public static final p75.d A;
    public static final p75.d B;
    public static final p75.d C;
    public static final p75.d D;
    public static final java.lang.String[] E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f322434J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final int U;
    public static final int V;
    public static final int W;
    public static final l75.e0 X;
    public static final o75.e Y;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.n0 f322435w;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.d f322436x;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.d f322437y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f322438z;

    /* renamed from: field_digest */
    public java.lang.String f69038xf66fcca9;

    /* renamed from: field_digestType */
    public java.lang.String f69039x6b1f5383;

    /* renamed from: field_digestUser */
    public java.lang.String f69040x6b1fb014;

    /* renamed from: field_editingMsg */
    public java.lang.String f69041x51f5672e;

    /* renamed from: field_isHello */
    public int f69042xef647383;

    /* renamed from: field_isSend */
    public int f69043xff7bdab7;

    /* renamed from: field_lastMsgID */
    public long f69044x11a0aa61;

    /* renamed from: field_placedFlag */
    public long f69045xa97e89ae;

    /* renamed from: field_readStatus */
    public int f69046x9b4f418d;

    /* renamed from: field_selfUserName */
    public java.lang.String f69047x5568d387;

    /* renamed from: field_sessionId */
    public java.lang.String f69048xbed8694c;

    /* renamed from: field_status */
    public int f69049x10a0fed7;

    /* renamed from: field_talkerUserName */
    public java.lang.String f69050x3e123854;

    /* renamed from: field_type */
    public int f69051x2262335f;

    /* renamed from: field_unReadCount */
    public int f69052xa35b5abb;

    /* renamed from: field_updateTime */
    public long f69053xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322439d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322440e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322441f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322442g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322443h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322444i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322445m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f322446n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f322447o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f322448p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f322449q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f322450r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f322451s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f322452t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f322453u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f322454v = true;

    static {
        p75.n0 n0Var = new p75.n0("W1wConversation");
        f322435w = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322436x = new p75.d(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322437y = new p75.d("selfUserName", "string", tableName, "");
        f322438z = new p75.d("unReadCount", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        A = new p75.d(dm.i4.f66874x4c6b1f55, "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        B = new p75.d("placedFlag", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        C = new p75.d("type", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        D = new p75.d("isHello", "int", tableName, "");
        E = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS W1wConversation_sessionId_index ON W1wConversation(sessionId)", "CREATE INDEX IF NOT EXISTS W1wConversation_talkerUserName_index ON W1wConversation(talkerUserName)", "CREATE INDEX IF NOT EXISTS W1wConversation_selfUserName_index ON W1wConversation(selfUserName)", "CREATE INDEX IF NOT EXISTS W1wConversation_username_status ON W1wConversation(status)", "CREATE INDEX IF NOT EXISTS W1wConversation_updateTime_index ON W1wConversation(updateTime)", "CREATE INDEX IF NOT EXISTS W1wConversation_type_index ON W1wConversation(type)", "CREATE INDEX IF NOT EXISTS W1wConversation_readStatus_index ON W1wConversation(readStatus)"};
        F = 607796817;
        G = -1911177617;
        H = 1228743778;
        I = 932971136;
        f322434J = -892481550;
        K = -295931082;
        L = -1331913276;
        M = -1309115473;
        N = -1309139170;
        P = 1996652390;
        Q = -1180128302;
        R = -262711991;
        S = -1731317047;
        T = 3575610;
        U = -500691672;
        V = 2060568008;
        W = 108705909;
        X = m125669x3593deb(dm.wb.class);
        Y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125669x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[16];
        java.lang.String[] strArr = new java.lang.String[17];
        e0Var.f398487c = strArr;
        strArr[0] = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984;
        e0Var.f398488d.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984;
        e0Var.f398487c[1] = "talkerUserName";
        e0Var.f398488d.put("talkerUserName", "TEXT default '' ");
        e0Var.f398487c[2] = "selfUserName";
        e0Var.f398488d.put("selfUserName", "TEXT default '' ");
        e0Var.f398487c[3] = "unReadCount";
        e0Var.f398488d.put("unReadCount", "INTEGER default '0' ");
        e0Var.f398487c[4] = "status";
        e0Var.f398488d.put("status", "INTEGER default '0' ");
        e0Var.f398487c[5] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[6] = "digest";
        e0Var.f398488d.put("digest", "TEXT default '' ");
        e0Var.f398487c[7] = "digestUser";
        e0Var.f398488d.put("digestUser", "TEXT default '' ");
        e0Var.f398487c[8] = "digestType";
        e0Var.f398488d.put("digestType", "TEXT default '' ");
        e0Var.f398487c[9] = "lastMsgID";
        e0Var.f398488d.put("lastMsgID", "LONG");
        e0Var.f398487c[10] = "isSend";
        e0Var.f398488d.put("isSend", "INTEGER");
        e0Var.f398487c[11] = "placedFlag";
        e0Var.f398488d.put("placedFlag", "LONG default '0' ");
        e0Var.f398487c[12] = "editingMsg";
        e0Var.f398488d.put("editingMsg", "TEXT");
        e0Var.f398487c[13] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[14] = "readStatus";
        e0Var.f398488d.put("readStatus", "INTEGER");
        e0Var.f398487c[15] = "isHello";
        e0Var.f398488d.put("isHello", "INTEGER default '0' ");
        e0Var.f398487c[16] = "rowid";
        e0Var.f398489e = " sessionId TEXT default ''  PRIMARY KEY ,  talkerUserName TEXT default '' ,  selfUserName TEXT default '' ,  unReadCount INTEGER default '0' ,  status INTEGER default '0' ,  updateTime LONG default '0' ,  digest TEXT default '' ,  digestUser TEXT default '' ,  digestType TEXT default '' ,  lastMsgID LONG,  isSend INTEGER,  placedFlag LONG default '0' ,  editingMsg TEXT,  type INTEGER,  readStatus INTEGER,  isHello INTEGER default '0' ";
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
            if (F == hashCode) {
                try {
                    this.f69048xbed8694c = cursor.getString(i17);
                    this.f322439d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f69050x3e123854 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f69047x5568d387 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f69052xa35b5abb = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322434J == hashCode) {
                try {
                    this.f69049x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f69053xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (L == hashCode) {
                try {
                    this.f69038xf66fcca9 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (M == hashCode) {
                try {
                    this.f69040x6b1fb014 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (N == hashCode) {
                try {
                    this.f69039x6b1f5383 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (P == hashCode) {
                try {
                    this.f69044x11a0aa61 = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (Q == hashCode) {
                try {
                    this.f69043xff7bdab7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (R == hashCode) {
                try {
                    this.f69045xa97e89ae = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (S == hashCode) {
                try {
                    this.f69041x51f5672e = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (T == hashCode) {
                try {
                    this.f69051x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (U == hashCode) {
                try {
                    this.f69046x9b4f418d = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (V == hashCode) {
                try {
                    this.f69042xef647383 = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wConversation", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (W == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f69048xbed8694c == null) {
            this.f69048xbed8694c = "";
        }
        if (this.f322439d) {
            contentValues.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f69048xbed8694c);
        }
        if (this.f69050x3e123854 == null) {
            this.f69050x3e123854 = "";
        }
        if (this.f322440e) {
            contentValues.put("talkerUserName", this.f69050x3e123854);
        }
        if (this.f69047x5568d387 == null) {
            this.f69047x5568d387 = "";
        }
        if (this.f322441f) {
            contentValues.put("selfUserName", this.f69047x5568d387);
        }
        if (this.f322442g) {
            contentValues.put("unReadCount", java.lang.Integer.valueOf(this.f69052xa35b5abb));
        }
        if (this.f322443h) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f69049x10a0fed7));
        }
        if (this.f322444i) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f69053xa783a79b));
        }
        if (this.f69038xf66fcca9 == null) {
            this.f69038xf66fcca9 = "";
        }
        if (this.f322445m) {
            contentValues.put("digest", this.f69038xf66fcca9);
        }
        if (this.f69040x6b1fb014 == null) {
            this.f69040x6b1fb014 = "";
        }
        if (this.f322446n) {
            contentValues.put("digestUser", this.f69040x6b1fb014);
        }
        if (this.f69039x6b1f5383 == null) {
            this.f69039x6b1f5383 = "";
        }
        if (this.f322447o) {
            contentValues.put("digestType", this.f69039x6b1f5383);
        }
        if (this.f322448p) {
            contentValues.put("lastMsgID", java.lang.Long.valueOf(this.f69044x11a0aa61));
        }
        if (this.f322449q) {
            contentValues.put("isSend", java.lang.Integer.valueOf(this.f69043xff7bdab7));
        }
        if (this.f322450r) {
            contentValues.put("placedFlag", java.lang.Long.valueOf(this.f69045xa97e89ae));
        }
        if (this.f322451s) {
            contentValues.put("editingMsg", this.f69041x51f5672e);
        }
        if (this.f322452t) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f69051x2262335f));
        }
        if (this.f322453u) {
            contentValues.put("readStatus", java.lang.Integer.valueOf(this.f69046x9b4f418d));
        }
        if (this.f322454v) {
            contentValues.put("isHello", java.lang.Integer.valueOf(this.f69042xef647383));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseW1wConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS W1wConversation ( ");
        l75.e0 e0Var = X;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : E) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseW1wConversation", "createTableSql %s", str2);
            k0Var.A("W1wConversation", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "W1wConversation", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseW1wConversation", "updateTableSql %s", str3);
            k0Var.A("W1wConversation", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseW1wConversation", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return X;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return Y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69048xbed8694c;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322435w;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322435w.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) {
            this.f69048xbed8694c = contentValues.getAsString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            if (z17) {
                this.f322439d = true;
            }
        }
        if (contentValues.containsKey("talkerUserName")) {
            this.f69050x3e123854 = contentValues.getAsString("talkerUserName");
            if (z17) {
                this.f322440e = true;
            }
        }
        if (contentValues.containsKey("selfUserName")) {
            this.f69047x5568d387 = contentValues.getAsString("selfUserName");
            if (z17) {
                this.f322441f = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.f69052xa35b5abb = contentValues.getAsInteger("unReadCount").intValue();
            if (z17) {
                this.f322442g = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f69049x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f322443h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f69053xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f322444i = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.f69038xf66fcca9 = contentValues.getAsString("digest");
            if (z17) {
                this.f322445m = true;
            }
        }
        if (contentValues.containsKey("digestUser")) {
            this.f69040x6b1fb014 = contentValues.getAsString("digestUser");
            if (z17) {
                this.f322446n = true;
            }
        }
        if (contentValues.containsKey("digestType")) {
            this.f69039x6b1f5383 = contentValues.getAsString("digestType");
            if (z17) {
                this.f322447o = true;
            }
        }
        if (contentValues.containsKey("lastMsgID")) {
            this.f69044x11a0aa61 = contentValues.getAsLong("lastMsgID").longValue();
            if (z17) {
                this.f322448p = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.f69043xff7bdab7 = contentValues.getAsInteger("isSend").intValue();
            if (z17) {
                this.f322449q = true;
            }
        }
        if (contentValues.containsKey("placedFlag")) {
            this.f69045xa97e89ae = contentValues.getAsLong("placedFlag").longValue();
            if (z17) {
                this.f322450r = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.f69041x51f5672e = contentValues.getAsString("editingMsg");
            if (z17) {
                this.f322451s = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f69051x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f322452t = true;
            }
        }
        if (contentValues.containsKey("readStatus")) {
            this.f69046x9b4f418d = contentValues.getAsInteger("readStatus").intValue();
            if (z17) {
                this.f322453u = true;
            }
        }
        if (contentValues.containsKey("isHello")) {
            this.f69042xef647383 = contentValues.getAsInteger("isHello").intValue();
            if (z17) {
                this.f322454v = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
