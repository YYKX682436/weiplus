package rp1;

/* loaded from: classes14.dex */
public class x1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 f480089d;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700) {
        this.f480089d = c12931xa4a39700;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700.a(this.f480089d, true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f = this.f480089d.f175114i;
        if (c12919x6cd8224f != null) {
            c12919x6cd8224f.setVisibility(0);
        }
    }
}
