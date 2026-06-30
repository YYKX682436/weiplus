package u4;

/* loaded from: classes13.dex */
public class c2 extends android.animation.AnimatorListenerAdapter implements u4.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f505984d;

    /* renamed from: e, reason: collision with root package name */
    public final int f505985e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f505986f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f505987g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f505988h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f505989i = false;

    public c2(android.view.View view, int i17, boolean z17) {
        this.f505984d = view;
        this.f505985e = i17;
        this.f505986f = (android.view.ViewGroup) view.getParent();
        this.f505987g = z17;
        e(true);
    }

    @Override // u4.b1
    public void a(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        e(true);
    }

    @Override // u4.b1
    public void b(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
    }

    @Override // u4.b1
    public void c(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        e(false);
    }

    @Override // u4.b1
    public void d(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        if (!this.f505989i) {
            u4.w1.d(this.f505984d, this.f505985e);
            android.view.ViewGroup viewGroup = this.f505986f;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        e(false);
        abstractC1183x100d4975.E(this);
    }

    public final void e(boolean z17) {
        android.view.ViewGroup viewGroup;
        if (!this.f505987g || this.f505988h == z17 || (viewGroup = this.f505986f) == null) {
            return;
        }
        this.f505988h = z17;
        u4.s1.a(viewGroup, z17);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f505989i = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (!this.f505989i) {
            u4.w1.d(this.f505984d, this.f505985e);
            android.view.ViewGroup viewGroup = this.f505986f;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        e(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animator) {
        if (this.f505989i) {
            return;
        }
        u4.w1.d(this.f505984d, this.f505985e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(android.animation.Animator animator) {
        if (this.f505989i) {
            return;
        }
        u4.w1.d(this.f505984d, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
