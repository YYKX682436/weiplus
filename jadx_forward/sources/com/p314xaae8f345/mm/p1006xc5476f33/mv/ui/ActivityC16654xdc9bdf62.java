package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui;

@db5.a(m123858x6ac9171 = 33)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvPostUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvPostUI */
/* loaded from: classes10.dex */
public final class ActivityC16654xdc9bdf62 extends com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f232415n = 0;

    /* renamed from: e, reason: collision with root package name */
    public r45.ss4 f232416e;

    /* renamed from: f, reason: collision with root package name */
    public ya2.b2 f232417f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f232418g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f232419h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f232420i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f232421m;

    public final void U6(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImageMode", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("music_mv_cover_");
        r45.ss4 ss4Var = this.f232416e;
        sb6.append(ss4Var != null ? java.lang.Long.valueOf(ss4Var.m75942xfb822ef2(4)) : null);
        sb6.append('_');
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        intent.putExtra("CropImage_OutputPath", e9Var.e(sb6.toString()));
        intent.putExtra("CropImage_ImgPath", str);
        intent.putExtra("CropImage_from_scene", 4);
        this.f232420i = true;
        ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).getClass();
        o25.t1 b17 = f14.g.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "uiCallback(...)");
        ((com.p314xaae8f345.mm.app.y7) b17).p(this, intent, 1003);
    }

    public final void V6(boolean z17) {
        jz5.f0 f0Var;
        r45.ss4 ss4Var;
        jm3.v0 v0Var = new jm3.v0(this);
        W6();
        if (this.f232417f == null || (ss4Var = this.f232416e) == null) {
            f0Var = null;
        } else {
            jm3.h1.f381855a.b(ss4Var);
            v0Var.mo146xb9724478(ss4Var);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPostUI", "create finder contact");
            if (z17) {
                i95.m c17 = i95.n0.c(zy2.b6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                if (zy2.b6.Mh((zy2.b6) c17, this, null, null, null, 12, null)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClassName(this, "com.tencent.mm.plugin.finder.ui.FinderCreateContactUI");
                    intent.putExtra("key_create_scene", 7);
                    intent.putExtra("key_router_to_profile", false);
                    intent.putExtra("key_mv_status", 2);
                    startActivityForResult(intent, 1002);
                }
            }
        }
    }

    public final void W6() {
        if (this.f232417f == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            if (xy2.c.e(mo55332x76847179).length() > 0) {
                ya2.g gVar = ya2.h.f542017a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
                this.f232417f = gVar.b(xy2.c.e(mo55332x768471792));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c57;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.i(mo43419xa59964ef, kz5.o1.c(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x6.class));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        switch (i17) {
            case 1000:
                if (i18 != -1 || intent == null) {
                    return;
                }
                java.lang.String stringExtra = intent.getStringExtra("KEY_RECORD_PHOTO_PATH");
                if (stringExtra == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mv.MusicMvPostUI", "capture null: ");
                    return;
                } else {
                    this.f232419h = stringExtra;
                    U6(stringExtra);
                    return;
                }
            case 1001:
                if (intent == null || i18 != -1) {
                    return;
                }
                java.lang.String b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.i1.b(mo55332x76847179(), intent, g83.a.a());
                if (b17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPostUI", "onActivityResult: choose path null");
                    return;
                } else {
                    U6(b17);
                    return;
                }
            case 1002:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPostUI", "callback create finder contact post");
                V6(false);
                return;
            case 1003:
                if (intent != null) {
                    java.lang.String stringExtra2 = intent.getStringExtra("CropImage_OutputPath");
                    if (stringExtra2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPostUI", "onActivityResult: crop path null");
                        return;
                    }
                    com.p314xaae8f345.mm.vfs.w6.h(this.f232419h);
                    if (i18 != -1) {
                        com.p314xaae8f345.mm.vfs.w6.h(stringExtra2);
                        return;
                    }
                    com.p314xaae8f345.mm.vfs.w6.h(this.f232418g);
                    this.f232418g = stringExtra2;
                    r45.ss4 ss4Var = this.f232416e;
                    if (ss4Var != null) {
                        ss4Var.set(2, stringExtra2);
                    }
                    android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.asz);
                    android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f568828o70);
                    if (imageView != null) {
                        o11.f fVar = new o11.f();
                        fVar.f423610a = true;
                        fVar.f423618i = 1;
                        n11.a.b().i(stringExtra2, imageView, fVar.a(), new jm3.b1(this, findViewById));
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x6) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x6.class)).O6(this.f232416e, true, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x008e, code lost:
    
        if (r8 == null) goto L12;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ll3.z0.a(ll3.z0.f400797a, false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f232420i) {
            this.f232420i = false;
        }
    }
}
