package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public final class t3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f292285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f292286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f292287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f292288g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f292289h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f292290i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f292291m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f292292n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f292293o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292294p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int[] f292295q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f292296r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f292297s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f292298t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.v3 f292299u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f292300v;

    public t3(boolean z17, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, android.view.View view, int[] iArr, int i17, int i18, android.graphics.Rect rect, com.p314xaae8f345.mm.ui.p2740x696c9db.v3 v3Var, float f39, float f47) {
        this.f292285d = z17;
        this.f292286e = f17;
        this.f292287f = f18;
        this.f292288g = f19;
        this.f292289h = f27;
        this.f292290i = f28;
        this.f292291m = f29;
        this.f292292n = f37;
        this.f292293o = f38;
        this.f292294p = view;
        this.f292295q = iArr;
        this.f292296r = i17;
        this.f292297s = i18;
        this.f292298t = rect;
        this.f292299u = v3Var;
        this.f292300v = f47;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        com.p314xaae8f345.mm.ui.p2740x696c9db.a4.a(this.f292286e, this.f292287f, this.f292288g, this.f292289h, this.f292290i, this.f292291m, this.f292292n, this.f292293o, this.f292294p, this.f292295q, this.f292296r, this.f292297s, this.f292298t, this.f292299u, 0.0f, this.f292300v, this.f292285d ? 1.0f - animator.getAnimatedFraction() : animator.getAnimatedFraction());
    }
}
