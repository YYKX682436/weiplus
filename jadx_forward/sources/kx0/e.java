package kx0;

/* loaded from: classes5.dex */
public class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kx0.g f394779d;

    public e(kx0.g gVar) {
        this.f394779d = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        kx0.g gVar = this.f394779d;
        kx0.i iVar = gVar.f394787c;
        float f17 = iVar.f394807o;
        float f18 = iVar.f394806n;
        iVar.f394808p = java.lang.Math.max(java.lang.Math.min(((f17 - f18) * iVar.f394809q) + f18 + (iVar.f394810r * floatValue), f17), f18);
        gVar.invalidateSelf();
    }
}
