package dm;

/* loaded from: classes9.dex */
public class s9 extends l75.f0 {
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
    public static final int f321439J;
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

    /* renamed from: y, reason: collision with root package name */
    public static final p75.n0 f321440y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f321441z;

    /* renamed from: field_cdnKey */
    public java.lang.String f68317xf47749d7;

    /* renamed from: field_cdnUrl */
    public java.lang.String f68318xf47770e7;

    /* renamed from: field_dataId */
    public java.lang.String f68319xf604e54a;

    /* renamed from: field_errCode */
    public int f68320x1c571ead;

    /* renamed from: field_fileType */
    public int f68321xf1ebe47b;

    /* renamed from: field_isThumb */
    public boolean f68322xf00f0c87;

    /* renamed from: field_localId */
    public int f68323x88be67a1;

    /* renamed from: field_mediaId */
    public java.lang.String f68324xaca5bdda;

    /* renamed from: field_offset */
    public long f68325x90a9378;

    /* renamed from: field_path */
    public java.lang.String f68326x2260084a;

    /* renamed from: field_recordLocalId */
    public int f68327x4ad5cdd0;

    /* renamed from: field_status */
    public int f68328x10a0fed7;

    /* renamed from: field_toUser */
    public java.lang.String f68329x1209e7cb;

    /* renamed from: field_totalLen */
    public long f68330xeb1a61d6;

    /* renamed from: field_tpaeskey */
    public java.lang.String f68331xffd08a51;

    /* renamed from: field_tpauthkey */
    public java.lang.String f68332x159b18b6;

    /* renamed from: field_tpdataurl */
    public java.lang.String f68333x9229d684;

    /* renamed from: field_type */
    public int f68334x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321442d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321443e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321444f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321445g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321446h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321447i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321448m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321449n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f321450o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f321451p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f321452q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f321453r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f321454s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f321455t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f321456u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f321457v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f321458w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f321459x = true;

