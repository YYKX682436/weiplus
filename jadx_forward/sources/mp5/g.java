package mp5;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f412014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f412015e;

    public g(com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223, boolean z17) {
        this.f412015e = c22894x55bf3223;
        this.f412014d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f412015e;
        if (c22894x55bf3223.C) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(c22894x55bf3223.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0);
            loadAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
            loadAnimation.setDuration(330L);
            loadAnimation.setAnimationListener(new mp5.j(c22894x55bf3223, this.f412014d));
            c22894x55bf3223.f295352w.startAnimation(loadAnimation);
            return;
        }
        int height = c22894x55bf3223.f295352w.getHeight();
        if (c22894x55bf3223.F == null) {
            float translationY = c22894x55bf3223.f295352w.getTranslationY();
            c22894x55bf3223.F = android.animation.ObjectAnimator.ofFloat(c22894x55bf3223.f295352w, "translationY", height + translationY, translationY);
            c22894x55bf3223.F.setDuration(300L);
            c22894x55bf3223.F.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        }
        c22894x55bf3223.F.removeAllListeners();
        c22894x55bf3223.F.addListener(new mp5.e(this));
        c22894x55bf3223.F.removeAllUpdateListeners();
        c22894x55bf3223.F.addUpdateListener(new mp5.f(this, height));
        c22894x55bf3223.F.start();
        if (c22894x55bf3223.H != null) {
            float f17 = height;
            o05.j jVar = ((ps4.f) c22894x55bf3223.H).f439683a;
            if (jVar != null) {
                jVar.a(f17);
            }
        }
    }
}
