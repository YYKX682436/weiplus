package nf2;

/* loaded from: classes10.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.g0 f418249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f418250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f418251f;

    public f0(nf2.g0 g0Var, android.view.ViewGroup viewGroup, yz5.a aVar) {
        this.f418249d = g0Var;
        this.f418250e = viewGroup;
        this.f418251f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f418250e;
        int width = viewGroup.getWidth();
        nf2.g0 g0Var = this.f418249d;
        g0Var.f418275d = width;
        g0Var.f418276e = viewGroup.getHeight();
        g0Var.d();
        g0Var.f418277f = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsPositionManager", "setup: containerSize=(" + g0Var.f418275d + " x " + g0Var.f418276e + "), safeRect=" + g0Var.f418274c);
        yz5.a aVar = this.f418251f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
