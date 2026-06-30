package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI;", "Lcom/tencent/mm/ui/conversation/BaseConversationUI;", "<init>", "()V", "com/tencent/mm/ui/conversation/u8", "OpenImKefuChattingUIFragment", "OpenImKefuServiceConversationFmUI", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI */
/* loaded from: classes11.dex */
public final class ActivityC22379xa796fab5 extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 {

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u8 f288925n = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u8(null);

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f288926e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f288927f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f288928g = jz5.h.b(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t9(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f288929h = jz5.h.b(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.s9(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f288930i = jz5.h.b(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p9(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f288931m = jz5.h.b(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q9(this));

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI;", "Lcom/tencent/mm/ui/conversation/BaseConversationUI$BaseConversationFmUI;", "Ll75/z0;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI */
    /* loaded from: classes11.dex */
    public static final class OpenImKefuServiceConversationFmUI extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI implements l75.z0 {

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f288932d;

        /* renamed from: e, reason: collision with root package name */
        public android.widget.TextView f288933e;

        /* renamed from: f, reason: collision with root package name */
        public android.widget.ListView f288934f;

        /* renamed from: g, reason: collision with root package name */
        public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h8 f288935g;

        /* renamed from: i, reason: collision with root package name */
        public com.p314xaae8f345.mm.p2621x8fb0427b.l4 f288937i;

        /* renamed from: m, reason: collision with root package name */
        public boolean f288938m;

        /* renamed from: n, reason: collision with root package name */
        public rl5.r f288939n;

        /* renamed from: o, reason: collision with root package name */
        public int f288940o;

        /* renamed from: p, reason: collision with root package name */
        public int f288941p;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f288936h = "";

        /* renamed from: q, reason: collision with root package name */
        public boolean f288942q = true;

        /* renamed from: r, reason: collision with root package name */
        public final java.lang.String f288943r = java.lang.String.valueOf(java.lang.System.currentTimeMillis());

        /* renamed from: s, reason: collision with root package name */
        public final db5.t4 f288944s = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o9(this);

        @Override // l75.z0
        public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
        /* renamed from: getLayoutId */
        public int getF153758d() {
            return com.p314xaae8f345.mm.R.C30864xbddafb2a.bok;
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI
        /* renamed from: getUserName, reason: from getter */
        public java.lang.String getF288932d() {
            return this.f288932d;
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onActivityCreated */
        public void mo7495x78cb4fa(android.os.Bundle bundle) {
            android.content.Intent intent;
            super.mo7495x78cb4fa(bundle);
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo78409x676b27cd = mo78409x676b27cd();
            this.f288932d = (mo78409x676b27cd == null || (intent = mo78409x676b27cd.getIntent()) == null) ? null : intent.getStringExtra("Contact_User");
            mo78695xbf7c1df6(m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.her));
            this.f288934f = (android.widget.ListView) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565478cj2);
            android.widget.TextView textView = (android.widget.TextView) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.dfo);
            this.f288933e = textView;
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hes);
            }
            mo78682x9c8c0d33(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m9(this));
            m78623x84f07bce(1, com.p314xaae8f345.mm.R.C30867xcad56011.f571346ch, com.p314xaae8f345.mm.R.raw.f80298x5ddec500, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n9(this));
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h8 h8Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h8(this.f288932d, mo78409x676b27cd(), new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.g9(this));
            this.f288935g = h8Var;
            android.widget.ListView listView = this.f288934f;
            if (listView != null) {
                listView.setAdapter((android.widget.ListAdapter) h8Var);
            }
            android.widget.ListView listView2 = this.f288934f;
            if (listView2 != null) {
                listView2.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.j9(this));
            }
            android.widget.ListView listView3 = this.f288934f;
            if (listView3 != null) {
                listView3.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k9(this));
            }
            this.f288939n = new rl5.r(mo78409x676b27cd());
            android.widget.ListView listView4 = this.f288934f;
            if (listView4 != null) {
                listView4.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.l9(this));
            }
            g23.j.f349463a.a(2L);
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onCreate */
        public void mo7398x3e5a77bb(android.os.Bundle bundle) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "onCreate");
            super.mo7398x3e5a77bb(bundle);
            b00.a0 a0Var = (b00.a0) ((c00.u3) i95.n0.c(c00.u3.class));
            java.lang.String str = this.f288943r;
            a0Var.f98169d = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfReportService", "setKfListPageSessionId:" + str);
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
            super.onCreateContextMenu(menu, v17, contextMenuInfo);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f288936h, true);
            if (n17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenImKefuServiceConversationUI", "onCreateContextMenu, contact is null, talker = " + this.f288936h);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(contextMenuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
                android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
                if (n17.E2 >= 0) {
                    menu.add(adapterContextMenuInfo.position, 1, 0, com.p314xaae8f345.mm.R.C30867xcad56011.heq);
                }
                menu.add(adapterContextMenuInfo.position, 2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.gqi);
            }
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onDestroy */
        public void mo7504xac79a11b() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "onDestroy");
            b00.a0 a0Var = (b00.a0) ((c00.u3) i95.n0.c(c00.u3.class));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfReportService", "clearKfListPageSessionId, old:" + a0Var.f98169d);
            a0Var.f98169d = null;
            super.mo7504xac79a11b();
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h8 h8Var = this.f288935g;
            if (h8Var != null) {
                h8Var.E();
            }
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onPause */
        public void mo7512xb01dfb57() {
            super.mo7512xb01dfb57();
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h8 h8Var = this.f288935g;
            if (h8Var != null) {
                h8Var.F();
            }
            ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b9(this));
        }

        @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.BaseConversationFmUI, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onResume */
        public void mo7517x57429eec() {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h8 h8Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "onResume chattingClosed: %s", java.lang.Boolean.valueOf(this.f288820ui.f39548x8bda051f));
            super.mo7517x57429eec();
            if (this.f288820ui.f39548x8bda051f && (h8Var = this.f288935g) != null) {
                h8Var.G();
            }
            if (this.f288942q) {
                this.f288942q = false;
                android.widget.ListView listView = this.f288934f;
                if (listView != null) {
                    listView.requestFocus();
                }
            }
        }
    }

    public final int W6() {
        return ((java.lang.Number) ((jz5.n) this.f288931m).mo141623x754a37bb()).intValue();
    }

    public final com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 X6() {
        return (com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1) ((jz5.n) this.f288928g).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8
    /* renamed from: getChattingUIFragment */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea mo80432x7473b9c0() {
        return new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        boolean z17 = false;
        if (((java.lang.Boolean) ((jz5.n) this.f288930i).mo141623x754a37bb()).booleanValue()) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
            intent.addFlags(67108864);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI", "handleBack", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI", "handleBack", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292613c, com.p314xaae8f345.mm.ui.uc.f292614d);
            finish();
            z17 = true;
        }
        if (z17) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        o25.n1.d(this, this.f288926e);
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569762nn, (android.view.ViewGroup) null);
        this.f288926e = inflate;
        setContentView(inflate);
        m80494xedaf7c43(this.f288926e);
        this.f39542x9c18d0aa = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI();
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        m7630xb2c12e75.h(com.p314xaae8f345.mm.R.id.jmc, this.f39542x9c18d0aa, null, 1);
        m7630xb2c12e75.d();
        o25.n1.d(this, this.f288926e);
        this.f288927f = false;
        q41.f.d(2);
        if (W6() == 1) {
            q41.f.d(1);
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.OpenImKefuServiceConversationUI)).Rj(this, iy1.a.KFSession);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p("opencustomerservicemsg");
        if (p17 != null) {
            int d17 = p17.d1();
            boolean z17 = d17 > 0;
            java.lang.String y07 = p17.y0();
            if (y07 == null) {
                y07 = "";
            }
            b00.a0 a0Var = (b00.a0) ((c00.u3) i95.n0.c(c00.u3.class));
            a0Var.bj("ecs_kf_main_session_holder", "view_clk", a0Var.Bi(y07, d17, z17, p17.z0()));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        java.lang.String stringExtra;
        r45.s4 s4Var;
        super.onResume();
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 X6 = X6();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u8 u8Var = f288925n;
        if (X6 != null) {
            if (this.f288927f) {
                return;
            }
            this.f288927f = true;
            com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 X62 = X6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(X62);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "handleJump from startConversationRequest getContactScene: %s, hasJumped: %b, isConfirmPageShown: %s", java.lang.Integer.valueOf(X62.f153807f), java.lang.Boolean.valueOf(this.f288927f), java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) this.f288929h).mo141623x754a37bb()).booleanValue()));
            com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 X63 = X6();
            java.lang.String str = (X63 == null || (s4Var = X63.f153810i) == null) ? null : s4Var.f467023h;
            java.lang.String str2 = str == null ? "" : str;
            com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 X64 = X6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(X64);
            u8Var.a(this, str2, X64.f153817s, false, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.r9(this));
            return;
        }
        android.content.Intent intent = getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("open_im_kefu_jump_chatting", false) : false;
        if (!booleanExtra || this.f288927f) {
            return;
        }
        this.f288927f = true;
        android.content.Intent intent2 = getIntent();
        java.lang.String str3 = (intent2 == null || (stringExtra = intent2.getStringExtra("open_im_kefu_chatting_username")) == null) ? "" : stringExtra;
        boolean z17 = W6() != 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "handleJump fromScene: %s, needJump: %b, hasJumped: %b, neeChattingAnim: %b", java.lang.Integer.valueOf(W6()), java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(this.f288927f), java.lang.Boolean.valueOf(z17));
        u8Var.a(this, str3, z17, false, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.r8.f289582d);
        if (W6() == 2) {
            q41.f.a(str3, 25, 0);
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).hj(26, str3);
        }
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuChattingUIFragment;", "Lcom/tencent/mm/ui/chatting/ChattingUIFragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI$OpenImKefuChattingUIFragment */
    /* loaded from: classes9.dex */
    public static final class OpenImKefuChattingUIFragment extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea {
        public static final /* synthetic */ int V = 0;
        public final java.lang.String N;
        public ab5.i0 P;
        public final r45.g15 Q;
        public byte[] R;
        public final jz5.g S;
        public sb5.v T;
        public final jz5.g U;

        public OpenImKefuChattingUIFragment() {
            this.N = "MicroMsg.OpenImKefuChattingUIFragment";
            this.Q = new r45.g15();
            this.S = jz5.h.b(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y8(this));
            this.U = jz5.h.b(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x8(this));
        }

        @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
        public void M0() {
            super.M0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.N, "[onEnterEnd]: UI: %s#0x%x Fg: %s#0x%x", mo78409x676b27cd().getClass().getSimpleName(), java.lang.Integer.valueOf(mo78409x676b27cd().hashCode()), com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment.class.getSimpleName(), java.lang.Integer.valueOf(m7479x8cdac1b()));
            ((jz5.n) this.U).mo141623x754a37bb();
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View v17) {
            java.lang.Object m143895xf1229813;
            org.json.JSONObject jSONObject;
            org.json.JSONObject optJSONObject;
            org.json.JSONObject optJSONObject2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
            super.onViewAttachedToWindow(v17);
            r45.g15 g15Var = this.Q;
            if (g15Var.f456337d) {
                java.lang.String str = g15Var.f456353w;
                java.lang.String str2 = g15Var.f456354x;
                if (str2 != null) {
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new org.json.JSONObject(str2));
                    } catch (java.lang.Throwable th6) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                    }
                    if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                        m143895xf1229813 = null;
                    }
                    jSONObject = (org.json.JSONObject) m143895xf1229813;
                } else {
                    jSONObject = null;
                }
                boolean z17 = true;
                java.lang.String str3 = jSONObject != null && jSONObject.optBoolean("isProductMsg") ? "1" : jSONObject != null && jSONObject.optBoolean("isOrderMsg") ? "2" : "default";
                java.lang.String optString = (jSONObject == null || (optJSONObject2 = jSONObject.optJSONObject("orderParam")) == null) ? null : optJSONObject2.optString("orderID");
                java.lang.String optString2 = (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("productParam")) == null) ? null : optJSONObject.optString("productID");
                com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1 = (com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1) ((jz5.n) this.S).mo141623x754a37bb();
                int i17 = c11207x71c7a1c1 != null ? c11207x71c7a1c1.f153807f : 0;
                ab5.i0 i0Var = this.P;
                yb5.d dVar = this.f279685f;
                if (i0Var == null) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) dVar.f542241c.a(sb5.s0.class))).f280796e;
                    ab5.i0 i0Var2 = new ab5.i0(mo7430x19263085(), c19666xfd6e2f33, c19666xfd6e2f33);
                    this.P = i0Var2;
                    i0Var2.f84493p = false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.N, "appBrandServiceImageBubble %s, %s", g15Var.f456342i, g15Var.f456340g);
                java.lang.String str4 = g15Var.f456353w;
                if (!(str4 == null || str4.length() == 0)) {
                    ab5.i0 i0Var3 = this.P;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var3);
                    i0Var3.f84487g.setText(g15Var.f456353w);
                }
                java.lang.String str5 = g15Var.f456342i;
                if (str5 == null || str5.length() == 0) {
                    java.lang.String str6 = g15Var.f456340g;
                    if (str6 != null && str6.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        l01.b bVar = l01.d0.f396294a;
                        ab5.i0 i0Var4 = this.P;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var4);
                        bVar.n(i0Var4, g15Var.f456340g, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(i65.a.b(mo7438x76847179(), 75), i65.a.b(mo7438x76847179(), 60)));
                    }
                } else {
                    l01.b bVar2 = l01.d0.f396294a;
                    ab5.i0 i0Var5 = this.P;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var5);
                    bVar2.n(i0Var5, "file://" + g15Var.f456342i, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(i65.a.b(mo7438x76847179(), 75), i65.a.b(mo7438x76847179(), 60)));
                }
                ab5.i0 i0Var6 = this.P;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var6);
                i0Var6.f84494q = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v8(str3, str, optString2, optString, i17, this, jSONObject);
                ab5.i0 i0Var7 = this.P;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var7);
                gm0.j1.e().j(new ab5.g0(i0Var7));
                b00.a0 a0Var = (b00.a0) ((c00.u3) i95.n0.c(c00.u3.class));
                a0Var.getClass();
                a0Var.bj("ecs_kf_quick_send_card", "view_exp", a0Var.Ui(str3, str, optString2, optString, i17));
                this.T = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w8(this);
                sb5.w wVar = (sb5.w) dVar.f542241c.a(sb5.w.class);
                sb5.v vVar = this.T;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x3 x3Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x3) wVar;
                if (vVar == null) {
                    x3Var.getClass();
                    return;
                }
                if (x3Var.f281735h == null) {
                    x3Var.f281735h = new java.util.HashSet();
                }
                ((java.util.HashSet) x3Var.f281735h).add(vVar);
            }
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View v17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
            super.onViewDetachedFromWindow(v17);
            sb5.w wVar = (sb5.w) this.f279685f.f542241c.a(sb5.w.class);
            sb5.v vVar = this.T;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x3 x3Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x3) wVar;
            if (vVar == null) {
                x3Var.getClass();
            } else {
                ((java.util.HashSet) x3Var.f281735h).remove(vVar);
            }
        }

        @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea, com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
        public void r0(android.content.Context context) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            super.r0(context);
            a12.s sVar = (a12.s) ((a12.k) i95.n0.c(a12.k.class));
            if (sVar.f82061i == 0) {
                sVar.Ai();
            }
            sVar.f82061i++;
        }

        @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea, com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
        public void s0() {
            byte[] bArr;
            java.lang.String str = this.N;
            super.s0();
            try {
                byte[] m78384x89472155 = m78384x89472155("key_appbrand_chat_info");
                if (m78384x89472155 != null) {
                    this.Q.mo11468x92b714fd(m78384x89472155);
                }
                try {
                    android.graphics.Bitmap m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(1, 1, android.graphics.Bitmap.Config.ARGB_8888, false);
                    new android.graphics.Canvas(m17).drawColor(-1);
                    bArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a(m17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "obtainMessageDefaultImg fail", new java.lang.Object[0]);
                    bArr = new byte[0];
                }
                this.R = bArr;
                ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfReportService", "onEnterKFRoom, sessionId:".concat(b00.k0.f98235a));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e18, "parse OpenIMStartChattingExtraInfo exception", new java.lang.Object[0]);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9) r1).f281695f == true) goto L12;
         */
        @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea, com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void u0() {
            /*
                r4 = this;
                super.u0()
                java.lang.Class<a12.k> r0 = a12.k.class
                i95.m r0 = i95.n0.c(r0)
                a12.k r0 = (a12.k) r0
                a12.s r0 = (a12.s) r0
                int r1 = r0.f82061i
                int r1 = r1 + (-1)
                r0.f82061i = r1
                if (r1 != 0) goto L7a
                java.lang.String r1 = "deactiveBiz"
                java.lang.String r2 = "MicroMsg.MagicEcsKFDynamicCardService"
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
                java.lang.ref.WeakReference r1 = r0.f82058f
                if (r1 == 0) goto L30
                java.lang.Object r1 = r1.get()
                a12.j r1 = (a12.j) r1
                if (r1 == 0) goto L30
                com.tencent.mm.ui.chatting.component.w9 r1 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9) r1
                boolean r1 = r1.f281695f
                r3 = 1
                if (r1 != r3) goto L30
                goto L31
            L30:
                r3 = 0
            L31:
                if (r3 == 0) goto L39
                java.lang.String r0 = "destroyBiz, ignore, isInChattingRoom"
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r0)
                goto L7a
            L39:
                iq0.c r1 = r0.Bi()
                if (r1 == 0) goto L4c
                java.lang.Class<gq0.t> r2 = gq0.t.class
                i95.m r2 = i95.n0.c(r2)
                gq0.t r2 = (gq0.t) r2
                nq0.p r2 = (nq0.p) r2
                r2.Di(r1)
            L4c:
                r0.Ni()
                java.lang.ref.WeakReference r1 = r0.f82058f
                if (r1 == 0) goto L60
                java.lang.Object r1 = r1.get()
                a12.j r1 = (a12.j) r1
                if (r1 == 0) goto L60
                com.tencent.mm.ui.chatting.component.w9 r1 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9) r1
                r1.n0()
            L60:
                java.lang.ref.WeakReference r0 = r0.f82058f
                if (r0 == 0) goto L7a
                java.lang.Object r0 = r0.get()
                a12.j r0 = (a12.j) r0
                if (r0 == 0) goto L7a
                com.tencent.mm.ui.chatting.component.w9 r0 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9) r0
                java.lang.String r1 = "MicroMsg.EcsKFComponent"
                java.lang.String r2 = "onDestroyBiz"
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
                java.util.HashMap r0 = r0.f281694e
                r0.clear()
            L7a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuChattingUIFragment.u0():void");
        }

        public OpenImKefuChattingUIFragment(boolean z17) {
            super(z17);
            this.N = "MicroMsg.OpenImKefuChattingUIFragment";
            this.Q = new r45.g15();
            this.S = jz5.h.b(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y8(this));
            this.U = jz5.h.b(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x8(this));
        }
    }
}
