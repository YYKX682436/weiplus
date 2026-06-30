package at4;

/* loaded from: classes9.dex */
public class g1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 f95393d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f95394e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f95395f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f95396g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.m1 f95397h;

    public g1() {
        super(0);
        this.f95394e = false;
        this.f95395f = false;
        this.f95396g = false;
    }

    public final void b(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184) {
        if (c01.z1.I()) {
            this.f95397h = new us4.a();
            gm0.j1.d().g(this.f95397h);
            return;
        }
        int i17 = c6243x5c461184.f136491g.f88748a;
        boolean z17 = true;
        if (i17 != 0 && i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4 && i17 != 6 && i17 != 8 && i17 != 9 && i17 != 10 && i17 != 11 && i17 != 12 && i17 != 13 && i17 != 14 && i17 != 15 && i17 != 16 && i17 != 17 && i17 != 18 && i17 != 19 && i17 != 20 && i17 != 21 && i17 != 22 && i17 != 23) {
            z17 = false;
        }
        if (!z17) {
            i17 = 0;
        }
        this.f95397h = new ss4.e0(null, i17);
        gm0.j1.d().g(this.f95397h);
    }

    public final void c(int i17, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        java.util.ArrayList arrayList;
        java.lang.String[] split;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c;
        java.util.ArrayList arrayList2;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = this.f95393d;
        if (c6243x5c461184 != null) {
            am.m10 m10Var = c6243x5c461184.f136492h;
            m10Var.f88828d = i17;
            m10Var.f88845u = m1Var;
            m10Var.f88826b = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w();
            am.m10 m10Var2 = this.f95393d.f136492h;
            at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
            at4.u1 u1Var = fj6.f95533i;
            m10Var2.f88827c = !((u1Var != null && u1Var.b()) || ((arrayList = fj6.f95529e) != null && arrayList.size() > 0)) && ((arrayList2 = fj6.f95528d) == null || arrayList2.size() <= 0);
            am.m10 m10Var3 = this.f95393d.f136492h;
            at4.x1 fj7 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
            fj7.getClass();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            fj7.i(arrayList3, arrayList4);
            if (arrayList4.size() != 0) {
                gm0.j1.i();
                java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(196659, null);
                if (!android.text.TextUtils.isEmpty(str2) && (split = str2.split("&")) != null && split.length != 0) {
                    for (java.lang.String str3 : split) {
                        if (!android.text.TextUtils.isEmpty(str3)) {
                            for (int i18 = 0; i18 < arrayList4.size() && ((c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) arrayList4.get(i18)) == null || !str3.equals(c19091x9511676c.f69223x58802fcb)); i18++) {
                            }
                        }
                    }
                    arrayList4.size();
                }
            }
            m10Var3.getClass();
            am.m10 m10Var4 = this.f95393d.f136492h;
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().b();
            m10Var4.getClass();
            am.m10 m10Var5 = this.f95393d.f136492h;
            at4.v1 v1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95530f;
            m10Var5.getClass();
            am.m10 m10Var6 = this.f95393d.f136492h;
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().q();
            m10Var6.getClass();
            this.f95393d.f136492h.f88829e = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().x();
            this.f95393d.f136492h.f88830f = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().e();
            this.f95393d.f136492h.f88831g = "";
            at4.v1 v1Var2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95530f;
            if (m1Var != null && (m1Var instanceof ss4.e0)) {
                am.m10 m10Var7 = this.f95393d.f136492h;
                ss4.e0 e0Var = (ss4.e0) m1Var;
                m10Var7.f88831g = e0Var.f493569d;
                m10Var7.getClass();
                this.f95393d.f136492h.getClass();
                this.f95393d.f136492h.getClass();
                this.f95393d.f136492h.getClass();
                am.m10 m10Var8 = this.f95393d.f136492h;
                m10Var8.f88832h = e0Var.f493570e;
                m10Var8.f88833i = e0Var.f493571f;
                m10Var8.f88834j = e0Var.f493572g;
                m10Var8.f88835k = e0Var.f493573h;
                m10Var8.f88836l = e0Var.f493574i;
                m10Var8.f88837m = e0Var.f493575m;
                m10Var8.f88838n = e0Var.f493576n;
                m10Var8.f88839o = e0Var.f493577o;
                m10Var8.f88840p = e0Var.f493578p;
                m10Var8.getClass();
                am.m10 m10Var9 = this.f95393d.f136492h;
                m10Var9.f88846v = e0Var.f493586x;
                m10Var9.f88847w = e0Var.f493587y;
                m10Var9.f88848x = e0Var.f493588z;
            }
            am.m10 m10Var10 = this.f95393d.f136492h;
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().u();
            m10Var10.getClass();
            am.m10 m10Var11 = this.f95393d.f136492h;
            at4.v1 v1Var3 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95530f;
            m10Var11.f88841q = v1Var3 != null ? v1Var3.f67050x2bc292eb : 0;
            am.m10 m10Var12 = this.f95393d.f136492h;
            at4.v1 v1Var4 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95530f;
            m10Var12.f88842r = v1Var4 != null && v1Var4.f67047x21e06fb8 == 1;
            am.m10 m10Var13 = this.f95393d.f136492h;
            at4.v1 v1Var5 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95530f;
            m10Var13.f88843s = v1Var5 != null ? v1Var5.f67053x6f83bfa1 : null;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c4611842 = this.f95393d;
            c6243x5c4611842.f136492h.f88844t = z17;
            java.lang.Runnable runnable = c6243x5c4611842.f273897d;
            if (runnable != null) {
                runnable.run();
            }
            java.lang.Runnable runnable2 = this.f95393d.f136492h.f88825a;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        if (this.f95394e) {
            this.f95393d = null;
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184) abstractC20979x809547d1;
        if (!(c6243x5c461184 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.WalletGetUserInfoEventListener", "mismatched event");
            return false;
        }
        this.f95394e = false;
        this.f95393d = c6243x5c461184;
        am.l10 l10Var = c6243x5c461184.f136491g;
        this.f95395f = l10Var.f88749b;
        boolean z17 = l10Var.f88750c;
        this.f95396g = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetUserInfoEventListener", "mustNotifyAfterNetEnd: %s", java.lang.Boolean.valueOf(z17));
        gm0.j1.i();
        gm0.j1.n().f354821b.a(385, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(1518, this);
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().s()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetUserInfoEventListener", "data is invalid. doScene");
            b(c6243x5c461184);
        } else if (c6243x5c461184.f136491g.f88749b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetUserInfoEventListener", "use cache");
            at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
            fj6.getClass();
            long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "checkCacheTimeout, nowSecs: %s, cacheDeadTime: %s", java.lang.Long.valueOf(i17), java.lang.Long.valueOf(fj6.f95540p));
            long j17 = fj6.f95540p;
            if (j17 <= 0 || i17 > j17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetUserInfoEventListener", "cache timeout, do NetSceneTenpayQueryBoundBankcard");
                b(c6243x5c461184);
            } else {
                if (!this.f95396g) {
                    this.f95394e = true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetUserInfoEventListener", "cache data is ok. doCallback");
                c(0, "", null, false);
                b(c6243x5c461184);
            }
        } else {
            at4.x1 fj7 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
            long H1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(fj7.f95539o);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUserInfoManger", "dead time : %d, nowSec: %d, pass time " + H1, java.lang.Long.valueOf(fj7.f95539o), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            if (H1 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetUserInfoEventListener", "data is checkTimeOut, do NetSceneTenpayQueryBoundBankcard");
                b(c6243x5c461184);
            } else {
                this.f95394e = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetUserInfoEventListener", "data is ok. doCallback");
                c(0, "", null, false);
            }
        }
        return true;
    }

    public final void f(int i17, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        gm0.j1.d().q(385, this);
        gm0.j1.d().q(1518, this);
        if (!this.f95396g && this.f95395f && this.f95394e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetUserInfoEventListener", "onSceneEnd, useCache and event end");
        } else {
            this.f95394e = true;
            c(i17, str, m1Var, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = this.f95393d;
        if (c6243x5c461184 == null || c6243x5c461184.f136491g == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetUserInfoEventListener", "onSceneEnd, errType: %s, errCode: %s, scene: %s, retry: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), m1Var, java.lang.Integer.valueOf(this.f95393d.f136491g.f88751d));
        if (m1Var != this.f95397h) {
            return;
        }
        if ((m1Var instanceof ss4.e0) || (m1Var instanceof us4.a)) {
            if (i17 == 0 && i18 == 0) {
                f(i18, str, m1Var, true);
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c4611842 = this.f95393d;
            am.l10 l10Var = c6243x5c4611842.f136491g;
            int i19 = l10Var.f88751d;
            if (i19 == 0) {
                f(i18, str, m1Var, true);
            } else {
                l10Var.f88751d = i19 - 1;
                b(c6243x5c4611842);
            }
        }
    }
}
