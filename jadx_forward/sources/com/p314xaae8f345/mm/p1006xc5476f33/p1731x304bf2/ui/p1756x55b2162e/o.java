package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f222828a;

    /* renamed from: b, reason: collision with root package name */
    public p53.u f222829b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f222830c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.BroadcastReceiver f222831d = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.m(this);

    /* renamed from: e, reason: collision with root package name */
    public final l75.q0 f222832e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.n(this);

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b f222833f = new com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b() { // from class: com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter$7
        @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b
        public void c(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
            if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.o.this.getClass();
            }
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f222834g;

    public o(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f222834g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5593x207a1062>(a0Var) { // from class: com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter$8
            {
                this.f39173x3fe91575 = -2093822894;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5593x207a1062 c5593x207a1062) {
                synchronized (this) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.o.this.getClass();
                }
                return false;
            }
        };
        this.f222828a = abstractActivityC21394xb3d2c0cf;
    }

    public void a(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.s1 s1Var) {
        m53.n4 n4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatTabPresenter", "gamelog.activity, ChatTabPresenter, onCreate");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f222828a;
        p53.u a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.r0.a(abstractActivityC21394xb3d2c0cf, view);
        this.f222829b = a17;
        if (a17 != null) {
            a17.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.i(this, s1Var));
        }
        java.lang.String str = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.i() == null || (n4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.i().f405394f) == null) ? null : n4Var.f405462d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy) + "/cgi-bin/h5/static/gamelife/homepage.html";
        }
        this.f222830c = str;
        if (s1Var != null) {
            s1Var.b(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatTabPresenter", "profile entrance: %s", this.f222830c);
        abstractActivityC21394xb3d2c0cf.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fq7);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        boolean a18 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.f222831d;
        if (a18) {
            abstractActivityC21394xb3d2c0cf.registerReceiver(broadcastReceiver, intentFilter, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.g0.f220981a, null);
        } else {
            this.f222828a.registerReceiver(broadcastReceiver, intentFilter, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.g0.f220981a, null, 2);
        }
        ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).wi(this.f222832e);
        com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb.class.getName(), this.f222833f);
        this.f222834g.mo48813x58998cd();
        abstractActivityC21394xb3d2c0cf.setRequestedOrientation(1);
        p53.u uVar = this.f222829b;
        if (uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb m157861x421622b1 = uVar.m157861x421622b1();
            m157861x421622b1.getClass();
            m157861x421622b1.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.s0(m157861x421622b1));
        }
        vj5.a.a(view, abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), true ^ com.p314xaae8f345.mm.ui.uk.g(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw)));
        abstractActivityC21394xb3d2c0cf.mo2533x106ab264().j().setBackgroundColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        abstractActivityC21394xb3d2c0cf.mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.j(this));
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatTabPresenter", "onDestroy");
        android.content.BroadcastReceiver broadcastReceiver = this.f222831d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f222828a;
        abstractActivityC21394xb3d2c0cf.unregisterReceiver(broadcastReceiver);
        ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Vi(this.f222832e);
        com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.e(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb.class.getName(), this.f222833f);
        this.f222834g.mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.r0.b(abstractActivityC21394xb3d2c0cf);
    }

    public void c(android.content.Intent intent) {
        this.f222828a.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9, com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatTabPresenter", "onNewIntent");
        if (intent == null) {
            return;
        }
        this.f222828a.setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("game_tab_entrance_msgid");
        java.lang.String stringExtra2 = intent.getStringExtra("game_tab_key");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 p17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().p1(stringExtra) : ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().o1(null);
        if (p17 != null) {
            p17.t0();
            if (stringExtra2.equals(p17.M2.f222057b)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().K1(p17.f68458xd54c6aa5);
            } else if (this.f222829b != null) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.l(this, stringExtra2, p17));
            }
        }
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatTabPresenter", "onPause");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_LIFE_LATEST_MSG_ID_LONG, java.lang.Long.valueOf(((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ni().f551785b));
    }

    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatTabPresenter", "onResume");
        if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_life_preload_profile_url, 0) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatTabPresenter", "preload profile");
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.k(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(kVar, 500L, false);
        }
    }
}
