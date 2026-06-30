package na5;

/* loaded from: classes9.dex */
public abstract class e {
    public static android.view.animation.Animation a(android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAnimationEffectLoader", "hy: context is null.");
            return null;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559260o);
        loadAnimation.setInterpolator(new ta5.i());
        return loadAnimation;
    }
}
