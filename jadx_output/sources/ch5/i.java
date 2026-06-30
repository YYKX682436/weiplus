package ch5;

/* loaded from: classes3.dex */
public final class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout f41580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f41581e;

    public i(com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout, yz5.l lVar) {
        this.f41580d = circleToSearchDraggableLayout;
        this.f41581e = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        int mDialogHeight;
        int mDialogHeight2;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Integer num = animatedValue instanceof java.lang.Integer ? (java.lang.Integer) animatedValue : null;
        int intValue = num != null ? num.intValue() : 0;
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout = this.f41580d;
        circleToSearchDraggableLayout.f208833m = intValue;
        circleToSearchDraggableLayout.requestLayout();
        yz5.l dragTranslationListener = circleToSearchDraggableLayout.getDragTranslationListener();
        if (dragTranslationListener != null) {
            mDialogHeight = circleToSearchDraggableLayout.getMDialogHeight();
            mDialogHeight2 = circleToSearchDraggableLayout.getMDialogHeight();
            dragTranslationListener.invoke(java.lang.Float.valueOf((mDialogHeight - intValue) / mDialogHeight2));
        }
        yz5.l lVar = this.f41581e;
        if (lVar != null) {
        }
    }
}
