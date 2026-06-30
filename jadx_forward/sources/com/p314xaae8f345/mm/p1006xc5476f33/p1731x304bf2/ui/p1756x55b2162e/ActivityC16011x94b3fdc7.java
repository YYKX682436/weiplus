package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI */
/* loaded from: classes8.dex */
public class ActivityC16011x94b3fdc7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15878x593061c5 implements nf.i {

    /* renamed from: r, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p794xb0fa9b5e.r f222748r = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.u1();

    /* renamed from: h, reason: collision with root package name */
    public p53.u f222749h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f222750i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 f222751m;

    /* renamed from: n, reason: collision with root package name */
    public int f222752n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f222753o = true;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.BroadcastReceiver f222754p = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.y1(this);

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f222755q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5625x88b37a55>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.7
        {
            this.f39173x3fe91575 = 98332773;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5625x88b37a55 c5625x88b37a55) {
            am.ug ugVar = c5625x88b37a55.f135952g;
            int i17 = ugVar.f89613a;
            boolean z17 = ugVar.f89617e;
            p53.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7.this.f222749h;
            if (uVar == null) {
                return false;
            }
            uVar.m157861x421622b1().f(i17, z17);
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI$IPCInvoke_readGameLifeConversation */
    /* loaded from: classes8.dex */
    public static class IPCInvoke_readGameLifeConversation implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

        /* renamed from: d, reason: collision with root package name */
        public com.p314xaae8f345.mm.p794xb0fa9b5e.r f222757d;

        /* renamed from: e, reason: collision with root package name */
        public final l75.q0 f222758e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.a2(this);

        /* renamed from: f, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b f222759f = new com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b() { // from class: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation.2
            @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b
            public void c(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation;
                com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar;
                if (!(abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb) || (rVar = (iPCInvoke_readGameLifeConversation = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7.IPCInvoke_readGameLifeConversation.this).f222757d) == null) {
                    return;
                }
                rVar.a(iPCInvoke_readGameLifeConversation.a());
            }
        };

        /* renamed from: g, reason: collision with root package name */
        public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f222760g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5593x207a1062>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation.3
            {
                this.f39173x3fe91575 = -2093822894;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5593x207a1062 c5593x207a1062) {
                synchronized (this) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7.IPCInvoke_readGameLifeConversation.this;
                    com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = iPCInvoke_readGameLifeConversation.f222757d;
                    if (rVar != null) {
                        rVar.a(iPCInvoke_readGameLifeConversation.a());
                    }
                }
                return false;
            }
        };

        private IPCInvoke_readGameLifeConversation() {
        }

        public final android.os.Bundle a() {
            int Ri = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ri();
            int Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Bi(1);
            int Bi2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Bi(2);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("msg_unread_count", Ri + Bi);
            bundle.putInt("notify_unread_count", Bi2);
            d43.b bVar = d43.b.f307944d;
            bundle.putBoolean("has_chat_room_unread_msg", d43.b.f307947g);
            return bundle;
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2 c10754x630c9a2 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) obj;
            android.os.Bundle bundle = null;
            if (c10754x630c9a2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGameWebTabUI", "IPCInvoke_readGameLifeConversation cmd:%d", java.lang.Integer.valueOf(c10754x630c9a2.f149937d));
                int i17 = c10754x630c9a2.f149937d;
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f222760g;
                com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b abstractC19580xf92ebc8b = this.f222759f;
                l75.q0 q0Var = this.f222758e;
                if (i17 == 1) {
                    this.f222757d = rVar;
                    ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).wi(q0Var);
                    com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb.class.getName(), abstractC19580xf92ebc8b);
                    abstractC20980x9b9ad01d.mo48813x58998cd();
                    bundle = a();
                } else if (i17 == 2) {
                    this.f222757d = null;
                    ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Vi(q0Var);
                    com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.e(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb.class.getName(), abstractC19580xf92ebc8b);
                    abstractC20980x9b9ad01d.mo48814x2efc64();
                } else if (i17 == 3) {
                    bundle = a();
                }
            }
            if (rVar != null) {
                rVar.a(bundle);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15878x593061c5
    public void V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.r0.b(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15878x593061c5
    public void W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l lVar = this.f221040g;
        if (lVar != null) {
            lVar.f221445l2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.v1(this);
        }
    }

    public final void Y6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l lVar;
        if (tabItem == null || (lVar = this.f221040g) == null) {
            return;
        }
        lVar.a0(tabItem.f222689d, tabItem.f222700r, z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGameWebTabUI", "Preload tabItem[key:%s, url:%s, isPreload:%b]", tabItem.f222689d, tabItem.f222700r, java.lang.Boolean.valueOf(z17));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i17 = this.f222752n;
        int i18 = configuration.orientation;
        if (i17 != i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGameWebTabUI", "orientation:%d", java.lang.Integer.valueOf(i18));
            p53.u uVar = this.f222749h;
            if (uVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb m157861x421622b1 = uVar.m157861x421622b1();
                m157861x421622b1.getClass();
                m157861x421622b1.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.s0(m157861x421622b1));
            }
            this.f222752n = configuration.orientation;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15878x593061c5, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGameWebTabUI", "onCreate");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f fVar = this.f221037d;
        if (fVar == null) {
            finish();
            return;
        }
        this.f222749h = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.r0.a(this, fVar.f488195c);
        this.f222751m = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65) getIntent().getParcelableExtra("game_tab_data");
        this.f222750i = getIntent().getStringExtra("game_tab_key");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = this.f222751m;
        if (c16008xdb77bd65 != null) {
            java.util.Iterator it = ((java.util.ArrayList) c16008xdb77bd65.a()).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) it.next();
                if (tabItem.f222699q == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tabItem.f222700r) && !tabItem.f222689d.equalsIgnoreCase(this.f222750i) && !tabItem.f222703u) {
                    this.f221037d.f488195c.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.t1(this, tabItem), tabItem.f222704v * 1000);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f fVar2 = this.f221037d;
        ((sd.u) fVar2.f488202j).f488186a.f488198f.f418118d = this;
        android.widget.FrameLayout frameLayout = fVar2.f488195c;
        if (frameLayout instanceof android.view.ViewGroup) {
            frameLayout.setOnHierarchyChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.z1(this, frameLayout));
            int indexOfChild = frameLayout.indexOfChild(frameLayout.findViewWithTag("game_float_view_tag"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGameWebTabUI", "float page index1:%d", java.lang.Integer.valueOf(indexOfChild));
            if (indexOfChild >= 0) {
                frameLayout.removeView(this.f222749h);
                frameLayout.addView(this.f222749h, indexOfChild);
            }
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        boolean a17 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.f222754p;
        if (a17) {
            registerReceiver(broadcastReceiver, intentFilter, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.g0.f220981a, null);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.g0.f220981a, null, 4);
        }
        this.f222755q.mo48813x58998cd();
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(1), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7.IPCInvoke_readGameLifeConversation.class, f222748r);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15878x593061c5, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGameWebTabUI", "onDestroy");
        unregisterReceiver(this.f222754p);
        this.f222755q.mo48814x2efc64();
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(2), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7.IPCInvoke_readGameLifeConversation.class, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.r0.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9, com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGameWebTabUI", "onNewIntent");
        if (intent == null) {
            return;
        }
        setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("game_tab_key");
        if (stringExtra != null) {
            java.lang.String str = this.f222750i;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            if (str.equalsIgnoreCase(stringExtra)) {
                return;
            }
            this.f222750i = stringExtra;
            android.content.Intent intent2 = getIntent();
            java.lang.String stringExtra2 = intent2 != null ? intent2.getStringExtra("game_tab_entrance_msgid") : "";
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 p17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().p1(stringExtra2) : ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().o1(null);
            if (p17 != null) {
                p17.t0();
                if (this.f222750i.equals(p17.M2.f222057b)) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().K1(p17.f68458xd54c6aa5);
                } else if (this.f222749h != null) {
                    ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.w1(this, p17));
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = this.f222751m;
            if (c16008xdb77bd65 == null || this.f221040g == null) {
                return;
            }
            Y6((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) c16008xdb77bd65.f222684d.get(stringExtra), false);
            this.f221040g.W(stringExtra);
            p53.u uVar = this.f222749h;
            if (uVar != null) {
                uVar.bringToFront();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15878x593061c5, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.f222753o) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(3), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16011x94b3fdc7.IPCInvoke_readGameLifeConversation.class, f222748r);
        }
        this.f222753o = false;
        if (this.f222751m.f222688h != null) {
            getWindow().setNavigationBarColor(0);
            getWindow().getDecorView().setSystemUiVisibility(1792);
            if (com.p314xaae8f345.mm.ui.bl.f(this)) {
                this.f222749h.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.x1(this));
            }
        }
    }

    @Override // nf.i
    public boolean r6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.r0.b(this);
        return true;
    }
}
