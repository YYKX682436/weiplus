package dm;

/* loaded from: classes12.dex */
public class j3 extends l75.f0 {
    public static final p75.d A;
    public static final java.lang.String[] B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f319289J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final l75.e0 S;
    public static final o75.e T;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.n0 f319290u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f319291v;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.d f319292w;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.d f319293x;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.d f319294y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f319295z;

    /* renamed from: field_attrFlag */
    public long f67082x3ec1f6a2;

    /* renamed from: field_cdnKey */
    public java.lang.String f67083xf47749d7;

    /* renamed from: field_cdnUrl */
    public java.lang.String f67084xf47770e7;

    /* renamed from: field_dataId */
    public java.lang.String f67085xf604e54a;

    /* renamed from: field_dataType */
    public int f67086x886617a9;

    /* renamed from: field_extFlag */
    public int f67087x26b1b2e8;

    /* renamed from: field_favLocalId */
    public long f67088x958756b0;

    /* renamed from: field_modifyTime */
    public long f67089x15b870c;

    /* renamed from: field_offset */
    public int f67090x90a9378;

    /* renamed from: field_path */
    public java.lang.String f67091x2260084a;

    /* renamed from: field_retryTime */
    public int f67092x5e9a8090;

    /* renamed from: field_status */
    public int f67093x10a0fed7;

    /* renamed from: field_totalLen */
    public int f67094xeb1a61d6;

    /* renamed from: field_type */
    public int f67095x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319296d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319297e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319298f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319299g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319300h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319301i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319302m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319303n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f319304o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f319305p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f319306q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f319307r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f319308s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f319309t = true;

