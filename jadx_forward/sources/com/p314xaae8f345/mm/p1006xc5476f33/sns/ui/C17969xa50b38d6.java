package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.LoadingMoreView */
/* loaded from: classes4.dex */
public class C17969xa50b38d6 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f247857d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f247858e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f247859f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21356x182ee98c f247860g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.Animation f247861h;

    public C17969xa50b38d6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f247861h = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f247857d = context;
        a();
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
        android.view.View inflate = android.view.LayoutInflater.from(this.f247857d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csv, (android.view.ViewGroup) this, true);
        this.f247858e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564414qn);
        this.f247859f = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.im9);
        this.f247860g = (com.p314xaae8f345.mm.ui.C21356x182ee98c) inflate.findViewById(com.p314xaae8f345.mm.R.id.qij);
        this.f247859f.setVisibility(0);
        this.f247860g.setVisibility(8);
        android.view.animation.Animation animation = this.f247861h;
        animation.setDuration(1000L);
        animation.setRepeatCount(-1);
        animation.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f247858e.startAnimation(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
    }

    public void b(int i17, java.lang.String tipsText) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onIsRecent", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
        this.f247859f.setVisibility(8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tipsText)) {
            this.f247860g.setVisibility(0);
            this.f247860g.b();
        } else {
            this.f247860g.setVisibility(0);
            com.p314xaae8f345.mm.ui.C21356x182ee98c c21356x182ee98c = this.f247860g;
            c21356x182ee98c.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsText, "tipsText");
            android.widget.TextView textView = c21356x182ee98c.f278178d;
            textView.setText(tipsText);
            textView.setVisibility(0);
            c21356x182ee98c.f278180f.setVisibility(8);
            c21356x182ee98c.f278179e.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onIsRecent", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startLoadingAnimation", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
        android.view.animation.Animation animation = this.f247861h;
        animation.cancel();
        animation.reset();
        this.f247858e.startAnimation(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startLoadingAnimation", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
    }

    public C17969xa50b38d6(android.content.Context context) {
        super(context);
        this.f247861h = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f247857d = context;
        a();
    }
}
