package bn5;

/* loaded from: classes10.dex */
public class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final float f22925d;

    /* renamed from: e, reason: collision with root package name */
    public int f22926e = 0;

    /* renamed from: f, reason: collision with root package name */
    public float f22927f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f22928g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f22929h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bn5.d f22930i;

    public b(bn5.d dVar) {
        this.f22930i = dVar;
        this.f22925d = (float) java.lang.Math.pow(dVar.f22933d, 0.10000000149011612d);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaY")).floatValue();
        float floatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaX")).floatValue();
        float floatValue3 = ((java.lang.Float) valueAnimator.getAnimatedValue("rotation")).floatValue();
        int i17 = this.f22926e;
        bn5.d dVar = this.f22930i;
        if (i17 < 10) {
            bn5.f fVar = dVar.f22939j;
            android.graphics.Matrix matrix = fVar.f22941e;
            float centerX = fVar.getBoardRect().centerX();
            float centerY = dVar.f22939j.getBoardRect().centerY();
            float f17 = this.f22925d;
            matrix.postScale(f17, f17, centerX, centerY);
            this.f22926e++;
        }
        float f18 = dVar.f22934e + (floatValue2 - this.f22928g);
        dVar.f22934e = f18;
        dVar.f22935f += floatValue - this.f22927f;
        bn5.f fVar2 = dVar.f22939j;
        fVar2.f22941e.postTranslate(f18 - fVar2.getCurImageRect().centerX(), dVar.f22935f - dVar.f22939j.getCurImageRect().centerY());
        if (dVar.f22936g != 0.0f) {
            dVar.f22939j.f22941e.postRotate(floatValue3 - this.f22929h, dVar.f22934e, dVar.f22935f);
        }
        dVar.f22939j.postInvalidate();
        this.f22927f = floatValue;
        this.f22928g = floatValue2;
        this.f22929h = floatValue3;
    }
}
