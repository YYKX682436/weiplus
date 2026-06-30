package tg5;

/* loaded from: classes8.dex */
public class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2702xd78fac8e.p2703xa8fcbcdb.p2704x3652ee.C22403x4aa43f4a f500764d;

    public a(com.p314xaae8f345.mm.ui.p2702xd78fac8e.p2703xa8fcbcdb.p2704x3652ee.C22403x4aa43f4a c22403x4aa43f4a) {
        this.f500764d = c22403x4aa43f4a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.ui.p2702xd78fac8e.p2703xa8fcbcdb.p2704x3652ee.C22403x4aa43f4a c22403x4aa43f4a = this.f500764d;
        if (c22403x4aa43f4a.h() != null) {
            c22403x4aa43f4a.h().setBackground(c22403x4aa43f4a.Y1.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.azm));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
