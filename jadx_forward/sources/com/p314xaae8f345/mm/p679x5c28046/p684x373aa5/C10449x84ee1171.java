package com.p314xaae8f345.mm.p679x5c28046.p684x373aa5;

/* renamed from: com.tencent.mm.emoji.view.EmojiPanelInputComponent */
/* loaded from: classes5.dex */
public class C10449x84ee1171 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 {

    /* renamed from: r, reason: collision with root package name */
    public static final int f146470r = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f146471g;

    /* renamed from: h, reason: collision with root package name */
    public fl5.i f146472h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageButton f146473i;

    /* renamed from: m, reason: collision with root package name */
    public int f146474m;

    /* renamed from: n, reason: collision with root package name */
    public int f146475n;

    /* renamed from: o, reason: collision with root package name */
    public int f146476o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f146477p;

    /* renamed from: q, reason: collision with root package name */
    public sr.k f146478q;

    public C10449x84ee1171(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f146472h = null;
        this.f146474m = -1;
        this.f146475n = -1;
        this.f146476o = 0;
        this.f146477p = true;
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6w, this);
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a() == null) {
            this.f146471g = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t5(context);
            return;
        }
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.jpb);
        this.f146473i = imageButton;
        imageButton.setOnClickListener(new sr.g(this));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 wi6 = ((g30.c0) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a()).wi(getContext());
        this.f146471g = wi6;
        wi6.mo75331xef640234(0);
        this.f146471g.setVisibility(4);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.m7g);
        linearLayout.setOnClickListener(null);
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
        this.f146476o = g17;
        linearLayout.addView(this.f146471g, -1, g17);
        this.f146471g.c();
        m43722x39b81cde(this.f146476o);
        this.f146471g.i();
        this.f146471g.mo75339x5e04422d(new sr.h(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049, al5.e0
    public void J2(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelInputComponent", "onInputPanelChange: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        super.J2(z17, i17);
        if (this.f146476o != i17 && i17 != 0) {
            this.f146476o = i17;
            m43722x39b81cde(i17);
        }
        if (z17) {
            setVisibility(0);
            this.f146473i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562768o1);
            this.f146473i.setTag("keyboard");
        } else if ("emoji".equals(this.f146473i.getTag())) {
            this.f146473i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562769o2);
        } else {
            setVisibility(4);
        }
        f(i17);
    }

    public void f(int i17) {
        sr.k kVar = this.f146478q;
        if (kVar != null) {
            kVar.J2(getVisibility() == 0, i17 + f146470r);
        }
    }

    public void g() {
        this.f146471g.h();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(getContext())) {
            m81273xb2a7481e().f(new sr.i(this));
        } else {
            this.f146471g.setVisibility(4);
        }
    }

    /* renamed from: getSmileyPanel */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 m43721x14cd10dd() {
        return this.f146471g;
    }

    public boolean h() {
        return (this.f146471g.getVisibility() == 0) || getVisibility() == 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f146471g != null) {
            m43722x39b81cde(this.f146476o);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = this.f146474m;
        if (i28 < i27) {
            i28 = i27;
        }
        this.f146474m = i28;
        this.f146475n = i27;
    }

    /* renamed from: setBottomPanelHeight */
    public void m43722x39b81cde(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelInputComponent", "setBottomPanelHeight: %s", java.lang.Integer.valueOf(i17));
        android.view.ViewGroup.LayoutParams layoutParams = this.f146471g.getLayoutParams();
        if (layoutParams == null || layoutParams.height == i17) {
            return;
        }
        layoutParams.height = i17;
        this.f146471g.requestLayout();
    }

    /* renamed from: setInputComponentListener */
    public void m43723x8a9c4129(sr.k kVar) {
        this.f146478q = kVar;
    }

    /* renamed from: setMMEditText */
    public void m43724x1b9709f9(fl5.i iVar) {
        this.f146472h = iVar;
        iVar.c(new sr.f(this));
    }

    /* renamed from: setSmileySendButtonEnable */
    public void m43725xd2dca690(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f146471g;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.mo75346x768d9f7f(z17);
        }
    }

    /* renamed from: setSmileySendButtonText */
    public void m43726x3e94a57a(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f146471g;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.mo75358x658d5272(str);
        }
    }

    /* renamed from: setSmileySendTalkerName */
    public void m43727xaa698e7f(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f146471g;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.mo75357x9d98e686(str);
        }
    }
}