    static {
        p75.n0 n0Var = new p75.n0("RecordCDNInfo");
        f321440y = n0Var;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321441z = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS record_localid_index ON RecordCDNInfo(recordLocalId)"};
        A = 338409958;
        B = -779380651;
        C = -868828954;
        D = -1338919323;
        E = 940773407;
        F = 3433509;
        G = -1364966910;
        H = -1364976910;
        I = -849913807;
        f321439J = 2071748300;
        K = -1019779949;
        L = 3575610;
        M = -735520042;
        N = -892481550;
        P = -1480298254;
        Q = -502431572;
        R = 2063396283;
        S = -141841527;
        T = 108705909;
        U = m125493x3593deb(dm.s9.class);
        V = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125493x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[18];
        java.lang.String[] strArr = new java.lang.String[19];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66867x2a5c95c7;
        e0Var.f398488d.put(dm.i4.f66867x2a5c95c7, "INTEGER PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66867x2a5c95c7;
        e0Var.f398487c[1] = "recordLocalId";
        e0Var.f398488d.put("recordLocalId", "INTEGER");
        e0Var.f398487c[2] = "toUser";
        e0Var.f398488d.put("toUser", "TEXT default '' ");
        e0Var.f398487c[3] = "dataId";
        e0Var.f398488d.put("dataId", "TEXT");
        e0Var.f398487c[4] = "mediaId";
        e0Var.f398488d.put("mediaId", "TEXT");
        e0Var.f398487c[5] = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714;
        e0Var.f398488d.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "TEXT");
        e0Var.f398487c[6] = "cdnUrl";
        e0Var.f398488d.put("cdnUrl", "TEXT");
        e0Var.f398487c[7] = "cdnKey";
        e0Var.f398488d.put("cdnKey", "TEXT");
        e0Var.f398487c[8] = "totalLen";
        e0Var.f398488d.put("totalLen", "LONG default '0' ");
        e0Var.f398487c[9] = "isThumb";
        e0Var.f398488d.put("isThumb", "INTEGER default 'false' ");
        e0Var.f398487c[10] = "offset";
        e0Var.f398488d.put("offset", "LONG default '0' ");
        e0Var.f398487c[11] = "type";
        e0Var.f398488d.put("type", "INTEGER default '0' ");
        e0Var.f398487c[12] = "fileType";
        e0Var.f398488d.put("fileType", "INTEGER default '5' ");
        e0Var.f398487c[13] = "status";
        e0Var.f398488d.put("status", "INTEGER default '0' ");
        e0Var.f398487c[14] = "errCode";
        e0Var.f398488d.put("errCode", "INTEGER default '0' ");
        e0Var.f398487c[15] = "tpaeskey";
        e0Var.f398488d.put("tpaeskey", "TEXT");
        e0Var.f398487c[16] = "tpauthkey";
        e0Var.f398488d.put("tpauthkey", "TEXT");
        e0Var.f398487c[17] = "tpdataurl";
        e0Var.f398488d.put("tpdataurl", "TEXT");
        e0Var.f398487c[18] = "rowid";
        e0Var.f398489e = " localId INTEGER PRIMARY KEY ,  recordLocalId INTEGER,  toUser TEXT default '' ,  dataId TEXT,  mediaId TEXT,  path TEXT,  cdnUrl TEXT,  cdnKey TEXT,  totalLen LONG default '0' ,  isThumb INTEGER default 'false' ,  offset LONG default '0' ,  type INTEGER default '0' ,  fileType INTEGER default '5' ,  status INTEGER default '0' ,  errCode INTEGER default '0' ,  tpaeskey TEXT,  tpauthkey TEXT,  tpdataurl TEXT";
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
            if (A == hashCode) {
                try {
                    this.f68323x88be67a1 = cursor.getInt(i17);
                    this.f321442d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f68327x4ad5cdd0 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f68329x1209e7cb = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f68319xf604e54a = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f68324xaca5bdda = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f68326x2260084a = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f68318xf47770e7 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f68317xf47749d7 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f68330xeb1a61d6 = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321439J == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f68322xf00f0c87 = z17;
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f68325x90a9378 = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (L == hashCode) {
                try {
                    this.f68334x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (M == hashCode) {
                try {
                    this.f68321xf1ebe47b = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (N == hashCode) {
                try {
                    this.f68328x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (P == hashCode) {
                try {
                    this.f68320x1c571ead = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (Q == hashCode) {
                try {
                    this.f68331xffd08a51 = cursor.getString(i17);
                } catch (java.lang.Throwable th21) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (R == hashCode) {
                try {
                    this.f68332x159b18b6 = cursor.getString(i17);
                } catch (java.lang.Throwable th22) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (S == hashCode) {
                try {
                    this.f68333x9229d684 = cursor.getString(i17);
                } catch (java.lang.Throwable th23) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRecordCDNInfo", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
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
        if (this.f321442d) {
            contentValues.put(dm.i4.f66867x2a5c95c7, java.lang.Integer.valueOf(this.f68323x88be67a1));
        }
        if (this.f321443e) {
            contentValues.put("recordLocalId", java.lang.Integer.valueOf(this.f68327x4ad5cdd0));
        }
        if (this.f68329x1209e7cb == null) {
            this.f68329x1209e7cb = "";
        }
        if (this.f321444f) {
            contentValues.put("toUser", this.f68329x1209e7cb);
        }
        if (this.f321445g) {
            contentValues.put("dataId", this.f68319xf604e54a);
        }
        if (this.f321446h) {
            contentValues.put("mediaId", this.f68324xaca5bdda);
        }
        if (this.f321447i) {
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f68326x2260084a);
        }
        if (this.f321448m) {
            contentValues.put("cdnUrl", this.f68318xf47770e7);
        }
        if (this.f321449n) {
            contentValues.put("cdnKey", this.f68317xf47749d7);
        }
        if (this.f321450o) {
            contentValues.put("totalLen", java.lang.Long.valueOf(this.f68330xeb1a61d6));
        }
        if (this.f321451p) {
            if (this.f68322xf00f0c87) {
                contentValues.put("isThumb", (java.lang.Integer) 1);
            } else {
                contentValues.put("isThumb", (java.lang.Integer) 0);
            }
        }
        if (this.f321452q) {
            contentValues.put("offset", java.lang.Long.valueOf(this.f68325x90a9378));
        }
        if (this.f321453r) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f68334x2262335f));
        }
        if (this.f321454s) {
            contentValues.put("fileType", java.lang.Integer.valueOf(this.f68321xf1ebe47b));
        }
        if (this.f321455t) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f68328x10a0fed7));
        }
        if (this.f321456u) {
            contentValues.put("errCode", java.lang.Integer.valueOf(this.f68320x1c571ead));
        }
        if (this.f321457v) {
            contentValues.put("tpaeskey", this.f68331xffd08a51);
        }
        if (this.f321458w) {
            contentValues.put("tpauthkey", this.f68332x159b18b6);
        }
        if (this.f321459x) {
            contentValues.put("tpdataurl", this.f68333x9229d684);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseRecordCDNInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS RecordCDNInfo ( ");
        l75.e0 e0Var = U;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321441z) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRecordCDNInfo", "createTableSql %s", str2);
            k0Var.A("RecordCDNInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "RecordCDNInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRecordCDNInfo", "updateTableSql %s", str3);
            k0Var.A("RecordCDNInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRecordCDNInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return U;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return V;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f68323x88be67a1);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321440y;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321440y.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66867x2a5c95c7)) {
            this.f68323x88be67a1 = contentValues.getAsInteger(dm.i4.f66867x2a5c95c7).intValue();
            if (z17) {
                this.f321442d = true;
            }
        }
        if (contentValues.containsKey("recordLocalId")) {
            this.f68327x4ad5cdd0 = contentValues.getAsInteger("recordLocalId").intValue();
            if (z17) {
                this.f321443e = true;
            }
        }
        if (contentValues.containsKey("toUser")) {
            this.f68329x1209e7cb = contentValues.getAsString("toUser");
            if (z17) {
                this.f321444f = true;
            }
        }
        if (contentValues.containsKey("dataId")) {
            this.f68319xf604e54a = contentValues.getAsString("dataId");
            if (z17) {
                this.f321445g = true;
            }
        }
        if (contentValues.containsKey("mediaId")) {
            this.f68324xaca5bdda = contentValues.getAsString("mediaId");
            if (z17) {
                this.f321446h = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)) {
            this.f68326x2260084a = contentValues.getAsString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            if (z17) {
                this.f321447i = true;
            }
        }
        if (contentValues.containsKey("cdnUrl")) {
            this.f68318xf47770e7 = contentValues.getAsString("cdnUrl");
            if (z17) {
                this.f321448m = true;
            }
        }
        if (contentValues.containsKey("cdnKey")) {
            this.f68317xf47749d7 = contentValues.getAsString("cdnKey");
            if (z17) {
                this.f321449n = true;
            }
        }
        if (contentValues.containsKey("totalLen")) {
            this.f68330xeb1a61d6 = contentValues.getAsLong("totalLen").longValue();
            if (z17) {
                this.f321450o = true;
            }
        }
        if (contentValues.containsKey("isThumb")) {
            this.f68322xf00f0c87 = contentValues.getAsInteger("isThumb").intValue() != 0;
            if (z17) {
                this.f321451p = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.f68325x90a9378 = contentValues.getAsLong("offset").longValue();
            if (z17) {
                this.f321452q = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f68334x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f321453r = true;
            }
        }
        if (contentValues.containsKey("fileType")) {
            this.f68321xf1ebe47b = contentValues.getAsInteger("fileType").intValue();
            if (z17) {
                this.f321454s = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f68328x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f321455t = true;
            }
        }
        if (contentValues.containsKey("errCode")) {
            this.f68320x1c571ead = contentValues.getAsInteger("errCode").intValue();
            if (z17) {
                this.f321456u = true;
            }
        }
        if (contentValues.containsKey("tpaeskey")) {
            this.f68331xffd08a51 = contentValues.getAsString("tpaeskey");
            if (z17) {
                this.f321457v = true;
            }
        }
        if (contentValues.containsKey("tpauthkey")) {
            this.f68332x159b18b6 = contentValues.getAsString("tpauthkey");
            if (z17) {
                this.f321458w = true;
            }
        }
        if (contentValues.containsKey("tpdataurl")) {
            this.f68333x9229d684 = contentValues.getAsString("tpdataurl");
            if (z17) {
                this.f321459x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
