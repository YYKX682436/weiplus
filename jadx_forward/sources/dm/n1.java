package dm;

/* loaded from: classes12.dex */
public class n1 extends l75.f0 {
    public static final p75.d A;
    public static final p75.d B;
    public static final p75.d C;
    public static final java.lang.String[] D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f320133J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final l75.e0 U;
    public static final o75.e V;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.n0 f320134u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f320135v;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.d f320136w;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.d f320137x;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.d f320138y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f320139z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320140d = false;

    /* renamed from: field_MsgItemId */
    private java.lang.String f67624xa920854a = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f320141e = false;

    /* renamed from: field_MsgId */
    private long f67623x27bbc4d7 = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320142f = false;

    /* renamed from: field_FromUser */
    private java.lang.String f67620xd76e005a = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f320143g = false;

    /* renamed from: field_MsgType */
    private int f67625x27e347f6 = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320144h = false;

    /* renamed from: field_Status */
    private int f67628xda05eaf7 = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320145i = false;

    /* renamed from: field_TotalLen */
    private long f67629xeef4c5f6 = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320146m = false;

    /* renamed from: field_LastLen */
    private long f67622xd4fccd3a = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320147n = false;

    /* renamed from: field_ServerPriority */
    private int f67627x38f2600c = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f320148o = false;

    /* renamed from: field_ClientPriority */
    private int f67617x375a1c94 = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f320149p = false;

    /* renamed from: field_Priority */
    private int f67626xdc25e769 = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f320150q = false;

    /* renamed from: field_DownloadNow */
    private int f67619x86f83d49 = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f320151r = false;

    /* renamed from: field_CreateTime */
    private long f67618x81959a6e = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f320152s = false;

    /* renamed from: field_ClickTime */
    private long f67616x9cefd350 = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f320153t = false;

    /* renamed from: field_IsGroupMsg */
    private int f67621x1edeec51 = 0;

