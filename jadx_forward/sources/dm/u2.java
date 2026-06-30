package dm;

/* loaded from: classes7.dex */
public class u2 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f321787i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f321788m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f321789n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321790o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321791p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321792q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321793r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321794s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f321795t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f321796u;

    /* renamed from: field_desc */
    public java.lang.String f68541x225aa2b6;

    /* renamed from: field_iconUrl */
    public java.lang.String f68542xd6403ff1;

    /* renamed from: field_key */
    public java.lang.String f68543x4b6e619a;

    /* renamed from: field_panelUrl */
    public java.lang.String f68544x5cf9de70;

    /* renamed from: field_title */
    public java.lang.String f68545x29dd02d3;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321797d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321798e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321799f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321800g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321801h = true;

    static {
        p75.n0 n0Var = new p75.n0("EmojiIPSetInfo");
        f321787i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321788m = new java.lang.String[0];
        f321789n = 106079;
        f321790o = 110371416;
        f321791p = 3079825;
        f321792q = 1638765110;
        f321793r = 1060558027;
        f321794s = 108705909;
        f321795t = m125530x3593deb(dm.u2.class);
        f321796u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125530x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "key";
        e0Var.f398488d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "key";
        e0Var.f398487c[1] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "TEXT");
        e0Var.f398487c[2] = "desc";
        e0Var.f398488d.put("desc", "TEXT");
        e0Var.f398487c[3] = "iconUrl";
        e0Var.f398488d.put("iconUrl", "TEXT");
        e0Var.f398487c[4] = "panelUrl";
        e0Var.f398488d.put("panelUrl", "TEXT");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " key TEXT PRIMARY KEY ,  title TEXT,  desc TEXT,  iconUrl TEXT,  panelUrl TEXT";
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
            if (f321789n == hashCode) {
                try {
                    this.f68543x4b6e619a = cursor.getString(i17);
                    this.f321797d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiIPSetInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321790o == hashCode) {
                try {
                    this.f68545x29dd02d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiIPSetInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321791p == hashCode) {
                try {
                    this.f68541x225aa2b6 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiIPSetInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321792q == hashCode) {
                try {
                    this.f68542xd6403ff1 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiIPSetInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321793r == hashCode) {
                try {
                    this.f68544x5cf9de70 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiIPSetInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321794s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321797d) {
            contentValues.put("key", this.f68543x4b6e619a);
        }
        if (this.f321798e) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f68545x29dd02d3);
        }
        if (this.f321799f) {
            contentValues.put("desc", this.f68541x225aa2b6);
        }
        if (this.f321800g) {
            contentValues.put("iconUrl", this.f68542xd6403ff1);
        }
        if (this.f321801h) {
            contentValues.put("panelUrl", this.f68544x5cf9de70);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseEmojiIPSetInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EmojiIPSetInfo ( ");
        l75.e0 e0Var = f321795t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321788m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmojiIPSetInfo", "createTableSql %s", str2);
            k0Var.A("EmojiIPSetInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "EmojiIPSetInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmojiIPSetInfo", "updateTableSql %s", str3);
            k0Var.A("EmojiIPSetInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmojiIPSetInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321795t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321796u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68543x4b6e619a;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321787i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321787i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.f68543x4b6e619a = contentValues.getAsString("key");
            if (z17) {
                this.f321797d = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            this.f68545x29dd02d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (z17) {
                this.f321798e = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.f68541x225aa2b6 = contentValues.getAsString("desc");
            if (z17) {
                this.f321799f = true;
            }
        }
        if (contentValues.containsKey("iconUrl")) {
            this.f68542xd6403ff1 = contentValues.getAsString("iconUrl");
            if (z17) {
                this.f321800g = true;
            }
        }
        if (contentValues.containsKey("panelUrl")) {
            this.f68544x5cf9de70 = contentValues.getAsString("panelUrl");
            if (z17) {
                this.f321801h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
