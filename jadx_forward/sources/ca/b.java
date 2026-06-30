package ca;

/* loaded from: classes13.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static android.animation.Animator a(ca.j jVar, float f17, float f18, float f19) {
        android.animation.ObjectAnimator ofObject = android.animation.ObjectAnimator.ofObject(jVar, (android.util.Property<ca.j, V>) ca.g.f121293a, ca.f.f121291b, new ca.i(f17, f18, f19));
        ca.i mo14552xa22fca11 = jVar.mo14552xa22fca11();
        if (mo14552xa22fca11 == null) {
            throw new java.lang.IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        android.animation.Animator createCircularReveal = android.view.ViewAnimationUtils.createCircularReveal((android.view.View) jVar, (int) f17, (int) f18, mo14552xa22fca11.f121297c, f19);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }
}
