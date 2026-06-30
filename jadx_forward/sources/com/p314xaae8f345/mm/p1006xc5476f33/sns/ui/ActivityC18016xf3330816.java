package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@db5.a(m123858x6ac9171 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m9.f34451x366c91de)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsBrowseUI */
/* loaded from: classes4.dex */
public class ActivityC18016xf3330816 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d {
    public static final /* synthetic */ int Q1 = 0;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s4 A1;
    public android.os.Bundle D1;
    public android.content.Intent G1;
    public java.lang.String S;
    public java.lang.String T;

    /* renamed from: p0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b4 f248360p0;

    /* renamed from: x0, reason: collision with root package name */
    public int f248362x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.ImageView f248363x1;

    /* renamed from: y0, reason: collision with root package name */
    public int f248364y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.graphics.Rect f248365y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View f248366z1;
    public int U = 0;
    public int V = 0;
    public boolean W = false;
    public boolean X = false;
    public boolean Y = false;
    public boolean Z = false;

    /* renamed from: l1, reason: collision with root package name */
    public int f248359l1 = 0;

    /* renamed from: p1, reason: collision with root package name */
    public int f248361p1 = 0;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 B1 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
    public int C1 = 0;
    public int E1 = 0;
    public boolean F1 = false;
    public boolean H1 = false;
    public long I1 = 0;
    public boolean J1 = false;
    public boolean K1 = false;
    public float L1 = 1.0f;
    public int M1 = 0;
    public int N1 = 0;
    public boolean O1 = false;
    public final com.p314xaae8f345.mm.p944x882e457a.u0 P1 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ef(this);

