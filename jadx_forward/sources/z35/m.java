package z35;

/* loaded from: classes4.dex */
public final class m implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 f551553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f551554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f551555f;

    public m(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db2, boolean z17, boolean z18) {
        this.f551553d = c19716x17d12db2;
        this.f551554e = z17;
        this.f551555f = z18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db2 = this.f551553d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 m75623x9dd15644 = c19716x17d12db2.m75623x9dd15644();
        boolean z17 = this.f551554e;
        m75623x9dd15644.setVisibility(z17 ? 4 : 0);
        if (z17) {
            c19716x17d12db2.c(this.f551555f);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f551553d.m75623x9dd15644().setVisibility(0);
    }
}
