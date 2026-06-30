package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.PermissionSettingUI */
/* loaded from: classes11.dex */
public class ActivityC16863xc0e4ffb5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f235275d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f235276e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f235277f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f235278g;

    /* renamed from: u, reason: collision with root package name */
    public gr3.g f235289u;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235279h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235280i = false;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f235281m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f235282n = "";

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f235283o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f235284p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f235285q = false;

    /* renamed from: r, reason: collision with root package name */
    public long f235286r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f235287s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f235288t = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f235290v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final long f235291w = java.lang.System.currentTimeMillis();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final int T6() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235283o;
        if (z3Var == null || z3Var.y2()) {
            if (this.f235283o != null) {
                return gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0) == 1 ? 6 : 5;
            }
            return 0;
        }
        boolean x27 = this.f235283o.x2();
        ?? r07 = x27;
        if (U6(this.f235282n, 5L)) {
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
        if (this.f235283o == null || (gVar = this.f235289u) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPermissionUI", "ct is null in method reportWithModifyOutsiderPermission");
            return;
        }
        gr3.j jVar = z17 ? gr3.j.f356416h : gr3.j.f356418m;
        gVar.getClass();
        gVar.f356397e = jVar;
        this.f235289u.f356398f = this.f235283o.y2();
        gr3.g gVar2 = this.f235289u;
        gVar2.f356399g = z17;
        gVar2.f356400h = U6(this.f235282n, 5L);
        this.f235289u.c();
    }

    public void W6() {
        android.content.res.Resources resources;
        int i17;
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f235282n, true);
        this.f235283o = n17;
        n17.X1(this.f235282n);
        this.f235277f.setVisibility(this.f235283o.y2() ? 0 : 8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f235278g;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(this.f235283o.y2() ? 8 : 0);
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kds);
        int i18 = (this.f235279h && this.f235283o.y2()) ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.kdt);
        if (findViewById2 instanceof android.widget.TextView) {
            ((android.widget.TextView) findViewById2).setText(bi4.v1.g() ? com.p314xaae8f345.mm.R.C30867xcad56011.hna : com.p314xaae8f345.mm.R.C30867xcad56011.hn9);
        }
        boolean x27 = this.f235283o.x2();
        boolean U6 = U6(this.f235282n, 5L);
        this.f235275d.m81392x52cfa5c6(x27);
        int i19 = this.f235283o.I;
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
        this.f235276e.m81392x52cfa5c6(U6);
        ((android.view.View) ((android.view.View) this.f235278g.getParent()).getParent()).setClickable(!this.f235280i);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568570na3);
        if (this.f235280i) {
            resources = getResources();
            i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk;
        } else {
            resources = getResources();
            i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.a0c;
        }
        textView3.setTextColor(resources.getColor(i17));
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.nxr);
        int i27 = this.f235283o.y2() ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (findViewById3 instanceof android.widget.TextView) {
            ((android.widget.TextView) findViewById3).setText(bi4.v1.g() ? com.p314xaae8f345.mm.R.C30867xcad56011.hnd : com.p314xaae8f345.mm.R.C30867xcad56011.hnc);
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f235282n) || !"3552365301".equals(this.f235283o.Q0())) {
            android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.kdr);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.nxt);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById5, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.kdq);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById6, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById6, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.kdr);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById7, arrayList6.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById7, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c9d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.HashSet hashSet = new java.util.HashSet(super.mo43419xa59964ef());
        hashSet.add(ir3.e.class);
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (this.f235283o != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f235282n) && "3552365301".equals(this.f235283o.Q0())) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.jdf);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hhq);
        }
        mo54448x9c8c0d33(new hr3.wb(this));
        this.f235277f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.nxq);
        this.f235278g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.n_y);
        this.f235275d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.kdq).findViewById(com.p314xaae8f345.mm.R.id.kdu);
        this.f235276e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.n6q).findViewById(com.p314xaae8f345.mm.R.id.f567692ke3);
        ((android.view.View) this.f235277f.getParent()).setOnClickListener(new hr3.xb(this));
        ((android.view.View) ((android.view.View) this.f235278g.getParent()).getParent()).setOnClickListener(new hr3.yb(this));
        boolean booleanExtra = getIntent().getBooleanExtra("INTENT_SOURCE_FROM_PROFILE_MENU", false);
        this.f235275d.m81396xb3e0a10a(new hr3.zb(this, booleanExtra));
        this.f235276e.m81396xb3e0a10a(new hr3.ac(this, booleanExtra));
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMSocialBlackListFlag", 1) == 1;
        this.f235279h = z17;
        if (!z17) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.nxt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        W6();
        ((ir3.e) pf5.z.f435481a.a(this).a(ir3.e.class)).m42291x53d8522f("not_allow_see_sns_permission_cb_key", !this.f235275d.f292896x ? getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8m) : getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8l));
        ((ir3.e) pf5.z.f435481a.a(this).a(ir3.e.class)).m42291x53d8522f("not_see_sns_permission_tv_key", !this.f235276e.f292896x ? getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8m) : getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8l));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(291, this);
        this.f235282n = getIntent().getStringExtra("sns_permission_userName");
        this.f235286r = getIntent().getLongExtra("sns_permission_snsinfo_svr_id", 0L);
        this.f235287s = getIntent().getIntExtra("sns_permission_block_scene", 0);
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f235282n, true);
        this.f235283o = n17;
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsPermissionUI", "the error cause by get contact by %s", this.f235282n);
            finish();
            return;
        }
        n17.X1(this.f235282n);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5620x496bfda4 c5620x496bfda4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5620x496bfda4();
        c5620x496bfda4.f135946g.f89065a = 1;
        c5620x496bfda4.e();
        this.f235290v = T6();
        if (this.f235283o == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPermissionUI", "ct is null in method initProfilePermissionModifyReport");
        } else {
            this.f235288t = getIntent().getIntExtra("entry_50321_path", 0);
            gr3.g gVar = new gr3.g();
            this.f235289u = gVar;
            java.lang.String str = this.f235282n;
            gVar.f356395c = str;
            gVar.f356394b = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) ? 2 : 1;
            this.f235289u.f356396d = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.wi(getIntent());
            this.f235289u.f356393a = this.f235288t;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(getIntent(), 19, 1, this.f235282n);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f354821b.q(291, this);
        long j17 = this.f235286r;
        if (j17 != 0 && j17 != -1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6060x149206d c6060x149206d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6060x149206d();
            boolean z17 = this.f235285q;
            am.rv rvVar = c6060x149206d.f136342g;
            rvVar.f89380a = z17;
            rvVar.f89381b = this.f235286r;
            c6060x149206d.e();
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        int T6 = T6();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6901xd73fd110 c6901xd73fd110 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6901xd73fd110();
        c6901xd73fd110.f142215d = c6901xd73fd110.b("Username", this.f235282n, true);
        c6901xd73fd110.f142216e = c6901xd73fd110.b("PublishId", ca4.z0.t0(this.f235286r), true);
        c6901xd73fd110.f142217f = this.f235290v;
        c6901xd73fd110.f142218g = T6;
        c6901xd73fd110.f142219h = this.f235287s;
        c6901xd73fd110.f142220i = (int) (java.lang.System.currentTimeMillis() - this.f235291w);
        c6901xd73fd110.k();
        android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gr3.g gVar = this.f235289u;
        if (gVar != null) {
            gVar.b();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPermissionUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.mo808xfb85f7b0());
        if (m1Var.mo808xfb85f7b0() == 291) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f235281m;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f235281m = null;
            }
            W6();
            ai4.m0.f86706a.P(this.f235282n);
            if (this.f235284p) {
                this.f235285q = true;
            }
        }
        if (m1Var.mo808xfb85f7b0() == 681 && (m1Var instanceof e21.j)) {
            e21.j jVar = (e21.j) m1Var;
            java.util.List list = jVar.f328071f;
            r45.i25 i25Var = jVar.f328070e.f328054b.f328061a;
            int i19 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (i19 >= arrayList.size()) {
                    break;
                }
                if (((xg3.q0) arrayList.get(i19)).b() == 72) {
                    r45.j25 j25Var = i25Var.f458221e;
                    if (j25Var == null || ((java.lang.Integer) j25Var.f459051e.get(i19)).intValue() != -3400) {
                        r45.j25 j25Var2 = i25Var.f458221e;
                        if (j25Var2 != null && ((java.lang.Integer) j25Var2.f459051e.get(i19)).intValue() == 0 && !this.f235283o.y2()) {
                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0);
                        }
                    } else {
                        this.f235280i = true;
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 1);
                        this.f235283o.i3();
                        c01.e2.j0(this.f235283o);
                        java.lang.String str2 = ((r45.g25) i25Var.f458221e.f459052f.get(i19)).f456374d;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nxr)).getText().toString();
                        } else {
                            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nxr)).setText(str2);
                        }
                        W6();
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
                        u1Var.g(((r45.g25) i25Var.f458221e.f459052f.get(i19)).f456374d);
                        u1Var.a(true);
                        u1Var.j(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hmr));
                        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.hms);
                        u1Var.b(new hr3.bc(this));
                        u1Var.q(false);
                    }
                }
                i19++;
            }
            ai4.m0.f86706a.P(this.f235282n);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(bs3.h.class);
    }
}
