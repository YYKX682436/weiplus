package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.ChatroomContactUI */
/* loaded from: classes11.dex */
public class ActivityC22292xa218e7a1 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, l75.q0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f287871u = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f287872d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 f287873e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 f287874f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f287875g;

    /* renamed from: h, reason: collision with root package name */
    public a31.v f287876h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f287877i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.s0 f287878m;

    /* renamed from: n, reason: collision with root package name */
    public yk5.u f287879n;

    /* renamed from: o, reason: collision with root package name */
    public rl5.r f287880o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f287881p;

    /* renamed from: q, reason: collision with root package name */
    public int f287882q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f287883r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final db5.t4 f287884s = new com.p314xaae8f345.mm.ui.p2690x38b72420.y0(this);

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.b0 f287885t = new com.p314xaae8f345.mm.p2470x93e71c27.ui.b0(new com.p314xaae8f345.mm.ui.p2690x38b72420.z0(this));

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569931s8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dg6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/ui/contact/ChatroomContactUI", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f564268mf);
        this.f287872d = listView;
        listView.setAdapter((android.widget.ListAdapter) null);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dg6);
        this.f287877i = textView2;
        textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571431eu);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f568903og0);
        this.f287875g = findViewById;
        findViewById.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.a1(this));
        com.p314xaae8f345.mm.ui.p2690x38b72420.s0 s0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.s0(this, "@all.chatroom.contact");
        this.f287878m = s0Var;
        s0Var.r(true);
        yk5.u uVar = new yk5.u(mo55332x76847179(), 1);
        this.f287879n = uVar;
        uVar.f544440q = "@all.chatroom.contact";
        a31.v vVar = new a31.v(true, true);
        this.f287876h = vVar;
        com.p314xaae8f345.mm.ui.p2690x38b72420.b1 b1Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.b1(this);
        vVar.f82532u = b1Var;
        vVar.f291857i = b1Var;
        m78489xd6d59aa8(true, vVar);
        this.f287878m.getClass();
        this.f287878m.getClass();
        this.f287878m.getClass();
        android.widget.ListView listView2 = this.f287872d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b0 b0Var = this.f287885t;
        listView2.setOnScrollListener(b0Var);
        this.f287878m.f288700s = b0Var;
        this.f287880o = new rl5.r(mo55332x76847179());
        this.f287872d.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.c1(this));
        this.f287872d.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.d1(this));
        this.f287872d.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.t0(this));
        android.widget.ListView listView3 = this.f287872d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 c22293x1808c434 = new com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434(this);
        this.f287873e = c22293x1808c434;
        listView3.addFooterView(c22293x1808c434, null, false);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2690x38b72420.u0(this));
        m78597x53c22598(new com.p314xaae8f345.mm.ui.p2690x38b72420.v0(this));
        this.f287872d.setAdapter((android.widget.ListAdapter) this.f287878m);
        this.f287879n.y(false);
        this.f287872d.setVisibility(0);
        this.f287874f = new com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924(this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(14);
        this.f287874f.setLayoutParams(layoutParams);
        this.f287874f.m48306x43115121(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(this, 100.0f));
        this.f287874f.setVisibility(8);
        ((android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.p7i)).addView(this.f287874f);
        com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 c11154x38c1a924 = this.f287874f;
        if (c11154x38c1a924 != null) {
            c11154x38c1a924.m48305xa0eada35(new com.p314xaae8f345.mm.ui.p2690x38b72420.x0(this));
        }
        if (this.f287878m.getCount() == 0) {
            this.f287877i.setSingleLine(false);
            this.f287877i.setPadding(40, 0, 40, 0);
            this.f287877i.setVisibility(0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571398dw);
        mo43517x10010bd5();
        c01.d9.e().a(138, this);
        ((l75.a1) c01.d9.b().q()).a(this.f287878m);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChatroomContactUI)).Rj(this, iy1.a.GroupChatList);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f287881p, true) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomContactUI", "onCreateContextMenu, contact is null, username = " + this.f287881p);
        } else if (c01.e2.M(this.f287881p)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = view.getContext();
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.f287881p;
            ((sg3.a) v0Var).getClass();
            java.lang.String e17 = c01.a2.e(str);
            ((ke0.e) xVar).getClass();
            contextMenu.setHeaderTitle(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, e17));
            contextMenu.add(adapterContextMenuInfo.position, 1, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571427eq);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(138, this);
        ((l75.a1) c01.d9.b().q()).e(this.f287878m);
        com.p314xaae8f345.mm.ui.p2690x38b72420.s0 s0Var = this.f287878m;
        bb5.g gVar = s0Var.f288698q;
        if (gVar != null) {
            gVar.a();
            s0Var.f288698q = null;
        }
        this.f287878m.c();
        this.f287878m.f294144h = null;
        yk5.u uVar = this.f287879n;
        bb5.g gVar2 = uVar.f544449z;
        if (gVar2 != null) {
            gVar2.a();
            uVar.f544449z = null;
        }
        this.f287879n.c();
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 c22293x1808c434 = this.f287873e;
        if (c22293x1808c434 != null) {
            c22293x1808c434.m80404x72abd1b8(2);
            this.f287873e.a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        c01.d9.b().l().mo49775xc84af884(this);
        a31.v vVar = this.f287876h;
        if (vVar != null) {
            vVar.b();
            vVar.s();
        }
        yk5.u uVar = this.f287879n;
        if (uVar != null) {
            c01.d9.e().q(106, uVar);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 c22293x1808c434 = this.f287873e;
        if (c22293x1808c434 != null) {
            c22293x1808c434.m80404x72abd1b8(2);
            this.f287873e.a();
        }
        c01.d9.b().l().add(this);
        if (this.f287876h != null && this.f287874f != null) {
            if (u11.c.i() || !com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_CN")) {
                this.f287876h.f82529r = false;
            } else {
                a31.v vVar = this.f287876h;
                vVar.f82529r = false;
                vVar.f82533v = this.f287874f;
                vVar.f82531t = 1;
                vVar.f82530s = 2;
            }
        }
        yk5.u uVar = this.f287879n;
        if (uVar != null) {
            c01.d9.e().a(106, uVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.U0(this) && !com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str, 4) && i17 == 0 && i18 == 0 && m1Var.mo808xfb85f7b0() == 138) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.s0 s0Var = this.f287878m;
            if (s0Var != null) {
                s0Var.f();
            }
            yk5.u uVar = this.f287879n;
            if (uVar != null) {
                uVar.f();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(la5.n.class);
    }
}
