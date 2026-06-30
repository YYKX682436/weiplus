package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class d2 {

    /* renamed from: o, reason: collision with root package name */
    public static int f282382o = 100000;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f282383a;

    /* renamed from: c, reason: collision with root package name */
    public int f282385c;

    /* renamed from: d, reason: collision with root package name */
    public int f282386d;

    /* renamed from: e, reason: collision with root package name */
    public int f282387e;

    /* renamed from: h, reason: collision with root package name */
    public int f282390h;

    /* renamed from: i, reason: collision with root package name */
    public int f282391i;

    /* renamed from: j, reason: collision with root package name */
    public int f282392j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 f282393k;

    /* renamed from: f, reason: collision with root package name */
    public boolean f282388f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f282389g = false;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.HashMap f282394l = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f282395m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f282396n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f282384b = new java.util.LinkedList();

    public d2(long j17, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var, java.lang.Boolean bool, int i17) {
        this.f282383a = str;
        this.f282393k = k1Var;
        if (k1Var.f282634s) {
            ((java.util.LinkedList) this.f282384b).add(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.q(str, k1Var.f282625g));
            f282382o = 0;
            return;
        }
        f282382o = 100000;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        if (Li.m124847x74d37ac6() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.AutoList <init>, currentMsg does not exist, currentMsgId = ");
            sb6.append(j17);
            sb6.append(", stack = ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            iz5.a.g(sb6.toString(), false);
            return;
        }
        ((java.util.LinkedList) this.f282384b).add(Li);
        if (k1Var.f282638w == null) {
            if (i17 == 1) {
                return;
            }
        }
        if (i17 == 2) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.b2(this, j17, bool, k1Var), "ImageGalleryPrepareData");
        k1Var.f282625g.f282188r3 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c2(this, j17, k1Var);
    }

    public static void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2 d2Var, boolean z17, long j17) {
        if (z17) {
            d2Var.getClass();
            d2Var.f282384b = new java.util.LinkedList();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(d2Var.f282383a, j17);
            if (Li.m124847x74d37ac6() == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.AutoList <init>, currentMsg does not exist, currentMsgId = ");
                sb6.append(j17);
                sb6.append(", stack = ");
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                iz5.a.g(sb6.toString(), false);
                return;
            }
            ((java.util.LinkedList) d2Var.f282384b).add(Li);
        }
        int i17 = d2Var.f282390h;
        d2Var.f282385c = i17;
        d2Var.f282386d = d2Var.f282391i;
        d2Var.f282387e = d2Var.f282392j;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoList", "totalCount %s min %s start %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d2Var.f282386d), java.lang.Integer.valueOf(d2Var.f282387e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoList", "min spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - java.lang.System.currentTimeMillis()));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        d2Var.c(j17, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoList", "loadMsgInfo spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        d2Var.c(j17, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoList", "loadMsgInfo spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = d2Var.f282393k;
        k1Var.mo8343xced61ae5();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = k1Var.f282625g;
        if (viewOnClickListenerC21748xb3d38e6b.isFinishing()) {
            return;
        }
        int i18 = f282382o;
        if (i18 > 0) {
            android.util.SparseArray sparseArray = k1Var.f310004f;
            k1Var.d(i18 - 1, (android.view.View) sparseArray.get(i18 - 1), viewOnClickListenerC21748xb3d38e6b.f282170n);
            if (z17) {
                int i19 = f282382o + 1;
                k1Var.d(i19, (android.view.View) sparseArray.get(i19), viewOnClickListenerC21748xb3d38e6b.f282170n);
            }
        }
        d2Var.f282388f = true;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 b(int i17) {
        int i18 = (i17 - f282382o) + this.f282387e;
        int size = (this.f282386d + ((java.util.LinkedList) this.f282384b).size()) - 1;
        int i19 = this.f282386d;
        if (i18 < i19 || i18 > size) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AutoList", "get, invalid pos " + i18 + ", min = " + this.f282386d + ", max = " + size);
            return null;
        }
        if (i18 == i19) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((java.util.LinkedList) this.f282384b).get(0);
            if (this.f282388f && this.f282389g) {
                c(f9Var.m124847x74d37ac6(), false);
            }
            return f9Var;
        }
        if (i18 == size && size < this.f282385c - 1) {
            java.util.LinkedList linkedList = (java.util.LinkedList) this.f282384b;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) linkedList.get(linkedList.size() - 1);
            if (this.f282388f && this.f282389g) {
                c(f9Var2.m124847x74d37ac6(), true);
            }
            return f9Var2;
        }
        if (i18 - i19 < ((java.util.LinkedList) this.f282384b).size()) {
            return (com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((java.util.LinkedList) this.f282384b).get(i18 - this.f282386d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AutoList", "get error, invalid pos " + i18 + ", min = " + this.f282386d + ", max = " + size);
        return null;
    }

    public final void c(long j17, final boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.util.List list;
        java.lang.String sb6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoList", "start loadMsgInfo, currentMsgId = " + j17 + ", forward = " + z17);
        boolean z18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.D;
        final java.lang.String str3 = this.f282383a;
        if (!z18) {
            final com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u();
            g9Var.getClass();
            if (str3 == null || str3.isEmpty()) {
                str = "MicroMsg.AutoList";
                str2 = str3;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid, limit = 10");
                list = null;
            } else {
                final long G2 = g9Var.G2(str3, j17);
                if (G2 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getImgMessage fail, msg is null");
                    str = "MicroMsg.AutoList";
                    list = null;
                } else {
                    final java.lang.String X8 = g9Var.X8(str3);
                    final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str3);
                    if (g9Var.Da(X8)) {
                        final int i17 = 10;
                        str = "MicroMsg.AutoList";
                        list = ot0.c3.l().e("getImgVideoMessage", new yz5.a() { // from class: com.tencent.mm.storage.g9$$m7
                            @Override // yz5.a
                            /* renamed from: invoke */
                            public final java.lang.Object mo152xb9724478() {
                                java.lang.String str4 = X8;
                                java.lang.String str5 = str3;
                                int i18 = i17;
                                boolean z19 = z17;
                                long j18 = m07;
                                long j19 = G2;
                                ot0.z2 z2Var = ot0.z2.f430355a;
                                com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                                return new java.util.ArrayList(z2Var.i0(g9Var2.f275522r, str4, str5, i18, z19, j18, j19, g9Var2.v4()));
                            }
                        }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$n7
                            @Override // yz5.a
                            /* renamed from: invoke */
                            public final java.lang.Object mo152xb9724478() {
                                java.lang.String str4;
                                com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                                g9Var2.getClass();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                boolean z19 = z17;
                                java.lang.String str5 = X8;
                                long j18 = m07;
                                java.lang.String str6 = str3;
                                long j19 = G2;
                                int i18 = i17;
                                if (z19) {
                                    str4 = "select * from " + str5 + " where" + g9Var2.P0(j18) + g9Var2.Z8(str6) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime > " + j19 + " order by createTime ASC limit " + i18;
                                } else {
                                    str4 = "select * from " + str5 + " where" + g9Var2.P0(j18) + g9Var2.Z8(str6) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime < " + j19 + " order by createTime DESC limit " + i18;
                                }
                                android.database.Cursor f17 = g9Var2.f275522r.f(str4, null, 2);
                                while (f17.moveToNext()) {
                                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                                    f9Var.mo9015xbf5d97fd(f17);
                                    arrayList.add(f9Var);
                                }
                                if (!z19) {
                                    java.util.Collections.reverse(arrayList);
                                }
                                f17.close();
                                return new java.util.ArrayList(arrayList);
                            }
                        });
                    } else {
                        str = "MicroMsg.AutoList";
                        if (g9Var.Pb(X8)) {
                            str2 = str3;
                            list = ot0.z2.f430355a.i0(g9Var.f275522r, X8, str3, 10, z17, m07, G2, g9Var.v4());
                        } else {
                            str2 = str3;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            android.database.Cursor f17 = g9Var.f275522r.f(z17 ? "select * from " + X8 + " where" + g9Var.P0(m07) + g9Var.Z8(str2) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime > " + G2 + " order by createTime ASC limit 10" : "select * from " + X8 + " where" + g9Var.P0(m07) + g9Var.Z8(str2) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime < " + G2 + " order by createTime DESC limit 10", null, 2);
                            while (f17.moveToNext()) {
                                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                                f9Var.mo9015xbf5d97fd(f17);
                                arrayList.add(f9Var);
                            }
                            if (!z17) {
                                java.util.Collections.reverse(arrayList);
                            }
                            f17.close();
                            list = arrayList;
                        }
                    }
                }
            }
            if (list != null || list.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "loadMsgInfo fail, addedMsgList is null, forward = " + z17);
            }
            java.lang.String str4 = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "loadMsgInfo done, new added list, size = " + list.size() + ", forward = " + z17);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i18 = 0; i18 < list.size(); i18++) {
                if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.L((com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(i18)) || com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.K((com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(i18))) {
                    arrayList2.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(i18)).m124847x74d37ac6()));
                }
            }
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.l0 Di = m11.b1.Di();
            java.lang.Long[] lArr = (java.lang.Long[]) arrayList2.toArray(new java.lang.Long[0]);
            Di.getClass();
            int length = lArr.length;
            java.lang.String str5 = "(";
            boolean z19 = true;
            int i19 = 0;
            while (i19 < length) {
                long longValue = lArr[i19].longValue();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str5);
                sb7.append(z19 ? java.lang.Long.valueOf(longValue) : "," + longValue);
                str5 = sb7.toString();
                i19++;
                z19 = false;
            }
            java.lang.String str6 = str5 + ")";
            java.util.HashMap hashMap = new java.util.HashMap();
            if (pt0.p.f439751a1.a("ImgInfo2")) {
                android.database.Cursor D3 = Di.D3("ImgInfo2", null, "msglocalid in " + str6 + " AND msgTalker=?", new java.lang.String[]{"" + str2}, null, null, null);
                while (D3.moveToNext()) {
                    m11.b0 b0Var = new m11.b0();
                    b0Var.b(D3, false);
                    hashMap.put(java.lang.Long.valueOf(b0Var.f404167b), b0Var);
                }
                D3.close();
            } else {
                android.database.Cursor D32 = Di.D3("ImgInfo2", null, "msglocalid in " + str6, null, null, null, null);
                while (D32.moveToNext()) {
                    m11.b0 b0Var2 = new m11.b0();
                    b0Var2.b(D32, false);
                    hashMap.put(java.lang.Long.valueOf(b0Var2.f404167b), b0Var2);
                }
                D32.close();
            }
            for (m11.b0 b0Var3 : hashMap.values()) {
                this.f282395m.put(java.lang.Long.valueOf(b0Var3.f404166a), b0Var3);
                long j18 = b0Var3.f404167b;
                if (j18 != 0) {
                    this.f282394l.put(java.lang.Long.valueOf(j18), b0Var3);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "loadImgInfo spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            if (z17) {
                this.f282384b.addAll(list);
                return;
            }
            this.f282384b.addAll(0, list);
            int size = this.f282386d - list.size();
            this.f282386d = size;
            if (size < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str4, "loadMsgInfo fail, min should not be minus, min = " + this.f282386d);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "min from " + (this.f282386d + list.size()) + " to " + this.f282386d);
                return;
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.v j19 = c01.d9.b().j();
        long j27 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.C;
        j19.getClass();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        if (str3 == null || str3.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid, limit = 10");
        } else {
            xg3.m0 m0Var = j19.f275428a;
            long G22 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) m0Var).G2(str3, j17);
            if (G22 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, msg is null");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                if (z17) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("select * from ");
                    sb8.append(j19.e(str3));
                    sb8.append(" INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where");
                    sb8.append(j19.l(str3, j27));
                    sb8.append("AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime > ");
                    m0Var.getClass();
                    sb8.append(G22);
                    sb8.append("  order by createTime ASC limit 10");
                    sb6 = sb8.toString();
                } else {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("select * from ");
                    sb9.append(j19.e(str3));
                    sb9.append(" INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where");
                    sb9.append(j19.l(str3, j27));
                    sb9.append("AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime < ");
                    m0Var.getClass();
                    sb9.append(G22);
                    sb9.append("  order by createTime DESC limit 10");
                    sb6 = sb9.toString();
                }
                android.database.Cursor B = j19.d().B(sb6, null);
                if (B.moveToFirst()) {
                    while (!B.isAfterLast()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var2.mo9015xbf5d97fd(B);
                        B.moveToNext();
                        if (z17) {
                            arrayList3.add(f9Var2);
                        } else {
                            arrayList3.add(0, f9Var2);
                        }
                    }
                }
                B.close();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatMessageStorage", "getBizChatImgVideoMessage spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
                list = arrayList3;
                str = "MicroMsg.AutoList";
            }
        }
        list = null;
        str = "MicroMsg.AutoList";
        str2 = str3;
        if (list != null) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "loadMsgInfo fail, addedMsgList is null, forward = " + z17);
    }

    /* renamed from: toString */
    public java.lang.String m79587x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("AutoList, Size = " + this.f282384b.size());
        sb6.append("; Content = {");
        java.util.Iterator it = this.f282384b.iterator();
        while (it.hasNext()) {
            sb6.append(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()).m124847x74d37ac6());
            sb6.append(",");
        }
        sb6.append("}");
        return sb6.toString();
    }
}
