package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4;

/* renamed from: com.tencent.mm.plugin.game.media.GamePublishGalleryUI */
/* loaded from: classes8.dex */
public class ActivityC15909x288b5949 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15915x658d1c57 f221588d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15915x658d1c57 f221589e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f221590f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de f221591g;

    /* renamed from: h, reason: collision with root package name */
    public i53.a2 f221592h;

    /* renamed from: i, reason: collision with root package name */
    public int f221593i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    public final void T6() {
        int i17;
        android.view.View view;
        ?? r27;
        android.widget.TextView textView;
        mo78514x143f1b92().W0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15915x658d1c57 c15915x658d1c57 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15915x658d1c57) findViewById(com.p314xaae8f345.mm.R.id.gnq);
        this.f221588d = c15915x658d1c57;
        c15915x658d1c57.setOnClickListener(new i53.l1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15915x658d1c57 c15915x658d1c572 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15915x658d1c57) findViewById(com.p314xaae8f345.mm.R.id.gn7);
        this.f221589e = c15915x658d1c572;
        c15915x658d1c572.setOnClickListener(new i53.m1(this));
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.glb)).setOnClickListener(new i53.n1(this));
        this.f221590f = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById(com.p314xaae8f345.mm.R.id.gpk);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int intExtra = getIntent().getIntExtra("query_media_type", 3);
        boolean booleanExtra = getIntent().getBooleanExtra("game_haowan_force_select", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("game_straight_to_publish", false);
        this.f221593i = getIntent().getIntExtra("game_haowan_source_scene_id", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15907x7848dd50 c15907x7848dd50 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15907x7848dd50();
        int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i53.t.b("game_haowan_mmkv_key")).getInt("game_last_choose_gallery", 0);
        if (intExtra == 1) {
            c15907x7848dd50.f221576d = new android.widget.FrameLayout(this);
            i17 = 1;
        } else {
            int intExtra2 = getIntent().getIntExtra("game_media_default_type", 0);
            if (intExtra2 == 1 || intExtra2 == 2) {
                i18 = intExtra2;
            }
            i17 = (i18 != 1 && i18 == 2) ? 1 : 0;
            this.f221592h = new i53.a2(this);
            getIntent().getBooleanExtra("game_haowan_ignore_video_preview", true);
            i53.a2 a2Var = this.f221592h;
            int i19 = this.f221593i;
            a2Var.f370040r = booleanExtra;
            if (booleanExtra && (view = a2Var.f370036n) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "setConfig", "(ZZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "setConfig", "(ZZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            a2Var.f370041s = booleanExtra2;
            a2Var.f370042t = i19;
            java.lang.String stringExtra = getIntent().getStringExtra("game_haowan_local_albums_info");
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                try {
                    jSONArray = new org.json.JSONArray(stringExtra);
                } catch (org.json.JSONException unused) {
                }
            }
            if (jSONArray.length() == 0) {
                jSONArray = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.d();
            }
            this.f221592h.m134736x2d938d5f(jSONArray);
            this.f221592h.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            c15907x7848dd50.f221576d = this.f221592h;
        }
        arrayList.add(c15907x7848dd50);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15907x7848dd50 c15907x7848dd502 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15907x7848dd50();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de c15908x78af54de = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de(this);
        this.f221591g = c15908x78af54de;
        int i27 = this.f221593i;
        c15908x78af54de.f221584m = booleanExtra;
        if (booleanExtra && (textView = c15908x78af54de.f221580f) != null) {
            textView.setVisibility(8);
        }
        c15908x78af54de.f221585n = booleanExtra2;
        c15908x78af54de.f221586o = i27;
        this.f221591g.m64613xf00ea9e0(intExtra);
        this.f221591g.m64614xf58734b2(getIntent().getIntExtra("max_select_count", 9));
        c15907x7848dd502.f221576d = this.f221591g;
        arrayList.add(c15907x7848dd502);
        this.f221590f.m8315x6cab2c8d(new i53.w0(mo7595x9cdc264(), arrayList));
        this.f221590f.m8289xa5a25773(new i53.o1(this));
        g53.i iVar = g53.i.f350445a;
        if (g53.i.b() != 4) {
            r27 = 1;
        } else {
            r27 = 1;
            if (i17 % 2 != 1) {
                this.f221588d.setSelected(true);
                this.f221589e.setSelected(false);
                U6(i17, false);
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8767, 0, 1, 87, nj0.a.c(new java.util.HashMap()));
            }
        }
        this.f221588d.setSelected(false);
        this.f221589e.setSelected(r27);
        U6(r27, false);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8767, 0, 1, 87, nj0.a.c(new java.util.HashMap()));
    }

    public void U6(int i17, boolean z17) {
        i53.a2 a2Var;
        int i18 = i17 % 2;
        if (i18 != 0 || (a2Var = this.f221592h) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de c15908x78af54de = this.f221591g;
            if (!c15908x78af54de.f221583i) {
                c15908x78af54de.c(0, 1, null);
            }
            c15908x78af54de.f221583i = true;
            i53.a2 a2Var2 = this.f221592h;
            if (a2Var2 != null) {
                a2Var2.f370038p.dismiss();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = a2Var2.f370044v;
                if (b4Var != null) {
                    b4Var.d();
                }
            }
        } else {
            if (!a2Var.f370039q) {
                a2Var.f(0, 1, new java.util.HashMap());
            }
            a2Var.f370039q = true;
            this.f221592h.d();
        }
        this.f221590f.m8316x940d026a(i17);
        if (z17) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, i18 == 0 ? 8762 : 8767, 0, 1, this.f221593i, lj0.a.a(7, new java.util.HashMap()));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bgb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: noActionBar */
    public boolean mo44293x69604d3c() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0195 A[RETURN] */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r22, int r23, android.content.Intent r24) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15909x288b5949.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(android.os.Build.VERSION.SDK_INT < 33 ? com.p314xaae8f345.mm.R.C30867xcad56011.fm9 : com.p314xaae8f345.mm.R.C30867xcad56011.msl))) {
            T6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        mo2550x7c2abd06(10);
        mo2550x7c2abd06(1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15915x658d1c57 c15915x658d1c57 = this.f221588d;
        if (c15915x658d1c57 == null || !c15915x658d1c57.isSelected()) {
            i53.t.g(2);
        } else {
            i53.t.g(1);
        }
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de c15908x78af54de = this.f221591g;
        if (c15908x78af54de != null) {
            c15908x78af54de.getClass();
            ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
            t23.p0.k().f(c15908x78af54de);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        qp1.h0.b();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePublishGalleryUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePublishGalleryUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 145) {
            return;
        }
        if (iArr[0] == 0) {
            T6();
        } else {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fot), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.fic), false, new i53.p1(this), new i53.q1(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        qp1.h0.a(true, true, true);
    }
}
