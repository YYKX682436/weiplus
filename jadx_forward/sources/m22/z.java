package m22;

/* loaded from: classes5.dex */
public class z implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1377xd1075a44.C13381xc5ae2ce0 f404615d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1377xd1075a44.C13381xc5ae2ce0 c13381xc5ae2ce0) {
        this.f404615d = c13381xc5ae2ce0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1377xd1075a44.C13381xc5ae2ce0 c13381xc5ae2ce0 = this.f404615d;
        c13381xc5ae2ce0.f180074f = floatValue;
        android.view.View view = c13381xc5ae2ce0.f180080o;
        if (view != null) {
            view.setScaleX(floatValue);
            view.setScaleY(c13381xc5ae2ce0.f180074f);
        }
    }
}
