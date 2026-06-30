package ox2;

/* loaded from: classes10.dex */
public final class b0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15409xe873dc34 f431177d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15409xe873dc34 c15409xe873dc34) {
        this.f431177d = c15409xe873dc34;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f431177d.f213923g;
        if (c22789xd23e9a9b == null) {
            return;
        }
        try {
            c22789xd23e9a9b.setScaleX(1.0f);
            c22789xd23e9a9b.setVisibility(0);
            c22789xd23e9a9b.m82582x3ae760af(0.0d);
            c22789xd23e9a9b.m82583xcde73672(1);
            c22789xd23e9a9b.g();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CenterInteractionEasterEggDarkPreview", "playThumbPagAnimation e:" + th6);
        }
    }
}
