package fs3;

/* loaded from: classes15.dex */
public class w implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f347859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fs3.y f347860b;

    public w(fs3.y yVar, android.view.View view) {
        this.f347860b = yVar;
        this.f347859a = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f347859a.startAnimation(this.f347860b.f347867h);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
