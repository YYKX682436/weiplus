package dm;

/* loaded from: classes10.dex */
public class r4 extends l75.f0 {
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
    public static final int f321139J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final l75.e0 N;
    public static final o75.e P;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.n0 f321140v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f321141w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f321142x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f321143y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f321144z;

    /* renamed from: field_businessBuf */
    public byte[] f68155xb4c686ce;

    /* renamed from: field_bypInfo */
    public java.lang.String f68156x897ce102;

    /* renamed from: field_controlFlag */
    public int f68157x57c3aa4;

    /* renamed from: field_ctrlInfoType */
    public int f68158xe1889bb8;

    /* renamed from: field_exposureStatus */
    public int f68159xbc5c91be;

    /* renamed from: field_feedId */
    public java.lang.String f68160xf9a02e3e;

    /* renamed from: field_forcePushId */
    public java.lang.String f68161x4b440cdb;

    /* renamed from: field_insertTime */
    public long f68162xf2bdb98b;

    /* renamed from: field_liveId */
    public java.lang.String f68163x41d5e0c;

    /* renamed from: field_liveStatus */
    public int f68164xed074063;

    /* renamed from: field_msgId */
    public long f68165x297eb4f7;

    /* renamed from: field_noticeId */
    public java.lang.String f68166x7c4053b8;

    /* renamed from: field_revokeId */
    public java.lang.String f68167xe8897e6;

    /* renamed from: field_talker */
    public java.lang.String f68168x114ef53e;

