package dm;

/* loaded from: classes4.dex */
public class x2 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f322531g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f322532h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f322533i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f322534m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f322535n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f322536o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f322537p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f322538q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322539d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322540e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322541f = true;

    /* renamed from: field_content */
    public byte[] f69113xad49e234;

    /* renamed from: field_desc */
    public java.lang.String f69114x225aa2b6;

    /* renamed from: field_updateTime */
    public int f69115xa783a79b;

    static {
        p75.n0 n0Var = new p75.n0("EmojiSuggestCacheInfo");
        f322531g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322532h = new java.lang.String[0];
        f322533i = 3079825;
        f322534m = -295931082;
        f322535n = 951530617;
        f322536o = 108705909;
        f322537p = m125679x3593deb(dm.x2.class);
        f322538q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125679x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "desc";
        e0Var.f398488d.put("desc", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "desc";
        e0Var.f398487c[1] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "INTEGER");
        e0Var.f398487c[2] = "content";
        e0Var.f398488d.put("content", "BLOB");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " desc TEXT PRIMARY KEY ,  updateTime INTEGER,  content BLOB";
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
            if (f322533i == hashCode) {
                try {
                    this.f69114x225aa2b6 = cursor.getString(i17);
                    this.f322539d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322534m == hashCode) {
                try {
                    this.f69115xa783a79b = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322535n == hashCode) {
                try {
                    this.f69113xad49e234 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322536o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322539d) {
            contentValues.put("desc", this.f69114x225aa2b6);
        }
        if (this.f322540e) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Integer.valueOf(this.f69115xa783a79b));
        }
        if (this.f322541f) {
            contentValues.put("content", this.f69113xad49e234);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EmojiSuggestCacheInfo ( ");
        l75.e0 e0Var = f322537p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322532h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", "createTableSql %s", str2);
            k0Var.A("EmojiSuggestCacheInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "EmojiSuggestCacheInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", "updateTableSql %s", str3);
            k0Var.A("EmojiSuggestCacheInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmojiSuggestCacheInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322537p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322538q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69114x225aa2b6;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322531g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322531g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("desc")) {
            this.f69114x225aa2b6 = contentValues.getAsString("desc");
            if (z17) {
                this.f322539d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f69115xa783a79b = contentValues.getAsInteger(dm.i4.f66874x4c6b1f55).intValue();
            if (z17) {
                this.f322540e = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.f69113xad49e234 = contentValues.getAsByteArray("content");
            if (z17) {
                this.f322541f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
