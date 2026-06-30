package dm;

/* loaded from: classes8.dex */
public class p2 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f320628n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f320629o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320630p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320631q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320632r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320633s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320634t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320635u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320636v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320637w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f320638x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f320639y;

    /* renamed from: field_appMsgSign */
    public java.lang.String f67880x4cbf2be2;

    /* renamed from: field_giftMsgId */
    public java.lang.String f67881xbba2e427;

    /* renamed from: field_hasMsgClicked */
    public boolean f67882xa281e91b;

    /* renamed from: field_hasOpenPagPlayed */
    public boolean f67883xffb7180a;

    /* renamed from: field_msgLocalId */
    public long f67884x9a279b8a;

    /* renamed from: field_talkerUserName */
    public java.lang.String f67885x3e123854;

    /* renamed from: field_userName */
    public java.lang.String f67886xdde069b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320640d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320641e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320642f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320643g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320644h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320645i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320646m = true;

    static {
        p75.n0 n0Var = new p75.n0("EcsGiftMsgRecord");
        f320628n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320629o = new java.lang.String[0];
        f320630p = 553957676;
        f320631q = -520067291;
        f320632r = -266666762;
        f320633s = 691516320;
        f320634t = -1911177617;
        f320635u = -1818757251;
        f320636v = 1559331685;
        f320637w = 108705909;
        f320638x = m125386x3593deb(dm.p2.class);
        f320639y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125386x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "giftMsgId";
        e0Var.f398488d.put("giftMsgId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "giftMsgId";
        e0Var.f398487c[1] = "msgLocalId";
        e0Var.f398488d.put("msgLocalId", "LONG");
        e0Var.f398487c[2] = "userName";
        e0Var.f398488d.put("userName", "TEXT");
        e0Var.f398487c[3] = "hasMsgClicked";
        e0Var.f398488d.put("hasMsgClicked", "INTEGER");
        e0Var.f398487c[4] = "talkerUserName";
        e0Var.f398488d.put("talkerUserName", "TEXT default '' ");
        e0Var.f398487c[5] = "appMsgSign";
        e0Var.f398488d.put("appMsgSign", "TEXT default '' ");
        e0Var.f398487c[6] = "hasOpenPagPlayed";
        e0Var.f398488d.put("hasOpenPagPlayed", "INTEGER");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " giftMsgId TEXT PRIMARY KEY ,  msgLocalId LONG,  userName TEXT,  hasMsgClicked INTEGER,  talkerUserName TEXT default '' ,  appMsgSign TEXT default '' ,  hasOpenPagPlayed INTEGER";
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
            if (f320630p == hashCode) {
                try {
                    this.f67881xbba2e427 = cursor.getString(i17);
                    this.f320640d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsGiftMsgRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320631q == hashCode) {
                try {
                    this.f67884x9a279b8a = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsGiftMsgRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320632r == hashCode) {
                try {
                    this.f67886xdde069b = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsGiftMsgRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320633s == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f67882xa281e91b = z17;
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsGiftMsgRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320634t == hashCode) {
                try {
                    this.f67885x3e123854 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsGiftMsgRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320635u == hashCode) {
                try {
                    this.f67880x4cbf2be2 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsGiftMsgRecord", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320636v == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f67883xffb7180a = z17;
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsGiftMsgRecord", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320637w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320640d) {
            contentValues.put("giftMsgId", this.f67881xbba2e427);
        }
        if (this.f320641e) {
            contentValues.put("msgLocalId", java.lang.Long.valueOf(this.f67884x9a279b8a));
        }
        if (this.f320642f) {
            contentValues.put("userName", this.f67886xdde069b);
        }
        if (this.f320643g) {
            if (this.f67882xa281e91b) {
                contentValues.put("hasMsgClicked", (java.lang.Integer) 1);
            } else {
                contentValues.put("hasMsgClicked", (java.lang.Integer) 0);
            }
        }
        if (this.f67885x3e123854 == null) {
            this.f67885x3e123854 = "";
        }
        if (this.f320644h) {
            contentValues.put("talkerUserName", this.f67885x3e123854);
        }
        if (this.f67880x4cbf2be2 == null) {
            this.f67880x4cbf2be2 = "";
        }
        if (this.f320645i) {
            contentValues.put("appMsgSign", this.f67880x4cbf2be2);
        }
        if (this.f320646m) {
            if (this.f67883xffb7180a) {
                contentValues.put("hasOpenPagPlayed", (java.lang.Integer) 1);
            } else {
                contentValues.put("hasOpenPagPlayed", (java.lang.Integer) 0);
            }
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseEcsGiftMsgRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EcsGiftMsgRecord ( ");
        l75.e0 e0Var = f320638x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320629o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEcsGiftMsgRecord", "createTableSql %s", str2);
            k0Var.A("EcsGiftMsgRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "EcsGiftMsgRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEcsGiftMsgRecord", "updateTableSql %s", str3);
            k0Var.A("EcsGiftMsgRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEcsGiftMsgRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320638x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320639y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67881xbba2e427;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320628n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320628n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("giftMsgId")) {
            this.f67881xbba2e427 = contentValues.getAsString("giftMsgId");
            if (z17) {
                this.f320640d = true;
            }
        }
        if (contentValues.containsKey("msgLocalId")) {
            this.f67884x9a279b8a = contentValues.getAsLong("msgLocalId").longValue();
            if (z17) {
                this.f320641e = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.f67886xdde069b = contentValues.getAsString("userName");
            if (z17) {
                this.f320642f = true;
            }
        }
        if (contentValues.containsKey("hasMsgClicked")) {
            this.f67882xa281e91b = contentValues.getAsInteger("hasMsgClicked").intValue() != 0;
            if (z17) {
                this.f320643g = true;
            }
        }
        if (contentValues.containsKey("talkerUserName")) {
            this.f67885x3e123854 = contentValues.getAsString("talkerUserName");
            if (z17) {
                this.f320644h = true;
            }
        }
        if (contentValues.containsKey("appMsgSign")) {
            this.f67880x4cbf2be2 = contentValues.getAsString("appMsgSign");
            if (z17) {
                this.f320645i = true;
            }
        }
        if (contentValues.containsKey("hasOpenPagPlayed")) {
            this.f67883xffb7180a = contentValues.getAsInteger("hasOpenPagPlayed").intValue() != 0;
            if (z17) {
                this.f320646m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
