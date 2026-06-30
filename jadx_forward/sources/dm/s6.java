package dm;

/* loaded from: classes4.dex */
public class s6 extends l75.f0 {
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
    public static final int f321378J;
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
    public static final int X;
    public static final int Y;
    public static final int Z;

    /* renamed from: p0, reason: collision with root package name */
    public static final l75.e0 f321379p0;

    /* renamed from: x0, reason: collision with root package name */
    public static final o75.e f321380x0;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.n0 f321381z;

    /* renamed from: field_attrBuf */
    private byte[] f68264x4c58c87d;

    /* renamed from: field_content */
    private byte[] f68265xad49e234;

    /* renamed from: field_createTime */
    private int f68266xac3be4e;

    /* renamed from: field_head */
    private int f68267x225c7205;

    /* renamed from: field_isStar */
    private int f68268xff7c1181;

    /* renamed from: field_likeFlag */
    private int f68269x5f778948;

    /* renamed from: field_localFlag */
    private int f68270x52c1d072;

    /* renamed from: field_localPrivate */
    private int f68271xa4146ebd;

    /* renamed from: field_postBuf */
    private byte[] f68272x5d40d76e;

    /* renamed from: field_pravited */
    private int f68273xcb0372e6;

    /* renamed from: field_serverExtFlag */
    private int f68274x658b81e5;

    /* renamed from: field_snsId */
    private long f68275x29d1292e;

    /* renamed from: field_sourceType */
    private int f68276x76e81a5a;

    /* renamed from: field_stringSeq */
    private java.lang.String f68277x8f55c989;

    /* renamed from: field_subType */
    private int f68278x5334f55;

    /* renamed from: field_type */
    private int f68279x2262335f;

    /* renamed from: field_userName */
    private java.lang.String f68280xdde069b;

    /* renamed from: field_withTa */
    private java.lang.String f68281x16e1d0b8;

    /* renamed from: field_withTaHasOther */
    private int f68282xdc9f896e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321382d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321383e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321384f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321385g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321386h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321387i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321388m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321389n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f321390o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f321391p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f321392q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f321393r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f321394s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f321395t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f321396u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f321397v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f321398w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f321399x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f321400y = false;

