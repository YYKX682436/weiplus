package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f284523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w f284524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f284525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f284526g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f284527h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f284528i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r f284529m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f284530n;

    public m(int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w wVar, int i18, android.graphics.Rect rect, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, float f17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r rVar, int i19) {
        this.f284523d = i17;
        this.f284524e = wVar;
        this.f284525f = i18;
        this.f284526g = rect;
        this.f284527h = c22624x85d69039;
        this.f284528i = f17;
        this.f284529m = rVar;
        this.f284530n = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        float animatedFraction = anim.getAnimatedFraction();
        int i17 = this.f284523d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w wVar = this.f284524e;
        int b17 = a06.d.b(i17 + ((wVar.f284666a - i17) * animatedFraction));
        int b18 = a06.d.b(this.f284525f + ((wVar.f284667b - r1) * animatedFraction));
        int i18 = wVar.f284666a;
        int f17 = e06.p.f(i18 - b17, 0, i18);
        android.graphics.Rect rect = this.f284526g;
        rect.left = f17;
        rect.bottom = e06.p.f(b18, 0, wVar.f284667b);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f284527h;
        c22624x85d69039.setClipBounds(rect);
        float e17 = e06.p.e(((animatedFraction * 300.0f) - 150.0f) / 150.0f, 0.0f, 1.0f);
        float f18 = this.f284528i;
        this.f284529m.J(c22624x85d69039, this.f284530n, f18 + ((1.0f - f18) * e17));
    }
}
