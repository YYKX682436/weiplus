package dm;

/* loaded from: classes4.dex */
public class y1 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f322691f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f322692g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f322693h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f322694i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f322695m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f322696n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f322697o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322698d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322699e = true;

    /* renamed from: field_chatRooms */
    public java.lang.String f69181xfa75997b;

    /* renamed from: field_chatRoomsId */
    public java.lang.String f69182x33752ff6;

    static {
        p75.n0 n0Var = new p75.n0("ChatRoomsInfo");
        f322691f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322692g = new java.lang.String[0];
        f322693h = -944384069;
        f322694i = 1607954048;
        f322695m = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "chatRoomsId";
        ((java.util.HashMap) e0Var.f398488d).put("chatRoomsId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "chatRoomsId";
        e0Var.f398487c[1] = "chatRooms";
        ((java.util.HashMap) e0Var.f398488d).put("chatRooms", "TEXT");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " chatRoomsId TEXT PRIMARY KEY ,  chatRooms TEXT";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f322696n = e0Var;
        f322697o = new o75.e();
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
            if (f322693h == hashCode) {
                try {
                    this.f69182x33752ff6 = cursor.getString(i17);
                    this.f322698d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatRoomsInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322694i == hashCode) {
                try {
                    this.f69181xfa75997b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatRoomsInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322695m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322698d) {
            contentValues.put("chatRoomsId", this.f69182x33752ff6);
        }
        if (this.f322699e) {
            contentValues.put("chatRooms", this.f69181xfa75997b);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseChatRoomsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ChatRoomsInfo ( ");
        l75.e0 e0Var = f322696n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322692g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChatRoomsInfo", "createTableSql %s", str2);
            k0Var.A("ChatRoomsInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ChatRoomsInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChatRoomsInfo", "updateTableSql %s", str3);
            k0Var.A("ChatRoomsInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChatRoomsInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322696n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322697o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69182x33752ff6;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322691f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322691f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("chatRoomsId")) {
            this.f69182x33752ff6 = contentValues.getAsString("chatRoomsId");
            if (z17) {
                this.f322698d = true;
            }
        }
        if (contentValues.containsKey("chatRooms")) {
            this.f69181xfa75997b = contentValues.getAsString("chatRooms");
            if (z17) {
                this.f322699e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
