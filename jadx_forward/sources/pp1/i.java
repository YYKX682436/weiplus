package pp1;

/* loaded from: classes14.dex */
public final class i implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f438950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f438951e;

    public i(pp1.z zVar, yz5.a aVar) {
        this.f438950d = zVar;
        this.f438951e = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        pp1.z.B = true;
        pp1.z zVar = this.f438950d;
        pp1.z.c(zVar);
        zVar.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = zVar.f438981f;
        if (c12917x19ac03e7 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.S(c12917x19ac03e7, 0, false, 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e72 = zVar.f438981f;
        if (c12917x19ac03e72 != null) {
            c12917x19ac03e72.B(true, false);
        }
        yz5.a aVar = this.f438951e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        zVar.f438988p = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
