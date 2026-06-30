package aa3;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aa3.e f84068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f84069f;

    public i(android.view.View view, aa3.e eVar, yz5.a aVar) {
        this.f84067d = view;
        this.f84068e = eVar;
        this.f84069f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f84067d;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(view.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        loadAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator());
        loadAnimation.setDuration(200L);
        yz5.a aVar = this.f84069f;
        aa3.e eVar = this.f84068e;
        loadAnimation.setAnimationListener(new aa3.h(eVar, view, aVar));
        eVar.f84045b = loadAnimation;
        view.startAnimation(loadAnimation);
    }
}
