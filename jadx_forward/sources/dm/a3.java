package dm;

/* loaded from: classes4.dex */
public class a3 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f317114g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f317115h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f317116i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f317117m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f317118n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317119o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f317120p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f317121q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317122d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317123e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317124f = true;

    /* renamed from: field_content */
    public byte[] f65848xad49e234;

    /* renamed from: field_lan */
    public java.lang.String f65849x4b6e64d4;

    /* renamed from: field_productID */
    public java.lang.String f65850x5bec8145;

    static {
        p75.n0 n0Var = new p75.n0("EmotionDetailInfo");
        f317114g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317115h = new java.lang.String[0];
        f317116i = -1051830710;
        f317117m = 951530617;
        f317118n = 106905;
        f317119o = 108705909;
        f317120p = m124783x3593deb(dm.a3.class);
        f317121q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124783x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "productID";
        e0Var.f398488d.put("productID", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "productID";
        e0Var.f398487c[1] = "content";
        e0Var.f398488d.put("content", "BLOB default '' ");
        e0Var.f398487c[2] = "lan";
        e0Var.f398488d.put("lan", "TEXT default '' ");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " productID TEXT PRIMARY KEY ,  content BLOB default '' ,  lan TEXT default '' ";
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
            if (f317116i == hashCode) {
                try {
                    this.f65850x5bec8145 = cursor.getString(i17);
                    this.f317122d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmotionDetailInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317117m == hashCode) {
                try {
                    this.f65848xad49e234 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmotionDetailInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317118n == hashCode) {
                try {
                    this.f65849x4b6e64d4 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmotionDetailInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317119o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317122d) {
            contentValues.put("productID", this.f65850x5bec8145);
        }
        if (this.f317123e) {
            contentValues.put("content", this.f65848xad49e234);
        }
        if (this.f65849x4b6e64d4 == null) {
            this.f65849x4b6e64d4 = "";
        }
        if (this.f317124f) {
            contentValues.put("lan", this.f65849x4b6e64d4);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseEmotionDetailInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EmotionDetailInfo ( ");
        l75.e0 e0Var = f317120p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317115h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmotionDetailInfo", "createTableSql %s", str2);
            k0Var.A("EmotionDetailInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "EmotionDetailInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmotionDetailInfo", "updateTableSql %s", str3);
            k0Var.A("EmotionDetailInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmotionDetailInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317120p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317121q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f65850x5bec8145;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317114g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317114g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("productID")) {
            this.f65850x5bec8145 = contentValues.getAsString("productID");
            if (z17) {
                this.f317122d = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.f65848xad49e234 = contentValues.getAsByteArray("content");
            if (z17) {
                this.f317123e = true;
            }
        }
        if (contentValues.containsKey("lan")) {
            this.f65849x4b6e64d4 = contentValues.getAsString("lan");
            if (z17) {
                this.f317124f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
