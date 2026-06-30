package dm;

/* loaded from: classes12.dex */
public class l3 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f319741p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f319742q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f319743r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f319744s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319745t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319746u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319747v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319748w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319749x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319750y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f319751z;

    /* renamed from: field_clientVersion */
    private java.lang.String f67312xa74c2c08;

    /* renamed from: field_delFlag */
    private int f67313xd0eea7d2;

    /* renamed from: field_delSource */
    private java.lang.String f67314x66468f01;

    /* renamed from: field_delTime */
    private long f67315xd0f4fb33;

    /* renamed from: field_delType */
    private int f67316xd0f537a0;

    /* renamed from: field_favId */
    private int f67317x29141a11;

    /* renamed from: field_itemType */
    private int f67318x63f2c692;

    /* renamed from: field_oriXml */
    private java.lang.String f67319x9b4a636;

    /* renamed from: field_updateTime */
    private long f67320xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319752d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319753e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319754f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319755g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319756h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319757i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319758m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319759n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f319760o = false;

    static {
        p75.n0 n0Var = new p75.n0("FavDelInfo");
        f319741p = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319742q = new p75.d("favId", "int", tableName, "");
        f319743r = new p75.d("delTime", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319744s = new java.lang.String[0];
        f319745t = 97204630;
        f319746u = 1549946232;
        f319747v = -878156794;
        f319748w = -1008634031;
        f319749x = 771880589;
        f319750y = 1549961701;
        f319751z = 1177533677;
        A = -295931082;
        B = 1549531671;
        C = 108705909;
        D = m125193x3593deb(dm.l3.class);
        E = new o75.e();
    }

    /* renamed from: createTable */
    public static void m125192xe1f0e832(l75.k0 k0Var) {
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFavDelInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FavDelInfo ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319744s) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavDelInfo", "createTableSql %s", str2);
            k0Var.A("FavDelInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FavDelInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavDelInfo", "updateTableSql %s", str3);
            k0Var.A("FavDelInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavDelInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125193x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "favId";
        e0Var.f398488d.put("favId", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "favId";
        e0Var.f398487c[1] = "delTime";
        e0Var.f398488d.put("delTime", "LONG default '0' ");
        e0Var.f398487c[2] = "delSource";
        e0Var.f398488d.put("delSource", "TEXT default '' ");
        e0Var.f398487c[3] = "oriXml";
        e0Var.f398488d.put("oriXml", "TEXT default '' ");
        e0Var.f398487c[4] = "clientVersion";
        e0Var.f398488d.put("clientVersion", "TEXT default '' ");
        e0Var.f398487c[5] = "delType";
        e0Var.f398488d.put("delType", "INTEGER default '0' ");
        e0Var.f398487c[6] = "itemType";
        e0Var.f398488d.put("itemType", "INTEGER default '0' ");
        e0Var.f398487c[7] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[8] = "delFlag";
        e0Var.f398488d.put("delFlag", "INTEGER default '0' ");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " favId INTEGER PRIMARY KEY ,  delTime LONG default '0' ,  delSource TEXT default '' ,  oriXml TEXT default '' ,  clientVersion TEXT default '' ,  delType INTEGER default '0' ,  itemType INTEGER default '0' ,  updateTime LONG default '0' ,  delFlag INTEGER default '0' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        return e0Var;
    }

    public void A0(int i17) {
        this.f67316xd0f537a0 = i17;
        this.f319757i = true;
    }

    public void D0(int i17) {
        this.f67317x29141a11 = i17;
        this.f319752d = true;
    }

    public void F0(int i17) {
        this.f67318x63f2c692 = i17;
        this.f319758m = true;
    }

    public void G0(long j17) {
        this.f67320xa783a79b = j17;
        this.f319759n = true;
    }

    @Override // l75.f0
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "favId", java.lang.Integer.valueOf(this.f67317x29141a11));
            n51.f.b(jSONObject, "delTime", java.lang.Long.valueOf(this.f67315xd0f4fb33));
            n51.f.b(jSONObject, "delSource", this.f67314x66468f01);
            n51.f.b(jSONObject, "oriXml", this.f67319x9b4a636);
            n51.f.b(jSONObject, "clientVersion", this.f67312xa74c2c08);
            n51.f.b(jSONObject, "delType", java.lang.Integer.valueOf(this.f67316xd0f537a0));
            n51.f.b(jSONObject, "itemType", java.lang.Integer.valueOf(this.f67318x63f2c692));
            n51.f.b(jSONObject, dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f67320xa783a79b));
            n51.f.b(jSONObject, "delFlag", java.lang.Integer.valueOf(this.f67313xd0eea7d2));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
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
            if (f319745t == hashCode) {
                try {
                    this.f67317x29141a11 = cursor.getInt(i17);
                    this.f319752d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavDelInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319746u == hashCode) {
                try {
                    this.f67315xd0f4fb33 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavDelInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319747v == hashCode) {
                try {
                    this.f67314x66468f01 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavDelInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319748w == hashCode) {
                try {
                    this.f67319x9b4a636 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavDelInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319749x == hashCode) {
                try {
                    this.f67312xa74c2c08 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavDelInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319750y == hashCode) {
                try {
                    this.f67316xd0f537a0 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavDelInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319751z == hashCode) {
                try {
                    this.f67318x63f2c692 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavDelInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67320xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavDelInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67313xd0eea7d2 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavDelInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
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
        if (this.f319752d) {
            contentValues.put("favId", java.lang.Integer.valueOf(this.f67317x29141a11));
        }
        if (this.f319753e) {
            contentValues.put("delTime", java.lang.Long.valueOf(this.f67315xd0f4fb33));
        }
        if (this.f67314x66468f01 == null) {
            this.f67314x66468f01 = "";
        }
        if (this.f319754f) {
            contentValues.put("delSource", this.f67314x66468f01);
        }
        if (this.f67319x9b4a636 == null) {
            this.f67319x9b4a636 = "";
        }
        if (this.f319755g) {
            contentValues.put("oriXml", this.f67319x9b4a636);
        }
        if (this.f67312xa74c2c08 == null) {
            this.f67312xa74c2c08 = "";
        }
        if (this.f319756h) {
            contentValues.put("clientVersion", this.f67312xa74c2c08);
        }
        if (this.f319757i) {
            contentValues.put("delType", java.lang.Integer.valueOf(this.f67316xd0f537a0));
        }
        if (this.f319758m) {
            contentValues.put("itemType", java.lang.Integer.valueOf(this.f67318x63f2c692));
        }
        if (this.f319759n) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f67320xa783a79b));
        }
        if (this.f319760o) {
            contentValues.put("delFlag", java.lang.Integer.valueOf(this.f67313xd0eea7d2));
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
        m125192xe1f0e832(k0Var);
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
        return java.lang.Integer.valueOf(this.f67317x29141a11);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319741p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319741p.f434209a;
    }

    public int t0() {
        return this.f67313xd0eea7d2;
    }

    public long u0() {
        return this.f67315xd0f4fb33;
    }

    public long v0() {
        return this.f67320xa783a79b;
    }

    public void w0(java.lang.String str) {
        this.f67312xa74c2c08 = str;
        this.f319756h = true;
    }

    public void y0(int i17) {
        this.f67313xd0eea7d2 = i17;
        this.f319760o = true;
    }

    public void z0(long j17) {
        this.f67315xd0f4fb33 = j17;
        this.f319753e = true;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("favId")) {
            this.f67317x29141a11 = contentValues.getAsInteger("favId").intValue();
            if (z17) {
                this.f319752d = true;
            }
        }
        if (contentValues.containsKey("delTime")) {
            this.f67315xd0f4fb33 = contentValues.getAsLong("delTime").longValue();
            if (z17) {
                this.f319753e = true;
            }
        }
        if (contentValues.containsKey("delSource")) {
            this.f67314x66468f01 = contentValues.getAsString("delSource");
            if (z17) {
                this.f319754f = true;
            }
        }
        if (contentValues.containsKey("oriXml")) {
            this.f67319x9b4a636 = contentValues.getAsString("oriXml");
            if (z17) {
                this.f319755g = true;
            }
        }
        if (contentValues.containsKey("clientVersion")) {
            this.f67312xa74c2c08 = contentValues.getAsString("clientVersion");
            if (z17) {
                this.f319756h = true;
            }
        }
        if (contentValues.containsKey("delType")) {
            this.f67316xd0f537a0 = contentValues.getAsInteger("delType").intValue();
            if (z17) {
                this.f319757i = true;
            }
        }
        if (contentValues.containsKey("itemType")) {
            this.f67318x63f2c692 = contentValues.getAsInteger("itemType").intValue();
            if (z17) {
                this.f319758m = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f67320xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f319759n = true;
            }
        }
        if (contentValues.containsKey("delFlag")) {
            this.f67313xd0eea7d2 = contentValues.getAsInteger("delFlag").intValue();
            if (z17) {
                this.f319760o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
