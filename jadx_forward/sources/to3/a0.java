package to3;

/* loaded from: classes9.dex */
public class a0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public to3.y f502479g;

    /* renamed from: d, reason: collision with root package name */
    public boolean f502476d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f502477e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f502478f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();

    /* renamed from: h, reason: collision with root package name */
    public final to3.z f502480h = new to3.z(this, null);

    /* renamed from: i, reason: collision with root package name */
    public final int f502481i = 14400000;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f502482m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new to3.w(this), false);

    public a0() {
        long j17;
        try {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflineTokensMgr", "NO MPERMISSION for READ_PHONE_STATE:%s.", e17);
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.a(385, this);
        java.lang.String Ni = to3.c0.Ai().Ni(196649);
        if (android.text.TextUtils.isEmpty(Ni) || !yo3.m.j(Ni)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineTokensMgr", "genInitInterval: update_interval is empty or is not number,update token");
        } else {
            java.lang.String Ni2 = to3.c0.Ai().Ni(196632);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineTokensMgr", "genInitInterval: token is not over update interval,lastUpdate is " + Ni2);
            long longValue = java.lang.Long.valueOf(Ni).longValue();
            if (!android.text.TextUtils.isEmpty(Ni2)) {
                long longValue2 = java.lang.Long.valueOf(Ni2).longValue();
                long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineTokensMgr", "genInitInterval token is not over update interval,curTime = " + currentTimeMillis + ";");
                j17 = longValue - (currentTimeMillis - longValue2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineTokensMgr", "autoPusher startTimer interval=" + j17);
                long j18 = j17 * 1000;
                this.f502482m.c(j18, j18);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineTokensMgr", "genInitInterval lastUpdate is empty, update token");
        }
        j17 = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineTokensMgr", "autoPusher startTimer interval=" + j17);
        long j182 = j17 * 1000;
        this.f502482m.c(j182, j182);
    }

    public void a(int i17, int i18) {
        if (yo3.m.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineTokensMgr", "offline kinda enable, update offline token in kinda");
            ((h45.q) i95.n0.c(h45.q.class)).mo24856x6b373617(i17);
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && yo3.m.k()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineTokensMgr", "onNotify return false, token is invalid, do doNetSceneToken");
            b(i17, i18);
        }
    }

    public void b(int i17, int i18) {
        if (this.f502476d) {
            return;
        }
        if (wo3.b.f529674n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OfflineTokensMgr", "is doing setofflinepayment");
            return;
        }
        this.f502476d = true;
        wo3.l lVar = new wo3.l("" + (java.lang.System.currentTimeMillis() / 1000), i17, i18);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(lVar);
        boolean z17 = com.p314xaae8f345.mm.app.w.INSTANCE.f135422n;
        boolean m40088x550b09c5 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(14163, 4, java.lang.Integer.valueOf(!z17 ? 1 : 0), java.lang.Integer.valueOf(m40088x550b09c5 ? 1 : 0), 0, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(to3.c0.f502484i ? 1 : 0));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(135);
        c4582x424c344.m40332x57b2b64f(1L);
        c4582x424c344.m40331x936762bd(m40088x550b09c5 ? 36 : 37);
        arrayList.add(c4582x424c344);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3442.m40330x4c144dd(135);
        c4582x424c3442.m40332x57b2b64f(1L);
        c4582x424c3442.m40331x936762bd(z17 ? 38 : 39);
        arrayList.add(c4582x424c3442);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3443.m40330x4c144dd(135);
        c4582x424c3443.m40332x57b2b64f(1L);
        c4582x424c3443.m40331x936762bd(to3.c0.f502484i ? 40 : 41);
        arrayList.add(c4582x424c3443);
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3444 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3444.m40330x4c144dd(135);
            c4582x424c3444.m40332x57b2b64f(1L);
            c4582x424c3444.m40331x936762bd(to3.c0.f502484i ? 42 : 43);
            arrayList.add(c4582x424c3444);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3445 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3445.m40330x4c144dd(135);
            c4582x424c3445.m40332x57b2b64f(1L);
            c4582x424c3445.m40331x936762bd(z17 ? 44 : 45);
            arrayList.add(c4582x424c3445);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3446 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3446.m40330x4c144dd(135);
            c4582x424c3446.m40332x57b2b64f(1L);
            c4582x424c3446.m40331x936762bd(m40088x550b09c5 ? 46 : 47);
            arrayList.add(c4582x424c3446);
        } else if (i17 == 6) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3447 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3447.m40330x4c144dd(135);
            c4582x424c3447.m40332x57b2b64f(1L);
            c4582x424c3447.m40331x936762bd(to3.c0.f502484i ? 48 : 49);
            arrayList.add(c4582x424c3447);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3448 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3448.m40330x4c144dd(135);
            c4582x424c3448.m40332x57b2b64f(1L);
            c4582x424c3448.m40331x936762bd(z17 ? 50 : 51);
            arrayList.add(c4582x424c3448);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3449 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3449.m40330x4c144dd(135);
            c4582x424c3449.m40332x57b2b64f(1L);
            c4582x424c3449.m40331x936762bd(m40088x550b09c5 ? 52 : 53);
            arrayList.add(c4582x424c3449);
        } else if (i17 == 6) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34410 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c34410.m40330x4c144dd(135);
            c4582x424c34410.m40332x57b2b64f(1L);
            c4582x424c34410.m40331x936762bd(z17 ? 54 : 55);
            arrayList.add(c4582x424c34410);
        }
        g0Var.j(arrayList, true, false);
    }

    public void c(int i17, int i18) {
        if (d(true) > 2) {
            this.f502478f.mo50297x7c4d7ca2(new to3.x(this, i17, i18), 3000L);
        } else {
            b(i17, i18);
        }
    }

    public int d(boolean z17) {
        java.lang.String Ni = to3.c0.Ai().Ni(196617);
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().getClass();
        int m121783xf2c0b28c = com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121783xf2c0b28c(Ni);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineTokensMgr", "offline tokens count:" + m121783xf2c0b28c);
        return m121783xf2c0b28c;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(boolean r15) {
        /*
            r14 = this;
            boolean r0 = yo3.m.i()
            r1 = 1
            java.lang.String r2 = "MicroMsg.OfflineTokensMgr"
            if (r0 == 0) goto L1a
            java.lang.String r15 = "enable kinda, check ifneed update token in kinda"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r15)
            java.lang.Class<h45.q> r15 = h45.q.class
            i95.m r15 = i95.n0.c(r15)
            h45.q r15 = (h45.q) r15
            r15.mo24757x68e57170()
            return r1
        L1a:
            boolean r0 = yo3.m.k()
            r3 = 0
            if (r0 != 0) goto L27
            java.lang.String r15 = "offline is not create!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r15)
            return r3
        L27:
            int r0 = r14.d(r1)
            int r4 = to3.c0.Bi()
            r5 = 9
            if (r0 >= r4) goto L75
            int r0 = to3.c0.Bi()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "getTokenCount < %s, do doNetSceneToken"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4, r0)
            com.tencent.mm.wallet_core.model.g r0 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c()
            int r0 = r0.d()
            if (r0 == 0) goto L65
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "getTokenCount occurs error, the error is "
            r15.<init>(r1)
            r15.append(r0)
            java.lang.String r0 = ", don't  doNetSceneToken"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r15)
            return r3
        L65:
            java.lang.String r0 = "getTokenCount is success! do doNetSceneToken"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            r0 = 2
            if (r15 == 0) goto L71
            r14.c(r0, r5)
            goto L74
        L71:
            r14.c(r0, r0)
        L74:
            return r1
        L75:
            to3.c0 r0 = to3.c0.Ai()
            r4 = 196632(0x30018, float:2.7554E-40)
            java.lang.String r0 = r0.Ni(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L87
            goto La2
        L87:
            int r4 = yo3.m.g()
            long r6 = (long) r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r8 = r0.longValue()
            long r10 = java.lang.System.currentTimeMillis()
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r12
            long r10 = r10 - r8
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 < 0) goto La2
            r0 = r1
            goto La3
        La2:
            r0 = r3
        La3:
            if (r0 == 0) goto Lb5
            java.lang.String r0 = "WalletOfflineUtil.isTokenOverUpdateInterval() return false, token is over update_interval, do doNetSceneToken"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            r0 = 5
            if (r15 == 0) goto Lb1
            r14.b(r0, r5)
            goto Lb4
        Lb1:
            r14.b(r0, r0)
        Lb4:
            return r1
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: to3.a0.e(boolean):boolean");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        to3.y yVar;
        to3.f fVar;
        if (m1Var instanceof wo3.h) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            boolean z17 = m1Var instanceof wo3.l;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c344.m40330x4c144dd(135);
                c4582x424c344.m40332x57b2b64f(1L);
                c4582x424c344.m40331x936762bd(2);
                arrayList.add(c4582x424c344);
                if (i17 != 0 || i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                    c4582x424c3442.m40330x4c144dd(135);
                    c4582x424c3442.m40332x57b2b64f(1L);
                    c4582x424c3442.m40331x936762bd(3);
                    arrayList.add(c4582x424c3442);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f502478f;
            to3.z zVar = this.f502480h;
            if (i17 != 0 || i18 != 0) {
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflineTokensMgr", "gettoken is failed!");
                    int i19 = this.f502477e + 1;
                    this.f502477e = i19;
                    this.f502476d = false;
                    if (i18 == 411) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineTokensMgr", "errcode is  411, do clearAllOfflineData");
                        yo3.m.a();
                        return;
                    } else {
                        if (i18 != 268465326 && i19 < 10) {
                            n3Var.mo50300x3fa464aa(zVar);
                            int i27 = this.f502477e - 1;
                            if (i27 > 6) {
                                i27 = 6;
                            }
                            n3Var.mo50297x7c4d7ca2(zVar, ((int) java.lang.Math.pow(2.0d, i27)) * 60 * 1000);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (z17) {
                this.f502477e = 0;
                this.f502476d = false;
                n3Var.mo50300x3fa464aa(zVar);
                if (!((wo3.l) m1Var).J() || (yVar = this.f502479g) == null) {
                    return;
                }
                to3.n nVar = ((to3.m) yVar).f502502a;
                if (nVar.f502475a == null) {
                    return;
                }
                for (int i28 = 0; i28 < ((java.util.ArrayList) nVar.f502475a).size(); i28++) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) nVar.f502475a).get(i28);
                    if (weakReference != null && (fVar = (to3.f) weakReference.get()) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = (com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38) fVar;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "token update, check if need refresh code");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16764xd1ab6b38.f234049l1) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16764xd1ab6b38.f234059p1)) {
                            r45.ak0 ak0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.h4) activityC16764xd1ab6b38.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.h4.class)).f234171d;
                            if (ak0Var == null || ak0Var.f451594d == 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "has code showing, ignore code update");
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 75L, 1L, false);
                                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_offline_code_update_from_gettoken, false)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "abtest update code from get token is true, update code");
                                    activityC16764xd1ab6b38.r7(0, false);
                                    activityC16764xd1ab6b38.Z6(true);
                                }
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "code is null or has disable block need update code");
                        activityC16764xd1ab6b38.r7(0, false);
                        activityC16764xd1ab6b38.Z6(true);
                    }
                }
            }
        }
    }
}
