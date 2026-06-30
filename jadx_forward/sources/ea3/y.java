package ea3;

/* loaded from: classes10.dex */
public class y implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f332213a = new ea3.x(this);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ea3.p f332214b;

    public y(ea3.p pVar) {
        this.f332214b = pVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        ea3.p pVar = this.f332214b;
        pVar.f332196v.setVisibility(0);
        pVar.f332196v.postDelayed(this.f332213a, 4000L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
