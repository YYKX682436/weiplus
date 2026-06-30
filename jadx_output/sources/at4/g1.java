package at4;

/* loaded from: classes9.dex */
public class g1 extends com.tencent.mm.sdk.event.n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.autogen.events.WalletGetUserInfoEvent f13860d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13861e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13862f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13863g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.m1 f13864h;

    public g1() {
        super(0);
        this.f13861e = false;
        this.f13862f = false;
        this.f13863g = false;
    }

    public final void b(com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent) {
        if (c01.z1.I()) {
            this.f13864h = new us4.a();
            gm0.j1.d().g(this.f13864h);
            return;
        }
        int i17 = walletGetUserInfoEvent.f54958g.f7215a;
        boolean z17 = true;
        if (i17 != 0 && i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4 && i17 != 6 && i17 != 8 && i17 != 9 && i17 != 10 && i17 != 11 && i17 != 12 && i17 != 13 && i17 != 14 && i17 != 15 && i17 != 16 && i17 != 17 && i17 != 18 && i17 != 19 && i17 != 20 && i17 != 21 && i17 != 22 && i17 != 23) {
            z17 = false;
        }
        if (!z17) {
            i17 = 0;
        }
        this.f13864h = new ss4.e0(null, i17);
        gm0.j1.d().g(this.f13864h);
    }

    public final void c(int i17, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        java.util.ArrayList arrayList;
        java.lang.String[] split;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard;
        java.util.ArrayList arrayList2;
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = this.f13860d;
        if (walletGetUserInfoEvent != null) {
            am.m10 m10Var = walletGetUserInfoEvent.f54959h;
            m10Var.f7295d = i17;
            m10Var.f7312u = m1Var;
            m10Var.f7293b = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w();
            am.m10 m10Var2 = this.f13860d.f54959h;
            at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
            at4.u1 u1Var = fj6.f14000i;
            m10Var2.f7294c = !((u1Var != null && u1Var.b()) || ((arrayList = fj6.f13996e) != null && arrayList.size() > 0)) && ((arrayList2 = fj6.f13995d) == null || arrayList2.size() <= 0);
            am.m10 m10Var3 = this.f13860d.f54959h;
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
                            for (int i18 = 0; i18 < arrayList4.size() && ((bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) arrayList4.get(i18)) == null || !str3.equals(bankcard.field_bankcardType)); i18++) {
                            }
                        }
                    }
                    arrayList4.size();
                }
            }
            m10Var3.getClass();
            am.m10 m10Var4 = this.f13860d.f54959h;
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().b();
            m10Var4.getClass();
            am.m10 m10Var5 = this.f13860d.f54959h;
            at4.v1 v1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13997f;
            m10Var5.getClass();
            am.m10 m10Var6 = this.f13860d.f54959h;
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().q();
            m10Var6.getClass();
            this.f13860d.f54959h.f7296e = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().x();
            this.f13860d.f54959h.f7297f = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().e();
            this.f13860d.f54959h.f7298g = "";
            at4.v1 v1Var2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13997f;
            if (m1Var != null && (m1Var instanceof ss4.e0)) {
                am.m10 m10Var7 = this.f13860d.f54959h;
                ss4.e0 e0Var = (ss4.e0) m1Var;
                m10Var7.f7298g = e0Var.f412036d;
                m10Var7.getClass();
                this.f13860d.f54959h.getClass();
                this.f13860d.f54959h.getClass();
                this.f13860d.f54959h.getClass();
                am.m10 m10Var8 = this.f13860d.f54959h;
                m10Var8.f7299h = e0Var.f412037e;
                m10Var8.f7300i = e0Var.f412038f;
                m10Var8.f7301j = e0Var.f412039g;
                m10Var8.f7302k = e0Var.f412040h;
                m10Var8.f7303l = e0Var.f412041i;
                m10Var8.f7304m = e0Var.f412042m;
                m10Var8.f7305n = e0Var.f412043n;
                m10Var8.f7306o = e0Var.f412044o;
                m10Var8.f7307p = e0Var.f412045p;
                m10Var8.getClass();
                am.m10 m10Var9 = this.f13860d.f54959h;
                m10Var9.f7313v = e0Var.f412053x;
                m10Var9.f7314w = e0Var.f412054y;
                m10Var9.f7315x = e0Var.f412055z;
            }
            am.m10 m10Var10 = this.f13860d.f54959h;
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().u();
            m10Var10.getClass();
            am.m10 m10Var11 = this.f13860d.f54959h;
            at4.v1 v1Var3 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13997f;
            m10Var11.f7308q = v1Var3 != null ? v1Var3.field_is_show_lqb : 0;
            am.m10 m10Var12 = this.f13860d.f54959h;
            at4.v1 v1Var4 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13997f;
            m10Var12.f7309r = v1Var4 != null && v1Var4.field_is_open_lqb == 1;
            am.m10 m10Var13 = this.f13860d.f54959h;
            at4.v1 v1Var5 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13997f;
            m10Var13.f7310s = v1Var5 != null ? v1Var5.field_lqb_open_url : null;
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent2 = this.f13860d;
            walletGetUserInfoEvent2.f54959h.f7311t = z17;
            java.lang.Runnable runnable = walletGetUserInfoEvent2.f192364d;
            if (runnable != null) {
                runnable.run();
            }
            java.lang.Runnable runnable2 = this.f13860d.f54959h.f7292a;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        if (this.f13861e) {
            this.f13860d = null;
        }
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = (com.tencent.mm.autogen.events.WalletGetUserInfoEvent) iEvent;
        if (!(walletGetUserInfoEvent instanceof com.tencent.mm.autogen.events.WalletGetUserInfoEvent)) {
            com.tencent.mars.xlog.Log.f("MicroMsg.WalletGetUserInfoEventListener", "mismatched event");
            return false;
        }
        this.f13861e = false;
        this.f13860d = walletGetUserInfoEvent;
        am.l10 l10Var = walletGetUserInfoEvent.f54958g;
        this.f13862f = l10Var.f7216b;
        boolean z17 = l10Var.f7217c;
        this.f13863g = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetUserInfoEventListener", "mustNotifyAfterNetEnd: %s", java.lang.Boolean.valueOf(z17));
        gm0.j1.i();
        gm0.j1.n().f273288b.a(385, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1518, this);
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().s()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetUserInfoEventListener", "data is invalid. doScene");
            b(walletGetUserInfoEvent);
        } else if (walletGetUserInfoEvent.f54958g.f7216b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetUserInfoEventListener", "use cache");
            at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
            fj6.getClass();
            long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "checkCacheTimeout, nowSecs: %s, cacheDeadTime: %s", java.lang.Long.valueOf(i17), java.lang.Long.valueOf(fj6.f14007p));
            long j17 = fj6.f14007p;
            if (j17 <= 0 || i17 > j17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetUserInfoEventListener", "cache timeout, do NetSceneTenpayQueryBoundBankcard");
                b(walletGetUserInfoEvent);
            } else {
                if (!this.f13863g) {
                    this.f13861e = true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetUserInfoEventListener", "cache data is ok. doCallback");
                c(0, "", null, false);
                b(walletGetUserInfoEvent);
            }
        } else {
            at4.x1 fj7 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
            long H1 = com.tencent.mm.sdk.platformtools.t8.H1(fj7.f14006o);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "dead time : %d, nowSec: %d, pass time " + H1, java.lang.Long.valueOf(fj7.f14006o), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            if (H1 > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetUserInfoEventListener", "data is checkTimeOut, do NetSceneTenpayQueryBoundBankcard");
                b(walletGetUserInfoEvent);
            } else {
                this.f13861e = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetUserInfoEventListener", "data is ok. doCallback");
                c(0, "", null, false);
            }
        }
        return true;
    }

    public final void f(int i17, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        gm0.j1.d().q(385, this);
        gm0.j1.d().q(1518, this);
        if (!this.f13863g && this.f13862f && this.f13861e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetUserInfoEventListener", "onSceneEnd, useCache and event end");
        } else {
            this.f13861e = true;
            c(i17, str, m1Var, true);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = this.f13860d;
        if (walletGetUserInfoEvent == null || walletGetUserInfoEvent.f54958g == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetUserInfoEventListener", "onSceneEnd, errType: %s, errCode: %s, scene: %s, retry: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), m1Var, java.lang.Integer.valueOf(this.f13860d.f54958g.f7218d));
        if (m1Var != this.f13864h) {
            return;
        }
        if ((m1Var instanceof ss4.e0) || (m1Var instanceof us4.a)) {
            if (i17 == 0 && i18 == 0) {
                f(i18, str, m1Var, true);
                return;
            }
            com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent2 = this.f13860d;
            am.l10 l10Var = walletGetUserInfoEvent2.f54958g;
            int i19 = l10Var.f7218d;
            if (i19 == 0) {
                f(i18, str, m1Var, true);
            } else {
                l10Var.f7218d = i19 - 1;
                b(walletGetUserInfoEvent2);
            }
        }
    }
}
