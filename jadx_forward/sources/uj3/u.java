package uj3;

/* loaded from: classes9.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.z f509884d;

    public u(uj3.z zVar) {
        this.f509884d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        uj3.z zVar = this.f509884d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = zVar.f509929c;
        if (c18930xb402610a != null) {
            c18930xb402610a.setAlpha(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a2 = zVar.f509929c;
        if (c18930xb402610a2 == null || (animate = c18930xb402610a2.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(300L)) == null) {
            return;
        }
        duration.start();
    }
}
