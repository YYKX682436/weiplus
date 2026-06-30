package al5;

/* loaded from: classes3.dex */
public final class k0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.LiveBottomSheetPanel f5937d;

    public k0(com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel) {
        this.f5937d = liveBottomSheetPanel;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f5937d;
        liveBottomSheetPanel.e(liveBottomSheetPanel.getTranslationY(), false, false);
    }
}
