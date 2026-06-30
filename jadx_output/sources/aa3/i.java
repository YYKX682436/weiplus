package aa3;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f2534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aa3.e f2535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f2536f;

    public i(android.view.View view, aa3.e eVar, yz5.a aVar) {
        this.f2534d = view;
        this.f2535e = eVar;
        this.f2536f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f2534d;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(view.getContext(), com.tencent.mm.R.anim.f477877e1);
        loadAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator());
        loadAnimation.setDuration(200L);
        yz5.a aVar = this.f2536f;
        aa3.e eVar = this.f2535e;
        loadAnimation.setAnimationListener(new aa3.h(eVar, view, aVar));
        eVar.f2512b = loadAnimation;
        view.startAnimation(loadAnimation);
    }
}
