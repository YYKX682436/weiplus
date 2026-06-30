package dm;

/* loaded from: classes4.dex */
public class o extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f320364g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f320365h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f320366i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320367m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320368n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320369o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f320370p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f320371q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320372d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320373e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320374f = true;

    /* renamed from: field_scene */
    public int f67760x29cbf907;

    /* renamed from: field_ticket */
    public java.lang.String f67761x11bb99f1;

    /* renamed from: field_userName */
    public java.lang.String f67762xdde069b;

    static {
        p75.n0 n0Var = new p75.n0("AddContactAntispamTicket");
        f320364g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320365h = new java.lang.String[0];
        f320366i = -266666762;
        f320367m = 109254796;
        f320368n = -873960692;
        f320369o = 108705909;
        f320370p = m125352x3593deb(dm.o.class);
        f320371q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125352x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "userName";
        e0Var.f398488d.put("userName", "TEXT");
        e0Var.f398487c[1] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "INTEGER");
        e0Var.f398487c[2] = "ticket";
        e0Var.f398488d.put("ticket", "TEXT");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " userName TEXT,  scene INTEGER,  ticket TEXT";
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
            if (f320366i == hashCode) {
                try {
                    this.f67762xdde069b = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAddContactAntispamTicket", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320367m == hashCode) {
                try {
                    this.f67760x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAddContactAntispamTicket", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320368n == hashCode) {
                try {
                    this.f67761x11bb99f1 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAddContactAntispamTicket", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320369o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320372d) {
            contentValues.put("userName", this.f67762xdde069b);
        }
        if (this.f320373e) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f67760x29cbf907));
        }
        if (this.f320374f) {
            contentValues.put("ticket", this.f67761x11bb99f1);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAddContactAntispamTicket", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AddContactAntispamTicket ( ");
        l75.e0 e0Var = f320370p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320365h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAddContactAntispamTicket", "createTableSql %s", str2);
            k0Var.A("AddContactAntispamTicket", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AddContactAntispamTicket", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAddContactAntispamTicket", "updateTableSql %s", str3);
            k0Var.A("AddContactAntispamTicket", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAddContactAntispamTicket", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320370p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320371q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320364g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320364g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("userName")) {
            this.f67762xdde069b = contentValues.getAsString("userName");
            if (z17) {
                this.f320372d = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f67760x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f320373e = true;
            }
        }
        if (contentValues.containsKey("ticket")) {
            this.f67761x11bb99f1 = contentValues.getAsString("ticket");
            if (z17) {
                this.f320374f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
