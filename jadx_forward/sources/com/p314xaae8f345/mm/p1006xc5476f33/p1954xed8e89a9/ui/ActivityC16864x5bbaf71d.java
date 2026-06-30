package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 */
/* loaded from: classes11.dex */
public class ActivityC16864x5bbaf71d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f235292d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f235293e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f235294f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f235295g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f235296h;

    /* renamed from: v, reason: collision with root package name */
    public gr3.g f235307v;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235297i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235298m = false;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f235299n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f235300o = "";

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f235301p = null;

    /* renamed from: q, reason: collision with root package name */
    public boolean f235302q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f235303r = false;

    /* renamed from: s, reason: collision with root package name */
    public long f235304s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f235305t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f235306u = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f235308w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final long f235309x = java.lang.System.currentTimeMillis();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final int T6() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235301p;
        if (z3Var == null || z3Var.y2()) {
            if (this.f235301p != null) {
                return gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0) == 1 ? 6 : 5;
            }
            return 0;
        }
        boolean x27 = this.f235301p.x2();
        ?? r07 = x27;
        if (U6(this.f235300o, 5L)) {
            r07 = (x27 ? 1 : 0) | 2;
        }
        if (r07 == 0) {
            return 4;
        }
        return r07;
    }

    public final boolean U6(java.lang.String str, long j17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r2) p94.w0.f()).P0(str, 5L);
    }

    public void V6(boolean z17) {
        gr3.g gVar;
        if (this.f235301p == null || (gVar = this.f235307v) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPermissionUI2", "ct is null in method reportWithModifyOutsiderPermission");
            return;
        }
        gr3.j jVar = z17 ? gr3.j.f356416h : gr3.j.f356418m;
        gVar.getClass();
        gVar.f356397e = jVar;
        this.f235307v.f356398f = this.f235301p.y2();
        gr3.g gVar2 = this.f235307v;
        gVar2.f356399g = z17;
        gVar2.f356400h = U6(this.f235300o, 5L);
        this.f235307v.c();
    }

    public void W6(boolean z17) {
        gr3.g gVar;
        if (this.f235301p == null || (gVar = this.f235307v) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPermissionUI2", "ct is null in method reportWithModifySocialBlackPermission");
            return;
        }
        gr3.j jVar = z17 ? gr3.j.f356415g : gr3.j.f356414f;
        gVar.getClass();
        gVar.f356397e = jVar;
        gr3.g gVar2 = this.f235307v;
        gVar2.f356398f = z17;
        gVar2.f356399g = this.f235301p.x2();
        this.f235307v.f356400h = U6(this.f235300o, 5L);
        this.f235307v.c();
    }

    public final void X6() {
        android.content.res.Resources resources;
        int i17;
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f235300o, true);
        this.f235301p = n17;
        n17.X1(this.f235300o);
        this.f235294f.setVisibility(this.f235301p.y2() ? 0 : 8);
        this.f235295g.setVisibility(this.f235301p.y2() ? 8 : 0);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kds);
        int i18 = (this.f235297i && this.f235301p.y2()) ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f235296h.setVisibility(this.f235301p.y2() ? 0 : 8);
        boolean x27 = this.f235301p.x2();
        boolean U6 = U6(this.f235300o, 5L);
        this.f235292d.m81392x52cfa5c6(x27);
        int i19 = this.f235301p.I;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kdv);
        if (i19 == 1) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jdc);
        } else if (i19 == 2) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jdb);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567693ke4);
        if (i19 == 1) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j9h);
        } else if (i19 == 2) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j9g);
        }
        this.f235293e.m81392x52cfa5c6(U6);
        ((android.view.View) ((android.view.View) this.f235295g.getParent()).getParent()).setClickable(!this.f235298m);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568570na3);
        if (this.f235298m) {
            resources = getResources();
            i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk;
        } else {
            resources = getResources();
            i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.a0c;
        }
        textView3.setTextColor(resources.getColor(i17));
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f235300o) || !"3552365301".equals(this.f235301p.Q0())) {
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.kdr);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.nxt);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.kdq);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.kdr);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        setResult(-1, new android.content.Intent());
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c9e;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (this.f235301p != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f235300o) && "3552365301".equals(this.f235301p.Q0())) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.jdf);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hhq);
        }
        mo54448x9c8c0d33(new hr3.cc(this));
        this.f235294f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.nxq);
        this.f235295g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.n_y);
        this.f235292d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.kdq).findViewById(com.p314xaae8f345.mm.R.id.kdu);
        this.f235293e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.n6q).findViewById(com.p314xaae8f345.mm.R.id.f567692ke3);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nxr);
        this.f235296h = textView;
        if (textView instanceof android.widget.TextView) {
            textView.setText(bi4.v1.g() ? com.p314xaae8f345.mm.R.C30867xcad56011.hnd : com.p314xaae8f345.mm.R.C30867xcad56011.hnc);
        }
        ((android.view.View) this.f235294f.getParent()).setOnClickListener(new hr3.dc(this));
        ((android.view.View) ((android.view.View) this.f235295g.getParent()).getParent()).setOnClickListener(new hr3.ec(this));
        this.f235292d.m81396xb3e0a10a(new hr3.fc(this));
        this.f235293e.m81396xb3e0a10a(new hr3.gc(this));
        findViewById(com.p314xaae8f345.mm.R.id.jrr).setOnClickListener(new hr3.hc(this));
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMSocialBlackListFlag", 1) == 1;
        this.f235297i = z17;
        if (!z17) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.nxt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        X6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(291, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x.f34658x366c91de, this);
        this.f235300o = getIntent().getStringExtra("sns_permission_userName");
        this.f235304s = getIntent().getLongExtra("sns_permission_snsinfo_svr_id", 0L);
        this.f235305t = getIntent().getIntExtra("sns_permission_block_scene", 0);
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f235300o, true);
        this.f235301p = n17;
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsPermissionUI2", "the error cause by get contact by %s", this.f235300o);
            finish();
        }
        this.f235301p.X1(this.f235300o);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5620x496bfda4 c5620x496bfda4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5620x496bfda4();
        c5620x496bfda4.f135946g.f89065a = 1;
        c5620x496bfda4.e();
        this.f235308w = T6();
        if (this.f235301p == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPermissionUI2", "ct is null in method initProfilePermissionModifyReport");
        } else {
            this.f235306u = getIntent().getIntExtra("entry_50321_path", 0);
            gr3.g gVar = new gr3.g();
            this.f235307v = gVar;
            java.lang.String str = this.f235300o;
            gVar.f356395c = str;
            gVar.f356394b = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) ? 2 : 1;
            this.f235307v.f356396d = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.wi(getIntent());
            this.f235307v.f356393a = this.f235306u;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(getIntent(), 19, 1, this.f235300o);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f354821b.q(291, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x.f34658x366c91de, this);
        long j17 = this.f235304s;
        if (j17 != 0 && j17 != -1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6060x149206d c6060x149206d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6060x149206d();
            boolean z17 = this.f235303r;
            am.rv rvVar = c6060x149206d.f136342g;
            rvVar.f89380a = z17;
            rvVar.f89381b = this.f235304s;
            c6060x149206d.e();
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        int T6 = T6();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6901xd73fd110 c6901xd73fd110 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6901xd73fd110();
        c6901xd73fd110.f142215d = c6901xd73fd110.b("Username", this.f235300o, true);
        c6901xd73fd110.f142216e = c6901xd73fd110.b("PublishId", ca4.z0.t0(this.f235304s), true);
        c6901xd73fd110.f142217f = this.f235308w;
        c6901xd73fd110.f142218g = T6;
        c6901xd73fd110.f142219h = this.f235305t;
        c6901xd73fd110.f142220i = (int) (java.lang.System.currentTimeMillis() - this.f235309x);
        c6901xd73fd110.k();
        android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gr3.g gVar = this.f235307v;
        if (gVar != null) {
            gVar.b();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPermissionUI2", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.mo808xfb85f7b0());
        if (m1Var.mo808xfb85f7b0() == 291) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f235299n;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f235299n = null;
            }
            X6();
            if (this.f235302q) {
                this.f235303r = true;
            }
        }
        if (m1Var.mo808xfb85f7b0() != 681 || !(m1Var instanceof e21.j)) {
            return;
        }
        e21.j jVar = (e21.j) m1Var;
        java.util.List list = jVar.f328071f;
        r45.i25 i25Var = jVar.f328070e.f328054b.f328061a;
        int i19 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (i19 >= arrayList.size()) {
                return;
            }
            if (((xg3.q0) arrayList.get(i19)).b() == 72) {
                r45.j25 j25Var = i25Var.f458221e;
                if (j25Var != null && ((java.lang.Integer) j25Var.f459051e.get(i19)).intValue() == -3400) {
                    this.f235298m = true;
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 1);
                    this.f235301p.i3();
                    c01.e2.j0(this.f235301p);
                    java.lang.String str2 = ((r45.g25) i25Var.f458221e.f459052f.get(i19)).f456374d;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nxr)).getText().toString();
                    } else {
                        this.f235296h.setText(str2);
                    }
                    X6();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
                    u1Var.g(((r45.g25) i25Var.f458221e.f459052f.get(i19)).f456374d);
                    u1Var.a(true);
                    u1Var.j(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hmr));
                    u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.hms);
                    u1Var.b(new hr3.ic(this));
                    u1Var.q(false);
                    return;
                }
                r45.j25 j25Var2 = i25Var.f458221e;
                if (j25Var2 != null && ((java.lang.Integer) j25Var2.f459051e.get(i19)).intValue() == 0 && !this.f235301p.y2()) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0);
                }
            }
            i19++;
        }
    }
}
