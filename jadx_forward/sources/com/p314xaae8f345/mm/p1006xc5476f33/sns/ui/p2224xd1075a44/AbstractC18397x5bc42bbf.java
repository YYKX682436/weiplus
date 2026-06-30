package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter */
/* loaded from: classes4.dex */
public abstract class AbstractC18397x5bc42bbf extends com.p314xaae8f345.mm.ui.p2747xd1075a44.AbstractC22647xb041ad02 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f252288t = 0;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f252289f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f252290g;

    /* renamed from: h, reason: collision with root package name */
    public fl5.i f252291h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageButton f252292i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18420xe54becbe f252293m;

    /* renamed from: n, reason: collision with root package name */
    public int f252294n;

    /* renamed from: o, reason: collision with root package name */
    public int f252295o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f252296p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.e f252297q;

    /* renamed from: r, reason: collision with root package name */
    public final int f252298r;

    /* renamed from: s, reason: collision with root package name */
    public final int f252299s;

    public AbstractC18397x5bc42bbf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f252291h = null;
        this.f252294n = -1;
        this.f252295o = 0;
        this.f252296p = false;
        this.f252298r = com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee;
        this.f252299s = com.p314xaae8f345.mm.R.C30861xcebc809e.f562769o2;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.f252289f = abstractActivityC21394xb3d2c0cf;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        this.f292954d = new al5.f0(this, this, true);
        int mo70813x19d607cd = mo70813x19d607cd();
        if ((mo70813x19d607cd & 32) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUpload.InputPanelLinearLayout", "init setEnableUseWindowInsetListener=true");
            this.f292954d.f87434u = true;
        } else if ((mo70813x19d607cd & 16) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUpload.InputPanelLinearLayout", "init setEnableUseWindowInsetListener=false");
            this.f292954d.f87434u = false;
        }
        abstractActivityC21394xb3d2c0cf.getWindow().setSoftInputMode(mo70813x19d607cd());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cup, this);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564368p9);
        this.f252292i = imageButton;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageButton, "<this>");
        imageButton.setOnClickListener(new ca4.d1(imageButton, 500L, bVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        this.f252293m = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18420xe54becbe) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564372pd);
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a() == null) {
            this.f252290g = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t5(abstractActivityC21394xb3d2c0cf);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 wi6 = ((g30.c0) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a()).wi(getContext());
        this.f252290g = wi6;
        wi6.mo75331xef640234(2);
        this.f252290g.mo75345x9e226965(6);
        this.f252290g.setVisibility(8);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.m7g);
        linearLayout.setOnClickListener(null);
        findViewById(com.p314xaae8f345.mm.R.id.gbm).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c(this));
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
        this.f252295o = g17;
        linearLayout.addView(this.f252290g, -1, g17);
        this.f252290g.c();
        c();
        this.f252290g.i();
        this.f252290g.mo75339x5e04422d(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.d(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.AbstractC22647xb041ad02, al5.e0
    public void J2(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUpload.AbsSayFooter", "onInputPanelChange: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        super.J2(z17, i17);
        d(z17, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callPanelChangeAfterUIRefresh", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.e eVar = this.f252297q;
        if (eVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gu guVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gu) eVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInputChange", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$3");
            fl5.i iVar = guVar.f249998b;
            int mo81569x6f2c472c = iVar.mo81569x6f2c472c();
            int i18 = pm0.v.r(guVar.f249999c).top;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu huVar = guVar.f250000d;
            boolean z18 = huVar.f250072f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            boolean z19 = z18 || (guVar.f249997a == mo81569x6f2c472c && mo81569x6f2c472c != 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu.c(huVar), "onInputChange: lastCursorStart:" + guVar.f249997a + ", newCursorStart:" + mo81569x6f2c472c + ", needUpdateCursor:" + z19);
            if (z19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu.b(huVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu.a(huVar, mo81569x6f2c472c, iVar.mo81565x22f21e20(), i18));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            huVar.f250072f = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            guVar.f249997a = mo81569x6f2c472c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInputChange", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$3");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callPanelChangeAfterUIRefresh", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    public java.lang.Boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFooterBarLayOnPageBottom", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        if (b()) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFooterBarLayOnPageBottom", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            return bool;
        }
        android.graphics.Rect r17 = pm0.v.r(this);
        int abs = java.lang.Math.abs(com.p314xaae8f345.mm.ui.bl.b(this.f252289f).y - r17.bottom);
        boolean z17 = true;
        boolean z18 = abs <= m71208xb450b989();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUpload.AbsSayFooter", "isFooterBarLayOnPageBottom = [%b] ,bottomRawY:%d, Height:%d, footerPaddingScreenBottom:%d", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(r17.bottom), java.lang.Integer.valueOf(getHeight()), java.lang.Integer.valueOf(abs));
        if (!z18 && !com.p314xaae8f345.mm.ui.b4.c(getContext())) {
            z17 = false;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFooterBarLayOnPageBottom", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        return valueOf;
    }

    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSmilePanelVisble", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        boolean z17 = this.f252290g.getVisibility() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSmilePanelVisble", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        return z17;
    }

    public abstract void c();

    public abstract void d(boolean z17, int i17);

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFooterGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUpload.AbsSayFooter", "setFooterGone: mIsShowSmiley:%b", java.lang.Boolean.valueOf(this.f252296p));
        if (this.f252296p) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFooterGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        } else {
            setVisibility(4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFooterGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        }
    }

    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFooterVisible", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUpload.AbsSayFooter", "setFooterVisible: ");
        setVisibility(0);
        android.widget.ImageButton imageButton = this.f252292i;
        if (imageButton != null) {
            imageButton.setImageResource(this.f252298r);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18420xe54becbe abstractC18420xe54becbe = this.f252293m;
        if (abstractC18420xe54becbe != null) {
            abstractC18420xe54becbe.b(this.f252291h.getText().toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFooterVisible", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSmileGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUpload.AbsSayFooter", "setSmileGone: ");
        this.f252296p = false;
        this.f252290g.h();
        this.f252290g.setVisibility(8);
        setVisibility(4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSmileGone", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    /* renamed from: getFooterBarHeight */
    public int m71208xb450b989() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFooterBarHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        int height = getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFooterBarHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        return height;
    }

    /* renamed from: getKeyboardHeight */
    public int m71209x9918f4e4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        int i17 = this.f252295o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        return i17;
    }

    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(hc1.i.f69827x24728b, "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        this.f252296p = true;
        this.f252290g.i();
        m81438xb2a7481e().f87433t = new al5.d0() { // from class: com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$$b
            @Override // al5.d0
            public final void a(boolean z17) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf.f252288t;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf abstractC18397x5bc42bbf = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf.this;
                abstractC18397x5bc42bbf.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$showSmileyPanel$1", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
                if (!z17) {
                    abstractC18397x5bc42bbf.f252290g.setVisibility(0);
                }
                abstractC18397x5bc42bbf.m81438xb2a7481e().f87433t = null;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$showSmileyPanel$1", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            }
        };
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(hc1.i.f69827x24728b, "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        super.onConfigurationChanged(configuration);
        if (this.f252290g != null) {
            c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = this.f252294n;
        if (i28 >= i27) {
            i27 = i28;
        }
        this.f252294n = i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    /* renamed from: setMMEditText */
    public void m71210x1b9709f9(fl5.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMMEditText", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        this.f252291h = iVar;
        iVar.c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.a(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMMEditText", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }

    /* renamed from: setUploadFooterPanelChangeListener */
    public void m71211x538bde4a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUploadFooterPanelChangeListener", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        this.f252297q = eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUploadFooterPanelChangeListener", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }
}
