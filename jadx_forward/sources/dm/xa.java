package dm;

/* loaded from: classes4.dex */
public class xa extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f322620h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f322621i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f322622m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f322623n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f322624o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322625p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322626q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f322627r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f322628s;

    /* renamed from: field_count */
    public int f69151x28f0318a;

    /* renamed from: field_memberList */
    public java.lang.String f69152x693306bd;

    /* renamed from: field_tagId */
    public long f69153x29d92ad0;

    /* renamed from: field_tagName */
    public java.lang.String f69154x183bff00;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322629d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322630e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322631f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322632g = true;

    static {
        p75.n0 n0Var = new p75.n0("SnsTagInfo");
        f322620h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322621i = new java.lang.String[0];
        f322622m = 110119509;
        f322623n = -1549184699;
        f322624o = 94851343;
        f322625p = -1341402536;
        f322626q = 108705909;
        f322627r = m125691x3593deb(dm.xa.class);
        f322628s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125691x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "tagId";
        e0Var.f398488d.put("tagId", "LONG default '0' ");
        e0Var.f398487c[1] = "tagName";
        e0Var.f398488d.put("tagName", "TEXT default '' ");
        e0Var.f398487c[2] = "count";
        e0Var.f398488d.put("count", "INTEGER default '0' ");
        e0Var.f398487c[3] = "memberList";
        e0Var.f398488d.put("memberList", "TEXT default '' ");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " tagId LONG default '0' ,  tagName TEXT default '' ,  count INTEGER default '0' ,  memberList TEXT default '' ";
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
            if (f322622m == hashCode) {
                try {
                    this.f69153x29d92ad0 = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsTagInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322623n == hashCode) {
                try {
                    this.f69154x183bff00 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsTagInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322624o == hashCode) {
                try {
                    this.f69151x28f0318a = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsTagInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322625p == hashCode) {
                try {
                    this.f69152x693306bd = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsTagInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322626q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322629d) {
            contentValues.put("tagId", java.lang.Long.valueOf(this.f69153x29d92ad0));
        }
        if (this.f69154x183bff00 == null) {
            this.f69154x183bff00 = "";
        }
        if (this.f322630e) {
            contentValues.put("tagName", this.f69154x183bff00);
        }
        if (this.f322631f) {
            contentValues.put("count", java.lang.Integer.valueOf(this.f69151x28f0318a));
        }
        if (this.f69152x693306bd == null) {
            this.f69152x693306bd = "";
        }
        if (this.f322632g) {
            contentValues.put("memberList", this.f69152x693306bd);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSnsTagInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsTagInfo ( ");
        l75.e0 e0Var = f322627r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322621i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsTagInfo", "createTableSql %s", str2);
            k0Var.A("SnsTagInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "SnsTagInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsTagInfo", "updateTableSql %s", str3);
            k0Var.A("SnsTagInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsTagInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322627r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322628s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322620h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322620h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("tagId")) {
            this.f69153x29d92ad0 = contentValues.getAsLong("tagId").longValue();
            if (z17) {
                this.f322629d = true;
            }
        }
        if (contentValues.containsKey("tagName")) {
            this.f69154x183bff00 = contentValues.getAsString("tagName");
            if (z17) {
                this.f322630e = true;
            }
        }
        if (contentValues.containsKey("count")) {
            this.f69151x28f0318a = contentValues.getAsInteger("count").intValue();
            if (z17) {
                this.f322631f = true;
            }
        }
        if (contentValues.containsKey("memberList")) {
            this.f69152x693306bd = contentValues.getAsString("memberList");
            if (z17) {
                this.f322632g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
