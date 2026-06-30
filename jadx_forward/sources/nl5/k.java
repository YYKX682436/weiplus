package nl5;

/* loaded from: classes15.dex */
public final class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.l f419848d;

    public k(nl5.l lVar) {
        this.f419848d = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        nl5.l lVar = this.f419848d;
        float f17 = lVar.f419853d;
        lVar.f419855f = f17 + ((lVar.f419857h - f17) * animation.getAnimatedFraction());
        float f18 = lVar.f419854e;
        lVar.f419856g = f18 + ((lVar.f419858i - f18) * animation.getAnimatedFraction());
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            lVar.f419850a.show(lVar.f419855f, lVar.f419856g);
        }
    }
}
