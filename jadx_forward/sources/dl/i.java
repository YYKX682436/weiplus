package dl;

/* loaded from: classes10.dex */
public class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: e, reason: collision with root package name */
    public float f316629e;

    /* renamed from: g, reason: collision with root package name */
    public float f316631g;

    /* renamed from: i, reason: collision with root package name */
    public float f316633i;

    /* renamed from: m, reason: collision with root package name */
    public float f316634m;

    /* renamed from: n, reason: collision with root package name */
    public final float f316635n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f316637p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f316638q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ dl.t f316639r;

    /* renamed from: d, reason: collision with root package name */
    public int f316628d = 0;

    /* renamed from: f, reason: collision with root package name */
    public float f316630f = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f316632h = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public int f316636o = 0;

    public i(dl.t tVar, float f17, float f18, float f19) {
        this.f316639r = tVar;
        this.f316637p = f17;
        this.f316638q = f18;
        this.f316633i = f17;
        this.f316634m = f18;
        this.f316635n = (float) java.lang.Math.pow(f19, 0.0833333358168602d);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i17 = this.f316636o;
        dl.t tVar = this.f316639r;
        if (i17 < 12) {
            android.graphics.Matrix h17 = tVar.h();
            float centerX = tVar.f316663x.centerX() + this.f316630f;
            float centerY = tVar.f316663x.centerY() + this.f316632h;
            float f17 = this.f316635n;
            h17.postScale(f17, f17, centerX, centerY);
            tVar.f316662w.postScale(f17, f17, tVar.f316663x.centerX() + this.f316630f, tVar.f316663x.centerY() + this.f316632h);
            this.f316636o++;
        }
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue("rotation")).intValue();
        int intValue2 = ((java.lang.Integer) valueAnimator.getAnimatedValue("deltaX")).intValue();
        int intValue3 = ((java.lang.Integer) valueAnimator.getAnimatedValue("deltaY")).intValue();
        android.graphics.Matrix h18 = tVar.h();
        float f18 = intValue - this.f316628d;
        float f19 = this.f316630f;
        float f27 = this.f316637p;
        float f28 = this.f316632h;
        float f29 = this.f316638q;
        h18.postRotate(f18, f19 + f27, f28 + f29);
        tVar.f316662w.postRotate(intValue - this.f316628d, f27 + this.f316630f, f29 + this.f316632h);
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.set(tVar.f316663x);
        tVar.f316662w.mapRect(rectF);
        float f37 = intValue2;
        float f38 = this.f316633i + (f37 - this.f316629e);
        this.f316633i = f38;
        float f39 = intValue3;
        this.f316634m += f39 - this.f316631g;
        this.f316630f = f38 - rectF.centerX();
        this.f316632h = this.f316634m - rectF.centerY();
        tVar.h().postTranslate(this.f316630f, this.f316632h);
        tVar.f316662w.postTranslate(this.f316630f, this.f316632h);
        tVar.r();
        this.f316628d = intValue;
        this.f316629e = f37;
        this.f316631g = f39;
    }
}
