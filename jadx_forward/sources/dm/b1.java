package dm;

/* loaded from: classes4.dex */
public class b1 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f317324m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f317325n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f317326o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317327p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317328q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317329r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317330s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317331t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317332u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317333v;

    /* renamed from: w, reason: collision with root package name */
    public static final l75.e0 f317334w;

    /* renamed from: x, reason: collision with root package name */
    public static final o75.e f317335x;

    /* renamed from: field_clusterType */
    public int f65957x27b4e08f;

    /* renamed from: field_createTime */
    public long f65958xac3be4e;

    /* renamed from: field_massSendType */
    public int f65959x6367b51b;

    /* renamed from: field_msgId */
    public long f65960x297eb4f7;

    /* renamed from: field_scene */
    public int f65961x29cbf907;

    /* renamed from: field_talker */
    public java.lang.String f65962x114ef53e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317336d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317337e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317338f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317339g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317340h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317341i = true;

    static {
        p75.n0 n0Var = new p75.n0("BizContactConversationMassSend");
        f317324m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317325n = new p75.d("msgId", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317326o = new java.lang.String[0];
        f317327p = 104191100;
        f317328q = 1369213417;
        f317329r = 1463551478;
        f317330s = -1141536684;
        f317331t = 109254796;
        f317332u = -881080743;
        f317333v = 108705909;
        f317334w = m124806x3593deb(dm.b1.class);
        f317335x = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124806x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "msgId";
        e0Var.f398488d.put("msgId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "msgId";
        e0Var.f398487c[1] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[2] = "massSendType";
        e0Var.f398488d.put("massSendType", "INTEGER default '0' ");
        e0Var.f398487c[3] = "clusterType";
        e0Var.f398488d.put("clusterType", "INTEGER default '0' ");
        e0Var.f398487c[4] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "INTEGER default '0' ");
        e0Var.f398487c[5] = "talker";
        e0Var.f398488d.put("talker", "TEXT");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " msgId LONG PRIMARY KEY ,  createTime LONG,  massSendType INTEGER default '0' ,  clusterType INTEGER default '0' ,  scene INTEGER default '0' ,  talker TEXT";
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
            if (f317327p == hashCode) {
                try {
                    this.f65960x297eb4f7 = cursor.getLong(i17);
                    this.f317336d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizContactConversationMassSend", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317328q == hashCode) {
                try {
                    this.f65958xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizContactConversationMassSend", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317329r == hashCode) {
                try {
                    this.f65959x6367b51b = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizContactConversationMassSend", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317330s == hashCode) {
                try {
                    this.f65957x27b4e08f = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizContactConversationMassSend", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317331t == hashCode) {
                try {
                    this.f65961x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizContactConversationMassSend", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317332u == hashCode) {
                try {
                    this.f65962x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizContactConversationMassSend", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317333v == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317336d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f65960x297eb4f7));
        }
        if (this.f317337e) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f65958xac3be4e));
        }
        if (this.f317338f) {
            contentValues.put("massSendType", java.lang.Integer.valueOf(this.f65959x6367b51b));
        }
        if (this.f317339g) {
            contentValues.put("clusterType", java.lang.Integer.valueOf(this.f65957x27b4e08f));
        }
        if (this.f317340h) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f65961x29cbf907));
        }
        if (this.f317341i) {
            contentValues.put("talker", this.f65962x114ef53e);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBizContactConversationMassSend", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizContactConversationMassSend ( ");
        l75.e0 e0Var = f317334w;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317326o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizContactConversationMassSend", "createTableSql %s", str2);
            k0Var.A("BizContactConversationMassSend", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BizContactConversationMassSend", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizContactConversationMassSend", "updateTableSql %s", str3);
            k0Var.A("BizContactConversationMassSend", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizContactConversationMassSend", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317334w;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317335x;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f65960x297eb4f7);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317324m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317324m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.f65960x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f317336d = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f65958xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f317337e = true;
            }
        }
        if (contentValues.containsKey("massSendType")) {
            this.f65959x6367b51b = contentValues.getAsInteger("massSendType").intValue();
            if (z17) {
                this.f317338f = true;
            }
        }
        if (contentValues.containsKey("clusterType")) {
            this.f65957x27b4e08f = contentValues.getAsInteger("clusterType").intValue();
            if (z17) {
                this.f317339g = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f65961x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f317340h = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f65962x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f317341i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
