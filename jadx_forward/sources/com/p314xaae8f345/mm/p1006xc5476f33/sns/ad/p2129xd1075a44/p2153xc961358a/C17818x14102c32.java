package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/twistad/FlyingFlipAnimView;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "targetView", "Ljz5/f0;", "setAnimCardView", "", "status", "setPickStatus", "getPickStatus", "Le94/c;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setOnCardAnimListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView */
/* loaded from: classes4.dex */
public final class C17818x14102c32 extends android.widget.FrameLayout {
    public static final /* synthetic */ int F = 0;
    public float A;
    public float B;
    public final android.view.ViewOutlineProvider C;
    public final java.util.HashMap D;
    public e94.c E;

    /* renamed from: d, reason: collision with root package name */
    public int f245414d;

    /* renamed from: e, reason: collision with root package name */
    public int f245415e;

    /* renamed from: f, reason: collision with root package name */
    public final float f245416f;

    /* renamed from: g, reason: collision with root package name */
    public final int f245417g;

    /* renamed from: h, reason: collision with root package name */
    public final float f245418h;

    /* renamed from: i, reason: collision with root package name */
    public final float f245419i;

    /* renamed from: m, reason: collision with root package name */
    public final int f245420m;

    /* renamed from: n, reason: collision with root package name */
    public final int f245421n;

    /* renamed from: o, reason: collision with root package name */
    public float f245422o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f245423p;

    /* renamed from: q, reason: collision with root package name */
    public int f245424q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.AnimatorSet f245425r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.AnimatorSet f245426s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f245427t;

    /* renamed from: u, reason: collision with root package name */
    public int f245428u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f245429v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f245430w;

