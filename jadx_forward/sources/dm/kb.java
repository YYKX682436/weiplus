package dm;

/* loaded from: classes8.dex */
public class kb extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f319648h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.d f319649i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f319650m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319651n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319652o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319653p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319654q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319655r;

    /* renamed from: s, reason: collision with root package name */
    public static final l75.e0 f319656s;

    /* renamed from: t, reason: collision with root package name */
    public static final o75.e f319657t;

    /* renamed from: field_chatRoomName */
    private java.lang.String f67259x3b2058a3;

    /* renamed from: field_id */
    private int f67260xc8a07680;

    /* renamed from: field_isCancel */
    private boolean f67261xf46a29e9;

    /* renamed from: field_topMsgInfoItem */
    private r45.dn6 f67262xcc4f0d2;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319658d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319659e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319660f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319661g = false;

    static {
        p75.n0 n0Var = new p75.n0("TopMsgInfoRecord");
        f319648h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319649i = new p75.d("chatRoomName", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319650m = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TopMsgInfoRecord_chatRoomName_index ON TopMsgInfoRecord(chatRoomName)", "CREATE INDEX IF NOT EXISTS TopMsgInfoRecord_id_index ON TopMsgInfoRecord(id)"};
        f319651n = 787786110;
        f319652o = 3355;
        f319653p = -693690300;
        f319654q = 1556641517;
        f319655r = 108705909;
        f319656s = m125180x3593deb(dm.kb.class);
        f319657t = new o75.e();
    }

    /* renamed from: createTable */
    public static void m125179xe1f0e832(l75.k0 k0Var) {
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseTopMsgInfoRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TopMsgInfoRecord ( ");
        l75.e0 e0Var = f319656s;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319650m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTopMsgInfoRecord", "createTableSql %s", str2);
            k0Var.A("TopMsgInfoRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "TopMsgInfoRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTopMsgInfoRecord", "updateTableSql %s", str3);
            k0Var.A("TopMsgInfoRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTopMsgInfoRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125180x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "chatRoomName";
        e0Var.f398488d.put("chatRoomName", "TEXT");
        e0Var.f398487c[1] = dm.i4.f66865x76d1ec5a;
        e0Var.f398488d.put(dm.i4.f66865x76d1ec5a, "INTEGER");
        e0Var.f398487c[2] = "isCancel";
        e0Var.f398488d.put("isCancel", "INTEGER default 'false' ");
        e0Var.f398487c[3] = "topMsgInfoItem";
        e0Var.f398488d.put("topMsgInfoItem", "BLOB");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " chatRoomName TEXT,  id INTEGER,  isCancel INTEGER default 'false' ,  topMsgInfoItem BLOB";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        return e0Var;
    }

    public void A0(boolean z17) {
        this.f67261xf46a29e9 = z17;
        this.f319660f = true;
    }

    public final void D0(r45.dn6 dn6Var) {
        this.f67262xcc4f0d2 = dn6Var;
        this.f319661g = true;
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
            if (f319651n == hashCode) {
                try {
                    this.f67259x3b2058a3 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTopMsgInfoRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319652o == hashCode) {
                try {
                    this.f67260xc8a07680 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTopMsgInfoRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319653p == hashCode) {
                try {
                    this.f67261xf46a29e9 = cursor.getInt(i17) != 0;
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTopMsgInfoRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319654q == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f67262xcc4f0d2 = (r45.dn6) new r45.dn6().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTopMsgInfoRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319655r == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319658d) {
            contentValues.put("chatRoomName", this.f67259x3b2058a3);
        }
        if (this.f319659e) {
            contentValues.put(dm.i4.f66865x76d1ec5a, java.lang.Integer.valueOf(this.f67260xc8a07680));
        }
        if (this.f319660f) {
            if (this.f67261xf46a29e9) {
                contentValues.put("isCancel", (java.lang.Integer) 1);
            } else {
                contentValues.put("isCancel", (java.lang.Integer) 0);
            }
        }
        if (this.f319661g) {
            r45.dn6 dn6Var = this.f67262xcc4f0d2;
            if (dn6Var != null) {
                try {
                    contentValues.put("topMsgInfoItem", dn6Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseTopMsgInfoRecord", e17.getMessage());
                }
            } else {
                contentValues.put("topMsgInfoItem", (byte[]) null);
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
        m125179xe1f0e832(k0Var);
    }

    /* renamed from: deleteFromDB */
    public int m125181xbc662333(l75.k0 k0Var, boolean z17) {
        m75.b bVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f425117e, java.lang.String.valueOf(mo9766x4c6b483e()), "MicroMsg.SDK.BaseTopMsgInfoRecord");
            cVar.f425123d = this;
            bVar = new m75.b(this, cVar, f319657t, "MicroMsg.SDK.BaseTopMsgInfoRecord");
        } else {
            bVar = new m75.b(this, null, null, "MicroMsg.SDK.BaseTopMsgInfoRecord");
        }
        return bVar.a(k0Var);
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319656s;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319657t;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319648h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319648h.f434209a;
    }

    public java.lang.String t0() {
        return this.f67259x3b2058a3;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "chatRoomName", this.f67259x3b2058a3);
            n51.f.b(jSONObject, dm.i4.f66865x76d1ec5a, java.lang.Integer.valueOf(this.f67260xc8a07680));
            n51.f.b(jSONObject, "isCancel", java.lang.Boolean.valueOf(this.f67261xf46a29e9));
            n51.f.b(jSONObject, "topMsgInfoItem", this.f67262xcc4f0d2);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    public int u0() {
        return this.f67260xc8a07680;
    }

    /* renamed from: updateToDB */
    public int m125182xee5c84a2(l75.k0 k0Var, boolean z17) {
        m75.e eVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f425116d, java.lang.String.valueOf(mo9766x4c6b483e()), "MicroMsg.SDK.BaseTopMsgInfoRecord");
            cVar.f425123d = this;
            eVar = new m75.e(this, cVar, f319657t, "MicroMsg.SDK.BaseTopMsgInfoRecord");
        } else {
            eVar = new m75.e(this, null, null, "MicroMsg.SDK.BaseTopMsgInfoRecord");
        }
        return eVar.a(k0Var);
    }

    public boolean v0() {
        return this.f67261xf46a29e9;
    }

    public final r45.dn6 w0() {
        return this.f67262xcc4f0d2;
    }

    public void y0(java.lang.String str) {
        this.f67259x3b2058a3 = str;
        this.f319658d = true;
    }

    public void z0(int i17) {
        this.f67260xc8a07680 = i17;
        this.f319659e = true;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("chatRoomName")) {
            this.f67259x3b2058a3 = contentValues.getAsString("chatRoomName");
            if (z17) {
                this.f319658d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66865x76d1ec5a)) {
            this.f67260xc8a07680 = contentValues.getAsInteger(dm.i4.f66865x76d1ec5a).intValue();
            if (z17) {
                this.f319659e = true;
            }
        }
        if (contentValues.containsKey("isCancel")) {
            this.f67261xf46a29e9 = contentValues.getAsInteger("isCancel").intValue() != 0;
            if (z17) {
                this.f319660f = true;
            }
        }
        if (contentValues.containsKey("topMsgInfoItem")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("topMsgInfoItem");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f67262xcc4f0d2 = (r45.dn6) new r45.dn6().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f319661g = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseTopMsgInfoRecord", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
