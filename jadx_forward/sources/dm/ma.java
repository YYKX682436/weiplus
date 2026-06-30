package dm;

/* loaded from: classes4.dex */
public class ma extends l75.f0 {
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
    public static final int f320081J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final l75.e0 Q;
    public static final o75.e R;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.n0 f320082w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f320083x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f320084y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f320085z;

    /* renamed from: field_clientId */
    public java.lang.String f67457x53e83feb;

    /* renamed from: field_commentSvrID */
    public long f67458x3aefdbd0;

    /* renamed from: field_commentflag */
    public int f67459xe928fe86;

    /* renamed from: field_createTime */
    public int f67460xac3be4e;

    /* renamed from: field_curActionBuf */
    public byte[] f67461x5e5c2922;

    /* renamed from: field_isRead */
    public short f67462xff7b64c5;

    /* renamed from: field_isReminding */
    public int f67463xf3bdf6ee;

    /* renamed from: field_isSend */
    public boolean f67464xff7bdab7;

    /* renamed from: field_isSilence */
    public int f67465xf4ca6712;

    /* renamed from: field_msgRelevanceType */
    public int f67466xa9a2f4d7;

    /* renamed from: field_parentID */
    public long f67467x63ce98ea;

    /* renamed from: field_refActionBuf */
    public byte[] f67468x1008602f;

    /* renamed from: field_snsID */
    public long f67469x29d1290e;

    /* renamed from: field_springWishFlag */
    public int f67470x67fdfbc5;

    /* renamed from: field_talker */
    public java.lang.String f67471x114ef53e;

    /* renamed from: field_type */
    public int f67472x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320086d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320087e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320088f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320089g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320090h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320091i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320092m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320093n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f320094o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f320095p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f320096q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f320097r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f320098s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f320099t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f320100u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f320101v = true;

