package dm;

/* loaded from: classes4.dex */
public class z0 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f322890f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f322891g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f322892h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f322893i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f322894m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f322895n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f322896o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322897d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322898e = true;

    /* renamed from: field_brandUserName */
    public java.lang.String f69288x75756b18;

    /* renamed from: field_userId */
    public java.lang.String f69289x13fe5d2b;

    static {
        p75.n0 n0Var = new p75.n0("BizChatMyUserInfo");
        f322890f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322891g = new java.lang.String[0];
        f322892h = -64277091;
        f322893i = -836030906;
        f322894m = 108705909;
        f322895n = m125723x3593deb(dm.z0.class);
        f322896o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125723x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "brandUserName";
        e0Var.f398488d.put("brandUserName", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "brandUserName";
        e0Var.f398487c[1] = "userId";
        e0Var.f398488d.put("userId", "TEXT");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " brandUserName TEXT PRIMARY KEY ,  userId TEXT";
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
            if (f322892h == hashCode) {
                try {
                    this.f69288x75756b18 = cursor.getString(i17);
                    this.f322897d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizChatMyUserInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322893i == hashCode) {
                try {
                    this.f69289x13fe5d2b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizChatMyUserInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322894m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322897d) {
            contentValues.put("brandUserName", this.f69288x75756b18);
        }
        if (this.f322898e) {
            contentValues.put("userId", this.f69289x13fe5d2b);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBizChatMyUserInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizChatMyUserInfo ( ");
        l75.e0 e0Var = f322895n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322891g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizChatMyUserInfo", "createTableSql %s", str2);
            k0Var.A("BizChatMyUserInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BizChatMyUserInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizChatMyUserInfo", "updateTableSql %s", str3);
            k0Var.A("BizChatMyUserInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizChatMyUserInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322895n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322896o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69288x75756b18;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322890f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322890f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("brandUserName")) {
            this.f69288x75756b18 = contentValues.getAsString("brandUserName");
            if (z17) {
                this.f322897d = true;
            }
        }
        if (contentValues.containsKey("userId")) {
            this.f69289x13fe5d2b = contentValues.getAsString("userId");
            if (z17) {
                this.f322898e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
