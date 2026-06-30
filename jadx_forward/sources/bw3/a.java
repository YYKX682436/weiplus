package bw3;

/* loaded from: classes10.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw3.b f106426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f106427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f106428f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f106429g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float[] f106430h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float[] f106431i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.p f106432m;

    public a(bw3.b bVar, float f17, float f18, float f19, float[] fArr, float[] fArr2, yz5.p pVar) {
        this.f106426d = bVar;
        this.f106427e = f17;
        this.f106428f = f18;
        this.f106429g = f19;
        this.f106430h = fArr;
        this.f106431i = fArr2;
        this.f106432m = pVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float[] fArr = this.f106426d.f106434b;
        matrix.setTranslate(-fArr[0], -fArr[1]);
        float f17 = 1 - floatValue;
        float f18 = (this.f106428f * floatValue) + (this.f106427e * f17);
        matrix.postScale(f18, f18);
        matrix.postRotate(this.f106429g);
        float[] fArr2 = this.f106430h;
        float f19 = fArr2[0];
        float[] fArr3 = this.f106431i;
        matrix.postTranslate((fArr3[0] * floatValue) + (f19 * f17), (fArr3[1] * floatValue) + (fArr2[1] * f17));
        yz5.p pVar = this.f106432m;
        if (pVar != null) {
            pVar.mo149xb9724478(matrix, java.lang.Boolean.valueOf(floatValue == 1.0f));
        }
    }
}
