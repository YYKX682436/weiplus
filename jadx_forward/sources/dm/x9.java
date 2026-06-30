package dm;

/* loaded from: classes4.dex */
public class x9 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f322611f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f322612g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f322613h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f322614i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f322615m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f322616n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f322617o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322618d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322619e = true;

    /* renamed from: field_orderIndex */
    public int f69149xe5044689;

    /* renamed from: field_quickMsg */
    public java.lang.String f69150xde32aff9;

    static {
        p75.n0 n0Var = new p75.n0("RtosQuickReplyInfo");
        f322611f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322612g = new java.lang.String[0];
        f322613h = 735908388;
        f322614i = -1066424748;
        f322615m = 108705909;
        f322616n = m125689x3593deb(dm.x9.class);
        f322617o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125689x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "orderIndex";
        e0Var.f398488d.put("orderIndex", "INTEGER");
        e0Var.f398487c[1] = "quickMsg";
        e0Var.f398488d.put("quickMsg", "TEXT");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " orderIndex INTEGER,  quickMsg TEXT";
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
            if (f322613h == hashCode) {
                try {
                    this.f69149xe5044689 = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRtosQuickReplyInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322614i == hashCode) {
                try {
                    this.f69150xde32aff9 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRtosQuickReplyInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322615m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322618d) {
            contentValues.put("orderIndex", java.lang.Integer.valueOf(this.f69149xe5044689));
        }
        if (this.f322619e) {
            contentValues.put("quickMsg", this.f69150xde32aff9);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseRtosQuickReplyInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS RtosQuickReplyInfo ( ");
        l75.e0 e0Var = f322616n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322612g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRtosQuickReplyInfo", "createTableSql %s", str2);
            k0Var.A("RtosQuickReplyInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "RtosQuickReplyInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRtosQuickReplyInfo", "updateTableSql %s", str3);
            k0Var.A("RtosQuickReplyInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRtosQuickReplyInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322616n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322617o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322611f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322611f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("orderIndex")) {
            this.f69149xe5044689 = contentValues.getAsInteger("orderIndex").intValue();
            if (z17) {
                this.f322618d = true;
            }
        }
        if (contentValues.containsKey("quickMsg")) {
            this.f69150xde32aff9 = contentValues.getAsString("quickMsg");
            if (z17) {
                this.f322619e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
