package dm;

/* loaded from: classes8.dex */
public class m5 extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f319990o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f319991p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319992q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319993r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319994s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319995t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319996u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319997v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319998w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319999x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f320000y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f320001z;

    /* renamed from: field_accountType */
    public int f67426x9f600742;

    /* renamed from: field_avatarURL */
    public java.lang.String f67427x81118851;

    /* renamed from: field_jumpInfo */
    public v53.l f67428xe860fa1;

    /* renamed from: field_nickname */
    public java.lang.String f67429x21f9b213;

    /* renamed from: field_sex */
    public int f67430x4b6e7fa1;

    /* renamed from: field_tag */
    public java.lang.String f67431x4b6e82d5;

    /* renamed from: field_updateTime */
    public long f67432xa783a79b;

    /* renamed from: field_username */
    public java.lang.String f67433xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320002d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320003e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320004f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320005g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320006h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320007i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320008m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320009n = true;

    static {
        p75.n0 n0Var = new p75.n0("GameLifeContact");
        f319990o = n0Var;
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
        f319991p = new java.lang.String[0];
        f319992q = -265713450;
        f319993r = 866168583;
        f319994s = 70690926;
        f319995t = -428647082;
        f319996u = 113766;
        f319997v = 114586;
        f319998w = -255654404;
        f319999x = -295931082;
        f320000y = 108705909;
        f320001z = m125222x3593deb(dm.m5.class);
        A = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125222x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66875xa013b0d5;
        e0Var.f398487c[1] = "accountType";
        e0Var.f398488d.put("accountType", "INTEGER default '0' ");
        e0Var.f398487c[2] = "nickname";
        e0Var.f398488d.put("nickname", "TEXT default '' ");
        e0Var.f398487c[3] = "avatarURL";
        e0Var.f398488d.put("avatarURL", "TEXT default '' ");
        e0Var.f398487c[4] = "sex";
        e0Var.f398488d.put("sex", "INTEGER default '0' ");
        e0Var.f398487c[5] = "tag";
        e0Var.f398488d.put("tag", "TEXT default '' ");
        e0Var.f398487c[6] = "jumpInfo";
        e0Var.f398488d.put("jumpInfo", "BLOB");
        e0Var.f398487c[7] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " username TEXT default ''  PRIMARY KEY ,  accountType INTEGER default '0' ,  nickname TEXT default '' ,  avatarURL TEXT default '' ,  sex INTEGER default '0' ,  tag TEXT default '' ,  jumpInfo BLOB,  updateTime LONG";
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
            if (f319992q == hashCode) {
                try {
                    this.f67433xdec927b = cursor.getString(i17);
                    this.f320002d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeContact", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319993r == hashCode) {
                try {
                    this.f67426x9f600742 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeContact", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319994s == hashCode) {
                try {
                    this.f67429x21f9b213 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeContact", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319995t == hashCode) {
                try {
                    this.f67427x81118851 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeContact", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319996u == hashCode) {
                try {
                    this.f67430x4b6e7fa1 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeContact", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319997v == hashCode) {
                try {
                    this.f67431x4b6e82d5 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeContact", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319998w == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f67428xe860fa1 = (v53.l) new v53.l().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeContact", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319999x == hashCode) {
                try {
                    this.f67432xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeContact", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320000y == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f67433xdec927b == null) {
            this.f67433xdec927b = "";
        }
        if (this.f320002d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f67433xdec927b);
        }
        if (this.f320003e) {
            contentValues.put("accountType", java.lang.Integer.valueOf(this.f67426x9f600742));
        }
        if (this.f67429x21f9b213 == null) {
            this.f67429x21f9b213 = "";
        }
        if (this.f320004f) {
            contentValues.put("nickname", this.f67429x21f9b213);
        }
        if (this.f67427x81118851 == null) {
            this.f67427x81118851 = "";
        }
        if (this.f320005g) {
            contentValues.put("avatarURL", this.f67427x81118851);
        }
        if (this.f320006h) {
            contentValues.put("sex", java.lang.Integer.valueOf(this.f67430x4b6e7fa1));
        }
        if (this.f67431x4b6e82d5 == null) {
            this.f67431x4b6e82d5 = "";
        }
        if (this.f320007i) {
            contentValues.put("tag", this.f67431x4b6e82d5);
        }
        if (this.f320008m) {
            v53.l lVar = this.f67428xe860fa1;
            if (lVar != null) {
                try {
                    contentValues.put("jumpInfo", lVar.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameLifeContact", e17.getMessage());
                }
            } else {
                contentValues.put("jumpInfo", (byte[]) null);
            }
        }
        if (this.f320009n) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f67432xa783a79b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameLifeContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameLifeContact ( ");
        l75.e0 e0Var = f320001z;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319991p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLifeContact", "createTableSql %s", str2);
            k0Var.A("GameLifeContact", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GameLifeContact", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLifeContact", "updateTableSql %s", str3);
            k0Var.A("GameLifeContact", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLifeContact", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320001z;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67433xdec927b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319990o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319990o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f67433xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f320002d = true;
            }
        }
        if (contentValues.containsKey("accountType")) {
            this.f67426x9f600742 = contentValues.getAsInteger("accountType").intValue();
            if (z17) {
                this.f320003e = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.f67429x21f9b213 = contentValues.getAsString("nickname");
            if (z17) {
                this.f320004f = true;
            }
        }
        if (contentValues.containsKey("avatarURL")) {
            this.f67427x81118851 = contentValues.getAsString("avatarURL");
            if (z17) {
                this.f320005g = true;
            }
        }
        if (contentValues.containsKey("sex")) {
            this.f67430x4b6e7fa1 = contentValues.getAsInteger("sex").intValue();
            if (z17) {
                this.f320006h = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.f67431x4b6e82d5 = contentValues.getAsString("tag");
            if (z17) {
                this.f320007i = true;
            }
        }
        if (contentValues.containsKey("jumpInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("jumpInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f67428xe860fa1 = (v53.l) new v53.l().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f320008m = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameLifeContact", e17.getMessage());
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f67432xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f320009n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
