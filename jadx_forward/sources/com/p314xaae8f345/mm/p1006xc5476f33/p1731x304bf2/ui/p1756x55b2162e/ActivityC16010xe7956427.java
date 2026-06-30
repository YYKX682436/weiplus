package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI */
/* loaded from: classes8.dex */
public class ActivityC16010xe7956427 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 implements nf.i {

    /* renamed from: v, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p794xb0fa9b5e.r f222729v = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.h1();

    /* renamed from: m, reason: collision with root package name */
    public p53.u f222730m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f222731n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 f222732o;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f222736s;

    /* renamed from: p, reason: collision with root package name */
    public int f222733p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f222734q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f222735r = false;

    /* renamed from: t, reason: collision with root package name */
    public final android.content.BroadcastReceiver f222737t = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.n1(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f222738u = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5625x88b37a55>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.9
        {
            this.f39173x3fe91575 = 98332773;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5625x88b37a55 c5625x88b37a55) {
            am.ug ugVar = c5625x88b37a55.f135952g;
            int i17 = ugVar.f89613a;
            boolean z17 = ugVar.f89617e;
            p53.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.this.f222730m;
            if (uVar == null) {
                return false;
            }
            uVar.m157861x421622b1().f(i17, z17);
            return false;
        }
    };

    @mk0.a
    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$IPCInvoke_readGameLifeConversation */
    /* loaded from: classes8.dex */
    public static class IPCInvoke_readGameLifeConversation implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

        /* renamed from: d, reason: collision with root package name */
        public com.p314xaae8f345.mm.p794xb0fa9b5e.r f222740d;

        /* renamed from: e, reason: collision with root package name */
        public long f222741e;

        /* renamed from: f, reason: collision with root package name */
        public android.os.Bundle f222742f;

        /* renamed from: g, reason: collision with root package name */
        public final l75.q0 f222743g = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.p1(this);

        /* renamed from: h, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b f222744h = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation.AnonymousClass2();

        /* renamed from: i, reason: collision with root package name */
        public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f222745i = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation.AnonymousClass3(com.p314xaae8f345.mm.app.a0.f134821d);

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$IPCInvoke_readGameLifeConversation$2, reason: invalid class name */
        /* loaded from: classes8.dex */
        public class AnonymousClass2 extends com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b {
            public AnonymousClass2() {
            }

