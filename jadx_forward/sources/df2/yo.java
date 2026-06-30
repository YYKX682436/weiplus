package df2;

/* loaded from: classes3.dex */
public final class yo implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f313417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f313418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f313419f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.zo f313420g;

    public yo(android.widget.ImageView imageView, float f17, float f18, df2.zo zoVar) {
        this.f313417d = imageView;
        this.f313418e = f17;
        this.f313419f = f18;
        this.f313420g = zoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f313417d;
        imageView.animate().translationXBy(this.f313418e).translationYBy(this.f313419f).scaleX(1.8f).scaleY(1.8f).rotationBy(((float) ((((float) java.lang.Math.atan2(r3, r2)) * 180) / 3.141592653589793d)) + 90).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(new df2.xo(this.f313420g, imageView)).setDuration(500L).start();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(400L);
        ofFloat.setStartDelay(100L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.start();
    }
}
