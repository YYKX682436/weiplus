package bw3;

/* loaded from: classes10.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw3.b f24893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f24894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f24895f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f24896g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float[] f24897h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float[] f24898i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.p f24899m;

    public a(bw3.b bVar, float f17, float f18, float f19, float[] fArr, float[] fArr2, yz5.p pVar) {
        this.f24893d = bVar;
        this.f24894e = f17;
        this.f24895f = f18;
        this.f24896g = f19;
        this.f24897h = fArr;
        this.f24898i = fArr2;
        this.f24899m = pVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float[] fArr = this.f24893d.f24901b;
        matrix.setTranslate(-fArr[0], -fArr[1]);
        float f17 = 1 - floatValue;
        float f18 = (this.f24895f * floatValue) + (this.f24894e * f17);
        matrix.postScale(f18, f18);
        matrix.postRotate(this.f24896g);
        float[] fArr2 = this.f24897h;
        float f19 = fArr2[0];
        float[] fArr3 = this.f24898i;
        matrix.postTranslate((fArr3[0] * floatValue) + (f19 * f17), (fArr3[1] * floatValue) + (fArr2[1] * f17));
        yz5.p pVar = this.f24899m;
        if (pVar != null) {
            pVar.invoke(matrix, java.lang.Boolean.valueOf(floatValue == 1.0f));
        }
    }
}