            @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b
            public void c(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
                if (!(abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb) || com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation.this.f222740d == null) {
                    return;
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation.this;
                if (currentTimeMillis - iPCInvoke_readGameLifeConversation.f222741e < 1000) {
                    return;
                }
                iPCInvoke_readGameLifeConversation.f222741e = currentTimeMillis;
                ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.q1(this), "MicroMsg.GameWebTabUI");
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$IPCInvoke_readGameLifeConversation$3, reason: invalid class name */
        /* loaded from: classes8.dex */
        public class AnonymousClass3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5593x207a1062> {
            public AnonymousClass3(p012xc85e97e9.p093xedfae76a.y yVar) {
                super(yVar);
                this.f39173x3fe91575 = -2093822894;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5593x207a1062 c5593x207a1062) {
                synchronized (this) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation.this.f222740d != null) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation.this;
                        if (currentTimeMillis - iPCInvoke_readGameLifeConversation.f222741e < 1000) {
                            return false;
                        }
                        iPCInvoke_readGameLifeConversation.f222741e = currentTimeMillis;
                        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.r1(this), "MicroMsg.GameWebTabUI");
                    }
                    return false;
                }
            }
        }

        public final void a() {
            int Ri = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ri();
            int Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Bi(1);
            int Bi2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Bi(2);
            boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_MSG_BOTTOM_TAB_BOOLEAN_SYNC, false);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("msg_unread_count", Bi);
            bundle.putInt("notify_unread_count", Bi2);
            bundle.putInt("game_life_unread_count", Ri);
            d43.b bVar = d43.b.f307944d;
            bundle.putBoolean("has_chat_room_unread_msg", d43.b.f307947g);
            bundle.putBoolean("bottom_red_dot", o17);
            this.f222742f = bundle;
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo8834xb9724478(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2 c10754x630c9a2, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            android.os.Bundle bundle;
            if (c10754x630c9a2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebTabUI", "IPCInvoke_readGameLifeConversation cmd:%d", java.lang.Integer.valueOf(c10754x630c9a2.f149937d));
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                int i17 = c10754x630c9a2.f149937d;
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f222745i;
                com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b abstractC19580xf92ebc8b = this.f222744h;
                l75.q0 q0Var = this.f222743g;
                if (i17 == 1) {
                    this.f222740d = rVar;
                    ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).wi(q0Var);
                    com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb.class.getName(), abstractC19580xf92ebc8b);
                    abstractC20980x9b9ad01d.mo48813x58998cd();
                    if (currentTimeMillis - this.f222741e >= 1000) {
                        this.f222741e = currentTimeMillis;
                        a();
                    }
                } else if (i17 == 2) {
                    this.f222740d = null;
                    if (gm0.j1.a()) {
                        ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Vi(q0Var);
                    }
                    com.p314xaae8f345.mm.p2470x93e71c27.p2471x5c6729a.AbstractC19580xf92ebc8b.e(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5577x8d968bcb.class.getName(), abstractC19580xf92ebc8b);
                    abstractC20980x9b9ad01d.mo48814x2efc64();
                } else if (i17 == 3 && currentTimeMillis - this.f222741e >= 1000) {
                    this.f222741e = currentTimeMillis;
                    a();
                }
            }
            if (rVar == null || (bundle = this.f222742f) == null) {
                return;
            }
            rVar.a(bundle);
        }
    }

    @mk0.a
    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$a */
    /* loaded from: classes8.dex */
    public static class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        private a() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            int i17 = bundle.getInt("type");
            java.lang.String string = bundle.getString("msgId", "");
            android.os.Bundle bundle2 = new android.os.Bundle();
            if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 p17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().p1(string) : ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().o1(null);
                if (p17 != null) {
                    p17.t0();
                    bundle2.putString("game_red_dot_tab_key", p17.M2.f222057b);
                    bundle2.putString("game_tab_red_dot_msgid", p17.f68458xd54c6aa5);
                    rVar.a(bundle2);
                    return;
                }
            } else if (i17 == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().K1(string);
            }
            rVar.a(null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l V6(sd.x xVar, android.os.Bundle bundle) {
        return new q53.a(xVar, null, bundle, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825
    public void X6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.r0.b(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825
    public void Y6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l lVar = this.f221030g;
        if (lVar != null) {
            if (this.f222735r) {
                lVar.f221452s2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.k1(this);
            }
            lVar.f221445l2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.l1(this);
        }
    }

    public final void b7(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l lVar;
        if (tabItem == null || (lVar = this.f221030g) == null) {
            return;
        }
        lVar.a0(tabItem.f222689d, tabItem.f222700r, z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebTabUI", "Preload tabItem[key:%s, url:%s, isPreload:%b]", tabItem.f222689d, tabItem.f222700r, java.lang.Boolean.valueOf(z17));
    }

    public void c7(android.content.Intent intent) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("game_tab_entrance_msgid") : "";
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", 1);
        bundle.putString("msgId", stringExtra);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.a.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.j1(this, bundle));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i17 = this.f222733p;
        int i18 = configuration.orientation;
        if (i17 != i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebTabUI", "orientation:%d", java.lang.Integer.valueOf(i18));
            p53.u uVar = this.f222730m;
            if (uVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb m157861x421622b1 = uVar.m157861x421622b1();
                m157861x421622b1.getClass();
                m157861x421622b1.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.s0(m157861x421622b1));
            }
            this.f222733p = configuration.orientation;
        }
        if (this.f222732o == null || this.f221030g == null) {
            return;
        }
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        if (this.f222734q != C && this.f222730m != null) {
            this.f222734q = C;
            int z17 = r53.f.z(this.f222732o.f222686f);
            int z18 = r53.f.z(this.f222732o.f222687g);
            if (C) {
                if (z18 != 0) {
                    this.f222730m.m157861x421622b1().setBackgroundColor(z18);
                } else {
                    this.f222730m.m157861x421622b1().setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560048x);
                }
            } else if (z17 != 0) {
                this.f222730m.m157861x421622b1().setBackgroundColor(z17);
            } else {
                this.f222730m.m157861x421622b1().setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77920x41d15e22);
            }
            this.f222730m.m157861x421622b1().e(this.f222731n, "");
        }
        b7((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) this.f222732o.f222684d.get(this.f222731n), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f222732o = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65) getIntent().getParcelableExtra("game_tab_data");
        java.lang.String stringExtra = getIntent().getStringExtra("game_tab_key");
        this.f222731n = stringExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = this.f222732o;
        if (c16008xdb77bd65 != null && c16008xdb77bd65.f222685e.equalsIgnoreCase(stringExtra) && g53.e.b()) {
            this.f222735r = true;
        }
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebTabUI", "onCreate");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f fVar = this.f221027d;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameWebTabUI", "mContainer is null");
            finish();
            return;
        }
        this.f222730m = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.r0.a(this, fVar.f488195c);
        this.f222734q = com.p314xaae8f345.mm.ui.bk.C();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd652 = this.f222732o;
        if (c16008xdb77bd652 != null) {
            java.util.Iterator it = ((java.util.ArrayList) c16008xdb77bd652.a()).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) it.next();
                if (tabItem.f222699q == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tabItem.f222700r) && !tabItem.f222689d.equalsIgnoreCase(this.f222731n) && !tabItem.f222703u) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.f1 f1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.f1(this, tabItem);
                    long j17 = tabItem.f222704v * 1000;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f fVar2 = this.f221027d;
                    if (fVar2 != null) {
                        fVar2.f488195c.postDelayed(f1Var, j17);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f fVar3 = this.f221027d;
        ((sd.u) fVar3.f488202j).f488186a.f488198f.f418118d = this;
        android.widget.FrameLayout frameLayout = fVar3.f488195c;
        if (frameLayout instanceof android.view.ViewGroup) {
            frameLayout.setOnHierarchyChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.e1(this, frameLayout));
            int indexOfChild = frameLayout.indexOfChild(frameLayout.findViewWithTag("game_float_view_tag"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebTabUI", "float page index1:%d", java.lang.Integer.valueOf(indexOfChild));
            if (indexOfChild >= 0) {
                frameLayout.removeView(this.f222730m);
                frameLayout.addView(this.f222730m, indexOfChild);
            }
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        boolean a17 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.f222737t;
        if (a17) {
            registerReceiver(broadcastReceiver, intentFilter, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.g0.f220981a, null);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.g0.f220981a, null, 4);
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.GameWebViewUI)).Rj(this, iy1.a.Game);
        this.f222736s = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.g1(this);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9, com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9);
        c7(getIntent());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.h(this.f222736s);
        this.f222736s = null;
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebTabUI", "onDestroy");
        unregisterReceiver(this.f222737t);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.r0.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9, com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebTabUI", "onNewIntent");
        if (intent == null) {
            return;
        }
        setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("game_tab_key");
        if (stringExtra != null) {
            java.lang.String str = this.f222731n;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            if (str.equalsIgnoreCase(stringExtra)) {
                return;
            }
            this.f222731n = stringExtra;
            c7(intent);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = this.f222732o;
            if (c16008xdb77bd65 == null || this.f221030g == null) {
                return;
            }
            b7((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) c16008xdb77bd65.f222684d.get(stringExtra), false);
            this.f221030g.W(stringExtra);
            p53.u uVar = this.f222730m;
            if (uVar != null) {
                uVar.bringToFront();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f222738u.mo48814x2efc64();
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(2), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation.class, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        int i17;
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = this.f222732o;
        if (c16008xdb77bd65 != null && c16008xdb77bd65.f222688h != null) {
            int i18 = android.os.Build.VERSION.SDK_INT;
            if (i18 >= 29) {
                getWindow().setNavigationBarContrastEnforced(false);
                i17 = 16;
            } else {
                i17 = 0;
            }
            getWindow().getDecorView().setSystemUiVisibility(i17 | 512 | 1024 | 256);
            android.view.Window window = getWindow();
            android.graphics.Rect rect = com.p314xaae8f345.mm.ui.bk.f279511a;
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
                window.setNavigationBarColor(0);
                if (i18 >= 28) {
                    window.setNavigationBarDividerColor(0);
                }
            }
            if (com.p314xaae8f345.mm.ui.bl.f(this)) {
                this.f222730m.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.m1(this));
            }
        }
        this.f222738u.mo48813x58998cd();
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(1), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation.class, f222729v);
    }

    @Override // nf.i
    public boolean r6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.r0.b(this);
        return true;
    }
}
