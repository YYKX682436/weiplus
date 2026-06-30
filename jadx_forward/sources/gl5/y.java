package gl5;

/* loaded from: classes15.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.Magnifier f354643a;

    /* renamed from: b, reason: collision with root package name */
    public final android.animation.ValueAnimator f354644b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f354645c;

    /* renamed from: d, reason: collision with root package name */
    public float f354646d;

    /* renamed from: e, reason: collision with root package name */
    public float f354647e;

    /* renamed from: f, reason: collision with root package name */
    public float f354648f;

    /* renamed from: g, reason: collision with root package name */
    public float f354649g;

    /* renamed from: h, reason: collision with root package name */
    public float f354650h;

    /* renamed from: i, reason: collision with root package name */
    public float f354651i;

    public y(android.widget.Magnifier magnifier, gl5.k kVar) {
        this.f354643a = magnifier;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f354644b = ofFloat;
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addUpdateListener(new gl5.x(this));
    }
}