    static {
        p75.n0 n0Var = new p75.n0("C2CPreDownloadDBInfo");
        f320134u = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320135v = new p75.d("MsgItemId", "string", tableName, "");
        f320136w = new p75.d("MsgId", "long", tableName, "");
        f320137x = new p75.d("FromUser", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320138y = new p75.d("Status", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320139z = new p75.d("LastLen", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        A = new p75.d("Priority", "int", tableName, "");
        B = new p75.d("DownloadNow", "int", tableName, "");
        C = new p75.d("CreateTime", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        D = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS CreateTimeIndex ON C2CPreDownloadDBInfo(CreateTime)", "CREATE INDEX IF NOT EXISTS ClickTimeIndex ON C2CPreDownloadDBInfo(ClickTime)"};
        E = 243423823;
        F = 74638428;
        G = -1179978059;
        H = -1286563269;
        I = -1808614382;
        f320133J = -785269679;
        K = 1617567615;
        L = -1997150681;
        M = -2023906641;
        N = -1100816956;
        P = 456713486;
        Q = -932289015;
        R = 38905941;
        S = 1706538988;
        T = 108705909;
        U = m125325x3593deb(dm.n1.class);
        V = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125325x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[14];
        java.lang.String[] strArr = new java.lang.String[15];
        e0Var.f398487c = strArr;
        strArr[0] = "MsgItemId";
        e0Var.f398488d.put("MsgItemId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "MsgItemId";
        e0Var.f398487c[1] = "MsgId";
        e0Var.f398488d.put("MsgId", "LONG default '0' ");
        e0Var.f398487c[2] = "FromUser";
        e0Var.f398488d.put("FromUser", "TEXT default '' ");
        e0Var.f398487c[3] = "MsgType";
        e0Var.f398488d.put("MsgType", "INTEGER default '0' ");
        e0Var.f398487c[4] = "Status";
        e0Var.f398488d.put("Status", "INTEGER default '0' ");
        e0Var.f398487c[5] = "TotalLen";
        e0Var.f398488d.put("TotalLen", "LONG default '0' ");
        e0Var.f398487c[6] = "LastLen";
        e0Var.f398488d.put("LastLen", "LONG default '0' ");
        e0Var.f398487c[7] = "ServerPriority";
        e0Var.f398488d.put("ServerPriority", "INTEGER default '0' ");
        e0Var.f398487c[8] = "ClientPriority";
        e0Var.f398488d.put("ClientPriority", "INTEGER default '0' ");
        e0Var.f398487c[9] = "Priority";
        e0Var.f398488d.put("Priority", "INTEGER default '0' ");
        e0Var.f398487c[10] = "DownloadNow";
        e0Var.f398488d.put("DownloadNow", "INTEGER default '0' ");
        e0Var.f398487c[11] = "CreateTime";
        e0Var.f398488d.put("CreateTime", "LONG default '0' ");
        e0Var.f398487c[12] = "ClickTime";
        e0Var.f398488d.put("ClickTime", "LONG default '0' ");
        e0Var.f398487c[13] = "IsGroupMsg";
        e0Var.f398488d.put("IsGroupMsg", "INTEGER default '0' ");
        e0Var.f398487c[14] = "rowid";
        e0Var.f398489e = " MsgItemId TEXT PRIMARY KEY ,  MsgId LONG default '0' ,  FromUser TEXT default '' ,  MsgType INTEGER default '0' ,  Status INTEGER default '0' ,  TotalLen LONG default '0' ,  LastLen LONG default '0' ,  ServerPriority INTEGER default '0' ,  ClientPriority INTEGER default '0' ,  Priority INTEGER default '0' ,  DownloadNow INTEGER default '0' ,  CreateTime LONG default '0' ,  ClickTime LONG default '0' ,  IsGroupMsg INTEGER default '0' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        return e0Var;
    }

    public java.lang.String A0() {
        return this.f67624xa920854a;
    }

    public int D0() {
        return this.f67625x27e347f6;
    }

    public int F0() {
        return this.f67626xdc25e769;
    }

    public int G0() {
        return this.f67627x38f2600c;
    }

    public int I0() {
        return this.f67628xda05eaf7;
    }

    public long J0() {
        return this.f67629xeef4c5f6;
    }

    public void L0(long j17) {
        this.f67616x9cefd350 = j17;
        this.f320152s = true;
    }

    public void P0(int i17) {
        this.f67617x375a1c94 = i17;
        this.f320148o = true;
    }

    public void Q0(long j17) {
        this.f67618x81959a6e = j17;
        this.f320151r = true;
    }

    public void R0(int i17) {
        this.f67619x86f83d49 = i17;
        this.f320150q = true;
    }

    public void T0(java.lang.String str) {
        this.f67620xd76e005a = str;
        this.f320142f = true;
    }

    public void U0(int i17) {
        this.f67621x1edeec51 = i17;
        this.f320153t = true;
    }

    public void W0(long j17) {
        this.f67622xd4fccd3a = j17;
        this.f320146m = true;
    }

    public void Y0(java.lang.String str) {
        this.f67624xa920854a = str;
        this.f320140d = true;
    }

    public void Z0(int i17) {
        this.f67625x27e347f6 = i17;
        this.f320143g = true;
    }

    public void a1(int i17) {
        this.f67626xdc25e769 = i17;
        this.f320149p = true;
    }

    public void c1(int i17) {
        this.f67627x38f2600c = i17;
        this.f320147n = true;
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
            if (E == hashCode) {
                try {
                    this.f67624xa920854a = cursor.getString(i17);
                    this.f320140d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f67623x27bbc4d7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f67620xd76e005a = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f67625x27e347f6 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f67628xda05eaf7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320133J == hashCode) {
                try {
                    this.f67629xeef4c5f6 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f67622xd4fccd3a = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (L == hashCode) {
                try {
                    this.f67627x38f2600c = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (M == hashCode) {
                try {
                    this.f67617x375a1c94 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (N == hashCode) {
                try {
                    this.f67626xdc25e769 = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (P == hashCode) {
                try {
                    this.f67619x86f83d49 = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (Q == hashCode) {
                try {
                    this.f67618x81959a6e = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (R == hashCode) {
                try {
                    this.f67616x9cefd350 = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (S == hashCode) {
                try {
                    this.f67621x1edeec51 = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (T == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320140d) {
            contentValues.put("MsgItemId", this.f67624xa920854a);
        }
        if (this.f320141e) {
            contentValues.put("MsgId", java.lang.Long.valueOf(this.f67623x27bbc4d7));
        }
        if (this.f67620xd76e005a == null) {
            this.f67620xd76e005a = "";
        }
        if (this.f320142f) {
            contentValues.put("FromUser", this.f67620xd76e005a);
        }
        if (this.f320143g) {
            contentValues.put("MsgType", java.lang.Integer.valueOf(this.f67625x27e347f6));
        }
        if (this.f320144h) {
            contentValues.put("Status", java.lang.Integer.valueOf(this.f67628xda05eaf7));
        }
        if (this.f320145i) {
            contentValues.put("TotalLen", java.lang.Long.valueOf(this.f67629xeef4c5f6));
        }
        if (this.f320146m) {
            contentValues.put("LastLen", java.lang.Long.valueOf(this.f67622xd4fccd3a));
        }
        if (this.f320147n) {
            contentValues.put("ServerPriority", java.lang.Integer.valueOf(this.f67627x38f2600c));
        }
        if (this.f320148o) {
            contentValues.put("ClientPriority", java.lang.Integer.valueOf(this.f67617x375a1c94));
        }
        if (this.f320149p) {
            contentValues.put("Priority", java.lang.Integer.valueOf(this.f67626xdc25e769));
        }
        if (this.f320150q) {
            contentValues.put("DownloadNow", java.lang.Integer.valueOf(this.f67619x86f83d49));
        }
        if (this.f320151r) {
            contentValues.put("CreateTime", java.lang.Long.valueOf(this.f67618x81959a6e));
        }
        if (this.f320152s) {
            contentValues.put("ClickTime", java.lang.Long.valueOf(this.f67616x9cefd350));
        }
        if (this.f320153t) {
            contentValues.put("IsGroupMsg", java.lang.Integer.valueOf(this.f67621x1edeec51));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS C2CPreDownloadDBInfo ( ");
        l75.e0 e0Var = U;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : D) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", "createTableSql %s", str2);
            k0Var.A("C2CPreDownloadDBInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "C2CPreDownloadDBInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", "updateTableSql %s", str3);
            k0Var.A("C2CPreDownloadDBInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseC2CPreDownloadDBInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public void d1(int i17) {
        this.f67628xda05eaf7 = i17;
        this.f320144h = true;
    }

    public void e1(long j17) {
        this.f67629xeef4c5f6 = j17;
        this.f320145i = true;
    }

    /* renamed from: getCreateTime */
    public long m125326x3fdd41df() {
        return this.f67618x81959a6e;
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return U;
    }

    /* renamed from: getMsgId */
    public long m125327x74d37ac6() {
        return this.f67623x27bbc4d7;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return V;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67624xa920854a;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320134u;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320134u.f434209a;
    }

    /* renamed from: setMsgId */
    public void m125328x5361953a(long j17) {
        this.f67623x27bbc4d7 = j17;
        this.f320141e = true;
    }

    public long t0() {
        return this.f67616x9cefd350;
    }

    public int u0() {
        return this.f67617x375a1c94;
    }

    public int v0() {
        return this.f67619x86f83d49;
    }

    public java.lang.String w0() {
        return this.f67620xd76e005a;
    }

    public int y0() {
        return this.f67621x1edeec51;
    }

    public long z0() {
        return this.f67622xd4fccd3a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("MsgItemId")) {
            this.f67624xa920854a = contentValues.getAsString("MsgItemId");
            if (z17) {
                this.f320140d = true;
            }
        }
        if (contentValues.containsKey("MsgId")) {
            this.f67623x27bbc4d7 = contentValues.getAsLong("MsgId").longValue();
            if (z17) {
                this.f320141e = true;
            }
        }
        if (contentValues.containsKey("FromUser")) {
            this.f67620xd76e005a = contentValues.getAsString("FromUser");
            if (z17) {
                this.f320142f = true;
            }
        }
        if (contentValues.containsKey("MsgType")) {
            this.f67625x27e347f6 = contentValues.getAsInteger("MsgType").intValue();
            if (z17) {
                this.f320143g = true;
            }
        }
        if (contentValues.containsKey("Status")) {
            this.f67628xda05eaf7 = contentValues.getAsInteger("Status").intValue();
            if (z17) {
                this.f320144h = true;
            }
        }
        if (contentValues.containsKey("TotalLen")) {
            this.f67629xeef4c5f6 = contentValues.getAsLong("TotalLen").longValue();
            if (z17) {
                this.f320145i = true;
            }
        }
        if (contentValues.containsKey("LastLen")) {
            this.f67622xd4fccd3a = contentValues.getAsLong("LastLen").longValue();
            if (z17) {
                this.f320146m = true;
            }
        }
        if (contentValues.containsKey("ServerPriority")) {
            this.f67627x38f2600c = contentValues.getAsInteger("ServerPriority").intValue();
            if (z17) {
                this.f320147n = true;
            }
        }
        if (contentValues.containsKey("ClientPriority")) {
            this.f67617x375a1c94 = contentValues.getAsInteger("ClientPriority").intValue();
            if (z17) {
                this.f320148o = true;
            }
        }
        if (contentValues.containsKey("Priority")) {
            this.f67626xdc25e769 = contentValues.getAsInteger("Priority").intValue();
            if (z17) {
                this.f320149p = true;
            }
        }
        if (contentValues.containsKey("DownloadNow")) {
            this.f67619x86f83d49 = contentValues.getAsInteger("DownloadNow").intValue();
            if (z17) {
                this.f320150q = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.f67618x81959a6e = contentValues.getAsLong("CreateTime").longValue();
            if (z17) {
                this.f320151r = true;
            }
        }
        if (contentValues.containsKey("ClickTime")) {
            this.f67616x9cefd350 = contentValues.getAsLong("ClickTime").longValue();
            if (z17) {
                this.f320152s = true;
            }
        }
        if (contentValues.containsKey("IsGroupMsg")) {
            this.f67621x1edeec51 = contentValues.getAsInteger("IsGroupMsg").intValue();
            if (z17) {
                this.f320153t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
