package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f282339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f282340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 f282341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2 f282342g;

    public b2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2 d2Var, long j17, java.lang.Boolean bool, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var) {
        this.f282342g = d2Var;
        this.f282339d = j17;
        this.f282340e = bool;
        this.f282341f = k1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2 d2Var = this.f282342g;
        d2Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoList", "isBizChat = " + com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.D);
        boolean z17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.D;
        java.lang.String str = d2Var.f282383a;
        if (z17) {
            d2Var.f282390h = c01.d9.b().j().k(str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.C);
        } else {
            d2Var.f282390h = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).S3(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoList", "<init>, totalCount = " + d2Var.f282390h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoList", "totalCount spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        boolean z18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.D;
        long j17 = this.f282339d;
        if (z18) {
            com.p314xaae8f345.mm.p2621x8fb0427b.v j18 = c01.d9.b().j();
            long j19 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.C;
            j18.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
            if (Li.m124847x74d37ac6() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizChatMessageStorage", "getCountEarlyThan fail, msg does not exist");
            } else {
                java.lang.String e17 = j18.e(str);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM ");
                sb6.append(e17);
                sb6.append(" INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  WHERE ");
                sb6.append(j18.i(str));
                sb6.append(j18.l(str, j19));
                sb6.append("AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime < ");
                j18.f275428a.getClass();
                sb6.append(Li.mo78012x3fdd41df());
                android.database.Cursor B = j18.d().B(sb6.toString(), null);
                r10 = B.moveToLast() ? B.getInt(0) : 0;
                B.close();
            }
            d2Var.f282391i = r10;
        } else {
            xg3.m0 u17 = c01.d9.b().u();
            final java.lang.String str2 = d2Var.f282383a;
            final com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) u17;
            g9Var.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li2 = pt0.f0.Li(str2, j17);
            if (Li2.m124847x74d37ac6() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getCountEarlyThan fail, msg does not exist");
            } else {
                final java.lang.String X8 = g9Var.X8(str2);
                final long mo78012x3fdd41df = Li2.mo78012x3fdd41df();
                final java.util.List y47 = g9Var.y4();
                final long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str2);
                if (g9Var.Da(X8)) {
                    r10 = ot0.c3.l().d("getImgVideoCountEarlyThan", new yz5.a() { // from class: com.tencent.mm.storage.g9$$i
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            return java.lang.Integer.valueOf(ot0.z2.f430355a.h0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str2, y47, m07, mo78012x3fdd41df));
                        }
                    }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$j
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                            g9Var2.getClass();
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SELECT COUNT(*) FROM ");
                            java.lang.String str3 = X8;
                            sb7.append(str3);
                            sb7.append(" ");
                            sb7.append(g9Var2.V3(str3));
                            sb7.append(" WHERE ");
                            sb7.append(g9Var2.P0(m07));
                            sb7.append(g9Var2.Z8(str2));
                            sb7.append("AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime < ");
                            sb7.append(mo78012x3fdd41df);
                            android.database.Cursor f17 = g9Var2.f275522r.f(sb7.toString(), null, 2);
                            int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
                            f17.close();
                            return java.lang.Integer.valueOf(i17);
                        }
                    });
                } else if (g9Var.Pb(X8)) {
                    r10 = ot0.z2.f430355a.h0(g9Var.f275522r, X8, str2, y47, m07, mo78012x3fdd41df);
                } else {
                    android.database.Cursor f17 = g9Var.f275522r.f("SELECT COUNT(*) FROM " + X8 + " " + g9Var.V3(X8) + " WHERE " + g9Var.P0(m07) + g9Var.Z8(str2) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime < " + mo78012x3fdd41df, null, 2);
                    r10 = f17.moveToFirst() ? f17.getInt(0) : 0;
                    f17.close();
                }
            }
            d2Var.f282391i = r10;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoList", "min spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
        d2Var.f282392j = d2Var.f282391i;
        d2Var.f282389g = true;
        if (this.f282340e.booleanValue() || d2Var.f282388f) {
            d2Var.f282396n.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.a2(this), 0L);
        }
    }
}