    static {
        p75.n0 n0Var = new p75.n0("FavCdnInfo");
        f319290u = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319291v = new p75.d("dataId", "string", tableName, "");
        f319292w = new p75.d("favLocalId", "long", tableName, "");
        f319293x = new p75.d("type", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319294y = new p75.d("status", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319295z = new p75.d("modifyTime", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        A = new p75.d("retryTime", "int", tableName, "");
        B = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FavCdnTransferInfo_LocalId ON FavCdnInfo(favLocalId)", "CREATE INDEX IF NOT EXISTS FavCDNInfo_modifyTime_Index ON FavCdnInfo(modifyTime)"};
        C = -1338919323;
        D = -597679541;
        E = 3575610;
        F = -1364966910;
        G = -1364976910;
        H = -849913807;
        I = -1019779949;
        f319289J = -892481550;
        K = 3433509;
        L = 1789070852;
        M = 1211388583;
        N = -1306589907;
        P = 553577725;
        Q = -1006873195;
        R = 108705909;
        S = m125137x3593deb(dm.j3.class);
        T = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125137x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[14];
        java.lang.String[] strArr = new java.lang.String[15];
        e0Var.f398487c = strArr;
        strArr[0] = "dataId";
        e0Var.f398488d.put("dataId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "dataId";
        e0Var.f398487c[1] = "favLocalId";
        e0Var.f398488d.put("favLocalId", "LONG");
        e0Var.f398487c[2] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[3] = "cdnUrl";
        e0Var.f398488d.put("cdnUrl", "TEXT");
        e0Var.f398487c[4] = "cdnKey";
        e0Var.f398488d.put("cdnKey", "TEXT");
        e0Var.f398487c[5] = "totalLen";
        e0Var.f398488d.put("totalLen", "INTEGER");
        e0Var.f398487c[6] = "offset";
        e0Var.f398488d.put("offset", "INTEGER");
        e0Var.f398487c[7] = "status";
        e0Var.f398488d.put("status", "INTEGER");
        e0Var.f398487c[8] = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714;
        e0Var.f398488d.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "TEXT");
        e0Var.f398487c[9] = "dataType";
        e0Var.f398488d.put("dataType", "INTEGER");
        e0Var.f398487c[10] = "modifyTime";
        e0Var.f398488d.put("modifyTime", "LONG default '0' ");
        e0Var.f398487c[11] = "extFlag";
        e0Var.f398488d.put("extFlag", "INTEGER default '0' ");
        e0Var.f398487c[12] = "attrFlag";
        e0Var.f398488d.put("attrFlag", "LONG default '0' ");
        e0Var.f398487c[13] = "retryTime";
        e0Var.f398488d.put("retryTime", "INTEGER default '0' ");
        e0Var.f398487c[14] = "rowid";
        e0Var.f398489e = " dataId TEXT PRIMARY KEY ,  favLocalId LONG,  type INTEGER,  cdnUrl TEXT,  cdnKey TEXT,  totalLen INTEGER,  offset INTEGER,  status INTEGER,  path TEXT,  dataType INTEGER,  modifyTime LONG default '0' ,  extFlag INTEGER default '0' ,  attrFlag LONG default '0' ,  retryTime INTEGER default '0' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        return e0Var;
    }

    public static final p75.l0 t0(java.lang.String str) {
        p75.i0 i17 = f319290u.i();
        i17.f434190d = f319291v.j(str);
        i17.f434189c = "MicroMsg.SDK.BaseFavCdnInfo";
        return i17.a();
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
            if (C == hashCode) {
                try {
                    this.f67085xf604e54a = cursor.getString(i17);
                    this.f319296d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f67088x958756b0 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f67095x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f67084xf47770e7 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f67083xf47749d7 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f67094xeb1a61d6 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f67090x90a9378 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319289J == hashCode) {
                try {
                    this.f67093x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f67091x2260084a = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (L == hashCode) {
                try {
                    this.f67086x886617a9 = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (M == hashCode) {
                try {
                    this.f67089x15b870c = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (N == hashCode) {
                try {
                    this.f67087x26b1b2e8 = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (P == hashCode) {
                try {
                    this.f67082x3ec1f6a2 = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (Q == hashCode) {
                try {
                    this.f67092x5e9a8090 = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavCdnInfo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (R == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319296d) {
            contentValues.put("dataId", this.f67085xf604e54a);
        }
        if (this.f319297e) {
            contentValues.put("favLocalId", java.lang.Long.valueOf(this.f67088x958756b0));
        }
        if (this.f319298f) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f67095x2262335f));
        }
        if (this.f319299g) {
            contentValues.put("cdnUrl", this.f67084xf47770e7);
        }
        if (this.f319300h) {
            contentValues.put("cdnKey", this.f67083xf47749d7);
        }
        if (this.f319301i) {
            contentValues.put("totalLen", java.lang.Integer.valueOf(this.f67094xeb1a61d6));
        }
        if (this.f319302m) {
            contentValues.put("offset", java.lang.Integer.valueOf(this.f67090x90a9378));
        }
        if (this.f319303n) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f67093x10a0fed7));
        }
        if (this.f319304o) {
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f67091x2260084a);
        }
        if (this.f319305p) {
            contentValues.put("dataType", java.lang.Integer.valueOf(this.f67086x886617a9));
        }
        if (this.f319306q) {
            contentValues.put("modifyTime", java.lang.Long.valueOf(this.f67089x15b870c));
        }
        if (this.f319307r) {
            contentValues.put("extFlag", java.lang.Integer.valueOf(this.f67087x26b1b2e8));
        }
        if (this.f319308s) {
            contentValues.put("attrFlag", java.lang.Long.valueOf(this.f67082x3ec1f6a2));
        }
        if (this.f319309t) {
            contentValues.put("retryTime", java.lang.Integer.valueOf(this.f67092x5e9a8090));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFavCdnInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FavCdnInfo ( ");
        l75.e0 e0Var = S;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : B) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavCdnInfo", "createTableSql %s", str2);
            k0Var.A("FavCdnInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FavCdnInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavCdnInfo", "updateTableSql %s", str3);
            k0Var.A("FavCdnInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavCdnInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return S;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return T;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67085xf604e54a;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319290u;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319290u.f434209a;
    }

    @Override // l75.f0
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "dataId", this.f67085xf604e54a);
            n51.f.b(jSONObject, "favLocalId", java.lang.Long.valueOf(this.f67088x958756b0));
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.f67095x2262335f));
            n51.f.b(jSONObject, "cdnUrl", this.f67084xf47770e7);
            n51.f.b(jSONObject, "cdnKey", this.f67083xf47749d7);
            n51.f.b(jSONObject, "totalLen", java.lang.Integer.valueOf(this.f67094xeb1a61d6));
            n51.f.b(jSONObject, "offset", java.lang.Integer.valueOf(this.f67090x90a9378));
            n51.f.b(jSONObject, "status", java.lang.Integer.valueOf(this.f67093x10a0fed7));
            n51.f.b(jSONObject, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f67091x2260084a);
            n51.f.b(jSONObject, "dataType", java.lang.Integer.valueOf(this.f67086x886617a9));
            n51.f.b(jSONObject, "modifyTime", java.lang.Long.valueOf(this.f67089x15b870c));
            n51.f.b(jSONObject, "extFlag", java.lang.Integer.valueOf(this.f67087x26b1b2e8));
            n51.f.b(jSONObject, "attrFlag", java.lang.Long.valueOf(this.f67082x3ec1f6a2));
            n51.f.b(jSONObject, "retryTime", java.lang.Integer.valueOf(this.f67092x5e9a8090));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("dataId")) {
            this.f67085xf604e54a = contentValues.getAsString("dataId");
            if (z17) {
                this.f319296d = true;
            }
        }
        if (contentValues.containsKey("favLocalId")) {
            this.f67088x958756b0 = contentValues.getAsLong("favLocalId").longValue();
            if (z17) {
                this.f319297e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f67095x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f319298f = true;
            }
        }
        if (contentValues.containsKey("cdnUrl")) {
            this.f67084xf47770e7 = contentValues.getAsString("cdnUrl");
            if (z17) {
                this.f319299g = true;
            }
        }
        if (contentValues.containsKey("cdnKey")) {
            this.f67083xf47749d7 = contentValues.getAsString("cdnKey");
            if (z17) {
                this.f319300h = true;
            }
        }
        if (contentValues.containsKey("totalLen")) {
            this.f67094xeb1a61d6 = contentValues.getAsInteger("totalLen").intValue();
            if (z17) {
                this.f319301i = true;
            }
        }
        if (contentValues.containsKey("offset")) {
            this.f67090x90a9378 = contentValues.getAsInteger("offset").intValue();
            if (z17) {
                this.f319302m = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f67093x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f319303n = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)) {
            this.f67091x2260084a = contentValues.getAsString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            if (z17) {
                this.f319304o = true;
            }
        }
        if (contentValues.containsKey("dataType")) {
            this.f67086x886617a9 = contentValues.getAsInteger("dataType").intValue();
            if (z17) {
                this.f319305p = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.f67089x15b870c = contentValues.getAsLong("modifyTime").longValue();
            if (z17) {
                this.f319306q = true;
            }
        }
        if (contentValues.containsKey("extFlag")) {
            this.f67087x26b1b2e8 = contentValues.getAsInteger("extFlag").intValue();
            if (z17) {
                this.f319307r = true;
            }
        }
        if (contentValues.containsKey("attrFlag")) {
            this.f67082x3ec1f6a2 = contentValues.getAsLong("attrFlag").longValue();
            if (z17) {
                this.f319308s = true;
            }
        }
        if (contentValues.containsKey("retryTime")) {
            this.f67092x5e9a8090 = contentValues.getAsInteger("retryTime").intValue();
            if (z17) {
                this.f319309t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
