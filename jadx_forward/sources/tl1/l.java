package tl1;

/* loaded from: classes15.dex */
public class l implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl1.v f501745a;

    public l(tl1.v vVar) {
        this.f501745a = vVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        tl1.v vVar = this.f501745a;
        vVar.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a0z);
        vVar.f501761q = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
