package at4;

/* loaded from: classes8.dex */
public class e1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 f95364d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f95365e;

    public e1() {
        super(0);
        this.f95365e = null;
    }

    public final void b() {
        dt4.e hj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).hj();
        at4.c1 c1Var = new at4.c1();
        c1Var.f65939xc71715d9 = this.f95365e;
        if (hj6.get(c1Var, new java.lang.String[0])) {
            am.j10 j10Var = this.f95364d.f136489h;
            j10Var.f88527a = c1Var.f65939xc71715d9;
            j10Var.f88528b = c1Var.f65938x24411286;
            j10Var.f88529c = c1Var.f65940x541eb1fc;
            int i17 = c1Var.f65945x2262335f;
            j10Var.f88530d = i17;
            if (i17 == 2) {
                j10Var.f88531e = new r45.tw4();
                r45.tw4 tw4Var = this.f95364d.f136489h.f88531e;
                tw4Var.f468364d = c1Var.f65941x6b1e48aa;
                tw4Var.f468366f = c1Var.f65943x26d6cac;
                tw4Var.f468367g = c1Var.f65942xe902b83;
                tw4Var.f468365e = c1Var.f65946xcf77aa53;
                tw4Var.f468368h = c1Var.f65944xbca76dd;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetBulletinEventListener", "not bulletin data ");
        }
        java.lang.Runnable runnable = this.f95364d.f273897d;
        if (runnable != null) {
            runnable.run();
        }
        java.lang.Runnable runnable2 = this.f95364d.f136488g.f88427b;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.f95364d = null;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6) abstractC20979x809547d1;
        this.f95364d = c6241x543927b6;
        this.f95365e = c6241x543927b6.f136488g.f88426a;
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BULLETIN_GET_TIME_LONG, 0L)).longValue();
        long time = new java.util.Date().getTime();
        long longValue2 = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BULLETIN_UPDATE_INTERVAL_LONG, 600000L)).longValue();
        if (time - longValue > (longValue2 > 0 ? longValue2 : 600000L) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f95365e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetBulletinEventListener", "data is out of date,do NetSceneGetBannerInfo for update");
            ss4.g gVar = new ss4.g();
            gm0.j1.i();
            com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
            r1Var.a(385, this);
            r1Var.g(gVar);
            return true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f95365e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetBulletinEventListener", "get bulletin data from db");
            b();
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletGetBulletinEventListener", "mScene is null");
        java.lang.Runnable runnable = this.f95364d.f273897d;
        if (runnable != null) {
            runnable.run();
        }
        java.lang.Runnable runnable2 = this.f95364d.f136488g.f88427b;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.f95364d = null;
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetBulletinEventListener", "NetSceneGetBannerInfo resp,errType = " + i17 + ";errCode=" + i18);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(385, this);
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BULLETIN_GET_TIME_LONG, java.lang.Long.valueOf(new java.util.Date().getTime()));
        b();
    }
}
