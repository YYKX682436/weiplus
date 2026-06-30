package dm;

/* loaded from: classes8.dex */
public class m8 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f320042i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f320043m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f320044n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f320045o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f320046p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f320047q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f320048r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320049s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320050t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320051u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320052v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320053w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f320054x;

    /* renamed from: y, reason: collision with root package name */
    public static final l75.e0 f320055y;

    /* renamed from: z, reason: collision with root package name */
    public static final o75.e f320056z;

    /* renamed from: field_createTime */
    public long f67445xac3be4e;

    /* renamed from: field_digest */
    public java.lang.String f67446xf66fcca9;

    /* renamed from: field_is_special_talker */
    public int f67447x8600184f;

    /* renamed from: field_msgId */
    public long f67448x297eb4f7;

    /* renamed from: field_talker */
    public java.lang.String f67449x114ef53e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320057d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320058e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320059f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320060g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320061h = true;

    static {
        p75.n0 n0Var = new p75.n0("NotifyMessageRecord");
        f320042i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320043m = new p75.d("msgId", "long", tableName, "");
        f320044n = new p75.d("talker", "string", tableName, "");
        f320045o = new p75.d("createTime", "long", tableName, "");
        f320046p = new p75.d("digest", "string", tableName, "");
        f320047q = new p75.d("is_special_talker", "int", tableName, "");
        f320048r = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS notifymessagerecordTalkerIndex ON NotifyMessageRecord(talker)"};
        f320049s = 104191100;
        f320050t = -881080743;
        f320051u = 1369213417;
        f320052v = -1331913276;
        f320053w = -804054956;
        f320054x = 108705909;
        f320055y = m125227x3593deb(dm.m8.class);
        f320056z = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125227x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "msgId";
        e0Var.f398488d.put("msgId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "msgId";
        e0Var.f398487c[1] = "talker";
        e0Var.f398488d.put("talker", "TEXT");
        e0Var.f398487c[2] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[3] = "digest";
        e0Var.f398488d.put("digest", "TEXT");
        e0Var.f398487c[4] = "is_special_talker";
        e0Var.f398488d.put("is_special_talker", "INTEGER");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " msgId LONG PRIMARY KEY ,  talker TEXT,  createTime LONG,  digest TEXT,  is_special_talker INTEGER";
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
            if (f320049s == hashCode) {
                try {
                    this.f67448x297eb4f7 = cursor.getLong(i17);
                    this.f320057d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNotifyMessageRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320050t == hashCode) {
                try {
                    this.f67449x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNotifyMessageRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320051u == hashCode) {
                try {
                    this.f67445xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNotifyMessageRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320052v == hashCode) {
                try {
                    this.f67446xf66fcca9 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNotifyMessageRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320053w == hashCode) {
                try {
                    this.f67447x8600184f = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNotifyMessageRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320054x == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320057d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f67448x297eb4f7));
        }
        if (this.f320058e) {
            contentValues.put("talker", this.f67449x114ef53e);
        }
        if (this.f320059f) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f67445xac3be4e));
        }
        if (this.f320060g) {
            contentValues.put("digest", this.f67446xf66fcca9);
        }
        if (this.f320061h) {
            contentValues.put("is_special_talker", java.lang.Integer.valueOf(this.f67447x8600184f));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseNotifyMessageRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS NotifyMessageRecord ( ");
        l75.e0 e0Var = f320055y;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320048r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseNotifyMessageRecord", "createTableSql %s", str2);
            k0Var.A("NotifyMessageRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "NotifyMessageRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseNotifyMessageRecord", "updateTableSql %s", str3);
            k0Var.A("NotifyMessageRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseNotifyMessageRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320055y;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320056z;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f67448x297eb4f7);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320042i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320042i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.f67448x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f320057d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f67449x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f320058e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f67445xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f320059f = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.f67446xf66fcca9 = contentValues.getAsString("digest");
            if (z17) {
                this.f320060g = true;
            }
        }
        if (contentValues.containsKey("is_special_talker")) {
            this.f67447x8600184f = contentValues.getAsInteger("is_special_talker").intValue();
            if (z17) {
                this.f320061h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
