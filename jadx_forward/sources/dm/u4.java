package dm;

/* loaded from: classes8.dex */
public class u4 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f321817m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f321818n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321819o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321820p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321821q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321822r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321823s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321824t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321825u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f321826v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f321827w;

    /* renamed from: field_contextObj */
    public r45.qt2 f68551xc978a12d;

    /* renamed from: field_isPrivate */
    public boolean f68552x655097f4;

    /* renamed from: field_likeAction */
    public int f68553x56bc0112;

    /* renamed from: field_localId */
    public long f68554x88be67a1;

    /* renamed from: field_scene */
    public int f68555x29cbf907;

    /* renamed from: field_showTips */
    public boolean f68556x990e57a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321828d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321829e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321830f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321831g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321832h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321833i = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderLocalOperation");
        f321817m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321818n = new java.lang.String[0];
        f321819o = 338409958;
        f321820p = -1651192659;
        f321821q = 109254796;
        f321822r = -338830379;
        f321823s = 273771720;
        f321824t = -894276359;
        f321825u = 108705909;
        f321826v = m125534x3593deb(dm.u4.class);
        f321827w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125534x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66867x2a5c95c7;
        e0Var.f398488d.put(dm.i4.f66867x2a5c95c7, "LONG PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66867x2a5c95c7;
        e0Var.f398487c[1] = "likeAction";
        e0Var.f398488d.put("likeAction", "INTEGER");
        e0Var.f398487c[2] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "INTEGER");
        e0Var.f398487c[3] = "showTips";
        e0Var.f398488d.put("showTips", "INTEGER");
        e0Var.f398487c[4] = "contextObj";
        e0Var.f398488d.put("contextObj", "BLOB");
        e0Var.f398487c[5] = "isPrivate";
        e0Var.f398488d.put("isPrivate", "INTEGER");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " localId LONG PRIMARY KEY ,  likeAction INTEGER,  scene INTEGER,  showTips INTEGER,  contextObj BLOB,  isPrivate INTEGER";
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
            if (f321819o == hashCode) {
                try {
                    this.f68554x88be67a1 = cursor.getLong(i17);
                    this.f321828d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLocalOperation", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321820p == hashCode) {
                try {
                    this.f68553x56bc0112 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLocalOperation", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321821q == hashCode) {
                try {
                    this.f68555x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLocalOperation", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321822r == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f68556x990e57a = z17;
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLocalOperation", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321823s == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f68551xc978a12d = (r45.qt2) new r45.qt2().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLocalOperation", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321824t == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f68552x655097f4 = z17;
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLocalOperation", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321825u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321828d) {
            contentValues.put(dm.i4.f66867x2a5c95c7, java.lang.Long.valueOf(this.f68554x88be67a1));
        }
        if (this.f321829e) {
            contentValues.put("likeAction", java.lang.Integer.valueOf(this.f68553x56bc0112));
        }
        if (this.f321830f) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f68555x29cbf907));
        }
        if (this.f321831g) {
            if (this.f68556x990e57a) {
                contentValues.put("showTips", (java.lang.Integer) 1);
            } else {
                contentValues.put("showTips", (java.lang.Integer) 0);
            }
        }
        if (this.f321832h) {
            r45.qt2 qt2Var = this.f68551xc978a12d;
            if (qt2Var != null) {
                try {
                    contentValues.put("contextObj", qt2Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderLocalOperation", e17.getMessage());
                }
            } else {
                contentValues.put("contextObj", (byte[]) null);
            }
        }
        if (this.f321833i) {
            if (this.f68552x655097f4) {
                contentValues.put("isPrivate", (java.lang.Integer) 1);
            } else {
                contentValues.put("isPrivate", (java.lang.Integer) 0);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderLocalOperation", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLocalOperation ( ");
        l75.e0 e0Var = f321826v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321818n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLocalOperation", "createTableSql %s", str2);
            k0Var.A("FinderLocalOperation", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderLocalOperation", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLocalOperation", "updateTableSql %s", str3);
            k0Var.A("FinderLocalOperation", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLocalOperation", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321826v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321827w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f68554x88be67a1);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321817m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321817m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66867x2a5c95c7)) {
            this.f68554x88be67a1 = contentValues.getAsLong(dm.i4.f66867x2a5c95c7).longValue();
            if (z17) {
                this.f321828d = true;
            }
        }
        if (contentValues.containsKey("likeAction")) {
            this.f68553x56bc0112 = contentValues.getAsInteger("likeAction").intValue();
            if (z17) {
                this.f321829e = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f68555x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f321830f = true;
            }
        }
        if (contentValues.containsKey("showTips")) {
            this.f68556x990e57a = contentValues.getAsInteger("showTips").intValue() != 0;
            if (z17) {
                this.f321831g = true;
            }
        }
        if (contentValues.containsKey("contextObj")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("contextObj");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f68551xc978a12d = (r45.qt2) new r45.qt2().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f321832h = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderLocalOperation", e17.getMessage());
            }
        }
        if (contentValues.containsKey("isPrivate")) {
            this.f68552x655097f4 = contentValues.getAsInteger("isPrivate").intValue() != 0;
            if (z17) {
                this.f321833i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
