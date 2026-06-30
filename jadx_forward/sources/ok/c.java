package ok;

/* loaded from: classes10.dex */
public class c extends ok.f {

    /* renamed from: c, reason: collision with root package name */
    public android.animation.ValueAnimator f427445c;

    /* renamed from: d, reason: collision with root package name */
    public final dl.t f427446d;

    /* renamed from: e, reason: collision with root package name */
    public float f427447e;

    /* renamed from: f, reason: collision with root package name */
    public float f427448f;

    /* renamed from: g, reason: collision with root package name */
    public float f427449g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f427450h;

    /* renamed from: l, reason: collision with root package name */
    public android.animation.Animator.AnimatorListener f427454l;

    /* renamed from: k, reason: collision with root package name */
    public long f427453k = 0;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Matrix f427452j = new android.graphics.Matrix();

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f427451i = new android.graphics.RectF();

    public c(dl.t tVar) {
        this.f427446d = tVar;
    }

    public void a() {
        this.f427461b = false;
        this.f427460a = true;
        android.animation.ValueAnimator valueAnimator = this.f427445c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropActionUpAnim", "[play]");
        if (this.f427460a) {
            this.f427461b = false;
            this.f427460a = false;
            android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("scale", 1.0f, this.f427447e), android.animation.PropertyValuesHolder.ofFloat("deltaX", 0.0f, this.f427448f), android.animation.PropertyValuesHolder.ofFloat("deltaY", 0.0f, this.f427449g), android.animation.PropertyValuesHolder.ofFloat("background_alpha", 0.0f, 255.0f));
            this.f427445c = ofPropertyValuesHolder;
            ofPropertyValuesHolder.addUpdateListener(new ok.a(this));
            this.f427445c.addListener(new ok.b(this));
            this.f427445c.setInterpolator(new android.view.animation.LinearInterpolator());
            this.f427445c.setDuration(200);
            this.f427445c.setStartDelay(this.f427453k);
            this.f427445c.start();
        }
    }
}
