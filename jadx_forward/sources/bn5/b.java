package bn5;

/* loaded from: classes10.dex */
public class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final float f104458d;

    /* renamed from: e, reason: collision with root package name */
    public int f104459e = 0;

    /* renamed from: f, reason: collision with root package name */
    public float f104460f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f104461g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f104462h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bn5.d f104463i;

    public b(bn5.d dVar) {
        this.f104463i = dVar;
        this.f104458d = (float) java.lang.Math.pow(dVar.f104466d, 0.10000000149011612d);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaY")).floatValue();
        float floatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaX")).floatValue();
        float floatValue3 = ((java.lang.Float) valueAnimator.getAnimatedValue("rotation")).floatValue();
        int i17 = this.f104459e;
        bn5.d dVar = this.f104463i;
        if (i17 < 10) {
            bn5.f fVar = dVar.f104472j;
            android.graphics.Matrix matrix = fVar.f104474e;
            float centerX = fVar.m10934x9faf4b34().centerX();
            float centerY = dVar.f104472j.m10934x9faf4b34().centerY();
            float f17 = this.f104458d;
            matrix.postScale(f17, f17, centerX, centerY);
            this.f104459e++;
        }
        float f18 = dVar.f104467e + (floatValue2 - this.f104461g);
        dVar.f104467e = f18;
        dVar.f104468f += floatValue - this.f104460f;
        bn5.f fVar2 = dVar.f104472j;
        fVar2.f104474e.postTranslate(f18 - fVar2.m10936x72f909f5().centerX(), dVar.f104468f - dVar.f104472j.m10936x72f909f5().centerY());
        if (dVar.f104469g != 0.0f) {
            dVar.f104472j.f104474e.postRotate(floatValue3 - this.f104462h, dVar.f104467e, dVar.f104468f);
        }
        dVar.f104472j.postInvalidate();
        this.f104460f = floatValue;
        this.f104461g = floatValue2;
        this.f104462h = floatValue3;
    }
}
