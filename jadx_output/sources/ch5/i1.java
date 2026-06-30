package ch5;

/* loaded from: classes14.dex */
public final class i1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout f41585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f41586e;

    public i1(com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout, yz5.l lVar) {
        this.f41585d = wSHalfScreenDraggableLayout;
        this.f41586e = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Integer num = animatedValue instanceof java.lang.Integer ? (java.lang.Integer) animatedValue : null;
        int intValue = num != null ? num.intValue() : 0;
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = this.f41585d;
        wSHalfScreenDraggableLayout.getClass();
        android.view.View view = wSHalfScreenDraggableLayout.f208846h;
        if (view != null) {
            view.setTranslationY(intValue);
        }
        yz5.l dragTranslationListener = wSHalfScreenDraggableLayout.getDragTranslationListener();
        if (dragTranslationListener != null) {
            dragTranslationListener.invoke(java.lang.Float.valueOf((wSHalfScreenDraggableLayout.getMDialogHeight() - intValue) / wSHalfScreenDraggableLayout.f208850o));
        }
        yz5.p dragStatusBlock = wSHalfScreenDraggableLayout.getDragStatusBlock();
        if (dragStatusBlock != null) {
            dragStatusBlock.invoke("onHalfScreenHeightIsChanging", com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout.a(wSHalfScreenDraggableLayout));
        }
        yz5.l lVar = this.f41586e;
        if (lVar != null) {
        }
    }
}
