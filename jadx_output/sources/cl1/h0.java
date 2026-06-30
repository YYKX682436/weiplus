package cl1;

/* loaded from: classes8.dex */
public class h0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView f42872d;

    public h0(com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView dragFeatureView) {
        this.f42872d = dragFeatureView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        float f17 = com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView.F;
        com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView dragFeatureView = this.f42872d;
        dragFeatureView.j();
        dragFeatureView.requestLayout();
        dragFeatureView.post(new java.lang.Runnable() { // from class: cl1.h0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView dragFeatureView2 = cl1.h0.this.f42872d;
                dragFeatureView2.f91117u.a();
                dragFeatureView2.f91118v.a();
            }
        });
        if (dragFeatureView.A) {
            androidx.recyclerview.widget.RecyclerView recyclerView = dragFeatureView.f91106g;
            if (recyclerView instanceof com.tencent.mm.plugin.appbrand.widget.desktop.DragRecyclerView) {
                ((com.tencent.mm.plugin.appbrand.widget.desktop.DragRecyclerView) recyclerView).setLongPress(false);
                dragFeatureView.A = false;
                dragFeatureView.f91121y = false;
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
