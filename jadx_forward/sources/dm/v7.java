package dm;

/* loaded from: classes8.dex */
public class v7 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f322121p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f322122q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322123r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322124s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f322125t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f322126u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f322127v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f322128w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f322129x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f322130y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f322131z;

    /* renamed from: field_bubbleMd5 */
    public java.lang.String f68756xc438c84d;

    /* renamed from: field_bubbledynamicMd5 */
    public java.lang.String f68757xbf1c7af0;

    /* renamed from: field_bubblewidgetMd5 */
    public java.lang.String f68758x482fe849;

    /* renamed from: field_coverMd5 */
    public java.lang.String f68759x8cb33ec;

    /* renamed from: field_coverwidgetMd5 */
    public java.lang.String f68760x6d04e0a8;

    /* renamed from: field_detailMd5 */
    public java.lang.String f68761x25031268;

    /* renamed from: field_minilogoMd5 */
    public java.lang.String f68762x686bf7d7;

    /* renamed from: field_subtype */
    public int f68763x541db35;

    /* renamed from: field_version */
    public int f68764x8987ca93;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322132d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322133e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322134f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322135g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322136h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322137i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322138m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f322139n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f322140o = true;

    static {
        p75.n0 n0Var = new p75.n0("LuckyMoneyEnvelopeResource");
        f322121p = n0Var;
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
        f322122q = new java.lang.String[0];
        f322123r = -1867567750;
        f322124s = 697998674;
        f322125t = 475457099;
        f322126u = -351786425;
        f322127v = -55795812;
        f322128w = -1973098643;
        f322129x = 351608024;
        f322130y = -123918962;
        f322131z = -1123522877;
        A = 108705909;
        B = m125563x3593deb(dm.v7.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125563x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "subtype";
        e0Var.f398488d.put("subtype", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "subtype";
        e0Var.f398487c[1] = "bubbleMd5";
        e0Var.f398488d.put("bubbleMd5", "TEXT");
        e0Var.f398487c[2] = "bubbledynamicMd5";
        e0Var.f398488d.put("bubbledynamicMd5", "TEXT");
        e0Var.f398487c[3] = "coverMd5";
        e0Var.f398488d.put("coverMd5", "TEXT");
        e0Var.f398487c[4] = "minilogoMd5";
        e0Var.f398488d.put("minilogoMd5", "TEXT");
        e0Var.f398487c[5] = "detailMd5";
        e0Var.f398488d.put("detailMd5", "TEXT");
        e0Var.f398487c[6] = "version";
        e0Var.f398488d.put("version", "INTEGER");
        e0Var.f398487c[7] = "bubblewidgetMd5";
        e0Var.f398488d.put("bubblewidgetMd5", "TEXT");
        e0Var.f398487c[8] = "coverwidgetMd5";
        e0Var.f398488d.put("coverwidgetMd5", "TEXT");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " subtype INTEGER PRIMARY KEY ,  bubbleMd5 TEXT,  bubbledynamicMd5 TEXT,  coverMd5 TEXT,  minilogoMd5 TEXT,  detailMd5 TEXT,  version INTEGER,  bubblewidgetMd5 TEXT,  coverwidgetMd5 TEXT";
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
            if (f322123r == hashCode) {
                try {
                    this.f68763x541db35 = cursor.getInt(i17);
                    this.f322132d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322124s == hashCode) {
                try {
                    this.f68756xc438c84d = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322125t == hashCode) {
                try {
                    this.f68757xbf1c7af0 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322126u == hashCode) {
                try {
                    this.f68759x8cb33ec = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322127v == hashCode) {
                try {
                    this.f68762x686bf7d7 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322128w == hashCode) {
                try {
                    this.f68761x25031268 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322129x == hashCode) {
                try {
                    this.f68764x8987ca93 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322130y == hashCode) {
                try {
                    this.f68758x482fe849 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322131z == hashCode) {
                try {
                    this.f68760x6d04e0a8 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f322132d) {
            contentValues.put("subtype", java.lang.Integer.valueOf(this.f68763x541db35));
        }
        if (this.f322133e) {
            contentValues.put("bubbleMd5", this.f68756xc438c84d);
        }
        if (this.f322134f) {
            contentValues.put("bubbledynamicMd5", this.f68757xbf1c7af0);
        }
        if (this.f322135g) {
            contentValues.put("coverMd5", this.f68759x8cb33ec);
        }
        if (this.f322136h) {
            contentValues.put("minilogoMd5", this.f68762x686bf7d7);
        }
        if (this.f322137i) {
            contentValues.put("detailMd5", this.f68761x25031268);
        }
        if (this.f322138m) {
            contentValues.put("version", java.lang.Integer.valueOf(this.f68764x8987ca93));
        }
        if (this.f322139n) {
            contentValues.put("bubblewidgetMd5", this.f68758x482fe849);
        }
        if (this.f322140o) {
            contentValues.put("coverwidgetMd5", this.f68760x6d04e0a8);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LuckyMoneyEnvelopeResource ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322122q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", "createTableSql %s", str2);
            k0Var.A("LuckyMoneyEnvelopeResource", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LuckyMoneyEnvelopeResource", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", "updateTableSql %s", str3);
            k0Var.A("LuckyMoneyEnvelopeResource", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLuckyMoneyEnvelopeResource", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Integer.valueOf(this.f68763x541db35);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322121p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322121p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("subtype")) {
            this.f68763x541db35 = contentValues.getAsInteger("subtype").intValue();
            if (z17) {
                this.f322132d = true;
            }
        }
        if (contentValues.containsKey("bubbleMd5")) {
            this.f68756xc438c84d = contentValues.getAsString("bubbleMd5");
            if (z17) {
                this.f322133e = true;
            }
        }
        if (contentValues.containsKey("bubbledynamicMd5")) {
            this.f68757xbf1c7af0 = contentValues.getAsString("bubbledynamicMd5");
            if (z17) {
                this.f322134f = true;
            }
        }
        if (contentValues.containsKey("coverMd5")) {
            this.f68759x8cb33ec = contentValues.getAsString("coverMd5");
            if (z17) {
                this.f322135g = true;
            }
        }
        if (contentValues.containsKey("minilogoMd5")) {
            this.f68762x686bf7d7 = contentValues.getAsString("minilogoMd5");
            if (z17) {
                this.f322136h = true;
            }
        }
        if (contentValues.containsKey("detailMd5")) {
            this.f68761x25031268 = contentValues.getAsString("detailMd5");
            if (z17) {
                this.f322137i = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.f68764x8987ca93 = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f322138m = true;
            }
        }
        if (contentValues.containsKey("bubblewidgetMd5")) {
            this.f68758x482fe849 = contentValues.getAsString("bubblewidgetMd5");
            if (z17) {
                this.f322139n = true;
            }
        }
        if (contentValues.containsKey("coverwidgetMd5")) {
            this.f68760x6d04e0a8 = contentValues.getAsString("coverwidgetMd5");
            if (z17) {
                this.f322140o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
