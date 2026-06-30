package cl1;

/* loaded from: classes8.dex */
public class e0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView f42863d;

    public e0(com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView dragFeatureView) {
        this.f42863d = dragFeatureView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView dragFeatureView = this.f42863d;
        dragFeatureView.removeView(dragFeatureView.f91111o);
        dragFeatureView.j();
        dragFeatureView.setRubbishViewVisible(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
