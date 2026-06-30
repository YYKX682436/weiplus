package dm;

/* loaded from: classes14.dex */
public class sb extends l75.f0 {
    public static final p75.d A;
    public static final p75.d B;
    public static final p75.d C;
    public static final p75.d D;
    public static final p75.d E;
    public static final java.lang.String[] F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f321460J;
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
    public static final l75.e0 f321461p0;

    /* renamed from: x0, reason: collision with root package name */
    public static final o75.e f321462x0;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.n0 f321463y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f321464z;

    /* renamed from: field_abort_backend_informed */
    private int f68335xaeaff127;

    /* renamed from: field_aliveTimestamp */
    private long f68336x8948c0ae;

    /* renamed from: field_bubbleMsgTimestamp */
    private long f68337x3fb918a6;

    /* renamed from: field_connectedTimestamp */
    private long f68338xa0aaf72;

    /* renamed from: field_id */
    private long f68339xc8a07680;

    /* renamed from: field_identity */
    private java.lang.String f68340x15ab7a63;

    /* renamed from: field_inviteTimestamp */
    private long f68341xa375b6c8;

    /* renamed from: field_inviteid */
    private long f68342x4365a789;

    /* renamed from: field_mainRecord */
    private int f68343xd24ea3cf;

    /* renamed from: field_msgType */
    private int f68344xc4aab016;

    /* renamed from: field_msgid */
    private long f68345x297eb8d7;

    /* renamed from: field_outCall */
    private int f68346x328ff487;

    /* renamed from: field_recallTipsTimestamp */
    private long f68347xb4d4be68;

    /* renamed from: field_room_state */
    private int f68348x4d88c92;

    /* renamed from: field_room_type */
    private int f68349x5aff4319;

    /* renamed from: field_roomid */
    private long f68350xeabf21b;

    /* renamed from: field_roomkey */
    private long f68351xc6d2595f;

    /* renamed from: field_talkerName */
    private java.lang.String f68352x3a5b14e9;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321465d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321466e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321467f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321468g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321469h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321470i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321471m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321472n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f321473o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f321474p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f321475q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f321476r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f321477s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f321478t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f321479u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f321480v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f321481w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f321482x = false;

