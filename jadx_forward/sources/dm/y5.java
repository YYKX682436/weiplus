package dm;

/* loaded from: classes4.dex */
public class y5 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f322735f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f322736g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f322737h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f322738i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f322739m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f322740n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f322741o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322742d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322743e = true;

    /* renamed from: field_cache */
    public byte[] f69193x28e98ffd;

    /* renamed from: field_reqType */
    public java.lang.String f69194xb5d2eab3;

    static {
        p75.n0 n0Var = new p75.n0("GetEmotionStoreRecListCache");
        f322735f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322736g = new java.lang.String[0];
        f322737h = 1094728952;
        f322738i = 94416770;
        f322739m = 108705909;
        f322740n = m125708x3593deb(dm.y5.class);
        f322741o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125708x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "reqType";
        e0Var.f398488d.put("reqType", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "reqType";
        e0Var.f398487c[1] = "cache";
        e0Var.f398488d.put("cache", "BLOB default '' ");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " reqType TEXT PRIMARY KEY ,  cache BLOB default '' ";
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
            if (f322737h == hashCode) {
                try {
                    this.f69194xb5d2eab3 = cursor.getString(i17);
                    this.f322742d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322738i == hashCode) {
                try {
                    this.f69193x28e98ffd = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322739m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322742d) {
            contentValues.put("reqType", this.f69194xb5d2eab3);
        }
        if (this.f322743e) {
            contentValues.put("cache", this.f69193x28e98ffd);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GetEmotionStoreRecListCache ( ");
        l75.e0 e0Var = f322740n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322736g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", "createTableSql %s", str2);
            k0Var.A("GetEmotionStoreRecListCache", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GetEmotionStoreRecListCache", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", "updateTableSql %s", str3);
            k0Var.A("GetEmotionStoreRecListCache", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGetEmotionStoreRecListCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322740n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322741o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69194xb5d2eab3;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322735f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322735f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("reqType")) {
            this.f69194xb5d2eab3 = contentValues.getAsString("reqType");
            if (z17) {
                this.f322742d = true;
            }
        }
        if (contentValues.containsKey("cache")) {
            this.f69193x28e98ffd = contentValues.getAsByteArray("cache");
            if (z17) {
                this.f322743e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
