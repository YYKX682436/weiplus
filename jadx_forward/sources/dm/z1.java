package dm;

/* loaded from: classes8.dex */
public class z1 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f322899m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f322900n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f322901o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322902p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322903q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322904r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322905s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f322906t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f322907u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f322908v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f322909w;

    /* renamed from: field_lastLocalCreateTime */
    public long f69290xfc6f0f79;

    /* renamed from: field_lastLocalSeq */
    public long f69291x16eb58cf;

    /* renamed from: field_lastPushCreateTime */
    public long f69292xe2e39c3e;

    /* renamed from: field_lastPushSeq */
    public long f69293xcef36faa;

    /* renamed from: field_seqBlockInfo */
    public mo.d f69294xbf0c1c61;

    /* renamed from: field_username */
    public java.lang.String f69295xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322910d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322911e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322912f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322913g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322914h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322915i = true;

    static {
        p75.n0 n0Var = new p75.n0("ChatroomMsgSeq");
        f322899m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322900n = new java.lang.String[0];
        f322901o = -265713450;
        f322902p = 1664358255;
        f322903q = 180332970;
        f322904r = -617571111;
        f322905s = 230826558;
        f322906t = -1293914820;
        f322907u = 108705909;
        f322908v = m125725x3593deb(dm.z1.class);
        f322909w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125725x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66875xa013b0d5;
        e0Var.f398487c[1] = "lastPushSeq";
        e0Var.f398488d.put("lastPushSeq", "LONG");
        e0Var.f398487c[2] = "lastLocalSeq";
        e0Var.f398488d.put("lastLocalSeq", "LONG");
        e0Var.f398487c[3] = "lastPushCreateTime";
        e0Var.f398488d.put("lastPushCreateTime", "LONG");
        e0Var.f398487c[4] = "lastLocalCreateTime";
        e0Var.f398488d.put("lastLocalCreateTime", "LONG");
        e0Var.f398487c[5] = "seqBlockInfo";
        e0Var.f398488d.put("seqBlockInfo", "BLOB");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " username TEXT default ''  PRIMARY KEY ,  lastPushSeq LONG,  lastLocalSeq LONG,  lastPushCreateTime LONG,  lastLocalCreateTime LONG,  seqBlockInfo BLOB";
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
            if (f322901o == hashCode) {
                try {
                    this.f69295xdec927b = cursor.getString(i17);
                    this.f322910d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatroomMsgSeq", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322902p == hashCode) {
                try {
                    this.f69293xcef36faa = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatroomMsgSeq", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322903q == hashCode) {
                try {
                    this.f69291x16eb58cf = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatroomMsgSeq", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322904r == hashCode) {
                try {
                    this.f69292xe2e39c3e = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatroomMsgSeq", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322905s == hashCode) {
                try {
                    this.f69290xfc6f0f79 = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatroomMsgSeq", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322906t == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f69294xbf0c1c61 = (mo.d) new mo.d().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseChatroomMsgSeq", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322907u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f69295xdec927b == null) {
            this.f69295xdec927b = "";
        }
        if (this.f322910d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f69295xdec927b);
        }
        if (this.f322911e) {
            contentValues.put("lastPushSeq", java.lang.Long.valueOf(this.f69293xcef36faa));
        }
        if (this.f322912f) {
            contentValues.put("lastLocalSeq", java.lang.Long.valueOf(this.f69291x16eb58cf));
        }
        if (this.f322913g) {
            contentValues.put("lastPushCreateTime", java.lang.Long.valueOf(this.f69292xe2e39c3e));
        }
        if (this.f322914h) {
            contentValues.put("lastLocalCreateTime", java.lang.Long.valueOf(this.f69290xfc6f0f79));
        }
        if (this.f322915i) {
            mo.d dVar = this.f69294xbf0c1c61;
            if (dVar != null) {
                try {
                    contentValues.put("seqBlockInfo", dVar.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseChatroomMsgSeq", e17.getMessage());
                }
            } else {
                contentValues.put("seqBlockInfo", (byte[]) null);
            }
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseChatroomMsgSeq", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ChatroomMsgSeq ( ");
        l75.e0 e0Var = f322908v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322900n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChatroomMsgSeq", "createTableSql %s", str2);
            k0Var.A("ChatroomMsgSeq", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ChatroomMsgSeq", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChatroomMsgSeq", "updateTableSql %s", str3);
            k0Var.A("ChatroomMsgSeq", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseChatroomMsgSeq", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322908v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322909w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69295xdec927b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322899m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322899m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, dm.i4.f66875xa013b0d5, this.f69295xdec927b);
            n51.f.b(jSONObject, "lastPushSeq", java.lang.Long.valueOf(this.f69293xcef36faa));
            n51.f.b(jSONObject, "lastLocalSeq", java.lang.Long.valueOf(this.f69291x16eb58cf));
            n51.f.b(jSONObject, "lastPushCreateTime", java.lang.Long.valueOf(this.f69292xe2e39c3e));
            n51.f.b(jSONObject, "lastLocalCreateTime", java.lang.Long.valueOf(this.f69290xfc6f0f79));
            n51.f.b(jSONObject, "seqBlockInfo", this.f69294xbf0c1c61);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f69295xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f322910d = true;
            }
        }
        if (contentValues.containsKey("lastPushSeq")) {
            this.f69293xcef36faa = contentValues.getAsLong("lastPushSeq").longValue();
            if (z17) {
                this.f322911e = true;
            }
        }
        if (contentValues.containsKey("lastLocalSeq")) {
            this.f69291x16eb58cf = contentValues.getAsLong("lastLocalSeq").longValue();
            if (z17) {
                this.f322912f = true;
            }
        }
        if (contentValues.containsKey("lastPushCreateTime")) {
            this.f69292xe2e39c3e = contentValues.getAsLong("lastPushCreateTime").longValue();
            if (z17) {
                this.f322913g = true;
            }
        }
        if (contentValues.containsKey("lastLocalCreateTime")) {
            this.f69290xfc6f0f79 = contentValues.getAsLong("lastLocalCreateTime").longValue();
            if (z17) {
                this.f322914h = true;
            }
        }
        if (contentValues.containsKey("seqBlockInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("seqBlockInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f69294xbf0c1c61 = (mo.d) new mo.d().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f322915i = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseChatroomMsgSeq", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
