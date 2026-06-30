package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public final class h8 extends android.view.WindowInsetsAnimation.Callback {

    /* renamed from: a, reason: collision with root package name */
    public int f73904a;

    /* renamed from: b, reason: collision with root package name */
    public int f73905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f73906c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f73907d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(android.view.View view, yz5.a aVar) {
        super(1);
        this.f73906c = view;
        this.f73907d = aVar;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public void onEnd(android.view.WindowInsetsAnimation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onEnd(animation);
        yz5.a aVar = this.f73907d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public void onPrepare(android.view.WindowInsetsAnimation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onPrepare(animation);
        int[] iArr = new int[2];
        this.f73906c.getLocationInWindow(iArr);
        this.f73904a = iArr[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public android.view.WindowInsets onProgress(android.view.WindowInsets insets, java.util.List runningAnimations) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(insets, "insets");
        kotlin.jvm.internal.o.g(runningAnimations, "runningAnimations");
        if (this.f73904a == this.f73905b) {
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
        int i17 = this.f73904a - this.f73905b;
        float interpolatedFraction = windowInsetsAnimation != null ? windowInsetsAnimation.getInterpolatedFraction() : 0.0f;
        android.animation.TimeInterpolator timeInterpolator = w9.a.f444034a;
        this.f73906c.setTranslationY(i17 + java.lang.Math.round(interpolatedFraction * (0 - i17)));
        return insets;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation animation, android.view.WindowInsetsAnimation.Bounds bounds) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(bounds, "bounds");
        int[] iArr = new int[2];
        this.f73906c.getLocationInWindow(iArr);
        this.f73905b = iArr[1];
        this.f73906c.setTranslationY(this.f73904a - r3);
        return bounds;
    }
}
