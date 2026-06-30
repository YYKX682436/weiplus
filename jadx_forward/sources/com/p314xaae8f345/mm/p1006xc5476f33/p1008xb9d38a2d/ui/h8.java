package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public final class h8 extends android.view.WindowInsetsAnimation.Callback {

    /* renamed from: a, reason: collision with root package name */
    public int f155437a;

    /* renamed from: b, reason: collision with root package name */
    public int f155438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f155439c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f155440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(android.view.View view, yz5.a aVar) {
        super(1);
        this.f155439c = view;
        this.f155440d = aVar;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public void onEnd(android.view.WindowInsetsAnimation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onEnd(animation);
        yz5.a aVar = this.f155440d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public void onPrepare(android.view.WindowInsetsAnimation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onPrepare(animation);
        int[] iArr = new int[2];
        this.f155439c.getLocationInWindow(iArr);
        this.f155437a = iArr[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public android.view.WindowInsets onProgress(android.view.WindowInsets insets, java.util.List runningAnimations) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runningAnimations, "runningAnimations");
        if (this.f155437a == this.f155438b) {
            return insets;
        }
        java.util.Iterator it = runningAnimations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((android.view.WindowInsetsAnimation) obj).getTypeMask() == android.view.WindowInsets.Type.ime()) {
                break;
            }
        }
        android.view.WindowInsetsAnimation windowInsetsAnimation = (android.view.WindowInsetsAnimation) obj;
        int i17 = this.f155437a - this.f155438b;
        float interpolatedFraction = windowInsetsAnimation != null ? windowInsetsAnimation.getInterpolatedFraction() : 0.0f;
        android.animation.TimeInterpolator timeInterpolator = w9.a.f525567a;
        this.f155439c.setTranslationY(i17 + java.lang.Math.round(interpolatedFraction * (0 - i17)));
        return insets;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation animation, android.view.WindowInsetsAnimation.Bounds bounds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bounds, "bounds");
        int[] iArr = new int[2];
        this.f155439c.getLocationInWindow(iArr);
        this.f155438b = iArr[1];
        this.f155439c.setTranslationY(this.f155437a - r3);
        return bounds;
    }
}
