package dm;

/* loaded from: classes11.dex */
public class f7 extends l75.f0 {
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
    public static final int f318390J;
    public static final int K;
    public static final l75.e0 L;
    public static final o75.e M;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.n0 f318391u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f318392v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318393w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318394x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318395y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318396z;

    /* renamed from: field_content */
    public java.lang.String f66507xad49e234;

    /* renamed from: field_createtime */
    public long f66508xad24a2e;

    /* renamed from: field_flag */
    public int f66509x225ba391;

    /* renamed from: field_imgpath */
    public java.lang.String f66510xe6e11023;

    /* renamed from: field_isSend */
    public int f66511xff7bdab7;

    /* renamed from: field_sayhicontent */
    public java.lang.String f66512x7236dff2;

    /* renamed from: field_sayhiencryptuser */
    public java.lang.String f66513xe76baaa9;

    /* renamed from: field_sayhiuser */
    public java.lang.String f66514x49f69af2;

    /* renamed from: field_scene */
    public int f66515x29cbf907;

    /* renamed from: field_status */
    public int f66516x10a0fed7;

    /* renamed from: field_svrid */
    public long f66517x29d4cc45;

    /* renamed from: field_talker */
    public java.lang.String f66518x114ef53e;

    /* renamed from: field_ticket */
    public java.lang.String f66519x11bb99f1;

    /* renamed from: field_type */
    public int f66520x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318397d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318398e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318399f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318400g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318401h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318402i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318403m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318404n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f318405o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f318406p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f318407q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f318408r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f318409s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f318410t = true;

