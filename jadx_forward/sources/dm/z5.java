package dm;

/* loaded from: classes11.dex */
public class z5 extends l75.f0 {
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
    public static final l75.e0 f323001J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f323002t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f323003u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f323004v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f323005w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f323006x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f323007y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f323008z;

    /* renamed from: field_content */
    public java.lang.String f69365xad49e234;

    /* renamed from: field_createTime */
    public long f69366xac3be4e;

    /* renamed from: field_flag */
    public int f69367x225ba391;

    /* renamed from: field_fromUserName */
    public java.lang.String f69368x6bbbdde5;

    /* renamed from: field_msgSeq */
    public int f69369x6581003;

    /* renamed from: field_msgSource */
    public java.lang.String f69370x427fc1f7;

    /* renamed from: field_newMsgId */
    public long f69371x6edd4861;

    /* renamed from: field_originSvrId */
    public long f69372xd234289f;

    /* renamed from: field_reserved1 */
    public int f69373x13320504;

    /* renamed from: field_reserved2 */
    public long f69374x13320505;

    /* renamed from: field_reserved3 */
    public java.lang.String f69375x13320506;

    /* renamed from: field_reserved4 */
    public java.lang.String f69376x13320507;

    /* renamed from: field_toUserName */
    public java.lang.String f69377xa80ff8f6;

    /* renamed from: d, reason: collision with root package name */
    public boolean f323009d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f323010e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323011f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f323012g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f323013h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f323014i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f323015m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f323016n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f323017o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f323018p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f323019q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f323020r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f323021s = true;

