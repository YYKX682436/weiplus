package rp1;

/* loaded from: classes14.dex */
public class y1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f480092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 f480093e;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700, boolean z17) {
        this.f480093e = c12931xa4a39700;
        this.f480092d = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f;
        boolean z17 = this.f480092d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700 = this.f480093e;
        if (z17 && (c12919x6cd8224f = c12931xa4a39700.f175114i) != null) {
            c12919x6cd8224f.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700.a(c12931xa4a39700, false);
        c12931xa4a39700.G = null;
    }
}
