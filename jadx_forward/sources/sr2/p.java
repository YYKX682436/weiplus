package sr2;

/* loaded from: classes10.dex */
public final class p implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.r f493201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f493202b;

    public p(sr2.r rVar, int i17) {
        this.f493201a = rVar;
        this.f493202b = i17;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        sr2.r rVar = this.f493201a;
        rVar.f493224c = this.f493202b;
        yz5.a aVar = rVar.f493223b;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
