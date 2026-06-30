package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView */
/* loaded from: classes4.dex */
public class C17809xf60523a6 extends android.widget.FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f245333p = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f245334d;

    /* renamed from: e, reason: collision with root package name */
    public int f245335e;

    /* renamed from: f, reason: collision with root package name */
    public int f245336f;

    /* renamed from: g, reason: collision with root package name */
    public int f245337g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f245338h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f245339i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f245340m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f245341n;

    /* renamed from: o, reason: collision with root package name */
    public a94.q f245342o;

    public C17809xf60523a6(android.content.Context context) {
        super(context);
        this.f245340m = new java.util.ArrayList();
        this.f245341n = false;
        c(context);
    }

    public static /* synthetic */ a94.q a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17809xf60523a6 c17809xf60523a6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        a94.q qVar = c17809xf60523a6.f245342o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        return qVar;
    }

    public static /* synthetic */ void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17809xf60523a6 c17809xf60523a6, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        c17809xf60523a6.m69677xeff25b44(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    /* renamed from: setCardVisibility */
    private void m69677xeff25b44(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCardVisibility", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        int i18 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f245340m;
            if (i18 >= arrayList.size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardVisibility", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
                return;
            }
            android.view.View view = (android.view.View) arrayList.get(i18);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "setCardVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "setCardVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i18++;
        }
    }

    public final void c(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        this.f245334d = context;
        this.f245335e = i65.a.b(context, 96);
        this.f245336f = i65.a.b(this.f245334d, 162);
        this.f245337g = i65.a.b(this.f245334d, 72);
        android.content.Context context2 = this.f245334d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        int a17 = i65.a.a(this.f245334d, 3.6f);
        for (int i17 = 0; i17 < 5; i17++) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d(context2);
            c22628xfde5d61d.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            c22628xfde5d61d.setLayoutParams(new android.widget.FrameLayout.LayoutParams(this.f245335e, this.f245336f));
            c22628xfde5d61d.m81387x205ac394(a17);
            addView(c22628xfde5d61d);
            this.f245340m.add(c22628xfde5d61d);
        }
        m69677xeff25b44(4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    public final void d(android.view.View view, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", -((getHeight() / 2) + (this.f245336f / 2) + this.f245337g), 0.0f);
        long j17 = i18;
        ofFloat.setDuration(j17);
        ofFloat.addListener(new a94.b(this, view));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 0.33333334f, 1.0f);
        ofFloat2.setDuration(j17);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 0.33333334f, 1.0f);
        ofFloat3.setDuration(j17);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, i19);
        ofFloat4.setDuration(j17);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.play(ofFloat4).after(ofFloat);
        animatorSet.setStartDelay(i17);
        animatorSet.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        super.onLayout(z17, i17, i18, i19, i27);
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            return;
        }
        int b17 = i65.a.b(this.f245334d, 16);
        int i28 = (width / 2) - (this.f245335e / 2);
        int height2 = getHeight() / 2;
        int i29 = this.f245336f;
        int i37 = height2 - (i29 / 2);
        int i38 = height2 + (i29 / 2);
        getChildAt(2).layout(i28, i37, this.f245335e + i28, i38);
        int i39 = i28 - (this.f245335e + b17);
        getChildAt(1).layout(i39, i37, this.f245335e + i39, i38);
        int i47 = i28 - ((this.f245335e + b17) * 2);
        getChildAt(0).layout(i47, i37, this.f245335e + i47, i38);
        int i48 = this.f245335e + b17 + i28;
        getChildAt(3).layout(i48, i37, this.f245335e + i48, i38);
        int i49 = i28 + ((b17 + this.f245335e) * 2);
        getChildAt(4).layout(i49, i37, this.f245335e + i49, i38);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    /* renamed from: setAnimCardView */
    public void m69678xd2703488(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAnimCardView, target=null?");
        sb6.append(view == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", sb6.toString());
        this.f245338h = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    /* renamed from: setOnCardAnimListener */
    public void m69679xf9c29916(a94.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        this.f245342o = qVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
    }

    public C17809xf60523a6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245340m = new java.util.ArrayList();
        this.f245341n = false;
        c(context);
    }
}
