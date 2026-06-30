package dm;

/* loaded from: classes7.dex */
public class g8 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f318688n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f318689o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318690p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318691q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318692r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318693s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318694t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318695u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318696v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318697w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f318698x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f318699y;

    /* renamed from: field_createTime */
    public long f66660xac3be4e;

    /* renamed from: field_inviteUserName */
    public java.lang.String f66661x922cf104;

    /* renamed from: field_memberId */
    public long f66662xf70d5efa;

    /* renamed from: field_memberUuid */
    public long f66663x693749da;

    /* renamed from: field_status */
    public int f66664x10a0fed7;

    /* renamed from: field_userName */
    public java.lang.String f66665xdde069b;

    /* renamed from: field_wxGroupId */
    public java.lang.String f66666xacb0c0d4;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318700d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318701e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318702f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318703g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318704h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318705i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318706m = true;

    static {
        p75.n0 n0Var = new p75.n0("MultiTalkMember");
        f318688n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318689o = new java.lang.String[0];
        f318690p = -1341123211;
        f318691q = 303207897;
        f318692r = -266666762;
        f318693s = -500140257;
        f318694t = -649439915;
        f318695u = -892481550;
        f318696v = 1369213417;
        f318697w = 108705909;
        f318698x = m125006x3593deb(dm.g8.class);
        f318699y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125006x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "memberUuid";
        e0Var.f398488d.put("memberUuid", "LONG");
        e0Var.f398487c[1] = "wxGroupId";
        e0Var.f398488d.put("wxGroupId", "TEXT");
        e0Var.f398487c[2] = "userName";
        e0Var.f398488d.put("userName", "TEXT");
        e0Var.f398487c[3] = "inviteUserName";
        e0Var.f398488d.put("inviteUserName", "TEXT");
        e0Var.f398487c[4] = "memberId";
        e0Var.f398488d.put("memberId", "LONG");
        e0Var.f398487c[5] = "status";
        e0Var.f398488d.put("status", "INTEGER");
        e0Var.f398487c[6] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " memberUuid LONG,  wxGroupId TEXT,  userName TEXT,  inviteUserName TEXT,  memberId LONG,  status INTEGER,  createTime LONG";
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
            if (f318690p == hashCode) {
                try {
                    this.f66663x693749da = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkMember", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318691q == hashCode) {
                try {
                    this.f66666xacb0c0d4 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkMember", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318692r == hashCode) {
                try {
                    this.f66665xdde069b = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkMember", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318693s == hashCode) {
                try {
                    this.f66661x922cf104 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkMember", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318694t == hashCode) {
                try {
                    this.f66662xf70d5efa = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkMember", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318695u == hashCode) {
                try {
                    this.f66664x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkMember", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318696v == hashCode) {
                try {
                    this.f66660xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkMember", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318697w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318700d) {
            contentValues.put("memberUuid", java.lang.Long.valueOf(this.f66663x693749da));
        }
        if (this.f318701e) {
            contentValues.put("wxGroupId", this.f66666xacb0c0d4);
        }
        if (this.f318702f) {
            contentValues.put("userName", this.f66665xdde069b);
        }
        if (this.f318703g) {
            contentValues.put("inviteUserName", this.f66661x922cf104);
        }
        if (this.f318704h) {
            contentValues.put("memberId", java.lang.Long.valueOf(this.f66662xf70d5efa));
        }
        if (this.f318705i) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f66664x10a0fed7));
        }
        if (this.f318706m) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f66660xac3be4e));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseMultiTalkMember", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MultiTalkMember ( ");
        l75.e0 e0Var = f318698x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318689o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMultiTalkMember", "createTableSql %s", str2);
            k0Var.A("MultiTalkMember", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "MultiTalkMember", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMultiTalkMember", "updateTableSql %s", str3);
            k0Var.A("MultiTalkMember", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMultiTalkMember", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318698x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318699y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318688n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318688n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("memberUuid")) {
            this.f66663x693749da = contentValues.getAsLong("memberUuid").longValue();
            if (z17) {
                this.f318700d = true;
            }
        }
        if (contentValues.containsKey("wxGroupId")) {
            this.f66666xacb0c0d4 = contentValues.getAsString("wxGroupId");
            if (z17) {
                this.f318701e = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.f66665xdde069b = contentValues.getAsString("userName");
            if (z17) {
                this.f318702f = true;
            }
        }
        if (contentValues.containsKey("inviteUserName")) {
            this.f66661x922cf104 = contentValues.getAsString("inviteUserName");
            if (z17) {
                this.f318703g = true;
            }
        }
        if (contentValues.containsKey("memberId")) {
            this.f66662xf70d5efa = contentValues.getAsLong("memberId").longValue();
            if (z17) {
                this.f318704h = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f66664x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f318705i = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f66660xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f318706m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