    /* renamed from: field_tipsId */
    public java.lang.String f68169x11c19d58;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321145d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321146e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321147f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321148g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321149h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321150i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321151m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321152n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f321153o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f321154p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f321155q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f321156r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f321157s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f321158t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f321159u = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveNotifyExposureInfo");
        f321140v = n0Var;
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
        f321141w = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderLiveNotifyExposureInfo_revokeId_index ON FinderLiveNotifyExposureInfo(revokeId)", "CREATE INDEX IF NOT EXISTS FinderLiveNotifyExposureInfo_msgId_index ON FinderLiveNotifyExposureInfo(msgId)", "CREATE INDEX IF NOT EXISTS FinderLiveNotifyExposureInfo_liveId ON FinderLiveNotifyExposureInfo(liveId)"};
        f321142x = -255488447;
        f321143y = 104191100;
        f321144z = 207624153;
        A = 870321150;
        B = 1225207443;
        C = 966165798;
        D = -873566605;
        E = -1102434521;
        F = -1715674519;
        G = -544951136;
        H = -715330413;
        I = 350892871;
        f321139J = -1278410919;
        K = 1585269267;
        L = -881080743;
        M = 108705909;
        N = m125445x3593deb(dm.r4.class);
        P = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125445x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[15];
        java.lang.String[] strArr = new java.lang.String[16];
        e0Var.f398487c = strArr;
        strArr[0] = "revokeId";
        e0Var.f398488d.put("revokeId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "revokeId";
        e0Var.f398487c[1] = "msgId";
        e0Var.f398488d.put("msgId", "LONG");
        e0Var.f398487c[2] = "exposureStatus";
        e0Var.f398488d.put("exposureStatus", "INTEGER default '0' ");
        e0Var.f398487c[3] = "liveStatus";
        e0Var.f398488d.put("liveStatus", "INTEGER default '1' ");
        e0Var.f398487c[4] = "businessBuf";
        e0Var.f398488d.put("businessBuf", "BLOB");
        e0Var.f398487c[5] = "insertTime";
        e0Var.f398488d.put("insertTime", "LONG");
        e0Var.f398487c[6] = "tipsId";
        e0Var.f398488d.put("tipsId", "TEXT");
        e0Var.f398487c[7] = "liveId";
        e0Var.f398488d.put("liveId", "TEXT");
        e0Var.f398487c[8] = "controlFlag";
        e0Var.f398488d.put("controlFlag", "INTEGER");
        e0Var.f398487c[9] = "forcePushId";
        e0Var.f398488d.put("forcePushId", "TEXT");
        e0Var.f398487c[10] = "ctrlInfoType";
        e0Var.f398488d.put("ctrlInfoType", "INTEGER default '0' ");
        e0Var.f398487c[11] = "bypInfo";
        e0Var.f398488d.put("bypInfo", "TEXT");
        e0Var.f398487c[12] = "feedId";
        e0Var.f398488d.put("feedId", "TEXT");
        e0Var.f398487c[13] = "noticeId";
        e0Var.f398488d.put("noticeId", "TEXT");
        e0Var.f398487c[14] = "talker";
        e0Var.f398488d.put("talker", "TEXT");
        e0Var.f398487c[15] = "rowid";
        e0Var.f398489e = " revokeId TEXT PRIMARY KEY ,  msgId LONG,  exposureStatus INTEGER default '0' ,  liveStatus INTEGER default '1' ,  businessBuf BLOB,  insertTime LONG,  tipsId TEXT,  liveId TEXT,  controlFlag INTEGER,  forcePushId TEXT,  ctrlInfoType INTEGER default '0' ,  bypInfo TEXT,  feedId TEXT,  noticeId TEXT,  talker TEXT";
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
            if (f321142x == hashCode) {
                try {
                    this.f68167xe8897e6 = cursor.getString(i17);
                    this.f321145d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321143y == hashCode) {
                try {
                    this.f68165x297eb4f7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321144z == hashCode) {
                try {
                    this.f68159xbc5c91be = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f68164xed074063 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f68155xb4c686ce = cursor.getBlob(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f68162xf2bdb98b = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f68169x11c19d58 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f68163x41d5e0c = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f68157x57c3aa4 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f68161x4b440cdb = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f68158xe1889bb8 = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f68156x897ce102 = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321139J == hashCode) {
                try {
                    this.f68160xf9a02e3e = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f68166x7c4053b8 = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (L == hashCode) {
                try {
                    this.f68168x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th20) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (M == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321145d) {
            contentValues.put("revokeId", this.f68167xe8897e6);
        }
        if (this.f321146e) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f68165x297eb4f7));
        }
        if (this.f321147f) {
            contentValues.put("exposureStatus", java.lang.Integer.valueOf(this.f68159xbc5c91be));
        }
        if (this.f321148g) {
            contentValues.put("liveStatus", java.lang.Integer.valueOf(this.f68164xed074063));
        }
        if (this.f321149h) {
            contentValues.put("businessBuf", this.f68155xb4c686ce);
        }
        if (this.f321150i) {
            contentValues.put("insertTime", java.lang.Long.valueOf(this.f68162xf2bdb98b));
        }
        if (this.f321151m) {
            contentValues.put("tipsId", this.f68169x11c19d58);
        }
        if (this.f321152n) {
            contentValues.put("liveId", this.f68163x41d5e0c);
        }
        if (this.f321153o) {
            contentValues.put("controlFlag", java.lang.Integer.valueOf(this.f68157x57c3aa4));
        }
        if (this.f321154p) {
            contentValues.put("forcePushId", this.f68161x4b440cdb);
        }
        if (this.f321155q) {
            contentValues.put("ctrlInfoType", java.lang.Integer.valueOf(this.f68158xe1889bb8));
        }
        if (this.f321156r) {
            contentValues.put("bypInfo", this.f68156x897ce102);
        }
        if (this.f321157s) {
            contentValues.put("feedId", this.f68160xf9a02e3e);
        }
        if (this.f321158t) {
            contentValues.put("noticeId", this.f68166x7c4053b8);
        }
        if (this.f321159u) {
            contentValues.put("talker", this.f68168x114ef53e);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveNotifyExposureInfo ( ");
        l75.e0 e0Var = N;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321141w) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", "createTableSql %s", str2);
            k0Var.A("FinderLiveNotifyExposureInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderLiveNotifyExposureInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", "updateTableSql %s", str3);
            k0Var.A("FinderLiveNotifyExposureInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveNotifyExposureInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return N;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return P;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68167xe8897e6;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321140v;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321140v.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("revokeId")) {
            this.f68167xe8897e6 = contentValues.getAsString("revokeId");
            if (z17) {
                this.f321145d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.f68165x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f321146e = true;
            }
        }
        if (contentValues.containsKey("exposureStatus")) {
            this.f68159xbc5c91be = contentValues.getAsInteger("exposureStatus").intValue();
            if (z17) {
                this.f321147f = true;
            }
        }
        if (contentValues.containsKey("liveStatus")) {
            this.f68164xed074063 = contentValues.getAsInteger("liveStatus").intValue();
            if (z17) {
                this.f321148g = true;
            }
        }
        if (contentValues.containsKey("businessBuf")) {
            this.f68155xb4c686ce = contentValues.getAsByteArray("businessBuf");
            if (z17) {
                this.f321149h = true;
            }
        }
        if (contentValues.containsKey("insertTime")) {
            this.f68162xf2bdb98b = contentValues.getAsLong("insertTime").longValue();
            if (z17) {
                this.f321150i = true;
            }
        }
        if (contentValues.containsKey("tipsId")) {
            this.f68169x11c19d58 = contentValues.getAsString("tipsId");
            if (z17) {
                this.f321151m = true;
            }
        }
        if (contentValues.containsKey("liveId")) {
            this.f68163x41d5e0c = contentValues.getAsString("liveId");
            if (z17) {
                this.f321152n = true;
            }
        }
        if (contentValues.containsKey("controlFlag")) {
            this.f68157x57c3aa4 = contentValues.getAsInteger("controlFlag").intValue();
            if (z17) {
                this.f321153o = true;
            }
        }
        if (contentValues.containsKey("forcePushId")) {
            this.f68161x4b440cdb = contentValues.getAsString("forcePushId");
            if (z17) {
                this.f321154p = true;
            }
        }
        if (contentValues.containsKey("ctrlInfoType")) {
            this.f68158xe1889bb8 = contentValues.getAsInteger("ctrlInfoType").intValue();
            if (z17) {
                this.f321155q = true;
            }
        }
        if (contentValues.containsKey("bypInfo")) {
            this.f68156x897ce102 = contentValues.getAsString("bypInfo");
            if (z17) {
                this.f321156r = true;
            }
        }
        if (contentValues.containsKey("feedId")) {
            this.f68160xf9a02e3e = contentValues.getAsString("feedId");
            if (z17) {
                this.f321157s = true;
            }
        }
        if (contentValues.containsKey("noticeId")) {
            this.f68166x7c4053b8 = contentValues.getAsString("noticeId");
            if (z17) {
                this.f321158t = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f68168x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f321159u = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
