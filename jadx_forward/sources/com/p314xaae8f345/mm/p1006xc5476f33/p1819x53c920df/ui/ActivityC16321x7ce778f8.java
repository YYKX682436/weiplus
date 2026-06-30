package com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui;

/* renamed from: com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI */
/* loaded from: classes12.dex */
public class ActivityC16321x7ce778f8 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f226503y = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f226504d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f226505e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f226506f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f226507g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f226508h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f226509i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f226510m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f226511n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f226512o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f226513p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ProgressBar f226514q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f226515r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f226516s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f226517t = false;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f226518u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f226519v;

    /* renamed from: w, reason: collision with root package name */
    public int f226520w;

    /* renamed from: x, reason: collision with root package name */
    public final x51.c1 f226521x;

    public ActivityC16321x7ce778f8() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f226518u = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e>(a0Var) { // from class: com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI.8
            {
                this.f39173x3fe91575 = 1684674094;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e c6268x26920e3e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e c6268x26920e3e2 = c6268x26920e3e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginAsExDeviceUI", "WebViewExWindowCloseEvent callback : %s", c6268x26920e3e2.f136517g.f88753a);
                if (c6268x26920e3e2.f136517g.f88753a.equals("continue_check")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginAsExDeviceUI", "continue check");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.ActivityC16321x7ce778f8 activityC16321x7ce778f8 = com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.ActivityC16321x7ce778f8.this;
                    activityC16321x7ce778f8.f226517t = false;
                    activityC16321x7ce778f8.T6();
                }
                return false;
            }
        };
        this.f226519v = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6272x44a4fad>(a0Var) { // from class: com.tencent.mm.plugin.login_exdevice.ui.LoginAsExDeviceUI.9
            {
                this.f39173x3fe91575 = -1681666147;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6272x44a4fad c6272x44a4fad) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.ActivityC16321x7ce778f8 activityC16321x7ce778f8 = com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.ActivityC16321x7ce778f8.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginAsExDeviceUI", "WebViewUIDestroyEventEventListener!! %s", java.lang.Boolean.valueOf(activityC16321x7ce778f8.f226517t));
                if (activityC16321x7ce778f8.f226517t) {
                    activityC16321x7ce778f8.f226517t = false;
                    android.view.View view = activityC16321x7ce778f8.f226507g;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$9", "callback", "(Lcom/tencent/mm/autogen/events/WebViewUIDestroyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$9", "callback", "(Lcom/tencent/mm/autogen/events/WebViewUIDestroyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = activityC16321x7ce778f8.f226509i;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$9", "callback", "(Lcom/tencent/mm/autogen/events/WebViewUIDestroyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$9", "callback", "(Lcom/tencent/mm/autogen/events/WebViewUIDestroyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = activityC16321x7ce778f8.f226508h;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$9", "callback", "(Lcom/tencent/mm/autogen/events/WebViewUIDestroyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/login_exdevice/ui/LoginAsExDeviceUI$9", "callback", "(Lcom/tencent/mm/autogen/events/WebViewUIDestroyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    activityC16321x7ce778f8.V6(0L);
                }
                return false;
            }
        };
        this.f226520w = 200;
        this.f226521x = new x51.c1();
    }

    public final void T6() {
        long j17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginAsExDeviceUI", "doCheckLogin %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.a(this);
        int i17 = this.f226520w;
        if (i17 > 2000) {
            j17 = 2000;
        } else {
            int i18 = i17 + 200;
            this.f226520w = i18;
            j17 = i18;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(aVar, j17);
    }

    public final void U6() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f226515r) && this.f226516s != null) {
            this.f226506f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ghs);
            android.widget.ImageView imageView = this.f226505e;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        this.f226506f.setVisibility(0);
        android.widget.ImageView imageView2 = this.f226505e;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        this.f226506f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gha);
        this.f226506f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.b(this));
    }

    public final void V6(long j17) {
        this.f226512o.setVisibility(8);
        this.f226504d.setVisibility(8);
        this.f226514q.setVisibility(0);
        android.widget.ImageView imageView = this.f226505e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.g(this), j17);
    }

    public final void W6() {
        this.f226515r = null;
        this.f226516s = null;
        this.f226504d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.byz);
        this.f226504d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.h(this));
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        int i17 = getResources().getConfiguration().orientation;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return i17 == 2 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.bsw : com.p314xaae8f345.mm.R.C30864xbddafb2a.bsv;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ipc);
        this.f226507g = findViewById;
        this.f226504d = (android.widget.ImageView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.ioi);
        this.f226514q = (android.widget.ProgressBar) this.f226507g.findViewById(com.p314xaae8f345.mm.R.id.uvs);
        this.f226506f = (android.widget.Button) this.f226507g.findViewById(com.p314xaae8f345.mm.R.id.ioh);
        this.f226505e = (android.widget.ImageView) this.f226507g.findViewById(com.p314xaae8f345.mm.R.id.lfh);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f567237ip5);
        this.f226508h = findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.ioe);
        this.f226509i = findViewById3;
        this.f226510m = (android.widget.ImageView) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.ioy);
        this.f226511n = (android.widget.TextView) this.f226509i.findViewById(com.p314xaae8f345.mm.R.id.ioz);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.b5o);
        this.f226512o = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.e(this));
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.f(this), com.p314xaae8f345.mm.R.raw.f78350xe9269a14);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(null, null, null, null)) {
            throw null;
        }
        V6(0L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.app.w7.b(0);
        mo43517x10010bd5();
        this.f226518u.mo48813x58998cd();
        this.f226519v.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f226518u.mo48814x2efc64();
        this.f226519v.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        com.p314xaae8f345.mm.app.w7.b(-1);
        finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559363co);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f226521x.c(this, i17, strArr, iArr);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(502, this);
        gm0.j1.d().a(503, this);
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
        gm0.j1.d().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1068x4ea0be4c.c.f33883x366c91de, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04ab  */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r32, int r33, java.lang.String r34, com.p314xaae8f345.mm.p944x882e457a.m1 r35) {
        /*
            Method dump skipped, instructions count: 1608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1819x53c920df.ui.ActivityC16321x7ce778f8.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        gm0.j1.d().q(502, this);
        gm0.j1.d().q(503, this);
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1068x4ea0be4c.c.f33883x366c91de, this);
        super.onStop();
    }
}
