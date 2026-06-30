package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.OpenIMAddressUI */
/* loaded from: classes11.dex */
public class ActivityC22322x8ea5381a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 f288049d;

    /* renamed from: com.tencent.mm.ui.contact.OpenIMAddressUI$OpenIMAddressUIFragment */
    /* loaded from: classes11.dex */
    public static class OpenIMAddressUIFragment extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

        /* renamed from: v, reason: collision with root package name */
        public static final /* synthetic */ int f288050v = 0;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f288051d;

        /* renamed from: e, reason: collision with root package name */
        public android.widget.ListView f288052e;

        /* renamed from: f, reason: collision with root package name */
        public com.p314xaae8f345.mm.ui.p2690x38b72420.b8 f288053f;

        /* renamed from: g, reason: collision with root package name */
        public yk5.u f288054g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f288055h;

        /* renamed from: i, reason: collision with root package name */
        public al5.y1 f288056i;

        /* renamed from: m, reason: collision with root package name */
        public int f288057m;

        /* renamed from: n, reason: collision with root package name */
        public int f288058n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f288059o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f288060p;

        /* renamed from: q, reason: collision with root package name */
        public final java.lang.Runnable f288061q;

        /* renamed from: r, reason: collision with root package name */
        public final db5.t4 f288062r;

        /* renamed from: s, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p2470x93e71c27.ui.b0 f288063s;

        /* renamed from: t, reason: collision with root package name */
        public java.util.List f288064t;

        /* renamed from: u, reason: collision with root package name */
        public java.util.List f288065u;

        public OpenIMAddressUIFragment() {
            super(true);
            this.f288051d = "";
            this.f288055h = "";
            this.f288060p = true;
            this.f288061q = new com.p314xaae8f345.mm.ui.p2690x38b72420.a8(this);
            this.f288062r = new com.p314xaae8f345.mm.ui.p2690x38b72420.l7(this);
            this.f288063s = new com.p314xaae8f345.mm.p2470x93e71c27.ui.b0(new com.p314xaae8f345.mm.ui.p2690x38b72420.m7(this));
            this.f288064t = new java.util.LinkedList();
            this.f288065u = new java.util.LinkedList();
        }

        public static void l0(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment openIMAddressUIFragment, java.lang.String str, boolean z17) {
            openIMAddressUIFragment.getClass();
            ((l75.a1) c01.d9.b().q()).e(openIMAddressUIFragment.f288053f);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
            n17.s3();
            c01.e2.g0(n17, true);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p0(str, n17);
            com.p314xaae8f345.mm.ui.p2690x38b72420.b8 b8Var = openIMAddressUIFragment.f288053f;
            b8Var.S.add(str);
            b8Var.n(str, 5);
            ((l75.a1) c01.d9.b().q()).a(openIMAddressUIFragment.f288053f);
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
        /* renamed from: getLayoutId */
        public int getF153758d() {
            return com.p314xaae8f345.mm.R.C30864xbddafb2a.c8o;
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
        /* renamed from: getLayoutView */
        public android.view.View mo78651x29ebce5() {
            return android.view.LayoutInflater.from(mo7438x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c8o, (android.view.ViewGroup) null);
        }

        public final void m0() {
            this.f288064t = new java.util.LinkedList();
            this.f288065u = new java.util.LinkedList();
            ((java.util.LinkedList) this.f288064t).add("tmessage");
            ((java.util.LinkedList) this.f288065u).addAll(this.f288064t);
            if (!((java.util.LinkedList) this.f288064t).contains("officialaccounts")) {
                ((java.util.LinkedList) this.f288064t).add("officialaccounts");
            }
            ((java.util.LinkedList) this.f288064t).add("helper_entry");
            com.p314xaae8f345.mm.ui.p2690x38b72420.b8 b8Var = this.f288053f;
            if (b8Var != null) {
                b8Var.C(this.f288064t);
            }
            yk5.u uVar = this.f288054g;
            if (uVar != null) {
                uVar.x(new yk5.m(uVar, this.f288065u));
            }
        }

        public final synchronized void n0() {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            m0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMAddressUI", "KEVIN updateBlockList() LAST" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            if (this.f288053f != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2690x38b72420.n7(this));
            }
            if (this.f288054g != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2690x38b72420.o7(this));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMAddressUI", "KEVIN doRefresh() LAST" + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onActivityCreated */
        public void mo7495x78cb4fa(android.os.Bundle bundle) {
            super.mo7495x78cb4fa(bundle);
            c01.d9.e().a(138, this);
            gm0.j1.i();
            gm0.j1.n().f354821b.a(453, this);
            this.f288051d = m78394x7e63ed49("key_openim_acctype_id");
            mo78695xbf7c1df6(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ri(this.f288051d, "openim_acct_type_title", j41.a0.TYPE_WORDING));
            mo78682x9c8c0d33(new com.p314xaae8f345.mm.ui.p2690x38b72420.t7(this));
            m78701xfb5745ae(this.f288061q);
            m7460x893a2f6f().getDisplayMetrics();
            android.widget.ListView listView = (android.widget.ListView) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.f564268mf);
            this.f288052e = listView;
            listView.setScrollingCacheEnabled(false);
            com.p314xaae8f345.mm.ui.p2690x38b72420.b8 b8Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.b8(mo7438x76847179(), "@openim.contact", null, 2, true, this.f288051d);
            this.f288053f = b8Var;
            b8Var.f290555i = new com.p314xaae8f345.mm.ui.p2690x38b72420.u7(this);
            b8Var.K = true;
            b8Var.V = this;
            b8Var.D = new com.p314xaae8f345.mm.ui.p2690x38b72420.v7(this);
            b8Var.C = new com.p314xaae8f345.mm.ui.p2690x38b72420.w7(this);
            yk5.u uVar = new yk5.u(mo7438x76847179(), 1);
            this.f288054g = uVar;
            uVar.x(new yk5.n(uVar, true));
            this.f288056i = new al5.y1(mo7438x76847179());
            this.f288052e.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.x7(this));
            this.f288052e.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.y7(this));
            this.f288052e.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.z7(this));
            this.f288052e.setOnScrollListener(this.f288063s);
            this.f288052e.setDrawingCacheEnabled(false);
            ((l75.a1) c01.d9.b().q()).a(this.f288053f);
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.OpenIMAddressUI)).Rj(this, iy1.a.WorkWxContacts);
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onActivityResult */
        public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMAddressUI", "onAcvityResult requestCode: %d", java.lang.Integer.valueOf(i17));
            if (i17 == 6 && i18 == -1) {
                m78406x209a1f1f(-1);
                mo78641xb4098c93();
            } else if (i18 == -1 && i17 == 4) {
                m78407x209a1f1f(-1, intent);
                mo78641xb4098c93();
            }
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f288055h, true);
            if (n17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMAddressUI", "onCreateContextMenu, contact is null, username = " + this.f288055h);
                return;
            }
            if (c01.z1.r().equals(n17.d1())) {
                return;
            }
            if (c01.e2.M(this.f288055h)) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = view.getContext();
                java.lang.String g27 = n17.g2();
                ((ke0.e) xVar).getClass();
                contextMenu.setHeaderTitle(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, g27));
                contextMenu.add(adapterContextMenuInfo.position, 2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571427eq);
                return;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z4(this.f288055h) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(this.f288055h)) {
                return;
            }
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = view.getContext();
            java.lang.String g28 = n17.g2();
            ((ke0.e) xVar2).getClass();
            contextMenu.setHeaderTitle(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, g28));
            if (!n17.r2() || n17.F0() == 1) {
                return;
            }
            contextMenu.add(adapterContextMenuInfo.position, 7, 0, com.p314xaae8f345.mm.R.C30867xcad56011.bf9);
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onDestroy */
        public void mo7504xac79a11b() {
            super.mo7504xac79a11b();
            c01.d9.e().q(138, this);
            gm0.j1.i();
            gm0.j1.n().f354821b.q(453, this);
            com.p314xaae8f345.mm.ui.p2690x38b72420.b8 b8Var = this.f288053f;
            if (b8Var != null) {
                b8Var.d(true);
                this.f288053f.getClass();
                this.f288053f.f290555i = null;
            }
            yk5.u uVar = this.f288054g;
            if (uVar != null) {
                bb5.g gVar = uVar.f544449z;
                if (gVar != null) {
                    gVar.a();
                    uVar.f544449z = null;
                }
                this.f288054g.c();
            }
            if (!gm0.j1.a() || this.f288053f == null) {
                return;
            }
            ((l75.a1) c01.d9.b().q()).e(this.f288053f);
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onPause */
        public void mo7512xb01dfb57() {
            super.mo7512xb01dfb57();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMAddressUI", "AddressUI on Pause");
            yk5.u uVar = this.f288054g;
            if (uVar != null) {
                c01.d9.e().q(106, uVar);
            }
            this.f288053f.E.b();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2690x38b72420.s7(this));
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onResume */
        public void mo7517x57429eec() {
            super.mo7517x57429eec();
            if (this.f288060p) {
                this.f288060p = false;
                this.f288059o = false;
                m0();
                this.f288052e.setAdapter((android.widget.ListAdapter) this.f288053f);
                this.f288052e.post(new com.p314xaae8f345.mm.ui.p2690x38b72420.p7(this));
                this.f288054g.y(false);
            } else if (this.f288059o) {
                this.f288059o = false;
                s75.d.c(new com.p314xaae8f345.mm.ui.p2690x38b72420.q7(this), "AddressUI_updateUIData", 4);
            }
            yk5.u uVar = this.f288054g;
            if (uVar != null) {
                c01.d9.e().a(106, uVar);
            }
            this.f288053f.f290558o = false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2690x38b72420.r7(this));
        }

        @Override // com.p314xaae8f345.mm.p944x882e457a.u0
        /* renamed from: onSceneEnd */
        public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
            if (m1Var.mo808xfb85f7b0() != 453) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.U0(mo7438x76847179())) {
                    com.p314xaae8f345.mm.ui.pc.a(mo7438x76847179(), i17, i18, str, 4);
                }
            } else if (i17 == 0 && i18 == 0 && !((r45.ik3) ((l41.z) m1Var).f397505e.f152244b.f152233a).f458642f.isEmpty()) {
                n0();
            }
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
        /* renamed from: supportNavigationSwipeBack */
        public boolean mo25471x430f73e() {
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c8k;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264 = mo7595x9cdc264();
        if (mo7595x9cdc264.m7664x6f4c869b(android.R.id.content) == null) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment openIMAddressUIFragment = new com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment();
            this.f288049d = openIMAddressUIFragment;
            openIMAddressUIFragment.mo7562xe26dab14(getIntent().getExtras());
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264.m7630xb2c12e75();
            m7630xb2c12e75.h(com.p314xaae8f345.mm.R.id.f566878hd4, this.f288049d, null, 1);
            m7630xb2c12e75.d();
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.OpenIMAddressUI)).Rj(this, iy1.a.WorkWxContacts);
    }
}
