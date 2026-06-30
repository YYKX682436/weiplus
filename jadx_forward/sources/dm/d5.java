package dm;

/* loaded from: classes8.dex */
public class d5 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f317892n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f317893o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317894p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317895q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317896r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317897s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317898t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317899u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317900v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317901w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f317902x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f317903y;

    /* renamed from: field_endTime */
    public int f66244x14c61803;

    /* renamed from: field_jumpDest */
    public int f66245xe83a995;

    /* renamed from: field_jumpScene */
    public int f66246xc2c3cbf9;

    /* renamed from: field_keyWord */
    public java.lang.String f66247x43f93fc4;

    /* renamed from: field_localId */
    public long f66248x88be67a1;

    /* renamed from: field_passByInfo */
    public java.lang.String f66249xac36557b;

    /* renamed from: field_startTime */
    public int f66250x1bb3b54a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317904d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317905e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317906f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317907g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317908h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317909i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317910m = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderSnsKeyWordsJumpConfig");
        f317892n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317893o = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderSnsKeyWordsJumpInfo_local_index ON FinderSnsKeyWordsJumpConfig(localId)"};
        f317894p = 338409958;
        f317895q = 673554686;
        f317896r = -255811600;
        f317897s = -2129294769;
        f317898t = -1607243192;
        f317899u = -815361527;
        f317900v = -217112298;
        f317901w = 108705909;
        f317902x = m124875x3593deb(dm.d5.class);
        f317903y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124875x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66867x2a5c95c7;
        e0Var.f398488d.put(dm.i4.f66867x2a5c95c7, "LONG PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66867x2a5c95c7;
        e0Var.f398487c[1] = "jumpScene";
        e0Var.f398488d.put("jumpScene", "INTEGER default '-1' ");
        e0Var.f398487c[2] = "jumpDest";
        e0Var.f398488d.put("jumpDest", "INTEGER default '-1' ");
        e0Var.f398487c[3] = "startTime";
        e0Var.f398488d.put("startTime", "INTEGER default '0' ");
        e0Var.f398487c[4] = "endTime";
        e0Var.f398488d.put("endTime", "INTEGER default '0' ");
        e0Var.f398487c[5] = "keyWord";
        e0Var.f398488d.put("keyWord", "TEXT");
        e0Var.f398487c[6] = "passByInfo";
        e0Var.f398488d.put("passByInfo", "TEXT");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " localId LONG PRIMARY KEY ,  jumpScene INTEGER default '-1' ,  jumpDest INTEGER default '-1' ,  startTime INTEGER default '0' ,  endTime INTEGER default '0' ,  keyWord TEXT,  passByInfo TEXT";
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
            if (f317894p == hashCode) {
                try {
                    this.f66248x88be67a1 = cursor.getLong(i17);
                    this.f317904d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317895q == hashCode) {
                try {
                    this.f66246xc2c3cbf9 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317896r == hashCode) {
                try {
                    this.f66245xe83a995 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317897s == hashCode) {
                try {
                    this.f66250x1bb3b54a = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317898t == hashCode) {
                try {
                    this.f66244x14c61803 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317899u == hashCode) {
                try {
                    this.f66247x43f93fc4 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317900v == hashCode) {
                try {
                    this.f66249xac36557b = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317901w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317904d) {
            contentValues.put(dm.i4.f66867x2a5c95c7, java.lang.Long.valueOf(this.f66248x88be67a1));
        }
        if (this.f317905e) {
            contentValues.put("jumpScene", java.lang.Integer.valueOf(this.f66246xc2c3cbf9));
        }
        if (this.f317906f) {
            contentValues.put("jumpDest", java.lang.Integer.valueOf(this.f66245xe83a995));
        }
        if (this.f317907g) {
            contentValues.put("startTime", java.lang.Integer.valueOf(this.f66250x1bb3b54a));
        }
        if (this.f317908h) {
            contentValues.put("endTime", java.lang.Integer.valueOf(this.f66244x14c61803));
        }
        if (this.f317909i) {
            contentValues.put("keyWord", this.f66247x43f93fc4);
        }
        if (this.f317910m) {
            contentValues.put("passByInfo", this.f66249xac36557b);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderSnsKeyWordsJumpConfig ( ");
        l75.e0 e0Var = f317902x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317893o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", "createTableSql %s", str2);
            k0Var.A("FinderSnsKeyWordsJumpConfig", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderSnsKeyWordsJumpConfig", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", "updateTableSql %s", str3);
            k0Var.A("FinderSnsKeyWordsJumpConfig", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317902x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317903y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f66248x88be67a1);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317892n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317892n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66867x2a5c95c7)) {
            this.f66248x88be67a1 = contentValues.getAsLong(dm.i4.f66867x2a5c95c7).longValue();
            if (z17) {
                this.f317904d = true;
            }
        }
        if (contentValues.containsKey("jumpScene")) {
            this.f66246xc2c3cbf9 = contentValues.getAsInteger("jumpScene").intValue();
            if (z17) {
                this.f317905e = true;
            }
        }
        if (contentValues.containsKey("jumpDest")) {
            this.f66245xe83a995 = contentValues.getAsInteger("jumpDest").intValue();
            if (z17) {
                this.f317906f = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.f66250x1bb3b54a = contentValues.getAsInteger("startTime").intValue();
            if (z17) {
                this.f317907g = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.f66244x14c61803 = contentValues.getAsInteger("endTime").intValue();
            if (z17) {
                this.f317908h = true;
            }
        }
        if (contentValues.containsKey("keyWord")) {
            this.f66247x43f93fc4 = contentValues.getAsString("keyWord");
            if (z17) {
                this.f317909i = true;
            }
        }
        if (contentValues.containsKey("passByInfo")) {
            this.f66249xac36557b = contentValues.getAsString("passByInfo");
            if (z17) {
                this.f317910m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
