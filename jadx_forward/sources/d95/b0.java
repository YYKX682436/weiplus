package d95;

/* loaded from: classes12.dex */
public class b0 implements l75.k0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f309142a;

    /* renamed from: b, reason: collision with root package name */
    public d95.f f309143b;

    /* renamed from: c, reason: collision with root package name */
    public final l75.i0 f309144c;

    /* renamed from: d, reason: collision with root package name */
    public l75.j0 f309145d;

    /* renamed from: e, reason: collision with root package name */
    public d95.a f309146e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f309147f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f309148g;

    /* renamed from: h, reason: collision with root package name */
    public long f309149h;

    public b0(l75.i0 i0Var) {
        this.f309142a = "MicroMsg.SqliteDB";
        this.f309143b = null;
        this.f309144c = null;
        this.f309145d = null;
        this.f309146e = new d95.a();
        this.f309147f = "";
        this.f309148g = "";
        new java.util.LinkedList();
        this.f309149h = 0L;
        this.f309144c = i0Var;
    }

    public static java.lang.String O(java.lang.String str) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : android.database.DatabaseUtils.sqlEscapeString(str);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [d95.b0$$g] */
    @Override // l75.k0
    public boolean A(java.lang.String str, final java.lang.String str2) {
        iz5.a.g("sql is null ", !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2));
        if (mo123783xb9a70294()) {
            return ((java.lang.Boolean) new java.lang.Object() { // from class: d95.b0$$g
                public final java.lang.Object a() {
                    java.lang.String str3 = str2;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        b0Var.f309143b.f(str3);
                        return java.lang.Boolean.TRUE;
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(181L, 11L, 1L, false);
                        java.lang.String message = e17.getMessage();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f309142a, "execSQL Error :" + message);
                        if (message == null || !message.contains("no such table")) {
                            return java.lang.Boolean.FALSE;
                        }
                        com.p314xaae8f345.mm.vfs.w6.h(b0Var.f309146e.f309127c);
                        l75.j0 j0Var = b0Var.f309145d;
                        if (j0Var != null) {
                            ((gm0.C28424x57b5d14) j0Var).a();
                        }
                        throw e17;
                    }
                }
            }.a()).booleanValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return false;
    }

    @Override // l75.k0
    public android.database.Cursor B(java.lang.String str, java.lang.String[] strArr) {
        return f(str, strArr, 0);
    }

    @Override // l75.k0
    public void C() {
        P().m107403x3e28f15();
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [d95.b0$$a] */
    @Override // l75.k0
    public android.database.Cursor D(final java.lang.String str, final java.lang.String[] strArr, final java.lang.String str2, final java.lang.String[] strArr2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final int i17) {
        final java.lang.String str6 = null;
        if (mo123783xb9a70294()) {
            return (android.database.Cursor) new java.lang.Object() { // from class: d95.b0$$a
                public final java.lang.Object a() {
                    com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory;
                    java.lang.String str7 = str;
                    java.lang.String[] strArr3 = strArr;
                    java.lang.String str8 = str2;
                    java.lang.String[] strArr4 = strArr2;
                    java.lang.String str9 = str3;
                    java.lang.String str10 = str4;
                    java.lang.String str11 = str5;
                    java.lang.String str12 = str6;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f309143b;
                        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = fVar.f309211a;
                        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c72 = c26948xabb259c7 != null ? c26948xabb259c7 : fVar.f309212b;
                        boolean z17 = (d95.f.f309198k & 2) != 0;
                        int i18 = i17;
                        if (i18 == 4) {
                            cursorFactory = e95.m.f331958r;
                        } else if (i18 == 100) {
                            cursorFactory = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea;
                        } else {
                            if ((z65.c.a() || z17) && i18 != 0) {
                                if (i18 == 1) {
                                    cursorFactory = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26945x5aacfea2.f58198xe9b6bcea;
                                } else if (i18 == 2) {
                                    cursorFactory = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea;
                                }
                            }
                            cursorFactory = null;
                        }
                        if (d95.f.n()) {
                            d95.f.f309201n.c(c26948xabb259c72, 1, str7);
                        }
                        com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107708xe8f38f7c = c26948xabb259c72.m107708xe8f38f7c(cursorFactory, false, str7, strArr3, str8, strArr4, str9, str10, str11, str12);
                        return i18 != 4 ? new d95.p(m107708xe8f38f7c, str7) : m107708xe8f38f7c;
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(181L, 10L, 1L, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f309142a, "query Error :" + e17.getMessage());
                        return d95.d.a();
                    }
                }
            }.a();
        }
        java.lang.String str7 = this.f309142a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str7, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return d95.d.a();
    }

    @Override // l75.k0
    public android.database.Cursor E(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return D(str, strArr, str2, strArr2, str3, str4, str5, 0);
    }

    @Override // l75.k0
    public synchronized long F(java.lang.Long l17) {
        long id6 = java.lang.Thread.currentThread().getId();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309142a, "beginTransaction thr:(%d,%d) ticket:%d db:%b", l17, java.lang.Long.valueOf(id6), java.lang.Long.valueOf(this.f309149h), java.lang.Boolean.valueOf(mo123783xb9a70294()));
        if (!mo123783xb9a70294()) {
            java.lang.String str = this.f309142a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return -4L;
        }
        if (this.f309149h > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "ERROR beginTransaction transactionTicket:" + this.f309149h);
            return -1L;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e() && l17.longValue() == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "FORBID: beginTrans UNKNOW_THREAD ParamID:%d nowThr:%d", l17, java.lang.Long.valueOf(id6));
            return -2L;
        }
        try {
            this.f309143b.b();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f309149h = (java.lang.System.currentTimeMillis() & 2147483647L) | ((2147483647L & id6) << 32);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309142a, "beginTransaction done thr:(%d,%d) ticket:%d db:%b stack:%s", l17, java.lang.Long.valueOf(id6), java.lang.Long.valueOf(this.f309149h), java.lang.Boolean.valueOf(mo123783xb9a70294()), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            l75.i0 i0Var = this.f309144c;
            if (i0Var != null) {
                i0Var.d();
            }
            return this.f309149h;
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(181L, 8L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "beginTransaction Error :" + e17.getMessage());
            return -3L;
        }
    }

    @Override // l75.k0
    public synchronized boolean G() {
        if (mo123783xb9a70294()) {
            return this.f309149h > 0;
        }
        java.lang.String str = this.f309142a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [d95.b0$$f] */
    @Override // l75.k0
    public boolean H(java.lang.String str, final java.lang.String str2, final java.lang.Object[] objArr) {
        iz5.a.g("sql is null ", !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2));
        if (mo123783xb9a70294()) {
            return ((java.lang.Boolean) new java.lang.Object() { // from class: d95.b0$$f
                public final java.lang.Object a() {
                    java.lang.Object[] objArr2 = objArr;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f309143b;
                        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = fVar.f309211a;
                        if (c26948xabb259c7 == null) {
                            c26948xabb259c7 = fVar.f309212b;
                        }
                        boolean n17 = d95.f.n();
                        java.lang.String str3 = str2;
                        if (n17) {
                            d95.f.f309201n.c(c26948xabb259c7, 32769, str3);
                        }
                        c26948xabb259c7.m107672xb158737d(str3, objArr2);
                        return java.lang.Boolean.TRUE;
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(181L, 11L, 1L, false);
                        java.lang.String message = e17.getMessage();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f309142a, "execSQL Error :" + message);
                        if (message == null || !message.contains("no such table")) {
                            return java.lang.Boolean.FALSE;
                        }
                        com.p314xaae8f345.mm.vfs.w6.h(b0Var.f309146e.f309127c);
                        l75.j0 j0Var = b0Var.f309145d;
                        if (j0Var != null) {
                            ((gm0.C28424x57b5d14) j0Var).a();
                        }
                        throw e17;
                    }
                }
            }.a()).booleanValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return false;
    }

    @Override // l75.k0
    public boolean I(java.lang.String str) {
        if (!mo123783xb9a70294()) {
            java.lang.String str2 = this.f309142a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return false;
        }
        try {
            this.f309143b.f("DROP TABLE " + str);
            return true;
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(181L, 11L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "drop table Error :" + e17.getMessage());
            return false;
        }
    }

    @Override // l75.k0
    public boolean J() {
        d95.f fVar = this.f309143b;
        return fVar == null || !fVar.o();
    }

    @Override // l75.k0
    public boolean K() {
        d95.a aVar = this.f309146e;
        if (aVar != null) {
            return aVar.f309131g;
        }
        return false;
    }

    public void L() {
        M(null);
    }

    public void M(java.lang.String str) {
        if (this.f309143b == null) {
            return;
        }
        l75.i0 i0Var = this.f309144c;
        if (i0Var != null) {
            i0Var.p();
        }
        java.lang.String str2 = this.f309142a;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(G());
        java.lang.String hexString = java.lang.Long.toHexString(this.f309149h);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "begin close db, inTrans:%b ticket:%s  thr:%d {%s}", valueOf, hexString, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        fp.j jVar = new fp.j();
        if (str != null) {
            this.f309147f = str;
        }
        this.f309143b.c();
        this.f309143b = null;
        jVar.a();
    }

    public synchronized int N(java.lang.Long l17, boolean z17) {
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long id6 = java.lang.Thread.currentThread().getId();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309142a, "endTransaction thr:%d ticket:(%d,%d) db:%b, success=%b", java.lang.Long.valueOf(id6), l17, java.lang.Long.valueOf(this.f309149h), java.lang.Boolean.valueOf(mo123783xb9a70294()), java.lang.Boolean.valueOf(z17));
        if (!mo123783xb9a70294()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return -4;
        }
        if (l17 == null) {
            if (z17) {
                this.f309143b.e();
            } else {
                this.f309143b.y();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309142a, "endTransaction Succ Time:%d thr:%d ticket:(%d,%d)", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(id6), l17, java.lang.Long.valueOf(this.f309149h));
            return 0;
        }
        if (l17.longValue() != this.f309149h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "ERROR endTransaction ticket:" + l17 + " transactionTicket:" + this.f309149h);
            return -1;
        }
        long longValue = (l17.longValue() >> 32) & 2147483647L;
        if (longValue != id6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "FORBID: endTrans UNKNOW_THREAD ticket:%s ParamID:%d nowThr:%d", java.lang.Long.toHexString(l17.longValue()), java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(id6));
            return -2;
        }
        try {
            if (z17) {
                this.f309143b.e();
            } else {
                this.f309143b.y();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309142a, "endTransaction Succ Time:%d thr:%d ticket:(%d,%d) db:%b", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(id6), l17, java.lang.Long.valueOf(this.f309149h), java.lang.Boolean.valueOf(mo123783xb9a70294()));
            this.f309149h = 0L;
            l75.i0 i0Var = this.f309144c;
            if (i0Var != null) {
                i0Var.u();
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "endTransaction Error :" + e17.getMessage());
            jx3.f.INSTANCE.mo68477x336bdfd8(181L, 9L, 1L, false);
            return -3;
        }
    }

    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 P() {
        d95.f fVar = this.f309143b;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = fVar.f309211a;
        return c26948xabb259c7 != null ? c26948xabb259c7 : fVar.f309212b;
    }

    public final void Q(java.lang.String str) {
        java.lang.String a17 = bm5.f1.a();
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309142a, "check process :[%s] [%s] path[%s]", a17, str2, str);
        if (a17 == null || str2 == null || str2.equals(a17)) {
            return;
        }
        iz5.a.g("processName:" + a17 + "  packagename:" + str2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f6, code lost:
    
        r25 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0296, code lost:
    
        if (r7.f309125a != null) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean R(java.lang.String r35, java.lang.String r36, java.lang.String r37, long r38, java.lang.String r40, java.util.HashMap r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d95.b0.R(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.util.HashMap, boolean):boolean");
    }

    public boolean S(java.lang.String str, java.util.HashMap hashMap, boolean z17, boolean z18) {
        boolean z19;
        d95.f fVar;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            this.f309142a += "." + str.substring(lastIndexOf + 1);
        }
        Q(str);
        d95.a aVar = this.f309146e;
        d95.f fVar2 = aVar.f309125a;
        if (fVar2 != null) {
            fVar2.c();
            aVar.f309125a = null;
        }
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBInit", "initSysDB checkini:%b exist:%b db:%s ", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(j17), str);
            aVar.f309125a = d95.f.t(str, z18);
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 unused) {
        }
        if (aVar.c(hashMap, z17, !j17)) {
            z19 = true;
            if (!z19) {
            }
            this.f309143b = null;
            this.f309146e = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "initDB failed.");
            return false;
        }
        d95.f fVar3 = aVar.f309125a;
        if (fVar3 != null) {
            fVar3.c();
            aVar.f309125a = null;
        }
        z19 = false;
        if (!z19 && (fVar = this.f309146e.f309125a) != null) {
            this.f309143b = fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309142a, "SqliteDB db %s", fVar);
            return true;
        }
        this.f309143b = null;
        this.f309146e = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "initDB failed.");
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [d95.b0$$e] */
    public long T(final java.lang.String str, final java.lang.String str2, final android.content.ContentValues contentValues, final boolean z17) {
        if (mo123783xb9a70294()) {
            return ((java.lang.Long) new java.lang.Object() { // from class: d95.b0$$e
                public final java.lang.Object a() {
                    java.lang.String str3 = str2;
                    android.content.ContentValues contentValues2 = contentValues;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f309143b;
                        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = fVar.f309211a;
                        if (c26948xabb259c7 == null) {
                            c26948xabb259c7 = fVar.f309212b;
                        }
                        boolean n17 = d95.f.n();
                        java.lang.String str4 = str;
                        if (n17) {
                            d95.f.f309201n.c(c26948xabb259c7, 32769, str4);
                        }
                        return java.lang.Long.valueOf(c26948xabb259c7.m107690xb970c2b9(str4, str3, contentValues2));
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(181L, 11L, 1L, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f309142a, "insert Error :" + e17.getMessage());
                        if (z17) {
                            throw e17;
                        }
                        return -1L;
                    }
                }
            }.a()).longValue();
        }
        java.lang.String str3 = this.f309142a;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return -2L;
    }

    public android.database.Cursor U(java.lang.String str, java.lang.String[] strArr, int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        iz5.a.g("sql is null ", !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str));
        if (!mo123783xb9a70294()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return d95.d.a();
        }
        try {
            return this.f309143b.v(str, strArr, i17, false, c26987xeef691ab);
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(181L, 10L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "rawQuery Error :" + e17.getMessage());
            return d95.d.a();
        }
    }

    public android.database.Cursor V(java.lang.String str, java.lang.String[] strArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        iz5.a.g("sql is null ", !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str));
        if (!mo123783xb9a70294()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return d95.d.a();
        }
        try {
            return this.f309143b.v(str, strArr, 0, false, c26987xeef691ab);
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(181L, 10L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "rawQuery Error :" + e17.getMessage());
            return d95.d.a();
        }
    }

    @Override // l75.k0
    public boolean a() {
        return false;
    }

    @Override // l75.k0
    public long b() {
        return F(-1L);
    }

    @Override // l75.k0
    public boolean c() {
        return this.f309146e.f309128d;
    }

    @Override // l75.k0
    /* renamed from: close */
    public void mo70513x5a5ddf8() {
        this.f309143b.c();
    }

    @Override // l75.k0
    public android.database.Cursor d(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        return V(android.database.sqlite.SQLiteQueryBuilder.buildQueryString(z17, str, strArr, str2, str3, str4, str5, str6), strArr2, c26987xeef691ab);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d95.b0$$c] */
    @Override // l75.k0
    /* renamed from: delete */
    public int mo70514xb06685ab(final java.lang.String str, final java.lang.String str2, final java.lang.String[] strArr) {
        if (mo123783xb9a70294()) {
            return ((java.lang.Integer) new java.lang.Object() { // from class: d95.b0$$c
                public final java.lang.Object a() {
                    java.lang.String str3 = str2;
                    java.lang.String[] strArr2 = strArr;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f309143b;
                        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = fVar.f309211a;
                        if (c26948xabb259c7 == null) {
                            c26948xabb259c7 = fVar.f309212b;
                        }
                        boolean n17 = d95.f.n();
                        java.lang.String str4 = str;
                        if (n17) {
                            d95.f.f309201n.c(c26948xabb259c7, 32769, str4);
                        }
                        return java.lang.Integer.valueOf(c26948xabb259c7.m107665xb06685ab(str4, str3, strArr2));
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(181L, 11L, 1L, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f309142a, "delete Error :" + e17.getMessage());
                        return -1;
                    }
                }
            }.a()).intValue();
        }
        java.lang.String str3 = this.f309142a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return -2;
    }

    @Override // l75.k0
    public long e() {
        return this.f309143b.h();
    }

    @Override // l75.k0
    public android.database.Cursor f(java.lang.String str, java.lang.String[] strArr, int i17) {
        iz5.a.g("sql is null ", !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str));
        if (!mo123783xb9a70294()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return d95.d.a();
        }
        try {
            return this.f309143b.v(str, strArr, i17, false, null);
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(181L, 10L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "rawQuery Error :" + e17.getMessage());
            return d95.d.a();
        }
    }

    /* renamed from: finalize */
    public void m123782xd764dc1e() {
        M(null);
    }

    @Override // l75.k0
    public l75.e1 g() {
        if (mo123783xb9a70294()) {
            this.f309143b.getClass();
            return d95.f.f309201n.a();
        }
        java.lang.String str = this.f309142a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return null;
    }

    @Override // l75.k0
    /* renamed from: getPath */
    public java.lang.String mo70515xfb83cc9b() {
        if (mo123783xb9a70294()) {
            return this.f309143b.k();
        }
        java.lang.String str = this.f309142a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return null;
    }

    @Override // l75.k0
    public long h(long j17) {
        return this.f309143b.g() - j17;
    }

    @Override // l75.k0
    public com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.LeafInfo i(java.lang.String[] strArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        return com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.LeafInfo.m107988x35c67d(P(), strArr, c26987xeef691ab);
    }

    @Override // l75.k0
    /* renamed from: isOpen */
    public boolean mo123783xb9a70294() {
        d95.f fVar = this.f309143b;
        if (fVar != null && fVar.o()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "DB has been closed :[%s]", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f309147f)));
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [d95.b0$$h] */
    @Override // l75.k0
    public boolean j(java.lang.String str, final java.lang.String str2, final java.lang.Object[] objArr, final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        iz5.a.g("sql is null ", !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2));
        if (mo123783xb9a70294()) {
            return ((java.lang.Boolean) new java.lang.Object() { // from class: d95.b0$$h
                public final java.lang.Object a() {
                    java.lang.String str3 = str2;
                    java.lang.Object[] objArr2 = objArr;
                    com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab2 = c26987xeef691ab;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f309143b;
                        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = fVar.f309211a;
                        if (c26948xabb259c7 == null) {
                            c26948xabb259c7 = fVar.f309212b;
                        }
                        c26948xabb259c7.m107673xb158737d(str3, objArr2, c26987xeef691ab2);
                        return java.lang.Boolean.TRUE;
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(181L, 11L, 1L, false);
                        java.lang.String message = e17.getMessage();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f309142a, "execSQL Error :" + message);
                        if (message == null || !message.contains("no such table")) {
                            return java.lang.Boolean.FALSE;
                        }
                        com.p314xaae8f345.mm.vfs.w6.h(b0Var.f309146e.f309127c);
                        l75.j0 j0Var = b0Var.f309145d;
                        if (j0Var != null) {
                            ((gm0.C28424x57b5d14) j0Var).a();
                        }
                        throw e17;
                    }
                }
            }.a()).booleanValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return false;
    }

    @Override // l75.k0
    public long k() {
        return this.f309143b.g();
    }

    @Override // l75.k0
    public long l(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return T(str, str2, contentValues, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d95.b0$$b] */
    @Override // l75.k0
    public long m(final java.lang.String str, final java.lang.String str2, final android.content.ContentValues contentValues) {
        if (mo123783xb9a70294()) {
            return ((java.lang.Long) new java.lang.Object() { // from class: d95.b0$$b
                public final java.lang.Object a() {
                    java.lang.String str3 = str2;
                    android.content.ContentValues contentValues2 = contentValues;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f309143b;
                        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = fVar.f309211a;
                        if (c26948xabb259c7 == null) {
                            c26948xabb259c7 = fVar.f309212b;
                        }
                        boolean n17 = d95.f.n();
                        java.lang.String str4 = str;
                        if (n17) {
                            d95.f.f309201n.c(c26948xabb259c7, 32769, str4);
                        }
                        return java.lang.Long.valueOf(c26948xabb259c7.m107716x413cb2b4(str4, str3, contentValues2));
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(181L, 11L, 1L, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f309142a, "repalce  Error :" + e17.getMessage());
                        return -1L;
                    }
                }
            }.a()).longValue();
        }
        java.lang.String str3 = this.f309142a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return -2L;
    }

    @Override // l75.k0
    public boolean n() {
        return this.f309146e.f309129e;
    }

    @Override // l75.k0
    public android.database.Cursor o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (!mo123783xb9a70294()) {
            java.lang.String str3 = this.f309142a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return d95.d.a();
        }
        d95.f fVar = this.f309143b;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = fVar.f309211a;
        if (c26948xabb259c7 == null) {
            c26948xabb259c7 = fVar.f309212b;
        }
        return c26948xabb259c7.m107713x46d43bc4(cursorFactory, str, strArr, str2, c26987xeef691ab);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [d95.b0$$d] */
    @Override // l75.k0
    public int p(final java.lang.String str, final android.content.ContentValues contentValues, final java.lang.String str2, final java.lang.String[] strArr) {
        if (mo123783xb9a70294()) {
            return ((java.lang.Integer) new java.lang.Object() { // from class: d95.b0$$d
                public final java.lang.Object a() {
                    android.content.ContentValues contentValues2 = contentValues;
                    java.lang.String str3 = str2;
                    java.lang.String[] strArr2 = strArr;
                    d95.b0 b0Var = d95.b0.this;
                    b0Var.getClass();
                    try {
                        d95.f fVar = b0Var.f309143b;
                        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = fVar.f309211a;
                        if (c26948xabb259c7 == null) {
                            c26948xabb259c7 = fVar.f309212b;
                        }
                        boolean n17 = d95.f.n();
                        java.lang.String str4 = str;
                        if (n17) {
                            d95.f.f309201n.c(c26948xabb259c7, 32769, str4);
                        }
                        return java.lang.Integer.valueOf(c26948xabb259c7.m107732xce0038c9(str4, contentValues2, str3, strArr2));
                    } catch (java.lang.Exception e17) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(181L, 11L, 1L, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f309142a, "update Error :" + e17.getMessage());
                        return -1;
                    }
                }
            }.a()).intValue();
        }
        java.lang.String str3 = this.f309142a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return -2;
    }

    @Override // l75.k0
    public long q() {
        if (mo123783xb9a70294()) {
            return this.f309143b.j();
        }
        java.lang.String str = this.f309142a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return 0L;
    }

    @Override // l75.k0
    public void r() {
    }

    @Override // l75.k0
    public android.database.Cursor s(java.lang.String str, java.lang.String[] strArr) {
        iz5.a.g("sql is null ", !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str));
        if (!mo123783xb9a70294()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return d95.d.a();
        }
        try {
            return this.f309143b.v(str, strArr, 0, true, null);
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(181L, 10L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f309142a, "rawQueryWithCancel Error: %s, SQL: %s", e17.getMessage(), str);
            return d95.d.a();
        }
    }

    @Override // l75.k0
    public int t() {
        return N(null, true);
    }

    @Override // l75.k0
    public boolean u() {
        if (mo123783xb9a70294()) {
            return this.f309143b.z();
        }
        java.lang.String str = this.f309142a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return false;
    }

    @Override // l75.k0
    public long v(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        return T(str, str2, contentValues, true);
    }

    @Override // l75.k0
    public int w(java.lang.Long l17) {
        return N(l17, true);
    }

    @Override // l75.k0
    public void x() {
        P().m107405xb81b4f04();
    }

    @Override // l75.k0
    public void y(l75.j0 j0Var) {
        this.f309145d = j0Var;
    }

    @Override // l75.k0
    public p75.k z(java.lang.String str) {
        if (mo123783xb9a70294()) {
            return new p75.e0(P().m107663xac8b87c(str), null);
        }
        java.lang.String str2 = this.f309142a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "DB IS CLOSED ! {%s}", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return null;
    }

    public b0(d95.f fVar) {
        this.f309142a = "MicroMsg.SqliteDB";
        this.f309143b = null;
        this.f309144c = null;
        this.f309145d = null;
        this.f309146e = new d95.a();
        this.f309147f = "";
        this.f309148g = "";
        new java.util.LinkedList();
        this.f309149h = 0L;
        this.f309143b = fVar;
    }

    public b0() {
        this.f309142a = "MicroMsg.SqliteDB";
        this.f309143b = null;
        this.f309144c = null;
        this.f309145d = null;
        this.f309146e = new d95.a();
        this.f309147f = "";
        this.f309148g = "";
        new java.util.LinkedList();
        this.f309149h = 0L;
    }
}
