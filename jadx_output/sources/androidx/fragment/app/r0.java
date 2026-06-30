package androidx.fragment.app;

/* loaded from: classes14.dex */
public abstract class r0 {
    public static androidx.fragment.app.p0 a(android.content.Context context, androidx.fragment.app.Fragment fragment, boolean z17, boolean z18) {
        int nextTransition = fragment.getNextTransition();
        int popEnterAnim = z18 ? z17 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z17 ? fragment.getEnterAnim() : fragment.getExitAnim();
        boolean z19 = false;
        fragment.setAnimations(0, 0, 0, 0);
        android.view.ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(com.tencent.mm.R.id.p3q) != null) {
            fragment.mContainer.setTag(com.tencent.mm.R.id.p3q, null);
        }
        android.view.ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        android.view.animation.Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z17, popEnterAnim);
        if (onCreateAnimation != null) {
            return new androidx.fragment.app.p0(onCreateAnimation);
        }
        android.animation.Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z17, popEnterAnim);
        if (onCreateAnimator != null) {
            return new androidx.fragment.app.p0(onCreateAnimator);
        }
        if (popEnterAnim == 0 && nextTransition != 0) {
            popEnterAnim = nextTransition != 4097 ? nextTransition != 4099 ? nextTransition != 8194 ? -1 : z17 ? com.tencent.mm.R.animator.f477962g : com.tencent.mm.R.animator.f477963h : z17 ? com.tencent.mm.R.animator.f477964i : com.tencent.mm.R.animator.f477965j : z17 ? com.tencent.mm.R.animator.f477966k : com.tencent.mm.R.animator.f477967l;
        }
        if (popEnterAnim != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
            if (equals) {
                try {
                    android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, popEnterAnim);
                    if (loadAnimation != null) {
                        return new androidx.fragment.app.p0(loadAnimation);
                    }
                    z19 = true;
                } catch (android.content.res.Resources.NotFoundException e17) {
                    throw e17;
                } catch (java.lang.RuntimeException unused) {
                }
            }
            if (!z19) {
                try {
                    android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(context, popEnterAnim);
                    if (loadAnimator != null) {
                        return new androidx.fragment.app.p0(loadAnimator);
                    }
                } catch (java.lang.RuntimeException e18) {
                    if (equals) {
                        throw e18;
                    }
                    android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, popEnterAnim);
                    if (loadAnimation2 != null) {
                        return new androidx.fragment.app.p0(loadAnimation2);
                    }
                }
            }
        }
        return null;
    }
}