    static {
        p75.n0 n0Var = new p75.n0("BubbleInfo");
        f321463y = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321464z = new p75.d("roomid", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        A = new p75.d("inviteid", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        B = new p75.d("msgid", "long", tableName, "");
        C = new p75.d("room_state", "int", tableName, "");
        D = new p75.d("abort_backend_informed", "int", tableName, "");
        E = new p75.d("inviteTimestamp", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        F = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS roomid ON BubbleInfo(roomid)", "CREATE INDEX IF NOT EXISTS inviteid ON BubbleInfo(inviteid)", "CREATE INDEX IF NOT EXISTS msgIdIdx ON BubbleInfo(msgid)"};
        G = 3355;
        H = -925318346;
        I = 1379904420;
        f321460J = 631414244;
        K = -1067378658;
        L = 53929135;
        M = -2127306620;
        N = -135761730;
        P = 104192092;
        Q = 1269913645;
        R = -1056625598;
        S = 1407382541;
        T = 39301133;
        U = -970469075;
        V = 939923777;
        W = 1343750747;
        X = 422014826;
        Y = -649312567;
        Z = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[18];
        java.lang.String[] strArr = new java.lang.String[19];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66865x76d1ec5a;
        ((java.util.HashMap) e0Var.f398488d).put(dm.i4.f66865x76d1ec5a, "LONG PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66865x76d1ec5a;
        e0Var.f398487c[1] = "roomid";
        ((java.util.HashMap) e0Var.f398488d).put("roomid", "LONG default '0' ");
        e0Var.f398487c[2] = "roomkey";
        ((java.util.HashMap) e0Var.f398488d).put("roomkey", "LONG default '0' ");
        e0Var.f398487c[3] = "inviteid";
        ((java.util.HashMap) e0Var.f398488d).put("inviteid", "LONG default '0' ");
        e0Var.f398487c[4] = "room_type";
        ((java.util.HashMap) e0Var.f398488d).put("room_type", "INTEGER default '0' ");
        e0Var.f398487c[5] = "out_call";
        ((java.util.HashMap) e0Var.f398488d).put("out_call", "INTEGER default 'false' ");
        e0Var.f398487c[6] = "talkerName";
        ((java.util.HashMap) e0Var.f398488d).put("talkerName", "TEXT default '' ");
        e0Var.f398487c[7] = "identity";
        ((java.util.HashMap) e0Var.f398488d).put("identity", "TEXT default '' ");
        e0Var.f398487c[8] = "msgid";
        ((java.util.HashMap) e0Var.f398488d).put("msgid", "LONG default '0' ");
        e0Var.f398487c[9] = "room_state";
        ((java.util.HashMap) e0Var.f398488d).put("room_state", "INTEGER default '0' ");
        e0Var.f398487c[10] = "abort_backend_informed";
        ((java.util.HashMap) e0Var.f398488d).put("abort_backend_informed", "INTEGER default '0' ");
        e0Var.f398487c[11] = "inviteTimestamp";
        ((java.util.HashMap) e0Var.f398488d).put("inviteTimestamp", "LONG default '0' ");
        e0Var.f398487c[12] = "connectedTimestamp";
        ((java.util.HashMap) e0Var.f398488d).put("connectedTimestamp", "LONG default '0' ");
        e0Var.f398487c[13] = "recallTipsTimestamp";
        ((java.util.HashMap) e0Var.f398488d).put("recallTipsTimestamp", "LONG default '0' ");
        e0Var.f398487c[14] = "bubbleMsgTimestamp";
        ((java.util.HashMap) e0Var.f398488d).put("bubbleMsgTimestamp", "LONG default '0' ");
        e0Var.f398487c[15] = "msgType";
        ((java.util.HashMap) e0Var.f398488d).put("msgType", "INTEGER default '0' ");
        e0Var.f398487c[16] = "mainRecord";
        ((java.util.HashMap) e0Var.f398488d).put("mainRecord", "INTEGER default '0' ");
        e0Var.f398487c[17] = "aliveTimestamp";
        ((java.util.HashMap) e0Var.f398488d).put("aliveTimestamp", "LONG default '0' ");
        e0Var.f398487c[18] = "rowid";
        e0Var.f398489e = " id LONG PRIMARY KEY ,  roomid LONG default '0' ,  roomkey LONG default '0' ,  inviteid LONG default '0' ,  room_type INTEGER default '0' ,  out_call INTEGER default 'false' ,  talkerName TEXT default '' ,  identity TEXT default '' ,  msgid LONG default '0' ,  room_state INTEGER default '0' ,  abort_backend_informed INTEGER default '0' ,  inviteTimestamp LONG default '0' ,  connectedTimestamp LONG default '0' ,  recallTipsTimestamp LONG default '0' ,  bubbleMsgTimestamp LONG default '0' ,  msgType INTEGER default '0' ,  mainRecord INTEGER default '0' ,  aliveTimestamp LONG default '0' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f321461p0 = e0Var;
        f321462x0 = new o75.e();
    }

    public static final p75.l0 U0(long j17) {
        p75.i0 i17 = f321463y.i();
        i17.f434190d = A.i(java.lang.Long.valueOf(j17));
        i17.f434189c = "MicroMsg.SDK.BaseVoIPBubbleInfo";
        return i17.a();
    }

    public static final p75.l0 W0(long j17) {
        p75.i0 i17 = f321463y.i();
        i17.f434190d = f321464z.i(java.lang.Long.valueOf(j17));
        i17.f434189c = "MicroMsg.SDK.BaseVoIPBubbleInfo";
        return i17.a();
    }

    public long A0() {
        return this.f68342x4365a789;
    }

    public int D0() {
        return this.f68343xd24ea3cf;
    }

    public int F0() {
        return this.f68344xc4aab016;
    }

    public long G0() {
        return this.f68345x297eb8d7;
    }

    public int I0() {
        return this.f68346x328ff487;
    }

    public long J0() {
        return this.f68347xb4d4be68;
    }

    public int L0() {
        return this.f68348x4d88c92;
    }

    public int P0() {
        return this.f68349x5aff4319;
    }

    public long Q0() {
        return this.f68350xeabf21b;
    }

    public long R0() {
        return this.f68351xc6d2595f;
    }

    public java.lang.String T0() {
        return this.f68352x3a5b14e9;
    }

    public void Y0(int i17) {
        this.f68335xaeaff127 = i17;
        this.f321475q = true;
    }

    public void Z0(long j17) {
        this.f68336x8948c0ae = j17;
        this.f321482x = true;
    }

    public void a1(long j17) {
        this.f68337x3fb918a6 = j17;
        this.f321479u = true;
    }

    public void c1(long j17) {
        this.f68338xa0aaf72 = j17;
        this.f321477s = true;
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
            if (G == hashCode) {
                try {
                    this.f68339xc8a07680 = cursor.getLong(i17);
                    this.f321465d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f68350xeabf21b = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f68351xc6d2595f = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321460J == hashCode) {
                try {
                    this.f68342x4365a789 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f68349x5aff4319 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (L == hashCode) {
                try {
                    this.f68346x328ff487 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (M == hashCode) {
                try {
                    this.f68352x3a5b14e9 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (N == hashCode) {
                try {
                    this.f68340x15ab7a63 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (P == hashCode) {
                try {
                    this.f68345x297eb8d7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (Q == hashCode) {
                try {
                    this.f68348x4d88c92 = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (R == hashCode) {
                try {
                    this.f68335xaeaff127 = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (S == hashCode) {
                try {
                    this.f68341xa375b6c8 = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (T == hashCode) {
                try {
                    this.f68338xa0aaf72 = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (U == hashCode) {
                try {
                    this.f68347xb4d4be68 = cursor.getLong(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (V == hashCode) {
                try {
                    this.f68337x3fb918a6 = cursor.getLong(i17);
                } catch (java.lang.Throwable th20) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (W == hashCode) {
                try {
                    this.f68344xc4aab016 = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (X == hashCode) {
                try {
                    this.f68343xd24ea3cf = cursor.getInt(i17);
                } catch (java.lang.Throwable th22) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (Y == hashCode) {
                try {
                    this.f68336x8948c0ae = cursor.getLong(i17);
                } catch (java.lang.Throwable th23) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseVoIPBubbleInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
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
        if (this.f321465d) {
            contentValues.put(dm.i4.f66865x76d1ec5a, java.lang.Long.valueOf(this.f68339xc8a07680));
        }
        if (this.f321466e) {
            contentValues.put("roomid", java.lang.Long.valueOf(this.f68350xeabf21b));
        }
        if (this.f321467f) {
            contentValues.put("roomkey", java.lang.Long.valueOf(this.f68351xc6d2595f));
        }
        if (this.f321468g) {
            contentValues.put("inviteid", java.lang.Long.valueOf(this.f68342x4365a789));
        }
        if (this.f321469h) {
            contentValues.put("room_type", java.lang.Integer.valueOf(this.f68349x5aff4319));
        }
        if (this.f321470i) {
            contentValues.put("out_call", java.lang.Integer.valueOf(this.f68346x328ff487));
        }
        if (this.f68352x3a5b14e9 == null) {
            this.f68352x3a5b14e9 = "";
        }
        if (this.f321471m) {
            contentValues.put("talkerName", this.f68352x3a5b14e9);
        }
        if (this.f68340x15ab7a63 == null) {
            this.f68340x15ab7a63 = "";
        }
        if (this.f321472n) {
            contentValues.put("identity", this.f68340x15ab7a63);
        }
        if (this.f321473o) {
            contentValues.put("msgid", java.lang.Long.valueOf(this.f68345x297eb8d7));
        }
        if (this.f321474p) {
            contentValues.put("room_state", java.lang.Integer.valueOf(this.f68348x4d88c92));
        }
        if (this.f321475q) {
            contentValues.put("abort_backend_informed", java.lang.Integer.valueOf(this.f68335xaeaff127));
        }
        if (this.f321476r) {
            contentValues.put("inviteTimestamp", java.lang.Long.valueOf(this.f68341xa375b6c8));
        }
        if (this.f321477s) {
            contentValues.put("connectedTimestamp", java.lang.Long.valueOf(this.f68338xa0aaf72));
        }
        if (this.f321478t) {
            contentValues.put("recallTipsTimestamp", java.lang.Long.valueOf(this.f68347xb4d4be68));
        }
        if (this.f321479u) {
            contentValues.put("bubbleMsgTimestamp", java.lang.Long.valueOf(this.f68337x3fb918a6));
        }
        if (this.f321480v) {
            contentValues.put("msgType", java.lang.Integer.valueOf(this.f68344xc4aab016));
        }
        if (this.f321481w) {
            contentValues.put("mainRecord", java.lang.Integer.valueOf(this.f68343xd24ea3cf));
        }
        if (this.f321482x) {
            contentValues.put("aliveTimestamp", java.lang.Long.valueOf(this.f68336x8948c0ae));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseVoIPBubbleInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BubbleInfo ( ");
        l75.e0 e0Var = f321461p0;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : F) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseVoIPBubbleInfo", "createTableSql %s", str2);
            k0Var.A("BubbleInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BubbleInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseVoIPBubbleInfo", "updateTableSql %s", str3);
            k0Var.A("BubbleInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseVoIPBubbleInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public void d1(long j17) {
        this.f68339xc8a07680 = j17;
        this.f321465d = true;
    }

    public void e1(java.lang.String str) {
        this.f68340x15ab7a63 = str;
        this.f321472n = true;
    }

    public void f1(long j17) {
        this.f68341xa375b6c8 = j17;
        this.f321476r = true;
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321461p0;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321462x0;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f68339xc8a07680);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321463y;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321463y.f434209a;
    }

    public void h1(long j17) {
        this.f68342x4365a789 = j17;
        this.f321468g = true;
    }

    public void i1(int i17) {
        this.f68343xd24ea3cf = i17;
        this.f321481w = true;
    }

    public void j1(int i17) {
        this.f68344xc4aab016 = i17;
        this.f321480v = true;
    }

    public void k1(long j17) {
        this.f68345x297eb8d7 = j17;
        this.f321473o = true;
    }

    public void l1(int i17) {
        this.f68346x328ff487 = i17;
        this.f321470i = true;
    }

    public void n1(long j17) {
        this.f68347xb4d4be68 = j17;
        this.f321478t = true;
    }

    public void o1(int i17) {
        this.f68348x4d88c92 = i17;
        this.f321474p = true;
    }

    public void p1(int i17) {
        this.f68349x5aff4319 = i17;
        this.f321469h = true;
    }

    public void q1(long j17) {
        this.f68350xeabf21b = j17;
        this.f321466e = true;
    }

    public void r1(long j17) {
        this.f68351xc6d2595f = j17;
        this.f321467f = true;
    }

    public int t0() {
        return this.f68335xaeaff127;
    }

    public long u0() {
        return this.f68336x8948c0ae;
    }

    public void u1(java.lang.String str) {
        this.f68352x3a5b14e9 = str;
        this.f321471m = true;
    }

    public long v0() {
        return this.f68337x3fb918a6;
    }

    public long w0() {
        return this.f68338xa0aaf72;
    }

    public java.lang.String y0() {
        return this.f68340x15ab7a63;
    }

    public long z0() {
        return this.f68341xa375b6c8;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66865x76d1ec5a)) {
            this.f68339xc8a07680 = contentValues.getAsLong(dm.i4.f66865x76d1ec5a).longValue();
            if (z17) {
                this.f321465d = true;
            }
        }
        if (contentValues.containsKey("roomid")) {
            this.f68350xeabf21b = contentValues.getAsLong("roomid").longValue();
            if (z17) {
                this.f321466e = true;
            }
        }
        if (contentValues.containsKey("roomkey")) {
            this.f68351xc6d2595f = contentValues.getAsLong("roomkey").longValue();
            if (z17) {
                this.f321467f = true;
            }
        }
        if (contentValues.containsKey("inviteid")) {
            this.f68342x4365a789 = contentValues.getAsLong("inviteid").longValue();
            if (z17) {
                this.f321468g = true;
            }
        }
        if (contentValues.containsKey("room_type")) {
            this.f68349x5aff4319 = contentValues.getAsInteger("room_type").intValue();
            if (z17) {
                this.f321469h = true;
            }
        }
        if (contentValues.containsKey("out_call")) {
            this.f68346x328ff487 = contentValues.getAsInteger("out_call").intValue();
            if (z17) {
                this.f321470i = true;
            }
        }
        if (contentValues.containsKey("talkerName")) {
            this.f68352x3a5b14e9 = contentValues.getAsString("talkerName");
            if (z17) {
                this.f321471m = true;
            }
        }
        if (contentValues.containsKey("identity")) {
            this.f68340x15ab7a63 = contentValues.getAsString("identity");
            if (z17) {
                this.f321472n = true;
            }
        }
        if (contentValues.containsKey("msgid")) {
            this.f68345x297eb8d7 = contentValues.getAsLong("msgid").longValue();
            if (z17) {
                this.f321473o = true;
            }
        }
        if (contentValues.containsKey("room_state")) {
            this.f68348x4d88c92 = contentValues.getAsInteger("room_state").intValue();
            if (z17) {
                this.f321474p = true;
            }
        }
        if (contentValues.containsKey("abort_backend_informed")) {
            this.f68335xaeaff127 = contentValues.getAsInteger("abort_backend_informed").intValue();
            if (z17) {
                this.f321475q = true;
            }
        }
        if (contentValues.containsKey("inviteTimestamp")) {
            this.f68341xa375b6c8 = contentValues.getAsLong("inviteTimestamp").longValue();
            if (z17) {
                this.f321476r = true;
            }
        }
        if (contentValues.containsKey("connectedTimestamp")) {
            this.f68338xa0aaf72 = contentValues.getAsLong("connectedTimestamp").longValue();
            if (z17) {
                this.f321477s = true;
            }
        }
        if (contentValues.containsKey("recallTipsTimestamp")) {
            this.f68347xb4d4be68 = contentValues.getAsLong("recallTipsTimestamp").longValue();
            if (z17) {
                this.f321478t = true;
            }
        }
        if (contentValues.containsKey("bubbleMsgTimestamp")) {
            this.f68337x3fb918a6 = contentValues.getAsLong("bubbleMsgTimestamp").longValue();
            if (z17) {
                this.f321479u = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.f68344xc4aab016 = contentValues.getAsInteger("msgType").intValue();
            if (z17) {
                this.f321480v = true;
            }
        }
        if (contentValues.containsKey("mainRecord")) {
            this.f68343xd24ea3cf = contentValues.getAsInteger("mainRecord").intValue();
            if (z17) {
                this.f321481w = true;
            }
        }
        if (contentValues.containsKey("aliveTimestamp")) {
            this.f68336x8948c0ae = contentValues.getAsLong("aliveTimestamp").longValue();
            if (z17) {
                this.f321482x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
