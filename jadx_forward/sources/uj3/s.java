package uj3;

/* loaded from: classes9.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.z f509877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509878e;

    public s(uj3.z zVar, java.lang.String str) {
        this.f509877d = zVar;
        this.f509878e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        uj3.z zVar = this.f509877d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = zVar.f509929c;
        if (c18930xb402610a == null || (animate = c18930xb402610a.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(300L)) == null || (listener = duration.setListener(new uj3.q(zVar, this.f509878e))) == null) {
            return;
        }
        listener.withStartAction(new uj3.r(zVar));
    }
}
