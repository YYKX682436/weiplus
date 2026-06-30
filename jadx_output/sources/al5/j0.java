package al5;

/* loaded from: classes3.dex */
public final class j0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.LiveBottomSheetPanel f5931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f5932e;

    public j0(com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel, yz5.a aVar) {
        this.f5931d = liveBottomSheetPanel;
        this.f5932e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        yz5.l onVisibilityListener;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f5931d;
        boolean z17 = liveBottomSheetPanel.isShowing;
        liveBottomSheetPanel.setShowing(false);
        if (z17 && (onVisibilityListener = liveBottomSheetPanel.getOnVisibilityListener()) != null) {
            onVisibilityListener.invoke(java.lang.Boolean.FALSE);
        }
        yz5.a aVar = this.f5932e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
