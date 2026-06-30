package oa5;

/* loaded from: classes8.dex */
public class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa5.m f425420d;

    public l(oa5.m mVar) {
        this.f425420d = mVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        oa5.a aVar = this.f425420d.f425392e;
        if (aVar != null) {
            aVar.a(floatValue);
        }
    }
}
