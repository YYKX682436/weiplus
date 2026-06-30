package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView */
/* loaded from: classes4.dex */
public class C17799xcad64a02 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f245121d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f245122e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f245123f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f245124g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f245125h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f245126i;

    /* renamed from: m, reason: collision with root package name */
    public int f245127m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f245128n;

    /* renamed from: o, reason: collision with root package name */
    public long f245129o;

    /* renamed from: p, reason: collision with root package name */
    public android.animation.AnimatorSet f245130p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.AnimatorSet f245131q;

    /* renamed from: r, reason: collision with root package name */
    public int f245132r;

    /* renamed from: s, reason: collision with root package name */
    public final android.os.Handler f245133s;

    public C17799xcad64a02(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17799xcad64a02 c17799xcad64a02, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        c17799xcad64a02.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        float b17 = i65.a.b(c17799xcad64a02.f245121d, 4);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, b17);
        ofFloat.setDuration(200L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "translationY", b17, -i65.a.b(c17799xcad64a02.f245121d, 12));
        ofFloat2.setDuration(200L);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat3.setDuration(200L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
        animatorSet.addListener(new u84.s1(c17799xcad64a02, view));
        c17799xcad64a02.f245131q = animatorSet;
        animatorSet.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17799xcad64a02 c17799xcad64a02, android.widget.TextView textView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        c17799xcad64a02.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        textView.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        java.util.ArrayList arrayList = c17799xcad64a02.f245126i;
        if (arrayList.size() == 0) {
            textView.setText("");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        } else {
            textView.setText((java.lang.CharSequence) arrayList.get(c17799xcad64a02.f245127m % arrayList.size()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateText", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 0.0f);
        ofFloat.setDuration(300L);
        int b17 = i65.a.b(c17799xcad64a02.f245121d, 16);
        float f17 = -i65.a.b(c17799xcad64a02.f245121d, 2);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(textView, "translationY", b17, f17);
        ofFloat2.setDuration(200L);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
        ofFloat3.setDuration(200L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(textView, "translationY", f17, 0.0f);
        ofFloat4.setDuration(200L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
        animatorSet.play(ofFloat4).after(ofFloat3);
        c17799xcad64a02.f245130p = animatorSet;
        animatorSet.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        try {
            android.animation.AnimatorSet animatorSet = this.f245131q;
            if (animatorSet != null) {
                animatorSet.end();
            }
            android.animation.AnimatorSet animatorSet2 = this.f245130p;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
        } catch (java.lang.Exception unused) {
        }
        this.f245124g.setVisibility(0);
        this.f245125h.setVisibility(4);
        this.f245124g.setAlpha(1.0f);
        this.f245125h.setAlpha(1.0f);
        this.f245124g.setTranslationY(0.0f);
        this.f245125h.setTranslationY(0.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        if (ca4.m0.a0(getContext())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdInteractionLabelView", "--startAnim--");
        android.os.Handler handler = this.f245133s;
        handler.removeCallbacksAndMessages(null);
        java.util.ArrayList arrayList = this.f245126i;
        if (arrayList.size() == 0) {
            this.f245124g.setText("");
            this.f245125h.setText("");
            this.f245128n = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
            return;
        }
        if (arrayList.size() == 1) {
            c();
            this.f245124g.setText((java.lang.CharSequence) arrayList.get(0));
            this.f245125h.setText("");
            this.f245128n = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
            return;
        }
        this.f245128n = false;
        this.f245127m = 0;
        c();
        this.f245124g.setText((java.lang.CharSequence) arrayList.get(0));
        this.f245125h.setText("");
        handler.sendEmptyMessageDelayed(1, 1800L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        super.onAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdInteractionLabelView", "onAttachedToWindow");
        if (this.f245132r != 0) {
            d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdInteractionLabelView", "onDetachedFromWindow");
        this.f245129o = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        if (ca4.m0.a0(getContext())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdInteractionLabelView", "stopAnim");
            this.f245128n = true;
            this.f245133s.removeCallbacksAndMessages(null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }

    public C17799xcad64a02(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f245126i = new java.util.ArrayList();
        this.f245127m = 0;
        this.f245128n = false;
        this.f245133s = new u84.r1(this, android.os.Looper.getMainLooper());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
        setOrientation(0);
        setGravity(16);
        this.f245121d = context;
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571020cp3, this);
        this.f245122e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f245123f = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f564583v9);
        this.f245124g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564584va);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564585vb);
        this.f245125h = textView;
        textView.setVisibility(4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
    }
}
