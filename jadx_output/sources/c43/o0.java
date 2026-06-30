package c43;

/* loaded from: classes13.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f38467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c43.x f38468e;

    public o0(c43.x xVar, boolean z17) {
        this.f38468e = xVar;
        this.f38467d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f38467d;
        c43.x xVar = this.f38468e;
        android.view.animation.Animation loadAnimation = z17 ? android.view.animation.AnimationUtils.loadAnimation(xVar.f38492g, com.tencent.mm.R.anim.f477808c2) : android.view.animation.AnimationUtils.loadAnimation(xVar.f38492g, com.tencent.mm.R.anim.f477809c3);
        xVar.f38498p.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new c43.n0(this));
    }
}