    static {
        p75.n0 n0Var = new p75.n0("SnsComment");
        f320082w = n0Var;
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
        f320083x = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS SnsComment_snsID_index ON SnsComment(snsID)", "CREATE INDEX IF NOT EXISTS SnsComment_parentID_index ON SnsComment(parentID)", "CREATE INDEX IF NOT EXISTS SnsComment_isRead_index ON SnsComment(isRead)", "CREATE INDEX IF NOT EXISTS SnsComment_isSend_index ON SnsComment(isSend)"};
        f320084y = 109594771;
        f320085z = 1175162693;
        A = -1180158496;
        B = 1369213417;
        C = -881080743;
        D = 3575610;
        E = -1180128302;
        F = 1378908669;
        G = 64794890;
        H = 784608427;
        I = 908408390;
        f320081J = 2104075851;
        K = 1512848407;
        L = -1207860768;
        M = 115171378;
        N = -2013356365;
        P = 108705909;
        Q = m125231x3593deb(dm.ma.class);
        R = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125231x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[16];
        java.lang.String[] strArr = new java.lang.String[17];
        e0Var.f398487c = strArr;
        strArr[0] = "snsID";
        e0Var.f398488d.put("snsID", "LONG");
        e0Var.f398487c[1] = "parentID";
        e0Var.f398488d.put("parentID", "LONG");
        e0Var.f398487c[2] = "isRead";
        e0Var.f398488d.put("isRead", "SHORT default '0' ");
        e0Var.f398487c[3] = "createTime";
        e0Var.f398488d.put("createTime", "INTEGER");
        e0Var.f398487c[4] = "talker";
        e0Var.f398488d.put("talker", "TEXT");
        e0Var.f398487c[5] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[6] = "isSend";
        e0Var.f398488d.put("isSend", "INTEGER default 'false' ");
        e0Var.f398487c[7] = "curActionBuf";
        e0Var.f398488d.put("curActionBuf", "BLOB");
        e0Var.f398487c[8] = "refActionBuf";
        e0Var.f398488d.put("refActionBuf", "BLOB");
        e0Var.f398487c[9] = "commentSvrID";
        e0Var.f398488d.put("commentSvrID", "LONG");
        e0Var.f398487c[10] = com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.Columns.f56764x64cb2a26;
        e0Var.f398488d.put(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.Columns.f56764x64cb2a26, "TEXT");
        e0Var.f398487c[11] = "commentflag";
        e0Var.f398488d.put("commentflag", "INTEGER");
        e0Var.f398487c[12] = "isSilence";
        e0Var.f398488d.put("isSilence", "INTEGER default '0' ");
        e0Var.f398487c[13] = "springWishFlag";
        e0Var.f398488d.put("springWishFlag", "INTEGER default '0' ");
        e0Var.f398487c[14] = "msgRelevanceType";
        e0Var.f398488d.put("msgRelevanceType", "INTEGER default '0' ");
        e0Var.f398487c[15] = "isReminding";
        e0Var.f398488d.put("isReminding", "INTEGER default '0' ");
        e0Var.f398487c[16] = "rowid";
        e0Var.f398489e = " snsID LONG,  parentID LONG,  isRead SHORT default '0' ,  createTime INTEGER,  talker TEXT,  type INTEGER,  isSend INTEGER default 'false' ,  curActionBuf BLOB,  refActionBuf BLOB,  commentSvrID LONG,  clientId TEXT,  commentflag INTEGER,  isSilence INTEGER default '0' ,  springWishFlag INTEGER default '0' ,  msgRelevanceType INTEGER default '0' ,  isReminding INTEGER default '0' ";
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
            if (f320084y == hashCode) {
                try {
                    this.f67469x29d1290e = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320085z == hashCode) {
                try {
                    this.f67467x63ce98ea = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67462xff7b64c5 = cursor.getShort(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67460xac3be4e = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f67471x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f67472x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f67464xff7bdab7 = cursor.getInt(i17) != 0;
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f67461x5e5c2922 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f67468x1008602f = cursor.getBlob(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f67458x3aefdbd0 = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f67457x53e83feb = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320081J == hashCode) {
                try {
                    this.f67459xe928fe86 = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f67465xf4ca6712 = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (L == hashCode) {
                try {
                    this.f67470x67fdfbc5 = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (M == hashCode) {
                try {
                    this.f67466xa9a2f4d7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th20) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (N == hashCode) {
                try {
                    this.f67463xf3bdf6ee = cursor.getInt(i17);
                } catch (java.lang.Throwable th21) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsComment", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (P == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320086d) {
            contentValues.put("snsID", java.lang.Long.valueOf(this.f67469x29d1290e));
        }
        if (this.f320087e) {
            contentValues.put("parentID", java.lang.Long.valueOf(this.f67467x63ce98ea));
        }
        if (this.f320088f) {
            contentValues.put("isRead", java.lang.Short.valueOf(this.f67462xff7b64c5));
        }
        if (this.f320089g) {
            contentValues.put("createTime", java.lang.Integer.valueOf(this.f67460xac3be4e));
        }
        if (this.f320090h) {
            contentValues.put("talker", this.f67471x114ef53e);
        }
        if (this.f320091i) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f67472x2262335f));
        }
        if (this.f320092m) {
            if (this.f67464xff7bdab7) {
                contentValues.put("isSend", (java.lang.Integer) 1);
            } else {
                contentValues.put("isSend", (java.lang.Integer) 0);
            }
        }
        if (this.f320093n) {
            contentValues.put("curActionBuf", this.f67461x5e5c2922);
        }
        if (this.f320094o) {
            contentValues.put("refActionBuf", this.f67468x1008602f);
        }
        if (this.f320095p) {
            contentValues.put("commentSvrID", java.lang.Long.valueOf(this.f67458x3aefdbd0));
        }
        if (this.f320096q) {
            contentValues.put(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.Columns.f56764x64cb2a26, this.f67457x53e83feb);
        }
        if (this.f320097r) {
            contentValues.put("commentflag", java.lang.Integer.valueOf(this.f67459xe928fe86));
        }
        if (this.f320098s) {
            contentValues.put("isSilence", java.lang.Integer.valueOf(this.f67465xf4ca6712));
        }
        if (this.f320099t) {
            contentValues.put("springWishFlag", java.lang.Integer.valueOf(this.f67470x67fdfbc5));
        }
        if (this.f320100u) {
            contentValues.put("msgRelevanceType", java.lang.Integer.valueOf(this.f67466xa9a2f4d7));
        }
        if (this.f320101v) {
            contentValues.put("isReminding", java.lang.Integer.valueOf(this.f67463xf3bdf6ee));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSnsComment", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsComment ( ");
        l75.e0 e0Var = Q;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320083x) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsComment", "createTableSql %s", str2);
            k0Var.A("SnsComment", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "SnsComment", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsComment", "updateTableSql %s", str3);
            k0Var.A("SnsComment", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsComment", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return Q;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return R;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320082w;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320082w.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("snsID")) {
            this.f67469x29d1290e = contentValues.getAsLong("snsID").longValue();
            if (z17) {
                this.f320086d = true;
            }
        }
        if (contentValues.containsKey("parentID")) {
            this.f67467x63ce98ea = contentValues.getAsLong("parentID").longValue();
            if (z17) {
                this.f320087e = true;
            }
        }
        if (contentValues.containsKey("isRead")) {
            this.f67462xff7b64c5 = contentValues.getAsShort("isRead").shortValue();
            if (z17) {
                this.f320088f = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f67460xac3be4e = contentValues.getAsInteger("createTime").intValue();
            if (z17) {
                this.f320089g = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f67471x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f320090h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f67472x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f320091i = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.f67464xff7bdab7 = contentValues.getAsInteger("isSend").intValue() != 0;
            if (z17) {
                this.f320092m = true;
            }
        }
        if (contentValues.containsKey("curActionBuf")) {
            this.f67461x5e5c2922 = contentValues.getAsByteArray("curActionBuf");
            if (z17) {
                this.f320093n = true;
            }
        }
        if (contentValues.containsKey("refActionBuf")) {
            this.f67468x1008602f = contentValues.getAsByteArray("refActionBuf");
            if (z17) {
                this.f320094o = true;
            }
        }
        if (contentValues.containsKey("commentSvrID")) {
            this.f67458x3aefdbd0 = contentValues.getAsLong("commentSvrID").longValue();
            if (z17) {
                this.f320095p = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.Columns.f56764x64cb2a26)) {
            this.f67457x53e83feb = contentValues.getAsString(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.Columns.f56764x64cb2a26);
            if (z17) {
                this.f320096q = true;
            }
        }
        if (contentValues.containsKey("commentflag")) {
            this.f67459xe928fe86 = contentValues.getAsInteger("commentflag").intValue();
            if (z17) {
                this.f320097r = true;
            }
        }
        if (contentValues.containsKey("isSilence")) {
            this.f67465xf4ca6712 = contentValues.getAsInteger("isSilence").intValue();
            if (z17) {
                this.f320098s = true;
            }
        }
        if (contentValues.containsKey("springWishFlag")) {
            this.f67470x67fdfbc5 = contentValues.getAsInteger("springWishFlag").intValue();
            if (z17) {
                this.f320099t = true;
            }
        }
        if (contentValues.containsKey("msgRelevanceType")) {
            this.f67466xa9a2f4d7 = contentValues.getAsInteger("msgRelevanceType").intValue();
            if (z17) {
                this.f320100u = true;
            }
        }
        if (contentValues.containsKey("isReminding")) {
            this.f67463xf3bdf6ee = contentValues.getAsInteger("isReminding").intValue();
            if (z17) {
                this.f320101v = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
