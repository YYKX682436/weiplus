package rj4;

/* loaded from: classes11.dex */
public class e extends l75.f0 {
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
    public static final int f477822J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final l75.e0 T;
    public static final o75.e U;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.n0 f477823v;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.d f477824w;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.d f477825x;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.d f477826y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f477827z;

    /* renamed from: field_CreateTime */
    public int f76601x81959a6e;

    /* renamed from: field_DeleteInMsgList */
    public int f76602x68e4d00a;

    /* renamed from: field_Description */
    public java.lang.String f76603x685e8417;

    /* renamed from: field_DisplayName */
    public java.lang.String f76604x3554d688;

    /* renamed from: field_HashUserName */
    public java.lang.String f76605x8d8a3769;

    /* renamed from: field_HeadImgUrl */
    public java.lang.String f76606x75d1dd31;

    /* renamed from: field_LikeId */
    public java.lang.String f76607xcd7d4a17;

    /* renamed from: field_Notify */
    public int f76608xd13fb24e;

    /* renamed from: field_Option */
    public long f76609xd302a37a;

    /* renamed from: field_Read */
    public int f76610x225271db;

    /* renamed from: field_TextStatusId */
    public java.lang.String f76611x5493d43f;

    /* renamed from: field_TopicInfo */
    public byte[] f76612x2931c158;

    /* renamed from: field_Type */
    public int f76613x2253a77f;

    /* renamed from: field_Version */
    public int f76614xecc06273;

    /* renamed from: field_thumbUrl */
    public java.lang.String f76615x7b284d5e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f477828d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f477829e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f477830f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f477831g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f477832h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f477833i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f477834m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f477835n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f477836o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f477837p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f477838q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f477839r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f477840s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f477841t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f477842u = true;