    /* renamed from: x, reason: collision with root package name */
    public final int f245431x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f245432y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.drawable.ShapeDrawable f245433z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17818x14102c32(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.Resources resources;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f245416f = i65.a.b(getContext(), 16);
        this.f245417g = i65.a.b(getContext(), 3);
        android.content.Context context2 = getContext();
        this.f245431x = (context2 == null || (resources = context2.getResources()) == null) ? 0 : resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ama);
        this.f245418h = i65.a.b(getContext(), 72);
        this.f245419i = i65.a.b(getContext(), 89);
        int[] c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.c(getContext());
        int i17 = c17[0];
        int i18 = c17[1];
        this.f245420m = i17 / 2;
        this.f245421n = (int) (i18 * 0.46f);
        d();
        setCameraDistance(this.f245422o);
        e94.f fVar = new e94.f();
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        paintDrawable.setShape(new android.graphics.drawable.shapes.RectShape());
        paintDrawable.setShaderFactory(fVar);
        this.f245433z = paintDrawable;
        this.C = new e94.e(this);
        this.D = new java.util.HashMap();
    }

    public final android.animation.AnimatorSet a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("alphaAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        android.view.View view = this.f245429v;
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("alphaAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return null;
        }
        if (this.f245430w == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("alphaAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.33f, 1.0f);
        ofFloat.setDuration(384L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.58f, 0.0f, 0.09f, 1.0f));
        android.view.View view2 = this.f245429v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(150L);
        android.view.View view3 = this.f245430w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view3, "alpha", 0.33f, 1.0f);
        ofFloat3.setDuration(384L);
        ofFloat3.setInterpolator(new android.view.animation.PathInterpolator(0.58f, 0.0f, 0.09f, 1.0f));
        android.view.View view4 = this.f245430w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view4, "alpha", 1.0f, 0.0f);
        ofFloat4.setDuration(150L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playSequentially(ofFloat3, ofFloat4);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.setStartDelay(1466L);
        animatorSet3.playTogether(animatorSet, animatorSet2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("alphaAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return animatorSet3;
    }

    public final android.view.View b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createAnimView", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        if (getContext() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createAnimView", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return null;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.f245414d, this.f245415e);
        layoutParams.gravity = 17;
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        imageView.setBackgroundColor(this.f245424q);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17820x149858ff c17820x149858ff = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17820x149858ff(context);
        c17820x149858ff.setClipToOutline(true);
        android.view.ViewOutlineProvider viewOutlineProvider = this.C;
        c17820x149858ff.setOutlineProvider(viewOutlineProvider);
        float f17 = this.f245417g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBorderParams", "com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView");
        int i17 = this.f245431x;
        c17820x149858ff.f245446e = i17;
        c17820x149858ff.f245447f = f17;
        float f18 = this.f245416f;
        c17820x149858ff.f245445d = f18;
        c17820x149858ff.postInvalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBorderParams", "com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView");
        c17820x149858ff.setAlpha(0.33f);
        this.f245429v = c17820x149858ff;
        h(imageView, this.f245423p, this.f245414d, this.f245415e);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.addView(imageView);
        frameLayout.addView(this.f245429v);
        frameLayout.setRotationY(180.0f);
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(this.f245414d, this.f245415e));
        android.widget.ImageView imageView2 = new android.widget.ImageView(getContext());
        imageView2.setLayoutParams(layoutParams);
        imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        imageView2.setBackgroundColor(this.f245424q);
        h(imageView2, this.f245423p, this.f245414d, this.f245415e);
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17820x149858ff c17820x149858ff2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17820x149858ff(context2);
        c17820x149858ff2.setClipToOutline(true);
        c17820x149858ff2.setOutlineProvider(viewOutlineProvider);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBorderParams", "com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView");
        c17820x149858ff2.f245446e = i17;
        c17820x149858ff2.f245447f = f17;
        c17820x149858ff2.f245445d = f18;
        c17820x149858ff2.postInvalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBorderParams", "com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView");
        c17820x149858ff2.setAlpha(0.33f);
        this.f245430w = c17820x149858ff2;
        float f19 = this.f245414d;
        this.A = 2.69f * f19;
        this.B = f19 * 0.78f;
        android.view.View view = new android.view.View(getContext());
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) this.A, (int) this.B));
        view.setBackground(this.f245433z);
        view.setRotation(45.0f);
        float f27 = this.A;
        float f28 = this.f245414d;
        view.setTranslationX(((-(f27 - f28)) * 0.5f) - (f28 * 0.86f));
        view.setTranslationY(((this.f245415e - this.B) * 0.5f) + (this.f245414d * 1.07f));
        this.f245432y = view;
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(getContext());
        frameLayout2.addView(imageView2);
        frameLayout2.addView(this.f245430w);
        frameLayout2.addView(this.f245432y);
        frameLayout2.setRotationY(0.0f);
        frameLayout2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(this.f245414d, this.f245415e));
        android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(getContext());
        frameLayout3.setClipToOutline(true);
        frameLayout3.setOutlineProvider(viewOutlineProvider);
        frameLayout3.addView(frameLayout);
        frameLayout3.addView(frameLayout2);
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(this.f245414d, this.f245415e);
        layoutParams2.leftMargin = this.f245420m - (this.f245414d / 2);
        layoutParams2.topMargin = this.f245421n - (this.f245415e / 2);
        frameLayout3.setLayoutParams(layoutParams2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createAnimView", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return frameLayout3;
    }

    public final android.animation.AnimatorSet c() {
        android.animation.Animator animator;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doEggCardFlipAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        if (this.f245427t == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doEggCardFlipAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepareFlipAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        android.view.View view = this.f245427t;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/twistad/FlyingFlipAnimView", "prepareFlipAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/twistad/FlyingFlipAnimView", "prepareFlipAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view2 = this.f245427t;
        if (view2 != null) {
            view2.setRotationY(-90.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareFlipAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        int i17 = this.f245428u;
        if (i17 == 3 || i17 == 0) {
            android.view.View view3 = this.f245427t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view3, "rotationY", -90.0f, 7.0f);
            ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.37f, 0.82f, 0.64f, 1.0f));
            android.view.View view4 = this.f245427t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view4, "rotationY", 7.0f, 0.0f);
            ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.28f, 0.0f, 0.58f, 1.0f));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2);
            animator = animatorSet;
        } else {
            android.view.View view5 = this.f245427t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view5);
            animator = android.animation.ObjectAnimator.ofFloat(view5, "rotationY", -90.0f, 0.0f);
            animator.setInterpolator(new android.view.animation.PathInterpolator(0.26f, 0.99f, 0.52f, 1.0f));
        }
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.setDuration(667L);
        animatorSet2.addListener(new e94.d(this));
        animatorSet2.play(animator);
        animatorSet2.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doEggCardFlipAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return animatorSet2;
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCameraDistance", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        this.f245422o = getContext().getResources().getDisplayMetrics().density * (-8000);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCameraDistance", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
    }

    public final android.animation.AnimatorSet e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("moveLightAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        android.view.View view = this.f245432y;
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("moveLightAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.view.View view2 = this.f245432y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        android.view.View view3 = this.f245432y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", view2.getTranslationX(), view3.getTranslationX() + (this.f245414d * 1.72f));
        ofFloat.setDuration(700L);
        android.view.View view4 = this.f245432y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
        android.view.View view5 = this.f245432y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view5);
        android.view.View view6 = this.f245432y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view6);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view4, "translationY", view5.getTranslationY(), view6.getTranslationY() - (this.f245414d * 2.14f));
        ofFloat2.setDuration(700L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setStartDelay(1133L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("moveLightAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return animatorSet;
    }

    public final android.animation.AnimatorSet f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rotationAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "rotation", 6.3f, 4.7f);
        ofFloat.setDuration(1383L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.15f, 0.0f, 0.64f, 1.0f));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, "rotationY", -110.0f, 360.0f);
        ofFloat2.setDuration(1350L);
        ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.5f, 0.27f, 1.0f));
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this, "rotationY", 360.0f, 450.0f);
        ofFloat3.setDuration(650L);
        ofFloat3.setInterpolator(new android.view.animation.PathInterpolator(0.76f, 0.0f, 0.77f, 0.31f));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playSequentially(ofFloat2, ofFloat3);
        animatorSet.playTogether(ofFloat, animatorSet2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rotationAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return animatorSet;
    }

    public final android.animation.AnimatorSet g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scaleAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "scaleX", 0.27f, 1.0f);
        ofFloat.setDuration(1350L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.5f, 0.0f, 0.3f, 1.0f));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, "scaleY", 0.27f, 1.0f);
        ofFloat2.setDuration(1350L);
        ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.5f, 0.0f, 0.3f, 1.0f));
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 0.91f);
        ofFloat3.setDuration(417L);
        ofFloat3.setInterpolator(new android.view.animation.PathInterpolator(0.47f, 0.0f, 0.57f, 0.96f));
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 0.91f);
        ofFloat4.setDuration(417L);
        ofFloat4.setInterpolator(new android.view.animation.PathInterpolator(0.47f, 0.0f, 0.57f, 0.96f));
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(this, "scaleX", 0.91f, 0.96f);
        ofFloat5.setDuration(233L);
        ofFloat5.setInterpolator(new android.view.animation.PathInterpolator(0.35f, 0.0f, 0.75f, 0.82f));
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(this, "scaleY", 0.91f, 0.96f);
        ofFloat6.setDuration(233L);
        ofFloat6.setInterpolator(new android.view.animation.PathInterpolator(0.35f, 0.0f, 0.75f, 0.82f));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.playTogether(ofFloat5, ofFloat6);
        android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
        animatorSet4.playSequentially(animatorSet, animatorSet2, animatorSet3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scaleAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return animatorSet4;
    }

    /* renamed from: getPickStatus */
    public final int m69695x7af59769() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPickStatus", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        int i17 = this.f245428u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPickStatus", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return i17;
    }

    public final void h(android.widget.ImageView imageView, java.lang.String str, int i17, int i18) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return;
        }
        java.util.HashMap hashMap = this.D;
        try {
            bitmap = (android.graphics.Bitmap) hashMap.get(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlyingFlipAnimView", "setCardBackgroundImg, exp=" + th6);
        }
        if (bitmap != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlyingFlipAnimView", "setCardBackgroundImg, hit memCache");
            imageView.setImageBitmap(bitmap);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return;
        }
        java.lang.String l17 = za4.t0.l("adId", str);
        if (com.p314xaae8f345.mm.vfs.w6.j(l17) && (L = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L(l17, i17, i18)) != null && !L.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlyingFlipAnimView", "setCardBackgroundImg, hit diskCache");
            imageView.setImageBitmap(L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            hashMap.put(str, L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlyingFlipAnimView", "setCardBackgroundImg, download img");
        a84.z.c(str, imageView);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
    }

    public final android.animation.AnimatorSet i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("translationAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        float f17 = this.f245419i;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "translationX", this.f245418h, -f17);
        ofFloat.setDuration(443L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.5f, 0.11f, 0.63f, 1.0f));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, "translationX", -f17, 0.0f);
        ofFloat2.setDuration(917L);
        ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.38f, 0.0f, 0.34f, 1.0f));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("translationAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return animatorSet;
    }

    /* renamed from: setAnimCardView */
    public final void m69696xd2703488(android.view.View targetView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        this.f245427t = targetView;
        targetView.setCameraDistance(this.f245422o);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
    }

    /* renamed from: setOnCardAnimListener */
    public final void m69697xf9c29916(e94.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        this.E = cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
    }

    /* renamed from: setPickStatus */
    public final void m69698xa919e575(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPickStatus", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        this.f245428u = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPickStatus", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17818x14102c32(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.Resources resources;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f245416f = i65.a.b(getContext(), 16);
        this.f245417g = i65.a.b(getContext(), 3);
        android.content.Context context2 = getContext();
        this.f245431x = (context2 == null || (resources = context2.getResources()) == null) ? 0 : resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ama);
        this.f245418h = i65.a.b(getContext(), 72);
        this.f245419i = i65.a.b(getContext(), 89);
        int[] c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.c(getContext());
        int i18 = c17[0];
        int i19 = c17[1];
        this.f245420m = i18 / 2;
        this.f245421n = (int) (i19 * 0.46f);
        d();
        setCameraDistance(this.f245422o);
        e94.f fVar = new e94.f();
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        paintDrawable.setShape(new android.graphics.drawable.shapes.RectShape());
        paintDrawable.setShaderFactory(fVar);
        this.f245433z = paintDrawable;
        this.C = new e94.e(this);
        this.D = new java.util.HashMap();
    }
}
