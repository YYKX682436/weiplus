package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes12.dex */
public class n3 extends l75.a1 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f276673n = {"CREATE TABLE IF NOT EXISTS userinfo ( id INTEGER PRIMARY KEY, type INT, value TEXT )", "CREATE TABLE IF NOT EXISTS userinfo2 ( sid TEXT PRIMARY KEY, type INT, value TEXT )"};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f276674o = {14, 15, 89, 92, 8197, 8198};

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.Object f276675p = new java.lang.Object();

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f276676q = new byte[0];

    /* renamed from: r, reason: collision with root package name */
    public static boolean f276677r = !"0".equals(j62.e.g().j("clicfg_confstg_use_mmkv", "1", true, true));

    /* renamed from: s, reason: collision with root package name */
    public static long f276678s = java.lang.System.currentTimeMillis();

    /* renamed from: t, reason: collision with root package name */
    public static boolean f276679t = !"0".equals(j62.e.g().j("clicfg_confstg_mmkv_only", "0", true, true));

    /* renamed from: u, reason: collision with root package name */
    public static long f276680u = java.lang.System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f276681d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f276682e;

    /* renamed from: f, reason: collision with root package name */
    public final l75.k0 f276683f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.q3 f276684g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.q3 f276685h;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f276688k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f276689l;

    /* renamed from: i, reason: collision with root package name */
    public java.util.HashMap f276686i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public java.util.HashMap f276687j = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f276690m = new com.p314xaae8f345.mm.p2621x8fb0427b.o3(this);

    public n3(l75.k0 k0Var) {
        this.f276683f = k0Var;
        int h17 = gm0.j1.b().h();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("ConfigStorage1", h17, 2);
        this.f276681d = J2;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("ConfigStorage2", h17, 2);
        this.f276682e = J3;
        this.f276684g = new com.p314xaae8f345.mm.p2621x8fb0427b.q3(this, J2, "userinfo", dm.i4.f66865x76d1ec5a, 512);
        this.f276685h = new com.p314xaae8f345.mm.p2621x8fb0427b.q3(this, J3, "userinfo2", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54540x542b1a21, 512);
        this.f276688k = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("ConfigStorage");
    }

    public static void g(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var, long j17, long[] jArr) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - jArr[0] < 1800000) {
            return;
        }
        long a17 = o4Var.a();
        long Y = o4Var.Y();
        if (Y - a17 > j17) {
            o4Var.a0();
            jArr[0] = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigStorage", "Trim MMKV, before: %d, actual: %d, after: %d, cost: %d", java.lang.Long.valueOf(Y), java.lang.Long.valueOf(a17), java.lang.Long.valueOf(o4Var.Y()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static byte[] h(java.lang.Object obj) {
        java.nio.ByteBuffer allocate;
        if (obj == null || obj == f276675p) {
            return f276676q;
        }
        if (obj instanceof java.lang.Integer) {
            allocate = java.nio.ByteBuffer.allocate(5);
            allocate.put((byte) 1).putInt(((java.lang.Integer) obj).intValue());
        } else if (obj instanceof java.lang.Long) {
            allocate = java.nio.ByteBuffer.allocate(9);
            allocate.put((byte) 2).putLong(((java.lang.Long) obj).longValue());
        } else if (obj instanceof java.lang.String) {
            byte[] bytes = ((java.lang.String) obj).getBytes();
            allocate = java.nio.ByteBuffer.allocate(bytes.length + 1);
            allocate.put((byte) 3).put(bytes);
        } else if (obj instanceof java.lang.Boolean) {
            allocate = java.nio.ByteBuffer.allocate(2);
            allocate.put((byte) 4).put(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
        } else if (obj instanceof java.lang.Float) {
            allocate = java.nio.ByteBuffer.allocate(5);
            allocate.put((byte) 5).putFloat(((java.lang.Float) obj).floatValue());
        } else {
            if (!(obj instanceof java.lang.Double)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigStorage", "unresolve failed, unknown type=" + obj.getClass());
                return null;
            }
            allocate = java.nio.ByteBuffer.allocate(9);
            allocate.put((byte) 6).putDouble(((java.lang.Double) obj).doubleValue());
        }
        return allocate.array();
    }

    public void A(int i17, long j17) {
        w(i17, java.lang.Long.valueOf(j17));
    }

    @Override // l75.a1
    public void b(final int i17, final l75.a1 a1Var, final java.lang.Object obj) {
        super.b(i17, a1Var, obj);
        fs.g.b(com.p314xaae8f345.mm.p2621x8fb0427b.p3.class, new fs.o() { // from class: com.tencent.mm.storage.n3$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.p314xaae8f345.mm.p2621x8fb0427b.p3) nVar).g(i17, a1Var, obj);
                return false;
            }
        });
    }

    @Override // l75.a1
    public boolean f() {
        l75.k0 k0Var = this.f276683f;
        if (k0Var != null && !k0Var.J()) {
            return true;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = k0Var == null ? "null" : java.lang.Boolean.valueOf(k0Var.J());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConfigStorage", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }

    public void i(boolean z17) {
        synchronized (this) {
            this.f276688k.mo50300x3fa464aa(this.f276690m);
            this.f276688k.mo50293x3498a0(this.f276690m);
            this.f276689l = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigStorage", "Posted appendAllToDisk");
    }

    public final boolean j(java.lang.String str, java.lang.Object obj, boolean z17) {
        if (obj == null && z17) {
            return true;
        }
        if ((obj instanceof java.lang.Integer) && str.equals("INT")) {
            return true;
        }
        if ((obj instanceof java.lang.Long) && str.equals("LONG")) {
            return true;
        }
        if ((obj instanceof java.lang.String) && str.equals("STRING")) {
            return true;
        }
        if ((obj instanceof java.lang.Boolean) && str.equals("BOOLEAN")) {
            return true;
        }
        if ((obj instanceof java.lang.Float) && str.equals("FLOAT")) {
            return true;
        }
        if ((obj instanceof java.lang.Double) && str.equals("DOUBLE")) {
            return true;
        }
        if (obj == null || !z65.c.a()) {
            if (!z17) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigStorage", "checkType failed, input type and value[%s, %s] are not match", str, obj);
            return false;
        }
        iz5.a.h("checkType failed, input type and value[" + str + ", " + obj + "] are not match");
        throw null;
    }

    public java.lang.Object k(int i17) {
        return l(i17, null);
    }

    public java.lang.Object l(int i17, java.lang.Object obj) {
        iz5.a.d("db is null", this.f276683f);
        java.lang.Object obj2 = this.f276684g.get(java.lang.Integer.valueOf(i17));
        return (obj2 == null || obj2 == f276675p) ? obj : obj2;
    }

    public java.lang.Object m(com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, java.lang.Object obj) {
        return u3Var == null ? obj : p(u3Var.name(), obj);
    }

    public boolean n(int i17, boolean z17) {
        java.lang.Object l17 = l(i17, java.lang.Boolean.valueOf(z17));
        return l17 instanceof java.lang.Boolean ? ((java.lang.Boolean) l17).booleanValue() : z17;
    }

    public boolean o(com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, boolean z17) {
        java.lang.Object m17 = m(u3Var, java.lang.Boolean.valueOf(z17));
        return m17 instanceof java.lang.Boolean ? ((java.lang.Boolean) m17).booleanValue() : z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(java.lang.String r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r9)
            if (r0 == 0) goto L7
            return r10
        L7:
            r0 = 95
            int r1 = r9.lastIndexOf(r0)
            java.lang.String r2 = "Key name '"
            if (r1 < 0) goto La5
            int r3 = r9.length()
            r4 = 1
            int r3 = r3 - r4
            r5 = 0
            if (r3 <= r1) goto L50
            int r6 = r3 + (-1)
            char r3 = r9.charAt(r3)
            r7 = 67
            if (r3 == r7) goto L25
            goto L50
        L25:
            if (r6 <= r1) goto L50
            int r3 = r6 + (-1)
            char r6 = r9.charAt(r6)
            r7 = 78
            if (r6 == r7) goto L32
            goto L50
        L32:
            if (r3 <= r1) goto L50
            int r6 = r3 + (-1)
            char r3 = r9.charAt(r3)
            r7 = 89
            if (r3 == r7) goto L3f
            goto L50
        L3f:
            if (r6 <= r1) goto L50
            int r3 = r6 + (-1)
            char r6 = r9.charAt(r6)
            r7 = 83
            if (r6 == r7) goto L4c
            goto L50
        L4c:
            if (r3 != r1) goto L50
            r3 = r4
            goto L51
        L50:
            r3 = r5
        L51:
            if (r3 == 0) goto L73
            int r3 = r1 + (-1)
            int r0 = r9.lastIndexOf(r0, r3)
            if (r0 < 0) goto L5c
            goto L74
        L5c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r9)
            java.lang.String r9 = "' end with 'SYNC' must contains value type name before 'SYNC'."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        L73:
            r0 = -1
        L74:
            if (r0 < 0) goto L7b
            java.lang.String r2 = r9.substring(r5, r1)
            goto L7c
        L7b:
            r2 = r9
        L7c:
            java.lang.String r3 = "db is null"
            l75.k0 r6 = r8.f276683f
            iz5.a.d(r3, r6)
            com.tencent.mm.storage.q3 r3 = r8.f276685h
            java.lang.Object r2 = r3.get(r2)
            if (r2 == 0) goto L8f
            java.lang.Object r3 = com.p314xaae8f345.mm.p2621x8fb0427b.n3.f276675p
            if (r2 != r3) goto L90
        L8f:
            r2 = r10
        L90:
            if (r0 < 0) goto L98
            int r0 = r0 + r4
            java.lang.String r9 = r9.substring(r0, r1)
            goto L9d
        L98:
            int r1 = r1 + r4
            java.lang.String r9 = r9.substring(r1)
        L9d:
            boolean r9 = r8.j(r9, r2, r5)
            if (r9 != 0) goto La4
            return r10
        La4:
            return r2
        La5:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r9)
            java.lang.String r9 = "' must end with value type name seperated with '_'."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.n3.p(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public int q(int i17, int i18) {
        java.lang.Integer num = (java.lang.Integer) l(i17, null);
        return num == null ? i18 : num.intValue();
    }

    public int r(com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, int i17) {
        java.lang.Object m17 = m(u3Var, java.lang.Integer.valueOf(i17));
        return m17 instanceof java.lang.Integer ? ((java.lang.Integer) m17).intValue() : i17;
    }

    public long s(int i17, long j17) {
        java.lang.Long l17 = (java.lang.Long) l(i17, null);
        return l17 == null ? j17 : l17.longValue();
    }

    public long t(com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, long j17) {
        java.lang.Object m17 = m(u3Var, java.lang.Long.valueOf(j17));
        return m17 instanceof java.lang.Long ? ((java.lang.Long) m17).longValue() : j17;
    }

    public java.lang.String u(int i17, java.lang.String str) {
        java.lang.Object l17 = l(i17, str);
        return l17 instanceof java.lang.String ? (java.lang.String) l17 : str;
    }

    public java.lang.String v(com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var, java.lang.String str) {
        java.lang.Object m17 = m(u3Var, str);
        return m17 instanceof java.lang.String ? (java.lang.String) m17 : str;
    }

    public void w(int i17, java.lang.Object obj) {
        iz5.a.d("db is null", this.f276683f);
        if (obj == null) {
            obj = f276675p;
        }
        if (!obj.equals(this.f276684g.put(java.lang.Integer.valueOf(i17), obj))) {
            synchronized (this) {
                this.f276686i.put(java.lang.Integer.valueOf(i17), obj);
                if (!this.f276689l) {
                    this.f276689l = true;
                    this.f276688k.mo50297x7c4d7ca2(this.f276690m, 30000L);
                }
            }
            b(obj == f276675p ? 5 : 4, this, java.lang.Integer.valueOf(i17));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SET: ");
        sb6.append(i17);
        sb6.append(" => ");
        sb6.append(obj == f276675p ? "(DELETED)" : obj.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigStorage", sb6.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(com.p314xaae8f345.mm.p2621x8fb0427b.u3 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.n3.x(com.tencent.mm.storage.u3, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(java.lang.String r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.n3.y(java.lang.String, java.lang.Object):void");
    }

    public void z(int i17, int i18) {
        w(i17, java.lang.Integer.valueOf(i18));
    }
}