    static {
        p75.n0 n0Var = new p75.n0("LBSVerifyMessage");
        f318391u = n0Var;
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
        f318392v = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS lbsverifymessage_unread_index ON LBSVerifyMessage(status)", "CREATE INDEX IF NOT EXISTS lbsverifymessage_createtimeIndex ON LBSVerifyMessage(createtime)"};
        f318393w = 109833162;
        f318394x = -892481550;
        f318395y = 3575610;
        f318396z = 109254796;
        A = 1370166729;
        B = -881080743;
        C = 951530617;
        D = -1353158665;
        E = 1712009421;
        F = 1917739624;
        G = -1180128302;
        H = 1151735300;
        I = -873960692;
        f318390J = 3145580;
        K = 108705909;
        L = m124977x3593deb(dm.f7.class);
        M = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124977x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[14];
        java.lang.String[] strArr = new java.lang.String[15];
        e0Var.f398487c = strArr;
        strArr[0] = "svrid";
        e0Var.f398488d.put("svrid", "LONG default '0'  PRIMARY KEY ");
        e0Var.f398486b = "svrid";
        e0Var.f398487c[1] = "status";
        e0Var.f398488d.put("status", "INTEGER");
        e0Var.f398487c[2] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[3] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "INTEGER");
        e0Var.f398487c[4] = "createtime";
        e0Var.f398488d.put("createtime", "LONG");
        e0Var.f398487c[5] = "talker";
        e0Var.f398488d.put("talker", "TEXT");
        e0Var.f398487c[6] = "content";
        e0Var.f398488d.put("content", "TEXT");
        e0Var.f398487c[7] = "sayhiuser";
        e0Var.f398488d.put("sayhiuser", "TEXT");
        e0Var.f398487c[8] = "sayhicontent";
        e0Var.f398488d.put("sayhicontent", "TEXT");
        e0Var.f398487c[9] = "imgpath";
        e0Var.f398488d.put("imgpath", "TEXT");
        e0Var.f398487c[10] = "isSend";
        e0Var.f398488d.put("isSend", "INTEGER");
        e0Var.f398487c[11] = "sayhiencryptuser";
        e0Var.f398488d.put("sayhiencryptuser", "TEXT");
        e0Var.f398487c[12] = "ticket";
        e0Var.f398488d.put("ticket", "TEXT");
        e0Var.f398487c[13] = "flag";
        e0Var.f398488d.put("flag", "INTEGER");
        e0Var.f398487c[14] = "rowid";
        e0Var.f398489e = " svrid LONG default '0'  PRIMARY KEY ,  status INTEGER,  type INTEGER,  scene INTEGER,  createtime LONG,  talker TEXT,  content TEXT,  sayhiuser TEXT,  sayhicontent TEXT,  imgpath TEXT,  isSend INTEGER,  sayhiencryptuser TEXT,  ticket TEXT,  flag INTEGER";
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
            if (f318393w == hashCode) {
                try {
                    this.f66517x29d4cc45 = cursor.getLong(i17);
                    this.f318397d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318394x == hashCode) {
                try {
                    this.f66516x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318395y == hashCode) {
                try {
                    this.f66520x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318396z == hashCode) {
                try {
                    this.f66515x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f66508xad24a2e = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f66518x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f66507xad49e234 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f66514x49f69af2 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f66512x7236dff2 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f66510xe6e11023 = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f66511xff7bdab7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f66513xe76baaa9 = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f66519x11bb99f1 = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318390J == hashCode) {
                try {
                    this.f66509x225ba391 = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLBSVerifyMessage", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318397d) {
            contentValues.put("svrid", java.lang.Long.valueOf(this.f66517x29d4cc45));
        }
        if (this.f318398e) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f66516x10a0fed7));
        }
        if (this.f318399f) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f66520x2262335f));
        }
        if (this.f318400g) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f66515x29cbf907));
        }
        if (this.f318401h) {
            contentValues.put("createtime", java.lang.Long.valueOf(this.f66508xad24a2e));
        }
        if (this.f318402i) {
            contentValues.put("talker", this.f66518x114ef53e);
        }
        if (this.f318403m) {
            contentValues.put("content", this.f66507xad49e234);
        }
        if (this.f318404n) {
            contentValues.put("sayhiuser", this.f66514x49f69af2);
        }
        if (this.f318405o) {
            contentValues.put("sayhicontent", this.f66512x7236dff2);
        }
        if (this.f318406p) {
            contentValues.put("imgpath", this.f66510xe6e11023);
        }
        if (this.f318407q) {
            contentValues.put("isSend", java.lang.Integer.valueOf(this.f66511xff7bdab7));
        }
        if (this.f318408r) {
            contentValues.put("sayhiencryptuser", this.f66513xe76baaa9);
        }
        if (this.f318409s) {
            contentValues.put("ticket", this.f66519x11bb99f1);
        }
        if (this.f318410t) {
            contentValues.put("flag", java.lang.Integer.valueOf(this.f66509x225ba391));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLBSVerifyMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LBSVerifyMessage ( ");
        l75.e0 e0Var = L;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318392v) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLBSVerifyMessage", "createTableSql %s", str2);
            k0Var.A("LBSVerifyMessage", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LBSVerifyMessage", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLBSVerifyMessage", "updateTableSql %s", str3);
            k0Var.A("LBSVerifyMessage", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLBSVerifyMessage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return L;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return M;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f66517x29d4cc45);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318391u;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318391u.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "svrid", java.lang.Long.valueOf(this.f66517x29d4cc45));
            n51.f.b(jSONObject, "status", java.lang.Integer.valueOf(this.f66516x10a0fed7));
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.f66520x2262335f));
            n51.f.b(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f66515x29cbf907));
            n51.f.b(jSONObject, "createtime", java.lang.Long.valueOf(this.f66508xad24a2e));
            n51.f.b(jSONObject, "talker", this.f66518x114ef53e);
            n51.f.b(jSONObject, "content", this.f66507xad49e234);
            n51.f.b(jSONObject, "sayhiuser", this.f66514x49f69af2);
            n51.f.b(jSONObject, "sayhicontent", this.f66512x7236dff2);
            n51.f.b(jSONObject, "imgpath", this.f66510xe6e11023);
            n51.f.b(jSONObject, "isSend", java.lang.Integer.valueOf(this.f66511xff7bdab7));
            n51.f.b(jSONObject, "sayhiencryptuser", this.f66513xe76baaa9);
            n51.f.b(jSONObject, "ticket", this.f66519x11bb99f1);
            n51.f.b(jSONObject, "flag", java.lang.Integer.valueOf(this.f66509x225ba391));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("svrid")) {
            this.f66517x29d4cc45 = contentValues.getAsLong("svrid").longValue();
            if (z17) {
                this.f318397d = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f66516x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f318398e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f66520x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f318399f = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f66515x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f318400g = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.f66508xad24a2e = contentValues.getAsLong("createtime").longValue();
            if (z17) {
                this.f318401h = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f66518x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f318402i = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.f66507xad49e234 = contentValues.getAsString("content");
            if (z17) {
                this.f318403m = true;
            }
        }
        if (contentValues.containsKey("sayhiuser")) {
            this.f66514x49f69af2 = contentValues.getAsString("sayhiuser");
            if (z17) {
                this.f318404n = true;
            }
        }
        if (contentValues.containsKey("sayhicontent")) {
            this.f66512x7236dff2 = contentValues.getAsString("sayhicontent");
            if (z17) {
                this.f318405o = true;
            }
        }
        if (contentValues.containsKey("imgpath")) {
            this.f66510xe6e11023 = contentValues.getAsString("imgpath");
            if (z17) {
                this.f318406p = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.f66511xff7bdab7 = contentValues.getAsInteger("isSend").intValue();
            if (z17) {
                this.f318407q = true;
            }
        }
        if (contentValues.containsKey("sayhiencryptuser")) {
            this.f66513xe76baaa9 = contentValues.getAsString("sayhiencryptuser");
            if (z17) {
                this.f318408r = true;
            }
        }
        if (contentValues.containsKey("ticket")) {
            this.f66519x11bb99f1 = contentValues.getAsString("ticket");
            if (z17) {
                this.f318409s = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.f66509x225ba391 = contentValues.getAsInteger("flag").intValue();
            if (z17) {
                this.f318410t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
