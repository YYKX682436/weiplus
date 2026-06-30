package ok;

/* loaded from: classes10.dex */
public class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f427441d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f427442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ok.c f427443f;

    public a(ok.c cVar) {
        this.f427443f = cVar;
        this.f427441d = new android.graphics.Matrix(cVar.f427446d.h());
        this.f427442e = new android.graphics.Rect(cVar.f427450h);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaY")).floatValue();
        float floatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaX")).floatValue();
        float floatValue3 = ((java.lang.Float) valueAnimator.getAnimatedValue("scale")).floatValue();
        float floatValue4 = ((java.lang.Float) valueAnimator.getAnimatedValue("background_alpha")).floatValue();
        ok.c cVar = this.f427443f;
        cVar.f427452j.reset();
        android.graphics.Matrix matrix = cVar.f427452j;
        matrix.postTranslate(floatValue2, floatValue);
        android.graphics.Rect rect = this.f427442e;
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        matrix.mapRect(rectF);
        rectF.round(cVar.f427450h);
        matrix.postScale(floatValue3, floatValue3, cVar.f427450h.centerX(), cVar.f427450h.centerY());
        android.graphics.Matrix matrix2 = new android.graphics.Matrix(this.f427441d);
        matrix2.postConcat(matrix);
        dl.t tVar = cVar.f427446d;
        tVar.h().set(matrix2);
        tVar.D.getClass();
        xk0.c.f536460r.setAlpha((int) (((int) floatValue4) * 0.9019608f));
        android.graphics.RectF rectF2 = new android.graphics.RectF(rect);
        matrix.mapRect(rectF2);
        rectF2.round(cVar.f427450h);
        tVar.r();
    }
}
