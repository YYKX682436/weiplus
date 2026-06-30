package dm;

/* loaded from: classes4.dex */
public class s2 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f321321g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f321322h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f321323i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321324m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f321325n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321326o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f321327p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f321328q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321329d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321330e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321331f = true;

    /* renamed from: field_designerUin */
    public int f68243x364361aa;

    /* renamed from: field_productId */
    public java.lang.String f68244x5bec8165;

    /* renamed from: field_syncTime */
    public int f68245x8a0c25ad;

    static {
        p75.n0 n0Var = new p75.n0("EmojiDesignerProduct");
        f321321g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321322h = new java.lang.String[0];
        f321323i = -897316497;
        f321324m = -1051830678;
        f321325n = 1816730632;
        f321326o = 108705909;
        f321327p = m125466x3593deb(dm.s2.class);
        f321328q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125466x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "designerUin";
        e0Var.f398488d.put("designerUin", "INTEGER");
        e0Var.f398487c[1] = "productId";
        e0Var.f398488d.put("productId", "TEXT");
        e0Var.f398487c[2] = "syncTime";
        e0Var.f398488d.put("syncTime", "INTEGER");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " designerUin INTEGER,  productId TEXT,  syncTime INTEGER";
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
            if (f321323i == hashCode) {
                try {
                    this.f68243x364361aa = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiDesignerProduct", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321324m == hashCode) {
                try {
                    this.f68244x5bec8165 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiDesignerProduct", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321325n == hashCode) {
                try {
                    this.f68245x8a0c25ad = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiDesignerProduct", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321326o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321329d) {
            contentValues.put("designerUin", java.lang.Integer.valueOf(this.f68243x364361aa));
        }
        if (this.f321330e) {
            contentValues.put("productId", this.f68244x5bec8165);
        }
        if (this.f321331f) {
            contentValues.put("syncTime", java.lang.Integer.valueOf(this.f68245x8a0c25ad));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseEmojiDesignerProduct", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EmojiDesignerProduct ( ");
        l75.e0 e0Var = f321327p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321322h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmojiDesignerProduct", "createTableSql %s", str2);
            k0Var.A("EmojiDesignerProduct", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "EmojiDesignerProduct", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmojiDesignerProduct", "updateTableSql %s", str3);
            k0Var.A("EmojiDesignerProduct", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmojiDesignerProduct", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321327p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321328q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321321g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321321g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("designerUin")) {
            this.f68243x364361aa = contentValues.getAsInteger("designerUin").intValue();
            if (z17) {
                this.f321329d = true;
            }
        }
        if (contentValues.containsKey("productId")) {
            this.f68244x5bec8165 = contentValues.getAsString("productId");
            if (z17) {
                this.f321330e = true;
            }
        }
        if (contentValues.containsKey("syncTime")) {
            this.f68245x8a0c25ad = contentValues.getAsInteger("syncTime").intValue();
            if (z17) {
                this.f321331f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
