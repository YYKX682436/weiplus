package al5;

/* loaded from: classes3.dex */
public final class o0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.LiveBottomSheetPanel f5970d;

    public o0(com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel) {
        this.f5970d = liveBottomSheetPanel;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f5970d;
        liveBottomSheetPanel.e(liveBottomSheetPanel.getTranslationY(), true, false);
        yz5.a onShownListener = liveBottomSheetPanel.getOnShownListener();
        if (onShownListener != null) {
        }
    }
}
