package zk5;

/* loaded from: classes8.dex */
public class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2746xf1c361fc.C22594xcb88ef3a f555080d;

    public a(com.p314xaae8f345.mm.ui.p2746xf1c361fc.C22594xcb88ef3a c22594xcb88ef3a) {
        this.f555080d = c22594xcb88ef3a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.ui.p2746xf1c361fc.C22594xcb88ef3a c22594xcb88ef3a = this.f555080d;
        if (c22594xcb88ef3a.h() != null) {
            c22594xcb88ef3a.h().setBackground(c22594xcb88ef3a.Y1.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.azm));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
