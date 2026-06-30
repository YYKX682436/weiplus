package kw3;

@j95.b
/* loaded from: classes9.dex */
public class p extends i95.w implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.t1 f394667d = null;

    /* renamed from: e, reason: collision with root package name */
    public rw3.b f394668e = null;

    /* renamed from: f, reason: collision with root package name */
    public rw3.d f394669f = null;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f394670g;

    static {
        com.p314xaae8f345.mm.p2802xd031a825.a.h("RemittanceProcess", kw3.i.class);
    }

    public p() {
        this.f394670g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2524x2c1ddc83.C20111xbd50b1af()) == 1;
    }

    public static kw3.p Ai() {
        return (kw3.p) i95.n0.c(kw3.p.class);
    }

    public static void Ui(android.content.Context context, boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.i0a : com.p314xaae8f345.mm.R.C30867xcad56011.i0_));
        u1Var.k(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1);
        u1Var.l(new kw3.m());
        u1Var.q(false);
    }

    public rw3.b Bi() {
        if (Ai().f394668e == null) {
            kw3.p Ai = Ai();
            gm0.j1.i();
            Ai.f394668e = new rw3.b(gm0.j1.u().f354686f);
        }
        return Ai().f394668e;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.t1 Di() {
        if (this.f394667d == null) {
            this.f394667d = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.t1();
        }
        return this.f394667d;
    }

    public rw3.d Ni() {
        if (Ai().f394669f == null) {
            kw3.p Ai = Ai();
            gm0.j1.i();
            Ai.f394669f = new rw3.d(gm0.j1.u().f354686f);
        }
        return Ai().f394669f;
    }

    public boolean Ri(java.lang.String str) {
        int i17;
        int i18;
        rw3.d Ni = Ni();
        Ni.getClass();
        java.util.ArrayList arrayList = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                android.database.Cursor D = Ni.f482180d.D("RemittanceRecord", rw3.d.f482178f, "talker=?", new java.lang.String[]{str}, null, null, null, 2);
                try {
                    if (D.moveToFirst()) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        do {
                            rw3.c cVar = new rw3.c();
                            cVar.mo9015xbf5d97fd(D);
                            arrayList2.add(cVar);
                        } while (D.moveToNext());
                        D.close();
                        D.close();
                        arrayList = arrayList2;
                    } else {
                        D.close();
                        D.close();
                    }
                } finally {
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RemittanceSendRecordStorage", e17, "getRecordByTransferId error: %s", e17.getMessage());
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        boolean z17 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rw3.c cVar2 = (rw3.c) it.next();
                if (c01.z1.r().equals(cVar2.f68620xdf27f83f)) {
                    long c17 = (cVar2.f68615x32fdc97f * 1000) - c01.id.c();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "remittance status: %s, %s, %s", java.lang.Integer.valueOf(cVar2.f68618xd3086e30), java.lang.Long.valueOf(cVar2.f68617x512156d6), cVar2.f68621x114ef53e);
                    if (c17 < 0 && ((i18 = cVar2.f68618xd3086e30) == 1 || i18 == 21 || i18 == 7 || i18 == 27)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "timeout, change status");
                        cVar2.f68618xd3086e30 = 2;
                        Ni().mo11260x413cb2b4(cVar2);
                    } else if (c17 >= 0 && ((i17 = cVar2.f68618xd3086e30) == 1 || i17 == 21 || i17 == 7 || i17 == 27)) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(cVar2.f68621x114ef53e, cVar2.f68617x512156d6);
                        if (Li.m124847x74d37ac6() > 0 && (Li.F & 4) != 4 && Li.mo78013xfb85f7b0() != 10000 && Li.mo78013xfb85f7b0() != 268445456) {
                            arrayList3.add(Li);
                            if (!this.f394670g) {
                                z17 = true;
                                break;
                            }
                            z17 = true;
                        } else if (Li.mo78013xfb85f7b0() == 10000 || (Li.F & 4) == 4) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "is revoke msg");
                        }
                    }
                }
            }
        }
        g95.u.m(arrayList3, str, 3, 2);
        return z17;
    }

    public void Vi(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, rw3.c cVar) {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_update_remittace_conversation_flag, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "clicfg_android_update_remittance_conversation_flag is %s", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            ((ku5.t0) ku5.t0.f394148d).h(new kw3.n(this, str), "update_remit_red_flag");
            return;
        }
        boolean Ri = Ri(str);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str);
        if (p17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "update red flag: %s, %s", str, java.lang.Boolean.valueOf(Ri));
            p17.U1(Ri ? 1 : 0);
            if (f9Var == null && cVar != null) {
                f9Var = pt0.f0.Li(cVar.f68621x114ef53e, cVar.f68617x512156d6);
            }
            if (f9Var == null || f9Var.m124847x74d37ac6() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "msgInfo has delete，can notsetFlag ");
            } else {
                p17.z1(xg3.b.b(p17, 1, f9Var.mo78012x3fdd41df()));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "update ret: %s", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, str, false, true)));
        }
    }

    public final void Zi(java.lang.String str, long j17) {
        rw3.c z07 = Ni().z0(str);
        if (z07 != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(z07.f68621x114ef53e, z07.f68617x512156d6);
            if (Li.m124847x74d37ac6() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "has delete msg");
                return;
            }
            Li.o1(j17);
            pt0.f0.f439742b1.s(Li.Q0(), Li.m124847x74d37ac6(), Li);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this);
        ((ku5.t0) ku5.t0.f394148d).k(new kw3.l(this), 12000L);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.mm.app.w.INSTANCE.p(this);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).h(new kw3.o(this), "check_remit_red_flag_background");
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
    }

    public boolean wi(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5654x780453b8 c5654x780453b8, boolean z17) {
        android.database.Cursor B;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5654x780453b8.f135980g.f89817c)) {
            am.wh whVar = c5654x780453b8.f135980g;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(whVar.f89816b)) {
                boolean z18 = c01.e2.J(whVar.f89817c) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(whVar.f89817c);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "handle JsApiOpenC2CTransferMsgViewEvent, isContact: %s, createTime: %s", java.lang.Boolean.valueOf(z18), whVar.f89818d);
                android.content.Context context = whVar.f89815a;
                if (context == null) {
                    context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                }
                if (!z18) {
                    Ui(context, true);
                    return false;
                }
                java.lang.Long l17 = whVar.f89818d;
                if (l17.longValue() < 10000000000L) {
                    l17 = java.lang.Long.valueOf((whVar.f89818d.longValue() * 1000) - 1000);
                }
                final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
                final java.lang.String str = whVar.f89817c;
                final long longValue = l17.longValue();
                final java.lang.String X8 = cj6.X8(str);
                cj6.Z8(str);
                if (cj6.Da(X8)) {
                    B = ot0.c3.l().c("getCursorAfterCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$h0
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            return ot0.z2.f430355a.L(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, longValue);
                        }
                    }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$s0
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                            g9Var.getClass();
                            return g9Var.f275522r.B("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND createTime > " + longValue + " ORDER BY createTime ASC ", null);
                        }
                    });
                } else if (cj6.Pb(X8)) {
                    B = ot0.z2.f430355a.L(cj6.f275522r, X8, str, longValue);
                } else {
                    B = cj6.f275522r.B("SELECT * FROM " + X8 + " WHERE" + cj6.Z8(str) + "AND createTime > " + longValue + " ORDER BY createTime ASC ", null);
                }
                int i17 = 0;
                while (B.moveToNext() && i17 < 50) {
                    i17++;
                    f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var.mo9015xbf5d97fd(B);
                    ot0.q v17 = ot0.q.v(f9Var.U1());
                    if (v17 != null && whVar.f89816b.equals(v17.L0)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "handle JsApiOpenC2CTransferMsgViewEvent, found local msg, createTime: %s", whVar.f89818d);
                        break;
                    }
                }
                f9Var = null;
                B.close();
                if (f9Var != null && f9Var.m124847x74d37ac6() > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "handle JsApiOpenC2CTransferMsgViewEvent, localMsgId: %s, createTime: %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()));
                    j45.l.u(context, ".ui.chatting.ChattingUI", new android.content.Intent().putExtra("Chat_User", whVar.f89817c).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", f9Var.m124847x74d37ac6()).putExtra("need_hight_item", true), null);
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRemittance", "handle JsApiOpenC2CTransferMsgViewEvent, cannot find local msg");
                if (z17) {
                    Ui(context, false);
                }
                return false;
            }
        }
        return false;
    }
}
