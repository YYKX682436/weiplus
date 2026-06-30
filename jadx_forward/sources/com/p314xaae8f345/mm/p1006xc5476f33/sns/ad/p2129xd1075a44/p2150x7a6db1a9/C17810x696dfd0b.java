package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView */
/* loaded from: classes4.dex */
public class C17810x696dfd0b extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f245343z = 0;

    /* renamed from: q, reason: collision with root package name */
    public android.content.Context f245344q;

    /* renamed from: r, reason: collision with root package name */
    public int f245345r;

    /* renamed from: s, reason: collision with root package name */
    public int f245346s;

    /* renamed from: t, reason: collision with root package name */
    public int f245347t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f245348u;

    /* renamed from: v, reason: collision with root package name */
    public t84.c f245349v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f245350w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f245351x;

    /* renamed from: y, reason: collision with root package name */
    public a94.q f245352y;

    public C17810x696dfd0b(android.content.Context context) {
        super(context, null);
        this.f245350w = new java.util.ArrayList();
        this.f245351x = false;
        j(context);
    }

    public static /* synthetic */ a94.q h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17810x696dfd0b c17810x696dfd0b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        a94.q qVar = c17810x696dfd0b.f245352y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        return qVar;
    }

    public static /* synthetic */ void i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17810x696dfd0b c17810x696dfd0b, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        c17810x696dfd0b.m69680xeff25b44(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    /* renamed from: setCardVisibility */
    private void m69680xeff25b44(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCardVisibility", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        int i18 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f245350w;
            if (i18 >= arrayList.size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardVisibility", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
                return;
            }
            t84.c cVar = (t84.c) arrayList.get(i18);
            cVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            cVar.f497972t = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            i18++;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2146x5de2f80.C17797xece4de77
    public void g(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        if (i17 <= 0 || i18 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            return;
        }
        int b17 = i65.a.b(this.f245344q, 16);
        int i19 = (i17 / 2) - (this.f245345r / 2);
        int height = getHeight() / 2;
        int i27 = this.f245346s;
        int i28 = height - (i27 / 2);
        int i29 = height + (i27 / 2);
        ((t84.c) e(2)).i(i19, i28, this.f245345r + i19, i29);
        int i37 = i19 - (this.f245345r + b17);
        ((t84.c) e(1)).i(i37, i28, this.f245345r + i37, i29);
        int i38 = i19 - ((this.f245345r + b17) * 2);
        ((t84.c) e(0)).i(i38, i28, this.f245345r + i38, i29);
        int i39 = this.f245345r + b17 + i19;
        ((t84.c) e(3)).i(i39, i28, this.f245345r + i39, i29);
        int i47 = i19 + ((b17 + this.f245345r) * 2);
        ((t84.c) e(4)).i(i47, i28, this.f245345r + i47, i29);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    public final void j(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        this.f245344q = context;
        this.f245345r = i65.a.b(context, 96);
        this.f245346s = i65.a.b(this.f245344q, 162);
        this.f245347t = i65.a.b(this.f245344q, 72);
        android.content.Context context2 = this.f245344q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        for (int i17 = 0; i17 < 5; i17++) {
            t84.c cVar = new t84.c(context2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScaleType", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            cVar.f497960h = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScaleType", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
            cVar.k(new t84.b(this.f245345r, this.f245346s));
            d(cVar);
            this.f245350w.add(cVar);
        }
        m69680xeff25b44(4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    public final void k(t84.c cVar, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(cVar, "translationY", -((getHeight() / 2) + (this.f245346s / 2) + this.f245347t), 0.0f);
        long j17 = i18;
        ofFloat.setDuration(j17);
        ofFloat.addListener(new a94.g(this, cVar));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(cVar, "scaleX", 0.33333334f, 1.0f);
        ofFloat2.setDuration(j17);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(cVar, "scaleY", 0.33333334f, 1.0f);
        ofFloat3.setDuration(j17);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(cVar, "translationX", 0.0f, i19);
        ofFloat4.setDuration(j17);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.play(ofFloat4).after(ofFloat);
        animatorSet.setStartDelay(i17);
        animatorSet.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    /* renamed from: setAnimCardView */
    public void m69681xd2703488(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAnimCardView, target=null?");
        sb6.append(view == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GLCardAnimView", sb6.toString());
        this.f245348u = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    /* renamed from: setOnCardAnimListener */
    public void m69682xf9c29916(a94.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        this.f245352y = qVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
    }

    public C17810x696dfd0b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245350w = new java.util.ArrayList();
        this.f245351x = false;
        j(context);
    }
}