    static {
        p75.n0 n0Var = new p75.n0("GetSysCmdMsgInfo");
        f323002t = n0Var;
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
        f323003u = new java.lang.String[0];
        f323004v = 1718931556;
        f323005w = 1360674492;
        f323006x = 1603284672;
        f323007y = -286735215;
        f323008z = 1369213417;
        A = 951530617;
        B = -1478387972;
        C = -1065033442;
        D = 3145580;
        E = 2022955529;
        F = 2022955530;
        G = 2022955531;
        H = 2022955532;
        I = 108705909;
        f323001J = m125733x3593deb(dm.z5.class);
        K = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125733x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f398487c = strArr;
        strArr[0] = "originSvrId";
        e0Var.f398488d.put("originSvrId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "originSvrId";
        e0Var.f398487c[1] = "newMsgId";
        e0Var.f398488d.put("newMsgId", "LONG");
        e0Var.f398487c[2] = "fromUserName";
        e0Var.f398488d.put("fromUserName", "TEXT default '' ");
        e0Var.f398487c[3] = "toUserName";
        e0Var.f398488d.put("toUserName", "TEXT default '' ");
        e0Var.f398487c[4] = "createTime";
        e0Var.f398488d.put("createTime", "LONG default '0' ");
        e0Var.f398487c[5] = "content";
        e0Var.f398488d.put("content", "TEXT default '' ");
        e0Var.f398487c[6] = "msgSource";
        e0Var.f398488d.put("msgSource", "TEXT default '' ");
        e0Var.f398487c[7] = "msgSeq";
        e0Var.f398488d.put("msgSeq", "INTEGER");
        e0Var.f398487c[8] = "flag";
        e0Var.f398488d.put("flag", "INTEGER");
        e0Var.f398487c[9] = "reserved1";
        e0Var.f398488d.put("reserved1", "INTEGER");
        e0Var.f398487c[10] = "reserved2";
        e0Var.f398488d.put("reserved2", "LONG");
        e0Var.f398487c[11] = "reserved3";
        e0Var.f398488d.put("reserved3", "TEXT default '' ");
        e0Var.f398487c[12] = "reserved4";
        e0Var.f398488d.put("reserved4", "TEXT default '' ");
        e0Var.f398487c[13] = "rowid";
        e0Var.f398489e = " originSvrId LONG PRIMARY KEY ,  newMsgId LONG,  fromUserName TEXT default '' ,  toUserName TEXT default '' ,  createTime LONG default '0' ,  content TEXT default '' ,  msgSource TEXT default '' ,  msgSeq INTEGER,  flag INTEGER,  reserved1 INTEGER,  reserved2 LONG,  reserved3 TEXT default '' ,  reserved4 TEXT default '' ";
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
            if (f323004v == hashCode) {
                try {
                    this.f69372xd234289f = cursor.getLong(i17);
                    this.f323009d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323005w == hashCode) {
                try {
                    this.f69371x6edd4861 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323006x == hashCode) {
                try {
                    this.f69368x6bbbdde5 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323007y == hashCode) {
                try {
                    this.f69377xa80ff8f6 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323008z == hashCode) {
                try {
                    this.f69366xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f69365xad49e234 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f69370x427fc1f7 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f69369x6581003 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f69367x225ba391 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f69373x13320504 = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f69374x13320505 = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f69375x13320506 = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f69376x13320507 = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetSysCmdMsgInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f323009d) {
            contentValues.put("originSvrId", java.lang.Long.valueOf(this.f69372xd234289f));
        }
        if (this.f323010e) {
            contentValues.put("newMsgId", java.lang.Long.valueOf(this.f69371x6edd4861));
        }
        if (this.f69368x6bbbdde5 == null) {
            this.f69368x6bbbdde5 = "";
        }
        if (this.f323011f) {
            contentValues.put("fromUserName", this.f69368x6bbbdde5);
        }
        if (this.f69377xa80ff8f6 == null) {
            this.f69377xa80ff8f6 = "";
        }
        if (this.f323012g) {
            contentValues.put("toUserName", this.f69377xa80ff8f6);
        }
        if (this.f323013h) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f69366xac3be4e));
        }
        if (this.f69365xad49e234 == null) {
            this.f69365xad49e234 = "";
        }
        if (this.f323014i) {
            contentValues.put("content", this.f69365xad49e234);
        }
        if (this.f69370x427fc1f7 == null) {
            this.f69370x427fc1f7 = "";
        }
        if (this.f323015m) {
            contentValues.put("msgSource", this.f69370x427fc1f7);
        }
        if (this.f323016n) {
            contentValues.put("msgSeq", java.lang.Integer.valueOf(this.f69369x6581003));
        }
        if (this.f323017o) {
            contentValues.put("flag", java.lang.Integer.valueOf(this.f69367x225ba391));
        }
        if (this.f323018p) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(this.f69373x13320504));
        }
        if (this.f323019q) {
            contentValues.put("reserved2", java.lang.Long.valueOf(this.f69374x13320505));
        }
        if (this.f69375x13320506 == null) {
            this.f69375x13320506 = "";
        }
        if (this.f323020r) {
            contentValues.put("reserved3", this.f69375x13320506);
        }
        if (this.f69376x13320507 == null) {
            this.f69376x13320507 = "";
        }
        if (this.f323021s) {
            contentValues.put("reserved4", this.f69376x13320507);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGetSysCmdMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GetSysCmdMsgInfo ( ");
        l75.e0 e0Var = f323001J;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f323003u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGetSysCmdMsgInfo", "createTableSql %s", str2);
            k0Var.A("GetSysCmdMsgInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GetSysCmdMsgInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGetSysCmdMsgInfo", "updateTableSql %s", str3);
            k0Var.A("GetSysCmdMsgInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGetSysCmdMsgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f323001J;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return K;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f69372xd234289f);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f323002t;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f323002t.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "originSvrId", java.lang.Long.valueOf(this.f69372xd234289f));
            n51.f.b(jSONObject, "newMsgId", java.lang.Long.valueOf(this.f69371x6edd4861));
            n51.f.b(jSONObject, "fromUserName", this.f69368x6bbbdde5);
            n51.f.b(jSONObject, "toUserName", this.f69377xa80ff8f6);
            n51.f.b(jSONObject, "createTime", java.lang.Long.valueOf(this.f69366xac3be4e));
            n51.f.b(jSONObject, "content", this.f69365xad49e234);
            n51.f.b(jSONObject, "msgSource", this.f69370x427fc1f7);
            n51.f.b(jSONObject, "msgSeq", java.lang.Integer.valueOf(this.f69369x6581003));
            n51.f.b(jSONObject, "flag", java.lang.Integer.valueOf(this.f69367x225ba391));
            n51.f.b(jSONObject, "reserved1", java.lang.Integer.valueOf(this.f69373x13320504));
            n51.f.b(jSONObject, "reserved2", java.lang.Long.valueOf(this.f69374x13320505));
            n51.f.b(jSONObject, "reserved3", this.f69375x13320506);
            n51.f.b(jSONObject, "reserved4", this.f69376x13320507);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("originSvrId")) {
            this.f69372xd234289f = contentValues.getAsLong("originSvrId").longValue();
            if (z17) {
                this.f323009d = true;
            }
        }
        if (contentValues.containsKey("newMsgId")) {
            this.f69371x6edd4861 = contentValues.getAsLong("newMsgId").longValue();
            if (z17) {
                this.f323010e = true;
            }
        }
        if (contentValues.containsKey("fromUserName")) {
            this.f69368x6bbbdde5 = contentValues.getAsString("fromUserName");
            if (z17) {
                this.f323011f = true;
            }
        }
        if (contentValues.containsKey("toUserName")) {
            this.f69377xa80ff8f6 = contentValues.getAsString("toUserName");
            if (z17) {
                this.f323012g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f69366xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f323013h = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.f69365xad49e234 = contentValues.getAsString("content");
            if (z17) {
                this.f323014i = true;
            }
        }
        if (contentValues.containsKey("msgSource")) {
            this.f69370x427fc1f7 = contentValues.getAsString("msgSource");
            if (z17) {
                this.f323015m = true;
            }
        }
        if (contentValues.containsKey("msgSeq")) {
            this.f69369x6581003 = contentValues.getAsInteger("msgSeq").intValue();
            if (z17) {
                this.f323016n = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.f69367x225ba391 = contentValues.getAsInteger("flag").intValue();
            if (z17) {
                this.f323017o = true;
            }
        }
        if (contentValues.containsKey("reserved1")) {
            this.f69373x13320504 = contentValues.getAsInteger("reserved1").intValue();
            if (z17) {
                this.f323018p = true;
            }
        }
        if (contentValues.containsKey("reserved2")) {
            this.f69374x13320505 = contentValues.getAsLong("reserved2").longValue();
            if (z17) {
                this.f323019q = true;
            }
        }
        if (contentValues.containsKey("reserved3")) {
            this.f69375x13320506 = contentValues.getAsString("reserved3");
            if (z17) {
                this.f323020r = true;
            }
        }
        if (contentValues.containsKey("reserved4")) {
            this.f69376x13320507 = contentValues.getAsString("reserved4");
            if (z17) {
                this.f323021s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
