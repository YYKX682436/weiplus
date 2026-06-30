package dm;

/* loaded from: classes9.dex */
public class p8 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f320731p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f320732q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320733r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320734s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320735t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320736u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320737v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320738w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f320739x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f320740y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f320741z;

    /* renamed from: field_addState */
    public int f67921xd370a215;

    /* renamed from: field_encryptUsername */
    public java.lang.String f67922xdd77ad16;

    /* renamed from: field_nickname */
    public java.lang.String f67923x21f9b213;

    /* renamed from: field_oldUsername */
    public java.lang.String f67924xe8a3dc58;

    /* renamed from: field_pinyinName */
    public java.lang.String f67925xc64d6439;

    /* renamed from: field_seq */
    public int f67926x4b6e7f9a;

    /* renamed from: field_showHead */
    public int f67927x98b6022;

    /* renamed from: field_ticket */
    public java.lang.String f67928x11bb99f1;

    /* renamed from: field_username */
    public java.lang.String f67929xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320742d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320743e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320744f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320745g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320746h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320747i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320748m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320749n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f320750o = true;

    static {
        p75.n0 n0Var = new p75.n0("OldAccountFriend");
        f320731p = n0Var;
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
        f320732q = new java.lang.String[0];
        f320733r = -1914377637;
        f320734s = 2095350813;
        f320735t = -873960692;
        f320736u = 70690926;
        f320737v = -1246914448;
        f320738w = -339192195;
        f320739x = 220606420;
        f320740y = -265713450;
        f320741z = 113759;
        A = 108705909;
        B = m125398x3593deb(dm.p8.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125398x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "encryptUsername";
        e0Var.f398488d.put("encryptUsername", "TEXT");
        e0Var.f398487c[1] = "oldUsername";
        e0Var.f398488d.put("oldUsername", "TEXT");
        e0Var.f398487c[2] = "ticket";
        e0Var.f398488d.put("ticket", "TEXT");
        e0Var.f398487c[3] = "nickname";
        e0Var.f398488d.put("nickname", "TEXT");
        e0Var.f398487c[4] = "addState";
        e0Var.f398488d.put("addState", "INTEGER");
        e0Var.f398487c[5] = "showHead";
        e0Var.f398488d.put("showHead", "INTEGER");
        e0Var.f398487c[6] = "pinyinName";
        e0Var.f398488d.put("pinyinName", "TEXT");
        e0Var.f398487c[7] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT");
        e0Var.f398487c[8] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb, "INTEGER");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " encryptUsername TEXT,  oldUsername TEXT,  ticket TEXT,  nickname TEXT,  addState INTEGER,  showHead INTEGER,  pinyinName TEXT,  username TEXT,  seq INTEGER";
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
            if (f320733r == hashCode) {
                try {
                    this.f67922xdd77ad16 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOldAccountFriend", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320734s == hashCode) {
                try {
                    this.f67924xe8a3dc58 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOldAccountFriend", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320735t == hashCode) {
                try {
                    this.f67928x11bb99f1 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOldAccountFriend", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320736u == hashCode) {
                try {
                    this.f67923x21f9b213 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOldAccountFriend", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320737v == hashCode) {
                try {
                    this.f67921xd370a215 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOldAccountFriend", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320738w == hashCode) {
                try {
                    this.f67927x98b6022 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOldAccountFriend", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320739x == hashCode) {
                try {
                    this.f67925xc64d6439 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOldAccountFriend", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320740y == hashCode) {
                try {
                    this.f67929xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOldAccountFriend", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320741z == hashCode) {
                try {
                    this.f67926x4b6e7f9a = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOldAccountFriend", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320742d) {
            contentValues.put("encryptUsername", this.f67922xdd77ad16);
        }
        if (this.f320743e) {
            contentValues.put("oldUsername", this.f67924xe8a3dc58);
        }
        if (this.f320744f) {
            contentValues.put("ticket", this.f67928x11bb99f1);
        }
        if (this.f320745g) {
            contentValues.put("nickname", this.f67923x21f9b213);
        }
        if (this.f320746h) {
            contentValues.put("addState", java.lang.Integer.valueOf(this.f67921xd370a215));
        }
        if (this.f320747i) {
            contentValues.put("showHead", java.lang.Integer.valueOf(this.f67927x98b6022));
        }
        if (this.f320748m) {
            contentValues.put("pinyinName", this.f67925xc64d6439);
        }
        if (this.f320749n) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f67929xdec927b);
        }
        if (this.f320750o) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb, java.lang.Integer.valueOf(this.f67926x4b6e7f9a));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOldAccountFriend", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OldAccountFriend ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320732q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOldAccountFriend", "createTableSql %s", str2);
            k0Var.A("OldAccountFriend", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "OldAccountFriend", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOldAccountFriend", "updateTableSql %s", str3);
            k0Var.A("OldAccountFriend", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOldAccountFriend", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return B;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return C;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320731p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320731p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("encryptUsername")) {
            this.f67922xdd77ad16 = contentValues.getAsString("encryptUsername");
            if (z17) {
                this.f320742d = true;
            }
        }
        if (contentValues.containsKey("oldUsername")) {
            this.f67924xe8a3dc58 = contentValues.getAsString("oldUsername");
            if (z17) {
                this.f320743e = true;
            }
        }
        if (contentValues.containsKey("ticket")) {
            this.f67928x11bb99f1 = contentValues.getAsString("ticket");
            if (z17) {
                this.f320744f = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.f67923x21f9b213 = contentValues.getAsString("nickname");
            if (z17) {
                this.f320745g = true;
            }
        }
        if (contentValues.containsKey("addState")) {
            this.f67921xd370a215 = contentValues.getAsInteger("addState").intValue();
            if (z17) {
                this.f320746h = true;
            }
        }
        if (contentValues.containsKey("showHead")) {
            this.f67927x98b6022 = contentValues.getAsInteger("showHead").intValue();
            if (z17) {
                this.f320747i = true;
            }
        }
        if (contentValues.containsKey("pinyinName")) {
            this.f67925xc64d6439 = contentValues.getAsString("pinyinName");
            if (z17) {
                this.f320748m = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f67929xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f320749n = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb)) {
            this.f67926x4b6e7f9a = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb).intValue();
            if (z17) {
                this.f320750o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
