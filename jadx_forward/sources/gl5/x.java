package gl5;

/* loaded from: classes15.dex */
public class x implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.y f354641d;

    public x(gl5.y yVar) {
        this.f354641d = yVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        gl5.y yVar = this.f354641d;
        float f17 = yVar.f354646d;
        yVar.f354648f = f17 + ((yVar.f354650h - f17) * valueAnimator.getAnimatedFraction());
        float f18 = yVar.f354647e;
        yVar.f354649g = f18 + ((yVar.f354651i - f18) * valueAnimator.getAnimatedFraction());
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            yVar.f354643a.show(yVar.f354648f, yVar.f354649g);
        }
    }
}
