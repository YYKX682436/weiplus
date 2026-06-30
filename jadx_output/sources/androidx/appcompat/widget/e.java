package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f9560d;

    public e(androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f9560d = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f9560d;
        actionBarOverlayLayout.C = null;
        actionBarOverlayLayout.f9325q = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.f9560d;
        actionBarOverlayLayout.C = null;
        actionBarOverlayLayout.f9325q = false;
    }
}
