package com.google.android.material.transformation;

/* loaded from: classes13.dex */
public abstract class FabTransformationBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f44625f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f44626g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f44627h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f44628i;

    public FabTransformationBehavior() {
        this.f44625f = new android.graphics.Rect();
        this.f44626g = new android.graphics.RectF();
        this.f44627h = new android.graphics.RectF();
        this.f44628i = new int[2];
    }

    public final float A(android.view.View view, android.view.View view2, w9.j jVar) {
        android.graphics.RectF rectF = this.f44626g;
        android.graphics.RectF rectF2 = this.f44627h;
        D(view, rectF);
        D(view2, rectF2);
        jVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float B(android.view.View view, android.view.View view2, w9.j jVar) {
        android.graphics.RectF rectF = this.f44626g;
        android.graphics.RectF rectF2 = this.f44627h;
        D(view, rectF);
        D(view2, rectF2);
        jVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float C(pa.g gVar, w9.i iVar, float f17, float f18) {
        long j17 = iVar.f444047a;
        w9.i d17 = gVar.f352942a.d("expansion");
        float interpolation = iVar.b().getInterpolation(((float) (((d17.f444047a + d17.f444048b) + 17) - j17)) / ((float) iVar.f444048b));
        android.animation.TimeInterpolator timeInterpolator = w9.a.f444034a;
        return f17 + (interpolation * (f18 - f17));
    }

    public final void D(android.view.View view, android.graphics.RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f44628i);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract pa.g E(android.content.Context context, boolean z17);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        if (view.getVisibility() == 8) {
            throw new java.lang.IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((com.google.android.material.floatingactionbutton.FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void c(androidx.coordinatorlayout.widget.c cVar) {
        if (cVar.f11013h == 0) {
            cVar.f11013h = 80;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x038b A[LOOP:0: B:49:0x0389->B:50:0x038b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.AnimatorSet z(android.view.View r26, android.view.View r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.z(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public FabTransformationBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44625f = new android.graphics.Rect();
        this.f44626g = new android.graphics.RectF();
        this.f44627h = new android.graphics.RectF();
        this.f44628i = new int[2];
    }
}
