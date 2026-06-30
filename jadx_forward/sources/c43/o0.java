package c43;

/* loaded from: classes13.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f120000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c43.x f120001e;

    public o0(c43.x xVar, boolean z17) {
        this.f120001e = xVar;
        this.f120000d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f120000d;
        c43.x xVar = this.f120001e;
        android.view.animation.Animation loadAnimation = z17 ? android.view.animation.AnimationUtils.loadAnimation(xVar.f120025g, com.p314xaae8f345.mm.R.C30854x2dc211.f559341c2) : android.view.animation.AnimationUtils.loadAnimation(xVar.f120025g, com.p314xaae8f345.mm.R.C30854x2dc211.f559342c3);
        xVar.f120031p.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new c43.n0(this));
    }
}
