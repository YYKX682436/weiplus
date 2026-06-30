package dm;

/* loaded from: classes8.dex */
public class w9 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final l75.e0 F;
    public static final o75.e G;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f322399o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f322400p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f322401q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f322402r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f322403s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f322404t;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.d f322405u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f322406v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f322407w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f322408x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f322409y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f322410z;

    /* renamed from: field_chatRoomName */
    public java.lang.String f69025x3b2058a3;

    /* renamed from: field_data */
    public byte[] f69026x225a93cf;

    /* renamed from: field_hashKey */
    public java.lang.String f69027x9e25d02c;

    /* renamed from: field_msgId */
    public long f69028x297eb4f7;

    /* renamed from: field_primaryKey */
    public java.lang.String f69029x6d297562;

    /* renamed from: field_read */
    public int f69030x2260fdbb;

    /* renamed from: field_state */
    public int f69031x29d3a50c;

    /* renamed from: field_updateTime */
    public long f69032xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322411d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322412e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322413f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322414g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322415h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322416i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322417m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f322418n = true;

    static {
        p75.n0 n0Var = new p75.n0("RoomVerifyApplicationStg");
        f322399o = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322400p = new p75.d("hashKey", "string", tableName, "");
        f322401q = new p75.d("chatRoomName", "string", tableName, "");
        f322402r = new p75.d("msgId", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322403s = new p75.d("state", "int", tableName, "");
        f322404t = new p75.d("read", "int", tableName, "");
        f322405u = new p75.d(dm.i4.f66874x4c6b1f55, "long", tableName, "");
        f322406v = new java.lang.String[0];
        f322407w = -1274920707;
        f322408x = 697508465;
        f322409y = 787786110;
        f322410z = 104191100;
        A = 3076010;
        B = 109757585;
        C = 3496342;
        D = -295931082;
        E = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "primaryKey";
        ((java.util.HashMap) e0Var.f398488d).put("primaryKey", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "primaryKey";
        e0Var.f398487c[1] = "hashKey";
        ((java.util.HashMap) e0Var.f398488d).put("hashKey", "TEXT");
        e0Var.f398487c[2] = "chatRoomName";
        ((java.util.HashMap) e0Var.f398488d).put("chatRoomName", "TEXT");
        e0Var.f398487c[3] = "msgId";
        ((java.util.HashMap) e0Var.f398488d).put("msgId", "LONG");
        e0Var.f398487c[4] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306;
        ((java.util.HashMap) e0Var.f398488d).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "BLOB");
        e0Var.f398487c[5] = "state";
        ((java.util.HashMap) e0Var.f398488d).put("state", "INTEGER");
        e0Var.f398487c[6] = "read";
        ((java.util.HashMap) e0Var.f398488d).put("read", "INTEGER");
        e0Var.f398487c[7] = dm.i4.f66874x4c6b1f55;
        ((java.util.HashMap) e0Var.f398488d).put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " primaryKey TEXT PRIMARY KEY ,  hashKey TEXT,  chatRoomName TEXT,  msgId LONG,  data BLOB,  state INTEGER,  read INTEGER,  updateTime LONG";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        F = e0Var;
        G = new o75.e();
    }

    /* renamed from: createTable */
    public static void m125663xe1f0e832(l75.k0 k0Var) {
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseRoomVerifyApplicationStg", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS RoomVerifyApplicationStg ( ");
        l75.e0 e0Var = F;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322406v) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRoomVerifyApplicationStg", "createTableSql %s", str2);
            k0Var.A("RoomVerifyApplicationStg", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "RoomVerifyApplicationStg", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRoomVerifyApplicationStg", "updateTableSql %s", str3);
            k0Var.A("RoomVerifyApplicationStg", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRoomVerifyApplicationStg", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
            if (f322407w == hashCode) {
                try {
                    this.f69029x6d297562 = cursor.getString(i17);
                    this.f322411d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322408x == hashCode) {
                try {
                    this.f69027x9e25d02c = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322409y == hashCode) {
                try {
                    this.f69025x3b2058a3 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322410z == hashCode) {
                try {
                    this.f69028x297eb4f7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f69026x225a93cf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f69031x29d3a50c = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f69030x2260fdbb = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f69032xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322411d) {
            contentValues.put("primaryKey", this.f69029x6d297562);
        }
        if (this.f322412e) {
            contentValues.put("hashKey", this.f69027x9e25d02c);
        }
        if (this.f322413f) {
            contentValues.put("chatRoomName", this.f69025x3b2058a3);
        }
        if (this.f322414g) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f69028x297eb4f7));
        }
        if (this.f322415h) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f69026x225a93cf);
        }
        if (this.f322416i) {
            contentValues.put("state", java.lang.Integer.valueOf(this.f69031x29d3a50c));
        }
        if (this.f322417m) {
            contentValues.put("read", java.lang.Integer.valueOf(this.f69030x2260fdbb));
        }
        if (this.f322418n) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f69032xa783a79b));
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
        m125663xe1f0e832(k0Var);
    }

    /* renamed from: deleteFromDB */
    public int m125664xbc662333(l75.k0 k0Var, boolean z17) {
        m75.b bVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f425117e, java.lang.String.valueOf(this.f69029x6d297562), "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
            cVar.f425123d = this;
            bVar = new m75.b(this, cVar, G, "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
        } else {
            bVar = new m75.b(this, null, null, "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
        }
        return bVar.a(k0Var);
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return F;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return G;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69029x6d297562;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322399o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322399o.f434209a;
    }

    /* renamed from: updateToDB */
    public int m125665xee5c84a2(l75.k0 k0Var, boolean z17) {
        m75.e eVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f425116d, java.lang.String.valueOf(this.f69029x6d297562), "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
            cVar.f425123d = this;
            eVar = new m75.e(this, cVar, G, "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
        } else {
            eVar = new m75.e(this, null, null, "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
        }
        return eVar.a(k0Var);
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("primaryKey")) {
            this.f69029x6d297562 = contentValues.getAsString("primaryKey");
            if (z17) {
                this.f322411d = true;
            }
        }
        if (contentValues.containsKey("hashKey")) {
            this.f69027x9e25d02c = contentValues.getAsString("hashKey");
            if (z17) {
                this.f322412e = true;
            }
        }
        if (contentValues.containsKey("chatRoomName")) {
            this.f69025x3b2058a3 = contentValues.getAsString("chatRoomName");
            if (z17) {
                this.f322413f = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.f69028x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f322414g = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)) {
            this.f69026x225a93cf = contentValues.getAsByteArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            if (z17) {
                this.f322415h = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.f69031x29d3a50c = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f322416i = true;
            }
        }
        if (contentValues.containsKey("read")) {
            this.f69030x2260fdbb = contentValues.getAsInteger("read").intValue();
            if (z17) {
                this.f322417m = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f69032xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f322418n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
