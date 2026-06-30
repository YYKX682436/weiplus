package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/picker/EmojiMediaPickerUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI */
/* loaded from: classes10.dex */
public class ActivityC13334x22686520 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13338xd2201716 f179675d;

    /* renamed from: e, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f179676e;

    /* renamed from: f, reason: collision with root package name */
    public e33.f2 f179677f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 f179678g;

    /* renamed from: h, reason: collision with root package name */
    public int f179679h;

    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13336xbf8c9cdf U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13336xbf8c9cdf c13336xbf8c9cdf = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13336xbf8c9cdf();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("query_source_type", getIntent().getIntExtra("query_source_type", 11));
        bundle.putString("appId", getIntent().getStringExtra("appId"));
        bundle.putString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, getIntent().getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f));
        bundle.putString("query", getIntent().getStringExtra("query"));
        bundle.putInt("key_from_scene", this.f179679h);
        c13336xbf8c9cdf.mo7562xe26dab14(bundle);
        return c13336xbf8c9cdf;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13337xeb4c2673 V6() {
        android.content.Intent intent = getIntent();
        intent.putExtra("max_select_count", 1);
        intent.putExtra("query_source_type", getIntent().getIntExtra("query_source_type", 11));
        intent.putExtra("is_from_emoji_ALBUM", true);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("need_to_clear_top", true);
        intent.putExtra("show_header_view", false);
        intent.putExtra("key_from_scene", this.f179679h);
        intent.addFlags(67108864);
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13337xeb4c2673) lk5.q0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd.class, getIntent(), false, false, false, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13337xeb4c2673.class, 28, null);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13338xd2201716 W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13338xd2201716 c13338xd2201716 = this.f179675d;
        if (c13338xd2201716 != null) {
            return c13338xd2201716;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryTitleView");
        throw null;
    }

    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff X6() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f179676e;
        if (c2718xca2902ff != null) {
            return c2718xca2902ff;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
        throw null;
    }

    public void Y6() {
        setResult(0);
        finish();
    }

    public void Z6(int i17, int i18, android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAlbumPickerUI", "onActivityResult data is null");
        }
        setResult(i18, intent);
    }

    public void a7(oa.i tab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        ((p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById(com.p314xaae8f345.mm.R.id.pvp)).m8317x940d026a(tab.f425315e, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAlbumPickerUI", "onTabSelected, position: " + tab.f425315e);
        if (tab.f425315e == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = this.f179678g;
            if (c22632xdab56332 != null) {
                c22632xdab56332.setTextColor(getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560444ac2));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderTitleView");
                throw null;
            }
        }
    }

    public void b7(e33.f2 provider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        this.f179677f = provider;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) provider).f220052g2 = new e22.f(this);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        vk5.a.f519304a = 0;
        vk5.a.f519305b = null;
        vk5.a.f519306c = -1;
        vk5.a.f519307d = false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dbx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        Z6(i17, i18, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) r0).f220073r.f220098m == true) goto L8;
     */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r3 = this;
            e33.f2 r0 = r3.f179677f
            if (r0 == 0) goto Lf
            r1 = r0
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) r1
            com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView r1 = r1.f220073r
            boolean r1 = r1.f220098m
            r2 = 1
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L1c
            if (r0 == 0) goto L1f
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) r0
            com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView r0 = r0.f220073r
            r0.d()
            goto L1f
        L1c:
            super.onBackPressed()
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520.onBackPressed():void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560696rn);
        getWindow().setStatusBarColor(color);
        new n3.m3(getWindow(), getWindow().getDecorView()).c(false);
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-8193));
        m78531x8f8cf1fb();
        mo78578x8b18f126(color);
        getWindow().getDecorView().setTag(com.p314xaae8f345.mm.R.id.p28, this);
        getWindow().getDecorView().setTag(com.p314xaae8f345.mm.R.id.p2_, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.pvq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f179676e = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) findViewById;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById(com.p314xaae8f345.mm.R.id.pvp);
        findViewById(com.p314xaae8f345.mm.R.id.pvo).setOnClickListener(new e22.a(this));
        this.f179679h = getIntent().getIntExtra("key_from_scene", 0);
        this.f179675d = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13338xd2201716(this, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332(mo55332x76847179());
        c22632xdab56332.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ldh);
        c22632xdab56332.setTextColor(c22632xdab56332.getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560444ac2));
        c22632xdab56332.setTextColor(c22632xdab56332.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        c22632xdab56332.setGravity(17);
        c22632xdab56332.setTextSize(0, c22632xdab56332.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        this.f179678g = c22632xdab56332;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff X6 = X6();
        oa.i l17 = X6().l();
        l17.f425316f = W6();
        l17.f();
        X6.b(l17);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff X62 = X6();
        oa.i l18 = X6().l();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab563322 = this.f179678g;
        if (c22632xdab563322 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderTitleView");
            throw null;
        }
        l18.f425316f = c22632xdab563322;
        l18.f();
        X62.b(l18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13337xeb4c2673 V6 = V6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13336xbf8c9cdf U6 = U6();
        W6().setOnClickListener(new e22.b(this));
        X6().a(new e22.c(this));
        c1190x18d3c3fe.m8315x6cab2c8d(new e22.e(V6, U6, mo7595x9cdc264()));
        c1190x18d3c3fe.m8289xa5a25773(new e22.d(this));
    }
}
