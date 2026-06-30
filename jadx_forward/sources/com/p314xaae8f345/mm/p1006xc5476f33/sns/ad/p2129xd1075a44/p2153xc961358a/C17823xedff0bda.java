package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView */
/* loaded from: classes4.dex */
public class C17823xedff0bda extends android.widget.FrameLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.HashMap f245484y = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f245485d;

    /* renamed from: e, reason: collision with root package name */
    public int f245486e;

    /* renamed from: f, reason: collision with root package name */
    public int f245487f;

    /* renamed from: g, reason: collision with root package name */
    public int f245488g;

    /* renamed from: h, reason: collision with root package name */
    public int f245489h;

    /* renamed from: i, reason: collision with root package name */
    public int f245490i;

    /* renamed from: m, reason: collision with root package name */
    public int f245491m;

    /* renamed from: n, reason: collision with root package name */
    public int f245492n;

    /* renamed from: o, reason: collision with root package name */
    public float f245493o;

    /* renamed from: p, reason: collision with root package name */
    public float f245494p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f245495q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f245496r;

    /* renamed from: s, reason: collision with root package name */
    public int f245497s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f245498t;

    /* renamed from: u, reason: collision with root package name */
    public int f245499u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.ViewOutlineProvider f245500v;

    /* renamed from: w, reason: collision with root package name */
    public int f245501w;

    /* renamed from: x, reason: collision with root package name */
    public e94.f0 f245502x;

    public C17823xedff0bda(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245486e = 0;
        this.f245487f = 0;
        this.f245493o = 0.0f;
        this.f245494p = 1.0f;
        this.f245496r = false;
        this.f245500v = new e94.y(this);
        this.f245501w = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f245485d = context;
        this.f245491m = i65.a.b(context, 14);
        this.f245492n = i65.a.b(this.f245485d, 8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    public static /* synthetic */ e94.f0 a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17823xedff0bda c17823xedff0bda) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        e94.f0 f0Var = c17823xedff0bda.f245502x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        return f0Var;
    }

    public void b(int i17, int i18, boolean z17, java.lang.String str, int i19) {
        java.util.HashMap hashMap;
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistRoateCardsView", "initData, defBgColor=" + i19 + ", imgUrl=" + str + ", isClockwise=" + z17);
        this.f245498t = str;
        this.f245499u = i19;
        if (i17 <= 0 || i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistRoateCardsView", "initData, size is 0, w=" + i17 + ", h=" + i18);
            this.f245489h = i65.a.b(this.f245485d, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23);
            this.f245490i = i65.a.b(this.f245485d, 375);
        } else {
            this.f245489h = (int) (i17 * 0.75f);
            this.f245490i = (int) (i18 * 0.75f);
        }
        this.f245488g = i65.a.b(this.f245485d, 200) + (this.f245490i / 2);
        this.f245496r = z17;
        if (z17) {
            this.f245497s = 3;
        } else {
            this.f245497s = 9;
        }
        removeAllViews();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        for (int i27 = 0; i27 < 12; i27++) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            android.widget.ImageView imageView = new android.widget.ImageView(this.f245485d);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.f245489h, this.f245490i);
            int i28 = this.f245491m;
            layoutParams.setMargins(i28, i28, i28, i28);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setClipToOutline(true);
            imageView.setOutlineProvider(this.f245500v);
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            imageView.setBackgroundColor(this.f245499u);
            java.lang.String str2 = this.f245498t;
            int i29 = this.f245489h;
            int i37 = this.f245490i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            if (android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            } else {
                try {
                    hashMap = f245484y;
                    bitmap = (android.graphics.Bitmap) hashMap.get(str2);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistRoateCardsView", "setCardBackgroundImg, exp=" + th6.toString());
                }
                if (bitmap != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistRoateCardsView", "setCardBackgroundImg, hit memCache");
                    imageView.setImageBitmap(bitmap);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
                } else {
                    java.lang.String l17 = za4.t0.l("adId", str2);
                    if (com.p314xaae8f345.mm.vfs.w6.j(l17) && (L = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L(l17, i29, i37)) != null && !L.isRecycled()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistRoateCardsView", "setCardBackgroundImg, hit diskCache");
                        imageView.setImageBitmap(L);
                        hashMap.put(str2, L);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistRoateCardsView", "setCardBackgroundImg, download img");
                    a84.z.c(str2, imageView);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
                }
            }
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f245485d);
            frameLayout.addView(imageView);
            frameLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.brp);
            int i38 = this.f245489h;
            int i39 = this.f245491m * 2;
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i38 + i39, this.f245490i + i39));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            addView(frameLayout);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f245501w = 0;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(1500L);
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(this.f245496r ? -180.0f : 180.0f, 0.0f);
        ofFloat2.setDuration(1500L);
        ofFloat2.addUpdateListener(new e94.z(this));
        ofFloat2.addListener(new e94.a0(this));
        android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.3f, 1.0f);
        ofFloat3.setDuration(1500L);
        ofFloat3.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofFloat3.addUpdateListener(new e94.b0(this));
        ofFloat2.start();
        ofFloat3.start();
        ofFloat.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        canvas.save();
        canvas.rotate(this.f245493o, this.f245486e, this.f245487f);
        float f17 = this.f245494p;
        canvas.scale(f17, f17, this.f245486e, this.f245487f);
        super.dispatchDraw(canvas);
        canvas.restore();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int cos;
        int sin;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        if (getWidth() > 0 && getHeight() > 0) {
            this.f245486e = getWidth() / 2;
            this.f245487f = getHeight() + i65.a.b(this.f245485d, 40);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            if (getChildCount() != 12) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            } else {
                for (int i28 = 0; i28 < 12; i28++) {
                    android.view.View childAt = getChildAt(i28);
                    if (this.f245496r) {
                        double d17 = i28 * 0.5235987755982988d;
                        cos = (int) (this.f245488g * java.lang.Math.cos(d17));
                        sin = (int) (this.f245488g * java.lang.Math.sin(d17));
                        childAt.setRotation(90 - ((i28 * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) / 12));
                    } else {
                        double d18 = (-i28) * 0.5235987755982988d;
                        cos = (int) (this.f245488g * java.lang.Math.cos(d18));
                        sin = (int) (this.f245488g * java.lang.Math.sin(d18));
                        childAt.setRotation(((i28 * com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) / 12) + 90);
                    }
                    int i29 = this.f245486e + cos;
                    int i37 = this.f245487f - sin;
                    int i38 = this.f245489h;
                    int i39 = this.f245491m * 2;
                    int i47 = (i38 + i39) / 2;
                    int i48 = (this.f245490i + i39) / 2;
                    childAt.layout(i29 - i47, i37 - i48, i29 + i47, i37 + i48);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    /* renamed from: setAnimCardView */
    public void m69708xd2703488(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f245495q = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    /* renamed from: setOnCardAnimListener */
    public void m69709xf9c29916(e94.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f245502x = f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }
}
