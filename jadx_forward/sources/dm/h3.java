package dm;

/* loaded from: classes4.dex */
public class h3 extends l75.f0 {
    public static final l75.e0 A;
    public static final o75.e B;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f318865n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f318866o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f318867p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f318868q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f318869r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318870s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318871t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318872u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318873v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318874w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318875x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318876y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318877z;

    /* renamed from: field_auxIndex */
    private java.lang.String f66751x784be213;

    /* renamed from: field_docId */
    private long f66752x28fe00ee;

    /* renamed from: field_entityId */
    private long f66753xa0778a03;

    /* renamed from: field_status */
    private int f66754x10a0fed7;

    /* renamed from: field_subType */
    private int f66755x5334f55;

    /* renamed from: field_timestamp */
    private long f66756x9de75411;

    /* renamed from: field_type */
    private int f66757x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318878d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318879e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318880f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318881g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318882h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318883i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318884m = false;

    static {
        p75.n0 n0Var = new p75.n0("FTS5MetaMessage");
        f318865n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318866o = new p75.d("entity_id", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318867p = new p75.d(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "long", tableName, "");
        f318868q = new p75.d("status", "int", tableName, "");
        f318869r = new java.lang.String[0];
        f318870s = 95757395;
        f318871t = 3575610;
        f318872u = -1867567750;
        f318873v = -740565257;
        f318874w = 467329943;
        f318875x = 55126294;
        f318876y = -892481550;
        f318877z = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "docid";
        ((java.util.HashMap) e0Var.f398488d).put("docid", "LONG default '0'  PRIMARY KEY ");
        e0Var.f398486b = "docid";
        e0Var.f398487c[1] = "type";
        ((java.util.HashMap) e0Var.f398488d).put("type", "INTEGER default '0' ");
        e0Var.f398487c[2] = "subtype";
        ((java.util.HashMap) e0Var.f398488d).put("subtype", "INTEGER default '0' ");
        e0Var.f398487c[3] = "entity_id";
        ((java.util.HashMap) e0Var.f398488d).put("entity_id", "LONG default '0' ");
        e0Var.f398487c[4] = "aux_index";
        ((java.util.HashMap) e0Var.f398488d).put("aux_index", "TEXT default '' ");
        e0Var.f398487c[5] = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6;
        ((java.util.HashMap) e0Var.f398488d).put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "LONG default '0' ");
        e0Var.f398487c[6] = "status";
        ((java.util.HashMap) e0Var.f398488d).put("status", "INTEGER default '0' ");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " docid LONG default '0'  PRIMARY KEY ,  type INTEGER default '0' ,  subtype INTEGER default '0' ,  entity_id LONG default '0' ,  aux_index TEXT default '' ,  timestamp LONG default '0' ,  status INTEGER default '0' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        A = e0Var;
        B = new o75.e();
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
            if (f318870s == hashCode) {
                try {
                    this.f66752x28fe00ee = cursor.getLong(i17);
                    this.f318878d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaMessage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318871t == hashCode) {
                try {
                    this.f66757x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaMessage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318872u == hashCode) {
                try {
                    this.f66755x5334f55 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaMessage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318873v == hashCode) {
                try {
                    this.f66753xa0778a03 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaMessage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318874w == hashCode) {
                try {
                    this.f66751x784be213 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaMessage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318875x == hashCode) {
                try {
                    this.f66756x9de75411 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaMessage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318876y == hashCode) {
                try {
                    this.f66754x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaMessage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318877z == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318878d) {
            contentValues.put("docid", java.lang.Long.valueOf(this.f66752x28fe00ee));
        }
        if (this.f318879e) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f66757x2262335f));
        }
        if (this.f318880f) {
            contentValues.put("subtype", java.lang.Integer.valueOf(this.f66755x5334f55));
        }
        if (this.f318881g) {
            contentValues.put("entity_id", java.lang.Long.valueOf(this.f66753xa0778a03));
        }
        if (this.f66751x784be213 == null) {
            this.f66751x784be213 = "";
        }
        if (this.f318882h) {
            contentValues.put("aux_index", this.f66751x784be213);
        }
        if (this.f318883i) {
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f66756x9de75411));
        }
        if (this.f318884m) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f66754x10a0fed7));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFTS5MetaMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FTS5MetaMessage ( ");
        l75.e0 e0Var = A;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318869r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFTS5MetaMessage", "createTableSql %s", str2);
            k0Var.A("FTS5MetaMessage", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FTS5MetaMessage", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFTS5MetaMessage", "updateTableSql %s", str3);
            k0Var.A("FTS5MetaMessage", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFTS5MetaMessage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return B;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f66752x28fe00ee);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318865n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318865n.f434209a;
    }

    public long t0() {
        return this.f66753xa0778a03;
    }

    public long u0() {
        return this.f66756x9de75411;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("docid")) {
            this.f66752x28fe00ee = contentValues.getAsLong("docid").longValue();
            if (z17) {
                this.f318878d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f66757x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f318879e = true;
            }
        }
        if (contentValues.containsKey("subtype")) {
            this.f66755x5334f55 = contentValues.getAsInteger("subtype").intValue();
            if (z17) {
                this.f318880f = true;
            }
        }
        if (contentValues.containsKey("entity_id")) {
            this.f66753xa0778a03 = contentValues.getAsLong("entity_id").longValue();
            if (z17) {
                this.f318881g = true;
            }
        }
        if (contentValues.containsKey("aux_index")) {
            this.f66751x784be213 = contentValues.getAsString("aux_index");
            if (z17) {
                this.f318882h = true;
            }
        }
        if (contentValues.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            this.f66756x9de75411 = contentValues.getAsLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6).longValue();
            if (z17) {
                this.f318883i = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f66754x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f318884m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
