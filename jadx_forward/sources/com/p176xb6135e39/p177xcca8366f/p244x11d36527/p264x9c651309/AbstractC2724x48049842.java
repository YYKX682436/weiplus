package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309;

/* renamed from: com.google.android.material.transformation.FabTransformationBehavior */
/* loaded from: classes13.dex */
public abstract class AbstractC2724x48049842 extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2723x75b6e8af {

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f126158f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f126159g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f126160h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f126161i;

    public AbstractC2724x48049842() {
        this.f126158f = new android.graphics.Rect();
        this.f126159g = new android.graphics.RectF();
        this.f126160h = new android.graphics.RectF();
        this.f126161i = new int[2];
    }

    public final float A(android.view.View view, android.view.View view2, w9.j jVar) {
        android.graphics.RectF rectF = this.f126159g;
        android.graphics.RectF rectF2 = this.f126160h;
        D(view, rectF);
        D(view2, rectF2);
        jVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float B(android.view.View view, android.view.View view2, w9.j jVar) {
        android.graphics.RectF rectF = this.f126159g;
        android.graphics.RectF rectF2 = this.f126160h;
        D(view, rectF);
        D(view2, rectF2);
        jVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float C(pa.g gVar, w9.i iVar, float f17, float f18) {
        long j17 = iVar.f525580a;
        w9.i d17 = gVar.f434475a.d("expansion");
        float interpolation = iVar.b().getInterpolation(((float) (((d17.f525580a + d17.f525581b) + 17) - j17)) / ((float) iVar.f525581b));
        android.animation.TimeInterpolator timeInterpolator = w9.a.f525567a;
        return f17 + (interpolation * (f18 - f17));
    }

    public final void D(android.view.View view, android.graphics.RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f126161i);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract pa.g E(android.content.Context context, boolean z17);

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2722x95223586, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean b(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2) {
        if (view.getVisibility() == 8) {
            throw new java.lang.IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e)) {
            return false;
        }
        int m20267x5cb3b70 = ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e) view2).m20267x5cb3b70();
        return m20267x5cb3b70 == 0 || m20267x5cb3b70 == view.getId();
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public void c(p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar) {
        if (cVar.f92546h == 0) {
            cVar.f92546h = 80;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x038b A[LOOP:0: B:49:0x0389->B:50:0x038b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2723x75b6e8af
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.AnimatorSet z(android.view.View r26, android.view.View r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2724x48049842.z(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public AbstractC2724x48049842(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f126158f = new android.graphics.Rect();
        this.f126159g = new android.graphics.RectF();
        this.f126160h = new android.graphics.RectF();
        this.f126161i = new int[2];
    }
}
