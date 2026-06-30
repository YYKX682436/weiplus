package dm;

/* loaded from: classes8.dex */
public class a2 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f317097i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f317098m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f317099n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f317100o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317101p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317102q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317103r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317104s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317105t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317106u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f317107v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f317108w;

    /* renamed from: field_dataId */
    public java.lang.String f65843xf604e54a;

    /* renamed from: field_dataPath */
    public java.lang.String f65844x8863ec94;

    /* renamed from: field_msgId */
    public long f65845x297eb4f7;

    /* renamed from: field_size */
    public long f65846x22618426;

    /* renamed from: field_thumbPath */
    public java.lang.String f65847xe9deda16;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317109d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317110e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317111f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317112g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317113h = true;

    static {
        p75.n0 n0Var = new p75.n0("ChatroomNoticeAttachIndex");
        f317097i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317098m = new p75.d("msgId", "long", tableName, "");
        f317099n = new p75.d("dataId", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317100o = new java.lang.String[0];
        f317101p = 104191100;
        f317102q = -1338919323;
        f317103r = 1788928751;
        f317104s = 1329639195;
        f317105t = 3530753;
        f317106u = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "msgId";
        ((java.util.HashMap) e0Var.f398488d).put("msgId", "LONG");
        e0Var.f398487c[1] = "dataId";
        ((java.util.HashMap) e0Var.f398488d).put("dataId", "TEXT");
        e0Var.f398487c[2] = "dataPath";
        ((java.util.HashMap) e0Var.f398488d).put("dataPath", "TEXT");
        e0Var.f398487c[3] = "thumbPath";
        ((java.util.HashMap) e0Var.f398488d).put("thumbPath", "TEXT");
        e0Var.f398487c[4] = "size";
        ((java.util.HashMap) e0Var.f398488d).put("size", "LONG");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " msgId LONG,  dataId TEXT,  dataPath TEXT,  thumbPath TEXT,  size LONG";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f317107v = e0Var;
        f317108w = new o75.e();
    }

    /* renamed from: createTable */
    public static void m124781xe1f0e832(l75.k0 k0Var) {
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ChatroomNoticeAttachIndex ( ");
        l75.e0 e0Var = f317107v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317100o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", "createTableSql %s", str2);
            k0Var.A("ChatroomNoticeAttachIndex", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ChatroomNoticeAttachIndex", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", "updateTableSql %s", str3);
            k0Var.A("ChatroomNoticeAttachIndex", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
            if (f317101p == hashCode) {
                try {
                    this.f65845x297eb4f7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317102q == hashCode) {
                try {
                    this.f65843xf604e54a = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317103r == hashCode) {
                try {
                    this.f65844x8863ec94 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317104s == hashCode) {
                try {
                    this.f65847xe9deda16 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317105t == hashCode) {
                try {
                    this.f65846x22618426 = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317106u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317109d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f65845x297eb4f7));
        }
        if (this.f317110e) {
            contentValues.put("dataId", this.f65843xf604e54a);
        }
        if (this.f317111f) {
            contentValues.put("dataPath", this.f65844x8863ec94);
        }
        if (this.f317112g) {
            contentValues.put("thumbPath", this.f65847xe9deda16);
        }
        if (this.f317113h) {
            contentValues.put("size", java.lang.Long.valueOf(this.f65846x22618426));
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
        m124781xe1f0e832(k0Var);
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317107v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317108w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317097i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317097i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.f65845x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f317109d = true;
            }
        }
        if (contentValues.containsKey("dataId")) {
            this.f65843xf604e54a = contentValues.getAsString("dataId");
            if (z17) {
                this.f317110e = true;
            }
        }
        if (contentValues.containsKey("dataPath")) {
            this.f65844x8863ec94 = contentValues.getAsString("dataPath");
            if (z17) {
                this.f317111f = true;
            }
        }
        if (contentValues.containsKey("thumbPath")) {
            this.f65847xe9deda16 = contentValues.getAsString("thumbPath");
            if (z17) {
                this.f317112g = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.f65846x22618426 = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f317113h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
