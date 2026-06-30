package dm;

/* loaded from: classes4.dex */
public class d8 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f317932h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f317933i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f317934m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f317935n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317936o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317937p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317938q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f317939r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f317940s;

    /* renamed from: field_chat_room_id */
    public java.lang.String f66267x206c903d;

    /* renamed from: field_cluster_history_data */
    public java.lang.String f66268x9d7518bf;

    /* renamed from: field_last_image_path */
    public java.lang.String f66269x5965408d;

    /* renamed from: field_timestamp */
    public long f66270x9de75411;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317941d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317942e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317943f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317944g = true;

    static {
        p75.n0 n0Var = new p75.n0("MsgQueryHistoryInfo");
        f317932h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317933i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS MsgQueryHistoryInfo_Room_Id ON MsgQueryHistoryInfo(chat_room_id)"};
        f317934m = 339796248;
        f317935n = 164789714;
        f317936o = -1232839014;
        f317937p = 55126294;
        f317938q = 108705909;
        f317939r = m124879x3593deb(dm.d8.class);
        f317940s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124879x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "chat_room_id";
        e0Var.f398488d.put("chat_room_id", "TEXT");
        e0Var.f398487c[1] = "last_image_path";
        e0Var.f398488d.put("last_image_path", "TEXT");
        e0Var.f398487c[2] = "cluster_history_data";
        e0Var.f398488d.put("cluster_history_data", "TEXT");
        e0Var.f398487c[3] = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6;
        e0Var.f398488d.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "LONG");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " chat_room_id TEXT,  last_image_path TEXT,  cluster_history_data TEXT,  timestamp LONG";
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
            if (f317934m == hashCode) {
                try {
                    this.f66267x206c903d = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMsgQueryHistoryInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317935n == hashCode) {
                try {
                    this.f66269x5965408d = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMsgQueryHistoryInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317936o == hashCode) {
                try {
                    this.f66268x9d7518bf = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMsgQueryHistoryInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317937p == hashCode) {
                try {
                    this.f66270x9de75411 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMsgQueryHistoryInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317938q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317941d) {
            contentValues.put("chat_room_id", this.f66267x206c903d);
        }
        if (this.f317942e) {
            contentValues.put("last_image_path", this.f66269x5965408d);
        }
        if (this.f317943f) {
            contentValues.put("cluster_history_data", this.f66268x9d7518bf);
        }
        if (this.f317944g) {
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f66270x9de75411));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseMsgQueryHistoryInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MsgQueryHistoryInfo ( ");
        l75.e0 e0Var = f317939r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317933i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMsgQueryHistoryInfo", "createTableSql %s", str2);
            k0Var.A("MsgQueryHistoryInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "MsgQueryHistoryInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMsgQueryHistoryInfo", "updateTableSql %s", str3);
            k0Var.A("MsgQueryHistoryInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMsgQueryHistoryInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317939r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317940s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317932h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317932h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("chat_room_id")) {
            this.f66267x206c903d = contentValues.getAsString("chat_room_id");
            if (z17) {
                this.f317941d = true;
            }
        }
        if (contentValues.containsKey("last_image_path")) {
            this.f66269x5965408d = contentValues.getAsString("last_image_path");
            if (z17) {
                this.f317942e = true;
            }
        }
        if (contentValues.containsKey("cluster_history_data")) {
            this.f66268x9d7518bf = contentValues.getAsString("cluster_history_data");
            if (z17) {
                this.f317943f = true;
            }
        }
        if (contentValues.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            this.f66270x9de75411 = contentValues.getAsLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6).longValue();
            if (z17) {
                this.f317944g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
