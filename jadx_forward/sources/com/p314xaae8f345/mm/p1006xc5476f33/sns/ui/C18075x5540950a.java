package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsLivePlayButton;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsLivePlayButton */
/* loaded from: classes3.dex */
public final class C18075x5540950a extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public long f248793d;

    /* renamed from: e, reason: collision with root package name */
    public final long f248794e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18075x5540950a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("feedbackClick", "com.tencent.mm.plugin.sns.ui.SnsLivePlayButton");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f248793d < this.f248794e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("feedbackClick", "com.tencent.mm.plugin.sns.ui.SnsLivePlayButton");
            return;
        }
        this.f248793d = currentTimeMillis;
        performHapticFeedback(1, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("feedbackClick", "com.tencent.mm.plugin.sns.ui.SnsLivePlayButton");
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnimation", "com.tencent.mm.plugin.sns.ui.SnsLivePlayButton");
        clearAnimation();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a, java.lang.Float>) android.view.View.SCALE_X, 1.0f, 0.9f);
        ofFloat.setDuration(150L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a, java.lang.Float>) android.view.View.SCALE_Y, 1.0f, 0.9f);
        ofFloat2.setDuration(150L);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a, java.lang.Float>) android.view.View.SCALE_X, 0.9f, 0.9f);
        ofFloat3.setDuration(50L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a, java.lang.Float>) android.view.View.SCALE_X, 0.9f, 1.0f);
        ofFloat4.setDuration(150L);
        ofFloat4.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18075x5540950a, java.lang.Float>) android.view.View.SCALE_Y, 0.9f, 1.0f);
        ofFloat5.setDuration(150L);
        ofFloat5.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(ofFloat4, ofFloat5);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.playSequentially(animatorSet, ofFloat3, animatorSet2);
        animatorSet3.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnimation", "com.tencent.mm.plugin.sns.ui.SnsLivePlayButton");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18075x5540950a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.epi, (android.view.ViewGroup) this, true);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.smj);
        textView.setTextSize(12 * java.lang.Math.min(1.125f, i65.a.q(textView.getContext())));
        com.p314xaae8f345.mm.ui.dl.i(textView.getPaint());
        int a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ts.a(1);
        java.lang.Double valueOf = java.lang.Double.valueOf(0.75d);
        setPadding(a17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ts.a(valueOf), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ts.a(1), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ts.a(valueOf));
        this.f248794e = 100L;
    }
}
