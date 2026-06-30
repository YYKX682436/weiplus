package dm;

/* loaded from: classes11.dex */
public class fa extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final l75.e0 F;
    public static final o75.e G;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.n0 f318450r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f318451s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318452t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318453u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318454v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318455w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318456x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318457y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318458z;

    /* renamed from: field_content */
    public java.lang.String f66538xad49e234;

    /* renamed from: field_createtime */
    public long f66539xad24a2e;

    /* renamed from: field_imgpath */
    public java.lang.String f66540xe6e11023;

    /* renamed from: field_isSend */
    public int f66541xff7bdab7;

    /* renamed from: field_sayhicontent */
    public java.lang.String f66542x7236dff2;

    /* renamed from: field_sayhiuser */
    public java.lang.String f66543x49f69af2;

    /* renamed from: field_scene */
    public int f66544x29cbf907;

    /* renamed from: field_status */
    public int f66545x10a0fed7;

    /* renamed from: field_svrid */
    public long f66546x29d4cc45;

    /* renamed from: field_talker */
    public java.lang.String f66547x114ef53e;

    /* renamed from: field_type */
    public int f66548x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318459d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318460e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318461f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318462g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318463h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318464i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318465m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318466n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f318467o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f318468p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f318469q = true;

    static {
        p75.n0 n0Var = new p75.n0("ShakeVerifyMessage");
        f318450r = n0Var;
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
        f318451s = new java.lang.String[0];
        f318452t = 109833162;
        f318453u = -892481550;
        f318454v = 3575610;
        f318455w = 109254796;
        f318456x = 1370166729;
        f318457y = -881080743;
        f318458z = 951530617;
        A = -1353158665;
        B = 1712009421;
        C = 1917739624;
        D = -1180128302;
        E = 108705909;
        F = m124983x3593deb(dm.fa.class);
        G = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124983x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[11];
        java.lang.String[] strArr = new java.lang.String[12];
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
        e0Var.f398487c[11] = "rowid";
        e0Var.f398489e = " svrid LONG default '0'  PRIMARY KEY ,  status INTEGER,  type INTEGER,  scene INTEGER,  createtime LONG,  talker TEXT,  content TEXT,  sayhiuser TEXT,  sayhicontent TEXT,  imgpath TEXT,  isSend INTEGER";
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
            if (f318452t == hashCode) {
                try {
                    this.f66546x29d4cc45 = cursor.getLong(i17);
                    this.f318459d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeVerifyMessage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318453u == hashCode) {
                try {
                    this.f66545x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeVerifyMessage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318454v == hashCode) {
                try {
                    this.f66548x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeVerifyMessage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318455w == hashCode) {
                try {
                    this.f66544x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeVerifyMessage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318456x == hashCode) {
                try {
                    this.f66539xad24a2e = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeVerifyMessage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318457y == hashCode) {
                try {
                    this.f66547x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeVerifyMessage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318458z == hashCode) {
                try {
                    this.f66538xad49e234 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeVerifyMessage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f66543x49f69af2 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeVerifyMessage", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f66542x7236dff2 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeVerifyMessage", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f66540xe6e11023 = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeVerifyMessage", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f66541xff7bdab7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeVerifyMessage", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318459d) {
            contentValues.put("svrid", java.lang.Long.valueOf(this.f66546x29d4cc45));
        }
        if (this.f318460e) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f66545x10a0fed7));
        }
        if (this.f318461f) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f66548x2262335f));
        }
        if (this.f318462g) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f66544x29cbf907));
        }
        if (this.f318463h) {
            contentValues.put("createtime", java.lang.Long.valueOf(this.f66539xad24a2e));
        }
        if (this.f318464i) {
            contentValues.put("talker", this.f66547x114ef53e);
        }
        if (this.f318465m) {
            contentValues.put("content", this.f66538xad49e234);
        }
        if (this.f318466n) {
            contentValues.put("sayhiuser", this.f66543x49f69af2);
        }
        if (this.f318467o) {
            contentValues.put("sayhicontent", this.f66542x7236dff2);
        }
        if (this.f318468p) {
            contentValues.put("imgpath", this.f66540xe6e11023);
        }
        if (this.f318469q) {
            contentValues.put("isSend", java.lang.Integer.valueOf(this.f66541xff7bdab7));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseShakeVerifyMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ShakeVerifyMessage ( ");
        l75.e0 e0Var = F;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318451s) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShakeVerifyMessage", "createTableSql %s", str2);
            k0Var.A("ShakeVerifyMessage", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ShakeVerifyMessage", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShakeVerifyMessage", "updateTableSql %s", str3);
            k0Var.A("ShakeVerifyMessage", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShakeVerifyMessage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return F;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return G;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f66546x29d4cc45);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318450r;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318450r.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "svrid", java.lang.Long.valueOf(this.f66546x29d4cc45));
            n51.f.b(jSONObject, "status", java.lang.Integer.valueOf(this.f66545x10a0fed7));
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.f66548x2262335f));
            n51.f.b(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f66544x29cbf907));
            n51.f.b(jSONObject, "createtime", java.lang.Long.valueOf(this.f66539xad24a2e));
            n51.f.b(jSONObject, "talker", this.f66547x114ef53e);
            n51.f.b(jSONObject, "content", this.f66538xad49e234);
            n51.f.b(jSONObject, "sayhiuser", this.f66543x49f69af2);
            n51.f.b(jSONObject, "sayhicontent", this.f66542x7236dff2);
            n51.f.b(jSONObject, "imgpath", this.f66540xe6e11023);
            n51.f.b(jSONObject, "isSend", java.lang.Integer.valueOf(this.f66541xff7bdab7));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("svrid")) {
            this.f66546x29d4cc45 = contentValues.getAsLong("svrid").longValue();
            if (z17) {
                this.f318459d = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f66545x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f318460e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f66548x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f318461f = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f66544x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f318462g = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.f66539xad24a2e = contentValues.getAsLong("createtime").longValue();
            if (z17) {
                this.f318463h = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f66547x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f318464i = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.f66538xad49e234 = contentValues.getAsString("content");
            if (z17) {
                this.f318465m = true;
            }
        }
        if (contentValues.containsKey("sayhiuser")) {
            this.f66543x49f69af2 = contentValues.getAsString("sayhiuser");
            if (z17) {
                this.f318466n = true;
            }
        }
        if (contentValues.containsKey("sayhicontent")) {
            this.f66542x7236dff2 = contentValues.getAsString("sayhicontent");
            if (z17) {
                this.f318467o = true;
            }
        }
        if (contentValues.containsKey("imgpath")) {
            this.f66540xe6e11023 = contentValues.getAsString("imgpath");
            if (z17) {
                this.f318468p = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.f66541xff7bdab7 = contentValues.getAsInteger("isSend").intValue();
            if (z17) {
                this.f318469q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
