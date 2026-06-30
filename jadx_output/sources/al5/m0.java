package al5;

/* loaded from: classes3.dex */
public final class m0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.LiveBottomSheetPanel f5952d;

    public m0(com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel) {
        this.f5952d = liveBottomSheetPanel;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        yz5.a onShownListener = this.f5952d.getOnShownListener();
        if (onShownListener != null) {
        }
    }
}
