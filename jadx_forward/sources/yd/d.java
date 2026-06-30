package yd;

/* loaded from: classes7.dex */
public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f542467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd.e f542468e;

    public d(yd.e eVar) {
        this.f542468e = eVar;
        this.f542467d = eVar.a();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        yd.e eVar = this.f542468e;
        eVar.f542472a.setTranslationY(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * this.f542467d);
        eVar.f542472a.requestLayout();
    }
}