    public static /* synthetic */ float r7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 activityC18016xf3330816) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1600", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        float f17 = activityC18016xf3330816.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1600", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return f17;
    }

    public static /* synthetic */ int s7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 activityC18016xf3330816) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        int i17 = activityC18016xf3330816.f248361p1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return i17;
    }

    public static void w7(android.content.Context context, android.content.Intent intent, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startActivity", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepare", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816.class);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepare", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).overridePendingTransition(0, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startActivity", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d
    public int d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return 3;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            return dispatchKeyEvent;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 c17262x2289077 = this.f248349u;
        if (c17262x2289077 != null && c17262x2289077.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f248343o;
            this.f248349u.d(c18064xe6e1a3b3 != null ? c18064xe6e1a3b3.H.longValue() : 0L, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            return true;
        }
        this.G1 = new android.content.Intent();
        X6();
        v7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d
    public int e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return 3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finish", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (this.I1 != 0 && !this.J1) {
            if (this.G1 == null) {
                this.G1 = new android.content.Intent();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPopMediasUI", "finish: set access back");
            this.G1.putExtra("result_forbid_access", this.H1);
            this.G1.putExtra("result_access_sns_id", this.I1);
        }
        android.content.Intent intent = this.G1;
        if (intent != null) {
            setResult(-1, intent);
        }
        super.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finish", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d
    public boolean g7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03d8  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPopMediasUI", "onActivityResult requestCode:" + i17);
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPopMediasUI", "onCreate: ");
        com.p314xaae8f345.mm.ui.bk.u0(this);
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(210, this.P1);
        this.H1 = getIntent().getBooleanExtra("k_forbid_access", false);
        this.I1 = getIntent().getLongExtra("k_feedid_need_check_forbid_access", 0L);
        t7();
        m78531x8f8cf1fb();
        com.p314xaae8f345.mm.ui.bk.u0(this);
        getIntent().setExtrasClassLoader(getClass().getClassLoader());
        getWindow().setFlags(134218752, 134218752);
        getWindow().addFlags(67108864);
        if (com.p314xaae8f345.mm.ui.b4.c(this) && m78732xefeb73a5()) {
            int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            mo64405x4dab7448(color);
            mo78578x8b18f126(color);
        }
        m78568xd7114f24();
        mo43517x10010bd5();
        this.D1 = bundle;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0254  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816.onDestroy():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f248343o;
        if (c18064xe6e1a3b3 != null) {
            c18064xe6e1a3b3.b0();
        }
        super.onPause();
        if (this.O1) {
            this.O1 = false;
            u7(2);
        }
        qp1.h0.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f248343o;
        if (c18064xe6e1a3b3 != null) {
            c18064xe6e1a3b3.c0(false);
        }
        qp1.h0.a(true, true, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        android.os.Bundle bundle = this.D1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (this.Z) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        } else {
            this.Z = true;
            android.graphics.Rect rect = (android.graphics.Rect) getIntent().getParcelableExtra("sns_gallery_thumb_location");
            this.f248365y1 = rect;
            if (rect == null) {
                this.f248365y1 = new android.graphics.Rect();
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.A1;
            android.graphics.Rect rect2 = this.f248365y1;
            s4Var.e(rect2.left, rect2.top, rect2.width(), this.f248365y1.height());
            if (bundle == null) {
                this.f248343o.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ze(this));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        }
        super.onStart();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4
    public void s3(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyData", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPopMediasUI", "[notifyData] opType:%s reset:%s localId;%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f248343o;
        if (c18064xe6e1a3b3 != null) {
            if (z17) {
                c18064xe6e1a3b3.c0(true);
            } else {
                c18064xe6e1a3b3.W();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyData", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    public final void t7() {
        android.view.ViewStub viewStub;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkShowForbidAccessLayout", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (this.H1 && (viewStub = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.gce)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPopMediasUI", "checkShowForbidAccessLayout: show Not Access Layout!");
            viewStub.inflate();
            this.H1 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowForbidAccessLayout", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    public final void u7(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishExitStatus", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c c5568xa650f04c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c();
        int m80830xfda78ef6 = this.f248343o.mo70578x3219b31c().m80830xfda78ef6();
        am.ie ieVar = c5568xa650f04c.f135888g;
        ieVar.f88479b = m80830xfda78ef6;
        ieVar.f88478a = this.V;
        ieVar.f88482e = i17;
        c5568xa650f04c.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishExitStatus", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void v7() {
        android.graphics.BitmapFactory.Options n07;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (this.f248365y1 == null) {
            this.f248365y1 = new android.graphics.Rect();
        }
        android.view.View view = this.f248366z1;
        if (view != null && view.getVisibility() == 0) {
            android.view.View view2 = this.f248366z1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "runExitAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "runExitAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!this.X && !android.text.TextUtils.isEmpty(this.S)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c c5568xa650f04c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c();
            int m80830xfda78ef6 = this.f248343o.mo70578x3219b31c().m80830xfda78ef6();
            am.ie ieVar = c5568xa650f04c.f135888g;
            ieVar.f88479b = m80830xfda78ef6;
            ieVar.f88478a = this.V;
            ieVar.f88481d = this.S;
            c5568xa650f04c.e();
            android.graphics.Rect rect = this.f248365y1;
            am.je jeVar = c5568xa650f04c.f135889h;
            int i17 = jeVar.f88560a;
            rect.left = i17;
            int i18 = jeVar.f88561b;
            rect.top = i18;
            rect.right = jeVar.f88562c + i17;
            rect.bottom = jeVar.f88563d + i18;
        }
        this.f248362x0 = this.f248343o.getWidth();
        this.f248364y0 = this.f248343o.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f248343o;
        if (c18064xe6e1a3b3 != null) {
            c18064xe6e1a3b3.S();
        }
        java.lang.String l17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(this.f248343o.mo70574x2d3ab571());
        if (l17 != null && (n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(l17)) != null) {
            int i19 = (int) ((this.f248362x0 / n07.outWidth) * n07.outHeight);
            this.f248364y0 = i19;
            if (i19 > this.f248343o.getHeight()) {
                if (this.f248364y0 < this.f248343o.getHeight() * 2.5d) {
                    this.C1 = this.f248364y0 - this.f248343o.getHeight();
                    if (this.f248343o.m70753x7444f759() == 1) {
                        int height = (this.f248343o.getHeight() * this.f248365y1.height()) / this.f248364y0;
                        android.graphics.Rect rect2 = this.f248365y1;
                        rect2.bottom = rect2.top + height;
                        this.C1 = 0;
                    }
                }
                this.f248364y0 = this.f248343o.getHeight();
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.A1;
        int i27 = this.f248362x0;
        int i28 = this.f248364y0;
        s4Var.f292232f = i27;
        s4Var.f292233g = i28;
        android.graphics.Rect rect3 = this.f248365y1;
        s4Var.e(rect3.left, rect3.top, rect3.width(), this.f248365y1.height());
        android.view.View mo70575xb763149d = this.f248343o.mo70575xb763149d();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e mo70578x3219b31c = this.f248343o.mo70578x3219b31c();
        android.view.View m79160xf8606e56 = mo70578x3219b31c.m79160xf8606e56();
        float width = (this.f248365y1.width() * 1.0f) / mo70578x3219b31c.getWidth();
        float f17 = 1.0f - width;
        int height2 = (int) ((this.f248365y1.top - ((mo70578x3219b31c.getHeight() * f17) / 2.0f)) - (((mo70578x3219b31c.getHeight() - mo70578x3219b31c.getWidth()) * width) / 2.0f));
        int width2 = (int) (this.f248365y1.left - ((mo70578x3219b31c.getWidth() * f17) / 2.0f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPopMediasUI", "runExitAnimation useFixAnimation:%b zoomScale:%f rect:%s gallery width:%d height:%d topOffset:%d  leftOffset:%d", java.lang.Boolean.valueOf(this.K1), java.lang.Float.valueOf(width), this.f248365y1, java.lang.Integer.valueOf(mo70578x3219b31c.getWidth()), java.lang.Integer.valueOf(mo70578x3219b31c.getHeight()), java.lang.Integer.valueOf(height2), java.lang.Integer.valueOf(width2));
        if (this.K1 && (mo70575xb763149d instanceof db5.f0)) {
            ((db5.f0) mo70575xb763149d).mo79190x5f9bc528(width);
        } else {
            float f18 = this.L1;
            if (f18 != 1.0d) {
                this.A1.f292240n = 1.0f / f18;
                if (this.M1 != 0 || this.N1 != 0) {
                    int width3 = ((int) ((this.f248343o.getWidth() / 2) * (1.0f - this.L1))) + this.M1;
                    int height3 = (int) (((this.f248343o.getHeight() / 2) + this.N1) - ((this.f248364y0 / 2) * this.L1));
                    com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var2 = this.A1;
                    s4Var2.f292241o = width3;
                    s4Var2.f292242p = height3;
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var3 = this.A1;
        s4Var3.f292244r = this.C1;
        s4Var3.d(m79160xf8606e56, this.f248363x1, this.K1, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.cf(this, mo70575xb763149d, m79160xf8606e56, width2, height2, width), new com.p314xaae8f345.mm.ui.p2740x696c9db.l4(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsBrowseUI$$c
        });
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4
    public void y0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4
    public void y1(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        this.U = i17;
        this.M1 = 0;
        this.N1 = 0;
        if (this.E1 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            s0Var.a(b17, i17);
            s0Var.q(b17, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }
}
