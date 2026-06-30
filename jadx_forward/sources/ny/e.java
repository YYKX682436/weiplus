package ny;

/* loaded from: classes3.dex */
public final class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ny.g f422906d;

    public e(ny.g gVar) {
        this.f422906d = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ny.g gVar = this.f422906d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BubbleFlyAnimationHelper", "Lift animation ended: animView.x=%.1f y=%.1f scaleX=%.2f scaleY=%.2f translationX=%.1f translationY=%.1f", java.lang.Float.valueOf(gVar.getX()), java.lang.Float.valueOf(gVar.getY()), java.lang.Float.valueOf(gVar.getScaleX()), java.lang.Float.valueOf(gVar.getScaleY()), java.lang.Float.valueOf(gVar.getTranslationX()), java.lang.Float.valueOf(gVar.getTranslationY()));
    }
}
