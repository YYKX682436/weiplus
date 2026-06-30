package dm;

/* loaded from: classes12.dex */
public class ka extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f319628q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f319629r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319630s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319631t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319632u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319633v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319634w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319635x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319636y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f319637z;

    /* renamed from: field_cnValue */
    public java.lang.String f67249xaa3a4d81;

    /* renamed from: field_eggIndex */
    public int f67250x1636f572;

    /* renamed from: field_enValue */
    public java.lang.String f67251x1406c403;

    /* renamed from: field_fileName */
    public java.lang.String f67252xf1e8cfcc;

    /* renamed from: field_flag */
    public int f67253x225ba391;

    /* renamed from: field_key */
    public java.lang.String f67254x4b6e619a;

    /* renamed from: field_position */
    public int f67255x4a55a2ce;

    /* renamed from: field_qqValue */
    public java.lang.String f67256x93f014ec;

    /* renamed from: field_thValue */
    public java.lang.String f67257x23472918;

    /* renamed from: field_twValue */
    public java.lang.String f67258x3cdfda69;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319638d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319639e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319640f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319641g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319642h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319643i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319644m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319645n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f319646o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f319647p = true;

    static {
        p75.n0 n0Var = new p75.n0("SmileyInfo");
        f319628q = n0Var;
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
        f319629r = new java.lang.String[0];
        f319630s = 106079;
        f319631t = 900177862;
        f319632u = 526214961;
        f319633v = -934466386;
        f319634w = -1619782072;
        f319635x = -1363903651;
        f319636y = -735721945;
        f319637z = -126620723;
        A = 747804969;
        B = 3145580;
        C = 108705909;
        D = m125177x3593deb(dm.ka.class);
        E = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125177x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f398487c = strArr;
        strArr[0] = "key";
        e0Var.f398488d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "key";
        e0Var.f398487c[1] = "cnValue";
        e0Var.f398488d.put("cnValue", "TEXT");
        e0Var.f398487c[2] = "qqValue";
        e0Var.f398488d.put("qqValue", "TEXT");
        e0Var.f398487c[3] = "twValue";
        e0Var.f398488d.put("twValue", "TEXT");
        e0Var.f398487c[4] = "enValue";
        e0Var.f398488d.put("enValue", "TEXT");
        e0Var.f398487c[5] = "thValue";
        e0Var.f398488d.put("thValue", "TEXT");
        e0Var.f398487c[6] = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207;
        e0Var.f398488d.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, "TEXT");
        e0Var.f398487c[7] = "eggIndex";
        e0Var.f398488d.put("eggIndex", "INTEGER default '-1' ");
        e0Var.f398487c[8] = "position";
        e0Var.f398488d.put("position", "INTEGER default '-1' ");
        e0Var.f398487c[9] = "flag";
        e0Var.f398488d.put("flag", "INTEGER");
        e0Var.f398487c[10] = "rowid";
        e0Var.f398489e = " key TEXT PRIMARY KEY ,  cnValue TEXT,  qqValue TEXT,  twValue TEXT,  enValue TEXT,  thValue TEXT,  fileName TEXT,  eggIndex INTEGER default '-1' ,  position INTEGER default '-1' ,  flag INTEGER";
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
            if (f319630s == hashCode) {
                try {
                    this.f67254x4b6e619a = cursor.getString(i17);
                    this.f319638d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSmileyInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319631t == hashCode) {
                try {
                    this.f67249xaa3a4d81 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSmileyInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319632u == hashCode) {
                try {
                    this.f67256x93f014ec = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSmileyInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319633v == hashCode) {
                try {
                    this.f67258x3cdfda69 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSmileyInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319634w == hashCode) {
                try {
                    this.f67251x1406c403 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSmileyInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319635x == hashCode) {
                try {
                    this.f67257x23472918 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSmileyInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319636y == hashCode) {
                try {
                    this.f67252xf1e8cfcc = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSmileyInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319637z == hashCode) {
                try {
                    this.f67250x1636f572 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSmileyInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67255x4a55a2ce = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSmileyInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67253x225ba391 = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSmileyInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319638d) {
            contentValues.put("key", this.f67254x4b6e619a);
        }
        if (this.f319639e) {
            contentValues.put("cnValue", this.f67249xaa3a4d81);
        }
        if (this.f319640f) {
            contentValues.put("qqValue", this.f67256x93f014ec);
        }
        if (this.f319641g) {
            contentValues.put("twValue", this.f67258x3cdfda69);
        }
        if (this.f319642h) {
            contentValues.put("enValue", this.f67251x1406c403);
        }
        if (this.f319643i) {
            contentValues.put("thValue", this.f67257x23472918);
        }
        if (this.f319644m) {
            contentValues.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, this.f67252xf1e8cfcc);
        }
        if (this.f319645n) {
            contentValues.put("eggIndex", java.lang.Integer.valueOf(this.f67250x1636f572));
        }
        if (this.f319646o) {
            contentValues.put("position", java.lang.Integer.valueOf(this.f67255x4a55a2ce));
        }
        if (this.f319647p) {
            contentValues.put("flag", java.lang.Integer.valueOf(this.f67253x225ba391));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSmileyInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SmileyInfo ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319629r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSmileyInfo", "createTableSql %s", str2);
            k0Var.A("SmileyInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "SmileyInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSmileyInfo", "updateTableSql %s", str3);
            k0Var.A("SmileyInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSmileyInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return D;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return E;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67254x4b6e619a;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319628q;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319628q.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.f67254x4b6e619a = contentValues.getAsString("key");
            if (z17) {
                this.f319638d = true;
            }
        }
        if (contentValues.containsKey("cnValue")) {
            this.f67249xaa3a4d81 = contentValues.getAsString("cnValue");
            if (z17) {
                this.f319639e = true;
            }
        }
        if (contentValues.containsKey("qqValue")) {
            this.f67256x93f014ec = contentValues.getAsString("qqValue");
            if (z17) {
                this.f319640f = true;
            }
        }
        if (contentValues.containsKey("twValue")) {
            this.f67258x3cdfda69 = contentValues.getAsString("twValue");
            if (z17) {
                this.f319641g = true;
            }
        }
        if (contentValues.containsKey("enValue")) {
            this.f67251x1406c403 = contentValues.getAsString("enValue");
            if (z17) {
                this.f319642h = true;
            }
        }
        if (contentValues.containsKey("thValue")) {
            this.f67257x23472918 = contentValues.getAsString("thValue");
            if (z17) {
                this.f319643i = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207)) {
            this.f67252xf1e8cfcc = contentValues.getAsString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
            if (z17) {
                this.f319644m = true;
            }
        }
        if (contentValues.containsKey("eggIndex")) {
            this.f67250x1636f572 = contentValues.getAsInteger("eggIndex").intValue();
            if (z17) {
                this.f319645n = true;
            }
        }
        if (contentValues.containsKey("position")) {
            this.f67255x4a55a2ce = contentValues.getAsInteger("position").intValue();
            if (z17) {
                this.f319646o = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.f67253x225ba391 = contentValues.getAsInteger("flag").intValue();
            if (z17) {
                this.f319647p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