    static {
        p75.n0 n0Var = new p75.n0("TextStatusLike");
        f477823v = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f477824w = new p75.d("TextStatusId", "string", tableName, "");
        f477825x = new p75.d("HashUserName", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f477826y = new p75.d("CreateTime", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f477827z = new p75.d("DeleteInMsgList", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        A = new p75.d("LikeId", "string", tableName, "");
        B = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TextStatusLike_TextStatusId_index ON TextStatusLike(TextStatusId)"};
        C = 1214784794;
        D = -2124511164;
        E = -912949683;
        F = -1129666356;
        G = -56677412;
        H = 2622298;
        I = -932289015;
        f477822J = -1955822743;
        K = 2543030;
        L = 1566917561;
        M = -1902930339;
        N = 424807759;
        P = 2016261304;
        Q = -1926269803;
        R = -2018895054;
        S = 108705909;
        T = m162519x3593deb(rj4.e.class);
        U = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m162519x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[15];
        java.lang.String[] strArr = new java.lang.String[16];
        e0Var.f398487c = strArr;
        strArr[0] = "TextStatusId";
        e0Var.f398488d.put("TextStatusId", "TEXT");
        e0Var.f398487c[1] = "HashUserName";
        e0Var.f398488d.put("HashUserName", "TEXT");
        e0Var.f398487c[2] = "DisplayName";
        e0Var.f398488d.put("DisplayName", "TEXT");
        e0Var.f398487c[3] = "HeadImgUrl";
        e0Var.f398488d.put("HeadImgUrl", "TEXT");
        e0Var.f398487c[4] = "Description";
        e0Var.f398488d.put("Description", "TEXT");
        e0Var.f398487c[5] = "Type";
        e0Var.f398488d.put("Type", "INTEGER");
        e0Var.f398487c[6] = "CreateTime";
        e0Var.f398488d.put("CreateTime", "INTEGER");
        e0Var.f398487c[7] = "Notify";
        e0Var.f398488d.put("Notify", "INTEGER");
        e0Var.f398487c[8] = "Read";
        e0Var.f398488d.put("Read", "INTEGER");
        e0Var.f398487c[9] = "thumbUrl";
        e0Var.f398488d.put("thumbUrl", "TEXT");
        e0Var.f398487c[10] = "TopicInfo";
        e0Var.f398488d.put("TopicInfo", "BLOB");
        e0Var.f398487c[11] = "DeleteInMsgList";
        e0Var.f398488d.put("DeleteInMsgList", "INTEGER");
        e0Var.f398487c[12] = "Version";
        e0Var.f398488d.put("Version", "INTEGER");
        e0Var.f398487c[13] = "Option";
        e0Var.f398488d.put("Option", "LONG");
        e0Var.f398487c[14] = "LikeId";
        e0Var.f398488d.put("LikeId", "TEXT");
        e0Var.f398487c[15] = "rowid";
        e0Var.f398489e = " TextStatusId TEXT,  HashUserName TEXT,  DisplayName TEXT,  HeadImgUrl TEXT,  Description TEXT,  Type INTEGER,  CreateTime INTEGER,  Notify INTEGER,  Read INTEGER,  thumbUrl TEXT,  TopicInfo BLOB,  DeleteInMsgList INTEGER,  Version INTEGER,  Option LONG,  LikeId TEXT";
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
            if (C == hashCode) {
                try {
                    this.f76611x5493d43f = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f76605x8d8a3769 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f76604x3554d688 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f76606x75d1dd31 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f76603x685e8417 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f76613x2253a77f = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f76601x81959a6e = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477822J == hashCode) {
                try {
                    this.f76608xd13fb24e = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f76610x225271db = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (L == hashCode) {
                try {
                    this.f76615x7b284d5e = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (M == hashCode) {
                try {
                    this.f76612x2931c158 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (N == hashCode) {
                try {
                    this.f76602x68e4d00a = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (P == hashCode) {
                try {
                    this.f76614xecc06273 = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (Q == hashCode) {
                try {
                    this.f76609xd302a37a = cursor.getLong(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (R == hashCode) {
                try {
                    this.f76607xcd7d4a17 = cursor.getString(i17);
                } catch (java.lang.Throwable th20) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusLike", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (S == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f477828d) {
            contentValues.put("TextStatusId", this.f76611x5493d43f);
        }
        if (this.f477829e) {
            contentValues.put("HashUserName", this.f76605x8d8a3769);
        }
        if (this.f477830f) {
            contentValues.put("DisplayName", this.f76604x3554d688);
        }
        if (this.f477831g) {
            contentValues.put("HeadImgUrl", this.f76606x75d1dd31);
        }
        if (this.f477832h) {
            contentValues.put("Description", this.f76603x685e8417);
        }
        if (this.f477833i) {
            contentValues.put("Type", java.lang.Integer.valueOf(this.f76613x2253a77f));
        }
        if (this.f477834m) {
            contentValues.put("CreateTime", java.lang.Integer.valueOf(this.f76601x81959a6e));
        }
        if (this.f477835n) {
            contentValues.put("Notify", java.lang.Integer.valueOf(this.f76608xd13fb24e));
        }
        if (this.f477836o) {
            contentValues.put("Read", java.lang.Integer.valueOf(this.f76610x225271db));
        }
        if (this.f477837p) {
            contentValues.put("thumbUrl", this.f76615x7b284d5e);
        }
        if (this.f477838q) {
            contentValues.put("TopicInfo", this.f76612x2931c158);
        }
        if (this.f477839r) {
            contentValues.put("DeleteInMsgList", java.lang.Integer.valueOf(this.f76602x68e4d00a));
        }
        if (this.f477840s) {
            contentValues.put("Version", java.lang.Integer.valueOf(this.f76614xecc06273));
        }
        if (this.f477841t) {
            contentValues.put("Option", java.lang.Long.valueOf(this.f76609xd302a37a));
        }
        if (this.f477842u) {
            contentValues.put("LikeId", this.f76607xcd7d4a17);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseTextStatusLike", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TextStatusLike ( ");
        l75.e0 e0Var = T;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : B) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTextStatusLike", "createTableSql %s", str2);
            k0Var.A("TextStatusLike", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "TextStatusLike", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTextStatusLike", "updateTableSql %s", str3);
            k0Var.A("TextStatusLike", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTextStatusLike", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return T;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return U;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f477823v;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f477823v.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("TextStatusId")) {
            this.f76611x5493d43f = contentValues.getAsString("TextStatusId");
            if (z17) {
                this.f477828d = true;
            }
        }
        if (contentValues.containsKey("HashUserName")) {
            this.f76605x8d8a3769 = contentValues.getAsString("HashUserName");
            if (z17) {
                this.f477829e = true;
            }
        }
        if (contentValues.containsKey("DisplayName")) {
            this.f76604x3554d688 = contentValues.getAsString("DisplayName");
            if (z17) {
                this.f477830f = true;
            }
        }
        if (contentValues.containsKey("HeadImgUrl")) {
            this.f76606x75d1dd31 = contentValues.getAsString("HeadImgUrl");
            if (z17) {
                this.f477831g = true;
            }
        }
        if (contentValues.containsKey("Description")) {
            this.f76603x685e8417 = contentValues.getAsString("Description");
            if (z17) {
                this.f477832h = true;
            }
        }
        if (contentValues.containsKey("Type")) {
            this.f76613x2253a77f = contentValues.getAsInteger("Type").intValue();
            if (z17) {
                this.f477833i = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.f76601x81959a6e = contentValues.getAsInteger("CreateTime").intValue();
            if (z17) {
                this.f477834m = true;
            }
        }
        if (contentValues.containsKey("Notify")) {
            this.f76608xd13fb24e = contentValues.getAsInteger("Notify").intValue();
            if (z17) {
                this.f477835n = true;
            }
        }
        if (contentValues.containsKey("Read")) {
            this.f76610x225271db = contentValues.getAsInteger("Read").intValue();
            if (z17) {
                this.f477836o = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.f76615x7b284d5e = contentValues.getAsString("thumbUrl");
            if (z17) {
                this.f477837p = true;
            }
        }
        if (contentValues.containsKey("TopicInfo")) {
            this.f76612x2931c158 = contentValues.getAsByteArray("TopicInfo");
            if (z17) {
                this.f477838q = true;
            }
        }
        if (contentValues.containsKey("DeleteInMsgList")) {
            this.f76602x68e4d00a = contentValues.getAsInteger("DeleteInMsgList").intValue();
            if (z17) {
                this.f477839r = true;
            }
        }
        if (contentValues.containsKey("Version")) {
            this.f76614xecc06273 = contentValues.getAsInteger("Version").intValue();
            if (z17) {
                this.f477840s = true;
            }
        }
        if (contentValues.containsKey("Option")) {
            this.f76609xd302a37a = contentValues.getAsLong("Option").longValue();
            if (z17) {
                this.f477841t = true;
            }
        }
        if (contentValues.containsKey("LikeId")) {
            this.f76607xcd7d4a17 = contentValues.getAsString("LikeId");
            if (z17) {
                this.f477842u = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