    static {
        p75.n0 n0Var = new p75.n0(dm.va.f68838xc4fe047c);
        f321381z = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        A = new p75.d("rowid", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        B = new p75.d("createTime", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        C = new p75.d("sourceType", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        D = new p75.d("stringSeq", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        E = new java.lang.String[0];
        F = 109594803;
        G = -266666762;
        H = -1205623433;
        I = 1369213417;
        f321378J = 3198432;
        K = -1746354280;
        L = 3575610;
        M = -1111431691;
        N = 1102348195;
        P = -1388287679;
        Q = -189292914;
        R = -787570221;
        S = 748883849;
        T = 951530617;
        U = -674882878;
        V = -391239245;
        W = -1868521062;
        X = -331264918;
        Y = -1180114276;
        Z = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[19];
        java.lang.String[] strArr = new java.lang.String[20];
        e0Var.f398487c = strArr;
        strArr[0] = "snsId";
        ((java.util.HashMap) e0Var.f398488d).put("snsId", "LONG");
        e0Var.f398487c[1] = "userName";
        ((java.util.HashMap) e0Var.f398488d).put("userName", "TEXT");
        e0Var.f398487c[2] = "localFlag";
        ((java.util.HashMap) e0Var.f398488d).put("localFlag", "INTEGER");
        e0Var.f398487c[3] = "createTime";
        ((java.util.HashMap) e0Var.f398488d).put("createTime", "INTEGER");
        e0Var.f398487c[4] = "head";
        ((java.util.HashMap) e0Var.f398488d).put("head", "INTEGER");
        e0Var.f398487c[5] = "localPrivate";
        ((java.util.HashMap) e0Var.f398488d).put("localPrivate", "INTEGER");
        e0Var.f398487c[6] = "type";
        ((java.util.HashMap) e0Var.f398488d).put("type", "INTEGER");
        e0Var.f398487c[7] = "sourceType";
        ((java.util.HashMap) e0Var.f398488d).put("sourceType", "INTEGER");
        e0Var.f398487c[8] = "likeFlag";
        ((java.util.HashMap) e0Var.f398488d).put("likeFlag", "INTEGER");
        e0Var.f398487c[9] = "pravited";
        ((java.util.HashMap) e0Var.f398488d).put("pravited", "INTEGER");
        e0Var.f398487c[10] = "stringSeq";
        ((java.util.HashMap) e0Var.f398488d).put("stringSeq", "TEXT");
        e0Var.f398487c[11] = dm.va.f68818xc141c572;
        ((java.util.HashMap) e0Var.f398488d).put(dm.va.f68818xc141c572, "TEXT");
        e0Var.f398487c[12] = dm.va.f68819xd812a028;
        ((java.util.HashMap) e0Var.f398488d).put(dm.va.f68819xd812a028, "INTEGER");
        e0Var.f398487c[13] = "content";
        ((java.util.HashMap) e0Var.f398488d).put("content", "BLOB");
        e0Var.f398487c[14] = "attrBuf";
        ((java.util.HashMap) e0Var.f398488d).put("attrBuf", "BLOB");
        e0Var.f398487c[15] = "postBuf";
        ((java.util.HashMap) e0Var.f398488d).put("postBuf", "BLOB");
        e0Var.f398487c[16] = "subType";
        ((java.util.HashMap) e0Var.f398488d).put("subType", "INTEGER");
        e0Var.f398487c[17] = dm.va.f68811x79bf47ab;
        ((java.util.HashMap) e0Var.f398488d).put(dm.va.f68811x79bf47ab, "INTEGER");
        e0Var.f398487c[18] = "isStar";
        ((java.util.HashMap) e0Var.f398488d).put("isStar", "INTEGER default '0' ");
        e0Var.f398487c[19] = "rowid";
        e0Var.f398489e = " snsId LONG,  userName TEXT,  localFlag INTEGER,  createTime INTEGER,  head INTEGER,  localPrivate INTEGER,  type INTEGER,  sourceType INTEGER,  likeFlag INTEGER,  pravited INTEGER,  stringSeq TEXT,  withTa TEXT,  withTaHasOther INTEGER,  content BLOB,  attrBuf BLOB,  postBuf BLOB,  subType INTEGER,  serverExtFlag INTEGER,  isStar INTEGER default '0' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f321379p0 = e0Var;
        f321380x0 = new o75.e();
    }

    public void A0(int i17) {
        this.f68271xa4146ebd = i17;
        this.f321387i = true;
    }

    public void D0(java.lang.String str) {
        this.f68281x16e1d0b8 = str;
        this.f321393r = true;
    }

    public void F0(int i17) {
        this.f68282xdc9f896e = i17;
        this.f321394s = true;
    }

    /* renamed from: compareContent */
    public boolean m125472x5c5a33d4(l75.f0 f0Var) {
        if (f0Var == null || !(f0Var instanceof dm.s6)) {
            return false;
        }
        dm.s6 s6Var = (dm.s6) f0Var;
        return n51.f.a(java.lang.Long.valueOf(this.f68275x29d1292e), java.lang.Long.valueOf(s6Var.f68275x29d1292e)) && n51.f.a(this.f68280xdde069b, s6Var.f68280xdde069b) && n51.f.a(java.lang.Integer.valueOf(this.f68270x52c1d072), java.lang.Integer.valueOf(s6Var.f68270x52c1d072)) && n51.f.a(java.lang.Integer.valueOf(this.f68266xac3be4e), java.lang.Integer.valueOf(s6Var.f68266xac3be4e)) && n51.f.a(java.lang.Integer.valueOf(this.f68267x225c7205), java.lang.Integer.valueOf(s6Var.f68267x225c7205)) && n51.f.a(java.lang.Integer.valueOf(this.f68271xa4146ebd), java.lang.Integer.valueOf(s6Var.f68271xa4146ebd)) && n51.f.a(java.lang.Integer.valueOf(this.f68279x2262335f), java.lang.Integer.valueOf(s6Var.f68279x2262335f)) && n51.f.a(java.lang.Integer.valueOf(this.f68276x76e81a5a), java.lang.Integer.valueOf(s6Var.f68276x76e81a5a)) && n51.f.a(java.lang.Integer.valueOf(this.f68269x5f778948), java.lang.Integer.valueOf(s6Var.f68269x5f778948)) && n51.f.a(java.lang.Integer.valueOf(this.f68273xcb0372e6), java.lang.Integer.valueOf(s6Var.f68273xcb0372e6)) && n51.f.a(this.f68277x8f55c989, s6Var.f68277x8f55c989) && n51.f.a(this.f68281x16e1d0b8, s6Var.f68281x16e1d0b8) && n51.f.a(java.lang.Integer.valueOf(this.f68282xdc9f896e), java.lang.Integer.valueOf(s6Var.f68282xdc9f896e)) && n51.f.a(this.f68265xad49e234, s6Var.f68265xad49e234) && n51.f.a(this.f68264x4c58c87d, s6Var.f68264x4c58c87d) && n51.f.a(this.f68272x5d40d76e, s6Var.f68272x5d40d76e) && n51.f.a(java.lang.Integer.valueOf(this.f68278x5334f55), java.lang.Integer.valueOf(s6Var.f68278x5334f55)) && n51.f.a(java.lang.Integer.valueOf(this.f68274x658b81e5), java.lang.Integer.valueOf(s6Var.f68274x658b81e5)) && n51.f.a(java.lang.Integer.valueOf(this.f68268xff7c1181), java.lang.Integer.valueOf(s6Var.f68268xff7c1181));
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
                    this.f68275x29d1292e = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f68280xdde069b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f68270x52c1d072 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f68266xac3be4e = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321378J == hashCode) {
                try {
                    this.f68267x225c7205 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f68271xa4146ebd = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (L == hashCode) {
                try {
                    this.f68279x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (M == hashCode) {
                try {
                    this.f68276x76e81a5a = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (N == hashCode) {
                try {
                    this.f68269x5f778948 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (P == hashCode) {
                try {
                    this.f68273xcb0372e6 = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (Q == hashCode) {
                try {
                    this.f68277x8f55c989 = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (R == hashCode) {
                try {
                    this.f68281x16e1d0b8 = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (S == hashCode) {
                try {
                    this.f68282xdc9f896e = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (T == hashCode) {
                try {
                    this.f68265xad49e234 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (U == hashCode) {
                try {
                    this.f68264x4c58c87d = cursor.getBlob(i17);
                } catch (java.lang.Throwable th20) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (V == hashCode) {
                try {
                    this.f68272x5d40d76e = cursor.getBlob(i17);
                } catch (java.lang.Throwable th21) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (W == hashCode) {
                try {
                    this.f68278x5334f55 = cursor.getInt(i17);
                } catch (java.lang.Throwable th22) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (X == hashCode) {
                try {
                    this.f68274x658b81e5 = cursor.getInt(i17);
                } catch (java.lang.Throwable th23) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (Y == hashCode) {
                try {
                    this.f68268xff7c1181 = cursor.getInt(i17);
                } catch (java.lang.Throwable th24) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseImproveSnsInfo", th24, "convertFrom %s", columnNames[i17]);
                    java.lang.String str19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (Z == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321382d) {
            contentValues.put("snsId", java.lang.Long.valueOf(this.f68275x29d1292e));
        }
        if (this.f321383e) {
            contentValues.put("userName", this.f68280xdde069b);
        }
        if (this.f321384f) {
            contentValues.put("localFlag", java.lang.Integer.valueOf(this.f68270x52c1d072));
        }
        if (this.f321385g) {
            contentValues.put("createTime", java.lang.Integer.valueOf(this.f68266xac3be4e));
        }
        if (this.f321386h) {
            contentValues.put("head", java.lang.Integer.valueOf(this.f68267x225c7205));
        }
        if (this.f321387i) {
            contentValues.put("localPrivate", java.lang.Integer.valueOf(this.f68271xa4146ebd));
        }
        if (this.f321388m) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f68279x2262335f));
        }
        if (this.f321389n) {
            contentValues.put("sourceType", java.lang.Integer.valueOf(this.f68276x76e81a5a));
        }
        if (this.f321390o) {
            contentValues.put("likeFlag", java.lang.Integer.valueOf(this.f68269x5f778948));
        }
        if (this.f321391p) {
            contentValues.put("pravited", java.lang.Integer.valueOf(this.f68273xcb0372e6));
        }
        if (this.f321392q) {
            contentValues.put("stringSeq", this.f68277x8f55c989);
        }
        if (this.f321393r) {
            contentValues.put(dm.va.f68818xc141c572, this.f68281x16e1d0b8);
        }
        if (this.f321394s) {
            contentValues.put(dm.va.f68819xd812a028, java.lang.Integer.valueOf(this.f68282xdc9f896e));
        }
        if (this.f321395t) {
            contentValues.put("content", this.f68265xad49e234);
        }
        if (this.f321396u) {
            contentValues.put("attrBuf", this.f68264x4c58c87d);
        }
        if (this.f321397v) {
            contentValues.put("postBuf", this.f68272x5d40d76e);
        }
        if (this.f321398w) {
            contentValues.put("subType", java.lang.Integer.valueOf(this.f68278x5334f55));
        }
        if (this.f321399x) {
            contentValues.put(dm.va.f68811x79bf47ab, java.lang.Integer.valueOf(this.f68274x658b81e5));
        }
        if (this.f321400y) {
            contentValues.put("isStar", java.lang.Integer.valueOf(this.f68268xff7c1181));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseImproveSnsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsInfo ( ");
        l75.e0 e0Var = f321379p0;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : E) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseImproveSnsInfo", "createTableSql %s", str2);
            k0Var.A(dm.va.f68838xc4fe047c, str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, dm.va.f68838xc4fe047c, k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseImproveSnsInfo", "updateTableSql %s", str3);
            k0Var.A(dm.va.f68838xc4fe047c, str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseImproveSnsInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: getCreateTime */
    public int m125473x3fdd41df() {
        return this.f68266xac3be4e;
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321379p0;
    }

    /* renamed from: getHead */
    public int m125474xfb803656() {
        return this.f68267x225c7205;
    }

    /* renamed from: getLikeFlag */
    public int m125475xbd8ebd19() {
        return this.f68269x5f778948;
    }

    /* renamed from: getLocalFlag */
    public int m125476xb79116c1() {
        return this.f68270x52c1d072;
    }

    /* renamed from: getLocalPrivate */
    public int m125477xf8db520e() {
        return this.f68271xa4146ebd;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321380x0;
    }

    /* renamed from: getPostBuf */
    public byte[] m125478x267b657d() {
        return this.f68272x5d40d76e;
    }

    /* renamed from: getPravited */
    public int m125479x291aa6b7() {
        return this.f68273xcb0372e6;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    /* renamed from: getSourceType */
    public int m125480xac019deb() {
        return this.f68276x76e81a5a;
    }

    /* renamed from: getStringSeq */
    public java.lang.String m125481xf4250fd8() {
        return this.f68277x8f55c989;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321381z;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321381z.f434209a;
    }

    /* renamed from: getType */
    public int m125482xfb85f7b0() {
        return this.f68279x2262335f;
    }

    /* renamed from: getUserName */
    public java.lang.String m125483x6bf53a6c() {
        return this.f68280xdde069b;
    }

    /* renamed from: setCreateTime */
    public void mo125484x6e018feb(int i17) {
        this.f68266xac3be4e = i17;
        this.f321385g = true;
    }

    /* renamed from: setHead */
    public void m125485x764afd62(int i17) {
        this.f68267x225c7205 = i17;
        this.f321386h = true;
    }

    /* renamed from: setLikeFlag */
    public void m125486xb8471e25(int i17) {
        this.f68269x5f778948 = i17;
        this.f321390o = true;
    }

    /* renamed from: setSnsId */
    public void m125487x53b40971(long j17) {
        this.f68275x29d1292e = j17;
        this.f321382d = true;
    }

    public android.content.ContentValues t0() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("snsId", java.lang.Long.valueOf(this.f68275x29d1292e));
        contentValues.put("userName", this.f68280xdde069b);
        contentValues.put("localFlag", java.lang.Integer.valueOf(this.f68270x52c1d072));
        contentValues.put("createTime", java.lang.Integer.valueOf(this.f68266xac3be4e));
        contentValues.put("head", java.lang.Integer.valueOf(this.f68267x225c7205));
        contentValues.put("localPrivate", java.lang.Integer.valueOf(this.f68271xa4146ebd));
        contentValues.put("type", java.lang.Integer.valueOf(this.f68279x2262335f));
        contentValues.put("sourceType", java.lang.Integer.valueOf(this.f68276x76e81a5a));
        contentValues.put("likeFlag", java.lang.Integer.valueOf(this.f68269x5f778948));
        contentValues.put("pravited", java.lang.Integer.valueOf(this.f68273xcb0372e6));
        contentValues.put("stringSeq", this.f68277x8f55c989);
        contentValues.put(dm.va.f68818xc141c572, this.f68281x16e1d0b8);
        contentValues.put(dm.va.f68819xd812a028, java.lang.Integer.valueOf(this.f68282xdc9f896e));
        contentValues.put("content", this.f68265xad49e234);
        contentValues.put("attrBuf", this.f68264x4c58c87d);
        contentValues.put("postBuf", this.f68272x5d40d76e);
        contentValues.put("subType", java.lang.Integer.valueOf(this.f68278x5334f55));
        contentValues.put(dm.va.f68811x79bf47ab, java.lang.Integer.valueOf(this.f68274x658b81e5));
        contentValues.put("isStar", java.lang.Integer.valueOf(this.f68268xff7c1181));
        long j17 = this.f72763xa3c65b86;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    public byte[] u0() {
        return this.f68264x4c58c87d;
    }

    public byte[] v0() {
        return this.f68265xad49e234;
    }

    public int w0() {
        return this.f68274x658b81e5;
    }

    public long y0() {
        return this.f68275x29d1292e;
    }

    public void z0(byte[] bArr) {
        this.f68265xad49e234 = bArr;
        this.f321395t = true;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("snsId")) {
            this.f68275x29d1292e = contentValues.getAsLong("snsId").longValue();
            if (z17) {
                this.f321382d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.f68280xdde069b = contentValues.getAsString("userName");
            if (z17) {
                this.f321383e = true;
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.f68270x52c1d072 = contentValues.getAsInteger("localFlag").intValue();
            if (z17) {
                this.f321384f = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f68266xac3be4e = contentValues.getAsInteger("createTime").intValue();
            if (z17) {
                this.f321385g = true;
            }
        }
        if (contentValues.containsKey("head")) {
            this.f68267x225c7205 = contentValues.getAsInteger("head").intValue();
            if (z17) {
                this.f321386h = true;
            }
        }
        if (contentValues.containsKey("localPrivate")) {
            this.f68271xa4146ebd = contentValues.getAsInteger("localPrivate").intValue();
            if (z17) {
                this.f321387i = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f68279x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f321388m = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.f68276x76e81a5a = contentValues.getAsInteger("sourceType").intValue();
            if (z17) {
                this.f321389n = true;
            }
        }
        if (contentValues.containsKey("likeFlag")) {
            this.f68269x5f778948 = contentValues.getAsInteger("likeFlag").intValue();
            if (z17) {
                this.f321390o = true;
            }
        }
        if (contentValues.containsKey("pravited")) {
            this.f68273xcb0372e6 = contentValues.getAsInteger("pravited").intValue();
            if (z17) {
                this.f321391p = true;
            }
        }
        if (contentValues.containsKey("stringSeq")) {
            this.f68277x8f55c989 = contentValues.getAsString("stringSeq");
            if (z17) {
                this.f321392q = true;
            }
        }
        if (contentValues.containsKey(dm.va.f68818xc141c572)) {
            this.f68281x16e1d0b8 = contentValues.getAsString(dm.va.f68818xc141c572);
            if (z17) {
                this.f321393r = true;
            }
        }
        if (contentValues.containsKey(dm.va.f68819xd812a028)) {
            this.f68282xdc9f896e = contentValues.getAsInteger(dm.va.f68819xd812a028).intValue();
            if (z17) {
                this.f321394s = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.f68265xad49e234 = contentValues.getAsByteArray("content");
            if (z17) {
                this.f321395t = true;
            }
        }
        if (contentValues.containsKey("attrBuf")) {
            this.f68264x4c58c87d = contentValues.getAsByteArray("attrBuf");
            if (z17) {
                this.f321396u = true;
            }
        }
        if (contentValues.containsKey("postBuf")) {
            this.f68272x5d40d76e = contentValues.getAsByteArray("postBuf");
            if (z17) {
                this.f321397v = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.f68278x5334f55 = contentValues.getAsInteger("subType").intValue();
            if (z17) {
                this.f321398w = true;
            }
        }
        if (contentValues.containsKey(dm.va.f68811x79bf47ab)) {
            this.f68274x658b81e5 = contentValues.getAsInteger(dm.va.f68811x79bf47ab).intValue();
            if (z17) {
                this.f321399x = true;
            }
        }
        if (contentValues.containsKey("isStar")) {
            this.f68268xff7c1181 = contentValues.getAsInteger("isStar").intValue();
            if (z17) {
                this.f321400y = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
